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
 * Request object for the rebuildVw method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-29T13:23:32.620-08:00")
public class RebuildVwRequest  {

  /**
   * ID of the Virtual Warehouse's cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Virtual Warehouse to rebuild.
   **/
  private String vwId = null;

  /**
   * Set it to true to keep the current image version. Set it to false to use the latest image version when rebuilding the Virtual Warehouse. If not provided, the latest image version will be set.
   **/
  private Boolean keepImageVersion = null;

  /**
   * Getter for clusterId.
   * ID of the Virtual Warehouse&#39;s cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of the Virtual Warehouse&#39;s cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for vwId.
   * ID of the Virtual Warehouse to rebuild.
   **/
  @JsonProperty("vwId")
  public String getVwId() {
    return vwId;
  }

  /**
   * Setter for vwId.
   * ID of the Virtual Warehouse to rebuild.
   **/
  public void setVwId(String vwId) {
    this.vwId = vwId;
  }

  /**
   * Getter for keepImageVersion.
   * Set it to true to keep the current image version. Set it to false to use the latest image version when rebuilding the Virtual Warehouse. If not provided, the latest image version will be set.
   **/
  @JsonProperty("keepImageVersion")
  public Boolean getKeepImageVersion() {
    return keepImageVersion;
  }

  /**
   * Setter for keepImageVersion.
   * Set it to true to keep the current image version. Set it to false to use the latest image version when rebuilding the Virtual Warehouse. If not provided, the latest image version will be set.
   **/
  public void setKeepImageVersion(Boolean keepImageVersion) {
    this.keepImageVersion = keepImageVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebuildVwRequest rebuildVwRequest = (RebuildVwRequest) o;
    if (!Objects.equals(this.clusterId, rebuildVwRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.vwId, rebuildVwRequest.vwId)) {
      return false;
    }
    if (!Objects.equals(this.keepImageVersion, rebuildVwRequest.keepImageVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, vwId, keepImageVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebuildVwRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    vwId: ").append(toIndentedString(vwId)).append("\n");
    sb.append("    keepImageVersion: ").append(toIndentedString(keepImageVersion)).append("\n");
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

