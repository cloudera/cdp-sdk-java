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
 * A Cloudera Data Warehouse cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-09-08T16:23:12.107-07:00")
public class ClusterSummary  {

  /**
   * The CRN of the cluster.
   **/
  private String crn = null;

  /**
   * The ID of the cluster.
   **/
  private String id = null;

  /**
   * The CRN of the environment where the cluster is located.
   **/
  private String environmentCrn = null;

  /**
   * Status of the cluster.
   **/
  private String status = null;

  /**
   * The creator of the cluster.
   **/
  private Actor creator = null;

  /**
   * Creation date of cluster.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The cloud platform of the environment that was used to create this cluster.
   **/
  private String cloudPlatform = null;

  /**
   * Getter for crn.
   * The CRN of the cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for id.
   * The ID of the cluster.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the cluster.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment where the cluster is located.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment where the cluster is located.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for status.
   * Status of the cluster.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the cluster.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creator.
   * The creator of the cluster.
   **/
  @JsonProperty("creator")
  public Actor getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The creator of the cluster.
   **/
  public void setCreator(Actor creator) {
    this.creator = creator;
  }

  /**
   * Getter for creationDate.
   * Creation date of cluster.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of cluster.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform of the environment that was used to create this cluster.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform of the environment that was used to create this cluster.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSummary clusterSummary = (ClusterSummary) o;
    if (!Objects.equals(this.crn, clusterSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.id, clusterSummary.id)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, clusterSummary.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.status, clusterSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.creator, clusterSummary.creator)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, clusterSummary.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, clusterSummary.cloudPlatform)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, id, environmentCrn, status, creator, creationDate, cloudPlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
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

