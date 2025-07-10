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
import com.cloudera.cdp.dw.model.AwsOptionsNonTransparentProxyResponse;
import java.util.*;

/**
 * Response object of the cluster AWS settings.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:11.491-07:00")
public class AwsOptionsResponse extends CdpResponse {

  /**
   * IDs of AWS subnets where the cluster has been deployed.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * IDs of AWS subnets where the cluster worker nodes should be deployed.
   **/
  private List<String> workerSubnetIds = new ArrayList<String>();

  /**
   * IDs of AWS subnets where the cluster load balancer should be deployed.
   **/
  private List<String> lbSubnetIds = new ArrayList<String>();

  /**
   * List of availability zones that the cluster is restricted to use.
   **/
  private List<String> availabilityZones = new ArrayList<String>();

  /**
   * Id of the Custom Amazon Machine Image
   **/
  private String customAmiId = null;

  /**
   * Denotes whether the Reduced Permission mode is enabled.
   **/
  private Boolean reducedPermissionMode = null;

  /**
   * Non-transparent proxy settings.
   **/
  private AwsOptionsNonTransparentProxyResponse nonTransparentProxy = null;

  /**
   * Getter for subnetIds.
   * IDs of AWS subnets where the cluster has been deployed.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * IDs of AWS subnets where the cluster has been deployed.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  /**
   * Getter for workerSubnetIds.
   * IDs of AWS subnets where the cluster worker nodes should be deployed.
   **/
  @JsonProperty("workerSubnetIds")
  public List<String> getWorkerSubnetIds() {
    return workerSubnetIds;
  }

  /**
   * Setter for workerSubnetIds.
   * IDs of AWS subnets where the cluster worker nodes should be deployed.
   **/
  public void setWorkerSubnetIds(List<String> workerSubnetIds) {
    this.workerSubnetIds = workerSubnetIds;
  }

  /**
   * Getter for lbSubnetIds.
   * IDs of AWS subnets where the cluster load balancer should be deployed.
   **/
  @JsonProperty("lbSubnetIds")
  public List<String> getLbSubnetIds() {
    return lbSubnetIds;
  }

  /**
   * Setter for lbSubnetIds.
   * IDs of AWS subnets where the cluster load balancer should be deployed.
   **/
  public void setLbSubnetIds(List<String> lbSubnetIds) {
    this.lbSubnetIds = lbSubnetIds;
  }

  /**
   * Getter for availabilityZones.
   * List of availability zones that the cluster is restricted to use.
   **/
  @JsonProperty("availabilityZones")
  public List<String> getAvailabilityZones() {
    return availabilityZones;
  }

  /**
   * Setter for availabilityZones.
   * List of availability zones that the cluster is restricted to use.
   **/
  public void setAvailabilityZones(List<String> availabilityZones) {
    this.availabilityZones = availabilityZones;
  }

  /**
   * Getter for customAmiId.
   * Id of the Custom Amazon Machine Image
   **/
  @JsonProperty("customAmiId")
  public String getCustomAmiId() {
    return customAmiId;
  }

  /**
   * Setter for customAmiId.
   * Id of the Custom Amazon Machine Image
   **/
  public void setCustomAmiId(String customAmiId) {
    this.customAmiId = customAmiId;
  }

  /**
   * Getter for reducedPermissionMode.
   * Denotes whether the Reduced Permission mode is enabled.
   **/
  @JsonProperty("reducedPermissionMode")
  public Boolean getReducedPermissionMode() {
    return reducedPermissionMode;
  }

  /**
   * Setter for reducedPermissionMode.
   * Denotes whether the Reduced Permission mode is enabled.
   **/
  public void setReducedPermissionMode(Boolean reducedPermissionMode) {
    this.reducedPermissionMode = reducedPermissionMode;
  }

  /**
   * Getter for nonTransparentProxy.
   * Non-transparent proxy settings.
   **/
  @JsonProperty("nonTransparentProxy")
  public AwsOptionsNonTransparentProxyResponse getNonTransparentProxy() {
    return nonTransparentProxy;
  }

  /**
   * Setter for nonTransparentProxy.
   * Non-transparent proxy settings.
   **/
  public void setNonTransparentProxy(AwsOptionsNonTransparentProxyResponse nonTransparentProxy) {
    this.nonTransparentProxy = nonTransparentProxy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsOptionsResponse awsOptionsResponse = (AwsOptionsResponse) o;
    if (!Objects.equals(this.subnetIds, awsOptionsResponse.subnetIds)) {
      return false;
    }
    if (!Objects.equals(this.workerSubnetIds, awsOptionsResponse.workerSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.lbSubnetIds, awsOptionsResponse.lbSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZones, awsOptionsResponse.availabilityZones)) {
      return false;
    }
    if (!Objects.equals(this.customAmiId, awsOptionsResponse.customAmiId)) {
      return false;
    }
    if (!Objects.equals(this.reducedPermissionMode, awsOptionsResponse.reducedPermissionMode)) {
      return false;
    }
    if (!Objects.equals(this.nonTransparentProxy, awsOptionsResponse.nonTransparentProxy)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetIds, workerSubnetIds, lbSubnetIds, availabilityZones, customAmiId, reducedPermissionMode, nonTransparentProxy, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    workerSubnetIds: ").append(toIndentedString(workerSubnetIds)).append("\n");
    sb.append("    lbSubnetIds: ").append(toIndentedString(lbSubnetIds)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    customAmiId: ").append(toIndentedString(customAmiId)).append("\n");
    sb.append("    reducedPermissionMode: ").append(toIndentedString(reducedPermissionMode)).append("\n");
    sb.append("    nonTransparentProxy: ").append(toIndentedString(nonTransparentProxy)).append("\n");
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

