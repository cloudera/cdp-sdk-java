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
 * Available deployment upgrade structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-06T11:00:52.383-08:00")
public class AvailableDeploymentUpgrade  {

  /**
   * The version of the components which would be installed from this deployment.
   **/
  private String applicationVersion = null;

  /**
   * The version of the deployment that is available to upgrade to.
   **/
  private String deploymentVersion = null;

  /**
   * Getter for applicationVersion.
   * The version of the components which would be installed from this deployment.
   **/
  @JsonProperty("applicationVersion")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  /**
   * Setter for applicationVersion.
   * The version of the components which would be installed from this deployment.
   **/
  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  /**
   * Getter for deploymentVersion.
   * The version of the deployment that is available to upgrade to.
   **/
  @JsonProperty("deploymentVersion")
  public String getDeploymentVersion() {
    return deploymentVersion;
  }

  /**
   * Setter for deploymentVersion.
   * The version of the deployment that is available to upgrade to.
   **/
  public void setDeploymentVersion(String deploymentVersion) {
    this.deploymentVersion = deploymentVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableDeploymentUpgrade availableDeploymentUpgrade = (AvailableDeploymentUpgrade) o;
    if (!Objects.equals(this.applicationVersion, availableDeploymentUpgrade.applicationVersion)) {
      return false;
    }
    if (!Objects.equals(this.deploymentVersion, availableDeploymentUpgrade.deploymentVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationVersion, deploymentVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableDeploymentUpgrade {\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    deploymentVersion: ").append(toIndentedString(deploymentVersion)).append("\n");
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

