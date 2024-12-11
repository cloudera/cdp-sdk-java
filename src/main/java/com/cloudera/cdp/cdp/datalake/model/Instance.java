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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.AttachedVolumeDetail;
import java.util.*;

/**
 * Object which holds some details of an instance for the given cluster.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:09.577-08:00")
public class Instance  {

  /**
   * The ID of the given instance.
   **/
  private String id = null;

  /**
   * The actual state of the instance.
   **/
  private String state = null;

  /**
   * The FQDN of the instance.
   **/
  private String discoveryFQDN = null;

  /**
   * The status of the instance.
   **/
  private String instanceStatus = null;

  /**
   * The reason for the current status of this instance.
   **/
  private String statusReason = null;

  /**
   * The private IP of the given instance.
   **/
  private String privateIp = null;

  /**
   * The public IP of the given instance.
   **/
  private String publicIp = null;

  /**
   * The SSH port for the instance.
   **/
  private Integer sshPort = null;

  /**
   * Whether the instance has Cloudera Manager deployed or not.
   **/
  private Boolean clouderaManagerServer = null;

  /**
   * The name of the instance group this instance belongs to.
   **/
  private String instanceGroup = null;

  /**
   * The instance type.
   **/
  private String instanceTypeVal = null;

  /**
   * List of volumes attached to this instance.
   **/
  private List<AttachedVolumeDetail> attachedVolumes = new ArrayList<AttachedVolumeDetail>();

  /**
   * The availability zone of the instance.
   **/
  private String availabilityZone = null;

  /**
   * The VM type of the instance. Supported values depend on the cloud platform.
   **/
  private String instanceVmType = null;

  /**
   * The rack ID of the instance in Cloudera Manager.
   **/
  private String rackId = null;

  /**
   * The subnet ID of the instance.
   **/
  private String subnetId = null;

  /**
   * Getter for id.
   * The ID of the given instance.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the given instance.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for state.
   * The actual state of the instance.
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The actual state of the instance.
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for discoveryFQDN.
   * The FQDN of the instance.
   **/
  @JsonProperty("discoveryFQDN")
  public String getDiscoveryFQDN() {
    return discoveryFQDN;
  }

  /**
   * Setter for discoveryFQDN.
   * The FQDN of the instance.
   **/
  public void setDiscoveryFQDN(String discoveryFQDN) {
    this.discoveryFQDN = discoveryFQDN;
  }

  /**
   * Getter for instanceStatus.
   * The status of the instance.
   **/
  @JsonProperty("instanceStatus")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  /**
   * Setter for instanceStatus.
   * The status of the instance.
   **/
  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  /**
   * Getter for statusReason.
   * The reason for the current status of this instance.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * The reason for the current status of this instance.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * Getter for privateIp.
   * The private IP of the given instance.
   **/
  @JsonProperty("privateIp")
  public String getPrivateIp() {
    return privateIp;
  }

  /**
   * Setter for privateIp.
   * The private IP of the given instance.
   **/
  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }

  /**
   * Getter for publicIp.
   * The public IP of the given instance.
   **/
  @JsonProperty("publicIp")
  public String getPublicIp() {
    return publicIp;
  }

  /**
   * Setter for publicIp.
   * The public IP of the given instance.
   **/
  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }

  /**
   * Getter for sshPort.
   * The SSH port for the instance.
   **/
  @JsonProperty("sshPort")
  public Integer getSshPort() {
    return sshPort;
  }

  /**
   * Setter for sshPort.
   * The SSH port for the instance.
   **/
  public void setSshPort(Integer sshPort) {
    this.sshPort = sshPort;
  }

  /**
   * Getter for clouderaManagerServer.
   * Whether the instance has Cloudera Manager deployed or not.
   **/
  @JsonProperty("clouderaManagerServer")
  public Boolean getClouderaManagerServer() {
    return clouderaManagerServer;
  }

  /**
   * Setter for clouderaManagerServer.
   * Whether the instance has Cloudera Manager deployed or not.
   **/
  public void setClouderaManagerServer(Boolean clouderaManagerServer) {
    this.clouderaManagerServer = clouderaManagerServer;
  }

  /**
   * Getter for instanceGroup.
   * The name of the instance group this instance belongs to.
   **/
  @JsonProperty("instanceGroup")
  public String getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Setter for instanceGroup.
   * The name of the instance group this instance belongs to.
   **/
  public void setInstanceGroup(String instanceGroup) {
    this.instanceGroup = instanceGroup;
  }

  /**
   * Getter for instanceTypeVal.
   * The instance type.
   **/
  @JsonProperty("instanceTypeVal")
  public String getInstanceTypeVal() {
    return instanceTypeVal;
  }

  /**
   * Setter for instanceTypeVal.
   * The instance type.
   **/
  public void setInstanceTypeVal(String instanceTypeVal) {
    this.instanceTypeVal = instanceTypeVal;
  }

  /**
   * Getter for attachedVolumes.
   * List of volumes attached to this instance.
   **/
  @JsonProperty("attachedVolumes")
  public List<AttachedVolumeDetail> getAttachedVolumes() {
    return attachedVolumes;
  }

  /**
   * Setter for attachedVolumes.
   * List of volumes attached to this instance.
   **/
  public void setAttachedVolumes(List<AttachedVolumeDetail> attachedVolumes) {
    this.attachedVolumes = attachedVolumes;
  }

  /**
   * Getter for availabilityZone.
   * The availability zone of the instance.
   **/
  @JsonProperty("availabilityZone")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * Setter for availabilityZone.
   * The availability zone of the instance.
   **/
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * Getter for instanceVmType.
   * The VM type of the instance. Supported values depend on the cloud platform.
   **/
  @JsonProperty("instanceVmType")
  public String getInstanceVmType() {
    return instanceVmType;
  }

  /**
   * Setter for instanceVmType.
   * The VM type of the instance. Supported values depend on the cloud platform.
   **/
  public void setInstanceVmType(String instanceVmType) {
    this.instanceVmType = instanceVmType;
  }

  /**
   * Getter for rackId.
   * The rack ID of the instance in Cloudera Manager.
   **/
  @JsonProperty("rackId")
  public String getRackId() {
    return rackId;
  }

  /**
   * Setter for rackId.
   * The rack ID of the instance in Cloudera Manager.
   **/
  public void setRackId(String rackId) {
    this.rackId = rackId;
  }

  /**
   * Getter for subnetId.
   * The subnet ID of the instance.
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * The subnet ID of the instance.
   **/
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    if (!Objects.equals(this.id, instance.id)) {
      return false;
    }
    if (!Objects.equals(this.state, instance.state)) {
      return false;
    }
    if (!Objects.equals(this.discoveryFQDN, instance.discoveryFQDN)) {
      return false;
    }
    if (!Objects.equals(this.instanceStatus, instance.instanceStatus)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, instance.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.privateIp, instance.privateIp)) {
      return false;
    }
    if (!Objects.equals(this.publicIp, instance.publicIp)) {
      return false;
    }
    if (!Objects.equals(this.sshPort, instance.sshPort)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManagerServer, instance.clouderaManagerServer)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroup, instance.instanceGroup)) {
      return false;
    }
    if (!Objects.equals(this.instanceTypeVal, instance.instanceTypeVal)) {
      return false;
    }
    if (!Objects.equals(this.attachedVolumes, instance.attachedVolumes)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZone, instance.availabilityZone)) {
      return false;
    }
    if (!Objects.equals(this.instanceVmType, instance.instanceVmType)) {
      return false;
    }
    if (!Objects.equals(this.rackId, instance.rackId)) {
      return false;
    }
    if (!Objects.equals(this.subnetId, instance.subnetId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, discoveryFQDN, instanceStatus, statusReason, privateIp, publicIp, sshPort, clouderaManagerServer, instanceGroup, instanceTypeVal, attachedVolumes, availabilityZone, instanceVmType, rackId, subnetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    discoveryFQDN: ").append(toIndentedString(discoveryFQDN)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    sshPort: ").append(toIndentedString(sshPort)).append("\n");
    sb.append("    clouderaManagerServer: ").append(toIndentedString(clouderaManagerServer)).append("\n");
    sb.append("    instanceGroup: ").append(toIndentedString(instanceGroup)).append("\n");
    sb.append("    instanceTypeVal: ").append(toIndentedString(instanceTypeVal)).append("\n");
    sb.append("    attachedVolumes: ").append(toIndentedString(attachedVolumes)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    instanceVmType: ").append(toIndentedString(instanceVmType)).append("\n");
    sb.append("    rackId: ").append(toIndentedString(rackId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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

