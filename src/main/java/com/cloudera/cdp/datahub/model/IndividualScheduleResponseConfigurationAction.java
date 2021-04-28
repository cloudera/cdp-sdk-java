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
 * The scaling action to take when triggered.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-28T12:37:13.495-07:00")
public class IndividualScheduleResponseConfigurationAction  {

  /**
   * The type of resource adjustment. Only ABSOLUTE_COUNT supported at the moment.
   **/
  private String resourceAdjustmentType = null;

  /**
   * The target value for the resource based on the AdjustmentType
   **/
  private Integer resourceAdjustmentValue = null;

  /**
   * Getter for resourceAdjustmentType.
   * The type of resource adjustment. Only ABSOLUTE_COUNT supported at the moment.
   **/
  @JsonProperty("resourceAdjustmentType")
  public String getResourceAdjustmentType() {
    return resourceAdjustmentType;
  }

  /**
   * Setter for resourceAdjustmentType.
   * The type of resource adjustment. Only ABSOLUTE_COUNT supported at the moment.
   **/
  public void setResourceAdjustmentType(String resourceAdjustmentType) {
    this.resourceAdjustmentType = resourceAdjustmentType;
  }

  /**
   * Getter for resourceAdjustmentValue.
   * The target value for the resource based on the AdjustmentType
   **/
  @JsonProperty("resourceAdjustmentValue")
  public Integer getResourceAdjustmentValue() {
    return resourceAdjustmentValue;
  }

  /**
   * Setter for resourceAdjustmentValue.
   * The target value for the resource based on the AdjustmentType
   **/
  public void setResourceAdjustmentValue(Integer resourceAdjustmentValue) {
    this.resourceAdjustmentValue = resourceAdjustmentValue;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualScheduleResponseConfigurationAction individualScheduleResponseConfigurationAction = (IndividualScheduleResponseConfigurationAction) o;
    if (!Objects.equals(this.resourceAdjustmentType, individualScheduleResponseConfigurationAction.resourceAdjustmentType)) {
      return false;
    }
    if (!Objects.equals(this.resourceAdjustmentValue, individualScheduleResponseConfigurationAction.resourceAdjustmentValue)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceAdjustmentType, resourceAdjustmentValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualScheduleResponseConfigurationAction {\n");
    sb.append("    resourceAdjustmentType: ").append(toIndentedString(resourceAdjustmentType)).append("\n");
    sb.append("    resourceAdjustmentValue: ").append(toIndentedString(resourceAdjustmentValue)).append("\n");
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

