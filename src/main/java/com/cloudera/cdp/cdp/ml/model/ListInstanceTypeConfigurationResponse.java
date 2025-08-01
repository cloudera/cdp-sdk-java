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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.InstanceDetails;
import java.util.*;

/**
 * Response object for the ListInstanceTypeConfiguration method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:41.723-07:00")
public class ListInstanceTypeConfigurationResponse extends CdpResponse {

  /**
   * Contains a list of instance details, including CPU, GPU, memory, and name, for queried supported instance type in the queried region.
   **/
  private List<InstanceDetails> instanceDetails = new ArrayList<InstanceDetails>();

  /**
   * Getter for instanceDetails.
   * Contains a list of instance details, including CPU, GPU, memory, and name, for queried supported instance type in the queried region.
   **/
  @JsonProperty("instanceDetails")
  public List<InstanceDetails> getInstanceDetails() {
    return instanceDetails;
  }

  /**
   * Setter for instanceDetails.
   * Contains a list of instance details, including CPU, GPU, memory, and name, for queried supported instance type in the queried region.
   **/
  public void setInstanceDetails(List<InstanceDetails> instanceDetails) {
    this.instanceDetails = instanceDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListInstanceTypeConfigurationResponse listInstanceTypeConfigurationResponse = (ListInstanceTypeConfigurationResponse) o;
    if (!Objects.equals(this.instanceDetails, listInstanceTypeConfigurationResponse.instanceDetails)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceDetails, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInstanceTypeConfigurationResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    instanceDetails: ").append(toIndentedString(instanceDetails)).append("\n");
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

