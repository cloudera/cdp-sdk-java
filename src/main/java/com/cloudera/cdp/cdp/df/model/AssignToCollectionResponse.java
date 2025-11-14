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

/**
 * Response object when assigning a flow to a catalog collection.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:08.545-08:00")
public class AssignToCollectionResponse extends CdpResponse {

  /**
   * The updated flow summary with the new collection.
   **/
  private FlowSummary flowSummary = null;

  /**
   * Getter for flowSummary.
   * The updated flow summary with the new collection.
   **/
  @JsonProperty("flowSummary")
  public FlowSummary getFlowSummary() {
    return flowSummary;
  }

  /**
   * Setter for flowSummary.
   * The updated flow summary with the new collection.
   **/
  public void setFlowSummary(FlowSummary flowSummary) {
    this.flowSummary = flowSummary;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignToCollectionResponse assignToCollectionResponse = (AssignToCollectionResponse) o;
    if (!Objects.equals(this.flowSummary, assignToCollectionResponse.flowSummary)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowSummary, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignToCollectionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flowSummary: ").append(toIndentedString(flowSummary)).append("\n");
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

