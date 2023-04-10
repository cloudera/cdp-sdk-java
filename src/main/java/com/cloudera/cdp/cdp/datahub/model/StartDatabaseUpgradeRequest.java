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
 * Request object for Data Hub database upgrade.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-10T13:23:57.787-07:00")
public class StartDatabaseUpgradeRequest  {

  /**
   * The name or CRN of the Data Hub.
   **/
  private String cluster = null;

  /**
   * The database engine major version to upgrade to.
   **/
  private String targetVersion = null;

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
   * Getter for targetVersion.
   * The database engine major version to upgrade to.
   **/
  @JsonProperty("targetVersion")
  public String getTargetVersion() {
    return targetVersion;
  }

  /**
   * Setter for targetVersion.
   * The database engine major version to upgrade to.
   **/
  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartDatabaseUpgradeRequest startDatabaseUpgradeRequest = (StartDatabaseUpgradeRequest) o;
    if (!Objects.equals(this.cluster, startDatabaseUpgradeRequest.cluster)) {
      return false;
    }
    if (!Objects.equals(this.targetVersion, startDatabaseUpgradeRequest.targetVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, targetVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartDatabaseUpgradeRequest {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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

