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

import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.http.RetryHandler;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Nullable;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;

/**
 * CDP client context. It has all information needed to send a CDP API request.
 * A context instance is not shared between requests, each request should have its own instance.
 * This class is for internal use only.
 */
@SdkInternalApi
public class CdpRequestContext<T extends BaseResponse> {

  private final Client client;
  private final String serviceName;
  private final String operationName;
  private final GenericType<T> responseType;

  private String clientApplicationName;
  private RetryHandler retryHandler;
  private CdpCredentials credentials;
  private String requestContentType;
  private String responseContentType;
  private String endpoint;
  private String method;
  private String path;
  private List<Pair> queries;
  private Map<String, String> headers;
  private Object body;
  private Response rawResponse;
  private T response;
  private Map<String, Object> properties;

  public CdpRequestContext(Client client,
                           String serviceName,
                           String operationName,
                           GenericType<T> responseType) {
    this.client = checkNotNullAndThrow(client);
    this.serviceName = checkNotNullAndThrow(serviceName);
    this.operationName = checkNotNullAndThrow(operationName);
    this.responseType = checkNotNullAndThrow(responseType);
  }

  public CdpRequestContext(Client client,
                           String serviceName,
                           String operationName,
                           GenericType<T> responseType,
                           CdpRequestContext context) {
    this(client, serviceName, operationName, responseType);
    this.setClientApplicationName(context.getClientApplicationName());
    this.setRetryHandler(context.getRetryHandler());
    this.setCredentials(context.getCredentials());
    this.setRequestContentType(context.getRequestContentType());
    this.setResponseContentType(context.getResponseContentType());
    this.setEndpoint(context.getEndpoint());
    this.setMethod(context.getMethod());
    this.setPath(context.getPath());
    this.getQueries().addAll(context.getQueries());
    this.getHeaders().putAll(context.getHeaders());
    this.setBody(context.getBody());
    this.getProperties().putAll(context.getProperties());
  }

  public Client getClient() {
    return client;
  }

  public String getServiceName() {
    return serviceName;
  }

  public String getOperationName() {
    return operationName;
  }

  public GenericType<T> getResponseType() {
    return responseType;
  }

  @Nullable
  public String getClientApplicationName() {
    return clientApplicationName;
  }

  public void setClientApplicationName(@Nullable String clientApplicationName) {
    this.clientApplicationName = clientApplicationName;
  }

  public RetryHandler getRetryHandler() {
    return retryHandler;
  }

  public void setRetryHandler(RetryHandler retryHandler) {
    this.retryHandler = checkNotNullAndThrow(retryHandler);
  }

  public CdpCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CdpCredentials credentials) {
    this.credentials = checkNotNullAndThrow(credentials);
  }

  public String getRequestContentType() {
    return requestContentType;
  }

  public void setRequestContentType(String requestContentType) {
    this.requestContentType = checkNotNullAndThrow(requestContentType);
  }

  public String getResponseContentType() {
    return responseContentType;
  }

  public void setResponseContentType(String responseContentType) {
    this.responseContentType = checkNotNullAndThrow(responseContentType);
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = checkNotNullAndThrow(endpoint);
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = checkNotNullAndThrow(method);
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = checkNotNullAndThrow(path);
  }

  public final List<Pair> getQueries() {
    if (queries == null) {
      queries = new ArrayList<>();
    }
    return queries;
  }

  public void setQueries(List<Pair> queries) {
    this.queries = checkNotNullAndThrow(queries);
  }

  public final Map<String, String> getHeaders() {
    if (headers == null) {
      headers = new HashMap<>();
    }
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = checkNotNullAndThrow(headers);
  }

  @Nullable
  public Object getBody() {
    return body;
  }

  public void setBody(@Nullable Object body) {
    this.body = body;
  }

  @Nullable
  public Response getRawResponse() {
    return rawResponse;
  }

  public void setRawResponse(@Nullable Response rawResponse) {
    this.rawResponse = rawResponse;
  }

  @Nullable
  public T getResponse() {
    return response;
  }

  public void setResponse(@Nullable T response) {
    this.response = response;
  }

  public final Map<String, Object> getProperties() {
    if (properties == null) {
      properties = new HashMap<>();
    }
    return properties;
  }

  public URI getRequestUrl() {
    return URI.create(getEndpoint() + getPath()).normalize();
  }
}
