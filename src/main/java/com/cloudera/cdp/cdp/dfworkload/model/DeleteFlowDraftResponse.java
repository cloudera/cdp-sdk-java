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
import com.cloudera.cdp.dfworkload.model.FlowMetadata;

/**
 * Response object for deleting a flow draft.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:45.482-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class DeleteFlowDraftResponse extends CdpResponse {

  /**
   * The metadata of the deleted flow designer draft.
   **/
  private FlowMetadata flowMetadata = null;

  /**
   * Getter for flowMetadata.
   * The metadata of the deleted flow designer draft.
   **/
  @JsonProperty("flowMetadata")
  public FlowMetadata getFlowMetadata() {
    return flowMetadata;
  }

  /**
   * Setter for flowMetadata.
   * The metadata of the deleted flow designer draft.
   **/
  public void setFlowMetadata(FlowMetadata flowMetadata) {
    this.flowMetadata = flowMetadata;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteFlowDraftResponse deleteFlowDraftResponse = (DeleteFlowDraftResponse) o;
    if (!Objects.equals(this.flowMetadata, deleteFlowDraftResponse.flowMetadata)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowMetadata, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteFlowDraftResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flowMetadata: ").append(toIndentedString(flowMetadata)).append("\n");
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

