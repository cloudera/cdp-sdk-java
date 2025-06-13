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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A reporting task summary
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:29.746-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ReportingTaskSummary  {

  /**
   * The CRN of the reporting task
   **/
  private String crn = null;

  /**
   * The component's unique identifier
   **/
  private String identifier = null;

  /**
   * The component's name
   **/
  private String name = null;

  /**
   * The type of the extension component
   **/
  private String type = null;

  /**
   * Getter for crn.
   * The CRN of the reporting task
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the reporting task
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for identifier.
   * The component&#39;s unique identifier
   **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Setter for identifier.
   * The component&#39;s unique identifier
   **/
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  /**
   * Getter for name.
   * The component&#39;s name
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The component&#39;s name
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for type.
   * The type of the extension component
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The type of the extension component
   **/
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTaskSummary reportingTaskSummary = (ReportingTaskSummary) o;
    if (!Objects.equals(this.crn, reportingTaskSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.identifier, reportingTaskSummary.identifier)) {
      return false;
    }
    if (!Objects.equals(this.name, reportingTaskSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.type, reportingTaskSummary.type)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, identifier, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTaskSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

