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
import com.cloudera.cdp.df.model.ServiceMeta;

/**
 * A Project
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:29.380-07:00")
public class Project  {

  /**
   * The Project CRN.
   **/
  private String crn = null;

  /**
   * The Project name.
   **/
  private String name = null;

  /**
   * The DataFlow service information of the Project
   **/
  private ServiceMeta service = null;

  /**
   * The created timestamp.
   **/
  private Long created = null;

  /**
   * The last updated timestamp.
   **/
  private Long updated = null;

  /**
   * The Project revision
   **/
  private Integer revision = null;

  /**
   * The Project description.
   **/
  private String description = null;

  /**
   * Whether or not the project is currently deleting
   **/
  private Boolean deleting = null;

  /**
   * Getter for crn.
   * The Project CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The Project CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The Project name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The Project name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for service.
   * The DataFlow service information of the Project
   **/
  @JsonProperty("service")
  public ServiceMeta getService() {
    return service;
  }

  /**
   * Setter for service.
   * The DataFlow service information of the Project
   **/
  public void setService(ServiceMeta service) {
    this.service = service;
  }

  /**
   * Getter for created.
   * The created timestamp.
   **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * The created timestamp.
   **/
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   * Getter for updated.
   * The last updated timestamp.
   **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  /**
   * Setter for updated.
   * The last updated timestamp.
   **/
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   * Getter for revision.
   * The Project revision
   **/
  @JsonProperty("revision")
  public Integer getRevision() {
    return revision;
  }

  /**
   * Setter for revision.
   * The Project revision
   **/
  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  /**
   * Getter for description.
   * The Project description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The Project description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for deleting.
   * Whether or not the project is currently deleting
   **/
  @JsonProperty("deleting")
  public Boolean getDeleting() {
    return deleting;
  }

  /**
   * Setter for deleting.
   * Whether or not the project is currently deleting
   **/
  public void setDeleting(Boolean deleting) {
    this.deleting = deleting;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    if (!Objects.equals(this.crn, project.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, project.name)) {
      return false;
    }
    if (!Objects.equals(this.service, project.service)) {
      return false;
    }
    if (!Objects.equals(this.created, project.created)) {
      return false;
    }
    if (!Objects.equals(this.updated, project.updated)) {
      return false;
    }
    if (!Objects.equals(this.revision, project.revision)) {
      return false;
    }
    if (!Objects.equals(this.description, project.description)) {
      return false;
    }
    if (!Objects.equals(this.deleting, project.deleting)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, service, created, updated, revision, description, deleting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deleting: ").append(toIndentedString(deleting)).append("\n");
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

