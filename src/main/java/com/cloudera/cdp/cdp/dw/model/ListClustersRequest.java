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

/**
 * Request object for the listClusters method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:26.077-07:00")
public class ListClustersRequest  {

  /**
   * Filter returned clusters for the belonging Environment CRN.
   **/
  private String environmentCrn = null;

  /**
   * Filter returned clusters by cluster ID.
   **/
  private String clusterId = null;

  /**
   * Filter returned clusters by name.
   **/
  private String name = null;

  /**
   * Filter returned clusters by cluster status.
   **/
  private String status = null;

  /**
   * Filter returned clusters by hosting platform.
   **/
  private String cloudPlatform = null;

  /**
   * Getter for environmentCrn.
   * Filter returned clusters for the belonging Environment CRN.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * Filter returned clusters for the belonging Environment CRN.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for clusterId.
   * Filter returned clusters by cluster ID.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Filter returned clusters by cluster ID.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for name.
   * Filter returned clusters by name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Filter returned clusters by name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for status.
   * Filter returned clusters by cluster status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Filter returned clusters by cluster status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for cloudPlatform.
   * Filter returned clusters by hosting platform.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * Filter returned clusters by hosting platform.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListClustersRequest listClustersRequest = (ListClustersRequest) o;
    if (!Objects.equals(this.environmentCrn, listClustersRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, listClustersRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.name, listClustersRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.status, listClustersRequest.status)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, listClustersRequest.cloudPlatform)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, clusterId, name, status, cloudPlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListClustersRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
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

