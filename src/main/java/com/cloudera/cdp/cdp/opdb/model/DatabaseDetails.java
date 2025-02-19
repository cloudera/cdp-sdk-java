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
import java.time.ZonedDateTime;

/**
 * Details of the databases.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-18T18:28:45.825-08:00")
public class DatabaseDetails  {

  /**
   * The name of the database.
   **/
  private String databaseName = null;

  /**
   * environment crn
   **/
  private String environmentCrn = null;

  /**
   * database crn
   **/
  private String crn = null;

  /**
   * The creation time of the database
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Status of the database creation
   **/
  private String status = null;

  /**
   * Crn of the creator
   **/
  private String creatorCrn = null;

  /**
   * Database version
   **/
  private String dbVersion = null;

  /**
   * Hue endpoint
   **/
  private String hueEndpoint = null;

  /**
   * Environment name
   **/
  private String environmentName = null;

  /**
   * HBase cloud storage location
   **/
  private String storageLocation = null;

  /**
   * Internal cluster name for this database
   **/
  private String internalName = null;

  /**
   * Number of gateway nodes for the database.
   **/
  private Integer gatewayNodesCount = null;

  /**
   * Number of REST Worker nodes for the database.
   **/
  private Integer restworkerNodesCount = null;

  /**
   * Getter for databaseName.
   * The name of the database.
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * The name of the database.
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for environmentCrn.
   * environment crn
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * environment crn
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for crn.
   * database crn
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * database crn
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for creationDate.
   * The creation time of the database
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The creation time of the database
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for status.
   * Status of the database creation
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the database creation
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creatorCrn.
   * Crn of the creator
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * Crn of the creator
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for dbVersion.
   * Database version
   **/
  @JsonProperty("dbVersion")
  public String getDbVersion() {
    return dbVersion;
  }

  /**
   * Setter for dbVersion.
   * Database version
   **/
  public void setDbVersion(String dbVersion) {
    this.dbVersion = dbVersion;
  }

  /**
   * Getter for hueEndpoint.
   * Hue endpoint
   **/
  @JsonProperty("hueEndpoint")
  public String getHueEndpoint() {
    return hueEndpoint;
  }

  /**
   * Setter for hueEndpoint.
   * Hue endpoint
   **/
  public void setHueEndpoint(String hueEndpoint) {
    this.hueEndpoint = hueEndpoint;
  }

  /**
   * Getter for environmentName.
   * Environment name
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Environment name
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for storageLocation.
   * HBase cloud storage location
   **/
  @JsonProperty("storageLocation")
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * Setter for storageLocation.
   * HBase cloud storage location
   **/
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  /**
   * Getter for internalName.
   * Internal cluster name for this database
   **/
  @JsonProperty("internalName")
  public String getInternalName() {
    return internalName;
  }

  /**
   * Setter for internalName.
   * Internal cluster name for this database
   **/
  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }

  /**
   * Getter for gatewayNodesCount.
   * Number of gateway nodes for the database.
   **/
  @JsonProperty("gatewayNodesCount")
  public Integer getGatewayNodesCount() {
    return gatewayNodesCount;
  }

  /**
   * Setter for gatewayNodesCount.
   * Number of gateway nodes for the database.
   **/
  public void setGatewayNodesCount(Integer gatewayNodesCount) {
    this.gatewayNodesCount = gatewayNodesCount;
  }

  /**
   * Getter for restworkerNodesCount.
   * Number of REST Worker nodes for the database.
   **/
  @JsonProperty("restworkerNodesCount")
  public Integer getRestworkerNodesCount() {
    return restworkerNodesCount;
  }

  /**
   * Setter for restworkerNodesCount.
   * Number of REST Worker nodes for the database.
   **/
  public void setRestworkerNodesCount(Integer restworkerNodesCount) {
    this.restworkerNodesCount = restworkerNodesCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseDetails databaseDetails = (DatabaseDetails) o;
    if (!Objects.equals(this.databaseName, databaseDetails.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, databaseDetails.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.crn, databaseDetails.crn)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, databaseDetails.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.status, databaseDetails.status)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, databaseDetails.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.dbVersion, databaseDetails.dbVersion)) {
      return false;
    }
    if (!Objects.equals(this.hueEndpoint, databaseDetails.hueEndpoint)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, databaseDetails.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.storageLocation, databaseDetails.storageLocation)) {
      return false;
    }
    if (!Objects.equals(this.internalName, databaseDetails.internalName)) {
      return false;
    }
    if (!Objects.equals(this.gatewayNodesCount, databaseDetails.gatewayNodesCount)) {
      return false;
    }
    if (!Objects.equals(this.restworkerNodesCount, databaseDetails.restworkerNodesCount)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, environmentCrn, crn, creationDate, status, creatorCrn, dbVersion, hueEndpoint, environmentName, storageLocation, internalName, gatewayNodesCount, restworkerNodesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseDetails {\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    dbVersion: ").append(toIndentedString(dbVersion)).append("\n");
    sb.append("    hueEndpoint: ").append(toIndentedString(hueEndpoint)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    gatewayNodesCount: ").append(toIndentedString(gatewayNodesCount)).append("\n");
    sb.append("    restworkerNodesCount: ").append(toIndentedString(restworkerNodesCount)).append("\n");
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

