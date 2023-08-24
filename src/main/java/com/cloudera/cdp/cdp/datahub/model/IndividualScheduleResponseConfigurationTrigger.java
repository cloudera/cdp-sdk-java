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
 * The trigger for this rule.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-24T14:47:21.133-07:00")
public class IndividualScheduleResponseConfigurationTrigger  {

  /**
   * The cron expression for this schedule
   **/
  private String cronExpression = null;

  /**
   * The time zone for the cron expression
   **/
  private String timeZone = null;

  /**
   * Getter for cronExpression.
   * The cron expression for this schedule
   **/
  @JsonProperty("cronExpression")
  public String getCronExpression() {
    return cronExpression;
  }

  /**
   * Setter for cronExpression.
   * The cron expression for this schedule
   **/
  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }

  /**
   * Getter for timeZone.
   * The time zone for the cron expression
   **/
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  /**
   * Setter for timeZone.
   * The time zone for the cron expression
   **/
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualScheduleResponseConfigurationTrigger individualScheduleResponseConfigurationTrigger = (IndividualScheduleResponseConfigurationTrigger) o;
    if (!Objects.equals(this.cronExpression, individualScheduleResponseConfigurationTrigger.cronExpression)) {
      return false;
    }
    if (!Objects.equals(this.timeZone, individualScheduleResponseConfigurationTrigger.timeZone)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualScheduleResponseConfigurationTrigger {\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

