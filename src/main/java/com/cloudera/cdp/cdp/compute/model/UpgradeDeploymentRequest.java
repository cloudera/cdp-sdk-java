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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request structure for upgrading a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:46.341-07:00")
public class UpgradeDeploymentRequest  {

  /**
   * Compute cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * The namespace of the deployment.
   **/
  private String namespace = null;

  /**
   * The name of the deployment.
   **/
  private String name = null;

  /**
   * The version of the deployment to upgrade to. Defaults to latest version.
   **/
  private String chartVersion = null;

  /**
   * Escaped JSON overrides for the deployment's properties.
   **/
  private String overrides = null;

  /**
   * Getter for clusterCrn.
   * Compute cluster CRN.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Compute cluster CRN.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for namespace.
   * The namespace of the deployment.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace of the deployment.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for name.
   * The name of the deployment.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the deployment.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for chartVersion.
   * The version of the deployment to upgrade to. Defaults to latest version.
   **/
  @JsonProperty("chartVersion")
  public String getChartVersion() {
    return chartVersion;
  }

  /**
   * Setter for chartVersion.
   * The version of the deployment to upgrade to. Defaults to latest version.
   **/
  public void setChartVersion(String chartVersion) {
    this.chartVersion = chartVersion;
  }

  /**
   * Getter for overrides.
   * Escaped JSON overrides for the deployment&#39;s properties.
   **/
  @JsonProperty("overrides")
  public String getOverrides() {
    return overrides;
  }

  /**
   * Setter for overrides.
   * Escaped JSON overrides for the deployment&#39;s properties.
   **/
  public void setOverrides(String overrides) {
    this.overrides = overrides;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDeploymentRequest upgradeDeploymentRequest = (UpgradeDeploymentRequest) o;
    if (!Objects.equals(this.clusterCrn, upgradeDeploymentRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.namespace, upgradeDeploymentRequest.namespace)) {
      return false;
    }
    if (!Objects.equals(this.name, upgradeDeploymentRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.chartVersion, upgradeDeploymentRequest.chartVersion)) {
      return false;
    }
    if (!Objects.equals(this.overrides, upgradeDeploymentRequest.overrides)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, namespace, name, chartVersion, overrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDeploymentRequest {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chartVersion: ").append(toIndentedString(chartVersion)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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

