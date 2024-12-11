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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.CdpHTTPException;
import com.cloudera.cdp.authentication.credentials.BasicCdpCredentials;
import com.cloudera.cdp.client.BaseResponse;
import com.cloudera.cdp.client.CdpClientMiddleware;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.http.NeverRetryHandler;
import com.cloudera.cdp.iam.model.GenerateWorkloadAuthTokenRequest;
import com.cloudera.cdp.iam.model.GenerateWorkloadAuthTokenResponse;
import com.cloudera.cdp.util.CdpSDKTestUtils;

import java.net.URI;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;

public class WorkloadExtensionTest {

  private static class TestMiddleware implements CdpClientMiddleware {
    private boolean executed = false;
    private CdpRequestContext<?> context;

    @Override
    public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
      this.executed = true;
      this.context = context;
    }

    public boolean getExecuted() {
      return executed;
    }

    public CdpRequestContext<?> getContext() {
      return context;
    }
  }

  private static class WorkloadRequest {
    private final String environmentCrn;

    public WorkloadRequest() {
      this("test-env-crn");
    }

    public WorkloadRequest(String environmentCrn) {
      this.environmentCrn = environmentCrn;
    }

    public String getEnvironmentCrn() {
      return environmentCrn;
    }
  }

  private Client createMockClientNoResponse() {
    return createMockClientForGenerateWorkloadAuthToken(null);
  }

  private Client createMockClientForGenerateWorkloadAuthToken(GenerateWorkloadAuthTokenResponse generateWorkloadAuthTokenResponse) {
    Response response = mock(Response.class);
    when(response.getStatusInfo()).thenReturn(Response.Status.OK);
    when(response.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    when(response.readEntity(argThat((ArgumentMatcher<GenericType>) t -> t.getRawType().equals(GenerateWorkloadAuthTokenResponse.class)))).thenReturn(generateWorkloadAuthTokenResponse);
    Invocation.Builder builder = mock(Invocation.Builder.class);
    when(builder.accept(eq(MediaType.APPLICATION_JSON))).thenReturn(builder);
    when(builder.headers(any(MultivaluedMap.class))).thenReturn(builder);
    when(builder.header(any(String.class), any())).thenReturn(builder);
    when(builder.method(eq("POST"), argThat((ArgumentMatcher<Entity>) e -> {
      GenerateWorkloadAuthTokenRequest req = (GenerateWorkloadAuthTokenRequest) e.getEntity();
      return req.getWorkloadName().equals("DF") && req.getEnvironmentCrn().equals("test-env-crn");
    }))).thenReturn(response);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder);
    Client client = mock(Client.class);
    when(client.target(eq(URI.create("http://cdp.com/iam/generateWorkloadAuthToken")))).thenReturn(webTarget);
    return client;
  }

  private CdpRequestContext<RestResponse> createContext(Client client) {
    CdpRequestContext<RestResponse> context = new CdpRequestContext<>(
        client,
        "dfworkload",
        "workload-operation",
        new GenericType<RestResponse>(){});
    context.setRetryHandler(new NeverRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    context.setEndpoint("http://cdp.com");
    context.setMethod("GET");
    context.setPath("/path");
    context.setBody(new WorkloadRequest());
    return context;
  }

  @Test
  public void testServiceDiscoveryDf() {
    GenerateWorkloadAuthTokenResponse generateWorkloadAuthTokenResponse = new GenerateWorkloadAuthTokenResponse();
    generateWorkloadAuthTokenResponse.setEndpointUrl("http://test.com/workload");
    generateWorkloadAuthTokenResponse.setToken("test-access-token");
    Client client = createMockClientForGenerateWorkloadAuthToken(generateWorkloadAuthTokenResponse);
    CdpRequestContext<RestResponse> context = createContext(client);
    TestMiddleware next = new TestMiddleware();
    Workload workloadExtension = new Workload(next);
    workloadExtension.invokeAPI(context);
    assertTrue(next.getExecuted());
    CdpRequestContext<?> ctx = next.getContext();
    assertEquals("dfworkload", ctx.getServiceName());
    assertEquals("workload-operation", ctx.getOperationName());
    assertEquals("GET", ctx.getMethod());
    assertEquals("http://test.com/", ctx.getEndpoint());
    assertEquals("/path", ctx.getPath());
    assertEquals("Bearer test-access-token", ctx.getCredentials().getAccessToken());
    assertTrue(ctx.getBody() instanceof WorkloadRequest);
  }

  @Test
  public void testServiceDiscoveryNoResponse() {
    Client client = createMockClientNoResponse();
    CdpRequestContext<RestResponse> context = createContext(client);
    TestMiddleware next = new TestMiddleware();
    Workload workloadExtension = new Workload(next);
    CdpHTTPException e = assertThrows(CdpHTTPException.class, () -> workloadExtension.invokeAPI(context));
    assertEquals("200: Invalid response from server", e.getMessage());
    assertFalse(next.getExecuted());
  }

  @Test
  public void testServiceDiscoverySkipByAccessToken() {
    GenerateWorkloadAuthTokenResponse generateWorkloadAuthTokenResponse = new GenerateWorkloadAuthTokenResponse();
    Client client = createMockClientForGenerateWorkloadAuthToken(generateWorkloadAuthTokenResponse);
    CdpRequestContext<RestResponse> context = createContext(client);
    context.setCredentials(new BasicCdpCredentials("access-token-exists"));
    TestMiddleware next = new TestMiddleware();
    Workload workloadExtension = new Workload(next);
    workloadExtension.invokeAPI(context);
    assertTrue(next.getExecuted());
    CdpRequestContext<?> ctx = next.getContext();
    assertEquals("http://cdp.com", ctx.getEndpoint());
    assertEquals("access-token-exists", ctx.getCredentials().getAccessToken());
    verify(client, never()).target(any(String.class));
  }

  @Test
  public void testServiceDiscoveryNoServiceName() {
    Client client = createMockClientNoResponse();
    CdpRequestContext<RestResponse> context = new CdpRequestContext<>(
        client,
        "",
        "workload-operation",
        new GenericType<RestResponse>(){});
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    TestMiddleware next = new TestMiddleware();
    Workload workloadExtension = new Workload(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> workloadExtension.invokeAPI(context));
    assertEquals("Missing service name", e.getMessage());
    assertFalse(next.getExecuted());
    verify(client, never()).target(any(String.class));
  }

  @Test
  public void testServiceDiscoveryUnknownServiceName() {
    Client client = createMockClientNoResponse();
    CdpRequestContext<RestResponse> context = new CdpRequestContext<>(
        client,
        "foo",
        "workload-operation",
        new GenericType<RestResponse>(){});
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    TestMiddleware next = new TestMiddleware();
    Workload workloadExtension = new Workload(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> workloadExtension.invokeAPI(context));
    assertEquals("Unknown service name 'foo'", e.getMessage());
    assertFalse(next.getExecuted());
    verify(client, never()).target(any(String.class));
  }

  @Test
  public void testServiceDiscoveryNoEnvironmentCrn() {
    Client client = createMockClientNoResponse();
    CdpRequestContext<RestResponse> context = createContext(client);
    context.setBody(new WorkloadRequest(""));
    TestMiddleware next = new TestMiddleware();
    Workload workloadExtension = new Workload(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> workloadExtension.invokeAPI(context));
    assertEquals("Missing environment CRN", e.getMessage());
    assertFalse(next.getExecuted());
    verify(client, never()).target(any(String.class));
  }

  @Test
  public void testServiceDiscoveryInvalidRequestBody() {
    Client client = createMockClientNoResponse();
    CdpRequestContext<RestResponse> context = createContext(client);
    context.setBody(new Object());
    TestMiddleware next = new TestMiddleware();
    Workload workloadExtension = new Workload(next);
    CdpClientException e = assertThrows(CdpClientException.class, () -> workloadExtension.invokeAPI(context));
    assertEquals("Failed to retrieve environment CRN from request body", e.getMessage());
    assertFalse(next.getExecuted());
    verify(client, never()).target(any(String.class));
  }
}
