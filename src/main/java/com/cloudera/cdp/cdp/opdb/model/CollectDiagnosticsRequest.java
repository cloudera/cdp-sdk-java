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

/**
 * Enables starting collection of the diagnostics. This is an asynchronous API and not expected to block.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-11T11:03:31.515-07:00")
public class CollectDiagnosticsRequest  {

  /**
   * The name of the environment
   **/
  private String environmentName = null;

  /**
   * The name of the database
   **/
  private String databaseName = null;

  /**
   * The end time (in ISO 8601 format) of the period to collection statistics for.
   **/
  private String endTime = null;

  /**
   * The start time (in ISO 8601 format) of the period to collection statistics for.
   **/
  private String startTime = null;

  /**
   * Getter for environmentName.
   * The name of the environment
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for databaseName.
   * The name of the database
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * The name of the database
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for endTime.
   * The end time (in ISO 8601 format) of the period to collection statistics for.
   **/
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * The end time (in ISO 8601 format) of the period to collection statistics for.
   **/
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for startTime.
   * The start time (in ISO 8601 format) of the period to collection statistics for.
   **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * The start time (in ISO 8601 format) of the period to collection statistics for.
   **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectDiagnosticsRequest collectDiagnosticsRequest = (CollectDiagnosticsRequest) o;
    if (!Objects.equals(this.environmentName, collectDiagnosticsRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, collectDiagnosticsRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.endTime, collectDiagnosticsRequest.endTime)) {
      return false;
    }
    if (!Objects.equals(this.startTime, collectDiagnosticsRequest.startTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectDiagnosticsRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

