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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.iam.model.ResourceAssignment;
import java.util.*;

/**
 * Response object for a list group assigned resource roles request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-02-02T18:44:25.170-08:00")
public class ListGroupAssignedResourceRolesResponse extends CdpResponse {

  /**
   * The group's resource assignments.
   **/
  private List<ResourceAssignment> resourceAssignments = new ArrayList<ResourceAssignment>();

  /**
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  private String nextToken = null;

  /**
   * Getter for resourceAssignments.
   * The group&#39;s resource assignments.
   **/
  @JsonProperty("resourceAssignments")
  public List<ResourceAssignment> getResourceAssignments() {
    return resourceAssignments;
  }

  /**
   * Setter for resourceAssignments.
   * The group&#39;s resource assignments.
   **/
  public void setResourceAssignments(List<ResourceAssignment> resourceAssignments) {
    this.resourceAssignments = resourceAssignments;
  }

  /**
   * Getter for nextToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGroupAssignedResourceRolesResponse listGroupAssignedResourceRolesResponse = (ListGroupAssignedResourceRolesResponse) o;
    if (!Objects.equals(this.resourceAssignments, listGroupAssignedResourceRolesResponse.resourceAssignments)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listGroupAssignedResourceRolesResponse.nextToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceAssignments, nextToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGroupAssignedResourceRolesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resourceAssignments: ").append(toIndentedString(resourceAssignments)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

