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
 * A Cloudera Data Visualization.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class DataVisualizationSummary  {

  /**
   * The ID of the Cloudera Data Visualization.
   **/
  private String id = null;

  /**
   * The name of the Cloudera Data Visualization.
   **/
  private String name = null;

  /**
   * Status of the Cloudera Data Visualization. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  private String status = null;

  /**
   * Current image version of the Cloudera Data Visualization
   **/
  private String imageVersion = null;

  /**
   * The CRN of the user who created the Cloudera Data Visualization
   **/
  private String creatorCrn = null;

  /**
   * The template size for the Cloudera Data Visualization
   **/
  private String size = null;

  /**
   * The name of the Resource Pool the Cloudera Data Visualization is in.
   **/
  private String resourcePool = null;

  /**
   * User groups that are allowed to access the Data Visualization.
   **/
  private List<String> userGroups = new ArrayList<String>();

  /**
   * Admin groups that are allowed to access the Data Visualization.
   **/
  private List<String> adminGroups = new ArrayList<String>();

  /**
   * Getter for id.
   * The ID of the Cloudera Data Visualization.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the Cloudera Data Visualization.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * The name of the Cloudera Data Visualization.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the Cloudera Data Visualization.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for status.
   * Status of the Cloudera Data Visualization. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the Cloudera Data Visualization. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for imageVersion.
   * Current image version of the Cloudera Data Visualization
   **/
  @JsonProperty("imageVersion")
  public String getImageVersion() {
    return imageVersion;
  }

  /**
   * Setter for imageVersion.
   * Current image version of the Cloudera Data Visualization
   **/
  public void setImageVersion(String imageVersion) {
    this.imageVersion = imageVersion;
  }

  /**
   * Getter for creatorCrn.
   * The CRN of the user who created the Cloudera Data Visualization
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The CRN of the user who created the Cloudera Data Visualization
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for size.
   * The template size for the Cloudera Data Visualization
   **/
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  /**
   * Setter for size.
   * The template size for the Cloudera Data Visualization
   **/
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * Getter for resourcePool.
   * The name of the Resource Pool the Cloudera Data Visualization is in.
   **/
  @JsonProperty("resourcePool")
  public String getResourcePool() {
    return resourcePool;
  }

  /**
   * Setter for resourcePool.
   * The name of the Resource Pool the Cloudera Data Visualization is in.
   **/
  public void setResourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
  }

  /**
   * Getter for userGroups.
   * User groups that are allowed to access the Data Visualization.
   **/
  @JsonProperty("userGroups")
  public List<String> getUserGroups() {
    return userGroups;
  }

  /**
   * Setter for userGroups.
   * User groups that are allowed to access the Data Visualization.
   **/
  public void setUserGroups(List<String> userGroups) {
    this.userGroups = userGroups;
  }

  /**
   * Getter for adminGroups.
   * Admin groups that are allowed to access the Data Visualization.
   **/
  @JsonProperty("adminGroups")
  public List<String> getAdminGroups() {
    return adminGroups;
  }

  /**
   * Setter for adminGroups.
   * Admin groups that are allowed to access the Data Visualization.
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
    DataVisualizationSummary dataVisualizationSummary = (DataVisualizationSummary) o;
    if (!Objects.equals(this.id, dataVisualizationSummary.id)) {
      return false;
    }
    if (!Objects.equals(this.name, dataVisualizationSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.status, dataVisualizationSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.imageVersion, dataVisualizationSummary.imageVersion)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, dataVisualizationSummary.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.size, dataVisualizationSummary.size)) {
      return false;
    }
    if (!Objects.equals(this.resourcePool, dataVisualizationSummary.resourcePool)) {
      return false;
    }
    if (!Objects.equals(this.userGroups, dataVisualizationSummary.userGroups)) {
      return false;
    }
    if (!Objects.equals(this.adminGroups, dataVisualizationSummary.adminGroups)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, imageVersion, creatorCrn, size, resourcePool, userGroups, adminGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataVisualizationSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
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

