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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.Alert;
import com.cloudera.cdp.replicationmanager.model.ErrorHandling;
import com.cloudera.cdp.replicationmanager.model.Preserve;
import java.util.*;

/**
 * Extra properties for HDFS.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:43.267-08:00")
public class HdfsArguments  {

  /**
   * HDFS path. Mandatory for HDFS policies, otherwise optional.
   **/
  private String _path = null;

  /**
   * Replication strategy.
   **/
  private String replicationStrategy = null;

  /**
   * Name of the mapreduce service.
   **/
  private String mapReduceService = null;

  /**
   * Job log path.
   **/
  private String logPath = null;

  /**
   * Error handling strategy.
   **/
  private ErrorHandling errorHandling = null;

  /**
   * Properties to preserve.
   **/
  private Preserve preserve = null;

  /**
   * Deletion behavior.
   **/
  private String deletePolicy = null;

  /**
   * Alerting behavior.
   **/
  private Alert alert = null;

  /**
   * Exclusion filters in glob format.
   **/
  private List<String> exclusionFilters = null;

  /**
   * Getter for _path.
   * HDFS path. Mandatory for HDFS policies, otherwise optional.
   **/
  @JsonProperty("path")
  public String getPath() {
    return _path;
  }

  /**
   * Setter for _path.
   * HDFS path. Mandatory for HDFS policies, otherwise optional.
   **/
  public void setPath(String _path) {
    this._path = _path;
  }

  /**
   * Getter for replicationStrategy.
   * Replication strategy.
   **/
  @JsonProperty("replicationStrategy")
  public String getReplicationStrategy() {
    return replicationStrategy;
  }

  /**
   * Setter for replicationStrategy.
   * Replication strategy.
   **/
  public void setReplicationStrategy(String replicationStrategy) {
    this.replicationStrategy = replicationStrategy;
  }

  /**
   * Getter for mapReduceService.
   * Name of the mapreduce service.
   **/
  @JsonProperty("mapReduceService")
  public String getMapReduceService() {
    return mapReduceService;
  }

  /**
   * Setter for mapReduceService.
   * Name of the mapreduce service.
   **/
  public void setMapReduceService(String mapReduceService) {
    this.mapReduceService = mapReduceService;
  }

  /**
   * Getter for logPath.
   * Job log path.
   **/
  @JsonProperty("logPath")
  public String getLogPath() {
    return logPath;
  }

  /**
   * Setter for logPath.
   * Job log path.
   **/
  public void setLogPath(String logPath) {
    this.logPath = logPath;
  }

  /**
   * Getter for errorHandling.
   * Error handling strategy.
   **/
  @JsonProperty("errorHandling")
  public ErrorHandling getErrorHandling() {
    return errorHandling;
  }

  /**
   * Setter for errorHandling.
   * Error handling strategy.
   **/
  public void setErrorHandling(ErrorHandling errorHandling) {
    this.errorHandling = errorHandling;
  }

  /**
   * Getter for preserve.
   * Properties to preserve.
   **/
  @JsonProperty("preserve")
  public Preserve getPreserve() {
    return preserve;
  }

  /**
   * Setter for preserve.
   * Properties to preserve.
   **/
  public void setPreserve(Preserve preserve) {
    this.preserve = preserve;
  }

  /**
   * Getter for deletePolicy.
   * Deletion behavior.
   **/
  @JsonProperty("deletePolicy")
  public String getDeletePolicy() {
    return deletePolicy;
  }

  /**
   * Setter for deletePolicy.
   * Deletion behavior.
   **/
  public void setDeletePolicy(String deletePolicy) {
    this.deletePolicy = deletePolicy;
  }

  /**
   * Getter for alert.
   * Alerting behavior.
   **/
  @JsonProperty("alert")
  public Alert getAlert() {
    return alert;
  }

  /**
   * Setter for alert.
   * Alerting behavior.
   **/
  public void setAlert(Alert alert) {
    this.alert = alert;
  }

  /**
   * Getter for exclusionFilters.
   * Exclusion filters in glob format.
   **/
  @JsonProperty("exclusionFilters")
  public List<String> getExclusionFilters() {
    return exclusionFilters;
  }

  /**
   * Setter for exclusionFilters.
   * Exclusion filters in glob format.
   **/
  public void setExclusionFilters(List<String> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HdfsArguments hdfsArguments = (HdfsArguments) o;
    if (!Objects.equals(this._path, hdfsArguments._path)) {
      return false;
    }
    if (!Objects.equals(this.replicationStrategy, hdfsArguments.replicationStrategy)) {
      return false;
    }
    if (!Objects.equals(this.mapReduceService, hdfsArguments.mapReduceService)) {
      return false;
    }
    if (!Objects.equals(this.logPath, hdfsArguments.logPath)) {
      return false;
    }
    if (!Objects.equals(this.errorHandling, hdfsArguments.errorHandling)) {
      return false;
    }
    if (!Objects.equals(this.preserve, hdfsArguments.preserve)) {
      return false;
    }
    if (!Objects.equals(this.deletePolicy, hdfsArguments.deletePolicy)) {
      return false;
    }
    if (!Objects.equals(this.alert, hdfsArguments.alert)) {
      return false;
    }
    if (!Objects.equals(this.exclusionFilters, hdfsArguments.exclusionFilters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(_path, replicationStrategy, mapReduceService, logPath, errorHandling, preserve, deletePolicy, alert, exclusionFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdfsArguments {\n");
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    sb.append("    replicationStrategy: ").append(toIndentedString(replicationStrategy)).append("\n");
    sb.append("    mapReduceService: ").append(toIndentedString(mapReduceService)).append("\n");
    sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
    sb.append("    errorHandling: ").append(toIndentedString(errorHandling)).append("\n");
    sb.append("    preserve: ").append(toIndentedString(preserve)).append("\n");
    sb.append("    deletePolicy: ").append(toIndentedString(deletePolicy)).append("\n");
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
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

