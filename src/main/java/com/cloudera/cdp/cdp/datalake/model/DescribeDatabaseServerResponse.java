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
import com.cloudera.cdp.datalake.model.DatabaseServerSslConfig;
import java.time.ZonedDateTime;

/**
 * Response object for obtaining Database Server details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:34.693-07:00")
public class DescribeDatabaseServerResponse extends CdpResponse {

  /**
   * CRN of the database server
   **/
  private String crn = null;

  /**
   * Name of the database server
   **/
  private String name = null;

  /**
   * Description of the database server
   **/
  private String description = null;

  /**
   * CRN of the environment of the database server
   **/
  private String environmentCrn = null;

  /**
   * Host of the database server
   **/
  private String host = null;

  /**
   * Port of the database server
   **/
  private Integer port = null;

  /**
   * Name of the database vendor (MYSQL, POSTGRES, ...)
   **/
  private String databaseVendor = null;

  /**
   * Display name of the database vendor (MySQL, PostgreSQL, ...)
   **/
  private String databaseVendorDisplayName = null;

  /**
   * Creation date of the database server
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Ownership status of the database server
   **/
  private String resourceStatus = null;

  /**
   * Status of the database server stack
   **/
  private String status = null;

  /**
   * Additional status information about the database server stack
   **/
  private String statusReason = null;

  /**
   * CRN of the cluster of the database server
   **/
  private String clusterCrn = null;

  /**
   * SSL configuration of the database server
   **/
  private DatabaseServerSslConfig sslConfig = null;

  /**
   * Getter for crn.
   * CRN of the database server
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the database server
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * Name of the database server
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the database server
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * Description of the database server
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the database server
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for environmentCrn.
   * CRN of the environment of the database server
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * CRN of the environment of the database server
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for host.
   * Host of the database server
   **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  /**
   * Setter for host.
   * Host of the database server
   **/
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Getter for port.
   * Port of the database server
   **/
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  /**
   * Setter for port.
   * Port of the database server
   **/
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Getter for databaseVendor.
   * Name of the database vendor (MYSQL, POSTGRES, ...)
   **/
  @JsonProperty("databaseVendor")
  public String getDatabaseVendor() {
    return databaseVendor;
  }

  /**
   * Setter for databaseVendor.
   * Name of the database vendor (MYSQL, POSTGRES, ...)
   **/
  public void setDatabaseVendor(String databaseVendor) {
    this.databaseVendor = databaseVendor;
  }

  /**
   * Getter for databaseVendorDisplayName.
   * Display name of the database vendor (MySQL, PostgreSQL, ...)
   **/
  @JsonProperty("databaseVendorDisplayName")
  public String getDatabaseVendorDisplayName() {
    return databaseVendorDisplayName;
  }

  /**
   * Setter for databaseVendorDisplayName.
   * Display name of the database vendor (MySQL, PostgreSQL, ...)
   **/
  public void setDatabaseVendorDisplayName(String databaseVendorDisplayName) {
    this.databaseVendorDisplayName = databaseVendorDisplayName;
  }

  /**
   * Getter for creationDate.
   * Creation date of the database server
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of the database server
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for resourceStatus.
   * Ownership status of the database server
   **/
  @JsonProperty("resourceStatus")
  public String getResourceStatus() {
    return resourceStatus;
  }

  /**
   * Setter for resourceStatus.
   * Ownership status of the database server
   **/
  public void setResourceStatus(String resourceStatus) {
    this.resourceStatus = resourceStatus;
  }

  /**
   * Getter for status.
   * Status of the database server stack
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the database server stack
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for statusReason.
   * Additional status information about the database server stack
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * Additional status information about the database server stack
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * Getter for clusterCrn.
   * CRN of the cluster of the database server
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * CRN of the cluster of the database server
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for sslConfig.
   * SSL configuration of the database server
   **/
  @JsonProperty("sslConfig")
  public DatabaseServerSslConfig getSslConfig() {
    return sslConfig;
  }

  /**
   * Setter for sslConfig.
   * SSL configuration of the database server
   **/
  public void setSslConfig(DatabaseServerSslConfig sslConfig) {
    this.sslConfig = sslConfig;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDatabaseServerResponse describeDatabaseServerResponse = (DescribeDatabaseServerResponse) o;
    if (!Objects.equals(this.crn, describeDatabaseServerResponse.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, describeDatabaseServerResponse.name)) {
      return false;
    }
    if (!Objects.equals(this.description, describeDatabaseServerResponse.description)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, describeDatabaseServerResponse.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.host, describeDatabaseServerResponse.host)) {
      return false;
    }
    if (!Objects.equals(this.port, describeDatabaseServerResponse.port)) {
      return false;
    }
    if (!Objects.equals(this.databaseVendor, describeDatabaseServerResponse.databaseVendor)) {
      return false;
    }
    if (!Objects.equals(this.databaseVendorDisplayName, describeDatabaseServerResponse.databaseVendorDisplayName)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, describeDatabaseServerResponse.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.resourceStatus, describeDatabaseServerResponse.resourceStatus)) {
      return false;
    }
    if (!Objects.equals(this.status, describeDatabaseServerResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, describeDatabaseServerResponse.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, describeDatabaseServerResponse.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.sslConfig, describeDatabaseServerResponse.sslConfig)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, description, environmentCrn, host, port, databaseVendor, databaseVendorDisplayName, creationDate, resourceStatus, status, statusReason, clusterCrn, sslConfig, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDatabaseServerResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    databaseVendor: ").append(toIndentedString(databaseVendor)).append("\n");
    sb.append("    databaseVendorDisplayName: ").append(toIndentedString(databaseVendorDisplayName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    sslConfig: ").append(toIndentedString(sslConfig)).append("\n");
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

