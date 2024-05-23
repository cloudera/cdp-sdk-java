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
 * History structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-22T20:53:57.273-07:00")
public class History  {

  /**
   * Helm revision.
   **/
  private Integer revision = null;

  /**
   * Status of the deployment. Currently supported values are UNKNOWN, DEPLOYED, UNINSTALLED, SUPERSEDED, FAILED, PENDING-INSTALL, PENDING-UPGRADE and PENDING-ROLLBACK. New values may be added in the future.
   **/
  private String status = null;

  /**
   * Chart that the deployment was created from.
   **/
  private Chart chart = null;

  /**
   * Escaped JSON overrides for the deployment's properties for given revision.
   **/
  private String overrides = null;

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

  /**
   * Getter for overrides.
   * Escaped JSON overrides for the deployment&#39;s properties for given revision.
   **/
  @JsonProperty("overrides")
  public String getOverrides() {
    return overrides;
  }

  /**
   * Setter for overrides.
   * Escaped JSON overrides for the deployment&#39;s properties for given revision.
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
    History history = (History) o;
    if (!Objects.equals(this.revision, history.revision)) {
      return false;
    }
    if (!Objects.equals(this.status, history.status)) {
      return false;
    }
    if (!Objects.equals(this.chart, history.chart)) {
      return false;
    }
    if (!Objects.equals(this.overrides, history.overrides)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, status, chart, overrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
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

