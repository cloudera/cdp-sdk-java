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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.ActorResponse;
import com.cloudera.cdp.dw.model.ApplicationResources;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.Map;

/**
 * A Database Catalog.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:18.456-07:00")
public class DbcSummary  {

  /**
   * The CRN of the Database Catalog.
   **/
  private String crn = null;

  /**
   * The ID of the Database Catalog.
   **/
  private String id = null;

  /**
   * The name of the Database Catalog.
   **/
  private String name = null;

  /**
   * The resource template of the Database Catalog.
   **/
  private String resourceTemplateId = null;

  /**
   * Status of the Database Catalog. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  private String status = null;

  /**
   * Timestamp of the last status change of the Database Catalog.
   **/
  private ZonedDateTime statusChangedAt = null;

  /**
   * The creator of the Database Catalog.
   **/
  private ActorResponse creator = null;

  /**
   * Creation date of Database Catalog.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The name of the Resource Pool the Database Catalog is in.
   **/
  private String resourcePool = null;

  /**
   * The actual resources used by the Database Catalog.
   **/
  private Map<String, ApplicationResources> resources = new HashMap<String, ApplicationResources>();

  /**
   * Getter for crn.
   * The CRN of the Database Catalog.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the Database Catalog.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for id.
   * The ID of the Database Catalog.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the Database Catalog.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * The name of the Database Catalog.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the Database Catalog.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for resourceTemplateId.
   * The resource template of the Database Catalog.
   **/
  @JsonProperty("resourceTemplateId")
  public String getResourceTemplateId() {
    return resourceTemplateId;
  }

  /**
   * Setter for resourceTemplateId.
   * The resource template of the Database Catalog.
   **/
  public void setResourceTemplateId(String resourceTemplateId) {
    this.resourceTemplateId = resourceTemplateId;
  }

  /**
   * Getter for status.
   * Status of the Database Catalog. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the Database Catalog. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for statusChangedAt.
   * Timestamp of the last status change of the Database Catalog.
   **/
  @JsonProperty("statusChangedAt")
  public ZonedDateTime getStatusChangedAt() {
    return statusChangedAt;
  }

  /**
   * Setter for statusChangedAt.
   * Timestamp of the last status change of the Database Catalog.
   **/
  public void setStatusChangedAt(ZonedDateTime statusChangedAt) {
    this.statusChangedAt = statusChangedAt;
  }

  /**
   * Getter for creator.
   * The creator of the Database Catalog.
   **/
  @JsonProperty("creator")
  public ActorResponse getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The creator of the Database Catalog.
   **/
  public void setCreator(ActorResponse creator) {
    this.creator = creator;
  }

  /**
   * Getter for creationDate.
   * Creation date of Database Catalog.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of Database Catalog.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for resourcePool.
   * The name of the Resource Pool the Database Catalog is in.
   **/
  @JsonProperty("resourcePool")
  public String getResourcePool() {
    return resourcePool;
  }

  /**
   * Setter for resourcePool.
   * The name of the Resource Pool the Database Catalog is in.
   **/
  public void setResourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
  }

  /**
   * Getter for resources.
   * The actual resources used by the Database Catalog.
   **/
  @JsonProperty("resources")
  public Map<String, ApplicationResources> getResources() {
    return resources;
  }

  /**
   * Setter for resources.
   * The actual resources used by the Database Catalog.
   **/
  public void setResources(Map<String, ApplicationResources> resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbcSummary dbcSummary = (DbcSummary) o;
    if (!Objects.equals(this.crn, dbcSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.id, dbcSummary.id)) {
      return false;
    }
    if (!Objects.equals(this.name, dbcSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.resourceTemplateId, dbcSummary.resourceTemplateId)) {
      return false;
    }
    if (!Objects.equals(this.status, dbcSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.statusChangedAt, dbcSummary.statusChangedAt)) {
      return false;
    }
    if (!Objects.equals(this.creator, dbcSummary.creator)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, dbcSummary.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.resourcePool, dbcSummary.resourcePool)) {
      return false;
    }
    if (!Objects.equals(this.resources, dbcSummary.resources)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, id, name, resourceTemplateId, status, statusChangedAt, creator, creationDate, resourcePool, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbcSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceTemplateId: ").append(toIndentedString(resourceTemplateId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedAt: ").append(toIndentedString(statusChangedAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

