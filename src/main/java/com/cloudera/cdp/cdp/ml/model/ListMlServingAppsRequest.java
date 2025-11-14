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
import java.util.*;

/**
 * Request object for the ListMlServingApps method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:05.724-08:00")
public class ListMlServingAppsRequest  {

  /**
   * Additional query options.
   **/
  private List<String> queryOptions = new ArrayList<String>();

  /**
   * Getter for queryOptions.
   * Additional query options.
   **/
  @JsonProperty("queryOptions")
  public List<String> getQueryOptions() {
    return queryOptions;
  }

  /**
   * Setter for queryOptions.
   * Additional query options.
   **/
  public void setQueryOptions(List<String> queryOptions) {
    this.queryOptions = queryOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMlServingAppsRequest listMlServingAppsRequest = (ListMlServingAppsRequest) o;
    if (!Objects.equals(this.queryOptions, listMlServingAppsRequest.queryOptions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMlServingAppsRequest {\n");
    sb.append("    queryOptions: ").append(toIndentedString(queryOptions)).append("\n");
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

