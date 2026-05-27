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
import com.cloudera.cdp.dfworkload.model.FlowSummary;
import java.util.*;

/**
 * Response object for listing the flow drafts.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:04.223-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ListFlowDraftsResponse extends CdpResponse {

  /**
   * The flow summaries.
   **/
  private List<FlowSummary> flowSummaries = new ArrayList<FlowSummary>();

  /**
   * Getter for flowSummaries.
   * The flow summaries.
   **/
  @JsonProperty("flowSummaries")
  public List<FlowSummary> getFlowSummaries() {
    return flowSummaries;
  }

  /**
   * Setter for flowSummaries.
   * The flow summaries.
   **/
  public void setFlowSummaries(List<FlowSummary> flowSummaries) {
    this.flowSummaries = flowSummaries;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFlowDraftsResponse listFlowDraftsResponse = (ListFlowDraftsResponse) o;
    if (!Objects.equals(this.flowSummaries, listFlowDraftsResponse.flowSummaries)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowSummaries, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFlowDraftsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flowSummaries: ").append(toIndentedString(flowSummaries)).append("\n");
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

