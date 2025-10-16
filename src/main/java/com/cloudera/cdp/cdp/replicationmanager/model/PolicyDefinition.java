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
import com.cloudera.cdp.replicationmanager.model.CmPolicySubmitUser;
import com.cloudera.cdp.replicationmanager.model.SourceDataset;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Policy creation request definition.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:49.407-07:00")
public class PolicyDefinition  {

  /**
   * Name of the new policy.
   **/
  private String name = null;

  /**
   * Policy replication type.
   **/
  private String type = null;

  /**
   * Source dataset to replicate.
   **/
  private SourceDataset sourceDataset = null;

  /**
   * Policy's frequency in seconds.
   **/
  private Long frequencyInSec = null;

  /**
   * Dataset to replicate to.
   **/
  private String targetDataset = null;

  /**
   * Cloud credentials to use if replicating to Cloud.
   **/
  private String cloudCredential = null;

  /**
   * Name of source cluster in the format: \"dataCenterName$cluster name\", for example \"DC-Europe$My Source 42.
   **/
  private String sourceCluster = null;

  /**
   * Name of destination cluster in the format: \"dataCenterName$cluster name\", for example \"DC-US$My Destination 17\".
   **/
  private String targetCluster = null;

  /**
   * Start time.
   **/
  private ZonedDateTime startTime = null;

  /**
   * End time.
   **/
  private ZonedDateTime endTime = null;

  /**
   * Maximum Map jobs to use for replication.
   **/
  private Long distcpMaxMaps = null;

  /**
   * Maximum bandwidth to use for replication.
   **/
  private Long distcpMapBandwidth = null;

  /**
   * YARN queue name if not default.
   **/
  private String queueName = null;

  /**
   * TDE same key.
   **/
  private Boolean tdeSameKey = null;

  /**
   * Description of the policy.
   **/
  private String description = null;

  /**
   * Enable snapshot based replication.
   **/
  private Boolean enableSnapshotBasedReplication = null;

  /**
   * The type of cloud encryption algorithm. Can be used only for HDP/Ambari managed clusters. Supported values are AES256,SSE-KMS.
   **/
  private String cloudEncryptionAlgorithm = null;

  /**
   * Cloud encryption key.
   **/
  private String cloudEncryptionKey = null;

  /**
   * Plugins.
   **/
  private List<String> plugins = null;

  /**
   * Hive external table base directory.
   **/
  private String hiveExternalTableBaseDirectory = null;

  /**
   * CM policy submit user.
   **/
  private CmPolicySubmitUser cmPolicySubmitUser = null;

  /**
   * Getter for name.
   * Name of the new policy.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the new policy.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for type.
   * Policy replication type.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * Policy replication type.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for sourceDataset.
   * Source dataset to replicate.
   **/
  @JsonProperty("sourceDataset")
  public SourceDataset getSourceDataset() {
    return sourceDataset;
  }

  /**
   * Setter for sourceDataset.
   * Source dataset to replicate.
   **/
  public void setSourceDataset(SourceDataset sourceDataset) {
    this.sourceDataset = sourceDataset;
  }

  /**
   * Getter for frequencyInSec.
   * Policy&#39;s frequency in seconds.
   **/
  @JsonProperty("frequencyInSec")
  public Long getFrequencyInSec() {
    return frequencyInSec;
  }

  /**
   * Setter for frequencyInSec.
   * Policy&#39;s frequency in seconds.
   **/
  public void setFrequencyInSec(Long frequencyInSec) {
    this.frequencyInSec = frequencyInSec;
  }

  /**
   * Getter for targetDataset.
   * Dataset to replicate to.
   **/
  @JsonProperty("targetDataset")
  public String getTargetDataset() {
    return targetDataset;
  }

  /**
   * Setter for targetDataset.
   * Dataset to replicate to.
   **/
  public void setTargetDataset(String targetDataset) {
    this.targetDataset = targetDataset;
  }

  /**
   * Getter for cloudCredential.
   * Cloud credentials to use if replicating to Cloud.
   **/
  @JsonProperty("cloudCredential")
  public String getCloudCredential() {
    return cloudCredential;
  }

  /**
   * Setter for cloudCredential.
   * Cloud credentials to use if replicating to Cloud.
   **/
  public void setCloudCredential(String cloudCredential) {
    this.cloudCredential = cloudCredential;
  }

  /**
   * Getter for sourceCluster.
   * Name of source cluster in the format: \&quot;dataCenterName$cluster name\&quot;, for example \&quot;DC-Europe$My Source 42.
   **/
  @JsonProperty("sourceCluster")
  public String getSourceCluster() {
    return sourceCluster;
  }

  /**
   * Setter for sourceCluster.
   * Name of source cluster in the format: \&quot;dataCenterName$cluster name\&quot;, for example \&quot;DC-Europe$My Source 42.
   **/
  public void setSourceCluster(String sourceCluster) {
    this.sourceCluster = sourceCluster;
  }

  /**
   * Getter for targetCluster.
   * Name of destination cluster in the format: \&quot;dataCenterName$cluster name\&quot;, for example \&quot;DC-US$My Destination 17\&quot;.
   **/
  @JsonProperty("targetCluster")
  public String getTargetCluster() {
    return targetCluster;
  }

  /**
   * Setter for targetCluster.
   * Name of destination cluster in the format: \&quot;dataCenterName$cluster name\&quot;, for example \&quot;DC-US$My Destination 17\&quot;.
   **/
  public void setTargetCluster(String targetCluster) {
    this.targetCluster = targetCluster;
  }

  /**
   * Getter for startTime.
   * Start time.
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Start time.
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * End time.
   **/
  @JsonProperty("endTime")
  public ZonedDateTime getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * End time.
   **/
  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for distcpMaxMaps.
   * Maximum Map jobs to use for replication.
   **/
  @JsonProperty("distcpMaxMaps")
  public Long getDistcpMaxMaps() {
    return distcpMaxMaps;
  }

  /**
   * Setter for distcpMaxMaps.
   * Maximum Map jobs to use for replication.
   **/
  public void setDistcpMaxMaps(Long distcpMaxMaps) {
    this.distcpMaxMaps = distcpMaxMaps;
  }

  /**
   * Getter for distcpMapBandwidth.
   * Maximum bandwidth to use for replication.
   **/
  @JsonProperty("distcpMapBandwidth")
  public Long getDistcpMapBandwidth() {
    return distcpMapBandwidth;
  }

  /**
   * Setter for distcpMapBandwidth.
   * Maximum bandwidth to use for replication.
   **/
  public void setDistcpMapBandwidth(Long distcpMapBandwidth) {
    this.distcpMapBandwidth = distcpMapBandwidth;
  }

  /**
   * Getter for queueName.
   * YARN queue name if not default.
   **/
  @JsonProperty("queueName")
  public String getQueueName() {
    return queueName;
  }

  /**
   * Setter for queueName.
   * YARN queue name if not default.
   **/
  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  /**
   * Getter for tdeSameKey.
   * TDE same key.
   **/
  @JsonProperty("tdeSameKey")
  public Boolean getTdeSameKey() {
    return tdeSameKey;
  }

  /**
   * Setter for tdeSameKey.
   * TDE same key.
   **/
  public void setTdeSameKey(Boolean tdeSameKey) {
    this.tdeSameKey = tdeSameKey;
  }

  /**
   * Getter for description.
   * Description of the policy.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the policy.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for enableSnapshotBasedReplication.
   * Enable snapshot based replication.
   **/
  @JsonProperty("enableSnapshotBasedReplication")
  public Boolean getEnableSnapshotBasedReplication() {
    return enableSnapshotBasedReplication;
  }

  /**
   * Setter for enableSnapshotBasedReplication.
   * Enable snapshot based replication.
   **/
  public void setEnableSnapshotBasedReplication(Boolean enableSnapshotBasedReplication) {
    this.enableSnapshotBasedReplication = enableSnapshotBasedReplication;
  }

  /**
   * Getter for cloudEncryptionAlgorithm.
   * The type of cloud encryption algorithm. Can be used only for HDP/Ambari managed clusters. Supported values are AES256,SSE-KMS.
   **/
  @JsonProperty("cloudEncryptionAlgorithm")
  public String getCloudEncryptionAlgorithm() {
    return cloudEncryptionAlgorithm;
  }

  /**
   * Setter for cloudEncryptionAlgorithm.
   * The type of cloud encryption algorithm. Can be used only for HDP/Ambari managed clusters. Supported values are AES256,SSE-KMS.
   **/
  public void setCloudEncryptionAlgorithm(String cloudEncryptionAlgorithm) {
    this.cloudEncryptionAlgorithm = cloudEncryptionAlgorithm;
  }

  /**
   * Getter for cloudEncryptionKey.
   * Cloud encryption key.
   **/
  @JsonProperty("cloudEncryptionKey")
  public String getCloudEncryptionKey() {
    return cloudEncryptionKey;
  }

  /**
   * Setter for cloudEncryptionKey.
   * Cloud encryption key.
   **/
  public void setCloudEncryptionKey(String cloudEncryptionKey) {
    this.cloudEncryptionKey = cloudEncryptionKey;
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
   * Getter for hiveExternalTableBaseDirectory.
   * Hive external table base directory.
   **/
  @JsonProperty("hiveExternalTableBaseDirectory")
  public String getHiveExternalTableBaseDirectory() {
    return hiveExternalTableBaseDirectory;
  }

  /**
   * Setter for hiveExternalTableBaseDirectory.
   * Hive external table base directory.
   **/
  public void setHiveExternalTableBaseDirectory(String hiveExternalTableBaseDirectory) {
    this.hiveExternalTableBaseDirectory = hiveExternalTableBaseDirectory;
  }

  /**
   * Getter for cmPolicySubmitUser.
   * CM policy submit user.
   **/
  @JsonProperty("cmPolicySubmitUser")
  public CmPolicySubmitUser getCmPolicySubmitUser() {
    return cmPolicySubmitUser;
  }

  /**
   * Setter for cmPolicySubmitUser.
   * CM policy submit user.
   **/
  public void setCmPolicySubmitUser(CmPolicySubmitUser cmPolicySubmitUser) {
    this.cmPolicySubmitUser = cmPolicySubmitUser;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyDefinition policyDefinition = (PolicyDefinition) o;
    if (!Objects.equals(this.name, policyDefinition.name)) {
      return false;
    }
    if (!Objects.equals(this.type, policyDefinition.type)) {
      return false;
    }
    if (!Objects.equals(this.sourceDataset, policyDefinition.sourceDataset)) {
      return false;
    }
    if (!Objects.equals(this.frequencyInSec, policyDefinition.frequencyInSec)) {
      return false;
    }
    if (!Objects.equals(this.targetDataset, policyDefinition.targetDataset)) {
      return false;
    }
    if (!Objects.equals(this.cloudCredential, policyDefinition.cloudCredential)) {
      return false;
    }
    if (!Objects.equals(this.sourceCluster, policyDefinition.sourceCluster)) {
      return false;
    }
    if (!Objects.equals(this.targetCluster, policyDefinition.targetCluster)) {
      return false;
    }
    if (!Objects.equals(this.startTime, policyDefinition.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, policyDefinition.endTime)) {
      return false;
    }
    if (!Objects.equals(this.distcpMaxMaps, policyDefinition.distcpMaxMaps)) {
      return false;
    }
    if (!Objects.equals(this.distcpMapBandwidth, policyDefinition.distcpMapBandwidth)) {
      return false;
    }
    if (!Objects.equals(this.queueName, policyDefinition.queueName)) {
      return false;
    }
    if (!Objects.equals(this.tdeSameKey, policyDefinition.tdeSameKey)) {
      return false;
    }
    if (!Objects.equals(this.description, policyDefinition.description)) {
      return false;
    }
    if (!Objects.equals(this.enableSnapshotBasedReplication, policyDefinition.enableSnapshotBasedReplication)) {
      return false;
    }
    if (!Objects.equals(this.cloudEncryptionAlgorithm, policyDefinition.cloudEncryptionAlgorithm)) {
      return false;
    }
    if (!Objects.equals(this.cloudEncryptionKey, policyDefinition.cloudEncryptionKey)) {
      return false;
    }
    if (!Objects.equals(this.plugins, policyDefinition.plugins)) {
      return false;
    }
    if (!Objects.equals(this.hiveExternalTableBaseDirectory, policyDefinition.hiveExternalTableBaseDirectory)) {
      return false;
    }
    if (!Objects.equals(this.cmPolicySubmitUser, policyDefinition.cmPolicySubmitUser)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, sourceDataset, frequencyInSec, targetDataset, cloudCredential, sourceCluster, targetCluster, startTime, endTime, distcpMaxMaps, distcpMapBandwidth, queueName, tdeSameKey, description, enableSnapshotBasedReplication, cloudEncryptionAlgorithm, cloudEncryptionKey, plugins, hiveExternalTableBaseDirectory, cmPolicySubmitUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyDefinition {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceDataset: ").append(toIndentedString(sourceDataset)).append("\n");
    sb.append("    frequencyInSec: ").append(toIndentedString(frequencyInSec)).append("\n");
    sb.append("    targetDataset: ").append(toIndentedString(targetDataset)).append("\n");
    sb.append("    cloudCredential: ").append(toIndentedString(cloudCredential)).append("\n");
    sb.append("    sourceCluster: ").append(toIndentedString(sourceCluster)).append("\n");
    sb.append("    targetCluster: ").append(toIndentedString(targetCluster)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    distcpMaxMaps: ").append(toIndentedString(distcpMaxMaps)).append("\n");
    sb.append("    distcpMapBandwidth: ").append(toIndentedString(distcpMapBandwidth)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    tdeSameKey: ").append(toIndentedString(tdeSameKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableSnapshotBasedReplication: ").append(toIndentedString(enableSnapshotBasedReplication)).append("\n");
    sb.append("    cloudEncryptionAlgorithm: ").append(toIndentedString(cloudEncryptionAlgorithm)).append("\n");
    sb.append("    cloudEncryptionKey: ").append(toIndentedString(cloudEncryptionKey)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    hiveExternalTableBaseDirectory: ").append(toIndentedString(hiveExternalTableBaseDirectory)).append("\n");
    sb.append("    cmPolicySubmitUser: ").append(toIndentedString(cmPolicySubmitUser)).append("\n");
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

