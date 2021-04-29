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
import com.cloudera.cdp.datahub.model.AutoScalePolicyResponse;
import java.util.*;

/**
 * Autoscale configuration
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-29T14:24:29.883-07:00")
public class AutoScaleRulesResponse extends CdpResponse {

  /**
   * The name or CRN of the cluster.
   **/
  private String clusterName = null;

  /**
   * Whether autoscaling is enabled or not for the cluster
   **/
  private Boolean enabled = null;

  /**
   * The actual scaling policy(ies) for the cluster
   **/
  private List<AutoScalePolicyResponse> autoScalePolicies = new ArrayList<AutoScalePolicyResponse>();

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
   * Whether autoscaling is enabled or not for the cluster
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Whether autoscaling is enabled or not for the cluster
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for autoScalePolicies.
   * The actual scaling policy(ies) for the cluster
   **/
  @JsonProperty("autoScalePolicies")
  public List<AutoScalePolicyResponse> getAutoScalePolicies() {
    return autoScalePolicies;
  }

  /**
   * Setter for autoScalePolicies.
   * The actual scaling policy(ies) for the cluster
   **/
  public void setAutoScalePolicies(List<AutoScalePolicyResponse> autoScalePolicies) {
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
    AutoScaleRulesResponse autoScaleRulesResponse = (AutoScaleRulesResponse) o;
    if (!Objects.equals(this.clusterName, autoScaleRulesResponse.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.enabled, autoScaleRulesResponse.enabled)) {
      return false;
    }
    if (!Objects.equals(this.autoScalePolicies, autoScaleRulesResponse.autoScalePolicies)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, enabled, autoScalePolicies, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleRulesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

