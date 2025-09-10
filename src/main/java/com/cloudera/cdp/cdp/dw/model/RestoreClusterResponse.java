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
import com.cloudera.cdp.dw.model.RestoreClusterEntityPlan;
import java.util.*;

/**
 * Response object for the restoreCluster method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-09T16:18:22.699-07:00")
public class RestoreClusterResponse extends CdpResponse {

  /**
   * The ID of the cluster.
   **/
  private String clusterId = null;

  /**
   * The ID of the restore operation.
   **/
  private String operationId = null;

  /**
   * The cluster action. Possible actions: Create, Skip
   **/
  private String action = null;

  /**
   * The description of the cluster action.
   **/
  private String message = null;

  /**
   * Information about the restore-plan of the DbCatalogs.
   **/
  private List<RestoreClusterEntityPlan> dbcRestorePlans = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * Information about the restore-plan of Hue.
   **/
  private List<RestoreClusterEntityPlan> hueRestorePlans = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * Information about the restore-plan of the Hive Virtual Warehouses.
   **/
  private List<RestoreClusterEntityPlan> hiveRestorePlans = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * Information about the restore-plan of the Impala Virtual Warehouses.
   **/
  private List<RestoreClusterEntityPlan> impalaRestorePlans = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * Information about the restore-plan of the Data Visualization Apps.
   **/
  private List<RestoreClusterEntityPlan> vizRestorePlans = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * The plan for the restoration of the Hue Query Editors.
   **/
  private List<RestoreClusterEntityPlan> cdwHueRestorePlans = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * Getter for clusterId.
   * The ID of the cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for operationId.
   * The ID of the restore operation.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * The ID of the restore operation.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for action.
   * The cluster action. Possible actions: Create, Skip
   **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  /**
   * Setter for action.
   * The cluster action. Possible actions: Create, Skip
   **/
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Getter for message.
   * The description of the cluster action.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * The description of the cluster action.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for dbcRestorePlans.
   * Information about the restore-plan of the DbCatalogs.
   **/
  @JsonProperty("dbcRestorePlans")
  public List<RestoreClusterEntityPlan> getDbcRestorePlans() {
    return dbcRestorePlans;
  }

  /**
   * Setter for dbcRestorePlans.
   * Information about the restore-plan of the DbCatalogs.
   **/
  public void setDbcRestorePlans(List<RestoreClusterEntityPlan> dbcRestorePlans) {
    this.dbcRestorePlans = dbcRestorePlans;
  }

  /**
   * Getter for hueRestorePlans.
   * Information about the restore-plan of Hue.
   **/
  @JsonProperty("hueRestorePlans")
  public List<RestoreClusterEntityPlan> getHueRestorePlans() {
    return hueRestorePlans;
  }

  /**
   * Setter for hueRestorePlans.
   * Information about the restore-plan of Hue.
   **/
  public void setHueRestorePlans(List<RestoreClusterEntityPlan> hueRestorePlans) {
    this.hueRestorePlans = hueRestorePlans;
  }

  /**
   * Getter for hiveRestorePlans.
   * Information about the restore-plan of the Hive Virtual Warehouses.
   **/
  @JsonProperty("hiveRestorePlans")
  public List<RestoreClusterEntityPlan> getHiveRestorePlans() {
    return hiveRestorePlans;
  }

  /**
   * Setter for hiveRestorePlans.
   * Information about the restore-plan of the Hive Virtual Warehouses.
   **/
  public void setHiveRestorePlans(List<RestoreClusterEntityPlan> hiveRestorePlans) {
    this.hiveRestorePlans = hiveRestorePlans;
  }

  /**
   * Getter for impalaRestorePlans.
   * Information about the restore-plan of the Impala Virtual Warehouses.
   **/
  @JsonProperty("impalaRestorePlans")
  public List<RestoreClusterEntityPlan> getImpalaRestorePlans() {
    return impalaRestorePlans;
  }

  /**
   * Setter for impalaRestorePlans.
   * Information about the restore-plan of the Impala Virtual Warehouses.
   **/
  public void setImpalaRestorePlans(List<RestoreClusterEntityPlan> impalaRestorePlans) {
    this.impalaRestorePlans = impalaRestorePlans;
  }

  /**
   * Getter for vizRestorePlans.
   * Information about the restore-plan of the Data Visualization Apps.
   **/
  @JsonProperty("vizRestorePlans")
  public List<RestoreClusterEntityPlan> getVizRestorePlans() {
    return vizRestorePlans;
  }

  /**
   * Setter for vizRestorePlans.
   * Information about the restore-plan of the Data Visualization Apps.
   **/
  public void setVizRestorePlans(List<RestoreClusterEntityPlan> vizRestorePlans) {
    this.vizRestorePlans = vizRestorePlans;
  }

  /**
   * Getter for cdwHueRestorePlans.
   * The plan for the restoration of the Hue Query Editors.
   **/
  @JsonProperty("cdwHueRestorePlans")
  public List<RestoreClusterEntityPlan> getCdwHueRestorePlans() {
    return cdwHueRestorePlans;
  }

  /**
   * Setter for cdwHueRestorePlans.
   * The plan for the restoration of the Hue Query Editors.
   **/
  public void setCdwHueRestorePlans(List<RestoreClusterEntityPlan> cdwHueRestorePlans) {
    this.cdwHueRestorePlans = cdwHueRestorePlans;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreClusterResponse restoreClusterResponse = (RestoreClusterResponse) o;
    if (!Objects.equals(this.clusterId, restoreClusterResponse.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.operationId, restoreClusterResponse.operationId)) {
      return false;
    }
    if (!Objects.equals(this.action, restoreClusterResponse.action)) {
      return false;
    }
    if (!Objects.equals(this.message, restoreClusterResponse.message)) {
      return false;
    }
    if (!Objects.equals(this.dbcRestorePlans, restoreClusterResponse.dbcRestorePlans)) {
      return false;
    }
    if (!Objects.equals(this.hueRestorePlans, restoreClusterResponse.hueRestorePlans)) {
      return false;
    }
    if (!Objects.equals(this.hiveRestorePlans, restoreClusterResponse.hiveRestorePlans)) {
      return false;
    }
    if (!Objects.equals(this.impalaRestorePlans, restoreClusterResponse.impalaRestorePlans)) {
      return false;
    }
    if (!Objects.equals(this.vizRestorePlans, restoreClusterResponse.vizRestorePlans)) {
      return false;
    }
    if (!Objects.equals(this.cdwHueRestorePlans, restoreClusterResponse.cdwHueRestorePlans)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, operationId, action, message, dbcRestorePlans, hueRestorePlans, hiveRestorePlans, impalaRestorePlans, vizRestorePlans, cdwHueRestorePlans, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreClusterResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    dbcRestorePlans: ").append(toIndentedString(dbcRestorePlans)).append("\n");
    sb.append("    hueRestorePlans: ").append(toIndentedString(hueRestorePlans)).append("\n");
    sb.append("    hiveRestorePlans: ").append(toIndentedString(hiveRestorePlans)).append("\n");
    sb.append("    impalaRestorePlans: ").append(toIndentedString(impalaRestorePlans)).append("\n");
    sb.append("    vizRestorePlans: ").append(toIndentedString(vizRestorePlans)).append("\n");
    sb.append("    cdwHueRestorePlans: ").append(toIndentedString(cdwHueRestorePlans)).append("\n");
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

