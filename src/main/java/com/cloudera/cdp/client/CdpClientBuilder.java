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
      CDP_ENDPOINT = "https://api.us-west-1.cdp.cloudera.com:443";
  private static final String
      ALTUS_ENDPOINT_FORMAT_STRING = "https://%sapi.us-west-1.altus.cloudera.com:443";

  private CdpCredentialsProvider cdpCredentialsProvider;
  private CdpClientConfiguration cdpClientConfiguration;
  private String cdpEndPoint;

  /**
   * Constructor.
   * @param serviceName the service name
   * @param cdpEndpointFormat whether this service uses the CDP endpoint format
   */
  protected CdpClientBuilder(String serviceName,  boolean cdpEndpointFormat) {
    ValidationUtils.checkNotNullAndThrow(serviceName);
    if (cdpEndpointFormat) {
      this.cdpEndPoint = CDP_ENDPOINT;
    } else {
      this.cdpEndPoint =
          String.format(ALTUS_ENDPOINT_FORMAT_STRING, serviceName);
    }
    this.cdpCredentialsProvider =
        DefaultCdpCredentialProviderChain.getInstance();
    this.cdpClientConfiguration =
        CdpClientConfigurationBuilder.defaultBuilder().build();
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
    this.cdpEndPoint = cdpEndPoint;
    return self();
  }

  /**
   * Gets the CDP service endpoint.
   * @return String - A string with the fully formed CDP service endpoint
   */
  public String getCdpEndPoint() {
    return cdpEndPoint;
  }

  /**
   * Sets the CdpClientConfiguration.
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
   * Gets the builder.
   * @return the builder
   */
  protected abstract T self();
}
