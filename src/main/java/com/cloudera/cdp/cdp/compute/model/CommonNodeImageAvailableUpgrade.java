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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Structure to list the currently used images and the new upgrades available.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:22.985-07:00")
public class CommonNodeImageAvailableUpgrade  {

  /**
   * Instance group name.
   **/
  private String instanceGroup = null;

  /**
   * Currently used node image version.
   **/
  private String current = null;

  /**
   * Available node image upgrade versions.
   **/
  private List<String> upgrades = new ArrayList<String>();

  /**
   * Getter for instanceGroup.
   * Instance group name.
   **/
  @JsonProperty("instanceGroup")
  public String getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Setter for instanceGroup.
   * Instance group name.
   **/
  public void setInstanceGroup(String instanceGroup) {
    this.instanceGroup = instanceGroup;
  }

  /**
   * Getter for current.
   * Currently used node image version.
   **/
  @JsonProperty("current")
  public String getCurrent() {
    return current;
  }

  /**
   * Setter for current.
   * Currently used node image version.
   **/
  public void setCurrent(String current) {
    this.current = current;
  }

  /**
   * Getter for upgrades.
   * Available node image upgrade versions.
   **/
  @JsonProperty("upgrades")
  public List<String> getUpgrades() {
    return upgrades;
  }

  /**
   * Setter for upgrades.
   * Available node image upgrade versions.
   **/
  public void setUpgrades(List<String> upgrades) {
    this.upgrades = upgrades;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonNodeImageAvailableUpgrade commonNodeImageAvailableUpgrade = (CommonNodeImageAvailableUpgrade) o;
    if (!Objects.equals(this.instanceGroup, commonNodeImageAvailableUpgrade.instanceGroup)) {
      return false;
    }
    if (!Objects.equals(this.current, commonNodeImageAvailableUpgrade.current)) {
      return false;
    }
    if (!Objects.equals(this.upgrades, commonNodeImageAvailableUpgrade.upgrades)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceGroup, current, upgrades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonNodeImageAvailableUpgrade {\n");
    sb.append("    instanceGroup: ").append(toIndentedString(instanceGroup)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    upgrades: ").append(toIndentedString(upgrades)).append("\n");
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

