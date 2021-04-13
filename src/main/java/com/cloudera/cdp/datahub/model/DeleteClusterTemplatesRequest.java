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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for delete cluster templates request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-13T14:18:22.501-07:00")
public class DeleteClusterTemplatesRequest  {

  /**
   * The names or CRNs of the cluster templates to be deleted.
   **/
  private List<String> clusterTemplateNames = new ArrayList<String>();

  /**
   * Getter for clusterTemplateNames.
   * The names or CRNs of the cluster templates to be deleted.
   **/
  @JsonProperty("clusterTemplateNames")
  public List<String> getClusterTemplateNames() {
    return clusterTemplateNames;
  }

  /**
   * Setter for clusterTemplateNames.
   * The names or CRNs of the cluster templates to be deleted.
   **/
  public void setClusterTemplateNames(List<String> clusterTemplateNames) {
    this.clusterTemplateNames = clusterTemplateNames;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteClusterTemplatesRequest deleteClusterTemplatesRequest = (DeleteClusterTemplatesRequest) o;
    if (!Objects.equals(this.clusterTemplateNames, deleteClusterTemplatesRequest.clusterTemplateNames)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterTemplateNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteClusterTemplatesRequest {\n");
    sb.append("    clusterTemplateNames: ").append(toIndentedString(clusterTemplateNames)).append("\n");
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

