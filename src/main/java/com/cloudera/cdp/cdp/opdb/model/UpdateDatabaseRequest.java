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
import com.cloudera.cdp.opdb.model.AutoScalingParameters;

/**
 * A request to update the database
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:44.631-07:00")
public class UpdateDatabaseRequest  {

  /**
   * environment name
   **/
  private String environmentName = null;

  /**
   * database name
   **/
  private String databaseName = null;

  /**
   * Parameters to configure the scaling policy
   **/
  private AutoScalingParameters autoScalingParameters = null;

  /**
   * The desired number of strong meta servers for this database. A positive, non-zero number is required. Use removeStrongMetaServers to remove strong meta servers entirely. Requires the COD_STRONG_META_SERVERS entitlement.
   **/
  private Integer numDesiredStrongMetaServers = null;

  /**
   * Removes any strong meta servers provisioned for this database. Requires the COD_STRONG_META_SERVERS entitlement.
   **/
  private Boolean removeStrongMetaServers = null;

  /**
   * Sets the desired number of REST Worker nodes for the database. A positive, non-zero number is required. Requires the COD_RESTWORKERS entitlement.
   **/
  private Integer numDesiredRestworkerNodes = null;

  /**
   * Removes any REST Worker nodes provisioned for this database. Requires the COD_RESTWORKERS entitlement.
   **/
  private Boolean removeRestworkerNodes = null;

  /**
   * Getter for environmentName.
   * environment name
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * environment name
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for databaseName.
   * database name
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * database name
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for autoScalingParameters.
   * Parameters to configure the scaling policy
   **/
  @JsonProperty("autoScalingParameters")
  public AutoScalingParameters getAutoScalingParameters() {
    return autoScalingParameters;
  }

  /**
   * Setter for autoScalingParameters.
   * Parameters to configure the scaling policy
   **/
  public void setAutoScalingParameters(AutoScalingParameters autoScalingParameters) {
    this.autoScalingParameters = autoScalingParameters;
  }

  /**
   * Getter for numDesiredStrongMetaServers.
   * The desired number of strong meta servers for this database. A positive, non-zero number is required. Use removeStrongMetaServers to remove strong meta servers entirely. Requires the COD_STRONG_META_SERVERS entitlement.
   **/
  @JsonProperty("numDesiredStrongMetaServers")
  public Integer getNumDesiredStrongMetaServers() {
    return numDesiredStrongMetaServers;
  }

  /**
   * Setter for numDesiredStrongMetaServers.
   * The desired number of strong meta servers for this database. A positive, non-zero number is required. Use removeStrongMetaServers to remove strong meta servers entirely. Requires the COD_STRONG_META_SERVERS entitlement.
   **/
  public void setNumDesiredStrongMetaServers(Integer numDesiredStrongMetaServers) {
    this.numDesiredStrongMetaServers = numDesiredStrongMetaServers;
  }

  /**
   * Getter for removeStrongMetaServers.
   * Removes any strong meta servers provisioned for this database. Requires the COD_STRONG_META_SERVERS entitlement.
   **/
  @JsonProperty("removeStrongMetaServers")
  public Boolean getRemoveStrongMetaServers() {
    return removeStrongMetaServers;
  }

  /**
   * Setter for removeStrongMetaServers.
   * Removes any strong meta servers provisioned for this database. Requires the COD_STRONG_META_SERVERS entitlement.
   **/
  public void setRemoveStrongMetaServers(Boolean removeStrongMetaServers) {
    this.removeStrongMetaServers = removeStrongMetaServers;
  }

  /**
   * Getter for numDesiredRestworkerNodes.
   * Sets the desired number of REST Worker nodes for the database. A positive, non-zero number is required. Requires the COD_RESTWORKERS entitlement.
   **/
  @JsonProperty("numDesiredRestworkerNodes")
  public Integer getNumDesiredRestworkerNodes() {
    return numDesiredRestworkerNodes;
  }

  /**
   * Setter for numDesiredRestworkerNodes.
   * Sets the desired number of REST Worker nodes for the database. A positive, non-zero number is required. Requires the COD_RESTWORKERS entitlement.
   **/
  public void setNumDesiredRestworkerNodes(Integer numDesiredRestworkerNodes) {
    this.numDesiredRestworkerNodes = numDesiredRestworkerNodes;
  }

  /**
   * Getter for removeRestworkerNodes.
   * Removes any REST Worker nodes provisioned for this database. Requires the COD_RESTWORKERS entitlement.
   **/
  @JsonProperty("removeRestworkerNodes")
  public Boolean getRemoveRestworkerNodes() {
    return removeRestworkerNodes;
  }

  /**
   * Setter for removeRestworkerNodes.
   * Removes any REST Worker nodes provisioned for this database. Requires the COD_RESTWORKERS entitlement.
   **/
  public void setRemoveRestworkerNodes(Boolean removeRestworkerNodes) {
    this.removeRestworkerNodes = removeRestworkerNodes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDatabaseRequest updateDatabaseRequest = (UpdateDatabaseRequest) o;
    if (!Objects.equals(this.environmentName, updateDatabaseRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, updateDatabaseRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.autoScalingParameters, updateDatabaseRequest.autoScalingParameters)) {
      return false;
    }
    if (!Objects.equals(this.numDesiredStrongMetaServers, updateDatabaseRequest.numDesiredStrongMetaServers)) {
      return false;
    }
    if (!Objects.equals(this.removeStrongMetaServers, updateDatabaseRequest.removeStrongMetaServers)) {
      return false;
    }
    if (!Objects.equals(this.numDesiredRestworkerNodes, updateDatabaseRequest.numDesiredRestworkerNodes)) {
      return false;
    }
    if (!Objects.equals(this.removeRestworkerNodes, updateDatabaseRequest.removeRestworkerNodes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, autoScalingParameters, numDesiredStrongMetaServers, removeStrongMetaServers, numDesiredRestworkerNodes, removeRestworkerNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDatabaseRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    autoScalingParameters: ").append(toIndentedString(autoScalingParameters)).append("\n");
    sb.append("    numDesiredStrongMetaServers: ").append(toIndentedString(numDesiredStrongMetaServers)).append("\n");
    sb.append("    removeStrongMetaServers: ").append(toIndentedString(removeStrongMetaServers)).append("\n");
    sb.append("    numDesiredRestworkerNodes: ").append(toIndentedString(numDesiredRestworkerNodes)).append("\n");
    sb.append("    removeRestworkerNodes: ").append(toIndentedString(removeRestworkerNodes)).append("\n");
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

