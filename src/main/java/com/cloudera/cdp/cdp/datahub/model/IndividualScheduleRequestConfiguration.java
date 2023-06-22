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
import com.cloudera.cdp.datahub.model.IndividualScheduleRequestConfigurationAction;
import com.cloudera.cdp.datahub.model.IndividualScheduleRequestConfigurationTrigger;

/**
 * The schedule configuration
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-21T23:16:14.526-07:00")
public class IndividualScheduleRequestConfiguration  {

  /**
   * 
   **/
  private IndividualScheduleRequestConfigurationTrigger trigger = null;

  /**
   * 
   **/
  private IndividualScheduleRequestConfigurationAction action = null;

  /**
   * Getter for trigger.
   * 
   **/
  @JsonProperty("trigger")
  public IndividualScheduleRequestConfigurationTrigger getTrigger() {
    return trigger;
  }

  /**
   * Setter for trigger.
   * 
   **/
  public void setTrigger(IndividualScheduleRequestConfigurationTrigger trigger) {
    this.trigger = trigger;
  }

  /**
   * Getter for action.
   * 
   **/
  @JsonProperty("action")
  public IndividualScheduleRequestConfigurationAction getAction() {
    return action;
  }

  /**
   * Setter for action.
   * 
   **/
  public void setAction(IndividualScheduleRequestConfigurationAction action) {
    this.action = action;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualScheduleRequestConfiguration individualScheduleRequestConfiguration = (IndividualScheduleRequestConfiguration) o;
    if (!Objects.equals(this.trigger, individualScheduleRequestConfiguration.trigger)) {
      return false;
    }
    if (!Objects.equals(this.action, individualScheduleRequestConfiguration.action)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(trigger, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualScheduleRequestConfiguration {\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

