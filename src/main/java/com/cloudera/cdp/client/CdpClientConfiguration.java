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

import com.cloudera.cdp.http.RetryHandler;

import java.time.Duration;

/**
 * Class encapsulating properties that can be set on a CDP client.
 */
public class CdpClientConfiguration {

  private final int maxConnections;
  private final Duration readTimeout;
  private final Duration connectionTimeout;
  private final Duration connectionMaxIdle;
  private final Duration validateAfterInactivity;
  private final RetryHandler retryHandler;
  private final String clientApplicationName;
  private final String proxyUri;
  private final String proxyUsername;
  private final String proxyPassword;

  /**
   * Constructor.
   * @param builder the client configuration builder
   */
  public CdpClientConfiguration(CdpClientConfigurationBuilder builder) {
    checkNotNull(builder);
    maxConnections = builder.getMaxConnections();
    readTimeout = builder.getReadTimeout();
    connectionTimeout = builder.getConnectionTimeout();
    connectionMaxIdle = builder.getConnectionMaxIdle();
    validateAfterInactivity = builder.getValidateAfterInactivity();
    retryHandler = builder.getRetryHandler();
    clientApplicationName = builder.getClientApplicationName();
    proxyUri = builder.getProxyUri();
    proxyUsername = builder.getProxyUsername();
    proxyPassword = builder.getProxyPassword();
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getMaxConnections()}.
   */
  public int getMaxConnections() {
    return this.maxConnections;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getConnectionTimeout()}.
   */
  public Duration getConnectionTimeout() {
    return this.connectionTimeout;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getReadTimeout()}.
   */
  public Duration getReadTimeout() {
    return this.readTimeout;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getConnectionMaxIdle()}.
   */
  public Duration getConnectionMaxIdle() {
    return this.connectionMaxIdle;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getValidateAfterInactivity()}.
   */
  public Duration getValidateAfterInactivity() {
    return this.validateAfterInactivity;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getRetryHandler()}.
   */
  public RetryHandler getRetryHandler() {
    return this.retryHandler;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getClientApplicationName()}.
   */
  public String getClientApplicationName() {
    return this.clientApplicationName;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getProxyUri()}.
   */
  public String getProxyUri() {
    return this.proxyUri;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getProxyUsername()}.
   */
  public String getProxyUsername() {
    return this.proxyUsername;
  }

  /**
   * see: {@link CdpClientConfigurationBuilder#getProxyPassword()}.
   */
  public String getProxyPassword() {
    return this.proxyPassword;
  }
}

