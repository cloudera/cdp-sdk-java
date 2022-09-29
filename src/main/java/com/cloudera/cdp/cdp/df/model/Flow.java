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
import com.cloudera.cdp.df.model.FlowVersion;
import java.util.*;

/**
 * A representation of a versioned data flow.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-28T16:30:06.540-07:00")
public class Flow  {

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
   * The created timestamp.
   **/
  private Long createdTimestamp = null;

  /**
   * Author of the most recent version
   **/
  private String author = null;

  /**
   * The artifact description.
   **/
  private String description = null;

  /**
   * The modified timestamp.
   **/
  private Long modifiedTimestamp = null;

  /**
   * The list of artifactDetail versions
   **/
  private List<FlowVersion> versions = new ArrayList<FlowVersion>();

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
   * Getter for createdTimestamp.
   * The created timestamp.
   **/
  @JsonProperty("createdTimestamp")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  /**
   * Setter for createdTimestamp.
   * The created timestamp.
   **/
  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   * Getter for author.
   * Author of the most recent version
   **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  /**
   * Setter for author.
   * Author of the most recent version
   **/
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Getter for description.
   * The artifact description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The artifact description.
   **/
  public void setDescription(String description) {
    this.description = description;
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

  /**
   * Getter for versions.
   * The list of artifactDetail versions
   **/
  @JsonProperty("versions")
  public List<FlowVersion> getVersions() {
    return versions;
  }

  /**
   * Setter for versions.
   * The list of artifactDetail versions
   **/
  public void setVersions(List<FlowVersion> versions) {
    this.versions = versions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flow flow = (Flow) o;
    if (!Objects.equals(this.crn, flow.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, flow.name)) {
      return false;
    }
    if (!Objects.equals(this.versionCount, flow.versionCount)) {
      return false;
    }
    if (!Objects.equals(this.createdTimestamp, flow.createdTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.author, flow.author)) {
      return false;
    }
    if (!Objects.equals(this.description, flow.description)) {
      return false;
    }
    if (!Objects.equals(this.modifiedTimestamp, flow.modifiedTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.versions, flow.versions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, versionCount, createdTimestamp, author, description, modifiedTimestamp, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flow {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedTimestamp: ").append(toIndentedString(modifiedTimestamp)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

