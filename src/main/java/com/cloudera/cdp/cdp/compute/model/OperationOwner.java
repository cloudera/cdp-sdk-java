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
 * Operation owner structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:54.850-07:00")
public class OperationOwner  {

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
    OperationOwner operationOwner = (OperationOwner) o;
    if (!Objects.equals(this.userId, operationOwner.userId)) {
      return false;
    }
    if (!Objects.equals(this.accountId, operationOwner.accountId)) {
      return false;
    }
    if (!Objects.equals(this.crn, operationOwner.crn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, accountId, crn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationOwner {\n");
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

