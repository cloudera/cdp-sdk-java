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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.RequestResourceInfo;

/**
 * Request object for the ListRelevantInstances method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:34.535-07:00")
public class ListRelevantInstancesRequest  {

  /**
   * Specifies the name of the region for which instance support details are requested.
   **/
  private String region = null;

  /**
   * Defines the category of the instance (e.g., CPU, GPU) relevant for the query in the specified region.
   **/
  private String instanceCategory = null;

  /**
   * Identifies the cloud provider (e.g., AWS, Azure) for which to list supported instances.
   **/
  private String cloudProvider = null;

  /**
   * Specifies the requested resource inputs eg (CPU/GPU, model, memory etc).
   **/
  private RequestResourceInfo requestInfo = null;

  /**
   * Getter for region.
   * Specifies the name of the region for which instance support details are requested.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Specifies the name of the region for which instance support details are requested.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for instanceCategory.
   * Defines the category of the instance (e.g., CPU, GPU) relevant for the query in the specified region.
   **/
  @JsonProperty("instanceCategory")
  public String getInstanceCategory() {
    return instanceCategory;
  }

  /**
   * Setter for instanceCategory.
   * Defines the category of the instance (e.g., CPU, GPU) relevant for the query in the specified region.
   **/
  public void setInstanceCategory(String instanceCategory) {
    this.instanceCategory = instanceCategory;
  }

  /**
   * Getter for cloudProvider.
   * Identifies the cloud provider (e.g., AWS, Azure) for which to list supported instances.
   **/
  @JsonProperty("cloudProvider")
  public String getCloudProvider() {
    return cloudProvider;
  }

  /**
   * Setter for cloudProvider.
   * Identifies the cloud provider (e.g., AWS, Azure) for which to list supported instances.
   **/
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  /**
   * Getter for requestInfo.
   * Specifies the requested resource inputs eg (CPU/GPU, model, memory etc).
   **/
  @JsonProperty("requestInfo")
  public RequestResourceInfo getRequestInfo() {
    return requestInfo;
  }

  /**
   * Setter for requestInfo.
   * Specifies the requested resource inputs eg (CPU/GPU, model, memory etc).
   **/
  public void setRequestInfo(RequestResourceInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRelevantInstancesRequest listRelevantInstancesRequest = (ListRelevantInstancesRequest) o;
    if (!Objects.equals(this.region, listRelevantInstancesRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.instanceCategory, listRelevantInstancesRequest.instanceCategory)) {
      return false;
    }
    if (!Objects.equals(this.cloudProvider, listRelevantInstancesRequest.cloudProvider)) {
      return false;
    }
    if (!Objects.equals(this.requestInfo, listRelevantInstancesRequest.requestInfo)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, instanceCategory, cloudProvider, requestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRelevantInstancesRequest {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    instanceCategory: ").append(toIndentedString(instanceCategory)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
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

