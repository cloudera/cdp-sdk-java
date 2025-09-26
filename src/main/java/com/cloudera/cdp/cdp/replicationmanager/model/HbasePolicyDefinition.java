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
import com.cloudera.cdp.replicationmanager.model.HbasePolicyArguments;
import com.cloudera.cdp.replicationmanager.model.MachineUser;

/**
 * HBase policy definition.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:38.244-07:00")
public class HbasePolicyDefinition  {

  /**
   * HBase policy arguments.
   **/
  private HbasePolicyArguments hbasePolicyArguments = null;

  /**
   * Name of source cluster in the format: \"dataCenterName$cluster name\", for example \"DC-Europe$My Source 42.\"
   **/
  private String sourceCluster = null;

  /**
   * Name of destination cluster in the format: \"dataCenterName$cluster name\", for example \"DC-US$My Destination 17\".
   **/
  private String targetCluster = null;

  /**
   * If set to true, the current data in the table will be replicated before the HBase replication peer gets enabled. If set to false, only the data changed after the policy creation will be replicated.
   **/
  private Boolean initialSnapshot = null;

  /**
   * Description of the policy.
   **/
  private String description = null;

  /**
   * Machine user details to use for the replication. If not specified, an internal machine user will be created and synchronized to the required environments.
   **/
  private MachineUser machineUser = null;

  /**
   * YARN queue name to use for initial snapshot if not default.
   **/
  private String queueName = null;

  /**
   * Maximum Map jobs to use for initial snapshot.
   **/
  private Long distcpMaxMaps = null;

  /**
   * Type of restart for the source cluster. This is only accepted if the source is not a Classic Cluster and the destination has restart-type support. Default is ROLLING_RESTART.
   **/
  private String sourceRestartType = null;

  /**
   * Type of restart for the destination cluster. This is only accepted if the cluster has restart-type support. Default is ROLLING_RESTART.
   **/
  private String targetRestartType = null;

  /**
   * Getter for hbasePolicyArguments.
   * HBase policy arguments.
   **/
  @JsonProperty("hbasePolicyArguments")
  public HbasePolicyArguments getHbasePolicyArguments() {
    return hbasePolicyArguments;
  }

  /**
   * Setter for hbasePolicyArguments.
   * HBase policy arguments.
   **/
  public void setHbasePolicyArguments(HbasePolicyArguments hbasePolicyArguments) {
    this.hbasePolicyArguments = hbasePolicyArguments;
  }

  /**
   * Getter for sourceCluster.
   * Name of source cluster in the format: \&quot;dataCenterName$cluster name\&quot;, for example \&quot;DC-Europe$My Source 42.\&quot;
   **/
  @JsonProperty("sourceCluster")
  public String getSourceCluster() {
    return sourceCluster;
  }

  /**
   * Setter for sourceCluster.
   * Name of source cluster in the format: \&quot;dataCenterName$cluster name\&quot;, for example \&quot;DC-Europe$My Source 42.\&quot;
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
   * Getter for initialSnapshot.
   * If set to true, the current data in the table will be replicated before the HBase replication peer gets enabled. If set to false, only the data changed after the policy creation will be replicated.
   **/
  @JsonProperty("initialSnapshot")
  public Boolean getInitialSnapshot() {
    return initialSnapshot;
  }

  /**
   * Setter for initialSnapshot.
   * If set to true, the current data in the table will be replicated before the HBase replication peer gets enabled. If set to false, only the data changed after the policy creation will be replicated.
   **/
  public void setInitialSnapshot(Boolean initialSnapshot) {
    this.initialSnapshot = initialSnapshot;
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
   * Getter for machineUser.
   * Machine user details to use for the replication. If not specified, an internal machine user will be created and synchronized to the required environments.
   **/
  @JsonProperty("machineUser")
  public MachineUser getMachineUser() {
    return machineUser;
  }

  /**
   * Setter for machineUser.
   * Machine user details to use for the replication. If not specified, an internal machine user will be created and synchronized to the required environments.
   **/
  public void setMachineUser(MachineUser machineUser) {
    this.machineUser = machineUser;
  }

  /**
   * Getter for queueName.
   * YARN queue name to use for initial snapshot if not default.
   **/
  @JsonProperty("queueName")
  public String getQueueName() {
    return queueName;
  }

  /**
   * Setter for queueName.
   * YARN queue name to use for initial snapshot if not default.
   **/
  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  /**
   * Getter for distcpMaxMaps.
   * Maximum Map jobs to use for initial snapshot.
   **/
  @JsonProperty("distcpMaxMaps")
  public Long getDistcpMaxMaps() {
    return distcpMaxMaps;
  }

  /**
   * Setter for distcpMaxMaps.
   * Maximum Map jobs to use for initial snapshot.
   **/
  public void setDistcpMaxMaps(Long distcpMaxMaps) {
    this.distcpMaxMaps = distcpMaxMaps;
  }

  /**
   * Getter for sourceRestartType.
   * Type of restart for the source cluster. This is only accepted if the source is not a Classic Cluster and the destination has restart-type support. Default is ROLLING_RESTART.
   **/
  @JsonProperty("sourceRestartType")
  public String getSourceRestartType() {
    return sourceRestartType;
  }

  /**
   * Setter for sourceRestartType.
   * Type of restart for the source cluster. This is only accepted if the source is not a Classic Cluster and the destination has restart-type support. Default is ROLLING_RESTART.
   **/
  public void setSourceRestartType(String sourceRestartType) {
    this.sourceRestartType = sourceRestartType;
  }

  /**
   * Getter for targetRestartType.
   * Type of restart for the destination cluster. This is only accepted if the cluster has restart-type support. Default is ROLLING_RESTART.
   **/
  @JsonProperty("targetRestartType")
  public String getTargetRestartType() {
    return targetRestartType;
  }

  /**
   * Setter for targetRestartType.
   * Type of restart for the destination cluster. This is only accepted if the cluster has restart-type support. Default is ROLLING_RESTART.
   **/
  public void setTargetRestartType(String targetRestartType) {
    this.targetRestartType = targetRestartType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HbasePolicyDefinition hbasePolicyDefinition = (HbasePolicyDefinition) o;
    if (!Objects.equals(this.hbasePolicyArguments, hbasePolicyDefinition.hbasePolicyArguments)) {
      return false;
    }
    if (!Objects.equals(this.sourceCluster, hbasePolicyDefinition.sourceCluster)) {
      return false;
    }
    if (!Objects.equals(this.targetCluster, hbasePolicyDefinition.targetCluster)) {
      return false;
    }
    if (!Objects.equals(this.initialSnapshot, hbasePolicyDefinition.initialSnapshot)) {
      return false;
    }
    if (!Objects.equals(this.description, hbasePolicyDefinition.description)) {
      return false;
    }
    if (!Objects.equals(this.machineUser, hbasePolicyDefinition.machineUser)) {
      return false;
    }
    if (!Objects.equals(this.queueName, hbasePolicyDefinition.queueName)) {
      return false;
    }
    if (!Objects.equals(this.distcpMaxMaps, hbasePolicyDefinition.distcpMaxMaps)) {
      return false;
    }
    if (!Objects.equals(this.sourceRestartType, hbasePolicyDefinition.sourceRestartType)) {
      return false;
    }
    if (!Objects.equals(this.targetRestartType, hbasePolicyDefinition.targetRestartType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hbasePolicyArguments, sourceCluster, targetCluster, initialSnapshot, description, machineUser, queueName, distcpMaxMaps, sourceRestartType, targetRestartType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HbasePolicyDefinition {\n");
    sb.append("    hbasePolicyArguments: ").append(toIndentedString(hbasePolicyArguments)).append("\n");
    sb.append("    sourceCluster: ").append(toIndentedString(sourceCluster)).append("\n");
    sb.append("    targetCluster: ").append(toIndentedString(targetCluster)).append("\n");
    sb.append("    initialSnapshot: ").append(toIndentedString(initialSnapshot)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    machineUser: ").append(toIndentedString(machineUser)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    distcpMaxMaps: ").append(toIndentedString(distcpMaxMaps)).append("\n");
    sb.append("    sourceRestartType: ").append(toIndentedString(sourceRestartType)).append("\n");
    sb.append("    targetRestartType: ").append(toIndentedString(targetRestartType)).append("\n");
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

