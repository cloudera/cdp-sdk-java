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

import static com.cloudera.cdp.ValidationUtils.checkArgumentAndThrow;
import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.CdpHTTPException;
import com.cloudera.cdp.CdpServiceException;
import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.authentication.Signer;
import com.cloudera.cdp.http.RetryHandler;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CDP client middleware to make a CDP REST API call.
 */
@SdkInternalApi
public class CdpRestClient implements CdpClientMiddleware {

  private static final Logger LOG =
      LoggerFactory.getLogger(CdpRestClient.class);

  @JsonIgnoreProperties(ignoreUnknown = true)
  @SuppressFBWarnings(value = "UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD")
  private static class Error {
    public String code;
    public String message;
    public List<String> errorMessages;
  }

  private static class ErrorReference extends TypeReference<Error> {
  }

  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final String VERSION_PROPERTIES_FILE = "version.properties";
  private static final Properties VERSION_PROPERTIES = loadVersionProperties();

  private static Properties loadVersionProperties() {
    Properties props = new Properties();
    try (InputStream stream =
             CdpRestClient.class.getResourceAsStream(VERSION_PROPERTIES_FILE)) {
      props.load(stream);
    } catch (IOException | RuntimeException e) {
      props.put("version", "Unknown");
      LOG.warn("Failed to read CDP SDK Version.", e);
    }
    return props;
  }

  public <T extends BaseResponse> void invokeAPI(CdpClientContext<T> context) {
    checkNotNullAndThrow(context);
    RetryHandler retryHandler = checkNotNullAndThrow(context.getRetryHandler());
    int attempts = 0;
    do {
      attempts++;
      Response response = null;
      boolean shouldCloseResponse = true;
      try {
        response = getAPIResponse(context);
        checkNotNullAndThrow(response);
        checkArgumentAndThrow(response.getStatusInfo() != Response.Status.NO_CONTENT || context.getIsRestApi());
        try {
          T result = parse(context, response);
          shouldCloseResponse = !(result instanceof RestResponse);
          context.setResponse(result);
          return;
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
      } finally {
        if (shouldCloseResponse && response != null) {
          response.close();
        }
      }
    } while (true);
  }

  @VisibleForTesting
  MultivaluedMap<String, Object> computeHeaders(CdpClientContext<?> context) {
    MultivaluedMap<String, Object> headers = new MultivaluedHashMap<String, Object>();

    for (Map.Entry<String, String> entry : context.getHeaders().entrySet()) {
      headers.putSingle(entry.getKey(), entry.getValue());
    }

    String date = ZonedDateTime.now(ZoneId.of("GMT")).format(
        DateTimeFormatter.RFC_1123_DATE_TIME);

    headers.putSingle("x-altus-date", date);
    headers.putSingle(HttpHeaders.USER_AGENT, buildUserAgent());
    String method = context.getMethod();
    if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH")) {
      headers.putSingle(HttpHeaders.CONTENT_TYPE, context.getRequestContentType());
    }
    String altusClientApp = context.getClientApplicationName();
    if (!Strings.isNullOrEmpty(altusClientApp)) {
      headers.putSingle("x-altus-client-app", altusClientApp);
    }

    String accessKeyId = context.getCredentials().getAccessKeyId();
    PrivateKey privateKey = context.getCredentials().getPrivateKey();
    String accessToken = context.getCredentials().getAccessToken();
    if (!Strings.isNullOrEmpty(accessKeyId) && privateKey != null){
      String auth = new Signer().computeAuthHeader(
          method,
          context.getRequestContentType(),
          date,
          context.getPath(),
          accessKeyId,
          privateKey);
      headers.putSingle("x-altus-auth", auth);
    } else if (!Strings.isNullOrEmpty(accessToken)) {
      headers.putSingle(HttpHeaders.AUTHORIZATION, accessToken);
    }

    return headers;
  }

  @VisibleForTesting
  Response getAPIResponse(CdpClientContext<?> context) {
    WebTarget t = context.getClient().target(context.getEndpoint() + context.getPath());
    for (Pair pair : context.getQueries()) {
      t = t.queryParam(pair.getName(), pair.getValue());
    }
    Invocation.Builder builder = t.request()
        .accept(context.getResponseContentType())
        .headers(computeHeaders(context));
    if (context.getBody() == null) {
      return builder.method(context.getMethod());
    } else {
      return builder.method(
          context.getMethod(),
          Entity.entity(context.getBody(), context.getRequestContentType()));
    }
  }

  private <T extends BaseResponse> T parse(
      CdpClientContext<T> context,
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

    if (context.getIsRestApi()) {
      RestResponse restResponse = new RestResponse();
      restResponse.setHttpCode(httpCode);
      restResponse.setResponseHeaders(responseHeaders);
      restResponse.setResponse(response);
      return (T) restResponse;
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

    String body;
    try {
      body = response.readEntity(String.class);
    }  catch (ProcessingException | NullPointerException e) {
      throw new CdpHTTPException(
          httpCode, "Error reading message from server", e);
    }

    Error error;
    String requestId;
    try {
      error = MAPPER.readValue(body, new ErrorReference());
      requestId = CdpResponse.getRequestId(responseHeaders);
    } catch (IOException | NullPointerException | IllegalArgumentException e) {
      throw new CdpHTTPException(httpCode, body);
    }

    String errorMessage = null;
    if (error.message != null) {
      errorMessage = error.message;
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

  @VisibleForTesting
  static String buildUserAgent() {
    return String.format("CDPSDK/%s Java/%s %s/%s",
                         VERSION_PROPERTIES.get("version"),
                         System.getProperty("java.version"),
                         System.getProperty("os.name"),
                         System.getProperty("os.version"));
  }
}
