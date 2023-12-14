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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for a create proxy config request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-13T15:06:59.023-08:00")
public class CreateProxyConfigRequest  {

  /**
   * The name of the proxy config.
   **/
  private String proxyConfigName = null;

  /**
   * The protocol.
   **/
  private String protocol = null;

  /**
   * The proxy host.
   **/
  private String host = null;

  /**
   * The proxy port.
   **/
  private Integer port = null;

  /**
   * A description for the proxy config.
   **/
  private String description = null;

  /**
   * Comma-separated list of 'CIDR', '[.]host[:port]' (can be a subdomain as well) and 'IP[:port]' entries that should not be proxied. Wildcards are not accepted. For example .cloudera.com,192.168.1.1
   **/
  private String noProxyHosts = null;

  /**
   * The proxy user.
   **/
  private String user = null;

  /**
   * The proxy password.
   **/
  private String password = null;

  /**
   * Getter for proxyConfigName.
   * The name of the proxy config.
   **/
  @JsonProperty("proxyConfigName")
  public String getProxyConfigName() {
    return proxyConfigName;
  }

  /**
   * Setter for proxyConfigName.
   * The name of the proxy config.
   **/
  public void setProxyConfigName(String proxyConfigName) {
    this.proxyConfigName = proxyConfigName;
  }

  /**
   * Getter for protocol.
   * The protocol.
   **/
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  /**
   * Setter for protocol.
   * The protocol.
   **/
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  /**
   * Getter for host.
   * The proxy host.
   **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  /**
   * Setter for host.
   * The proxy host.
   **/
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Getter for port.
   * The proxy port.
   **/
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  /**
   * Setter for port.
   * The proxy port.
   **/
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Getter for description.
   * A description for the proxy config.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * A description for the proxy config.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for noProxyHosts.
   * Comma-separated list of &#39;CIDR&#39;, &#39;[.]host[:port]&#39; (can be a subdomain as well) and &#39;IP[:port]&#39; entries that should not be proxied. Wildcards are not accepted. For example .cloudera.com,192.168.1.1
   **/
  @JsonProperty("noProxyHosts")
  public String getNoProxyHosts() {
    return noProxyHosts;
  }

  /**
   * Setter for noProxyHosts.
   * Comma-separated list of &#39;CIDR&#39;, &#39;[.]host[:port]&#39; (can be a subdomain as well) and &#39;IP[:port]&#39; entries that should not be proxied. Wildcards are not accepted. For example .cloudera.com,192.168.1.1
   **/
  public void setNoProxyHosts(String noProxyHosts) {
    this.noProxyHosts = noProxyHosts;
  }

  /**
   * Getter for user.
   * The proxy user.
   **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Setter for user.
   * The proxy user.
   **/
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Getter for password.
   * The proxy password.
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * The proxy password.
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProxyConfigRequest createProxyConfigRequest = (CreateProxyConfigRequest) o;
    if (!Objects.equals(this.proxyConfigName, createProxyConfigRequest.proxyConfigName)) {
      return false;
    }
    if (!Objects.equals(this.protocol, createProxyConfigRequest.protocol)) {
      return false;
    }
    if (!Objects.equals(this.host, createProxyConfigRequest.host)) {
      return false;
    }
    if (!Objects.equals(this.port, createProxyConfigRequest.port)) {
      return false;
    }
    if (!Objects.equals(this.description, createProxyConfigRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.noProxyHosts, createProxyConfigRequest.noProxyHosts)) {
      return false;
    }
    if (!Objects.equals(this.user, createProxyConfigRequest.user)) {
      return false;
    }
    if (!Objects.equals(this.password, createProxyConfigRequest.password)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyConfigName, protocol, host, port, description, noProxyHosts, user, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProxyConfigRequest {\n");
    sb.append("    proxyConfigName: ").append(toIndentedString(proxyConfigName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    noProxyHosts: ").append(toIndentedString(noProxyHosts)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

