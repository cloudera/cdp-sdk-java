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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.iam.model.WorkloadPasswordDetails;
import java.time.ZonedDateTime;

/**
 * Information about a Cloudera CDP machine user.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-18T18:28:46.335-08:00")
public class MachineUser  {

  /**
   * The machine user name.
   **/
  private String machineUserName = null;

  /**
   * The CRN of the user.
   **/
  private String crn = null;

  /**
   * The date when this machine user record was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The username used in all the workload clusters of the machine user.
   **/
  private String workloadUsername = null;

  /**
   * The current status of the machine user. The possible status values are ACTIVE and CONTROL_PLANE_LOCKED_OUT. ACTIVE indicates that the machine user is active in CDP. An active machine user can authenticate to the CDP control plane and workload clusters. CONTROL_PLANE_LOCKED_OUT indicates that the machine user is locked out of the CDP control plane. The locked-out machine user can no longer authenticate to the control plane but can authenticate to the workload clusters. Note that more statuses could be added in the future. The statuses other than ACTIVE are only returned on Cloudera for Government.
   **/
  private String status = null;

  /**
   * Information about the workload password for the machine user.
   **/
  private WorkloadPasswordDetails workloadPasswordDetails = null;

  /**
   * Getter for machineUserName.
   * The machine user name.
   **/
  @JsonProperty("machineUserName")
  public String getMachineUserName() {
    return machineUserName;
  }

  /**
   * Setter for machineUserName.
   * The machine user name.
   **/
  public void setMachineUserName(String machineUserName) {
    this.machineUserName = machineUserName;
  }

  /**
   * Getter for crn.
   * The CRN of the user.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the user.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for creationDate.
   * The date when this machine user record was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when this machine user record was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for workloadUsername.
   * The username used in all the workload clusters of the machine user.
   **/
  @JsonProperty("workloadUsername")
  public String getWorkloadUsername() {
    return workloadUsername;
  }

  /**
   * Setter for workloadUsername.
   * The username used in all the workload clusters of the machine user.
   **/
  public void setWorkloadUsername(String workloadUsername) {
    this.workloadUsername = workloadUsername;
  }

  /**
   * Getter for status.
   * The current status of the machine user. The possible status values are ACTIVE and CONTROL_PLANE_LOCKED_OUT. ACTIVE indicates that the machine user is active in CDP. An active machine user can authenticate to the CDP control plane and workload clusters. CONTROL_PLANE_LOCKED_OUT indicates that the machine user is locked out of the CDP control plane. The locked-out machine user can no longer authenticate to the control plane but can authenticate to the workload clusters. Note that more statuses could be added in the future. The statuses other than ACTIVE are only returned on Cloudera for Government.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The current status of the machine user. The possible status values are ACTIVE and CONTROL_PLANE_LOCKED_OUT. ACTIVE indicates that the machine user is active in CDP. An active machine user can authenticate to the CDP control plane and workload clusters. CONTROL_PLANE_LOCKED_OUT indicates that the machine user is locked out of the CDP control plane. The locked-out machine user can no longer authenticate to the control plane but can authenticate to the workload clusters. Note that more statuses could be added in the future. The statuses other than ACTIVE are only returned on Cloudera for Government.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for workloadPasswordDetails.
   * Information about the workload password for the machine user.
   **/
  @JsonProperty("workloadPasswordDetails")
  public WorkloadPasswordDetails getWorkloadPasswordDetails() {
    return workloadPasswordDetails;
  }

  /**
   * Setter for workloadPasswordDetails.
   * Information about the workload password for the machine user.
   **/
  public void setWorkloadPasswordDetails(WorkloadPasswordDetails workloadPasswordDetails) {
    this.workloadPasswordDetails = workloadPasswordDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineUser machineUser = (MachineUser) o;
    if (!Objects.equals(this.machineUserName, machineUser.machineUserName)) {
      return false;
    }
    if (!Objects.equals(this.crn, machineUser.crn)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, machineUser.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.workloadUsername, machineUser.workloadUsername)) {
      return false;
    }
    if (!Objects.equals(this.status, machineUser.status)) {
      return false;
    }
    if (!Objects.equals(this.workloadPasswordDetails, machineUser.workloadPasswordDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(machineUserName, crn, creationDate, workloadUsername, status, workloadPasswordDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineUser {\n");
    sb.append("    machineUserName: ").append(toIndentedString(machineUserName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    workloadUsername: ").append(toIndentedString(workloadUsername)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workloadPasswordDetails: ").append(toIndentedString(workloadPasswordDetails)).append("\n");
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

