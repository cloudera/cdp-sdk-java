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
import java.util.*;

/**
 * Details of an external user with access to a Data Share.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class DataShareExternalUser  {

  /**
   * The unique identifier of the external user.
   **/
  private Long userId = null;

  /**
   * The username of the external user.
   **/
  private String username = null;

  /**
   * The Client ID of the external user that will be used for authentication.
   **/
  private String clientId = null;

  /**
   * The company name of the external user.
   **/
  private String companyName = null;

  /**
   * List of permissions granted to the external user for the Data Share.
   **/
  private List<String> permissions = new ArrayList<String>();

  /**
   * The date and time when the Data Share was shared with the external user.
   **/
  private ZonedDateTime sharedOn = null;

  /**
   * The date and time when the access of Data Share will expire for the external user.
   **/
  private ZonedDateTime validTill = null;

  /**
   * Getter for userId.
   * The unique identifier of the external user.
   **/
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   * The unique identifier of the external user.
   **/
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  /**
   * Getter for username.
   * The username of the external user.
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * The username of the external user.
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for clientId.
   * The Client ID of the external user that will be used for authentication.
   **/
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  /**
   * Setter for clientId.
   * The Client ID of the external user that will be used for authentication.
   **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * Getter for companyName.
   * The company name of the external user.
   **/
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Setter for companyName.
   * The company name of the external user.
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * Getter for permissions.
   * List of permissions granted to the external user for the Data Share.
   **/
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  /**
   * Setter for permissions.
   * List of permissions granted to the external user for the Data Share.
   **/
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   * Getter for sharedOn.
   * The date and time when the Data Share was shared with the external user.
   **/
  @JsonProperty("sharedOn")
  public ZonedDateTime getSharedOn() {
    return sharedOn;
  }

  /**
   * Setter for sharedOn.
   * The date and time when the Data Share was shared with the external user.
   **/
  public void setSharedOn(ZonedDateTime sharedOn) {
    this.sharedOn = sharedOn;
  }

  /**
   * Getter for validTill.
   * The date and time when the access of Data Share will expire for the external user.
   **/
  @JsonProperty("validTill")
  public ZonedDateTime getValidTill() {
    return validTill;
  }

  /**
   * Setter for validTill.
   * The date and time when the access of Data Share will expire for the external user.
   **/
  public void setValidTill(ZonedDateTime validTill) {
    this.validTill = validTill;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataShareExternalUser dataShareExternalUser = (DataShareExternalUser) o;
    if (!Objects.equals(this.userId, dataShareExternalUser.userId)) {
      return false;
    }
    if (!Objects.equals(this.username, dataShareExternalUser.username)) {
      return false;
    }
    if (!Objects.equals(this.clientId, dataShareExternalUser.clientId)) {
      return false;
    }
    if (!Objects.equals(this.companyName, dataShareExternalUser.companyName)) {
      return false;
    }
    if (!Objects.equals(this.permissions, dataShareExternalUser.permissions)) {
      return false;
    }
    if (!Objects.equals(this.sharedOn, dataShareExternalUser.sharedOn)) {
      return false;
    }
    if (!Objects.equals(this.validTill, dataShareExternalUser.validTill)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, clientId, companyName, permissions, sharedOn, validTill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataShareExternalUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    sharedOn: ").append(toIndentedString(sharedOn)).append("\n");
    sb.append("    validTill: ").append(toIndentedString(validTill)).append("\n");
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

