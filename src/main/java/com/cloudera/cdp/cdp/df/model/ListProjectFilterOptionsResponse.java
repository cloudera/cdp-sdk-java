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
import com.cloudera.cdp.df.model.ProjectFilterOption;
import java.util.*;

/**
 * A response to list filter options
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:44.984-08:00")
public class ListProjectFilterOptionsResponse extends CdpResponse {

  /**
   * The filter options
   **/
  private List<ProjectFilterOption> filterOptions = new ArrayList<ProjectFilterOption>();

  /**
   * Getter for filterOptions.
   * The filter options
   **/
  @JsonProperty("filterOptions")
  public List<ProjectFilterOption> getFilterOptions() {
    return filterOptions;
  }

  /**
   * Setter for filterOptions.
   * The filter options
   **/
  public void setFilterOptions(List<ProjectFilterOption> filterOptions) {
    this.filterOptions = filterOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListProjectFilterOptionsResponse listProjectFilterOptionsResponse = (ListProjectFilterOptionsResponse) o;
    if (!Objects.equals(this.filterOptions, listProjectFilterOptionsResponse.filterOptions)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterOptions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProjectFilterOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    filterOptions: ").append(toIndentedString(filterOptions)).append("\n");
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

