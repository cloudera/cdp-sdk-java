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

/**
 * Request object for List scaling Activities request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:16.679-07:00")
public class ListScalingActivitiesRequest  {

  /**
   * The name or CRN of the cluster.
   **/
  private String cluster = null;

  /**
   * Duration in minutes for which we want all the scaling activities for the cluster. Either duration or start and end time needs to be provided.
   **/
  private Long duration = null;

  /**
   * Start time value in epoch millisecond from which we want to get all the scaling activities. Need to specify end time with it.
   **/
  private Long startTime = null;

  /**
   * End time value in epoch millisecond until which we want to get all the scaling activities. Need to specify start time with it.
   **/
  private Long endTime = null;

  /**
   * Flag that decides whether to return only failed scaling activities or return all scaling activities in a given duration or a specific time interval.
   **/
  private Boolean onlyFailedScalingActivities = null;

  /**
   * The size of the page for getting scaling activities.
   **/
  private Integer pageSize = null;

  /**
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  private String startingToken = null;

  /**
   * Getter for cluster.
   * The name or CRN of the cluster.
   **/
  @JsonProperty("cluster")
  public String getCluster() {
    return cluster;
  }

  /**
   * Setter for cluster.
   * The name or CRN of the cluster.
   **/
  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  /**
   * Getter for duration.
   * Duration in minutes for which we want all the scaling activities for the cluster. Either duration or start and end time needs to be provided.
   **/
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }

  /**
   * Setter for duration.
   * Duration in minutes for which we want all the scaling activities for the cluster. Either duration or start and end time needs to be provided.
   **/
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  /**
   * Getter for startTime.
   * Start time value in epoch millisecond from which we want to get all the scaling activities. Need to specify end time with it.
   **/
  @JsonProperty("startTime")
  public Long getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Start time value in epoch millisecond from which we want to get all the scaling activities. Need to specify end time with it.
   **/
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * End time value in epoch millisecond until which we want to get all the scaling activities. Need to specify start time with it.
   **/
  @JsonProperty("endTime")
  public Long getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * End time value in epoch millisecond until which we want to get all the scaling activities. Need to specify start time with it.
   **/
  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for onlyFailedScalingActivities.
   * Flag that decides whether to return only failed scaling activities or return all scaling activities in a given duration or a specific time interval.
   **/
  @JsonProperty("onlyFailedScalingActivities")
  public Boolean getOnlyFailedScalingActivities() {
    return onlyFailedScalingActivities;
  }

  /**
   * Setter for onlyFailedScalingActivities.
   * Flag that decides whether to return only failed scaling activities or return all scaling activities in a given duration or a specific time interval.
   **/
  public void setOnlyFailedScalingActivities(Boolean onlyFailedScalingActivities) {
    this.onlyFailedScalingActivities = onlyFailedScalingActivities;
  }

  /**
   * Getter for pageSize.
   * The size of the page for getting scaling activities.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * The size of the page for getting scaling activities.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for startingToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  @JsonProperty("startingToken")
  public String getStartingToken() {
    return startingToken;
  }

  /**
   * Setter for startingToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  public void setStartingToken(String startingToken) {
    this.startingToken = startingToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListScalingActivitiesRequest listScalingActivitiesRequest = (ListScalingActivitiesRequest) o;
    if (!Objects.equals(this.cluster, listScalingActivitiesRequest.cluster)) {
      return false;
    }
    if (!Objects.equals(this.duration, listScalingActivitiesRequest.duration)) {
      return false;
    }
    if (!Objects.equals(this.startTime, listScalingActivitiesRequest.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, listScalingActivitiesRequest.endTime)) {
      return false;
    }
    if (!Objects.equals(this.onlyFailedScalingActivities, listScalingActivitiesRequest.onlyFailedScalingActivities)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listScalingActivitiesRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listScalingActivitiesRequest.startingToken)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, duration, startTime, endTime, onlyFailedScalingActivities, pageSize, startingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListScalingActivitiesRequest {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    onlyFailedScalingActivities: ").append(toIndentedString(onlyFailedScalingActivities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startingToken: ").append(toIndentedString(startingToken)).append("\n");
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

