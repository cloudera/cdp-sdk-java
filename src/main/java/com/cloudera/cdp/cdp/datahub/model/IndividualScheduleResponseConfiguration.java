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
import com.cloudera.cdp.datahub.model.IndividualScheduleResponseConfigurationAction;
import com.cloudera.cdp.datahub.model.IndividualScheduleResponseConfigurationTrigger;

/**
 * The schedule configuration.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-06T11:00:47.347-08:00")
public class IndividualScheduleResponseConfiguration  {

  /**
   * 
   **/
  private IndividualScheduleResponseConfigurationTrigger trigger = null;

  /**
   * 
   **/
  private IndividualScheduleResponseConfigurationAction action = null;

  /**
   * Getter for trigger.
   * 
   **/
  @JsonProperty("trigger")
  public IndividualScheduleResponseConfigurationTrigger getTrigger() {
    return trigger;
  }

  /**
   * Setter for trigger.
   * 
   **/
  public void setTrigger(IndividualScheduleResponseConfigurationTrigger trigger) {
    this.trigger = trigger;
  }

  /**
   * Getter for action.
   * 
   **/
  @JsonProperty("action")
  public IndividualScheduleResponseConfigurationAction getAction() {
    return action;
  }

  /**
   * Setter for action.
   * 
   **/
  public void setAction(IndividualScheduleResponseConfigurationAction action) {
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
    IndividualScheduleResponseConfiguration individualScheduleResponseConfiguration = (IndividualScheduleResponseConfiguration) o;
    if (!Objects.equals(this.trigger, individualScheduleResponseConfiguration.trigger)) {
      return false;
    }
    if (!Objects.equals(this.action, individualScheduleResponseConfiguration.action)) {
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
    sb.append("class IndividualScheduleResponseConfiguration {\n");
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

