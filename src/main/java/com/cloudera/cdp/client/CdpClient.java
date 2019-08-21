/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
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

import static com.cloudera.cdp.ValidationUtils.checkArgumentAndThrow;
import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;
import static com.google.common.base.Preconditions.checkNotNull;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.CdpHTTPException;
import com.cloudera.cdp.CdpServiceException;
import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.authentication.Signer;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.http.RetryHandler;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;

import java.io.IOException;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Abstract base class for all API client classes. This should not be
 * referenced directly.
 */
@SdkInternalApi
public abstract class CdpClient {

  private static final ObjectMapper MAPPER = new ObjectMapper();

  private static class MapReference extends TypeReference<Map<String, String>> {
  }

  private final CdpCredentials credentials;
  private final String endPoint;
  private final RetryHandler retryHandler;
  private final ClientConnectionWrapper clientConnectionWrapper;

  /**
   * Constructor.
   * @param credentials the CDP credentials
   * @param endpoint the CDP service endpoint
   * @param clientConfiguration the client configuration
   */
  protected CdpClient(CdpCredentials credentials,
                      String endpoint,
                      CdpClientConfiguration clientConfiguration) {
    checkNotNullAndThrow(clientConfiguration);
    checkNotNullAndThrow(clientConfiguration.getRetryHandler());
    this.credentials = checkNotNullAndThrow(credentials);
    this.endPoint = checkNotNullAndThrow(endpoint);
    this.retryHandler = clientConfiguration.getRetryHandler();
    this.clientConnectionWrapper = new ClientConnectionWrapper(clientConfiguration);
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   * @param path The subpath of the HTTP URL
   * @param body The request body object
   * @param returnType The return type as a GenericType
   * @param <T> The type of the response
   * @return The response body in type of string
   */
  protected <T extends CdpResponse> T invokeAPI(String path, Object body, GenericType<T> returnType) {
    checkNotNullAndThrow(path);
    checkNotNullAndThrow(body);
    checkNotNullAndThrow(returnType);
    int attempts = 0;
    do {
      attempts++;
      try (Response response = getAPIResponse(path, body)) {
        checkNotNullAndThrow(response);
        checkArgumentAndThrow(response.getStatusInfo() != Response.Status.NO_CONTENT);
        try {
          return parse(response, returnType);
        } catch (CdpClientException exception) {
          Duration delay = retryHandler.shouldRetry(attempts, exception);
          if (delay == RetryHandler.DO_NOT_RETRY) {
            throw exception;
          }
          try {
            Thread.sleep(delay.toMillis());
          } catch (InterruptedException e) {
            throw new CdpClientException("Error while retrying request", e);
          }
        }
      } catch (IllegalStateException e) {
        throw new CdpClientException(e.getMessage(), e);
      }
    } while (true);
  }

  /**
   * Builds the authentication header and then calls the doPost method on the ClientConnectionWrapper.
   * @param path - the path on the URI of the request
   * @param requestBody - the request object containing the full request (e.g. ListClusterRequest).
   * @return response The Response object received from the CDP server
   */
  @VisibleForTesting
  protected Response getAPIResponse(String path, Object requestBody)
      throws CdpServiceException {
    String date = ZonedDateTime.now(ZoneId.of("GMT")).format(
        DateTimeFormatter.RFC_1123_DATE_TIME);

    String auth = new Signer().computeAuthHeader(
        "POST",
        MediaType.APPLICATION_JSON,
        date,
        path,
        credentials.getAccessKeyId(),
        credentials.getPrivateKey());

    return clientConnectionWrapper.doPost(endPoint, path, auth, date, requestBody);
  }

  private <T extends CdpResponse> T parse(
      Response response,
      GenericType<T> returnType) {
    checkNotNull(response);
    checkNotNull(returnType);

    int httpCode = response.getStatusInfo().getStatusCode();

    ImmutableMap.Builder<String, List<String>> mapBuilder = ImmutableMap.builder();
    for (Entry<String, List<Object>> entry : response.getHeaders().entrySet()) {
      ImmutableList.Builder<String> listBuilder = new ImmutableList.Builder<>();
      for (Object o : entry.getValue()) {
        listBuilder.add(String.valueOf(o));
      }
      mapBuilder.put(entry.getKey(), listBuilder.build());
    }
    Map<String, List<String>> responseHeaders = mapBuilder.build();

    if (response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL) {
      T cdpResponse = response.readEntity(returnType);
      if (cdpResponse == null) {
        throw new CdpHTTPException(httpCode, "Invalid response from server");
      }
      cdpResponse.setHttpCode(httpCode);
      cdpResponse.setResponseHeaders(responseHeaders);
      return cdpResponse;
    }

    String body;
    try {
      body = response.readEntity(String.class);
    }  catch (ProcessingException | NullPointerException e) {
      throw new CdpHTTPException(
          httpCode, "Error reading message from server", e);
    }

    String code;
    String message;
    String requestId;
    try {
      Map<String, String> map = MAPPER.readValue(body, new MapReference());
      code = map.get("code");
      checkNotNull(code);
      message = map.get("message");
      checkNotNull(message);
      List<String> values =
          responseHeaders.get(CdpResponse.CDP_HEADER_REQUESTID);
      checkNotNull(values);
      requestId = Iterables.getOnlyElement(values);
    } catch (IOException | NullPointerException | IllegalArgumentException e) {
      throw new CdpHTTPException(httpCode, body, e);
    }

    throw new CdpServiceException(
        requestId,
        httpCode,
        responseHeaders,
        code,
        message);
  }

  /**
   * Releases resources held by this client object. Once a client has been
   * shutdown, it should not be used to make any more requests.
   *
   * This is an optional method, and callers are not expected to call it, but
   * can if they want to explicitly release any open resources.
   */
  public void shutdown() {
    if (clientConnectionWrapper != null) {
      try {
        clientConnectionWrapper.close();
      } catch (Exception e) {
        throw new CdpClientException("Error closing client", e);
      }
    }
  }
}
