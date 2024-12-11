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

import static com.cloudera.cdp.ValidationUtils.checkArgumentAndThrow;
import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.http.ExponentialBackoffDelayPolicy;
import com.cloudera.cdp.http.HttpCodesRetryChecker;
import com.cloudera.cdp.http.RetryHandler;
import com.cloudera.cdp.http.SimpleRetryHandler;
import com.google.common.base.MoreObjects;

import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Nullable;

/**
 * Class used to build an CdpClientConfiguration object.
 */
public class CdpClientConfigurationBuilder {

  private int maxConnections = 20;
  private String clientApplicationName = null;
  private String proxyUri = null;
  private String proxyUsername = null;
  private String proxyPassword = null;
  private Duration readTimeout = Duration.ofMinutes(1);
  private Duration connectionTimeout = Duration.ofMinutes(1);
  private Duration connectionMaxIdle = Duration.ofSeconds(50);
  private Duration validateAfterInactivity = Duration.ofSeconds(2);
  private RetryHandler retryHandler = new SimpleRetryHandler(
      new HttpCodesRetryChecker(HttpCodesRetryChecker.DEFAULT_RETRY_CODES),
      /**
       * We use exponential backoff with parameters that gives us about
       * 1 minute and 20 seconds of wait.
       */
      new ExponentialBackoffDelayPolicy(2, Duration.ofMillis(10), 5),
      13);
  private boolean ignoreTls = false;
  private List<X509Certificate> trustedCertificates = new ArrayList<>();
  private Map<String, String> requestHeaders = new HashMap<>();

  private CdpClientConfigurationBuilder() {}

  /**
   * Sets the maximum number of allowed open HTTP connections.
   * @param maxConnections The maximum number of allowed open HTTP connections.
   * @return a reference to the CdpClientConfiguration object so that method calls
   * can be chained together.
   */
  public CdpClientConfigurationBuilder withMaxConnections(int maxConnections) {
    checkArgumentAndThrow(maxConnections > 0);
    this.maxConnections = maxConnections;
    return this;
  }

  /**
   * Returns the maximum number of allowed open HTTP connections.
   * @return The maximum number of allowed open HTTP connections.
   */
  public int getMaxConnections() {
    return this.maxConnections;
  }

  /**
   * Sets the client application name.
   * @param clientApplicationName - Name of the the client application.
   * @return a reference to the CdpClientConfiguration object so that method calls
   * can be chained together.
   */
  public CdpClientConfigurationBuilder withClientApplicationName(String clientApplicationName) {
    checkNotNullAndThrow(clientApplicationName);
    this.clientApplicationName = clientApplicationName;
    return this;
  }

  /**
   * Returns the client application name if set optionally by a customer or a partner
   * application. This client application name would be used by Cloudera to derive metrics
   * around CDP SDK adoption by different customers and partners.
   * @return the client application name, if set, otherwise returns "" (empty string) by default
   */
  public String getClientApplicationName() {
    return this.clientApplicationName;
  }

  /**
   * Sets the connection timeout on the underlying HTTP client.
   * @param connectionTimeout the connection timeout
   * @return the builder.
   */
  public CdpClientConfigurationBuilder withConnectionTimeout(Duration connectionTimeout) {
    checkArgumentAndThrow(connectionTimeout.toMillis() > 0);
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  /**
   * Gets the connection timeout of the underlying HTTP connection.
   * @return the connection timeout
   */
  public Duration getConnectionTimeout() {
    return this.connectionTimeout;
  }

  /**
   * Sets the read timeout on the underlying HTTP client.
   * @param readTimeout the read timeout
   * @return Returns a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder withReadTimeout(Duration readTimeout) {
    checkArgumentAndThrow(readTimeout.toMillis() > 0);
    this.readTimeout = readTimeout;
    return this;
  }

  /**
   * Gets the read timeout on the underlying HTTP client.
   * @return the read timeout
   */
  public Duration getReadTimeout() {
    return this.readTimeout;
  }

  /**
   * Sets the maximum amount of time that an idle connection may sit in the
   * connection pool and still be eligible for reuse. When retrieving a
   * connection from the pool to make a request, the amount of time the
   * connection has been idle is compared against this value. Connections which
   * have been idle for longer are discarded, and if needed a new connection is
   * created. Tuning this setting down reduces the likelihood of a race
   * condition (wherein you begin sending a request down a connection which
   * appears to be healthy, but before it arrives the service decides the
   * connection has been idle for too long and closes it) at the cost of
   * having to re-establish new connections more frequently. A non positive
   * value disables this check.
   * @param connectionMaxIdle the connectionMaxIdle value
   * @return the builder.
   */
  public CdpClientConfigurationBuilder withConnectionMaxIdle(
      Duration connectionMaxIdle) {
    checkNotNullAndThrow(connectionMaxIdle);
    this.connectionMaxIdle = connectionMaxIdle;
    return this;
  }

  /**
   * Returns the maximum amount of time that an idle connection may sit in the
   * connection pool and still be eligible for reuse. When retrieving a
   * connection from the pool to make a request, the amount of time the
   * connection has been idle is compared against this value. Connections which
   * have been idle for longer are discarded, and if needed a new connection is
   * created. Tuning this setting down reduces the likelihood of a race
   * condition (wherein you begin sending a request down a connection which
   * appears to be healthy, but before it arrives the service decides the
   * connection has been idle for too long and closes it) at the cost of
   * having to re-establish new connections more frequently.
   * @return the connection maximum idle time
   */
  public Duration getConnectionMaxIdle() {
    return connectionMaxIdle;
  }

  /**
   * Sets the amount of time that a connection can be idle in the connection
   * pool before it must be validated to ensure it's still open. This "stale
   * connection check" adds a small bit of overhead to validate the connection.
   * Setting this value to larger values may increase the likelihood that the
   * connection is not usable, potentially resulting in a
   * {@link org.apache.http.NoHttpResponseException}. Lowering this setting
   * increases the overhead when leasing connections from the connection pool.
   * A non positive value disables validation of connections.
   * @param validateAfterInactivity the validateAfterInactivity value
   * @return the builder.
   */
  public CdpClientConfigurationBuilder withValidateAfterInactivity(
      Duration validateAfterInactivity) {
    checkNotNullAndThrow(validateAfterInactivity);
    this.validateAfterInactivity = validateAfterInactivity;
    return this;
  }

  /**
   * Returns the amount of time that a connection can be idle in the connection
   * pool before it must be validated to ensure it's still open. This "stale
   * connection check" adds a small bit of overhead to validate the connection.
   * Setting this value to larger values may increase the likelihood that the
   * connection is not usable, potentially resulting in a
   * {@link org.apache.http.NoHttpResponseException}. Lowering this setting
   * increases the overhead when leasing connections from the connection pool.
   * A non positive value disables validation of connections.
   * @return the validate after inactivity duration
   */
  public Duration getValidateAfterInactivity() {
    return this.validateAfterInactivity;
  }

  /**
   * Sets the value for RetryHandler.  If none is set the SimpleRetryHandler is used.
   * The retry handler determines whether or not to retry service operations in the
   * event of a failure or exception.
   * @param retryHandler The retry handler to use
   * @return the current value of the flag as a boolean
   */
  public CdpClientConfigurationBuilder withRetryHandler(RetryHandler retryHandler) {
    checkNotNullAndThrow(retryHandler);
    this.retryHandler = retryHandler;
    return this;
  }

  /**
   * Gets the current value of the retryHandler property.
   * @return a RetryHandler object with the current value of the retryHandler property
   */
  public RetryHandler getRetryHandler() {
    return this.retryHandler;
  }

  /**
   * Sets the value of the proxy URI. If not set or explicitly set to null, then
   * no proxy will be used for connections.
   *
   * The string should be of the form: http(s)://hostname:port/
   * @param proxyUri The Proxy URI
   * @return a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder withProxyUri(@Nullable String proxyUri) {
    this.proxyUri = proxyUri;
    return this;
  }

  /**
   * Gets the current proxy URI.
   * @return the proxy URI
   */
  public String getProxyUri() {
    return this.proxyUri;
  }

  /**
   * Sets the value of the proxy username. If not set or explicitly set to null,
   * the connection to the proxy will not be authenticated
   *
   * @param proxyUsername The Proxy Username
   * @return a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder withProxyUsername(@Nullable String proxyUsername) {
    this.proxyUsername = proxyUsername;
    return this;
  }

  /**
   * Gets the current proxy username.
   * @return the proxy username
   */
  public String getProxyUsername() {
    return this.proxyUsername;
  }

  /**
   * Sets the value of the proxy password.
   *
   * @param proxyPassword The Proxy Password
   * @return a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder withProxyPassword(@Nullable String proxyPassword) {
    this.proxyPassword = proxyPassword;
    return this;
  }

  /**
   * Gets the current proxy password.
   * @return the proxy password
   */
  public String getProxyPassword() {
    return this.proxyPassword;
  }

  /**
   * Sets the switch to ignore HTTPS verification errors.
   *
   * @param ignoreTls The switch to ignore HTTPS verification errors
   * @return a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder withIgnoreTls(boolean ignoreTls) {
    this.ignoreTls = ignoreTls;
    return this;
  }

  /**
   * Gets the switch to ignore HTTPS verification errors.
   * @return the switch to ignore HTTPS verification errors
   */
  public boolean getIgnoreTls() {
    return this.ignoreTls;
  }

  /**
   * Sets the trusted certificates.
   *
   * @param trustedCertificates The trusted certificates
   * @return a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder withTrustedCertificates(List<X509Certificate> trustedCertificates) {
    checkNotNullAndThrow(trustedCertificates);
    this.trustedCertificates = trustedCertificates;
    return this;
  }

  /**
   * Adds the trusted certificate.
   *
   * @param trustedCertificate The trusted certificate
   * @return a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder addTrustedCertificate(X509Certificate trustedCertificate) {
    checkNotNullAndThrow(trustedCertificate);
    this.trustedCertificates.add(trustedCertificate);
    return this;
  }

  /**
   * Gets the trusted certificates.
   * @return the trusted certificates
   */
  public List<X509Certificate> getTrustedCertificates() {
    return this.trustedCertificates;
  }

  /**
   * Sets the request headers.
   *
   * @param requestHeaders The request headers
   * @return a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder withRequestHeaders(Map<String, String> requestHeaders) {
    checkNotNullAndThrow(requestHeaders);
    this.requestHeaders = requestHeaders;
    return this;
  }

  /**
   * Adds the request header.
   *
   * @param name  The request header name
   * @param value The request header value
   * @return a reference to the CdpClientConfiguration object so
   * that method calls can be chained together
   */
  public CdpClientConfigurationBuilder addRequestHeader(String name, String value) {
    checkNotNullAndThrow(name);
    checkNotNullAndThrow(value);
    this.requestHeaders.put(name, value);
    return this;
  }

  /**
   * Gets the request headers.
   * @return the request headers
   */
  public Map<String, String> getRequestHeaders() {
    return this.requestHeaders;
  }

  /**
   * Gets an CdpClientConfigurationBuilder object with all the default values set.
   * @return an CdpClientConfiguration object with default values for each property
   */
   public static CdpClientConfigurationBuilder defaultBuilder() {
     return new CdpClientConfigurationBuilder();
   }

  /**
   * Builds an CdpClientConfiguration object based on current settings.
   * @return an CdpClientConfiguration object with current settings
   */
  public CdpClientConfiguration build() {
    return new CdpClientConfiguration(this);
  }

  /**
   * Builds an string representation of the CdpClientConfiguration object based on
   * current settings.
   * @return a string with current settings
   */
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("readTimeout", this.getReadTimeout())
        .add("connectionTimeout", this.getConnectionTimeout())
        .add("clientApplicationName", this.getClientApplicationName())
        .add("Proxy URI", this.getProxyUri())
        .add("Proxy Username", this.getProxyUsername())
        .add("Proxy Password", "<hidden>")
        .add("Ignore TLS", this.getIgnoreTls())
        .add("Trusted Certs", "<hidden>")
        .add("Request Headers", "<hidden>")
        .toString();
  }

}
