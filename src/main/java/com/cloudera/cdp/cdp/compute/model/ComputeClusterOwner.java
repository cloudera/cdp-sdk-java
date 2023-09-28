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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Compute cluster owner structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-27T13:27:54.862-07:00")
public class ComputeClusterOwner  {

  /**
   * Owner's email.
   **/
  private String email = null;

  /**
   * Owner's firstname.
   **/
  private String firstName = null;

  /**
   * Owner's lastname.
   **/
  private String lastName = null;

  /**
   * Owner's user ID.
   **/
  private String userId = null;

  /**
   * Owner's account ID.
   **/
  private String accountId = null;

  /**
   * Owner's actor CRN.
   **/
  private String crn = null;

  /**
   * Getter for email.
   * Owner&#39;s email.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * Owner&#39;s email.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for firstName.
   * Owner&#39;s firstname.
   **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter for firstName.
   * Owner&#39;s firstname.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter for lastName.
   * Owner&#39;s lastname.
   **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter for lastName.
   * Owner&#39;s lastname.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter for userId.
   * Owner&#39;s user ID.
   **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   * Owner&#39;s user ID.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Getter for accountId.
   * Owner&#39;s account ID.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * Owner&#39;s account ID.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Getter for crn.
   * Owner&#39;s actor CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * Owner&#39;s actor CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeClusterOwner computeClusterOwner = (ComputeClusterOwner) o;
    if (!Objects.equals(this.email, computeClusterOwner.email)) {
      return false;
    }
    if (!Objects.equals(this.firstName, computeClusterOwner.firstName)) {
      return false;
    }
    if (!Objects.equals(this.lastName, computeClusterOwner.lastName)) {
      return false;
    }
    if (!Objects.equals(this.userId, computeClusterOwner.userId)) {
      return false;
    }
    if (!Objects.equals(this.accountId, computeClusterOwner.accountId)) {
      return false;
    }
    if (!Objects.equals(this.crn, computeClusterOwner.crn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, userId, accountId, crn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeClusterOwner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
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

