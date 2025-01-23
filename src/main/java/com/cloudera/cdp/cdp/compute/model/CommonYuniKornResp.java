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

/**
 * YuniKorn response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:43.033-08:00")
public class CommonYuniKornResp  {

  /**
   * Flag to indicate if yunikorn is enabled.
   **/
  private Boolean enabled = null;

  /**
   * Version. Deprecated.
   **/
  private String version = null;

  /**
   * The app sorting policy. Deprecated.
   **/
  private String appSortingPolicy = null;

  /**
   * The node sorting policy. Deprecated.
   **/
  private String nodeSortingPolicy = null;

  /**
   * Getter for enabled.
   * Flag to indicate if yunikorn is enabled.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Flag to indicate if yunikorn is enabled.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for version.
   * Version. Deprecated.
   **/
  @Deprecated
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * Version. Deprecated.
   **/
  @Deprecated
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for appSortingPolicy.
   * The app sorting policy. Deprecated.
   **/
  @Deprecated
  @JsonProperty("appSortingPolicy")
  public String getAppSortingPolicy() {
    return appSortingPolicy;
  }

  /**
   * Setter for appSortingPolicy.
   * The app sorting policy. Deprecated.
   **/
  @Deprecated
  public void setAppSortingPolicy(String appSortingPolicy) {
    this.appSortingPolicy = appSortingPolicy;
  }

  /**
   * Getter for nodeSortingPolicy.
   * The node sorting policy. Deprecated.
   **/
  @Deprecated
  @JsonProperty("nodeSortingPolicy")
  public String getNodeSortingPolicy() {
    return nodeSortingPolicy;
  }

  /**
   * Setter for nodeSortingPolicy.
   * The node sorting policy. Deprecated.
   **/
  @Deprecated
  public void setNodeSortingPolicy(String nodeSortingPolicy) {
    this.nodeSortingPolicy = nodeSortingPolicy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonYuniKornResp commonYuniKornResp = (CommonYuniKornResp) o;
    if (!Objects.equals(this.enabled, commonYuniKornResp.enabled)) {
      return false;
    }
    if (!Objects.equals(this.version, commonYuniKornResp.version)) {
      return false;
    }
    if (!Objects.equals(this.appSortingPolicy, commonYuniKornResp.appSortingPolicy)) {
      return false;
    }
    if (!Objects.equals(this.nodeSortingPolicy, commonYuniKornResp.nodeSortingPolicy)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, version, appSortingPolicy, nodeSortingPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonYuniKornResp {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    appSortingPolicy: ").append(toIndentedString(appSortingPolicy)).append("\n");
    sb.append("    nodeSortingPolicy: ").append(toIndentedString(nodeSortingPolicy)).append("\n");
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

