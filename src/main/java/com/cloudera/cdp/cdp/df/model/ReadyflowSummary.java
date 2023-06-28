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
 * A summarized version of a ready flow, mostly useful in listing flows
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-28T12:35:43.241-07:00")
public class ReadyflowSummary  {

  /**
   * The ready flow CRN
   **/
  private String readyflowCrn = null;

  /**
   * The ready flow name
   **/
  private String name = null;

  /**
   * The ready flow summary
   **/
  private String summary = null;

  /**
   * The ready flow source
   **/
  private String source = null;

  /**
   * The ready flow destination
   **/
  private String destination = null;

  /**
   * The latest version of the ready flow
   **/
  private Integer latestVersion = null;

  /**
   * Whether the ready flow has been imported into the current account
   **/
  private Boolean imported = null;

  /**
   * The crn of the imported ready flow, used to look up its details
   **/
  private String importedArtifactCrn = null;

  /**
   * Getter for readyflowCrn.
   * The ready flow CRN
   **/
  @JsonProperty("readyflowCrn")
  public String getReadyflowCrn() {
    return readyflowCrn;
  }

  /**
   * Setter for readyflowCrn.
   * The ready flow CRN
   **/
  public void setReadyflowCrn(String readyflowCrn) {
    this.readyflowCrn = readyflowCrn;
  }

  /**
   * Getter for name.
   * The ready flow name
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The ready flow name
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for summary.
   * The ready flow summary
   **/
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  /**
   * Setter for summary.
   * The ready flow summary
   **/
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Getter for source.
   * The ready flow source
   **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  /**
   * Setter for source.
   * The ready flow source
   **/
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Getter for destination.
   * The ready flow destination
   **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * The ready flow destination
   **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Getter for latestVersion.
   * The latest version of the ready flow
   **/
  @JsonProperty("latestVersion")
  public Integer getLatestVersion() {
    return latestVersion;
  }

  /**
   * Setter for latestVersion.
   * The latest version of the ready flow
   **/
  public void setLatestVersion(Integer latestVersion) {
    this.latestVersion = latestVersion;
  }

  /**
   * Getter for imported.
   * Whether the ready flow has been imported into the current account
   **/
  @JsonProperty("imported")
  public Boolean getImported() {
    return imported;
  }

  /**
   * Setter for imported.
   * Whether the ready flow has been imported into the current account
   **/
  public void setImported(Boolean imported) {
    this.imported = imported;
  }

  /**
   * Getter for importedArtifactCrn.
   * The crn of the imported ready flow, used to look up its details
   **/
  @JsonProperty("importedArtifactCrn")
  public String getImportedArtifactCrn() {
    return importedArtifactCrn;
  }

  /**
   * Setter for importedArtifactCrn.
   * The crn of the imported ready flow, used to look up its details
   **/
  public void setImportedArtifactCrn(String importedArtifactCrn) {
    this.importedArtifactCrn = importedArtifactCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadyflowSummary readyflowSummary = (ReadyflowSummary) o;
    if (!Objects.equals(this.readyflowCrn, readyflowSummary.readyflowCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, readyflowSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.summary, readyflowSummary.summary)) {
      return false;
    }
    if (!Objects.equals(this.source, readyflowSummary.source)) {
      return false;
    }
    if (!Objects.equals(this.destination, readyflowSummary.destination)) {
      return false;
    }
    if (!Objects.equals(this.latestVersion, readyflowSummary.latestVersion)) {
      return false;
    }
    if (!Objects.equals(this.imported, readyflowSummary.imported)) {
      return false;
    }
    if (!Objects.equals(this.importedArtifactCrn, readyflowSummary.importedArtifactCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(readyflowCrn, name, summary, source, destination, latestVersion, imported, importedArtifactCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadyflowSummary {\n");
    sb.append("    readyflowCrn: ").append(toIndentedString(readyflowCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    imported: ").append(toIndentedString(imported)).append("\n");
    sb.append("    importedArtifactCrn: ").append(toIndentedString(importedArtifactCrn)).append("\n");
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

