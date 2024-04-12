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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.opdb.model.ComponentsVersion;
import java.util.*;

/**
 * Response with upgrade availability of CDP Runtime and Operating System for a database.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-11T13:44:53.478-07:00")
public class DescribeUpgradeDatabaseResponse extends CdpResponse {

  /**
   * The reason whether upgrade request is accepted or why it is not possible.
   **/
  private String statusReason = null;

  /**
   * Versions of currently deployed CDP runtime and operating system.
   **/
  private ComponentsVersion currentComponentVersion = null;

  /**
   * List of available versions for upgrade.
   **/
  private List<ComponentsVersion> availableComponentVersions = new ArrayList<ComponentsVersion>();

  /**
   * Is an OS upgrade available.
   **/
  private Boolean isOSUpgradeAvailable = null;

  /**
   * Is a CDP Runtime upgrade available.
   **/
  private Boolean isRuntimeUpgradeAvailable = null;

  /**
   * Getter for statusReason.
   * The reason whether upgrade request is accepted or why it is not possible.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * The reason whether upgrade request is accepted or why it is not possible.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * Getter for currentComponentVersion.
   * Versions of currently deployed CDP runtime and operating system.
   **/
  @JsonProperty("currentComponentVersion")
  public ComponentsVersion getCurrentComponentVersion() {
    return currentComponentVersion;
  }

  /**
   * Setter for currentComponentVersion.
   * Versions of currently deployed CDP runtime and operating system.
   **/
  public void setCurrentComponentVersion(ComponentsVersion currentComponentVersion) {
    this.currentComponentVersion = currentComponentVersion;
  }

  /**
   * Getter for availableComponentVersions.
   * List of available versions for upgrade.
   **/
  @JsonProperty("availableComponentVersions")
  public List<ComponentsVersion> getAvailableComponentVersions() {
    return availableComponentVersions;
  }

  /**
   * Setter for availableComponentVersions.
   * List of available versions for upgrade.
   **/
  public void setAvailableComponentVersions(List<ComponentsVersion> availableComponentVersions) {
    this.availableComponentVersions = availableComponentVersions;
  }

  /**
   * Getter for isOSUpgradeAvailable.
   * Is an OS upgrade available.
   **/
  @JsonProperty("isOSUpgradeAvailable")
  public Boolean getIsOSUpgradeAvailable() {
    return isOSUpgradeAvailable;
  }

  /**
   * Setter for isOSUpgradeAvailable.
   * Is an OS upgrade available.
   **/
  public void setIsOSUpgradeAvailable(Boolean isOSUpgradeAvailable) {
    this.isOSUpgradeAvailable = isOSUpgradeAvailable;
  }

  /**
   * Getter for isRuntimeUpgradeAvailable.
   * Is a CDP Runtime upgrade available.
   **/
  @JsonProperty("isRuntimeUpgradeAvailable")
  public Boolean getIsRuntimeUpgradeAvailable() {
    return isRuntimeUpgradeAvailable;
  }

  /**
   * Setter for isRuntimeUpgradeAvailable.
   * Is a CDP Runtime upgrade available.
   **/
  public void setIsRuntimeUpgradeAvailable(Boolean isRuntimeUpgradeAvailable) {
    this.isRuntimeUpgradeAvailable = isRuntimeUpgradeAvailable;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeUpgradeDatabaseResponse describeUpgradeDatabaseResponse = (DescribeUpgradeDatabaseResponse) o;
    if (!Objects.equals(this.statusReason, describeUpgradeDatabaseResponse.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.currentComponentVersion, describeUpgradeDatabaseResponse.currentComponentVersion)) {
      return false;
    }
    if (!Objects.equals(this.availableComponentVersions, describeUpgradeDatabaseResponse.availableComponentVersions)) {
      return false;
    }
    if (!Objects.equals(this.isOSUpgradeAvailable, describeUpgradeDatabaseResponse.isOSUpgradeAvailable)) {
      return false;
    }
    if (!Objects.equals(this.isRuntimeUpgradeAvailable, describeUpgradeDatabaseResponse.isRuntimeUpgradeAvailable)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusReason, currentComponentVersion, availableComponentVersions, isOSUpgradeAvailable, isRuntimeUpgradeAvailable, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeUpgradeDatabaseResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    currentComponentVersion: ").append(toIndentedString(currentComponentVersion)).append("\n");
    sb.append("    availableComponentVersions: ").append(toIndentedString(availableComponentVersions)).append("\n");
    sb.append("    isOSUpgradeAvailable: ").append(toIndentedString(isOSUpgradeAvailable)).append("\n");
    sb.append("    isRuntimeUpgradeAvailable: ").append(toIndentedString(isRuntimeUpgradeAvailable)).append("\n");
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

