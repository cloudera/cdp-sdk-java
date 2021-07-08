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

package com.cloudera.cdp.scim.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.scim.model.ScimUser;
import java.util.*;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-07T21:20:15.648-07:00")
public class ScimQueryUsersResponse extends CdpResponse {

  /**
   * 
   **/
  private List<String> schemas = new ArrayList<String>();

  /**
   * 
   **/
  private Integer totalResults = null;

  /**
   * 
   **/
  private List<ScimUser> resources = new ArrayList<ScimUser>();

  /**
   * 
   **/
  private Integer startIndex = null;

  /**
   * 
   **/
  private Integer itemsPerPage = null;

  /**
   * Getter for schemas.
   * 
   **/
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }

  /**
   * Setter for schemas.
   * 
   **/
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  /**
   * Getter for totalResults.
   * 
   **/
  @JsonProperty("totalResults")
  public Integer getTotalResults() {
    return totalResults;
  }

  /**
   * Setter for totalResults.
   * 
   **/
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  /**
   * Getter for resources.
   * 
   **/
  @JsonProperty("Resources")
  public List<ScimUser> getResources() {
    return resources;
  }

  /**
   * Setter for resources.
   * 
   **/
  public void setResources(List<ScimUser> resources) {
    this.resources = resources;
  }

  /**
   * Getter for startIndex.
   * 
   **/
  @JsonProperty("startIndex")
  public Integer getStartIndex() {
    return startIndex;
  }

  /**
   * Setter for startIndex.
   * 
   **/
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * Getter for itemsPerPage.
   * 
   **/
  @JsonProperty("itemsPerPage")
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  /**
   * Setter for itemsPerPage.
   * 
   **/
  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimQueryUsersResponse scimQueryUsersResponse = (ScimQueryUsersResponse) o;
    if (!Objects.equals(this.schemas, scimQueryUsersResponse.schemas)) {
      return false;
    }
    if (!Objects.equals(this.totalResults, scimQueryUsersResponse.totalResults)) {
      return false;
    }
    if (!Objects.equals(this.resources, scimQueryUsersResponse.resources)) {
      return false;
    }
    if (!Objects.equals(this.startIndex, scimQueryUsersResponse.startIndex)) {
      return false;
    }
    if (!Objects.equals(this.itemsPerPage, scimQueryUsersResponse.itemsPerPage)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, totalResults, resources, startIndex, itemsPerPage, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimQueryUsersResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
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

