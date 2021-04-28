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
 * A Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-28T12:37:14.058-07:00")
public class VwSummary  {

  /**
   * The CRN of the Virtual Warehouse.
   **/
  private String crn = null;

  /**
   * The ID of the Virtual Warehouse.
   **/
  private String id = null;

  /**
   * The name of the Virtual Warehouse.
   **/
  private String name = null;

  /**
   * The type of the Virtual Warehouse.
   **/
  private String vwType = null;

  /**
   * ID of Database Catalog that the Virtual Warehouse is attached to.
   **/
  private String dbcId = null;

  /**
   * Status of the Virtual Warehouse.
   **/
  private String status = null;

  /**
   * The creator of the Virtual Warehouse.
   **/
  private Actor creator = null;

  /**
   * Creation date of Virtual Warehouse.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Getter for crn.
   * The CRN of the Virtual Warehouse.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the Virtual Warehouse.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for id.
   * The ID of the Virtual Warehouse.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the Virtual Warehouse.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * The name of the Virtual Warehouse.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the Virtual Warehouse.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for vwType.
   * The type of the Virtual Warehouse.
   **/
  @JsonProperty("vwType")
  public String getVwType() {
    return vwType;
  }

  /**
   * Setter for vwType.
   * The type of the Virtual Warehouse.
   **/
  public void setVwType(String vwType) {
    this.vwType = vwType;
  }

  /**
   * Getter for dbcId.
   * ID of Database Catalog that the Virtual Warehouse is attached to.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * ID of Database Catalog that the Virtual Warehouse is attached to.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for status.
   * Status of the Virtual Warehouse.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the Virtual Warehouse.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creator.
   * The creator of the Virtual Warehouse.
   **/
  @JsonProperty("creator")
  public Actor getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The creator of the Virtual Warehouse.
   **/
  public void setCreator(Actor creator) {
    this.creator = creator;
  }

  /**
   * Getter for creationDate.
   * Creation date of Virtual Warehouse.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of Virtual Warehouse.
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
    VwSummary vwSummary = (VwSummary) o;
    if (!Objects.equals(this.crn, vwSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.id, vwSummary.id)) {
      return false;
    }
    if (!Objects.equals(this.name, vwSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.vwType, vwSummary.vwType)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, vwSummary.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.status, vwSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.creator, vwSummary.creator)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, vwSummary.creationDate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, id, name, vwType, dbcId, status, creator, creationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VwSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vwType: ").append(toIndentedString(vwType)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
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

