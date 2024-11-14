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
import com.cloudera.cdp.datahub.model.IndividualScheduleResponseConfiguration;

/**
 * An individual schedule based policy
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:23.628-08:00")
public class IndividualScheduleResponse extends CdpResponse {

  /**
   * 
   **/
  private IndividualScheduleResponseConfiguration configuration = null;

  /**
   * An identifier fot the specific schedule. Generally usefulf for debugging.
   **/
  private String identifier = null;

  /**
   * Description for the specified schedule.
   **/
  private String description = null;

  /**
   * Getter for configuration.
   * 
   **/
  @JsonProperty("configuration")
  public IndividualScheduleResponseConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * Setter for configuration.
   * 
   **/
  public void setConfiguration(IndividualScheduleResponseConfiguration configuration) {
    this.configuration = configuration;
  }

  /**
   * Getter for identifier.
   * An identifier fot the specific schedule. Generally usefulf for debugging.
   **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Setter for identifier.
   * An identifier fot the specific schedule. Generally usefulf for debugging.
   **/
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  /**
   * Getter for description.
   * Description for the specified schedule.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description for the specified schedule.
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
    IndividualScheduleResponse individualScheduleResponse = (IndividualScheduleResponse) o;
    if (!Objects.equals(this.configuration, individualScheduleResponse.configuration)) {
      return false;
    }
    if (!Objects.equals(this.identifier, individualScheduleResponse.identifier)) {
      return false;
    }
    if (!Objects.equals(this.description, individualScheduleResponse.description)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, identifier, description, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualScheduleResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

