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

/**
 * Request object to update a user.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-30T17:23:17.886-07:00")
public class UpdateUserRequest  {

  /**
   * The CRN or userId of the user to be updated.
   **/
  private String user = null;

  /**
   * The active state to which to set the user. When it is 'true', the user will be activated. When it is 'false' the user will be deactivated.
   **/
  private Boolean active = null;

  /**
   * Getter for user.
   * The CRN or userId of the user to be updated.
   **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Setter for user.
   * The CRN or userId of the user to be updated.
   **/
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Getter for active.
   * The active state to which to set the user. When it is &#39;true&#39;, the user will be activated. When it is &#39;false&#39; the user will be deactivated.
   **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  /**
   * Setter for active.
   * The active state to which to set the user. When it is &#39;true&#39;, the user will be activated. When it is &#39;false&#39; the user will be deactivated.
   **/
  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    if (!Objects.equals(this.user, updateUserRequest.user)) {
      return false;
    }
    if (!Objects.equals(this.active, updateUserRequest.active)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

