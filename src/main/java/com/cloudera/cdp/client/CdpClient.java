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
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;

import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract base class for all API client classes. This should not be
 * referenced directly.
 *
 * All subclasses of this class are intended to be generated code and are safe
 * to share across threads. Each CdpClient instance has a dedicated HTTP
 * connection pool used to back its requests. The properties of that pool are
 * configured per-CdpClient using the CdpClientConfiguration passed at
 * creation time.
 */
@SdkInternalApi
public abstract class CdpClient {

  private static final Logger LOG =
      LoggerFactory.getLogger(CdpClient.class);

  private static class MapReference extends TypeReference<Map<String, String>> {
  }

  private static class WorkloadResponseGenericType extends GenericType<WorkloadResponse> {
  }

  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final ClientFactory CLIENT_FACTORY = new ClientFactory();
  private static final String VERSION_PROPERTIES_FILE = "version.properties";
  private static final Properties VERSION_PROPERTIES = loadVersionProperties();

  private static final String PARAMETER_DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
  private static final DateTimeFormatter PARAMETER_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(PARAMETER_DATE_TIME_FORMAT_PATTERN);

  private static Properties loadVersionProperties() {
    Properties props = new Properties();
    try (InputStream stream =
             CdpClient.class.getResourceAsStream(VERSION_PROPERTIES_FILE)) {
      props.load(stream);
    } catch (IOException | RuntimeException e) {
      props.put("version", "Unknown");
      LOG.warn("Failed to read CDP SDK Version.", e);
    }
    return props;
  }

  private final CdpCredentials credentials;
  private final String endPoint;
  private final RetryHandler retryHandler;
  private final CdpClientConfiguration config;
  private final Client client;

  /**
   * Constructor.
   * @param credentials the CDP credentials
   * @param endpoint the CDP service endpoint
   * @param config the client configuration
   */
  protected CdpClient(CdpCredentials credentials,
                      String endpoint,
                      CdpClientConfiguration config) {
    this.config = checkNotNullAndThrow(config);
    this.retryHandler = checkNotNullAndThrow(config.getRetryHandler());
    this.credentials = checkNotNullAndThrow(credentials);
    this.endPoint = checkNotNullAndThrow(endpoint);
    this.client = CLIENT_FACTORY.create(config);
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   * @param path The subpath of the HTTP URL
   * @param body The request body object
   * @param returnType The return type as a GenericType
   * @param <T> The type of the response
   * @return The response body object
   */
  protected <T extends CdpResponse> T invokeAPI(String path, Object body, GenericType<T> returnType) {
    checkNotNullAndThrow(path);
    checkNotNullAndThrow(body);
    checkNotNullAndThrow(returnType);
    return invokeAPI("POST", path, Collections.emptyList(), Collections.emptyMap(), body, returnType);
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param method The request method, one of "GET", "POST", "PUT", "PATCH" and "DELETE"
   * @param path The sub-path of the HTTP URL
   * @param queries The query parameters
   * @param headers The header parameters
   * @param body The request body object - if it is not binary, otherwise null
   * @return The response body object
   */
  protected WorkloadResponse invokeAPI(String method, String path, List<Pair> queries, Map<String, String> headers, Object body) {
    checkNotNullAndThrow(method);
    checkNotNullAndThrow(path);
    checkNotNullAndThrow(queries);
    checkNotNullAndThrow(headers);
    // body can be null
    return invokeAPI(method, path, queries, headers, body, new WorkloadResponseGenericType());
  }

  private <T extends BaseResponse> T invokeAPI(String method, String path, List<Pair> queries, Map<String, String> headers, Object body, GenericType<T> returnType) {
    int attempts = 0;
    do {
      attempts++;
      Response response = null;
      boolean shouldCloseResponse = true;
      try {
        response = getAPIResponse(method, path, queries, headers, body);
        checkNotNullAndThrow(response);
        checkArgumentAndThrow(response.getStatusInfo() != Response.Status.NO_CONTENT || isWorkloadApi(returnType));
        try {
          T result = parse(response, returnType);
          shouldCloseResponse = !(result instanceof WorkloadResponse);
          return result;
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

  /**
   * Format the given parameter object into string.
   * @param param Object
   * @return Object in string format
   */
  @VisibleForTesting
  protected String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof ZonedDateTime) {
      return ((ZonedDateTime) param).withZoneSameInstant(ZoneOffset.UTC).format(PARAMETER_DATE_TIME_FORMATTER);
    } else if (param instanceof Collection) {
      return ((Collection<?>) param).stream()
          .map(o -> parameterToString(o))
          .collect(Collectors.joining(","));
    } else {
      return String.valueOf(param);
    }
  }

  /**
   * Formats the specified parameter to a {@code Pair} object.
   *
   * @param name The name of the parameter.
   * @param value The value of the parameter.
   * @return A {@code Pair} object.
   */
  @VisibleForTesting
  protected Pair parameterToPair(String name, Object value) {
    return new Pair(name, parameterToString(value));
  }

  /**
   * Formats the specified parameters to a list of {@code Pair} objects.
   *
   * @param collectionFormat The collection format of the parameter.
   * @param name The name of the parameter.
   * @param value The value of the parameter.
   * @return A list of {@code Pair} objects.
   */
  @VisibleForTesting
  protected List<Pair> parameterToPairs(String collectionFormat, String name, Collection value) {
    checkNotNullAndThrow(collectionFormat);

    List<Pair> params = new ArrayList<>();

    if (value == null) {
      return params;
    }

    // create the params based on the collection format
    if ("multi".equals(collectionFormat)) {
      for (Object item : value) {
        params.add(new Pair(name, parameterToString(item)));
      }
      return params;
    }

    // collectionFormat is assumed to be "csv" by default
    String delimiter = ",";
    if ("ssv".equals(collectionFormat)) {
      delimiter = " ";
    } else if ("tsv".equals(collectionFormat)) {
      delimiter = "\t";
    } else if ("pipes".equals(collectionFormat)) {
      delimiter = "|";
    }

    List<String> values = new ArrayList<>();
    for (Object item : value) {
      values.add(parameterToString(item));
    }
    params.add(new Pair(name, String.join(delimiter, values)));

    return params;
  }

  @VisibleForTesting
  protected MultivaluedMap<String, Object> computeHeaders(String method,
                                                          String path,
                                                          Map<String, String> inputHeaders) {
    MultivaluedMap<String, Object> headers =
        new MultivaluedHashMap<String, Object>();

    for (Map.Entry<String, String> entry : inputHeaders.entrySet()) {
      headers.putSingle(entry.getKey(), entry.getValue());
    }

    String date = ZonedDateTime.now(ZoneId.of("GMT")).format(
        DateTimeFormatter.RFC_1123_DATE_TIME);

    headers.putSingle("x-altus-date", date);
    headers.putSingle(HttpHeaders.USER_AGENT, buildUserAgent());
    if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH")) {
      headers.putSingle(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
    }
    String altusClientApp = config.getClientApplicationName();
    if (!Strings.isNullOrEmpty(altusClientApp)) {
      headers.putSingle("x-altus-client-app", altusClientApp);
    }

    String accessKeyId = credentials.getAccessKeyId();
    PrivateKey privateKey = credentials.getPrivateKey();
    String accessToken = credentials.getAccessToken();
    if (!Strings.isNullOrEmpty(accessKeyId) && privateKey != null){
      String auth = new Signer().computeAuthHeader(
          method,
          MediaType.APPLICATION_JSON,
          date,
          path,
          accessKeyId,
          privateKey);
      headers.putSingle("x-altus-auth", auth);
    } else if (!Strings.isNullOrEmpty(accessToken)) {
      headers.putSingle(HttpHeaders.AUTHORIZATION, accessToken);
    }

    return headers;
  }

  @VisibleForTesting
  protected Response getAPIResponse(String method,
                                    String path,
                                    List<Pair> requestQueries,
                                    Map<String, String> requestHeaders,
                                    Object requestBody) {
    WebTarget t = this.client.target(endPoint + path);
    for (Pair pair : requestQueries) {
      t = t.queryParam(pair.getName(), pair.getValue());
    }
    Invocation.Builder builder = t.request()
        .accept(MediaType.APPLICATION_JSON)
        .headers(computeHeaders(method, path, requestHeaders));
    if (requestBody == null) {
      return builder.method(method);
    } else {
      return builder.method(
          method,
          Entity.entity(requestBody, MediaType.APPLICATION_JSON));
    }
  }

  private <T extends BaseResponse> T parse(
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

    if (isWorkloadApi(returnType)) {
      WorkloadResponse workloadResponse = new WorkloadResponse();
      workloadResponse.setHttpCode(httpCode);
      workloadResponse.setResponseHeaders(responseHeaders);
      workloadResponse.setResponse(response);
      return (T) workloadResponse;
    }

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

  private static <T extends BaseResponse> boolean isWorkloadApi(GenericType<T> returnType) {
    return returnType.getRawType().equals(WorkloadResponse.class);
  }

  /**
   * Releases resources held by this client object. Once a client has been
   * shutdown, it should not be used to make any more requests.
   *
   * This is an optional method, and callers are not expected to call it, but
   * can if they want to explicitly release any open resources.
   */
  public void shutdown() {
    if (client != null) {
      try {
        client.close();
      } catch (Exception e) {
        throw new CdpClientException("Error closing client", e);
      }
    }
  }

  @VisibleForTesting
  String buildUserAgent() {
    return String.format("CDPSDK/%s Java/%s %s/%s",
                         VERSION_PROPERTIES.get("version"),
                         System.getProperty("java.version"),
                         System.getProperty("os.name"),
                         System.getProperty("os.version"));
  }
}
