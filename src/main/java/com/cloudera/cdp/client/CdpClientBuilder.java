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

import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentialsProvider;
import com.cloudera.cdp.authentication.credentials.DefaultCdpCredentialProviderChain;
import com.cloudera.cdp.ValidationUtils;

/**
 * The base class of all client builders. This should not be referenced
 * directly.
 */
@SdkInternalApi
public abstract class CdpClientBuilder<T extends CdpClientBuilder<T>> {

  private static final String
      CDP_ENDPOINT = "https://api.%s.cdp.cloudera.com:443";
  private static final String
      GOVT_CDP_ENDPOINT = "https://api.%s.cdp.clouderagovt.com:443";
  private static final String
      ALTUS_ENDPOINT_FORMAT_STRING = "https://%sapi.%s.altus.cloudera.com:443";

  private CdpCredentialsProvider cdpCredentialsProvider;
  private CdpClientConfiguration cdpClientConfiguration;
  private CdpRegion cdpRegion = CdpRegion.US_WEST_1;
  private String cdpEndpoint = null;
  private final boolean cdpEndpointFormat;
  private final String serviceName;

  /**
   * Constructor.
   * @param serviceName the service name
   * @param cdpEndpointFormat whether this service uses the CDP endpoint format
   */
  protected CdpClientBuilder(String serviceName, boolean cdpEndpointFormat) {
    ValidationUtils.checkNotNullAndThrow(serviceName);
    this.cdpCredentialsProvider =
        DefaultCdpCredentialProviderChain.getInstance();
    this.cdpClientConfiguration =
        CdpClientConfigurationBuilder.defaultBuilder().build();
    this.cdpEndpointFormat = cdpEndpointFormat;
    this.serviceName = serviceName;
  }

  /**
   * Gets the current CdpCredentialsProvider.
   * @return the current value of the CdpCredentialsProvider
   */
  public CdpCredentialsProvider getCdpCredentials() {
    return cdpCredentialsProvider;
  }

  /**
   * Sets the CdpCredentialsProvider.
   * @param cdpCredentialsProvider the new value for the CdpCredentialsProvider
   * @return T the current builder object
   */
  public T withCredentials(CdpCredentialsProvider cdpCredentialsProvider) {
    ValidationUtils.checkNotNullAndThrow(cdpCredentialsProvider);
    this.cdpCredentialsProvider = cdpCredentialsProvider;
    return self();
  }

  /**
   * Sets the CDP service endpoint.
   * @param cdpEndPoint the new value for the CDP service endpoint
   * @return T the current builder object
   */
  public T withEndPoint(String cdpEndPoint) {
    ValidationUtils.checkNotNullAndThrow(cdpEndPoint);
    this.cdpEndpoint = cdpEndPoint;
    return self();
  }

  /**
   * Gets the CDP service endpoint.
   *
   * @return String - A string with the fully formed CDP service endpoint
   */
  public String getCdpEndPoint() {
    if (this.cdpEndpoint != null) {
      // An endpoint URL was set explicitly.
      return this.cdpEndpoint;
    }
    if (this.cdpEndpointFormat) {
      return getCdpFormatEndpoint();
    } else {
      return getAltusFormatEndpoint();
    }
  }

  /**
   * Gets the CDP service endpoint for CDP format.
   *
   * @return String - A string with the fully formed CDP format service endpoint
   */
  private String getCdpFormatEndpoint() {
    if (this.cdpRegion == CdpRegion.US_WEST_1) {
      return String.format(CDP_ENDPOINT, CdpRegion.US_WEST_1);
    } else if (this.cdpRegion == CdpRegion.USG_1) {
      return String.format(GOVT_CDP_ENDPOINT, CdpRegion.USG_1);
    } else {
      return String.format(CDP_ENDPOINT, this.cdpRegion);
    }
  }

  /**
   * Gets the CDP service endpoint for Altus format.
   *
   * @return String - A string with the fully formed Altus format service endpoint
   */
  private String getAltusFormatEndpoint() {
    if (this.cdpRegion == CdpRegion.US_WEST_1) {
      return String.format(ALTUS_ENDPOINT_FORMAT_STRING, this.serviceName, CdpRegion.US_WEST_1);
    } else if (this.cdpRegion == CdpRegion.USG_1) {
      return String.format(GOVT_CDP_ENDPOINT, CdpRegion.USG_1);
    } else {
      return String.format(CDP_ENDPOINT, this.cdpRegion);
    }
  }


  /**
   * Sets the CdpClientConfiguration.
   *
   * @param cdpClientConfiguration the new value for the CdpClientConfiguration
   * @return T the current builder object
   */
  public T withClientConfiguration(CdpClientConfiguration cdpClientConfiguration) {
    ValidationUtils.checkNotNullAndThrow(cdpClientConfiguration);
    this.cdpClientConfiguration = cdpClientConfiguration;
    return self();
  }

  /**
   * Gets the current CdpClientConfiguration.
   * @return the current value of the CdpClientConfiguration
   */
  public final CdpClientConfiguration getCdpClientConfiguration() {
    return cdpClientConfiguration;
  }

  /**
   * Sets the CdpRegion for multi region control plane.
   *
   * @param cdpRegion the new value for cdpRegion
   * @return T the current builder object
   */
  public T withCdpRegion(CdpRegion cdpRegion) {
    ValidationUtils.checkNotNullAndThrow(cdpRegion);
    this.cdpRegion = cdpRegion;
    return self();
  }

  /**
   * Gets the builder.
   *
   * @return the builder
   */
  protected abstract T self();
}
