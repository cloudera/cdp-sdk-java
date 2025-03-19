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
 * Deployment Profile details response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:31.556-07:00")
public class CommonDeploymentProfileDetailsResp  {

  /**
   * Deployment enable flag.
   **/
  private Boolean enabled = null;

  /**
   * Deployment profile used. Currently supported is common.
   **/
  private String deploymentProfile = null;

  /**
   * Getter for enabled.
   * Deployment enable flag.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Deployment enable flag.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for deploymentProfile.
   * Deployment profile used. Currently supported is common.
   **/
  @JsonProperty("deploymentProfile")
  public String getDeploymentProfile() {
    return deploymentProfile;
  }

  /**
   * Setter for deploymentProfile.
   * Deployment profile used. Currently supported is common.
   **/
  public void setDeploymentProfile(String deploymentProfile) {
    this.deploymentProfile = deploymentProfile;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonDeploymentProfileDetailsResp commonDeploymentProfileDetailsResp = (CommonDeploymentProfileDetailsResp) o;
    if (!Objects.equals(this.enabled, commonDeploymentProfileDetailsResp.enabled)) {
      return false;
    }
    if (!Objects.equals(this.deploymentProfile, commonDeploymentProfileDetailsResp.deploymentProfile)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, deploymentProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonDeploymentProfileDetailsResp {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    deploymentProfile: ").append(toIndentedString(deploymentProfile)).append("\n");
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

