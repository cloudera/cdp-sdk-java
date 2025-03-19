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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.AttachedVolumeDetail;
import java.util.*;

/**
 * Object for a FreeIPA instance providing specific information about the instance.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:29.236-07:00")
public class FreeIpaInstance  {

  /**
   * The availability zone of the instance.
   **/
  private String availabilityZone = null;

  /**
   * The fully qualified domain name of the instance in the service discovery cluster.
   **/
  private String discoveryFQDN = null;

  /**
   * The instance ID for the instance.
   **/
  private String instanceId = null;

  /**
   * The instance group that contains the instance.
   **/
  private String instanceGroup = null;

  /**
   * The status of the instance.
   **/
  private String instanceStatus = null;

  /**
   * The status reason for the instance.
   **/
  private String instanceStatusReason = null;

  /**
   * The type of the instance (either GATEWAY or GATEWAY_PRIMARY).
   **/
  private String instanceType = null;

  /**
   * The VM type of the instance. Supported values depend on the cloud platform.
   **/
  private String instanceVmType = null;

  /**
   * The life cycle type for the instance (either NORMAL or SPOT).
   **/
  private String lifeCycle = null;

  /**
   * The private IP of the instance.
   **/
  private String privateIP = null;

  /**
   * The public IP of the instance.
   **/
  private String publicIP = null;

  /**
   * The SSH port of the instance.
   **/
  private Integer sshPort = null;

  /**
   * The subnet ID of the instance.
   **/
  private String subnetId = null;

  /**
   * List of volumes attached to this instance.
   **/
  private List<AttachedVolumeDetail> attachedVolumes = new ArrayList<AttachedVolumeDetail>();

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
   * Getter for discoveryFQDN.
   * The fully qualified domain name of the instance in the service discovery cluster.
   **/
  @JsonProperty("discoveryFQDN")
  public String getDiscoveryFQDN() {
    return discoveryFQDN;
  }

  /**
   * Setter for discoveryFQDN.
   * The fully qualified domain name of the instance in the service discovery cluster.
   **/
  public void setDiscoveryFQDN(String discoveryFQDN) {
    this.discoveryFQDN = discoveryFQDN;
  }

  /**
   * Getter for instanceId.
   * The instance ID for the instance.
   **/
  @JsonProperty("instanceId")
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Setter for instanceId.
   * The instance ID for the instance.
   **/
  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  /**
   * Getter for instanceGroup.
   * The instance group that contains the instance.
   **/
  @JsonProperty("instanceGroup")
  public String getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Setter for instanceGroup.
   * The instance group that contains the instance.
   **/
  public void setInstanceGroup(String instanceGroup) {
    this.instanceGroup = instanceGroup;
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
   * Getter for instanceStatusReason.
   * The status reason for the instance.
   **/
  @JsonProperty("instanceStatusReason")
  public String getInstanceStatusReason() {
    return instanceStatusReason;
  }

  /**
   * Setter for instanceStatusReason.
   * The status reason for the instance.
   **/
  public void setInstanceStatusReason(String instanceStatusReason) {
    this.instanceStatusReason = instanceStatusReason;
  }

  /**
   * Getter for instanceType.
   * The type of the instance (either GATEWAY or GATEWAY_PRIMARY).
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The type of the instance (either GATEWAY or GATEWAY_PRIMARY).
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
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
   * Getter for lifeCycle.
   * The life cycle type for the instance (either NORMAL or SPOT).
   **/
  @JsonProperty("lifeCycle")
  public String getLifeCycle() {
    return lifeCycle;
  }

  /**
   * Setter for lifeCycle.
   * The life cycle type for the instance (either NORMAL or SPOT).
   **/
  public void setLifeCycle(String lifeCycle) {
    this.lifeCycle = lifeCycle;
  }

  /**
   * Getter for privateIP.
   * The private IP of the instance.
   **/
  @JsonProperty("privateIP")
  public String getPrivateIP() {
    return privateIP;
  }

  /**
   * Setter for privateIP.
   * The private IP of the instance.
   **/
  public void setPrivateIP(String privateIP) {
    this.privateIP = privateIP;
  }

  /**
   * Getter for publicIP.
   * The public IP of the instance.
   **/
  @JsonProperty("publicIP")
  public String getPublicIP() {
    return publicIP;
  }

  /**
   * Setter for publicIP.
   * The public IP of the instance.
   **/
  public void setPublicIP(String publicIP) {
    this.publicIP = publicIP;
  }

  /**
   * Getter for sshPort.
   * The SSH port of the instance.
   **/
  @JsonProperty("sshPort")
  public Integer getSshPort() {
    return sshPort;
  }

  /**
   * Setter for sshPort.
   * The SSH port of the instance.
   **/
  public void setSshPort(Integer sshPort) {
    this.sshPort = sshPort;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeIpaInstance freeIpaInstance = (FreeIpaInstance) o;
    if (!Objects.equals(this.availabilityZone, freeIpaInstance.availabilityZone)) {
      return false;
    }
    if (!Objects.equals(this.discoveryFQDN, freeIpaInstance.discoveryFQDN)) {
      return false;
    }
    if (!Objects.equals(this.instanceId, freeIpaInstance.instanceId)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroup, freeIpaInstance.instanceGroup)) {
      return false;
    }
    if (!Objects.equals(this.instanceStatus, freeIpaInstance.instanceStatus)) {
      return false;
    }
    if (!Objects.equals(this.instanceStatusReason, freeIpaInstance.instanceStatusReason)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, freeIpaInstance.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.instanceVmType, freeIpaInstance.instanceVmType)) {
      return false;
    }
    if (!Objects.equals(this.lifeCycle, freeIpaInstance.lifeCycle)) {
      return false;
    }
    if (!Objects.equals(this.privateIP, freeIpaInstance.privateIP)) {
      return false;
    }
    if (!Objects.equals(this.publicIP, freeIpaInstance.publicIP)) {
      return false;
    }
    if (!Objects.equals(this.sshPort, freeIpaInstance.sshPort)) {
      return false;
    }
    if (!Objects.equals(this.subnetId, freeIpaInstance.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.attachedVolumes, freeIpaInstance.attachedVolumes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, discoveryFQDN, instanceId, instanceGroup, instanceStatus, instanceStatusReason, instanceType, instanceVmType, lifeCycle, privateIP, publicIP, sshPort, subnetId, attachedVolumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeIpaInstance {\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    discoveryFQDN: ").append(toIndentedString(discoveryFQDN)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceGroup: ").append(toIndentedString(instanceGroup)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceStatusReason: ").append(toIndentedString(instanceStatusReason)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceVmType: ").append(toIndentedString(instanceVmType)).append("\n");
    sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
    sb.append("    privateIP: ").append(toIndentedString(privateIP)).append("\n");
    sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
    sb.append("    sshPort: ").append(toIndentedString(sshPort)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    attachedVolumes: ").append(toIndentedString(attachedVolumes)).append("\n");
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

