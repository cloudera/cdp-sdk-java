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

/**
 * Request object for create cluster definition request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-09-05T21:16:02.783-07:00")
public class CreateClusterDefinitionRequest  {

  /**
   * The name of the cluster definition. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  private String clusterDefinitionName = null;

  /**
   * The workload template.
   **/
  private String workloadTemplate = null;

  /**
   * The description of the cluster definition. The description can have a maximum of 1000 characters.
   **/
  private String description = null;

  /**
   * Getter for clusterDefinitionName.
   * The name of the cluster definition. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("clusterDefinitionName")
  public String getClusterDefinitionName() {
    return clusterDefinitionName;
  }

  /**
   * Setter for clusterDefinitionName.
   * The name of the cluster definition. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  public void setClusterDefinitionName(String clusterDefinitionName) {
    this.clusterDefinitionName = clusterDefinitionName;
  }

  /**
   * Getter for workloadTemplate.
   * The workload template.
   **/
  @JsonProperty("workloadTemplate")
  public String getWorkloadTemplate() {
    return workloadTemplate;
  }

  /**
   * Setter for workloadTemplate.
   * The workload template.
   **/
  public void setWorkloadTemplate(String workloadTemplate) {
    this.workloadTemplate = workloadTemplate;
  }

  /**
   * Getter for description.
   * The description of the cluster definition. The description can have a maximum of 1000 characters.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the cluster definition. The description can have a maximum of 1000 characters.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterDefinitionRequest createClusterDefinitionRequest = (CreateClusterDefinitionRequest) o;
    if (!Objects.equals(this.clusterDefinitionName, createClusterDefinitionRequest.clusterDefinitionName)) {
      return false;
    }
    if (!Objects.equals(this.workloadTemplate, createClusterDefinitionRequest.workloadTemplate)) {
      return false;
    }
    if (!Objects.equals(this.description, createClusterDefinitionRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterDefinitionName, workloadTemplate, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterDefinitionRequest {\n");
    sb.append("    clusterDefinitionName: ").append(toIndentedString(clusterDefinitionName)).append("\n");
    sb.append("    workloadTemplate: ").append(toIndentedString(workloadTemplate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

