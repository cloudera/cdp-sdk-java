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

/**
 * Response object for the CreateVersionTag method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:37.206-07:00")
public class CreateFlowVersionTagResponse extends CdpResponse {

  /**
   * Flow version tag details.
   **/
  private FlowVersionTag flowVersionTag = null;

  /**
   * Getter for flowVersionTag.
   * Flow version tag details.
   **/
  @JsonProperty("flowVersionTag")
  public FlowVersionTag getFlowVersionTag() {
    return flowVersionTag;
  }

  /**
   * Setter for flowVersionTag.
   * Flow version tag details.
   **/
  public void setFlowVersionTag(FlowVersionTag flowVersionTag) {
    this.flowVersionTag = flowVersionTag;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFlowVersionTagResponse createFlowVersionTagResponse = (CreateFlowVersionTagResponse) o;
    if (!Objects.equals(this.flowVersionTag, createFlowVersionTagResponse.flowVersionTag)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowVersionTag, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFlowVersionTagResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flowVersionTag: ").append(toIndentedString(flowVersionTag)).append("\n");
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

