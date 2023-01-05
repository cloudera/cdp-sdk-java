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
import com.cloudera.cdp.datahub.model.IndividualScheduleRequestConfiguration;

/**
 * An individual schedule based policy
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-01-04T11:10:07.615-08:00")
public class IndividualScheduleRequest  {

  /**
   * 
   **/
  private IndividualScheduleRequestConfiguration configuration = null;

  /**
   * An optional identifier for the specific schedule. Generally useful for debugging. Will be auto-generated if none provided.
   **/
  private String identifier = null;

  /**
   * An optional description for the specific schedule.
   **/
  private String description = null;

  /**
   * Getter for configuration.
   * 
   **/
  @JsonProperty("configuration")
  public IndividualScheduleRequestConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * Setter for configuration.
   * 
   **/
  public void setConfiguration(IndividualScheduleRequestConfiguration configuration) {
    this.configuration = configuration;
  }

  /**
   * Getter for identifier.
   * An optional identifier for the specific schedule. Generally useful for debugging. Will be auto-generated if none provided.
   **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Setter for identifier.
   * An optional identifier for the specific schedule. Generally useful for debugging. Will be auto-generated if none provided.
   **/
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  /**
   * Getter for description.
   * An optional description for the specific schedule.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * An optional description for the specific schedule.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualScheduleRequest individualScheduleRequest = (IndividualScheduleRequest) o;
    if (!Objects.equals(this.configuration, individualScheduleRequest.configuration)) {
      return false;
    }
    if (!Objects.equals(this.identifier, individualScheduleRequest.identifier)) {
      return false;
    }
    if (!Objects.equals(this.description, individualScheduleRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, identifier, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualScheduleRequest {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

