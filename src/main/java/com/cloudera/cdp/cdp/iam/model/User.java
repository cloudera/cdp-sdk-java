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
 * Information about a Cloudera CDP user.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:08.152-08:00")
public class User  {

  /**
   * The stable, unique identifier of the user.
   **/
  private String userId = null;

  /**
   * The CRN of the user.
   **/
  private String crn = null;

  /**
   * The user's email address.
   **/
  private String email = null;

  /**
   * The user's first name.
   **/
  private String firstName = null;

  /**
   * The user's last name.
   **/
  private String lastName = null;

  /**
   * The date when this user record was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Whether the user is an administrator of their CDP account.
   **/
  private Boolean accountAdmin = null;

  /**
   * The identity provider that the user belongs to. It can be \"Cloudera-Default\", \"Cloudera-Administration\", or a customer defined IdP.
   **/
  private String identityProviderCrn = null;

  /**
   * The date of the user's last interactive login.
   **/
  private ZonedDateTime lastInteractiveLogin = null;

  /**
   * The username used in all the workload clusters of the user.
   **/
  private String workloadUsername = null;

  /**
   * The current status of the user. The possible status values are ACTIVE, CONTROL_PLANE_LOCKED_OUT, and DEACTIVATED. ACTIVE indicates that the user is active in CDP. An active user can authenticate to the CDP control plane and workload clusters. CONTROL_PLANE_LOCKED_OUT indicates that the user is locked out of the CDP control plane. The locked-out user can no longer authenticate to the control plane but can authenticate to the workload clusters. DEACTIVATED indicates that the user is deactivated in CDP. A deactivated user can neither authenticate to the control plane nor to the workload clusters. Note that more statuses could be added in the future. The statuses other than ACTIVE are only returned on Cloudera for Government.
   **/
  private String status = null;

  /**
   * Information about the workload password for the user.
   **/
  private WorkloadPasswordDetails workloadPasswordDetails = null;

  /**
   * Getter for userId.
   * The stable, unique identifier of the user.
   **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   * The stable, unique identifier of the user.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
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
   * Getter for email.
   * The user&#39;s email address.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * The user&#39;s email address.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for firstName.
   * The user&#39;s first name.
   **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter for firstName.
   * The user&#39;s first name.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter for lastName.
   * The user&#39;s last name.
   **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter for lastName.
   * The user&#39;s last name.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter for creationDate.
   * The date when this user record was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when this user record was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for accountAdmin.
   * Whether the user is an administrator of their CDP account.
   **/
  @JsonProperty("accountAdmin")
  public Boolean getAccountAdmin() {
    return accountAdmin;
  }

  /**
   * Setter for accountAdmin.
   * Whether the user is an administrator of their CDP account.
   **/
  public void setAccountAdmin(Boolean accountAdmin) {
    this.accountAdmin = accountAdmin;
  }

  /**
   * Getter for identityProviderCrn.
   * The identity provider that the user belongs to. It can be \&quot;Cloudera-Default\&quot;, \&quot;Cloudera-Administration\&quot;, or a customer defined IdP.
   **/
  @JsonProperty("identityProviderCrn")
  public String getIdentityProviderCrn() {
    return identityProviderCrn;
  }

  /**
   * Setter for identityProviderCrn.
   * The identity provider that the user belongs to. It can be \&quot;Cloudera-Default\&quot;, \&quot;Cloudera-Administration\&quot;, or a customer defined IdP.
   **/
  public void setIdentityProviderCrn(String identityProviderCrn) {
    this.identityProviderCrn = identityProviderCrn;
  }

  /**
   * Getter for lastInteractiveLogin.
   * The date of the user&#39;s last interactive login.
   **/
  @JsonProperty("lastInteractiveLogin")
  public ZonedDateTime getLastInteractiveLogin() {
    return lastInteractiveLogin;
  }

  /**
   * Setter for lastInteractiveLogin.
   * The date of the user&#39;s last interactive login.
   **/
  public void setLastInteractiveLogin(ZonedDateTime lastInteractiveLogin) {
    this.lastInteractiveLogin = lastInteractiveLogin;
  }

  /**
   * Getter for workloadUsername.
   * The username used in all the workload clusters of the user.
   **/
  @JsonProperty("workloadUsername")
  public String getWorkloadUsername() {
    return workloadUsername;
  }

  /**
   * Setter for workloadUsername.
   * The username used in all the workload clusters of the user.
   **/
  public void setWorkloadUsername(String workloadUsername) {
    this.workloadUsername = workloadUsername;
  }

  /**
   * Getter for status.
   * The current status of the user. The possible status values are ACTIVE, CONTROL_PLANE_LOCKED_OUT, and DEACTIVATED. ACTIVE indicates that the user is active in CDP. An active user can authenticate to the CDP control plane and workload clusters. CONTROL_PLANE_LOCKED_OUT indicates that the user is locked out of the CDP control plane. The locked-out user can no longer authenticate to the control plane but can authenticate to the workload clusters. DEACTIVATED indicates that the user is deactivated in CDP. A deactivated user can neither authenticate to the control plane nor to the workload clusters. Note that more statuses could be added in the future. The statuses other than ACTIVE are only returned on Cloudera for Government.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The current status of the user. The possible status values are ACTIVE, CONTROL_PLANE_LOCKED_OUT, and DEACTIVATED. ACTIVE indicates that the user is active in CDP. An active user can authenticate to the CDP control plane and workload clusters. CONTROL_PLANE_LOCKED_OUT indicates that the user is locked out of the CDP control plane. The locked-out user can no longer authenticate to the control plane but can authenticate to the workload clusters. DEACTIVATED indicates that the user is deactivated in CDP. A deactivated user can neither authenticate to the control plane nor to the workload clusters. Note that more statuses could be added in the future. The statuses other than ACTIVE are only returned on Cloudera for Government.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for workloadPasswordDetails.
   * Information about the workload password for the user.
   **/
  @JsonProperty("workloadPasswordDetails")
  public WorkloadPasswordDetails getWorkloadPasswordDetails() {
    return workloadPasswordDetails;
  }

  /**
   * Setter for workloadPasswordDetails.
   * Information about the workload password for the user.
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
    User user = (User) o;
    if (!Objects.equals(this.userId, user.userId)) {
      return false;
    }
    if (!Objects.equals(this.crn, user.crn)) {
      return false;
    }
    if (!Objects.equals(this.email, user.email)) {
      return false;
    }
    if (!Objects.equals(this.firstName, user.firstName)) {
      return false;
    }
    if (!Objects.equals(this.lastName, user.lastName)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, user.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.accountAdmin, user.accountAdmin)) {
      return false;
    }
    if (!Objects.equals(this.identityProviderCrn, user.identityProviderCrn)) {
      return false;
    }
    if (!Objects.equals(this.lastInteractiveLogin, user.lastInteractiveLogin)) {
      return false;
    }
    if (!Objects.equals(this.workloadUsername, user.workloadUsername)) {
      return false;
    }
    if (!Objects.equals(this.status, user.status)) {
      return false;
    }
    if (!Objects.equals(this.workloadPasswordDetails, user.workloadPasswordDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, crn, email, firstName, lastName, creationDate, accountAdmin, identityProviderCrn, lastInteractiveLogin, workloadUsername, status, workloadPasswordDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    accountAdmin: ").append(toIndentedString(accountAdmin)).append("\n");
    sb.append("    identityProviderCrn: ").append(toIndentedString(identityProviderCrn)).append("\n");
    sb.append("    lastInteractiveLogin: ").append(toIndentedString(lastInteractiveLogin)).append("\n");
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

