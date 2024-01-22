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

package com.cloudera.cdp.consumption.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Record of compute usage values aggregated hourly.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-19T13:24:36.778-08:00")
public class ComputeUsageRecord  {

  /**
   * Type of usage by the cluster (Eg: INSTANCE_USAGE, COMPUTE_USAGE).
   **/
  private String quantityType = null;

  /**
   * Name of the environment.
   **/
  private String environmentName = null;

  /**
   * CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * Name of the cluster.
   **/
  private String clusterName = null;

  /**
   * CRN of the cluster.
   **/
  private String clusterCrn = null;

  /**
   * Cloud Provider on which cluster is running.
   **/
  private String cloudProvider = null;

  /**
   * Service Feature of the cluster.
   **/
  private String serviceFeature = null;

  /**
   * Timestamp of start of the usage.
   **/
  private String usageStartTimestamp = null;

  /**
   * Timestamp of end of the usage.
   **/
  private String usageEndTimestamp = null;

  /**
   * Quantity of usage of the cluster.
   **/
  private Double quantity = null;

  /**
   * Number of credits consumed by this usage.
   **/
  private Double grossCharge = null;

  /**
   * Rate in credits at which usage is charged for given cluster type, instance type and cloud provider.
   **/
  private Double listRate = null;

  /**
   * Total number of hours for which instances were running.
   **/
  private Double hours = null;

  /**
   * Type of instance of the cluster.
   **/
  private String instanceType = null;

  /**
   * Total number of instances in the cluster which were in use.
   **/
  private Integer instanceCount = null;

  /**
   * Type of the cluster.
   **/
  private String clusterType = null;

  /**
   * The tags assigned to a cluster. The format of this is a map serialized into a string as json. e.g.:  \"tags\": \"{\\\"key1\\\":\\\"value1\\\",\\\"key2\\\":\\\"value2\\\"}\"
   **/
  private String userTags = null;

  /**
   * The template with which the cluster is created.
   **/
  private String clusterTemplate = null;

  /**
   * Getter for quantityType.
   * Type of usage by the cluster (Eg: INSTANCE_USAGE, COMPUTE_USAGE).
   **/
  @JsonProperty("quantityType")
  public String getQuantityType() {
    return quantityType;
  }

  /**
   * Setter for quantityType.
   * Type of usage by the cluster (Eg: INSTANCE_USAGE, COMPUTE_USAGE).
   **/
  public void setQuantityType(String quantityType) {
    this.quantityType = quantityType;
  }

  /**
   * Getter for environmentName.
   * Name of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Name of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for environmentCrn.
   * CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for clusterName.
   * Name of the cluster.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * Name of the cluster.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for clusterCrn.
   * CRN of the cluster.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * CRN of the cluster.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for cloudProvider.
   * Cloud Provider on which cluster is running.
   **/
  @JsonProperty("cloudProvider")
  public String getCloudProvider() {
    return cloudProvider;
  }

  /**
   * Setter for cloudProvider.
   * Cloud Provider on which cluster is running.
   **/
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  /**
   * Getter for serviceFeature.
   * Service Feature of the cluster.
   **/
  @JsonProperty("serviceFeature")
  public String getServiceFeature() {
    return serviceFeature;
  }

  /**
   * Setter for serviceFeature.
   * Service Feature of the cluster.
   **/
  public void setServiceFeature(String serviceFeature) {
    this.serviceFeature = serviceFeature;
  }

  /**
   * Getter for usageStartTimestamp.
   * Timestamp of start of the usage.
   **/
  @JsonProperty("usageStartTimestamp")
  public String getUsageStartTimestamp() {
    return usageStartTimestamp;
  }

  /**
   * Setter for usageStartTimestamp.
   * Timestamp of start of the usage.
   **/
  public void setUsageStartTimestamp(String usageStartTimestamp) {
    this.usageStartTimestamp = usageStartTimestamp;
  }

  /**
   * Getter for usageEndTimestamp.
   * Timestamp of end of the usage.
   **/
  @JsonProperty("usageEndTimestamp")
  public String getUsageEndTimestamp() {
    return usageEndTimestamp;
  }

  /**
   * Setter for usageEndTimestamp.
   * Timestamp of end of the usage.
   **/
  public void setUsageEndTimestamp(String usageEndTimestamp) {
    this.usageEndTimestamp = usageEndTimestamp;
  }

  /**
   * Getter for quantity.
   * Quantity of usage of the cluster.
   **/
  @JsonProperty("quantity")
  public Double getQuantity() {
    return quantity;
  }

  /**
   * Setter for quantity.
   * Quantity of usage of the cluster.
   **/
  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  /**
   * Getter for grossCharge.
   * Number of credits consumed by this usage.
   **/
  @JsonProperty("grossCharge")
  public Double getGrossCharge() {
    return grossCharge;
  }

  /**
   * Setter for grossCharge.
   * Number of credits consumed by this usage.
   **/
  public void setGrossCharge(Double grossCharge) {
    this.grossCharge = grossCharge;
  }

  /**
   * Getter for listRate.
   * Rate in credits at which usage is charged for given cluster type, instance type and cloud provider.
   **/
  @JsonProperty("listRate")
  public Double getListRate() {
    return listRate;
  }

  /**
   * Setter for listRate.
   * Rate in credits at which usage is charged for given cluster type, instance type and cloud provider.
   **/
  public void setListRate(Double listRate) {
    this.listRate = listRate;
  }

  /**
   * Getter for hours.
   * Total number of hours for which instances were running.
   **/
  @JsonProperty("hours")
  public Double getHours() {
    return hours;
  }

  /**
   * Setter for hours.
   * Total number of hours for which instances were running.
   **/
  public void setHours(Double hours) {
    this.hours = hours;
  }

  /**
   * Getter for instanceType.
   * Type of instance of the cluster.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * Type of instance of the cluster.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for instanceCount.
   * Total number of instances in the cluster which were in use.
   **/
  @JsonProperty("instanceCount")
  public Integer getInstanceCount() {
    return instanceCount;
  }

  /**
   * Setter for instanceCount.
   * Total number of instances in the cluster which were in use.
   **/
  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  /**
   * Getter for clusterType.
   * Type of the cluster.
   **/
  @JsonProperty("clusterType")
  public String getClusterType() {
    return clusterType;
  }

  /**
   * Setter for clusterType.
   * Type of the cluster.
   **/
  public void setClusterType(String clusterType) {
    this.clusterType = clusterType;
  }

  /**
   * Getter for userTags.
   * The tags assigned to a cluster. The format of this is a map serialized into a string as json. e.g.:  \&quot;tags\&quot;: \&quot;{\\\&quot;key1\\\&quot;:\\\&quot;value1\\\&quot;,\\\&quot;key2\\\&quot;:\\\&quot;value2\\\&quot;}\&quot;
   **/
  @JsonProperty("userTags")
  public String getUserTags() {
    return userTags;
  }

  /**
   * Setter for userTags.
   * The tags assigned to a cluster. The format of this is a map serialized into a string as json. e.g.:  \&quot;tags\&quot;: \&quot;{\\\&quot;key1\\\&quot;:\\\&quot;value1\\\&quot;,\\\&quot;key2\\\&quot;:\\\&quot;value2\\\&quot;}\&quot;
   **/
  public void setUserTags(String userTags) {
    this.userTags = userTags;
  }

  /**
   * Getter for clusterTemplate.
   * The template with which the cluster is created.
   **/
  @JsonProperty("clusterTemplate")
  public String getClusterTemplate() {
    return clusterTemplate;
  }

  /**
   * Setter for clusterTemplate.
   * The template with which the cluster is created.
   **/
  public void setClusterTemplate(String clusterTemplate) {
    this.clusterTemplate = clusterTemplate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeUsageRecord computeUsageRecord = (ComputeUsageRecord) o;
    if (!Objects.equals(this.quantityType, computeUsageRecord.quantityType)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, computeUsageRecord.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, computeUsageRecord.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterName, computeUsageRecord.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, computeUsageRecord.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.cloudProvider, computeUsageRecord.cloudProvider)) {
      return false;
    }
    if (!Objects.equals(this.serviceFeature, computeUsageRecord.serviceFeature)) {
      return false;
    }
    if (!Objects.equals(this.usageStartTimestamp, computeUsageRecord.usageStartTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.usageEndTimestamp, computeUsageRecord.usageEndTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.quantity, computeUsageRecord.quantity)) {
      return false;
    }
    if (!Objects.equals(this.grossCharge, computeUsageRecord.grossCharge)) {
      return false;
    }
    if (!Objects.equals(this.listRate, computeUsageRecord.listRate)) {
      return false;
    }
    if (!Objects.equals(this.hours, computeUsageRecord.hours)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, computeUsageRecord.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.instanceCount, computeUsageRecord.instanceCount)) {
      return false;
    }
    if (!Objects.equals(this.clusterType, computeUsageRecord.clusterType)) {
      return false;
    }
    if (!Objects.equals(this.userTags, computeUsageRecord.userTags)) {
      return false;
    }
    if (!Objects.equals(this.clusterTemplate, computeUsageRecord.clusterTemplate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityType, environmentName, environmentCrn, clusterName, clusterCrn, cloudProvider, serviceFeature, usageStartTimestamp, usageEndTimestamp, quantity, grossCharge, listRate, hours, instanceType, instanceCount, clusterType, userTags, clusterTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeUsageRecord {\n");
    sb.append("    quantityType: ").append(toIndentedString(quantityType)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    serviceFeature: ").append(toIndentedString(serviceFeature)).append("\n");
    sb.append("    usageStartTimestamp: ").append(toIndentedString(usageStartTimestamp)).append("\n");
    sb.append("    usageEndTimestamp: ").append(toIndentedString(usageEndTimestamp)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    grossCharge: ").append(toIndentedString(grossCharge)).append("\n");
    sb.append("    listRate: ").append(toIndentedString(listRate)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
    sb.append("    clusterTemplate: ").append(toIndentedString(clusterTemplate)).append("\n");
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

