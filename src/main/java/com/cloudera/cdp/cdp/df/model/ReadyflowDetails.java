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
 * A detailed representation of a ready flow.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-05T12:07:36.955-07:00")
public class ReadyflowDetails  {

  /**
   * The ready flow CRN
   **/
  private String readyflowCrn = null;

  /**
   * The ready flow name
   **/
  private String name = null;

  /**
   * The author of the most recent version
   **/
  private String author = null;

  /**
   * The ready flow summary (short)
   **/
  private String summary = null;

  /**
   * The ready flow description (long)
   **/
  private String description = null;

  /**
   * A link to the ready flow documentation
   **/
  private String documentationLink = null;

  /**
   * Optional notes about the ready flow
   **/
  private String notes = null;

  /**
   * The ready flow data source
   **/
  private String source = null;

  /**
   * The ready flow data source format
   **/
  private String sourceDataFormat = null;

  /**
   * The ready flow data destination
   **/
  private String destination = null;

  /**
   * The ready flow data destination format
   **/
  private String destinationDataFormat = null;

  /**
   * Whether the ready flow has been imported into the current account
   **/
  private Boolean imported = null;

  /**
   * The modified timestamp.
   **/
  private Long modifiedTimestamp = null;

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
   * Getter for author.
   * The author of the most recent version
   **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  /**
   * Setter for author.
   * The author of the most recent version
   **/
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Getter for summary.
   * The ready flow summary (short)
   **/
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  /**
   * Setter for summary.
   * The ready flow summary (short)
   **/
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Getter for description.
   * The ready flow description (long)
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The ready flow description (long)
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for documentationLink.
   * A link to the ready flow documentation
   **/
  @JsonProperty("documentationLink")
  public String getDocumentationLink() {
    return documentationLink;
  }

  /**
   * Setter for documentationLink.
   * A link to the ready flow documentation
   **/
  public void setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
  }

  /**
   * Getter for notes.
   * Optional notes about the ready flow
   **/
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  /**
   * Setter for notes.
   * Optional notes about the ready flow
   **/
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Getter for source.
   * The ready flow data source
   **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  /**
   * Setter for source.
   * The ready flow data source
   **/
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Getter for sourceDataFormat.
   * The ready flow data source format
   **/
  @JsonProperty("sourceDataFormat")
  public String getSourceDataFormat() {
    return sourceDataFormat;
  }

  /**
   * Setter for sourceDataFormat.
   * The ready flow data source format
   **/
  public void setSourceDataFormat(String sourceDataFormat) {
    this.sourceDataFormat = sourceDataFormat;
  }

  /**
   * Getter for destination.
   * The ready flow data destination
   **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * The ready flow data destination
   **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Getter for destinationDataFormat.
   * The ready flow data destination format
   **/
  @JsonProperty("destinationDataFormat")
  public String getDestinationDataFormat() {
    return destinationDataFormat;
  }

  /**
   * Setter for destinationDataFormat.
   * The ready flow data destination format
   **/
  public void setDestinationDataFormat(String destinationDataFormat) {
    this.destinationDataFormat = destinationDataFormat;
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
    ReadyflowDetails readyflowDetails = (ReadyflowDetails) o;
    if (!Objects.equals(this.readyflowCrn, readyflowDetails.readyflowCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, readyflowDetails.name)) {
      return false;
    }
    if (!Objects.equals(this.author, readyflowDetails.author)) {
      return false;
    }
    if (!Objects.equals(this.summary, readyflowDetails.summary)) {
      return false;
    }
    if (!Objects.equals(this.description, readyflowDetails.description)) {
      return false;
    }
    if (!Objects.equals(this.documentationLink, readyflowDetails.documentationLink)) {
      return false;
    }
    if (!Objects.equals(this.notes, readyflowDetails.notes)) {
      return false;
    }
    if (!Objects.equals(this.source, readyflowDetails.source)) {
      return false;
    }
    if (!Objects.equals(this.sourceDataFormat, readyflowDetails.sourceDataFormat)) {
      return false;
    }
    if (!Objects.equals(this.destination, readyflowDetails.destination)) {
      return false;
    }
    if (!Objects.equals(this.destinationDataFormat, readyflowDetails.destinationDataFormat)) {
      return false;
    }
    if (!Objects.equals(this.imported, readyflowDetails.imported)) {
      return false;
    }
    if (!Objects.equals(this.modifiedTimestamp, readyflowDetails.modifiedTimestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(readyflowCrn, name, author, summary, description, documentationLink, notes, source, sourceDataFormat, destination, destinationDataFormat, imported, modifiedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadyflowDetails {\n");
    sb.append("    readyflowCrn: ").append(toIndentedString(readyflowCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentationLink: ").append(toIndentedString(documentationLink)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceDataFormat: ").append(toIndentedString(sourceDataFormat)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    destinationDataFormat: ").append(toIndentedString(destinationDataFormat)).append("\n");
    sb.append("    imported: ").append(toIndentedString(imported)).append("\n");
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

