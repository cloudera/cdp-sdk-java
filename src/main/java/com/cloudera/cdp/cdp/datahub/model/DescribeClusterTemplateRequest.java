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
 * Request object for describe cluster template request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:40.396-08:00")
public class DescribeClusterTemplateRequest  {

  /**
   * The name or CRN of the cluster template.
   **/
  private String clusterTemplateName = null;

  /**
   * Getter for clusterTemplateName.
   * The name or CRN of the cluster template.
   **/
  @JsonProperty("clusterTemplateName")
  public String getClusterTemplateName() {
    return clusterTemplateName;
  }

  /**
   * Setter for clusterTemplateName.
   * The name or CRN of the cluster template.
   **/
  public void setClusterTemplateName(String clusterTemplateName) {
    this.clusterTemplateName = clusterTemplateName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeClusterTemplateRequest describeClusterTemplateRequest = (DescribeClusterTemplateRequest) o;
    if (!Objects.equals(this.clusterTemplateName, describeClusterTemplateRequest.clusterTemplateName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterTemplateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeClusterTemplateRequest {\n");
    sb.append("    clusterTemplateName: ").append(toIndentedString(clusterTemplateName)).append("\n");
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

