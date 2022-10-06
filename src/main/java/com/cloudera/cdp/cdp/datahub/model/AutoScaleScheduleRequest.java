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
import com.cloudera.cdp.datahub.model.IndividualScheduleRequest;
import java.util.*;

/**
 * Schedule for AutoScaling
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-06T10:34:42.550-07:00")
public class AutoScaleScheduleRequest  {

  /**
   * List of individual schedules
   **/
  private List<IndividualScheduleRequest> schedules = new ArrayList<IndividualScheduleRequest>();

  /**
   * Getter for schedules.
   * List of individual schedules
   **/
  @JsonProperty("schedules")
  public List<IndividualScheduleRequest> getSchedules() {
    return schedules;
  }

  /**
   * Setter for schedules.
   * List of individual schedules
   **/
  public void setSchedules(List<IndividualScheduleRequest> schedules) {
    this.schedules = schedules;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleScheduleRequest autoScaleScheduleRequest = (AutoScaleScheduleRequest) o;
    if (!Objects.equals(this.schedules, autoScaleScheduleRequest.schedules)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleScheduleRequest {\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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

