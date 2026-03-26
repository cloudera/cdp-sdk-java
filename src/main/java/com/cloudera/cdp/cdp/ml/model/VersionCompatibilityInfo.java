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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Version compatibility information for a Cloudera AI Inference Service instance.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-25T09:53:04.780-07:00")
public class VersionCompatibilityInfo  {

  /**
   * The expected/recommended version from config store.
   **/
  private String expectedVersion = null;

  /**
   * The installed version on this instance.
   **/
  private String installedVersion = null;

  /**
   * Whether the installed version is compatible (installed >= expected).
   **/
  private Boolean isCompatible = null;

  /**
   * Getter for expectedVersion.
   * The expected/recommended version from config store.
   **/
  @JsonProperty("expectedVersion")
  public String getExpectedVersion() {
    return expectedVersion;
  }

  /**
   * Setter for expectedVersion.
   * The expected/recommended version from config store.
   **/
  public void setExpectedVersion(String expectedVersion) {
    this.expectedVersion = expectedVersion;
  }

  /**
   * Getter for installedVersion.
   * The installed version on this instance.
   **/
  @JsonProperty("installedVersion")
  public String getInstalledVersion() {
    return installedVersion;
  }

  /**
   * Setter for installedVersion.
   * The installed version on this instance.
   **/
  public void setInstalledVersion(String installedVersion) {
    this.installedVersion = installedVersion;
  }

  /**
   * Getter for isCompatible.
   * Whether the installed version is compatible (installed &gt;&#x3D; expected).
   **/
  @JsonProperty("isCompatible")
  public Boolean getIsCompatible() {
    return isCompatible;
  }

  /**
   * Setter for isCompatible.
   * Whether the installed version is compatible (installed &gt;&#x3D; expected).
   **/
  public void setIsCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionCompatibilityInfo versionCompatibilityInfo = (VersionCompatibilityInfo) o;
    if (!Objects.equals(this.expectedVersion, versionCompatibilityInfo.expectedVersion)) {
      return false;
    }
    if (!Objects.equals(this.installedVersion, versionCompatibilityInfo.installedVersion)) {
      return false;
    }
    if (!Objects.equals(this.isCompatible, versionCompatibilityInfo.isCompatible)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedVersion, installedVersion, isCompatible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionCompatibilityInfo {\n");
    sb.append("    expectedVersion: ").append(toIndentedString(expectedVersion)).append("\n");
    sb.append("    installedVersion: ").append(toIndentedString(installedVersion)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
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

