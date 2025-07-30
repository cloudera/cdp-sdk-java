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
import com.cloudera.cdp.df.model.FlowVersionTag;
import java.util.*;

/**
 * Response object for the ListFlowVersionTags method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:44.473-07:00")
public class ListFlowVersionTagsResponse extends CdpResponse {

  /**
   * The flow version tag data.
   **/
  private List<FlowVersionTag> flowVersionTags = new ArrayList<FlowVersionTag>();

  /**
   * Getter for flowVersionTags.
   * The flow version tag data.
   **/
  @JsonProperty("flowVersionTags")
  public List<FlowVersionTag> getFlowVersionTags() {
    return flowVersionTags;
  }

  /**
   * Setter for flowVersionTags.
   * The flow version tag data.
   **/
  public void setFlowVersionTags(List<FlowVersionTag> flowVersionTags) {
    this.flowVersionTags = flowVersionTags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFlowVersionTagsResponse listFlowVersionTagsResponse = (ListFlowVersionTagsResponse) o;
    if (!Objects.equals(this.flowVersionTags, listFlowVersionTagsResponse.flowVersionTags)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowVersionTags, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFlowVersionTagsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flowVersionTags: ").append(toIndentedString(flowVersionTags)).append("\n");
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

