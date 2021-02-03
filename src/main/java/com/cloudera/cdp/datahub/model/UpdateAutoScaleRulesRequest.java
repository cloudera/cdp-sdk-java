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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.AutoScalePolicyRequest;
import java.util.*;

/**
 * Autoscale Modification request
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-02-03T13:16:57.279-08:00")
public class UpdateAutoScaleRulesRequest  {

  /**
   * The name or CRN of the cluster.
   **/
  private String clusterName = null;

  /**
   * true to enable Autoscaling, false to disable AutoScaling. If not specified, the existing value is used.
   **/
  private Boolean enabled = null;

  /**
   * The actual scaling policies for the cluster
   **/
  private List<AutoScalePolicyRequest> autoScalePolicies = new ArrayList<AutoScalePolicyRequest>();

  /**
   * Getter for clusterName.
   * The name or CRN of the cluster.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name or CRN of the cluster.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for enabled.
   * true to enable Autoscaling, false to disable AutoScaling. If not specified, the existing value is used.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * true to enable Autoscaling, false to disable AutoScaling. If not specified, the existing value is used.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for autoScalePolicies.
   * The actual scaling policies for the cluster
   **/
  @JsonProperty("autoScalePolicies")
  public List<AutoScalePolicyRequest> getAutoScalePolicies() {
    return autoScalePolicies;
  }

  /**
   * Setter for autoScalePolicies.
   * The actual scaling policies for the cluster
   **/
  public void setAutoScalePolicies(List<AutoScalePolicyRequest> autoScalePolicies) {
    this.autoScalePolicies = autoScalePolicies;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAutoScaleRulesRequest updateAutoScaleRulesRequest = (UpdateAutoScaleRulesRequest) o;
    if (!Objects.equals(this.clusterName, updateAutoScaleRulesRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.enabled, updateAutoScaleRulesRequest.enabled)) {
      return false;
    }
    if (!Objects.equals(this.autoScalePolicies, updateAutoScaleRulesRequest.autoScalePolicies)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, enabled, autoScalePolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAutoScaleRulesRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    autoScalePolicies: ").append(toIndentedString(autoScalePolicies)).append("\n");
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

