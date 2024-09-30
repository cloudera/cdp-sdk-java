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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A summarized version of a flow, mostly useful in listing flows
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-27T08:40:28.348-07:00")
public class FlowSummary  {

  /**
   * The artifact CRN
   **/
  private String crn = null;

  /**
   * The artifact name.
   **/
  private String name = null;

  /**
   * The number of versions uploaded to the catalog.
   **/
  private Integer versionCount = null;

  /**
   * The type of artifact
   **/
  private String artifactType = null;

  /**
   * The modified timestamp.
   **/
  private Long modifiedTimestamp = null;

  /**
   * Getter for crn.
   * The artifact CRN
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The artifact CRN
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The artifact name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The artifact name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for versionCount.
   * The number of versions uploaded to the catalog.
   **/
  @JsonProperty("versionCount")
  public Integer getVersionCount() {
    return versionCount;
  }

  /**
   * Setter for versionCount.
   * The number of versions uploaded to the catalog.
   **/
  public void setVersionCount(Integer versionCount) {
    this.versionCount = versionCount;
  }

  /**
   * Getter for artifactType.
   * The type of artifact
   **/
  @JsonProperty("artifactType")
  public String getArtifactType() {
    return artifactType;
  }

  /**
   * Setter for artifactType.
   * The type of artifact
   **/
  public void setArtifactType(String artifactType) {
    this.artifactType = artifactType;
  }

  /**
   * Getter for modifiedTimestamp.
   * The modified timestamp.
   **/
  @JsonProperty("modifiedTimestamp")
  public Long getModifiedTimestamp() {
    return modifiedTimestamp;
  }

  /**
   * Setter for modifiedTimestamp.
   * The modified timestamp.
   **/
  public void setModifiedTimestamp(Long modifiedTimestamp) {
    this.modifiedTimestamp = modifiedTimestamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowSummary flowSummary = (FlowSummary) o;
    if (!Objects.equals(this.crn, flowSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, flowSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.versionCount, flowSummary.versionCount)) {
      return false;
    }
    if (!Objects.equals(this.artifactType, flowSummary.artifactType)) {
      return false;
    }
    if (!Objects.equals(this.modifiedTimestamp, flowSummary.modifiedTimestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, versionCount, artifactType, modifiedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
    sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
    sb.append("    modifiedTimestamp: ").append(toIndentedString(modifiedTimestamp)).append("\n");
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

