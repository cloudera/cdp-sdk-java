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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.PolicyInstanceResponse;
import com.cloudera.cdp.replicationmanager.model.PolicyReport;
import com.cloudera.cdp.replicationmanager.model.TargetDetails;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.Map;

/**
 * Replication policy definition.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-01-04T11:10:11.417-08:00")
public class Policy  {

  /**
   * Policy id.
   **/
  private String policyId = null;

  /**
   * Policy name.
   **/
  private String name = null;

  /**
   * Policy type.
   **/
  private String type = null;

  /**
   * Current status of the policy.
   **/
  private String status = null;

  /**
   * Frequency in seconds when the policy runs.
   **/
  private Long frequency = null;

  /**
   * End time of policy run or when it repeats.
   **/
  private ZonedDateTime endTime = null;

  /**
   * List of policy runs.
   **/
  private List<PolicyInstanceResponse> jobs = new ArrayList<PolicyInstanceResponse>();

  /**
   * Policy report.
   **/
  private PolicyReport report = null;

  /**
   * Policy description.
   **/
  private String description = null;

  /**
   * Policy execution type.
   **/
  private String executionType = null;

  /**
   * Source dataset of replication.
   **/
  private List<String> sourceDataset = new ArrayList<String>();

  /**
   * Target dataset of replication.
   **/
  private List<String> targetDataset = new ArrayList<String>();

  /**
   * Policy creation time.
   **/
  private ZonedDateTime creationTime = null;

  /**
   * Policy start time.
   **/
  private ZonedDateTime startTime = null;

  /**
   * Source cluster of replication.
   **/
  private String sourceCluster = null;

  /**
   * CRN of the source cluster.
   **/
  private String sourceClusterCrn = null;

  /**
   * Target cluster of replication if not cloud.
   **/
  private String targetCluster = null;

  /**
   * CRN of the target cluster.
   **/
  private String targetClusterCrn = null;

  /**
   * Custom replication properties.
   **/
  private Map<String, String> customProperties = new HashMap<String, String>();

  /**
   * Plugins.
   **/
  private List<String> plugins = new ArrayList<String>();

  /**
   * Next expected run of the policy.
   **/
  private String nextRun = null;

  /**
   * Replication target details.
   **/
  private TargetDetails target = null;

  /**
   * Getter for policyId.
   * Policy id.
   **/
  @JsonProperty("policyId")
  public String getPolicyId() {
    return policyId;
  }

  /**
   * Setter for policyId.
   * Policy id.
   **/
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  /**
   * Getter for name.
   * Policy name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Policy name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for type.
   * Policy type.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * Policy type.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for status.
   * Current status of the policy.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Current status of the policy.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for frequency.
   * Frequency in seconds when the policy runs.
   **/
  @JsonProperty("frequency")
  public Long getFrequency() {
    return frequency;
  }

  /**
   * Setter for frequency.
   * Frequency in seconds when the policy runs.
   **/
  public void setFrequency(Long frequency) {
    this.frequency = frequency;
  }

  /**
   * Getter for endTime.
   * End time of policy run or when it repeats.
   **/
  @JsonProperty("endTime")
  public ZonedDateTime getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * End time of policy run or when it repeats.
   **/
  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for jobs.
   * List of policy runs.
   **/
  @JsonProperty("jobs")
  public List<PolicyInstanceResponse> getJobs() {
    return jobs;
  }

  /**
   * Setter for jobs.
   * List of policy runs.
   **/
  public void setJobs(List<PolicyInstanceResponse> jobs) {
    this.jobs = jobs;
  }

  /**
   * Getter for report.
   * Policy report.
   **/
  @JsonProperty("report")
  public PolicyReport getReport() {
    return report;
  }

  /**
   * Setter for report.
   * Policy report.
   **/
  public void setReport(PolicyReport report) {
    this.report = report;
  }

  /**
   * Getter for description.
   * Policy description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Policy description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for executionType.
   * Policy execution type.
   **/
  @JsonProperty("executionType")
  public String getExecutionType() {
    return executionType;
  }

  /**
   * Setter for executionType.
   * Policy execution type.
   **/
  public void setExecutionType(String executionType) {
    this.executionType = executionType;
  }

  /**
   * Getter for sourceDataset.
   * Source dataset of replication.
   **/
  @JsonProperty("sourceDataset")
  public List<String> getSourceDataset() {
    return sourceDataset;
  }

  /**
   * Setter for sourceDataset.
   * Source dataset of replication.
   **/
  public void setSourceDataset(List<String> sourceDataset) {
    this.sourceDataset = sourceDataset;
  }

  /**
   * Getter for targetDataset.
   * Target dataset of replication.
   **/
  @JsonProperty("targetDataset")
  public List<String> getTargetDataset() {
    return targetDataset;
  }

  /**
   * Setter for targetDataset.
   * Target dataset of replication.
   **/
  public void setTargetDataset(List<String> targetDataset) {
    this.targetDataset = targetDataset;
  }

  /**
   * Getter for creationTime.
   * Policy creation time.
   **/
  @JsonProperty("creationTime")
  public ZonedDateTime getCreationTime() {
    return creationTime;
  }

  /**
   * Setter for creationTime.
   * Policy creation time.
   **/
  public void setCreationTime(ZonedDateTime creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Getter for startTime.
   * Policy start time.
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Policy start time.
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for sourceCluster.
   * Source cluster of replication.
   **/
  @JsonProperty("sourceCluster")
  public String getSourceCluster() {
    return sourceCluster;
  }

  /**
   * Setter for sourceCluster.
   * Source cluster of replication.
   **/
  public void setSourceCluster(String sourceCluster) {
    this.sourceCluster = sourceCluster;
  }

  /**
   * Getter for sourceClusterCrn.
   * CRN of the source cluster.
   **/
  @JsonProperty("sourceClusterCrn")
  public String getSourceClusterCrn() {
    return sourceClusterCrn;
  }

  /**
   * Setter for sourceClusterCrn.
   * CRN of the source cluster.
   **/
  public void setSourceClusterCrn(String sourceClusterCrn) {
    this.sourceClusterCrn = sourceClusterCrn;
  }

  /**
   * Getter for targetCluster.
   * Target cluster of replication if not cloud.
   **/
  @JsonProperty("targetCluster")
  public String getTargetCluster() {
    return targetCluster;
  }

  /**
   * Setter for targetCluster.
   * Target cluster of replication if not cloud.
   **/
  public void setTargetCluster(String targetCluster) {
    this.targetCluster = targetCluster;
  }

  /**
   * Getter for targetClusterCrn.
   * CRN of the target cluster.
   **/
  @JsonProperty("targetClusterCrn")
  public String getTargetClusterCrn() {
    return targetClusterCrn;
  }

  /**
   * Setter for targetClusterCrn.
   * CRN of the target cluster.
   **/
  public void setTargetClusterCrn(String targetClusterCrn) {
    this.targetClusterCrn = targetClusterCrn;
  }

  /**
   * Getter for customProperties.
   * Custom replication properties.
   **/
  @JsonProperty("customProperties")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  /**
   * Setter for customProperties.
   * Custom replication properties.
   **/
  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  /**
   * Getter for plugins.
   * Plugins.
   **/
  @JsonProperty("plugins")
  public List<String> getPlugins() {
    return plugins;
  }

  /**
   * Setter for plugins.
   * Plugins.
   **/
  public void setPlugins(List<String> plugins) {
    this.plugins = plugins;
  }

  /**
   * Getter for nextRun.
   * Next expected run of the policy.
   **/
  @JsonProperty("nextRun")
  public String getNextRun() {
    return nextRun;
  }

  /**
   * Setter for nextRun.
   * Next expected run of the policy.
   **/
  public void setNextRun(String nextRun) {
    this.nextRun = nextRun;
  }

  /**
   * Getter for target.
   * Replication target details.
   **/
  @JsonProperty("target")
  public TargetDetails getTarget() {
    return target;
  }

  /**
   * Setter for target.
   * Replication target details.
   **/
  public void setTarget(TargetDetails target) {
    this.target = target;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    if (!Objects.equals(this.policyId, policy.policyId)) {
      return false;
    }
    if (!Objects.equals(this.name, policy.name)) {
      return false;
    }
    if (!Objects.equals(this.type, policy.type)) {
      return false;
    }
    if (!Objects.equals(this.status, policy.status)) {
      return false;
    }
    if (!Objects.equals(this.frequency, policy.frequency)) {
      return false;
    }
    if (!Objects.equals(this.endTime, policy.endTime)) {
      return false;
    }
    if (!Objects.equals(this.jobs, policy.jobs)) {
      return false;
    }
    if (!Objects.equals(this.report, policy.report)) {
      return false;
    }
    if (!Objects.equals(this.description, policy.description)) {
      return false;
    }
    if (!Objects.equals(this.executionType, policy.executionType)) {
      return false;
    }
    if (!Objects.equals(this.sourceDataset, policy.sourceDataset)) {
      return false;
    }
    if (!Objects.equals(this.targetDataset, policy.targetDataset)) {
      return false;
    }
    if (!Objects.equals(this.creationTime, policy.creationTime)) {
      return false;
    }
    if (!Objects.equals(this.startTime, policy.startTime)) {
      return false;
    }
    if (!Objects.equals(this.sourceCluster, policy.sourceCluster)) {
      return false;
    }
    if (!Objects.equals(this.sourceClusterCrn, policy.sourceClusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.targetCluster, policy.targetCluster)) {
      return false;
    }
    if (!Objects.equals(this.targetClusterCrn, policy.targetClusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.customProperties, policy.customProperties)) {
      return false;
    }
    if (!Objects.equals(this.plugins, policy.plugins)) {
      return false;
    }
    if (!Objects.equals(this.nextRun, policy.nextRun)) {
      return false;
    }
    if (!Objects.equals(this.target, policy.target)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, name, type, status, frequency, endTime, jobs, report, description, executionType, sourceDataset, targetDataset, creationTime, startTime, sourceCluster, sourceClusterCrn, targetCluster, targetClusterCrn, customProperties, plugins, nextRun, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
    sb.append("    sourceDataset: ").append(toIndentedString(sourceDataset)).append("\n");
    sb.append("    targetDataset: ").append(toIndentedString(targetDataset)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    sourceCluster: ").append(toIndentedString(sourceCluster)).append("\n");
    sb.append("    sourceClusterCrn: ").append(toIndentedString(sourceClusterCrn)).append("\n");
    sb.append("    targetCluster: ").append(toIndentedString(targetCluster)).append("\n");
    sb.append("    targetClusterCrn: ").append(toIndentedString(targetClusterCrn)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    nextRun: ").append(toIndentedString(nextRun)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

