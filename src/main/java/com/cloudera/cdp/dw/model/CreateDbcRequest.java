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

/**
 * Request object for the createDbc method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-09-29T12:28:19.090-07:00")
public class CreateDbcRequest  {

  /**
   * ID of cluster where Database Catalog should be created.
   **/
  private String clusterId = null;

  /**
   * Name of the Database Catalog.
   **/
  private String name = null;

  /**
   * Load demo data into the Database Catalog?
   **/
  private Boolean loadDemoData = null;

  /**
   * Version of the Database Catalog.
   **/
  private String imageVersion = "";

  /**
   * Getter for clusterId.
   * ID of cluster where Database Catalog should be created.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of cluster where Database Catalog should be created.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for name.
   * Name of the Database Catalog.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the Database Catalog.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for loadDemoData.
   * Load demo data into the Database Catalog?
   **/
  @JsonProperty("loadDemoData")
  public Boolean getLoadDemoData() {
    return loadDemoData;
  }

  /**
   * Setter for loadDemoData.
   * Load demo data into the Database Catalog?
   **/
  public void setLoadDemoData(Boolean loadDemoData) {
    this.loadDemoData = loadDemoData;
  }

  /**
   * Getter for imageVersion.
   * Version of the Database Catalog.
   **/
  @JsonProperty("imageVersion")
  public String getImageVersion() {
    return imageVersion;
  }

  /**
   * Setter for imageVersion.
   * Version of the Database Catalog.
   **/
  public void setImageVersion(String imageVersion) {
    this.imageVersion = imageVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbcRequest createDbcRequest = (CreateDbcRequest) o;
    if (!Objects.equals(this.clusterId, createDbcRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.name, createDbcRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.loadDemoData, createDbcRequest.loadDemoData)) {
      return false;
    }
    if (!Objects.equals(this.imageVersion, createDbcRequest.imageVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, name, loadDemoData, imageVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbcRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    loadDemoData: ").append(toIndentedString(loadDemoData)).append("\n");
    sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
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

