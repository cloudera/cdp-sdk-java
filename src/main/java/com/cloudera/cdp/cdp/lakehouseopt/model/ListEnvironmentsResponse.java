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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.lakehouseopt.model.Environment;
import java.util.*;

/**
 * The response object containing environment and CLO Data Hub details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class ListEnvironmentsResponse extends CdpResponse {

  /**
   * The page token for requesting the next page of results.
   **/
  private String nextPageToken = null;

  /**
   * This field represents the total number of environments.
   **/
  private Integer totalEnvironments = null;

  /**
   * The list containing environment details.
   **/
  private List<Environment> environments = new ArrayList<Environment>();

  /**
   * Getter for nextPageToken.
   * The page token for requesting the next page of results.
   **/
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Setter for nextPageToken.
   * The page token for requesting the next page of results.
   **/
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  /**
   * Getter for totalEnvironments.
   * This field represents the total number of environments.
   **/
  @JsonProperty("totalEnvironments")
  public Integer getTotalEnvironments() {
    return totalEnvironments;
  }

  /**
   * Setter for totalEnvironments.
   * This field represents the total number of environments.
   **/
  public void setTotalEnvironments(Integer totalEnvironments) {
    this.totalEnvironments = totalEnvironments;
  }

  /**
   * Getter for environments.
   * The list containing environment details.
   **/
  @JsonProperty("environments")
  public List<Environment> getEnvironments() {
    return environments;
  }

  /**
   * Setter for environments.
   * The list containing environment details.
   **/
  public void setEnvironments(List<Environment> environments) {
    this.environments = environments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEnvironmentsResponse listEnvironmentsResponse = (ListEnvironmentsResponse) o;
    if (!Objects.equals(this.nextPageToken, listEnvironmentsResponse.nextPageToken)) {
      return false;
    }
    if (!Objects.equals(this.totalEnvironments, listEnvironmentsResponse.totalEnvironments)) {
      return false;
    }
    if (!Objects.equals(this.environments, listEnvironmentsResponse.environments)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, totalEnvironments, environments, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEnvironmentsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    totalEnvironments: ").append(toIndentedString(totalEnvironments)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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

