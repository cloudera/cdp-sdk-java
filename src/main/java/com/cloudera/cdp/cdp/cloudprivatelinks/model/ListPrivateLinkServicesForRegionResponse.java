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

package com.cloudera.cdp.cloudprivatelinks.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.cloudprivatelinks.model.ListPrivateLinkServicesForRegionResult;
import java.util.*;

/**
 * Response object for the ListPrivateLinkServicesForTheRegion method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:31.992-07:00")
public class ListPrivateLinkServicesForRegionResponse extends CdpResponse {

  /**
   * List of ListPrivateLinkServicesForTheRegionResult objects to be returned.
   **/
  private List<ListPrivateLinkServicesForRegionResult> listPrivateLinkServicesForRegionResults = new ArrayList<ListPrivateLinkServicesForRegionResult>();

  /**
   * Getter for listPrivateLinkServicesForRegionResults.
   * List of ListPrivateLinkServicesForTheRegionResult objects to be returned.
   **/
  @JsonProperty("listPrivateLinkServicesForRegionResults")
  public List<ListPrivateLinkServicesForRegionResult> getListPrivateLinkServicesForRegionResults() {
    return listPrivateLinkServicesForRegionResults;
  }

  /**
   * Setter for listPrivateLinkServicesForRegionResults.
   * List of ListPrivateLinkServicesForTheRegionResult objects to be returned.
   **/
  public void setListPrivateLinkServicesForRegionResults(List<ListPrivateLinkServicesForRegionResult> listPrivateLinkServicesForRegionResults) {
    this.listPrivateLinkServicesForRegionResults = listPrivateLinkServicesForRegionResults;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPrivateLinkServicesForRegionResponse listPrivateLinkServicesForRegionResponse = (ListPrivateLinkServicesForRegionResponse) o;
    if (!Objects.equals(this.listPrivateLinkServicesForRegionResults, listPrivateLinkServicesForRegionResponse.listPrivateLinkServicesForRegionResults)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(listPrivateLinkServicesForRegionResults, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPrivateLinkServicesForRegionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    listPrivateLinkServicesForRegionResults: ").append(toIndentedString(listPrivateLinkServicesForRegionResults)).append("\n");
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

