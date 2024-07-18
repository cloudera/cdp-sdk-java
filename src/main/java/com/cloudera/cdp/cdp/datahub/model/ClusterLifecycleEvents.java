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
import com.cloudera.cdp.datahub.model.ClusterLdapDetails;
import com.cloudera.cdp.datahub.model.ClusterRdsDetails;
import java.time.ZonedDateTime;

/**
 * Related events for the stack.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-07-18T14:59:52.786-07:00")
public class ClusterLifecycleEvents  {

  /**
   * Type of the event.
   **/
  private String eventType = null;

  /**
   * Timestamp of this event.
   **/
  private ZonedDateTime eventTimestamp = null;

  /**
   * Message from this event.
   **/
  private String eventMessage = null;

  /**
   * User ID.
   **/
  private String userId = null;

  /**
   * Type of notification as identified in the UI.
   **/
  private String notificationType = null;

  /**
   * Cloud provider type.
   **/
  private String cloudType = null;

  /**
   * Cloud provider region in which the cluster is deployed.
   **/
  private String region = null;

  /**
   * Cloud provider availability zone for the region in which the cluster is deployed.
   **/
  private String availabilityZone = null;

  /**
   * Blueprint ID for the blueprint deployed on the cluster.
   **/
  private Long blueprintId = null;

  /**
   * Blueprint name for the blueprint deployed on the cluster.
   **/
  private String blueprintName = null;

  /**
   * ID of the cluster.
   **/
  private Long clusterId = null;

  /**
   * Name of the cluster.
   **/
  private String clusterName = null;

  /**
   * The unique CRN of the resource.
   **/
  private String stackCrn = null;

  /**
   * Name of the stack.
   **/
  private String stackName = null;

  /**
   * Current status of the stack.
   **/
  private String stackStatus = null;

  /**
   * Current node count for the nodes in the cluster.
   **/
  private Integer nodeCount = null;

  /**
   * Name of the instance group.
   **/
  private String instanceGroup = null;

  /**
   * Status of the cluster.
   **/
  private String clusterStatus = null;

  /**
   * Workspace ID of the resource.
   **/
  private Long workspaceId = null;

  /**
   * Name of the current tenant.
   **/
  private String tenantName = null;

  /**
   * Details of the LDAP.
   **/
  private ClusterLdapDetails ldapDetails = null;

  /**
   * Details of the RDS.
   **/
  private ClusterRdsDetails rdsDetails = null;

  /**
   * Getter for eventType.
   * Type of the event.
   **/
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  /**
   * Setter for eventType.
   * Type of the event.
   **/
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  /**
   * Getter for eventTimestamp.
   * Timestamp of this event.
   **/
  @JsonProperty("eventTimestamp")
  public ZonedDateTime getEventTimestamp() {
    return eventTimestamp;
  }

  /**
   * Setter for eventTimestamp.
   * Timestamp of this event.
   **/
  public void setEventTimestamp(ZonedDateTime eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  /**
   * Getter for eventMessage.
   * Message from this event.
   **/
  @JsonProperty("eventMessage")
  public String getEventMessage() {
    return eventMessage;
  }

  /**
   * Setter for eventMessage.
   * Message from this event.
   **/
  public void setEventMessage(String eventMessage) {
    this.eventMessage = eventMessage;
  }

  /**
   * Getter for userId.
   * User ID.
   **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   * User ID.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Getter for notificationType.
   * Type of notification as identified in the UI.
   **/
  @JsonProperty("notificationType")
  public String getNotificationType() {
    return notificationType;
  }

  /**
   * Setter for notificationType.
   * Type of notification as identified in the UI.
   **/
  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  /**
   * Getter for cloudType.
   * Cloud provider type.
   **/
  @JsonProperty("cloudType")
  public String getCloudType() {
    return cloudType;
  }

  /**
   * Setter for cloudType.
   * Cloud provider type.
   **/
  public void setCloudType(String cloudType) {
    this.cloudType = cloudType;
  }

  /**
   * Getter for region.
   * Cloud provider region in which the cluster is deployed.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Cloud provider region in which the cluster is deployed.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for availabilityZone.
   * Cloud provider availability zone for the region in which the cluster is deployed.
   **/
  @JsonProperty("availabilityZone")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * Setter for availabilityZone.
   * Cloud provider availability zone for the region in which the cluster is deployed.
   **/
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * Getter for blueprintId.
   * Blueprint ID for the blueprint deployed on the cluster.
   **/
  @JsonProperty("blueprintId")
  public Long getBlueprintId() {
    return blueprintId;
  }

  /**
   * Setter for blueprintId.
   * Blueprint ID for the blueprint deployed on the cluster.
   **/
  public void setBlueprintId(Long blueprintId) {
    this.blueprintId = blueprintId;
  }

  /**
   * Getter for blueprintName.
   * Blueprint name for the blueprint deployed on the cluster.
   **/
  @JsonProperty("blueprintName")
  public String getBlueprintName() {
    return blueprintName;
  }

  /**
   * Setter for blueprintName.
   * Blueprint name for the blueprint deployed on the cluster.
   **/
  public void setBlueprintName(String blueprintName) {
    this.blueprintName = blueprintName;
  }

  /**
   * Getter for clusterId.
   * ID of the cluster.
   **/
  @JsonProperty("clusterId")
  public Long getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of the cluster.
   **/
  public void setClusterId(Long clusterId) {
    this.clusterId = clusterId;
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
   * Getter for stackCrn.
   * The unique CRN of the resource.
   **/
  @JsonProperty("stackCrn")
  public String getStackCrn() {
    return stackCrn;
  }

  /**
   * Setter for stackCrn.
   * The unique CRN of the resource.
   **/
  public void setStackCrn(String stackCrn) {
    this.stackCrn = stackCrn;
  }

  /**
   * Getter for stackName.
   * Name of the stack.
   **/
  @JsonProperty("stackName")
  public String getStackName() {
    return stackName;
  }

  /**
   * Setter for stackName.
   * Name of the stack.
   **/
  public void setStackName(String stackName) {
    this.stackName = stackName;
  }

  /**
   * Getter for stackStatus.
   * Current status of the stack.
   **/
  @JsonProperty("stackStatus")
  public String getStackStatus() {
    return stackStatus;
  }

  /**
   * Setter for stackStatus.
   * Current status of the stack.
   **/
  public void setStackStatus(String stackStatus) {
    this.stackStatus = stackStatus;
  }

  /**
   * Getter for nodeCount.
   * Current node count for the nodes in the cluster.
   **/
  @JsonProperty("nodeCount")
  public Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Setter for nodeCount.
   * Current node count for the nodes in the cluster.
   **/
  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }

  /**
   * Getter for instanceGroup.
   * Name of the instance group.
   **/
  @JsonProperty("instanceGroup")
  public String getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Setter for instanceGroup.
   * Name of the instance group.
   **/
  public void setInstanceGroup(String instanceGroup) {
    this.instanceGroup = instanceGroup;
  }

  /**
   * Getter for clusterStatus.
   * Status of the cluster.
   **/
  @JsonProperty("clusterStatus")
  public String getClusterStatus() {
    return clusterStatus;
  }

  /**
   * Setter for clusterStatus.
   * Status of the cluster.
   **/
  public void setClusterStatus(String clusterStatus) {
    this.clusterStatus = clusterStatus;
  }

  /**
   * Getter for workspaceId.
   * Workspace ID of the resource.
   **/
  @JsonProperty("workspaceId")
  public Long getWorkspaceId() {
    return workspaceId;
  }

  /**
   * Setter for workspaceId.
   * Workspace ID of the resource.
   **/
  public void setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
  }

  /**
   * Getter for tenantName.
   * Name of the current tenant.
   **/
  @JsonProperty("tenantName")
  public String getTenantName() {
    return tenantName;
  }

  /**
   * Setter for tenantName.
   * Name of the current tenant.
   **/
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  /**
   * Getter for ldapDetails.
   * Details of the LDAP.
   **/
  @JsonProperty("ldapDetails")
  public ClusterLdapDetails getLdapDetails() {
    return ldapDetails;
  }

  /**
   * Setter for ldapDetails.
   * Details of the LDAP.
   **/
  public void setLdapDetails(ClusterLdapDetails ldapDetails) {
    this.ldapDetails = ldapDetails;
  }

  /**
   * Getter for rdsDetails.
   * Details of the RDS.
   **/
  @JsonProperty("rdsDetails")
  public ClusterRdsDetails getRdsDetails() {
    return rdsDetails;
  }

  /**
   * Setter for rdsDetails.
   * Details of the RDS.
   **/
  public void setRdsDetails(ClusterRdsDetails rdsDetails) {
    this.rdsDetails = rdsDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterLifecycleEvents clusterLifecycleEvents = (ClusterLifecycleEvents) o;
    if (!Objects.equals(this.eventType, clusterLifecycleEvents.eventType)) {
      return false;
    }
    if (!Objects.equals(this.eventTimestamp, clusterLifecycleEvents.eventTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.eventMessage, clusterLifecycleEvents.eventMessage)) {
      return false;
    }
    if (!Objects.equals(this.userId, clusterLifecycleEvents.userId)) {
      return false;
    }
    if (!Objects.equals(this.notificationType, clusterLifecycleEvents.notificationType)) {
      return false;
    }
    if (!Objects.equals(this.cloudType, clusterLifecycleEvents.cloudType)) {
      return false;
    }
    if (!Objects.equals(this.region, clusterLifecycleEvents.region)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZone, clusterLifecycleEvents.availabilityZone)) {
      return false;
    }
    if (!Objects.equals(this.blueprintId, clusterLifecycleEvents.blueprintId)) {
      return false;
    }
    if (!Objects.equals(this.blueprintName, clusterLifecycleEvents.blueprintName)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, clusterLifecycleEvents.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.clusterName, clusterLifecycleEvents.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.stackCrn, clusterLifecycleEvents.stackCrn)) {
      return false;
    }
    if (!Objects.equals(this.stackName, clusterLifecycleEvents.stackName)) {
      return false;
    }
    if (!Objects.equals(this.stackStatus, clusterLifecycleEvents.stackStatus)) {
      return false;
    }
    if (!Objects.equals(this.nodeCount, clusterLifecycleEvents.nodeCount)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroup, clusterLifecycleEvents.instanceGroup)) {
      return false;
    }
    if (!Objects.equals(this.clusterStatus, clusterLifecycleEvents.clusterStatus)) {
      return false;
    }
    if (!Objects.equals(this.workspaceId, clusterLifecycleEvents.workspaceId)) {
      return false;
    }
    if (!Objects.equals(this.tenantName, clusterLifecycleEvents.tenantName)) {
      return false;
    }
    if (!Objects.equals(this.ldapDetails, clusterLifecycleEvents.ldapDetails)) {
      return false;
    }
    if (!Objects.equals(this.rdsDetails, clusterLifecycleEvents.rdsDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, eventTimestamp, eventMessage, userId, notificationType, cloudType, region, availabilityZone, blueprintId, blueprintName, clusterId, clusterName, stackCrn, stackName, stackStatus, nodeCount, instanceGroup, clusterStatus, workspaceId, tenantName, ldapDetails, rdsDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterLifecycleEvents {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    eventMessage: ").append(toIndentedString(eventMessage)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    blueprintId: ").append(toIndentedString(blueprintId)).append("\n");
    sb.append("    blueprintName: ").append(toIndentedString(blueprintName)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    stackCrn: ").append(toIndentedString(stackCrn)).append("\n");
    sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
    sb.append("    stackStatus: ").append(toIndentedString(stackStatus)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    instanceGroup: ").append(toIndentedString(instanceGroup)).append("\n");
    sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    ldapDetails: ").append(toIndentedString(ldapDetails)).append("\n");
    sb.append("    rdsDetails: ").append(toIndentedString(rdsDetails)).append("\n");
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

