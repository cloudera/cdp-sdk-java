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
 * Request object to Data Hub upgrade preparation. This command indicates the upgrade preparation for a specific image or a selected runtime version. Important to note that the imageId or the runtime parameter must be present in the request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-10T17:48:30.915-08:00")
public class PrepareClusterUpgradeRequest  {

  /**
   * The name or CRN of the Data Hub.
   **/
  private String cluster = null;

  /**
   * The ID of an image to upgrade to.
   **/
  private String imageId = null;

  /**
   * The runtime version to upgrade to.
   **/
  private String runtime = null;

  /**
   * Getter for cluster.
   * The name or CRN of the Data Hub.
   **/
  @JsonProperty("cluster")
  public String getCluster() {
    return cluster;
  }

  /**
   * Setter for cluster.
   * The name or CRN of the Data Hub.
   **/
  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  /**
   * Getter for imageId.
   * The ID of an image to upgrade to.
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * The ID of an image to upgrade to.
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  /**
   * Getter for runtime.
   * The runtime version to upgrade to.
   **/
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }

  /**
   * Setter for runtime.
   * The runtime version to upgrade to.
   **/
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareClusterUpgradeRequest prepareClusterUpgradeRequest = (PrepareClusterUpgradeRequest) o;
    if (!Objects.equals(this.cluster, prepareClusterUpgradeRequest.cluster)) {
      return false;
    }
    if (!Objects.equals(this.imageId, prepareClusterUpgradeRequest.imageId)) {
      return false;
    }
    if (!Objects.equals(this.runtime, prepareClusterUpgradeRequest.runtime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, imageId, runtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareClusterUpgradeRequest {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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

