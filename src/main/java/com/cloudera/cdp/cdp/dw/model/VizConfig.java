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
import java.util.*;

/**
 * Configurations for a Cloudera Data Visualization
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-10T11:26:34.865-07:00")
public class VizConfig  {

  /**
   * User groups to allow user access to Data Visualization for selected users
   **/
  private List<String> userGroups = new ArrayList<String>();

  /**
   * Admin groups to allow configuration access to Data Visualization for selected users
   **/
  private List<String> adminGroups = new ArrayList<String>();

  /**
   * Getter for userGroups.
   * User groups to allow user access to Data Visualization for selected users
   **/
  @JsonProperty("userGroups")
  public List<String> getUserGroups() {
    return userGroups;
  }

  /**
   * Setter for userGroups.
   * User groups to allow user access to Data Visualization for selected users
   **/
  public void setUserGroups(List<String> userGroups) {
    this.userGroups = userGroups;
  }

  /**
   * Getter for adminGroups.
   * Admin groups to allow configuration access to Data Visualization for selected users
   **/
  @JsonProperty("adminGroups")
  public List<String> getAdminGroups() {
    return adminGroups;
  }

  /**
   * Setter for adminGroups.
   * Admin groups to allow configuration access to Data Visualization for selected users
   **/
  public void setAdminGroups(List<String> adminGroups) {
    this.adminGroups = adminGroups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VizConfig vizConfig = (VizConfig) o;
    if (!Objects.equals(this.userGroups, vizConfig.userGroups)) {
      return false;
    }
    if (!Objects.equals(this.adminGroups, vizConfig.adminGroups)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userGroups, adminGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VizConfig {\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    adminGroups: ").append(toIndentedString(adminGroups)).append("\n");
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

