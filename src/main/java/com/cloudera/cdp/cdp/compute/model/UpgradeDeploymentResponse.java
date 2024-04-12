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
import com.cloudera.cdp.compute.model.Chart;

/**
 * Response structure for upgrading a deployment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-11T13:44:55.013-07:00")
public class UpgradeDeploymentResponse extends CdpResponse {

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
   * A message returned about the status of the upgrade operation.
   **/
  private String message = null;

  /**
   * Status of the deployment. Currently supported values are UNKNOWN, DEPLOYED, UNINSTALLED, SUPERSEDED, FAILED, PENDING-INSTALL, PENDING-UPGRADE and PENDING-ROLLBACK. New values may be added in the future.
   **/
  private String status = null;

  /**
   * Chart that the deployment was created from.
   **/
  private Chart chart = null;

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
   * Getter for message.
   * A message returned about the status of the upgrade operation.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * A message returned about the status of the upgrade operation.
   **/
  public void setMessage(String message) {
    this.message = message;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDeploymentResponse upgradeDeploymentResponse = (UpgradeDeploymentResponse) o;
    if (!Objects.equals(this.name, upgradeDeploymentResponse.name)) {
      return false;
    }
    if (!Objects.equals(this.namespace, upgradeDeploymentResponse.namespace)) {
      return false;
    }
    if (!Objects.equals(this.revision, upgradeDeploymentResponse.revision)) {
      return false;
    }
    if (!Objects.equals(this.message, upgradeDeploymentResponse.message)) {
      return false;
    }
    if (!Objects.equals(this.status, upgradeDeploymentResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.chart, upgradeDeploymentResponse.chart)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, revision, message, status, chart, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDeploymentResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
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

