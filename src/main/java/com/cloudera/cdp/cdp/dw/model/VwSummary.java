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
import com.cloudera.cdp.dw.model.AutoscalingOptionsResponse;
import com.cloudera.cdp.dw.model.QueryIsolationOptionsResponse;
import com.cloudera.cdp.dw.model.TagResponse;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * A Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-16T15:45:11.677-07:00")
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
  private ActorResponse creator = null;

  /**
   * Creation date of Virtual Warehouse.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Tags associated with the resources.
   **/
  private List<TagResponse> tags = new ArrayList<TagResponse>();

  /**
   * Denotes whether the Hive Virtual Warehouse is a compactor or not.
   **/
  private Boolean compactor = null;

  /**
   * Denotes whether the Virtual Warehouse has Data Visualisation or not.
   **/
  private Boolean viz = null;

  /**
   * The current settings stored for atuoscaling.
   **/
  private AutoscalingOptionsResponse autoscalingOptions = null;

  /**
   * The current settings stored for query-isolation.
   **/
  private QueryIsolationOptionsResponse queryIsolationOptions = null;

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
  public ActorResponse getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The creator of the Virtual Warehouse.
   **/
  public void setCreator(ActorResponse creator) {
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

  /**
   * Getter for tags.
   * Tags associated with the resources.
   **/
  @JsonProperty("tags")
  public List<TagResponse> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags associated with the resources.
   **/
  public void setTags(List<TagResponse> tags) {
    this.tags = tags;
  }

  /**
   * Getter for compactor.
   * Denotes whether the Hive Virtual Warehouse is a compactor or not.
   **/
  @JsonProperty("compactor")
  public Boolean getCompactor() {
    return compactor;
  }

  /**
   * Setter for compactor.
   * Denotes whether the Hive Virtual Warehouse is a compactor or not.
   **/
  public void setCompactor(Boolean compactor) {
    this.compactor = compactor;
  }

  /**
   * Getter for viz.
   * Denotes whether the Virtual Warehouse has Data Visualisation or not.
   **/
  @JsonProperty("viz")
  public Boolean getViz() {
    return viz;
  }

  /**
   * Setter for viz.
   * Denotes whether the Virtual Warehouse has Data Visualisation or not.
   **/
  public void setViz(Boolean viz) {
    this.viz = viz;
  }

  /**
   * Getter for autoscalingOptions.
   * The current settings stored for atuoscaling.
   **/
  @JsonProperty("autoscalingOptions")
  public AutoscalingOptionsResponse getAutoscalingOptions() {
    return autoscalingOptions;
  }

  /**
   * Setter for autoscalingOptions.
   * The current settings stored for atuoscaling.
   **/
  public void setAutoscalingOptions(AutoscalingOptionsResponse autoscalingOptions) {
    this.autoscalingOptions = autoscalingOptions;
  }

  /**
   * Getter for queryIsolationOptions.
   * The current settings stored for query-isolation.
   **/
  @JsonProperty("queryIsolationOptions")
  public QueryIsolationOptionsResponse getQueryIsolationOptions() {
    return queryIsolationOptions;
  }

  /**
   * Setter for queryIsolationOptions.
   * The current settings stored for query-isolation.
   **/
  public void setQueryIsolationOptions(QueryIsolationOptionsResponse queryIsolationOptions) {
    this.queryIsolationOptions = queryIsolationOptions;
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
    if (!Objects.equals(this.tags, vwSummary.tags)) {
      return false;
    }
    if (!Objects.equals(this.compactor, vwSummary.compactor)) {
      return false;
    }
    if (!Objects.equals(this.viz, vwSummary.viz)) {
      return false;
    }
    if (!Objects.equals(this.autoscalingOptions, vwSummary.autoscalingOptions)) {
      return false;
    }
    if (!Objects.equals(this.queryIsolationOptions, vwSummary.queryIsolationOptions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, id, name, vwType, dbcId, status, creator, creationDate, tags, compactor, viz, autoscalingOptions, queryIsolationOptions);
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
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    compactor: ").append(toIndentedString(compactor)).append("\n");
    sb.append("    viz: ").append(toIndentedString(viz)).append("\n");
    sb.append("    autoscalingOptions: ").append(toIndentedString(autoscalingOptions)).append("\n");
    sb.append("    queryIsolationOptions: ").append(toIndentedString(queryIsolationOptions)).append("\n");
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

