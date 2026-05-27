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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.lakehouseopt.model.PausedTable;
import com.cloudera.cdp.lakehouseopt.model.Task;

/**
 * Returns the table&#39;s current status details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:05.230-07:00")
public class GetTableStatusDetailsResponse extends CdpResponse {

  /**
   * The paused table details.
   **/
  private PausedTable pausedTable = null;

  /**
   * The recent maintenance task that ran on the table.
   **/
  private Task recentTask = null;

  /**
   * Getter for pausedTable.
   * The paused table details.
   **/
  @JsonProperty("pausedTable")
  public PausedTable getPausedTable() {
    return pausedTable;
  }

  /**
   * Setter for pausedTable.
   * The paused table details.
   **/
  public void setPausedTable(PausedTable pausedTable) {
    this.pausedTable = pausedTable;
  }

  /**
   * Getter for recentTask.
   * The recent maintenance task that ran on the table.
   **/
  @JsonProperty("recentTask")
  public Task getRecentTask() {
    return recentTask;
  }

  /**
   * Setter for recentTask.
   * The recent maintenance task that ran on the table.
   **/
  public void setRecentTask(Task recentTask) {
    this.recentTask = recentTask;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTableStatusDetailsResponse getTableStatusDetailsResponse = (GetTableStatusDetailsResponse) o;
    if (!Objects.equals(this.pausedTable, getTableStatusDetailsResponse.pausedTable)) {
      return false;
    }
    if (!Objects.equals(this.recentTask, getTableStatusDetailsResponse.recentTask)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pausedTable, recentTask, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTableStatusDetailsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pausedTable: ").append(toIndentedString(pausedTable)).append("\n");
    sb.append("    recentTask: ").append(toIndentedString(recentTask)).append("\n");
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

