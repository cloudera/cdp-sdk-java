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
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:44.648-07:00")
public class ListRelevantInstancesRequest  {

  /**
   * Defines the category of the instance (e.g., CPU, GPU) relevant for the query in the specified region.
   **/
  private String instanceCategory = null;

  /**
   * Specifies the requested resource inputs eg (CPU/GPU, model, memory etc).
   **/
  private RequestResourceInfo requestInfo = null;

  /**
   * Specifies the environment name of respective cloud provider for which instance support details are requested.
   **/
  private String environmentName = null;

  /**
   * Specifies the product type for which instance support details are requested.
   **/
  private String productType = null;

  /**
   * Deprecated. Please use environmentName instead, from which the region will be determined.
   **/
  private String region = null;

  /**
   * Deprecated. Please use environmentName instead, from which the cloud provider will be determined.
   **/
  private String cloudProvider = null;

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

  /**
   * Getter for environmentName.
   * Specifies the environment name of respective cloud provider for which instance support details are requested.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Specifies the environment name of respective cloud provider for which instance support details are requested.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for productType.
   * Specifies the product type for which instance support details are requested.
   **/
  @JsonProperty("productType")
  public String getProductType() {
    return productType;
  }

  /**
   * Setter for productType.
   * Specifies the product type for which instance support details are requested.
   **/
  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * Getter for region.
   * Deprecated. Please use environmentName instead, from which the region will be determined.
   **/
  @Deprecated
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Deprecated. Please use environmentName instead, from which the region will be determined.
   **/
  @Deprecated
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for cloudProvider.
   * Deprecated. Please use environmentName instead, from which the cloud provider will be determined.
   **/
  @Deprecated
  @JsonProperty("cloudProvider")
  public String getCloudProvider() {
    return cloudProvider;
  }

  /**
   * Setter for cloudProvider.
   * Deprecated. Please use environmentName instead, from which the cloud provider will be determined.
   **/
  @Deprecated
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
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
    if (!Objects.equals(this.instanceCategory, listRelevantInstancesRequest.instanceCategory)) {
      return false;
    }
    if (!Objects.equals(this.requestInfo, listRelevantInstancesRequest.requestInfo)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, listRelevantInstancesRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.productType, listRelevantInstancesRequest.productType)) {
      return false;
    }
    if (!Objects.equals(this.region, listRelevantInstancesRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.cloudProvider, listRelevantInstancesRequest.cloudProvider)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceCategory, requestInfo, environmentName, productType, region, cloudProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRelevantInstancesRequest {\n");
    sb.append("    instanceCategory: ").append(toIndentedString(instanceCategory)).append("\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
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

