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

import static com.google.common.base.Preconditions.checkNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.CdpHTTPException;
import com.cloudera.cdp.CdpServiceException;
import com.cloudera.cdp.authentication.credentials.BasicCdpCredentials;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.http.ExponentialBackoffDelayPolicy;
import com.cloudera.cdp.http.HttpCodesRetryChecker;
import com.cloudera.cdp.http.SimpleRetryHandler;
import com.cloudera.cdp.util.CdpSDKTestUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.io.Resources;

import java.time.Duration;
import java.util.Map;

import javax.annotation.Nullable;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import org.junit.jupiter.api.Test;

public class CdpClientTest {

  private static final ObjectMapper MAPPER = new ObjectMapper();

  private Response mockResponse(int httpCode, @Nullable String requestId) {
    Response response = mock(Response.class);
    StatusType statusType = mock(StatusType.class);
    doReturn(httpCode).when(statusType).getStatusCode();
    doReturn(Response.Status.Family.familyOf(httpCode))
      .when(statusType).getFamily();
    doReturn(statusType).when(response).getStatusInfo();
    MultivaluedHashMap<String, Object> headers = new MultivaluedHashMap<>();
    if (requestId != null) {
      headers.put(CdpResponse.CDP_HEADER_REQUESTID,
                  ImmutableList.of(requestId));
    }
    doReturn(headers).when(response).getHeaders();
    return response;
  }

  private enum CredentialType {
    API_KEY,
    ACCESS_TOKEN,
  }

  private static class TestClient extends CdpClient {
    private int apiCalls = 0;
    private final Response response;

    TestClient(Response response) {
      this(response, CredentialType.API_KEY);
    }

    TestClient(Response response, CredentialType credentialType) {
      super(getCdpCredentials(credentialType),
            "endpoint",
            CdpClientConfigurationBuilder.defaultBuilder()
            .withRetryHandler(
              new SimpleRetryHandler(
                new HttpCodesRetryChecker(HttpCodesRetryChecker.DEFAULT_RETRY_CODES),
                new ExponentialBackoffDelayPolicy(1, Duration.ofMillis(1)),
                3))
            .build());
      this.response = checkNotNull(response);
    }

    @Override
    protected Response getAPIResponse(String path, Object body)
        throws CdpServiceException {
      apiCalls++;
      return response;
    }

    private static CdpCredentials getCdpCredentials(CredentialType credentialType) {
      switch (credentialType) {
        case API_KEY:
          return new BasicCdpCredentials("accessKeyID", CdpSDKTestUtils.getRSAPrivateKey());

        case ACCESS_TOKEN:
          return new BasicCdpCredentials("Bearer A.B.C");

        default:
          return null;
      }
    }
  }

  public static class TestCdpResponse extends CdpResponse {
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testSuccessfulResponse() {
    Response mockResponse = mockResponse(200, "requestId");
    TestCdpResponse cdpResponse = new TestCdpResponse();
    when(mockResponse.readEntity(any(GenericType.class))).thenReturn(cdpResponse);
    TestClient client = new TestClient(mockResponse);
    TestCdpResponse response =
        client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
    assertEquals("requestId", response.getRequestId());
    assertEquals(1, client.apiCalls);
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testNullSuccessfulResponse() {
    Response mockResponse = mockResponse(200, "requestId");
    when(mockResponse.readEntity(any(GenericType.class))).thenReturn(null);
    TestClient client = new TestClient(mockResponse);
    Throwable e = assertThrows(CdpHTTPException.class, () -> {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
    });
    assertEquals(String.format("200: Invalid response from server"), e.getMessage());
  }

  @Test
  public void testNonCdpHTTPError() throws Exception {
    String responseBody = Resources.toString(
        Resources.getResource("502.html"), Charsets.UTF_8);
    Response mockResponse = mockResponse(502, null);
    when(mockResponse.readEntity(String.class)).thenReturn(responseBody);
    TestClient client = new TestClient(mockResponse);
    Throwable e = assertThrows(CdpHTTPException.class, () -> {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
    });
    assertEquals(String.format("502: %s", responseBody), e.getMessage());
  }

  @Test
  public void testCdpError() throws Exception {
    Map<String, String> error = Maps.newHashMap();
    error.put("code", "CODE");
    error.put("message", "message!");
    Response mockResponse = mockResponse(500, "requestId");
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    TestClient client = new TestClient(mockResponse);
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
      fail();
    } catch (CdpServiceException e) {
      assertEquals(1, client.apiCalls);
      assertEquals(500, e.getHttpCode());
      assertEquals(
          "com.cloudera.cdp.CdpServiceException: 500: CODE: message! requestId",
          e.getMessage());
      assertEquals("requestId", e.getRequestId());
    }
  }

  @Test
  public void testBadCdpErrors() throws Exception {
    // No body at all.
    Response mockResponse = mockResponse(500, "requestId");
    when(mockResponse.readEntity(String.class)).thenReturn(null);
    TestClient client = new TestClient(mockResponse);
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(1, client.apiCalls);
      assertEquals(500, e.getHttpCode());
      assertEquals("500: null", e.getMessage());
    }
    // A non-JSON body.
    when(mockResponse.readEntity(String.class)).thenReturn("NOT JSON!");
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(1, client.apiCalls);
      assertEquals(500, e.getHttpCode());
      assertEquals("500: NOT JSON!", e.getMessage());
    }
    // A JSON body with no content.
    Map<String, String> error = Maps.newHashMap();
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(1, client.apiCalls);
      assertEquals(500, e.getHttpCode());
      assertEquals("500: {}", e.getMessage());
    }
    // A JSON body with only the code.
    error.put("code", "CODE");
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(1, client.apiCalls);
      assertEquals(500, e.getHttpCode());
      assertEquals("500: " + MAPPER.writeValueAsString(error), e.getMessage());
    }
    // A JSON body with only the message.
    error.clear();
    error.put("message", "MESSAGE!");
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(1, client.apiCalls);
      assertEquals(500, e.getHttpCode());
      assertEquals("500: " + MAPPER.writeValueAsString(error), e.getMessage());
    }
    // A JSON error but no request ID.
    mockResponse = mockResponse(500, null);
    error.put("code", "CODE");
    error.put("message", "message!");
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(1, client.apiCalls);
      assertEquals(500, e.getHttpCode());
      assertEquals("500: " + MAPPER.writeValueAsString(error), e.getMessage());
    }
  }

  @Test
  public void testRetries() {
    Response mockResponse = mockResponse(503, null);
    TestClient client = new TestClient(mockResponse);
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>() {});
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(3, client.apiCalls);
      assertEquals(503, e.getHttpCode());
      assertEquals("503: null", e.getMessage());
    }
  }

  @Test
  public void testCallAfterShutdown() {
    CdpClient client = new CdpClient(
        new BasicCdpCredentials("accessKeyID",
                                CdpSDKTestUtils.getRSAPrivateKey()),
        "endpoint",
        CdpClientConfigurationBuilder.defaultBuilder().build()) {
    };
    client.shutdown();
    try {
      client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>() {});
      fail();
    } catch (CdpClientException e) {
      assertEquals("Client instance has been closed.", e.getMessage());
    }
  }

  @Test
  public void testShutdownTwice() {
    Response mockResponse = mockResponse(503, null);
    TestClient client = new TestClient(mockResponse);
    client.shutdown();
    client.shutdown();
  }

  @Test
  public void testUserAgent() throws Exception {
    Response mockResponse = mockResponse(200, "requestId");
    TestCdpResponse altusResponse = new TestCdpResponse();
    when(mockResponse.readEntity(any(GenericType.class))).thenReturn(
        altusResponse);
    TestClient client = new TestClient(mockResponse) {
      @Override
      protected MultivaluedMap<String, Object> computeHeaders(String path) {
        MultivaluedMap<String, Object> headers = super.computeHeaders(path);
        assertTrue(headers.containsKey(HttpHeaders.USER_AGENT));
        assertEquals(buildUserAgent(), headers.get(HttpHeaders.USER_AGENT));
        return headers;
      }
    };
    TestCdpResponse response =
        client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
    assertEquals("requestId", response.getRequestId());
    assertEquals(1, client.apiCalls);
  }

  @Test
  public void testApiKeyAuth() throws Exception {
    Response mockResponse = mockResponse(200, "requestId");
    TestCdpResponse altusResponse = new TestCdpResponse();
    when(mockResponse.readEntity(any(GenericType.class))).thenReturn(
        altusResponse);
    TestClient client = new TestClient(mockResponse, CredentialType.API_KEY) {
      @Override
      protected MultivaluedMap<String, Object> computeHeaders(String path) {
        MultivaluedMap<String, Object> headers = super.computeHeaders(path);
        assertTrue(headers.containsKey("x-altus-auth"));
        assertEquals("todo", headers.get("x-altus-auth"));
        return headers;
      }
    };
    TestCdpResponse response =
        client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
    assertEquals("requestId", response.getRequestId());
    assertEquals(1, client.apiCalls);
  }

  @Test
  public void testAccessTokenAuth() throws Exception {
    Response mockResponse = mockResponse(200, "requestId");
    TestCdpResponse altusResponse = new TestCdpResponse();
    when(mockResponse.readEntity(any(GenericType.class))).thenReturn(
        altusResponse);
    TestClient client = new TestClient(mockResponse, CredentialType.ACCESS_TOKEN) {
      @Override
      protected MultivaluedMap<String, Object> computeHeaders(String path) {
        MultivaluedMap<String, Object> headers = super.computeHeaders(path);
        assertTrue(headers.containsKey(HttpHeaders.AUTHORIZATION));
        assertEquals("Bearer A.B.C", headers.get(HttpHeaders.AUTHORIZATION));
        return headers;
      }
    };
    TestCdpResponse response =
        client.invokeAPI("somePath", "", new GenericType<TestCdpResponse>(){});
    assertEquals("requestId", response.getRequestId());
    assertEquals(1, client.apiCalls);
  }
}
