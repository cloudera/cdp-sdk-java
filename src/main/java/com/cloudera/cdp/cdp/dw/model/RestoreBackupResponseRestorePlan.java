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
 * The plan for the restoration without cluster metadata in case of rebuild.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.231-07:00")
public class RestoreBackupResponseRestorePlan  {

  /**
   * The plan for the restoration of the DB Catalogs.
   **/
  private List<RestoreClusterEntityPlan> dbc = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * The plan for the restoration of the Hue.
   **/
  private List<RestoreClusterEntityPlan> hue = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * The plan for the restoration of the Hive Virtual Warehouses.
   **/
  private List<RestoreClusterEntityPlan> hive = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * The plan for the restoration of the Impala Virtual Warehouses.
   **/
  private List<RestoreClusterEntityPlan> impala = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * The plan for the restoration of the Trino Virtual Warehouses.
   **/
  private List<RestoreClusterEntityPlan> trino = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * The plan for the restoration of the Data Visualization Apps.
   **/
  private List<RestoreClusterEntityPlan> viz = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * The plan for the restoration of the Hue Query Editors.
   **/
  private List<RestoreClusterEntityPlan> cdwHue = new ArrayList<RestoreClusterEntityPlan>();

  /**
   * The plan for the restoration of the DWX Secrets.
   **/
  private List<String> dwxSecrets = new ArrayList<String>();

  /**
   * Getter for dbc.
   * The plan for the restoration of the DB Catalogs.
   **/
  @JsonProperty("dbc")
  public List<RestoreClusterEntityPlan> getDbc() {
    return dbc;
  }

  /**
   * Setter for dbc.
   * The plan for the restoration of the DB Catalogs.
   **/
  public void setDbc(List<RestoreClusterEntityPlan> dbc) {
    this.dbc = dbc;
  }

  /**
   * Getter for hue.
   * The plan for the restoration of the Hue.
   **/
  @JsonProperty("hue")
  public List<RestoreClusterEntityPlan> getHue() {
    return hue;
  }

  /**
   * Setter for hue.
   * The plan for the restoration of the Hue.
   **/
  public void setHue(List<RestoreClusterEntityPlan> hue) {
    this.hue = hue;
  }

  /**
   * Getter for hive.
   * The plan for the restoration of the Hive Virtual Warehouses.
   **/
  @JsonProperty("hive")
  public List<RestoreClusterEntityPlan> getHive() {
    return hive;
  }

  /**
   * Setter for hive.
   * The plan for the restoration of the Hive Virtual Warehouses.
   **/
  public void setHive(List<RestoreClusterEntityPlan> hive) {
    this.hive = hive;
  }

  /**
   * Getter for impala.
   * The plan for the restoration of the Impala Virtual Warehouses.
   **/
  @JsonProperty("impala")
  public List<RestoreClusterEntityPlan> getImpala() {
    return impala;
  }

  /**
   * Setter for impala.
   * The plan for the restoration of the Impala Virtual Warehouses.
   **/
  public void setImpala(List<RestoreClusterEntityPlan> impala) {
    this.impala = impala;
  }

  /**
   * Getter for trino.
   * The plan for the restoration of the Trino Virtual Warehouses.
   **/
  @JsonProperty("trino")
  public List<RestoreClusterEntityPlan> getTrino() {
    return trino;
  }

  /**
   * Setter for trino.
   * The plan for the restoration of the Trino Virtual Warehouses.
   **/
  public void setTrino(List<RestoreClusterEntityPlan> trino) {
    this.trino = trino;
  }

  /**
   * Getter for viz.
   * The plan for the restoration of the Data Visualization Apps.
   **/
  @JsonProperty("viz")
  public List<RestoreClusterEntityPlan> getViz() {
    return viz;
  }

  /**
   * Setter for viz.
   * The plan for the restoration of the Data Visualization Apps.
   **/
  public void setViz(List<RestoreClusterEntityPlan> viz) {
    this.viz = viz;
  }

  /**
   * Getter for cdwHue.
   * The plan for the restoration of the Hue Query Editors.
   **/
  @JsonProperty("cdwHue")
  public List<RestoreClusterEntityPlan> getCdwHue() {
    return cdwHue;
  }

  /**
   * Setter for cdwHue.
   * The plan for the restoration of the Hue Query Editors.
   **/
  public void setCdwHue(List<RestoreClusterEntityPlan> cdwHue) {
    this.cdwHue = cdwHue;
  }

  /**
   * Getter for dwxSecrets.
   * The plan for the restoration of the DWX Secrets.
   **/
  @JsonProperty("dwxSecrets")
  public List<String> getDwxSecrets() {
    return dwxSecrets;
  }

  /**
   * Setter for dwxSecrets.
   * The plan for the restoration of the DWX Secrets.
   **/
  public void setDwxSecrets(List<String> dwxSecrets) {
    this.dwxSecrets = dwxSecrets;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreBackupResponseRestorePlan restoreBackupResponseRestorePlan = (RestoreBackupResponseRestorePlan) o;
    if (!Objects.equals(this.dbc, restoreBackupResponseRestorePlan.dbc)) {
      return false;
    }
    if (!Objects.equals(this.hue, restoreBackupResponseRestorePlan.hue)) {
      return false;
    }
    if (!Objects.equals(this.hive, restoreBackupResponseRestorePlan.hive)) {
      return false;
    }
    if (!Objects.equals(this.impala, restoreBackupResponseRestorePlan.impala)) {
      return false;
    }
    if (!Objects.equals(this.trino, restoreBackupResponseRestorePlan.trino)) {
      return false;
    }
    if (!Objects.equals(this.viz, restoreBackupResponseRestorePlan.viz)) {
      return false;
    }
    if (!Objects.equals(this.cdwHue, restoreBackupResponseRestorePlan.cdwHue)) {
      return false;
    }
    if (!Objects.equals(this.dwxSecrets, restoreBackupResponseRestorePlan.dwxSecrets)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbc, hue, hive, impala, trino, viz, cdwHue, dwxSecrets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreBackupResponseRestorePlan {\n");
    sb.append("    dbc: ").append(toIndentedString(dbc)).append("\n");
    sb.append("    hue: ").append(toIndentedString(hue)).append("\n");
    sb.append("    hive: ").append(toIndentedString(hive)).append("\n");
    sb.append("    impala: ").append(toIndentedString(impala)).append("\n");
    sb.append("    trino: ").append(toIndentedString(trino)).append("\n");
    sb.append("    viz: ").append(toIndentedString(viz)).append("\n");
    sb.append("    cdwHue: ").append(toIndentedString(cdwHue)).append("\n");
    sb.append("    dwxSecrets: ").append(toIndentedString(dwxSecrets)).append("\n");
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

