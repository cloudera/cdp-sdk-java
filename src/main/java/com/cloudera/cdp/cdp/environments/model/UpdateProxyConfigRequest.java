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
 * Request object for updating the proxy config of the given environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-25T14:07:13.279-07:00")
public class UpdateProxyConfigRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environment = null;

  /**
   * The name of the new proxy config for the environment. Either this or the remove proxy flag has to be given.
   **/
  private String proxyConfigName = null;

  /**
   * Flag to indicate that the current proxy config should be removed for the environment. Either this or a proxy config name has to be given.
   **/
  private Boolean removeProxy = null;

  /**
   * Getter for environment.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for proxyConfigName.
   * The name of the new proxy config for the environment. Either this or the remove proxy flag has to be given.
   **/
  @JsonProperty("proxyConfigName")
  public String getProxyConfigName() {
    return proxyConfigName;
  }

  /**
   * Setter for proxyConfigName.
   * The name of the new proxy config for the environment. Either this or the remove proxy flag has to be given.
   **/
  public void setProxyConfigName(String proxyConfigName) {
    this.proxyConfigName = proxyConfigName;
  }

  /**
   * Getter for removeProxy.
   * Flag to indicate that the current proxy config should be removed for the environment. Either this or a proxy config name has to be given.
   **/
  @JsonProperty("removeProxy")
  public Boolean getRemoveProxy() {
    return removeProxy;
  }

  /**
   * Setter for removeProxy.
   * Flag to indicate that the current proxy config should be removed for the environment. Either this or a proxy config name has to be given.
   **/
  public void setRemoveProxy(Boolean removeProxy) {
    this.removeProxy = removeProxy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProxyConfigRequest updateProxyConfigRequest = (UpdateProxyConfigRequest) o;
    if (!Objects.equals(this.environment, updateProxyConfigRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.proxyConfigName, updateProxyConfigRequest.proxyConfigName)) {
      return false;
    }
    if (!Objects.equals(this.removeProxy, updateProxyConfigRequest.removeProxy)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, proxyConfigName, removeProxy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProxyConfigRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    proxyConfigName: ").append(toIndentedString(proxyConfigName)).append("\n");
    sb.append("    removeProxy: ").append(toIndentedString(removeProxy)).append("\n");
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

