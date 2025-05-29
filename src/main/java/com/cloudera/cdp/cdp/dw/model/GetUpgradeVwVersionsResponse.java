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
 * Response object for the getUpgradeVwVersions method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:18.456-07:00")
public class GetUpgradeVwVersionsResponse extends CdpResponse {

  /**
   * The latest available CDW version.
   **/
  private String latestVersion = null;

  /**
   * The latest compatible CDW version.
   **/
  private String compatibleVersion = null;

  /**
   * The latest available CDP version.
   **/
  private String latestCDPVersion = null;

  /**
   * The latest compatible CDP version.
   **/
  private String compatibleCDPVersion = null;

  /**
   * Getter for latestVersion.
   * The latest available CDW version.
   **/
  @JsonProperty("latestVersion")
  public String getLatestVersion() {
    return latestVersion;
  }

  /**
   * Setter for latestVersion.
   * The latest available CDW version.
   **/
  public void setLatestVersion(String latestVersion) {
    this.latestVersion = latestVersion;
  }

  /**
   * Getter for compatibleVersion.
   * The latest compatible CDW version.
   **/
  @JsonProperty("compatibleVersion")
  public String getCompatibleVersion() {
    return compatibleVersion;
  }

  /**
   * Setter for compatibleVersion.
   * The latest compatible CDW version.
   **/
  public void setCompatibleVersion(String compatibleVersion) {
    this.compatibleVersion = compatibleVersion;
  }

  /**
   * Getter for latestCDPVersion.
   * The latest available CDP version.
   **/
  @JsonProperty("latestCDPVersion")
  public String getLatestCDPVersion() {
    return latestCDPVersion;
  }

  /**
   * Setter for latestCDPVersion.
   * The latest available CDP version.
   **/
  public void setLatestCDPVersion(String latestCDPVersion) {
    this.latestCDPVersion = latestCDPVersion;
  }

  /**
   * Getter for compatibleCDPVersion.
   * The latest compatible CDP version.
   **/
  @JsonProperty("compatibleCDPVersion")
  public String getCompatibleCDPVersion() {
    return compatibleCDPVersion;
  }

  /**
   * Setter for compatibleCDPVersion.
   * The latest compatible CDP version.
   **/
  public void setCompatibleCDPVersion(String compatibleCDPVersion) {
    this.compatibleCDPVersion = compatibleCDPVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUpgradeVwVersionsResponse getUpgradeVwVersionsResponse = (GetUpgradeVwVersionsResponse) o;
    if (!Objects.equals(this.latestVersion, getUpgradeVwVersionsResponse.latestVersion)) {
      return false;
    }
    if (!Objects.equals(this.compatibleVersion, getUpgradeVwVersionsResponse.compatibleVersion)) {
      return false;
    }
    if (!Objects.equals(this.latestCDPVersion, getUpgradeVwVersionsResponse.latestCDPVersion)) {
      return false;
    }
    if (!Objects.equals(this.compatibleCDPVersion, getUpgradeVwVersionsResponse.compatibleCDPVersion)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestVersion, compatibleVersion, latestCDPVersion, compatibleCDPVersion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUpgradeVwVersionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    compatibleVersion: ").append(toIndentedString(compatibleVersion)).append("\n");
    sb.append("    latestCDPVersion: ").append(toIndentedString(latestCDPVersion)).append("\n");
    sb.append("    compatibleCDPVersion: ").append(toIndentedString(compatibleCDPVersion)).append("\n");
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

