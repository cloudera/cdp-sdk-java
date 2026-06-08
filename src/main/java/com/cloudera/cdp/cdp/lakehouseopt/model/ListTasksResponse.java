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
import com.cloudera.cdp.lakehouseopt.model.TaskObject;
import java.util.*;

/**
 * Response object of list tasks.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class ListTasksResponse extends CdpResponse {

  /**
   * The tasks list.
   **/
  private List<TaskObject> tasks = new ArrayList<TaskObject>();

  /**
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  private String nextPageToken = null;

  /**
   * Getter for tasks.
   * The tasks list.
   **/
  @JsonProperty("tasks")
  public List<TaskObject> getTasks() {
    return tasks;
  }

  /**
   * Setter for tasks.
   * The tasks list.
   **/
  public void setTasks(List<TaskObject> tasks) {
    this.tasks = tasks;
  }

  /**
   * Getter for nextPageToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Setter for nextPageToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTasksResponse listTasksResponse = (ListTasksResponse) o;
    if (!Objects.equals(this.tasks, listTasksResponse.tasks)) {
      return false;
    }
    if (!Objects.equals(this.nextPageToken, listTasksResponse.nextPageToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks, nextPageToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTasksResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

