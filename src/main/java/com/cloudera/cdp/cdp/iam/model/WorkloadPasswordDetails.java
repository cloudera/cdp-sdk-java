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
import java.time.ZonedDateTime;

/**
 * Information about the workload password for a user or machine user.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-28T14:39:24.524-07:00")
public class WorkloadPasswordDetails  {

  /**
   * Whether a workload password is set.
   **/
  private Boolean isPasswordSet = null;

  /**
   * The date at which the workload password will expire.
   **/
  private ZonedDateTime passwordExpirationDate = null;

  /**
   * The minimum lifetime date of the workload password. A new password can't be set until this date.
   **/
  private ZonedDateTime passwordMinLifetimeDate = null;

  /**
   * Getter for isPasswordSet.
   * Whether a workload password is set.
   **/
  @JsonProperty("isPasswordSet")
  public Boolean getIsPasswordSet() {
    return isPasswordSet;
  }

  /**
   * Setter for isPasswordSet.
   * Whether a workload password is set.
   **/
  public void setIsPasswordSet(Boolean isPasswordSet) {
    this.isPasswordSet = isPasswordSet;
  }

  /**
   * Getter for passwordExpirationDate.
   * The date at which the workload password will expire.
   **/
  @JsonProperty("passwordExpirationDate")
  public ZonedDateTime getPasswordExpirationDate() {
    return passwordExpirationDate;
  }

  /**
   * Setter for passwordExpirationDate.
   * The date at which the workload password will expire.
   **/
  public void setPasswordExpirationDate(ZonedDateTime passwordExpirationDate) {
    this.passwordExpirationDate = passwordExpirationDate;
  }

  /**
   * Getter for passwordMinLifetimeDate.
   * The minimum lifetime date of the workload password. A new password can&#39;t be set until this date.
   **/
  @JsonProperty("passwordMinLifetimeDate")
  public ZonedDateTime getPasswordMinLifetimeDate() {
    return passwordMinLifetimeDate;
  }

  /**
   * Setter for passwordMinLifetimeDate.
   * The minimum lifetime date of the workload password. A new password can&#39;t be set until this date.
   **/
  public void setPasswordMinLifetimeDate(ZonedDateTime passwordMinLifetimeDate) {
    this.passwordMinLifetimeDate = passwordMinLifetimeDate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadPasswordDetails workloadPasswordDetails = (WorkloadPasswordDetails) o;
    if (!Objects.equals(this.isPasswordSet, workloadPasswordDetails.isPasswordSet)) {
      return false;
    }
    if (!Objects.equals(this.passwordExpirationDate, workloadPasswordDetails.passwordExpirationDate)) {
      return false;
    }
    if (!Objects.equals(this.passwordMinLifetimeDate, workloadPasswordDetails.passwordMinLifetimeDate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPasswordSet, passwordExpirationDate, passwordMinLifetimeDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadPasswordDetails {\n");
    sb.append("    isPasswordSet: ").append(toIndentedString(isPasswordSet)).append("\n");
    sb.append("    passwordExpirationDate: ").append(toIndentedString(passwordExpirationDate)).append("\n");
    sb.append("    passwordMinLifetimeDate: ").append(toIndentedString(passwordMinLifetimeDate)).append("\n");
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

