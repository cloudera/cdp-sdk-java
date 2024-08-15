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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.VwFilter;

/**
 * Request object for the listVws method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:16.327-07:00")
public class ListVwsRequest  {

  /**
   * ID of cluster to list.
   **/
  private String clusterId = null;

  /**
   * Filter object for listVws method.
   **/
  private VwFilter filter = null;

  /**
   * Getter for clusterId.
   * ID of cluster to list.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of cluster to list.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for filter.
   * Filter object for listVws method.
   **/
  @JsonProperty("filter")
  public VwFilter getFilter() {
    return filter;
  }

  /**
   * Setter for filter.
   * Filter object for listVws method.
   **/
  public void setFilter(VwFilter filter) {
    this.filter = filter;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVwsRequest listVwsRequest = (ListVwsRequest) o;
    if (!Objects.equals(this.clusterId, listVwsRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.filter, listVwsRequest.filter)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVwsRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

