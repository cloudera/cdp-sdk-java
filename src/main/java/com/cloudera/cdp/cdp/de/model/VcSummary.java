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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * CDE virtual cluster summary.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-03-09T11:03:08.899-08:00")
public class VcSummary  {

  /**
   * Virtual Cluster ID.
   **/
  private String vcId = null;

  /**
   * Name of the CDE Virtual Cluster.
   **/
  private String vcName = null;

  /**
   * Cluster ID of the CDE service that contains the virtual cluster.
   **/
  private String clusterId = null;

  /**
   * Status of the Virtual Cluster.
   **/
  private String status = null;

  /**
   * Url for the Virtual Cluster UI.
   **/
  private String vcUiUrl = null;

  /**
   * Email Address of the Creator.
   **/
  private String creatorEmail = null;

  /**
   * Name of the Creator.
   **/
  private String creatorName = null;

  /**
   * Getter for vcId.
   * Virtual Cluster ID.
   **/
  @JsonProperty("vcId")
  public String getVcId() {
    return vcId;
  }

  /**
   * Setter for vcId.
   * Virtual Cluster ID.
   **/
  public void setVcId(String vcId) {
    this.vcId = vcId;
  }

  /**
   * Getter for vcName.
   * Name of the CDE Virtual Cluster.
   **/
  @JsonProperty("vcName")
  public String getVcName() {
    return vcName;
  }

  /**
   * Setter for vcName.
   * Name of the CDE Virtual Cluster.
   **/
  public void setVcName(String vcName) {
    this.vcName = vcName;
  }

  /**
   * Getter for clusterId.
   * Cluster ID of the CDE service that contains the virtual cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster ID of the CDE service that contains the virtual cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for status.
   * Status of the Virtual Cluster.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the Virtual Cluster.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for vcUiUrl.
   * Url for the Virtual Cluster UI.
   **/
  @JsonProperty("VcUiUrl")
  public String getVcUiUrl() {
    return vcUiUrl;
  }

  /**
   * Setter for vcUiUrl.
   * Url for the Virtual Cluster UI.
   **/
  public void setVcUiUrl(String vcUiUrl) {
    this.vcUiUrl = vcUiUrl;
  }

  /**
   * Getter for creatorEmail.
   * Email Address of the Creator.
   **/
  @JsonProperty("creatorEmail")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  /**
   * Setter for creatorEmail.
   * Email Address of the Creator.
   **/
  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  /**
   * Getter for creatorName.
   * Name of the Creator.
   **/
  @JsonProperty("creatorName")
  public String getCreatorName() {
    return creatorName;
  }

  /**
   * Setter for creatorName.
   * Name of the Creator.
   **/
  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcSummary vcSummary = (VcSummary) o;
    if (!Objects.equals(this.vcId, vcSummary.vcId)) {
      return false;
    }
    if (!Objects.equals(this.vcName, vcSummary.vcName)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, vcSummary.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.status, vcSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.vcUiUrl, vcSummary.vcUiUrl)) {
      return false;
    }
    if (!Objects.equals(this.creatorEmail, vcSummary.creatorEmail)) {
      return false;
    }
    if (!Objects.equals(this.creatorName, vcSummary.creatorName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcId, vcName, clusterId, status, vcUiUrl, creatorEmail, creatorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcSummary {\n");
    sb.append("    vcId: ").append(toIndentedString(vcId)).append("\n");
    sb.append("    vcName: ").append(toIndentedString(vcName)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vcUiUrl: ").append(toIndentedString(vcUiUrl)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
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

