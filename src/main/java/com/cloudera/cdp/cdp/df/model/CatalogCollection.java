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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.df.model.FlowSummary;
import java.util.*;

/**
 * A catalog collection.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:29.380-07:00")
public class CatalogCollection  {

  /**
   * The catalog collection CRN.
   **/
  private String crn = null;

  /**
   * The name of the catalog collection.
   **/
  private String name = null;

  /**
   * The description of the catalog collection.
   **/
  private String description = null;

  /**
   * The summaries of flows in the catalog collection.
   **/
  private List<FlowSummary> flowSummaries = new ArrayList<FlowSummary>();

  /**
   * The number of flow summaries in the catalog collection.
   **/
  private Integer flowCount = null;

  /**
   * Getter for crn.
   * The catalog collection CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The catalog collection CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The name of the catalog collection.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the catalog collection.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * The description of the catalog collection.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the catalog collection.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for flowSummaries.
   * The summaries of flows in the catalog collection.
   **/
  @JsonProperty("flowSummaries")
  public List<FlowSummary> getFlowSummaries() {
    return flowSummaries;
  }

  /**
   * Setter for flowSummaries.
   * The summaries of flows in the catalog collection.
   **/
  public void setFlowSummaries(List<FlowSummary> flowSummaries) {
    this.flowSummaries = flowSummaries;
  }

  /**
   * Getter for flowCount.
   * The number of flow summaries in the catalog collection.
   **/
  @JsonProperty("flowCount")
  public Integer getFlowCount() {
    return flowCount;
  }

  /**
   * Setter for flowCount.
   * The number of flow summaries in the catalog collection.
   **/
  public void setFlowCount(Integer flowCount) {
    this.flowCount = flowCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogCollection catalogCollection = (CatalogCollection) o;
    if (!Objects.equals(this.crn, catalogCollection.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, catalogCollection.name)) {
      return false;
    }
    if (!Objects.equals(this.description, catalogCollection.description)) {
      return false;
    }
    if (!Objects.equals(this.flowSummaries, catalogCollection.flowSummaries)) {
      return false;
    }
    if (!Objects.equals(this.flowCount, catalogCollection.flowCount)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, description, flowSummaries, flowCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogCollection {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    flowSummaries: ").append(toIndentedString(flowSummaries)).append("\n");
    sb.append("    flowCount: ").append(toIndentedString(flowCount)).append("\n");
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

