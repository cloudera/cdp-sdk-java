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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;

import org.junit.jupiter.api.Test;

public class CdpClientBuilderTest {

  public class MockCdpClient extends CdpClient {
    public static final String SERVICE_NAME = "mock";
    public static final boolean CDP_ENDPOINT = true;
    public static final boolean ALTUS_EDPOINT = false;

    public MockCdpClient(
        CdpCredentials credentials,
        String endPoint,
        CdpClientConfiguration clientConfiguration) {
      super(credentials, endPoint, clientConfiguration);
    }

    @Override
    public String getServiceName() {
      return SERVICE_NAME;
    }
  }

  public class MockClientBuilderCdpEndpoint
      extends CdpClientBuilder<MockClientBuilderCdpEndpoint> {

    private MockClientBuilderCdpEndpoint() {
      super(MockCdpClient.SERVICE_NAME, MockCdpClient.CDP_ENDPOINT);
    }

    protected CdpClient defaultClient() {
      return defaultBuilder().build();
    }

    public MockClientBuilderCdpEndpoint defaultBuilder() {
      return new MockClientBuilderCdpEndpoint();
    }

    public MockCdpClient build() {
      return new MockCdpClient(getCdpCredentials().getCredentials(),
                               getCdpEndPoint(),
                               getCdpClientConfiguration());
    }

    @Override
    public MockClientBuilderCdpEndpoint self() {
      return this;
    }
  }

  public class MockClientBuilderAltusEndpoint
      extends CdpClientBuilder<MockClientBuilderAltusEndpoint> {

    private MockClientBuilderAltusEndpoint() {
      super(MockCdpClient.SERVICE_NAME, MockCdpClient.ALTUS_EDPOINT);
    }

    protected CdpClient defaultClient() {
      return defaultBuilder().build();
    }

    public MockClientBuilderAltusEndpoint defaultBuilder() {
      return new MockClientBuilderAltusEndpoint();
    }

    public MockCdpClient build() {
      return new MockCdpClient(getCdpCredentials().getCredentials(),
                               getCdpEndPoint(),
                               getCdpClientConfiguration());
    }

    @Override
    public MockClientBuilderAltusEndpoint self() {
      return this;
    }
  }

  @Test
  public void testDefaultBuilder() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    CdpClientConfiguration config =
        builder.getCdpClientConfiguration();
    CdpClientConfiguration defaultConfig =
        CdpClientConfigurationBuilder.defaultBuilder().build();
    assertEquals(
        defaultConfig.getConnectionTimeout(),
        config.getConnectionTimeout());
    assertEquals(
        defaultConfig.getReadTimeout(),
        config.getReadTimeout());
    assertEquals(
        defaultConfig.getClientApplicationName(),
        config.getClientApplicationName());
    assertEquals(
        defaultConfig.getRetryHandler().getClass(),
        config.getRetryHandler().getClass());
    assertEquals(
        defaultConfig.getProxyUri(),
        config.getProxyUri());
    assertEquals(
        defaultConfig.getProxyUsername(),
        config.getProxyUsername());
    assertEquals(
        defaultConfig.getProxyPassword(),
        config.getProxyPassword());
  }

  @Test
  public void testWithEndpoint() {
    MockClientBuilderCdpEndpoint cdpBuilder = new MockClientBuilderCdpEndpoint();
    cdpBuilder.withEndPoint("http://foo.bar/cdp");
    assertEquals("http://foo.bar/cdp", cdpBuilder.getCdpEndPoint());

    MockClientBuilderAltusEndpoint altusBuilder = new MockClientBuilderAltusEndpoint();
    altusBuilder.withEndPoint("http://foo.bar/altus");
    assertEquals("http://foo.bar/altus", altusBuilder.getCdpEndPoint());
  }

  @Test
  public void testCdpEndpoint() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertEquals("https://api.us-west-1.cdp.cloudera.com:443",
                 builder.getCdpEndPoint());
  }

  @Test
  public void testAltusEndpoint() {
    MockClientBuilderAltusEndpoint builder = new MockClientBuilderAltusEndpoint();
    assertEquals("https://mockapi.us-west-1.altus.cloudera.com:443",
                 builder.getCdpEndPoint());
  }

  @Test
  public void testNullCredentialsProvider() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertThrows(CdpClientException.class, () -> {
      builder.withCredentials(null);
    });
  }

  @Test
  public void testNullEndPoint() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertThrows(CdpClientException.class, () -> {
      builder.withEndPoint(null);
    });
  }

  @Test
  public void testNullClientConfiguration() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertThrows(CdpClientException.class, () -> {
      builder.withClientConfiguration(null);
    });
  }

  @Test
  public void testNullAltusEndpointWithCdpRegion() {
    MockClientBuilderAltusEndpoint builder = new MockClientBuilderAltusEndpoint();
    assertThrows(CdpClientException.class, () -> {
      builder.withCdpRegion(null);
    });
  }

  @Test
  public void testNullCdpRegion() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertThrows(CdpClientException.class, () -> {
      builder.withCdpRegion(null);
    });
  }

  @Test
  public void testWithDefaultCdpRegion() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertEquals("https://api.us-west-1.cdp.cloudera.com:443",
        builder.withCdpRegion(CdpRegion.US_WEST_1).getCdpEndPoint());
  }

  @Test
  public void testWithCdpRegionEu() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertEquals("https://api.eu-1.cdp.cloudera.com:443",
        builder.withCdpRegion(CdpRegion.EU_1).getCdpEndPoint());
  }

  @Test
  public void testWithCdpRegionAp() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertEquals("https://api.ap-1.cdp.cloudera.com:443",
        builder.withCdpRegion(CdpRegion.AP_1).getCdpEndPoint());
  }

  @Test
  public void testWithCdpRegionUsg() {
    MockClientBuilderCdpEndpoint builder = new MockClientBuilderCdpEndpoint();
    assertEquals("https://api.usg-1.cdp.clouderagovt.com:443",
        builder.withCdpRegion(CdpRegion.USG_1).getCdpEndPoint());
  }

  @Test
  public void testAltusWithCdpRegion() {
    MockClientBuilderAltusEndpoint builder = new MockClientBuilderAltusEndpoint();
    assertEquals("https://api.eu-1.cdp.cloudera.com:443",
        builder.withCdpRegion(CdpRegion.EU_1).getCdpEndPoint());
  }

  @Test
  public void testAltusWithDefaultCdpRegion() {
    MockClientBuilderAltusEndpoint builder = new MockClientBuilderAltusEndpoint();
    assertEquals("https://mockapi.us-west-1.altus.cloudera.com:443",
        builder.withCdpRegion(CdpRegion.US_WEST_1).getCdpEndPoint());
  }

}
