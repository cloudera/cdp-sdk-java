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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.BasicCdpCredentials;
import com.cloudera.cdp.client.CdpClientMiddleware;
import com.cloudera.cdp.client.CdpHttpClient;
import com.cloudera.cdp.client.CdpParseResponseMiddleware;
import com.cloudera.cdp.client.CdpRequestAuthMiddleware;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.CdpRequestHeadersMiddleware;
import com.cloudera.cdp.df.model.GetFlowVersionRequest;
import com.cloudera.cdp.df.model.GetFlowVersionResponse;
import com.cloudera.cdp.df.model.ImportFlowDefinitionRequest;
import com.cloudera.cdp.df.model.ImportFlowDefinitionResponse;
import com.cloudera.cdp.df.model.ImportFlowDefinitionVersionRequest;
import com.cloudera.cdp.df.model.ImportFlowDefinitionVersionResponse;
import com.cloudera.cdp.dfworkload.model.UploadAssetRequest;
import com.cloudera.cdp.dfworkload.model.UploadAssetResponse;
import com.cloudera.cdp.http.NeverRetryHandler;
import com.cloudera.cdp.util.CdpSDKTestUtils;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.Resources;

import java.net.URI;
import java.nio.charset.Charset;
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
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;

public class DfExtensionTest {
  private static final CdpClientMiddleware INNER_MIDDLEWARE =
      new CdpRequestHeadersMiddleware(
          new CdpRequestAuthMiddleware(
              new CdpParseResponseMiddleware(
                  new CdpHttpClient())),
          ImmutableMap.of());

  private static Client createMockClient(Response response) {
    Invocation.Builder builder = mock(Invocation.Builder.class);
    when(builder.accept(eq(MediaType.APPLICATION_JSON))).thenReturn(builder);
    when(builder.accept(eq(MediaType.APPLICATION_OCTET_STREAM))).thenReturn(builder);
    when(builder.headers(any(MultivaluedMap.class))).thenReturn(builder);
    when(builder.header(any(String.class), any())).thenReturn(builder);
    when(builder.method(eq("POST"), any(Entity.class))).thenReturn(response);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder);
    Client client = mock(Client.class);
    when(client.target(eq(URI.create("http://dfx-global.com/dfx/api/flows")))).thenReturn(webTarget);
    when(client.target(eq(URI.create("http://dfx-global.com/dfx/api/flows/flow-crn")))).thenReturn(webTarget);
    when(client.target(eq(URI.create("http://dfx-local.com/dfx/api/rpc-v1/deployments/upload-asset-content")))).thenReturn(webTarget);
    when(client.target(eq(URI.create("http://dfx-global.com/api/v1/df/getFlowVersion")))).thenReturn(webTarget);
    return client;
  }

  private static Response createSuccessfulResponse(ImportFlowDefinitionResponse importFlowDefinitionResponse) {
    Response response = mock(Response.class);
    when(response.getStatusInfo()).thenReturn(Response.Status.OK);
    when(response.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    when(response.readEntity(argThat((ArgumentMatcher<GenericType>) t -> t.getRawType().equals(ImportFlowDefinitionResponse.class)))).thenReturn(importFlowDefinitionResponse);
    return response;
  }

  private static Client createMockClient(ImportFlowDefinitionResponse importFlowDefinitionResponse) {
    Response response = createSuccessfulResponse(importFlowDefinitionResponse);
    return createMockClient(response);
  }

  private static CdpRequestContext<ImportFlowDefinitionResponse> createContext(Client client, ImportFlowDefinitionRequest input) {
    CdpRequestContext<ImportFlowDefinitionResponse> context = new CdpRequestContext<>(
        client,
        "df",
        "importFlowDefinition",
        new GenericType<ImportFlowDefinitionResponse>(){});
    context.setRetryHandler(new NeverRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    context.setEndpoint("http://dfx-global.com");
    context.setMethod("POST");
    context.setPath("/dfx/api/flows");
    context.setBody(input);
    return context;
  }

  private static boolean verifyDfxGlobalImportFlowDefinitionRequestHeaders(
      Map<String, String> headers,
      String expectedName,
      String expectedDescription,
      String expectedComments) {
    assertNotNull(headers);
    assertTrue(headers.containsKey("x-altus-auth"));
    assertTrue(headers.containsKey("x-altus-date"));
    assertTrue(headers.containsKey(HttpHeaders.USER_AGENT));
    assertTrue(headers.containsKey(HttpHeaders.CONTENT_TYPE));
    assertEquals(MediaType.APPLICATION_JSON, headers.get(HttpHeaders.CONTENT_TYPE));
    if (expectedName != null) {
      assertEquals(expectedName, headers.get("Flow-Definition-Name"));
    } else {
      assertFalse(headers.containsKey("Flow-Definition-Name"));
    }
    if (expectedDescription != null) {
      assertEquals(expectedDescription, headers.get("Flow-Definition-Description"));
    } else {
      assertFalse(headers.containsKey("Flow-Definition-Description"));
    }
    if (expectedComments != null) {
      assertEquals(expectedComments, headers.get("Flow-Definition-Comments"));
    } else {
      assertFalse(headers.containsKey("Flow-Definition-Comments"));
    }
    return true;
  }

  @Test
  public void testImportFlowDefinitionToDfxGlobal() {
    ImportFlowDefinitionRequest input = new ImportFlowDefinitionRequest();
    input.setName("foo");
    input.setFile(Resources.getResource("df.flow.json").getPath());
    ImportFlowDefinitionResponse output = new ImportFlowDefinitionResponse();
    Client client = createMockClient(output);
    CdpRequestContext<ImportFlowDefinitionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    dfExtension.invokeAPI(context);
    assertEquals(output, context.getResponse());
    verifyDfxGlobalImportFlowDefinitionRequestHeaders(context.getHeaders(), "foo", null, null);
    verify(client, only()).target(URI.create("http://dfx-global.com/dfx/api/flows"));
  }

  @Test
  public void testImportFlowDefinitionToDfxGlobalAllParameters() {
    ImportFlowDefinitionRequest input = new ImportFlowDefinitionRequest();
    input.setName("foo");
    input.setDescription("bar");
    input.setComments("Hello\nWorld");
    input.setFile(Resources.getResource("df.flow.json").getPath());
    ImportFlowDefinitionResponse output = new ImportFlowDefinitionResponse();
    Client client = createMockClient(output);
    CdpRequestContext<ImportFlowDefinitionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    dfExtension.invokeAPI(context);
    assertEquals(output, context.getResponse());
    verifyDfxGlobalImportFlowDefinitionRequestHeaders(context.getHeaders(), "foo", "bar", "Hello\nWorld");
    verify(client, only()).target(URI.create("http://dfx-global.com/dfx/api/flows"));
  }

  @Test
  public void testImportFlowDefinitionToDfxGlobalNoName() {
    ImportFlowDefinitionRequest input = new ImportFlowDefinitionRequest();
    input.setFile(Resources.getResource("df.flow.json").getPath());
    ImportFlowDefinitionResponse output = new ImportFlowDefinitionResponse();
    Client client = createMockClient(output);
    CdpRequestContext<ImportFlowDefinitionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("Name argument is null", e.getMessage());
  }

  @Test
  public void testImportFlowDefinitionToDfxGlobalFileNotExist() {
    ImportFlowDefinitionRequest input = new ImportFlowDefinitionRequest();
    input.setName("foo");
    input.setFile("file-not-exist");
    ImportFlowDefinitionResponse output = new ImportFlowDefinitionResponse();
    Client client = createMockClient(output);
    CdpRequestContext<ImportFlowDefinitionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("Unable to load file at file-not-exist", e.getMessage());
  }

  @Test
  public void testImportFlowDefinitionToDfxGlobalUploadFailed() {
    ImportFlowDefinitionRequest input = new ImportFlowDefinitionRequest();
    input.setName("foo");
    input.setFile(Resources.getResource("df.flow.json").getPath());
    Response response = mock(Response.class);
    when(response.getStatusInfo()).thenReturn(Response.Status.BAD_REQUEST);
    when(response.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    when(response.readEntity(eq(String.class))).thenReturn("{\"error\":\"test error message\"}");
    Client client = createMockClient(response);
    CdpRequestContext<ImportFlowDefinitionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("com.cloudera.cdp.CdpServiceException: 400: unknown: test error message unknown", e.getMessage());
  }

  private static Response createSuccessfulResponse(ImportFlowDefinitionVersionResponse importFlowDefinitionVersionResponse) {
    Response response = mock(Response.class);
    when(response.getStatusInfo()).thenReturn(Response.Status.OK);
    when(response.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    when(response.readEntity(argThat((ArgumentMatcher<GenericType>) t -> t.getRawType().equals(ImportFlowDefinitionVersionResponse.class)))).thenReturn(importFlowDefinitionVersionResponse);
    return response;
  }

  private static Client createMockClient(ImportFlowDefinitionVersionResponse importFlowDefinitionVersionResponse) {
    Response response = createSuccessfulResponse(importFlowDefinitionVersionResponse);
    return createMockClient(response);
  }

  private static CdpRequestContext<ImportFlowDefinitionVersionResponse> createContext(Client client, ImportFlowDefinitionVersionRequest input) {
    CdpRequestContext<ImportFlowDefinitionVersionResponse> context = new CdpRequestContext<>(
        client,
        "df",
        "importFlowDefinitionVersion",
        new GenericType<ImportFlowDefinitionVersionResponse>(){});
    context.setRetryHandler(new NeverRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    context.setEndpoint("http://dfx-global.com");
    context.setMethod("POST");
    context.setPath("/dfx/api/flows/flow-crn");
    context.setBody(input);
    return context;
  }

  private static boolean verifyDfxGlobalImportFlowDefinitionVersionRequestHeaders(
      Map<String, String> headers,
      String expectedComments) {
    assertNotNull(headers);
    assertTrue(headers.containsKey("x-altus-auth"));
    assertTrue(headers.containsKey("x-altus-date"));
    assertTrue(headers.containsKey(HttpHeaders.USER_AGENT));
    assertTrue(headers.containsKey(HttpHeaders.CONTENT_TYPE));
    assertEquals(MediaType.APPLICATION_JSON, headers.get(HttpHeaders.CONTENT_TYPE));
    if (expectedComments != null) {
      assertEquals(expectedComments, headers.get("Flow-Definition-Comments"));
    } else {
      assertFalse(headers.containsKey("Flow-Definition-Comments"));
    }
    return true;
  }

  @Test
  public void testImportFlowDefinitionVersionToDfxGlobal() {
    ImportFlowDefinitionVersionRequest input = new ImportFlowDefinitionVersionRequest();
    input.setFlowCrn("foo");
    input.setFile(Resources.getResource("df.flow.json").getPath());
    ImportFlowDefinitionVersionResponse output = new ImportFlowDefinitionVersionResponse();
    Client client = createMockClient(output);
    CdpRequestContext<ImportFlowDefinitionVersionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    dfExtension.invokeAPI(context);
    assertEquals(output, context.getResponse());
    verifyDfxGlobalImportFlowDefinitionVersionRequestHeaders(context.getHeaders(), null);
    verify(client, only()).target(URI.create("http://dfx-global.com/dfx/api/flows/flow-crn"));
  }

  @Test
  public void testImportFlowDefinitionVersionToDfxGlobalAllParameters() {
    ImportFlowDefinitionVersionRequest input = new ImportFlowDefinitionVersionRequest();
    input.setFlowCrn("foo");
    input.setComments("Hello\nWorld");
    input.setFile(Resources.getResource("df.flow.json").getPath());
    ImportFlowDefinitionVersionResponse output = new ImportFlowDefinitionVersionResponse();
    Client client = createMockClient(output);
    CdpRequestContext<ImportFlowDefinitionVersionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    dfExtension.invokeAPI(context);
    assertEquals(output, context.getResponse());
    verifyDfxGlobalImportFlowDefinitionVersionRequestHeaders(context.getHeaders(), "Hello\nWorld");
    verify(client, only()).target(URI.create("http://dfx-global.com/dfx/api/flows/flow-crn"));
  }

  @Test
  public void testImportFlowDefinitionVersionToDfxGlobalFileNotExist() {
    ImportFlowDefinitionVersionRequest input = new ImportFlowDefinitionVersionRequest();
    input.setFlowCrn("foo");
    input.setFile("file-not-exist");
    ImportFlowDefinitionVersionResponse output = new ImportFlowDefinitionVersionResponse();
    Client client = createMockClient(output);
    CdpRequestContext<ImportFlowDefinitionVersionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("Unable to load file at file-not-exist", e.getMessage());
  }

  @Test
  public void testImportFlowDefinitionVersionToDfxGlobalUploadFailed() {
    ImportFlowDefinitionVersionRequest input = new ImportFlowDefinitionVersionRequest();
    input.setFlowCrn("foo");
    input.setFile(Resources.getResource("df.flow.json").getPath());
    Response response = mock(Response.class);
    when(response.getStatusInfo()).thenReturn(Response.Status.BAD_REQUEST);
    when(response.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    when(response.readEntity(eq(String.class))).thenReturn("{\"error\":\"test error message\"}");
    Client client = createMockClient(response);
    CdpRequestContext<ImportFlowDefinitionVersionResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("com.cloudera.cdp.CdpServiceException: 400: unknown: test error message unknown", e.getMessage());
  }

  private static Response createSuccessfulResponse(UploadAssetResponse uploadAssetResponse) {
    Response response = mock(Response.class);
    when(response.getStatusInfo()).thenReturn(Response.Status.OK);
    when(response.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    when(response.readEntity(argThat((ArgumentMatcher<GenericType>) t -> t.getRawType().equals(UploadAssetResponse.class)))).thenReturn(uploadAssetResponse);
    return response;
  }

  private static Client createMockClient(UploadAssetResponse uploadAssetResponse) {
    Response response = createSuccessfulResponse(uploadAssetResponse);
    return createMockClient(response);
  }

  private static CdpRequestContext<UploadAssetResponse> createContext(Client client, UploadAssetRequest input) {
    CdpRequestContext<UploadAssetResponse> context = new CdpRequestContext<>(
        client,
        "dfworkload",
        "uploadAsset",
        new GenericType<UploadAssetResponse>(){});
    context.setRetryHandler(new NeverRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-token"));
    context.setEndpoint("http://dfx-local.com");
    context.setMethod("POST");
    context.setPath("/dfx/api/upload-asset");
    context.setBody(input);
    return context;
  }

  private static boolean verifyDfxLocalUploadAssetRequestHeaders(
      Map<String, String> headers,
      String expectedParameterGroup,
      String expectedParameterName,
      String expectedDeploymentRequestCrn,
      String expectedDeploymentName,
      String expectedAssetUpdateRequestCrn,
      String expectedFilePath) {
    assertNotNull(headers);
    assertTrue(headers.containsKey(HttpHeaders.AUTHORIZATION));
    assertEquals("access-token", headers.get(HttpHeaders.AUTHORIZATION));
    assertTrue(headers.containsKey(HttpHeaders.USER_AGENT));
    assertTrue(headers.containsKey(HttpHeaders.CONTENT_TYPE));
    assertEquals(MediaType.APPLICATION_OCTET_STREAM, headers.get(HttpHeaders.CONTENT_TYPE));
    if (expectedParameterGroup != null) {
      assertEquals(expectedParameterGroup, headers.get("Parameter-Group"));
    } else {
      assertFalse(headers.containsKey("Parameter-Group"));
    }
    if (expectedParameterName != null) {
      assertEquals(expectedParameterName, headers.get("Parameter-Name"));
    } else {
      assertFalse(headers.containsKey("Parameter-Name"));
    }
    if (expectedDeploymentRequestCrn != null) {
      assertEquals(expectedDeploymentRequestCrn, headers.get("Deployment-Request-Crn"));
    } else {
      assertFalse(headers.containsKey("Deployment-Request-Crn"));
    }
    if (expectedDeploymentName != null) {
      assertEquals(expectedDeploymentName, headers.get("Deployment-Name"));
    } else {
      assertFalse(headers.containsKey("Deployment-Name"));
    }
    if (expectedAssetUpdateRequestCrn != null) {
      assertEquals(expectedAssetUpdateRequestCrn, headers.get("Asset-Update-Request-Crn"));
    } else {
      assertFalse(headers.containsKey("Asset-Update-Request-Crn"));
    }
    if (expectedFilePath != null) {
      assertEquals(expectedFilePath, headers.get("File-Path"));
    } else {
      assertFalse(headers.containsKey("File-Path"));
    }
    return true;
  }

  @Test
  public void testUploadAssetToDfxLocal() {
    UploadAssetRequest input = new UploadAssetRequest();
    input.setParameterGroup("param-group");
    input.setParameterName("param-name");
    input.setFilePath(Resources.getResource("df-workload.asset.bin").getPath());
    UploadAssetResponse output = new UploadAssetResponse();
    Client client = createMockClient(output);
    CdpRequestContext<UploadAssetResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    dfExtension.invokeAPI(context);
    assertEquals(output, context.getResponse());
    verifyDfxLocalUploadAssetRequestHeaders(context.getHeaders(), "param-group", "param-name", null, null, null, Resources.getResource("df-workload.asset.bin").getPath());
    verify(client, only()).target(URI.create("http://dfx-local.com/dfx/api/rpc-v1/deployments/upload-asset-content"));
  }

  @Test
  public void testUploadAssetToDfxLocalAllParameters() {
    UploadAssetRequest input = new UploadAssetRequest();
    input.setParameterGroup("param-group");
    input.setParameterName("param-name");
    input.setDeploymentName("deployment-name");
    input.setDeploymentRequestCrn("deployment-request-crn");
    // assetUpdateRequestCrn is removed temporarily.
    // input.setAssetUpdateRequestCrn("asset-update-request-crn");
    input.setFilePath(Resources.getResource("df-workload.asset.bin").getPath());
    UploadAssetResponse output = new UploadAssetResponse();
    Client client = createMockClient(output);
    CdpRequestContext<UploadAssetResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    dfExtension.invokeAPI(context);
    assertEquals(output, context.getResponse());
    verifyDfxLocalUploadAssetRequestHeaders(context.getHeaders(), "param-group", "param-name", "deployment-request-crn", "deployment-name", null, Resources.getResource("df-workload.asset.bin").getPath());
    verify(client, only()).target(URI.create("http://dfx-local.com/dfx/api/rpc-v1/deployments/upload-asset-content"));
  }

  @Test
  public void testUploadAssetToDfxLocalNoParameterGroup() {
    UploadAssetRequest input = new UploadAssetRequest();
    input.setParameterName("param-name");
    input.setFilePath(Resources.getResource("df-workload.asset.bin").getPath());
    UploadAssetResponse output = new UploadAssetResponse();
    Client client = createMockClient(output);
    CdpRequestContext<UploadAssetResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("ParameterGroup argument is null", e.getMessage());
  }

  @Test
  public void testUploadAssetToDfxLocalNoParameterName() {
    UploadAssetRequest input = new UploadAssetRequest();
    input.setParameterGroup("param-group");
    input.setFilePath(Resources.getResource("df-workload.asset.bin").getPath());
    UploadAssetResponse output = new UploadAssetResponse();
    Client client = createMockClient(output);
    CdpRequestContext<UploadAssetResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("ParameterName argument is null", e.getMessage());
  }

  @Test
  public void testUploadAssetToDfxLocalFileNotExist() {
    UploadAssetRequest input = new UploadAssetRequest();
    input.setParameterGroup("param-group");
    input.setParameterName("param-name");
    input.setFilePath("file-not-exist");
    UploadAssetResponse output = new UploadAssetResponse();
    Client client = createMockClient(output);
    CdpRequestContext<UploadAssetResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("Unable to load file at file-not-exist", e.getMessage());
  }

  @Test
  public void testUploadAssetToDfxLocalUploadFailed() {
    UploadAssetRequest input = new UploadAssetRequest();
    input.setParameterGroup("param-group");
    input.setParameterName("param-name");
    input.setFilePath(Resources.getResource("df-workload.asset.bin").getPath());
    Response response = mock(Response.class);
    when(response.getStatusInfo()).thenReturn(Response.Status.BAD_REQUEST);
    when(response.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    when(response.readEntity(eq(String.class))).thenReturn("{\"error\":\"test error message\"}");
    Client client = createMockClient(response);
    CdpRequestContext<UploadAssetResponse> context = createContext(client, input);
    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("com.cloudera.cdp.CdpServiceException: 400: unknown: test error message unknown", e.getMessage());
  }

  private static Response createSuccessfulResponse(GetFlowVersionResponse getFlowVersionResponse) {
    Response response = mock(Response.class);
    when(response.getStatusInfo()).thenReturn(Response.Status.OK);
    when(response.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    when(response.readEntity(argThat((ArgumentMatcher<GenericType>) t -> t.getRawType().equals(GetFlowVersionResponse.class)))).thenReturn(getFlowVersionResponse);
    return response;
  }

  private static Client createMockClient(GetFlowVersionResponse getFlowVersionResponse) {
    Response response = createSuccessfulResponse(getFlowVersionResponse);
    return createMockClient(response);
  }

  private static CdpRequestContext<GetFlowVersionResponse> createContext(Client client, GetFlowVersionRequest input) {
    CdpRequestContext<GetFlowVersionResponse> context = new CdpRequestContext<>(
        client,
        "df",
        "getFlowVersion",
        new GenericType<GetFlowVersionResponse>(){});
    context.setRetryHandler(new NeverRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    context.setEndpoint("http://dfx-global.com");
    context.setMethod("POST");
    context.setPath("/api/v1/df/getFlowVersion");
    context.setBody(input);
    return context;
  }
  @Test
  public void testGetFlowVersionSuccess() {
    GetFlowVersionRequest input = new GetFlowVersionRequest();
    input.setFlowVersionCrn("flow-version-crn");
    GetFlowVersionResponse output = new GetFlowVersionResponse();
    output.setFlowDefinition("{\"flowContents\": \"some-flow\"}".getBytes(Charset.defaultCharset()));
    Client client = createMockClient(output);

    CdpRequestContext<GetFlowVersionResponse> context = createContext(client, input);

    Df dfExtension = new Df(INNER_MIDDLEWARE);
    dfExtension.invokeAPI(context);
    assertEquals(output, context.getResponse());
    verify(client, only()).target(URI.create("http://dfx-global.com/api/v1/df/getFlowVersion"));
  }

  @Test
  public void testGetFlowVersionMissingFlowVersionCrn() {
    GetFlowVersionRequest input = new GetFlowVersionRequest();
    GetFlowVersionResponse output = new GetFlowVersionResponse();
    output.setFlowDefinition("{\"flowContents\": \"some-flow\"}".getBytes(Charset.defaultCharset()));
    Client client = createMockClient(output);

    CdpRequestContext<GetFlowVersionResponse> context = createContext(client, input);

    Df dfExtension = new Df(INNER_MIDDLEWARE);
    CdpClientException e = assertThrows(CdpClientException.class, () -> dfExtension.invokeAPI(context));
    assertEquals("Flow Version CRN argument is null or empty", e.getMessage());
  }
}
