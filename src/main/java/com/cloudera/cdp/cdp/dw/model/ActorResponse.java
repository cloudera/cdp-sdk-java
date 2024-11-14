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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A CDP actor (user or machine user).
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:24.581-08:00")
public class ActorResponse extends CdpResponse {

  /**
   * Actor CRN.
   **/
  private String crn = null;

  /**
   * Email address for users.
   **/
  private String email = null;

  /**
   * Username for users.
   **/
  private String workloadUsername = null;

  /**
   * Username for machine users.
   **/
  private String machineUsername = null;

  /**
   * Getter for crn.
   * Actor CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * Actor CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for email.
   * Email address for users.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * Email address for users.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for workloadUsername.
   * Username for users.
   **/
  @JsonProperty("workloadUsername")
  public String getWorkloadUsername() {
    return workloadUsername;
  }

  /**
   * Setter for workloadUsername.
   * Username for users.
   **/
  public void setWorkloadUsername(String workloadUsername) {
    this.workloadUsername = workloadUsername;
  }

  /**
   * Getter for machineUsername.
   * Username for machine users.
   **/
  @JsonProperty("machineUsername")
  public String getMachineUsername() {
    return machineUsername;
  }

  /**
   * Setter for machineUsername.
   * Username for machine users.
   **/
  public void setMachineUsername(String machineUsername) {
    this.machineUsername = machineUsername;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActorResponse actorResponse = (ActorResponse) o;
    if (!Objects.equals(this.crn, actorResponse.crn)) {
      return false;
    }
    if (!Objects.equals(this.email, actorResponse.email)) {
      return false;
    }
    if (!Objects.equals(this.workloadUsername, actorResponse.workloadUsername)) {
      return false;
    }
    if (!Objects.equals(this.machineUsername, actorResponse.machineUsername)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, email, workloadUsername, machineUsername, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActorResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    workloadUsername: ").append(toIndentedString(workloadUsername)).append("\n");
    sb.append("    machineUsername: ").append(toIndentedString(machineUsername)).append("\n");
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

