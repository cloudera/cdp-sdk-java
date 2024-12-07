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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.AvailableDeploymentUpgrade;
import com.cloudera.cdp.compute.model.Chart;
import java.util.*;

/**
 * Deployment structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:19.452-08:00")
public class Deployment  {

  /**
   * The name of the deployment.
   **/
  private String name = null;

  /**
   * The namespace of the deployment.
   **/
  private String namespace = null;

  /**
   * Helm revision.
   **/
  private Integer revision = null;

  /**
   * True if Liftie is managing this deployment.
   **/
  private Boolean liftieManaged = null;

  /**
   * Chart that the deployment was created from.
   **/
  private Chart chart = null;

  /**
   * Status of the deployment. Currently supported values are UNKNOWN, DEPLOYED, UNINSTALLED, SUPERSEDED, FAILED, PENDING-INSTALL, PENDING-UPGRADE and PENDING-ROLLBACK. New values may be added in the future.
   **/
  private String status = null;

  /**
   * Any upgrades available for this deployment.
   **/
  private List<AvailableDeploymentUpgrade> upgrades = new ArrayList<AvailableDeploymentUpgrade>();

  /**
   * Escaped JSON overrides for the deployment's properties.
   **/
  private String overrides = null;

  /**
   * Getter for name.
   * The name of the deployment.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the deployment.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for namespace.
   * The namespace of the deployment.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace of the deployment.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for revision.
   * Helm revision.
   **/
  @JsonProperty("revision")
  public Integer getRevision() {
    return revision;
  }

  /**
   * Setter for revision.
   * Helm revision.
   **/
  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  /**
   * Getter for liftieManaged.
   * True if Liftie is managing this deployment.
   **/
  @JsonProperty("liftieManaged")
  public Boolean getLiftieManaged() {
    return liftieManaged;
  }

  /**
   * Setter for liftieManaged.
   * True if Liftie is managing this deployment.
   **/
  public void setLiftieManaged(Boolean liftieManaged) {
    this.liftieManaged = liftieManaged;
  }

  /**
   * Getter for chart.
   * Chart that the deployment was created from.
   **/
  @JsonProperty("chart")
  public Chart getChart() {
    return chart;
  }

  /**
   * Setter for chart.
   * Chart that the deployment was created from.
   **/
  public void setChart(Chart chart) {
    this.chart = chart;
  }

  /**
   * Getter for status.
   * Status of the deployment. Currently supported values are UNKNOWN, DEPLOYED, UNINSTALLED, SUPERSEDED, FAILED, PENDING-INSTALL, PENDING-UPGRADE and PENDING-ROLLBACK. New values may be added in the future.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the deployment. Currently supported values are UNKNOWN, DEPLOYED, UNINSTALLED, SUPERSEDED, FAILED, PENDING-INSTALL, PENDING-UPGRADE and PENDING-ROLLBACK. New values may be added in the future.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for upgrades.
   * Any upgrades available for this deployment.
   **/
  @JsonProperty("upgrades")
  public List<AvailableDeploymentUpgrade> getUpgrades() {
    return upgrades;
  }

  /**
   * Setter for upgrades.
   * Any upgrades available for this deployment.
   **/
  public void setUpgrades(List<AvailableDeploymentUpgrade> upgrades) {
    this.upgrades = upgrades;
  }

  /**
   * Getter for overrides.
   * Escaped JSON overrides for the deployment&#39;s properties.
   **/
  @JsonProperty("overrides")
  public String getOverrides() {
    return overrides;
  }

  /**
   * Setter for overrides.
   * Escaped JSON overrides for the deployment&#39;s properties.
   **/
  public void setOverrides(String overrides) {
    this.overrides = overrides;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deployment deployment = (Deployment) o;
    if (!Objects.equals(this.name, deployment.name)) {
      return false;
    }
    if (!Objects.equals(this.namespace, deployment.namespace)) {
      return false;
    }
    if (!Objects.equals(this.revision, deployment.revision)) {
      return false;
    }
    if (!Objects.equals(this.liftieManaged, deployment.liftieManaged)) {
      return false;
    }
    if (!Objects.equals(this.chart, deployment.chart)) {
      return false;
    }
    if (!Objects.equals(this.status, deployment.status)) {
      return false;
    }
    if (!Objects.equals(this.upgrades, deployment.upgrades)) {
      return false;
    }
    if (!Objects.equals(this.overrides, deployment.overrides)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, revision, liftieManaged, chart, status, upgrades, overrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    liftieManaged: ").append(toIndentedString(liftieManaged)).append("\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    upgrades: ").append(toIndentedString(upgrades)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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

