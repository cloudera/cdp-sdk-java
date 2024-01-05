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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for Data Lake database upgrade.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-05T09:16:30.675-08:00")
public class StartDatabaseUpgradeRequest  {

  /**
   * The name or CRN of the Data Lake.
   **/
  private String datalake = null;

  /**
   * The database engine major version to upgrade to.
   **/
  private String targetVersion = null;

  /**
   * Start the database upgrade flow even if the source and target versions are the same. Can be used to reinitiate an upgrade after a failure.
   **/
  private Boolean force = null;

  /**
   * Getter for datalake.
   * The name or CRN of the Data Lake.
   **/
  @JsonProperty("datalake")
  public String getDatalake() {
    return datalake;
  }

  /**
   * Setter for datalake.
   * The name or CRN of the Data Lake.
   **/
  public void setDatalake(String datalake) {
    this.datalake = datalake;
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

  /**
   * Getter for force.
   * Start the database upgrade flow even if the source and target versions are the same. Can be used to reinitiate an upgrade after a failure.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Start the database upgrade flow even if the source and target versions are the same. Can be used to reinitiate an upgrade after a failure.
   **/
  public void setForce(Boolean force) {
    this.force = force;
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
    if (!Objects.equals(this.datalake, startDatabaseUpgradeRequest.datalake)) {
      return false;
    }
    if (!Objects.equals(this.targetVersion, startDatabaseUpgradeRequest.targetVersion)) {
      return false;
    }
    if (!Objects.equals(this.force, startDatabaseUpgradeRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalake, targetVersion, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartDatabaseUpgradeRequest {\n");
    sb.append("    datalake: ").append(toIndentedString(datalake)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

