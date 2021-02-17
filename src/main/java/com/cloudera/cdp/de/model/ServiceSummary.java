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
 * Summary of a CDE service.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-02-17T11:49:10.596-08:00")
public class ServiceSummary  {

  /**
   * Name of the CDE Service.
   **/
  private String name = null;

  /**
   * Cluster Id of the CDE Service.
   **/
  private String clusterId = null;

  /**
   * CDP Environment Name.
   **/
  private String environmentName = null;

  /**
   * Status of the CDE service.
   **/
  private String status = null;

  /**
   * Email Address of the CDE creator.
   **/
  private String creatorEmail = null;

  /**
   * Timestamp of service enabling.
   **/
  private String enablingTime = null;

  /**
   * Getter for name.
   * Name of the CDE Service.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the CDE Service.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for clusterId.
   * Cluster Id of the CDE Service.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster Id of the CDE Service.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for environmentName.
   * CDP Environment Name.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * CDP Environment Name.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for status.
   * Status of the CDE service.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the CDE service.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creatorEmail.
   * Email Address of the CDE creator.
   **/
  @JsonProperty("creatorEmail")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  /**
   * Setter for creatorEmail.
   * Email Address of the CDE creator.
   **/
  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  /**
   * Getter for enablingTime.
   * Timestamp of service enabling.
   **/
  @JsonProperty("enablingTime")
  public String getEnablingTime() {
    return enablingTime;
  }

  /**
   * Setter for enablingTime.
   * Timestamp of service enabling.
   **/
  public void setEnablingTime(String enablingTime) {
    this.enablingTime = enablingTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSummary serviceSummary = (ServiceSummary) o;
    if (!Objects.equals(this.name, serviceSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, serviceSummary.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, serviceSummary.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.status, serviceSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.creatorEmail, serviceSummary.creatorEmail)) {
      return false;
    }
    if (!Objects.equals(this.enablingTime, serviceSummary.enablingTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusterId, environmentName, status, creatorEmail, enablingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    enablingTime: ").append(toIndentedString(enablingTime)).append("\n");
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

