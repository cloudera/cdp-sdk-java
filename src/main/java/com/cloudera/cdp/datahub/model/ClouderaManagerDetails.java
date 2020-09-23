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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Cloudera Manager details.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-09-23T14:13:40.591-07:00")
public class ClouderaManagerDetails  {

  /**
   * Cloudera Manager version.
   **/
  private String version = null;

  /**
   * CDP Platform version.
   **/
  private String platformVersion = null;

  /**
   * Getter for version.
   * Cloudera Manager version.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * Cloudera Manager version.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for platformVersion.
   * CDP Platform version.
   **/
  @JsonProperty("platformVersion")
  public String getPlatformVersion() {
    return platformVersion;
  }

  /**
   * Setter for platformVersion.
   * CDP Platform version.
   **/
  public void setPlatformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClouderaManagerDetails clouderaManagerDetails = (ClouderaManagerDetails) o;
    if (!Objects.equals(this.version, clouderaManagerDetails.version)) {
      return false;
    }
    if (!Objects.equals(this.platformVersion, clouderaManagerDetails.platformVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, platformVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClouderaManagerDetails {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
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
