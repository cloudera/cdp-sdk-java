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
import java.time.ZonedDateTime;

/**
 * Details of the RDS attached to cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:16.679-07:00")
public class ClusterRdsDetails  {

  /**
   * ID of RDS.
   **/
  private Long id = null;

  /**
   * Name of RDS.
   **/
  private String name = null;

  /**
   * Description of RDS.
   **/
  private String description = null;

  /**
   * Connection URL of RDS.
   **/
  private String connectionURL = null;

  /**
   * SSL mode.
   **/
  private String sslMode = null;

  /**
   * Database engine.
   **/
  private String databaseEngine = null;

  /**
   * Connection driver.
   **/
  private String connectionDriver = null;

  /**
   * RDS creation date.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Stack version.
   **/
  private String stackVersion = null;

  /**
   * Status of RDS.
   **/
  private String status = null;

  /**
   * Type of RDS.
   **/
  private String type = null;

  /**
   * Connector Jar URL.
   **/
  private String connectorJarUrl = null;

  /**
   * Workspace ID.
   **/
  private Long workspaceId = null;

  /**
   * User ID.
   **/
  private String userId = null;

  /**
   * User name.
   **/
  private String userName = null;

  /**
   * RDS tenant name.
   **/
  private String tenantName = null;

  /**
   * Set to true if RDS is external.
   **/
  private Boolean external = null;

  /**
   * Getter for id.
   * ID of RDS.
   **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Setter for id.
   * ID of RDS.
   **/
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * Name of RDS.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of RDS.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * Description of RDS.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of RDS.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for connectionURL.
   * Connection URL of RDS.
   **/
  @JsonProperty("connectionURL")
  public String getConnectionURL() {
    return connectionURL;
  }

  /**
   * Setter for connectionURL.
   * Connection URL of RDS.
   **/
  public void setConnectionURL(String connectionURL) {
    this.connectionURL = connectionURL;
  }

  /**
   * Getter for sslMode.
   * SSL mode.
   **/
  @JsonProperty("sslMode")
  public String getSslMode() {
    return sslMode;
  }

  /**
   * Setter for sslMode.
   * SSL mode.
   **/
  public void setSslMode(String sslMode) {
    this.sslMode = sslMode;
  }

  /**
   * Getter for databaseEngine.
   * Database engine.
   **/
  @JsonProperty("databaseEngine")
  public String getDatabaseEngine() {
    return databaseEngine;
  }

  /**
   * Setter for databaseEngine.
   * Database engine.
   **/
  public void setDatabaseEngine(String databaseEngine) {
    this.databaseEngine = databaseEngine;
  }

  /**
   * Getter for connectionDriver.
   * Connection driver.
   **/
  @JsonProperty("connectionDriver")
  public String getConnectionDriver() {
    return connectionDriver;
  }

  /**
   * Setter for connectionDriver.
   * Connection driver.
   **/
  public void setConnectionDriver(String connectionDriver) {
    this.connectionDriver = connectionDriver;
  }

  /**
   * Getter for creationDate.
   * RDS creation date.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * RDS creation date.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for stackVersion.
   * Stack version.
   **/
  @JsonProperty("stackVersion")
  public String getStackVersion() {
    return stackVersion;
  }

  /**
   * Setter for stackVersion.
   * Stack version.
   **/
  public void setStackVersion(String stackVersion) {
    this.stackVersion = stackVersion;
  }

  /**
   * Getter for status.
   * Status of RDS.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of RDS.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for type.
   * Type of RDS.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * Type of RDS.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for connectorJarUrl.
   * Connector Jar URL.
   **/
  @JsonProperty("connectorJarUrl")
  public String getConnectorJarUrl() {
    return connectorJarUrl;
  }

  /**
   * Setter for connectorJarUrl.
   * Connector Jar URL.
   **/
  public void setConnectorJarUrl(String connectorJarUrl) {
    this.connectorJarUrl = connectorJarUrl;
  }

  /**
   * Getter for workspaceId.
   * Workspace ID.
   **/
  @JsonProperty("workspaceId")
  public Long getWorkspaceId() {
    return workspaceId;
  }

  /**
   * Setter for workspaceId.
   * Workspace ID.
   **/
  public void setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
  }

  /**
   * Getter for userId.
   * User ID.
   **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   * User ID.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Getter for userName.
   * User name.
   **/
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  /**
   * Setter for userName.
   * User name.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * Getter for tenantName.
   * RDS tenant name.
   **/
  @JsonProperty("tenantName")
  public String getTenantName() {
    return tenantName;
  }

  /**
   * Setter for tenantName.
   * RDS tenant name.
   **/
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  /**
   * Getter for external.
   * Set to true if RDS is external.
   **/
  @JsonProperty("external")
  public Boolean getExternal() {
    return external;
  }

  /**
   * Setter for external.
   * Set to true if RDS is external.
   **/
  public void setExternal(Boolean external) {
    this.external = external;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterRdsDetails clusterRdsDetails = (ClusterRdsDetails) o;
    if (!Objects.equals(this.id, clusterRdsDetails.id)) {
      return false;
    }
    if (!Objects.equals(this.name, clusterRdsDetails.name)) {
      return false;
    }
    if (!Objects.equals(this.description, clusterRdsDetails.description)) {
      return false;
    }
    if (!Objects.equals(this.connectionURL, clusterRdsDetails.connectionURL)) {
      return false;
    }
    if (!Objects.equals(this.sslMode, clusterRdsDetails.sslMode)) {
      return false;
    }
    if (!Objects.equals(this.databaseEngine, clusterRdsDetails.databaseEngine)) {
      return false;
    }
    if (!Objects.equals(this.connectionDriver, clusterRdsDetails.connectionDriver)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, clusterRdsDetails.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.stackVersion, clusterRdsDetails.stackVersion)) {
      return false;
    }
    if (!Objects.equals(this.status, clusterRdsDetails.status)) {
      return false;
    }
    if (!Objects.equals(this.type, clusterRdsDetails.type)) {
      return false;
    }
    if (!Objects.equals(this.connectorJarUrl, clusterRdsDetails.connectorJarUrl)) {
      return false;
    }
    if (!Objects.equals(this.workspaceId, clusterRdsDetails.workspaceId)) {
      return false;
    }
    if (!Objects.equals(this.userId, clusterRdsDetails.userId)) {
      return false;
    }
    if (!Objects.equals(this.userName, clusterRdsDetails.userName)) {
      return false;
    }
    if (!Objects.equals(this.tenantName, clusterRdsDetails.tenantName)) {
      return false;
    }
    if (!Objects.equals(this.external, clusterRdsDetails.external)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, connectionURL, sslMode, databaseEngine, connectionDriver, creationDate, stackVersion, status, type, connectorJarUrl, workspaceId, userId, userName, tenantName, external);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterRdsDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    connectionURL: ").append(toIndentedString(connectionURL)).append("\n");
    sb.append("    sslMode: ").append(toIndentedString(sslMode)).append("\n");
    sb.append("    databaseEngine: ").append(toIndentedString(databaseEngine)).append("\n");
    sb.append("    connectionDriver: ").append(toIndentedString(connectionDriver)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    stackVersion: ").append(toIndentedString(stackVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    connectorJarUrl: ").append(toIndentedString(connectorJarUrl)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
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

