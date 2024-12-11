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

package com.cloudera.cdp.extension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.BasicCdpCredentials;
import com.cloudera.cdp.client.BaseResponse;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.CdpClientMiddleware;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.http.NeverRetryHandler;
import com.cloudera.cdp.util.CdpSDKTestUtils;
import com.google.common.collect.ImmutableList;

import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;

import org.apache.http.HttpHeaders;
import org.glassfish.jersey.client.ClientProperties;
import org.junit.jupiter.api.Test;

public class RedirectExtensionTest {

  private static final String NO_LOCATION = null;
  private static final BaseResponse NO_RESPONSE = null;

  private static void setValue(Class<?> instanceClz, String methodName, Class<?> valueClz, Object instance, Object value) {
    try {
      Method method = instanceClz.getDeclaredMethod(methodName, valueClz);
      method.setAccessible(true);
      method.invoke(instance, value);
    } catch (Exception e) {
      fail(e);
    }
  }

  private static class TestResponse extends BaseResponse {
  }

  private static class TestMiddleware implements CdpClientMiddleware {
    private final Response firstResponse;
    private final BaseResponse secondResponse;

    private List<CdpRequestContext<?>> contexts = new ArrayList<>();

    public TestMiddleware(Response firstResponse, BaseResponse secondResponse) {
      this.firstResponse = firstResponse;
      this.secondResponse = secondResponse;
    }

    @Override
    public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
      if (contexts.isEmpty()) {
        if (firstResponse != null) {
          RestResponse restResponse = new RestResponse();
          setValue(RestResponse.class, "setResponse", Response.class, restResponse, firstResponse);
          int httpCode = firstResponse.getStatus();
          setValue(BaseResponse.class, "setHttpCode", int.class, restResponse, httpCode);
          String location = firstResponse.getHeaderString(HttpHeaders.LOCATION);
          Map<String, List<String>> headers = new HashMap<>();
          if (location != null) {
            headers.put(HttpHeaders.LOCATION, ImmutableList.of(location));
          }
          setValue(BaseResponse.class, "setResponseHeaders", Map.class, restResponse, headers);
          context.setResponse((T) restResponse);
        } else {
          context.setResponse(null);
        }
      } else {
        context.setResponse((T) secondResponse);
      }
      this.contexts.add(context);
    }

    public int getExecutedTimes() {
      return contexts.size();
    }

    public List<CdpRequestContext<?>> getContexts() {
      return contexts;
    }
  }

  private Response createResponse(Response.Status statusCode, String location) {
    MultivaluedHashMap<String, Object> headers = new MultivaluedHashMap<>();
    if (location != null) {
      headers.add(HttpHeaders.LOCATION, location);
    }
    Response response = mock(Response.class);
    when(response.getStatus()).thenReturn(statusCode.getStatusCode());
    when(response.getStatusInfo()).thenReturn(statusCode);
    when(response.getHeaders()).thenReturn(headers);
    when(response.getHeaderString(eq(HttpHeaders.LOCATION))).thenReturn(location);
    return response;
  }

  private Client createMockClient(Response response) {
    Invocation.Builder builder = mock(Invocation.Builder.class);
    when(builder.accept(eq(MediaType.APPLICATION_JSON))).thenReturn(builder);
    when(builder.headers(any(MultivaluedMap.class))).thenReturn(builder);
    when(builder.method(eq("POST"), any(Entity.class))).thenReturn(response);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder);
    when(webTarget.property(eq(ClientProperties.FOLLOW_REDIRECTS), eq(false))).thenReturn(webTarget);
    Client client = mock(Client.class);
    when(client.target(eq(URI.create("http://cdp.com/api/v1/df/uploadFlow")))).thenReturn(webTarget);
    return client;
  }

  private CdpRequestContext<TestResponse> createContext(Client client) {
    CdpRequestContext<TestResponse> context = new CdpRequestContext<>(
        client,
        "df",
        "uploadFlow",
        new GenericType<TestResponse>(){});
    context.setRetryHandler(new NeverRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    context.setEndpoint("http://cdp.com");
    context.setMethod("POST");
    context.setPath("/api/v1/df/uploadFlow");
    context.setBody(new Object());
    return context;
  }

  @Test
  public void testRedirected() {
    TestResponse result = new TestResponse();
    Response response = createResponse(Response.Status.MOVED_PERMANENTLY, "http://dfx-global.com/dfx/api/flows");
    Client client = createMockClient(response);
    CdpRequestContext<?> context = createContext(client);
    TestMiddleware next = new TestMiddleware(response, result);
    Redirect redirectExtension = new Redirect(next);
    redirectExtension.invokeAPI(context);
    assertEquals(2, next.getExecutedTimes());

    CdpRequestContext<?> ctx0 = next.getContexts().get(0);
    assertEquals("POST", ctx0.getMethod());
    assertEquals("http://cdp.com", ctx0.getEndpoint());
    assertEquals("/api/v1/df/uploadFlow", ctx0.getPath());
    assertEquals(false, ctx0.getProperties().get(ClientProperties.FOLLOW_REDIRECTS));

    CdpRequestContext<?> ctx1 = next.getContexts().get(1);
    assertEquals("POST", ctx1.getMethod());
    assertEquals("http://dfx-global.com/dfx/api/flows", ctx1.getEndpoint());
    assertEquals("", ctx1.getPath());
    assertTrue(ctx1.getQueries().isEmpty());
    assertTrue(ctx1.getProperties().isEmpty());
    assertNotNull(ctx1.getBody());

    assertEquals(result, context.getResponse());
  }

  @Test
  public void testRedirectedNoLocation() {
    Response response = createResponse(Response.Status.MOVED_PERMANENTLY, NO_LOCATION);
    Client client = createMockClient(response);
    CdpRequestContext<TestResponse> context = createContext(client);
    TestMiddleware next = new TestMiddleware(response, NO_RESPONSE);
    Redirect redirectExtension = new Redirect(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> redirectExtension.invokeAPI(context));
    assertEquals("Missing Location response header", e.getMessage());
    assertEquals(1, next.getExecutedTimes());
  }

  @Test
  public void testRedirectedEmptyLocation() {
    Response response = createResponse(Response.Status.MOVED_PERMANENTLY, "");
    Client client = createMockClient(response);
    CdpRequestContext<TestResponse> context = createContext(client);
    TestMiddleware next = new TestMiddleware(response, NO_RESPONSE);
    Redirect redirectExtension = new Redirect(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> redirectExtension.invokeAPI(context));
    assertEquals("Missing or incorrect redirect URL", e.getMessage());
    assertEquals(1, next.getExecutedTimes());
  }

  @Test
  public void testRedirectedRelativeLocation() {
    Response response = createResponse(Response.Status.MOVED_PERMANENTLY, "/relativeUrl");
    Client client = createMockClient(response);
    CdpRequestContext<TestResponse> context = createContext(client);
    TestMiddleware next = new TestMiddleware(response, NO_RESPONSE);
    Redirect redirectExtension = new Redirect(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> redirectExtension.invokeAPI(context));
    assertEquals("Missing or incorrect redirect URL", e.getMessage());
    assertEquals(1, next.getExecutedTimes());
  }

  @Test
  public void testNoRedirection() {
    Response response = createResponse(Response.Status.OK, NO_LOCATION);
    Client client = createMockClient(response);
    CdpRequestContext<TestResponse> context = createContext(client);
    TestMiddleware next = new TestMiddleware(response, NO_RESPONSE);
    Redirect redirectExtension = new Redirect(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> redirectExtension.invokeAPI(context));
    assertEquals("Redirect response status code is incorrect. HTTP status: 200", e.getMessage());
    assertEquals(1, next.getExecutedTimes());
  }

  @Test
  public void testRedirectFailed() {
    Response response = createResponse(Response.Status.BAD_REQUEST, NO_LOCATION);
    Client client = createMockClient(response);
    CdpRequestContext<TestResponse> context = createContext(client);
    TestMiddleware next = new TestMiddleware(response, NO_RESPONSE);
    Redirect redirectExtension = new Redirect(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> redirectExtension.invokeAPI(context));
    assertEquals("Redirect response status code is incorrect. HTTP status: 400", e.getMessage());
    assertEquals(1, next.getExecutedTimes());
  }

  @Test
  public void testNoResponse() {
    Response response = null;
    Client client = createMockClient(response);
    CdpRequestContext<TestResponse> context = createContext(client);
    TestMiddleware next = new TestMiddleware(response, NO_RESPONSE);
    Redirect redirectExtension = new Redirect(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> redirectExtension.invokeAPI(context));
    assertEquals("Missing redirect response", e.getMessage());
    assertEquals(1, next.getExecutedTimes());
  }
}
