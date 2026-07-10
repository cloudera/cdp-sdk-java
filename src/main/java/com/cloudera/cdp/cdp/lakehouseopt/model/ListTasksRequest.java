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

/**
 * Request object for listing tasks for a namespace.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class ListTasksRequest  {

  /**
   * The CRN of the CLO Data Hub.
   **/
  private String datahubCrn = null;

  /**
   * Namespace name to filter tasks.
   **/
  private String namespace = null;

  /**
   * The number of tasks.
   **/
  private Integer pageSize = 1;

  /**
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  private String pageToken = null;

  /**
   * Getter for datahubCrn.
   * The CRN of the CLO Data Hub.
   **/
  @JsonProperty("datahubCrn")
  public String getDatahubCrn() {
    return datahubCrn;
  }

  /**
   * Setter for datahubCrn.
   * The CRN of the CLO Data Hub.
   **/
  public void setDatahubCrn(String datahubCrn) {
    this.datahubCrn = datahubCrn;
  }

  /**
   * Getter for namespace.
   * Namespace name to filter tasks.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * Namespace name to filter tasks.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for pageSize.
   * The number of tasks.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * The number of tasks.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for pageToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  @JsonProperty("pageToken")
  public String getPageToken() {
    return pageToken;
  }

  /**
   * Setter for pageToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTasksRequest listTasksRequest = (ListTasksRequest) o;
    if (!Objects.equals(this.datahubCrn, listTasksRequest.datahubCrn)) {
      return false;
    }
    if (!Objects.equals(this.namespace, listTasksRequest.namespace)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listTasksRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.pageToken, listTasksRequest.pageToken)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahubCrn, namespace, pageSize, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTasksRequest {\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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

