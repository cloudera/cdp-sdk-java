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

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.http.RetryHandler;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import jakarta.annotation.Nullable;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;

/**
 * Abstract base class for all API client classes. This should not be
 * referenced directly.
 *
 * All subclasses of this class are intended to be generated code and are safe
 * to share across threads. Each CdpClient instance has a dedicated HTTP
 * connection pool used to back its requests. The properties of that pool are
 * configured per-CdpClient using the CdpClientConfiguration passed at
 * creation time.
 *
 * This class is not thread-safe.
 */
@SdkInternalApi
public abstract class CdpClient {

  private static class RestResponseGenericType extends GenericType<RestResponse> {
  }

  protected static final List<Class<? extends CdpClientMiddleware>> NO_EXTENSION = null;

  private static final ClientFactory CLIENT_FACTORY = new ClientFactory();

  private static final String PARAMETER_DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
  private static final DateTimeFormatter PARAMETER_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(PARAMETER_DATE_TIME_FORMAT_PATTERN);

  private static final Map<Class<?>, BiFunction<CdpClientMiddleware, CdpClient, CdpClientMiddleware>> BUILTIN_EXTENSIONS =
      ImmutableMap.of(
          CdpClientRetryMiddleware.class,    (next, client) -> new CdpClientRetryMiddleware(next),
          CdpRequestHeadersMiddleware.class, (next, client) -> new CdpRequestHeadersMiddleware(next, client.headers),
          CdpRequestAuthMiddleware.class,    (next, client) -> new CdpRequestAuthMiddleware(next),
          CdpParseResponseMiddleware.class,  (next, client) -> new CdpParseResponseMiddleware(next));

  private final CdpCredentials credentials;
  private final String endpoint;
  private final String clientApplicationName;
  private final RetryHandler retryHandler;
  private final Client client;
  private final Map<String, String> headers;

  /**
   * Constructor.
   * @param credentials the CDP credentials
   * @param endpoint the CDP service endpoint
   * @param config the client configuration
   */
  protected CdpClient(CdpCredentials credentials,
                      String endpoint,
                      CdpClientConfiguration config) {
    this.credentials = checkNotNullAndThrow(credentials);
    this.endpoint = checkNotNullAndThrow(endpoint);

    checkNotNullAndThrow(config);
    this.clientApplicationName = config.getClientApplicationName();
    this.retryHandler = config.getRetryHandler();
    this.headers = config.getRequestHeaders();
    this.client = CLIENT_FACTORY.create(config);
  }

  /**
   * Constructor.
   * @param context the CDP client context
   */
  protected CdpClient(CdpRequestContext<?> context) {
    checkNotNullAndThrow(context);
    this.credentials = context.getCredentials();
    this.endpoint = context.getEndpoint();
    this.clientApplicationName = context.getClientApplicationName();
    this.retryHandler = context.getRetryHandler();
    this.headers = context.getHeaders();
    this.client = context.getClient();
  }

  /**
   * Gets the service name.
   * @return the service name
   */
  protected abstract String getServiceName();

  /**
   * Gets the request Content-Type, used by 'Conent-Type' request header.
   * @return the request Content-Type
   */
  protected String getRequestContentType() {
    return MediaType.APPLICATION_JSON;
  }

  /**
   * Gets the expected response Content-Type, used by 'Accept' request header.
   * @return the response Content-Type
   */
  protected String getResponseContentType() {
    return MediaType.APPLICATION_JSON;
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param operationName The operation name
   * @param path The subpath of the HTTP URL
   * @param body The request body object
   * @param returnType The return type as a GenericType
   * @param extensions The extensions for the operation
   * @param <T> The type of the response
   * @return The response body object
   */
  protected <T extends CdpResponse> T invokeAPI(String operationName,
                                                String path,
                                                Object body,
                                                GenericType<T> returnType,
                                                @Nullable List<Class<? extends CdpClientMiddleware>> extensions) {
    checkNotNullAndThrow(operationName);
    checkNotNullAndThrow(path);
    checkNotNullAndThrow(body);
    return invokeAPI(operationName, "POST", path, Collections.emptyList(), Collections.emptyMap(), body, returnType, extensions);
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param operationName The operation name
   * @param method The request method, one of "GET", "POST", "PUT", "PATCH" and "DELETE"
   * @param path The sub-path of the HTTP URL
   * @param queries The query parameters
   * @param headers The header parameters
   * @param body The request body object - if it is not binary, otherwise null
   * @param extensions The extensions for the operation
   * @return The response body object
   */
  protected RestResponse invokeAPI(String operationName,
                                   String method,
                                   String path,
                                   List<Pair> queries,
                                   Map<String, String> headers,
                                   @Nullable Object body,
                                   @Nullable List<Class<? extends CdpClientMiddleware>> extensions) {
    checkNotNullAndThrow(operationName);
    checkNotNullAndThrow(method);
    checkNotNullAndThrow(path);
    checkNotNullAndThrow(queries);
    checkNotNullAndThrow(headers);
    return invokeAPI(operationName, method, path, queries, headers, body, new RestResponseGenericType(), extensions);
  }

  protected <T extends BaseResponse> T invokeAPI(String operationName,
                                       String method,
                                       String path,
                                       List<Pair> queries,
                                       Map<String, String> headers,
                                       @Nullable Object body,
                                       GenericType<T> returnType,
                                       @Nullable List<Class<? extends CdpClientMiddleware>> extensions) {
    // Create context, which is scoped to one request.
    CdpRequestContext<T> context = new CdpRequestContext<>(client, this.getServiceName(), operationName, returnType);
    context.setClientApplicationName(clientApplicationName);
    context.setRetryHandler(retryHandler);
    context.setCredentials(credentials);
    context.setRequestContentType(this.getRequestContentType());
    context.setResponseContentType(this.getResponseContentType());
    context.setEndpoint(endpoint);
    context.setMethod(method);
    context.setPath(path);
    context.setQueries(queries);
    context.setHeaders(headers);
    context.setBody(body);

    invokeAPI(context, extensions);

    // Return the response from context.
    return context.getResponse();
  }

  @VisibleForTesting
  protected <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context,
                                                    @Nullable List<Class<? extends CdpClientMiddleware>> extensions) {
    // Build the middleware chain.
    CdpClientMiddleware current = new CdpHttpClient();
    current = new CdpParseResponseMiddleware(current);
    current = new CdpRequestAuthMiddleware(current);
    current = new CdpRequestHeadersMiddleware(current, headers);
    current = new CdpClientRetryMiddleware(current);
    if (extensions != null) {
      // Build in reverse order so the first extension in the list will be called first.
      for (int i = extensions.size() - 1; i >= 0; i --) {
        Class<? extends CdpClientMiddleware> extensionClz = extensions.get(i);
        current = createExtensionInstance(extensionClz, current);
      }
    }

    // Calling the middleware chain.
    current.invokeAPI(context);
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

  /**
   * Creates an instance of the extension by the name.
   * @param extensionClz The extension class
   * @param next The next extension in the chain
   * @return an instance of the extension.
   */
  private CdpClientMiddleware createExtensionInstance(Class<? extends CdpClientMiddleware> extensionClz,
                                                             CdpClientMiddleware next) {
    checkNotNullAndThrow(extensionClz);
    checkNotNullAndThrow(next);
    try {
      // Create a new instance of the extension.
      BiFunction<CdpClientMiddleware, CdpClient, CdpClientMiddleware> func =
          BUILTIN_EXTENSIONS.getOrDefault(extensionClz, null);
      if (func != null) {
        return func.apply(next, this);
      } else {
        Constructor<?> ctor = extensionClz.getConstructor(CdpClientMiddleware.class);
        return (CdpClientMiddleware) ctor.newInstance(next);
      }
    } catch (NoSuchMethodException |
             SecurityException |
             InstantiationException |
             IllegalAccessException |
             IllegalArgumentException |
             InvocationTargetException ex) {
      throw new CdpClientException(
          String.format("Failed to initialize extension (%s): %s.", extensionClz.getSimpleName(), ex),
          ex);
    }
  }
}
