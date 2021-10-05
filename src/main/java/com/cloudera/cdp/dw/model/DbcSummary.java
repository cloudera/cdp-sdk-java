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
import com.cloudera.cdp.dw.model.Actor;
import java.time.ZonedDateTime;

/**
 * A Database Catalog.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-10-05T14:03:44.528-07:00")
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
   * Status of the Database Catalog.
   **/
  private String status = null;

  /**
   * The creator of the Database Catalog.
   **/
  private Actor creator = null;

  /**
   * Creation date of Database Catalog.
   **/
  private ZonedDateTime creationDate = null;

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
   * Getter for status.
   * Status of the Database Catalog.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the Database Catalog.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creator.
   * The creator of the Database Catalog.
   **/
  @JsonProperty("creator")
  public Actor getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The creator of the Database Catalog.
   **/
  public void setCreator(Actor creator) {
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
    if (!Objects.equals(this.status, dbcSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.creator, dbcSummary.creator)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, dbcSummary.creationDate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, id, name, status, creator, creationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbcSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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

