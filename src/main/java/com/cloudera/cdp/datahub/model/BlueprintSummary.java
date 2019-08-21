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
import com.cloudera.cdp.datahub.model.DatahubResourceTag;
import java.util.*;

/**
 * Information about blueprint.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-21T14:31:31.470-07:00")
public class BlueprintSummary  {

  /**
   * The name of the blueprint.
   **/
  private String blueprintName = null;

  /**
   * The CRN of the blueprint.
   **/
  private String crn = null;

  /**
   * The description of the blueprint.
   **/
  private String description = null;

  /**
   * The product version.
   **/
  private String productVersion = null;

  /**
   * The instance group count of the cluster.
   **/
  private Integer instanceGroupCount = null;

  /**
   * The status of the blueprint.
   **/
  private String status = null;

  /**
   * Tags added to the blueprint.
   **/
  private List<DatahubResourceTag> tags = new ArrayList<DatahubResourceTag>();

  /**
   * Getter for blueprintName.
   * The name of the blueprint.
   **/
  @JsonProperty("blueprintName")
  public String getBlueprintName() {
    return blueprintName;
  }

  /**
   * Setter for blueprintName.
   * The name of the blueprint.
   **/
  public void setBlueprintName(String blueprintName) {
    this.blueprintName = blueprintName;
  }

  /**
   * Getter for crn.
   * The CRN of the blueprint.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the blueprint.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for description.
   * The description of the blueprint.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the blueprint.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for productVersion.
   * The product version.
   **/
  @JsonProperty("productVersion")
  public String getProductVersion() {
    return productVersion;
  }

  /**
   * Setter for productVersion.
   * The product version.
   **/
  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }

  /**
   * Getter for instanceGroupCount.
   * The instance group count of the cluster.
   **/
  @JsonProperty("instanceGroupCount")
  public Integer getInstanceGroupCount() {
    return instanceGroupCount;
  }

  /**
   * Setter for instanceGroupCount.
   * The instance group count of the cluster.
   **/
  public void setInstanceGroupCount(Integer instanceGroupCount) {
    this.instanceGroupCount = instanceGroupCount;
  }

  /**
   * Getter for status.
   * The status of the blueprint.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the blueprint.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for tags.
   * Tags added to the blueprint.
   **/
  @JsonProperty("tags")
  public List<DatahubResourceTag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags added to the blueprint.
   **/
  public void setTags(List<DatahubResourceTag> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlueprintSummary blueprintSummary = (BlueprintSummary) o;
    if (!Objects.equals(this.blueprintName, blueprintSummary.blueprintName)) {
      return false;
    }
    if (!Objects.equals(this.crn, blueprintSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.description, blueprintSummary.description)) {
      return false;
    }
    if (!Objects.equals(this.productVersion, blueprintSummary.productVersion)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupCount, blueprintSummary.instanceGroupCount)) {
      return false;
    }
    if (!Objects.equals(this.status, blueprintSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.tags, blueprintSummary.tags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueprintName, crn, description, productVersion, instanceGroupCount, status, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlueprintSummary {\n");
    sb.append("    blueprintName: ").append(toIndentedString(blueprintName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    instanceGroupCount: ").append(toIndentedString(instanceGroupCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

