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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Specifies the updated access expiration time for an external user on a specific Data Share.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class ExternalUserAccessUpdate  {

  /**
   * The unique identifier of the external user.
   **/
  private Long externalUserId = null;

  /**
   * The date and time when the access of Data Share will expire for the external user.
   **/
  private ZonedDateTime expiryTime = null;

  /**
   * Getter for externalUserId.
   * The unique identifier of the external user.
   **/
  @JsonProperty("externalUserId")
  public Long getExternalUserId() {
    return externalUserId;
  }

  /**
   * Setter for externalUserId.
   * The unique identifier of the external user.
   **/
  public void setExternalUserId(Long externalUserId) {
    this.externalUserId = externalUserId;
  }

  /**
   * Getter for expiryTime.
   * The date and time when the access of Data Share will expire for the external user.
   **/
  @JsonProperty("expiryTime")
  public ZonedDateTime getExpiryTime() {
    return expiryTime;
  }

  /**
   * Setter for expiryTime.
   * The date and time when the access of Data Share will expire for the external user.
   **/
  public void setExpiryTime(ZonedDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUserAccessUpdate externalUserAccessUpdate = (ExternalUserAccessUpdate) o;
    if (!Objects.equals(this.externalUserId, externalUserAccessUpdate.externalUserId)) {
      return false;
    }
    if (!Objects.equals(this.expiryTime, externalUserAccessUpdate.expiryTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUserId, expiryTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUserAccessUpdate {\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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

