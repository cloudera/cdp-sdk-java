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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Cluster observability settings to update.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-12T14:16:19.093-07:00")
public class UpdateClusterObservabilityConfig  {

  /**
   * Create the log forwarding configuration in a valid fluentd format. Then that configuration is later inserted into a larger fluentd configuration.
   **/
  private String logsForwardingConfig = null;

  /**
   * Set the proxy CA certificates (PEM Bundle). If you use a TLS-terminating proxy server to inspect outbound internet traffic, you need to provide the proxy server's CA certificates bundle in PEM bundle format when you configure log forwarding.
   **/
  private String proxyCABundle = null;

  /**
   * Getter for logsForwardingConfig.
   * Create the log forwarding configuration in a valid fluentd format. Then that configuration is later inserted into a larger fluentd configuration.
   **/
  @JsonProperty("logsForwardingConfig")
  public String getLogsForwardingConfig() {
    return logsForwardingConfig;
  }

  /**
   * Setter for logsForwardingConfig.
   * Create the log forwarding configuration in a valid fluentd format. Then that configuration is later inserted into a larger fluentd configuration.
   **/
  public void setLogsForwardingConfig(String logsForwardingConfig) {
    this.logsForwardingConfig = logsForwardingConfig;
  }

  /**
   * Getter for proxyCABundle.
   * Set the proxy CA certificates (PEM Bundle). If you use a TLS-terminating proxy server to inspect outbound internet traffic, you need to provide the proxy server&#39;s CA certificates bundle in PEM bundle format when you configure log forwarding.
   **/
  @JsonProperty("proxyCABundle")
  public String getProxyCABundle() {
    return proxyCABundle;
  }

  /**
   * Setter for proxyCABundle.
   * Set the proxy CA certificates (PEM Bundle). If you use a TLS-terminating proxy server to inspect outbound internet traffic, you need to provide the proxy server&#39;s CA certificates bundle in PEM bundle format when you configure log forwarding.
   **/
  public void setProxyCABundle(String proxyCABundle) {
    this.proxyCABundle = proxyCABundle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClusterObservabilityConfig updateClusterObservabilityConfig = (UpdateClusterObservabilityConfig) o;
    if (!Objects.equals(this.logsForwardingConfig, updateClusterObservabilityConfig.logsForwardingConfig)) {
      return false;
    }
    if (!Objects.equals(this.proxyCABundle, updateClusterObservabilityConfig.proxyCABundle)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(logsForwardingConfig, proxyCABundle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClusterObservabilityConfig {\n");
    sb.append("    logsForwardingConfig: ").append(toIndentedString(logsForwardingConfig)).append("\n");
    sb.append("    proxyCABundle: ").append(toIndentedString(proxyCABundle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

