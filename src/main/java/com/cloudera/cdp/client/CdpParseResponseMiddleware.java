/*
 * Copyright (c) 2021 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.cdp.client;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.CdpHTTPException;
import com.cloudera.cdp.CdpServiceException;
import com.cloudera.cdp.annotation.SdkInternalApi;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.Response;

/**
 * CDP client middleware to parse a CDP response.
 */
@SdkInternalApi
public class CdpParseResponseMiddleware implements CdpClientMiddleware {

  @JsonIgnoreProperties(ignoreUnknown = true)
  @SuppressFBWarnings(value = "UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD")
  private static class Error {
    public String code;
    public String message;
    public String error;
    public List<String> errorMessages;
  }

  private static class ErrorReference extends TypeReference<Error> {
  }

  private static final ObjectMapper MAPPER = new ObjectMapper();

  private final CdpClientMiddleware next;

  public CdpParseResponseMiddleware(CdpClientMiddleware next) {
    this.next = checkNotNullAndThrow(next);
  }

  public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
    checkNotNullAndThrow(context);
    Response response = null;
    boolean shouldCloseResponse = true;
    try {
      next.invokeAPI(context);
      if (context.getRawResponse() == null && context.getResponse() != null) {
        // skip the following
        return;
      }
      response = context.getRawResponse();
      checkNotNullAndThrow(response);
      T result = parse(context, response);
      shouldCloseResponse = !(result instanceof RestResponse);
      context.setRawResponse(null);
      context.setResponse(result);
    } catch (IllegalStateException e) {
      throw new CdpClientException(e.getMessage(), e);
    } finally {
      if (shouldCloseResponse && response != null) {
        response.close();
      }
    }
  }

  private <T extends BaseResponse> T parse(
      CdpRequestContext<T> context,
      Response response) {
    int httpCode = response.getStatusInfo().getStatusCode();

    ImmutableMap.Builder<String, List<String>> mapBuilder = ImmutableMap.builder();
    for (Map.Entry<String, List<Object>> entry : response.getHeaders().entrySet()) {
      ImmutableList.Builder<String> listBuilder = new ImmutableList.Builder<>();
      for (Object o : entry.getValue()) {
        listBuilder.add(String.valueOf(o));
      }
      mapBuilder.put(entry.getKey(), listBuilder.build());
    }
    Map<String, List<String>> responseHeaders = mapBuilder.build();

    if (RestResponse.class.isAssignableFrom(context.getResponseType().getRawType())) {
      RestResponse restResponse = new RestResponse();
      restResponse.setHttpCode(httpCode);
      restResponse.setResponseHeaders(responseHeaders);
      restResponse.setResponse(response);
      return (T) restResponse;
    } else if (ResourceResponse.class.isAssignableFrom(context.getResponseType().getRawType())) {
      ResourceResponse resourceResponse = new ResourceResponse();
      resourceResponse.setHttpCode(httpCode);
      resourceResponse.setResponseHeaders(responseHeaders);
      resourceResponse.setResponse(response);
      return (T) resourceResponse;
    }

    if (response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL) {
      T cdpResponse = response.readEntity(context.getResponseType());
      if (cdpResponse == null) {
        throw new CdpHTTPException(httpCode, "Invalid response from server");
      }
      cdpResponse.setHttpCode(httpCode);
      cdpResponse.setResponseHeaders(responseHeaders);
      return cdpResponse;
    }

    return parseError(response, httpCode, responseHeaders);
  }

  private <T extends BaseResponse> T parseError(
      Response response,
      int httpCode,
      Map<String, List<String>> responseHeaders) {
    String body;
    try {
      body = response.readEntity(String.class);
    } catch (RuntimeException e) {
      throw new CdpHTTPException(
          httpCode, "Error reading message from server", e);
    }

    Error error;
    String requestId;
    try {
      error = MAPPER.readValue(body, new ErrorReference());
      requestId = CdpResponse.getRequestId(responseHeaders);
    } catch (RuntimeException | JsonProcessingException e) {
      throw new CdpHTTPException(httpCode, body);
    }

    String errorMessage = null;
    if (error.message != null) {
      errorMessage = error.message;
    } else if (error.error != null) {
      errorMessage = error.error;
    } else if (error.errorMessages != null) {
      errorMessage = String.join(" ", error.errorMessages);
    }
    throw new CdpServiceException(
        requestId,
        httpCode,
        responseHeaders,
        error.code,
        errorMessage);
  }
}
