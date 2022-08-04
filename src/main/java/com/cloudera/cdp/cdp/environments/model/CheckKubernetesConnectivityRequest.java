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
 * Request object for checking Kubernetes connectivity.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-03T22:29:42.201-07:00")
public class CheckKubernetesConnectivityRequest  {

  /**
   * Content of Kubernetes configuration file as a text blob in YAML format.
   **/
  private String kubeConfig = null;

  /**
   * Format of Kubernetes configuration file. Defaults to YAML.
   **/
  private String format = null;

  /**
   * Getter for kubeConfig.
   * Content of Kubernetes configuration file as a text blob in YAML format.
   **/
  @JsonProperty("kubeConfig")
  public String getKubeConfig() {
    return kubeConfig;
  }

  /**
   * Setter for kubeConfig.
   * Content of Kubernetes configuration file as a text blob in YAML format.
   **/
  public void setKubeConfig(String kubeConfig) {
    this.kubeConfig = kubeConfig;
  }

  /**
   * Getter for format.
   * Format of Kubernetes configuration file. Defaults to YAML.
   **/
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  /**
   * Setter for format.
   * Format of Kubernetes configuration file. Defaults to YAML.
   **/
  public void setFormat(String format) {
    this.format = format;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckKubernetesConnectivityRequest checkKubernetesConnectivityRequest = (CheckKubernetesConnectivityRequest) o;
    if (!Objects.equals(this.kubeConfig, checkKubernetesConnectivityRequest.kubeConfig)) {
      return false;
    }
    if (!Objects.equals(this.format, checkKubernetesConnectivityRequest.format)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeConfig, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckKubernetesConnectivityRequest {\n");
    sb.append("    kubeConfig: ").append(toIndentedString(kubeConfig)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

