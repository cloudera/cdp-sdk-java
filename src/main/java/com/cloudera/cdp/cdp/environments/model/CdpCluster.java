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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.EnvValidation;
import com.cloudera.cdp.environments.model.ExposedService;
import java.util.*;

/**
 * Discovered CdpCluster object.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-22T17:07:46.783-08:00")
public class CdpCluster  {

  /**
   * Name of cluster.
   **/
  private String name = null;

  /**
   * Display name of cluster.
   **/
  private String displayName = null;

  /**
   * The Url to Cloudera Manager.
   **/
  private String cmUrl = null;

  /**
   * Version of Cloudera Manager.
   **/
  private String version = null;

  /**
   * List of exposed CDP DC services
   **/
  private List<ExposedService> exposedServices = new ArrayList<ExposedService>();

  /**
   * List of cluster validation message.
   **/
  private List<EnvValidation> clusterValidationMessages = new ArrayList<EnvValidation>();

  /**
   * Getter for name.
   * Name of cluster.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of cluster.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for displayName.
   * Display name of cluster.
   **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Setter for displayName.
   * Display name of cluster.
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Getter for cmUrl.
   * The Url to Cloudera Manager.
   **/
  @JsonProperty("cmUrl")
  public String getCmUrl() {
    return cmUrl;
  }

  /**
   * Setter for cmUrl.
   * The Url to Cloudera Manager.
   **/
  public void setCmUrl(String cmUrl) {
    this.cmUrl = cmUrl;
  }

  /**
   * Getter for version.
   * Version of Cloudera Manager.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * Version of Cloudera Manager.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for exposedServices.
   * List of exposed CDP DC services
   **/
  @JsonProperty("exposedServices")
  public List<ExposedService> getExposedServices() {
    return exposedServices;
  }

  /**
   * Setter for exposedServices.
   * List of exposed CDP DC services
   **/
  public void setExposedServices(List<ExposedService> exposedServices) {
    this.exposedServices = exposedServices;
  }

  /**
   * Getter for clusterValidationMessages.
   * List of cluster validation message.
   **/
  @JsonProperty("clusterValidationMessages")
  public List<EnvValidation> getClusterValidationMessages() {
    return clusterValidationMessages;
  }

  /**
   * Setter for clusterValidationMessages.
   * List of cluster validation message.
   **/
  public void setClusterValidationMessages(List<EnvValidation> clusterValidationMessages) {
    this.clusterValidationMessages = clusterValidationMessages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdpCluster cdpCluster = (CdpCluster) o;
    if (!Objects.equals(this.name, cdpCluster.name)) {
      return false;
    }
    if (!Objects.equals(this.displayName, cdpCluster.displayName)) {
      return false;
    }
    if (!Objects.equals(this.cmUrl, cdpCluster.cmUrl)) {
      return false;
    }
    if (!Objects.equals(this.version, cdpCluster.version)) {
      return false;
    }
    if (!Objects.equals(this.exposedServices, cdpCluster.exposedServices)) {
      return false;
    }
    if (!Objects.equals(this.clusterValidationMessages, cdpCluster.clusterValidationMessages)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, cmUrl, version, exposedServices, clusterValidationMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdpCluster {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    cmUrl: ").append(toIndentedString(cmUrl)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    exposedServices: ").append(toIndentedString(exposedServices)).append("\n");
    sb.append("    clusterValidationMessages: ").append(toIndentedString(clusterValidationMessages)).append("\n");
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

