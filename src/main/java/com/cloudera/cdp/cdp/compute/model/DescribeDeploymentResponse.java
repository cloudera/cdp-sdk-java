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
import com.cloudera.cdp.compute.model.Deployment;
import com.cloudera.cdp.compute.model.History;
import java.util.*;

/**
 * Response structure for describing a deployment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:28.434-08:00")
public class DescribeDeploymentResponse extends CdpResponse {

  /**
   * Deployment details.
   **/
  private Deployment deployment = null;

  /**
   * History of the deployment.
   **/
  private List<History> history = new ArrayList<History>();

  /**
   * Escaped JSON overrides for the deployment's properties. Deprecated.
   **/
  private String overrides = null;

  /**
   * Getter for deployment.
   * Deployment details.
   **/
  @JsonProperty("deployment")
  public Deployment getDeployment() {
    return deployment;
  }

  /**
   * Setter for deployment.
   * Deployment details.
   **/
  public void setDeployment(Deployment deployment) {
    this.deployment = deployment;
  }

  /**
   * Getter for history.
   * History of the deployment.
   **/
  @JsonProperty("history")
  public List<History> getHistory() {
    return history;
  }

  /**
   * Setter for history.
   * History of the deployment.
   **/
  public void setHistory(List<History> history) {
    this.history = history;
  }

  /**
   * Getter for overrides.
   * Escaped JSON overrides for the deployment&#39;s properties. Deprecated.
   **/
  @Deprecated
  @JsonProperty("overrides")
  public String getOverrides() {
    return overrides;
  }

  /**
   * Setter for overrides.
   * Escaped JSON overrides for the deployment&#39;s properties. Deprecated.
   **/
  @Deprecated
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
    DescribeDeploymentResponse describeDeploymentResponse = (DescribeDeploymentResponse) o;
    if (!Objects.equals(this.deployment, describeDeploymentResponse.deployment)) {
      return false;
    }
    if (!Objects.equals(this.history, describeDeploymentResponse.history)) {
      return false;
    }
    if (!Objects.equals(this.overrides, describeDeploymentResponse.overrides)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, history, overrides, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDeploymentResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

