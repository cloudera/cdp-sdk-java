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
 * Request object for an assign user resource role request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-01T13:59:42.174-08:00")
public class AssignUserResourceRoleRequest  {

  /**
   * The user to assign the resource role to. Can be the user's CRN or id.
   **/
  private String user = null;

  /**
   * The CRN of the resource role to assign to the user.
   **/
  private String resourceRoleCrn = null;

  /**
   * The resource for which the resource role rights are granted.
   **/
  private String resourceCrn = null;

  /**
   * Getter for user.
   * The user to assign the resource role to. Can be the user&#39;s CRN or id.
   **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Setter for user.
   * The user to assign the resource role to. Can be the user&#39;s CRN or id.
   **/
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Getter for resourceRoleCrn.
   * The CRN of the resource role to assign to the user.
   **/
  @JsonProperty("resourceRoleCrn")
  public String getResourceRoleCrn() {
    return resourceRoleCrn;
  }

  /**
   * Setter for resourceRoleCrn.
   * The CRN of the resource role to assign to the user.
   **/
  public void setResourceRoleCrn(String resourceRoleCrn) {
    this.resourceRoleCrn = resourceRoleCrn;
  }

  /**
   * Getter for resourceCrn.
   * The resource for which the resource role rights are granted.
   **/
  @JsonProperty("resourceCrn")
  public String getResourceCrn() {
    return resourceCrn;
  }

  /**
   * Setter for resourceCrn.
   * The resource for which the resource role rights are granted.
   **/
  public void setResourceCrn(String resourceCrn) {
    this.resourceCrn = resourceCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignUserResourceRoleRequest assignUserResourceRoleRequest = (AssignUserResourceRoleRequest) o;
    if (!Objects.equals(this.user, assignUserResourceRoleRequest.user)) {
      return false;
    }
    if (!Objects.equals(this.resourceRoleCrn, assignUserResourceRoleRequest.resourceRoleCrn)) {
      return false;
    }
    if (!Objects.equals(this.resourceCrn, assignUserResourceRoleRequest.resourceCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, resourceRoleCrn, resourceCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignUserResourceRoleRequest {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    resourceRoleCrn: ").append(toIndentedString(resourceRoleCrn)).append("\n");
    sb.append("    resourceCrn: ").append(toIndentedString(resourceCrn)).append("\n");
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

