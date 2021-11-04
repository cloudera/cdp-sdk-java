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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Healthinfo object contains the health information of a resource.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-11-03T17:11:10.873-07:00")
public class HealthInfo  {

  /**
   * The resource name being checked.
   **/
  private String resourceName = null;

  /**
   * The boolean that indicates the health status.
   **/
  private Boolean isHealthy = null;

  /**
   * The unix timestamp for the heartbeat.
   **/
  private ZonedDateTime updatedAt = null;

  /**
   * The message to show for the health info.
   **/
  private String message = null;

  /**
   * The detail of the health info.
   **/
  private List<String> details = new ArrayList<String>();

  /**
   * Getter for resourceName.
   * The resource name being checked.
   **/
  @JsonProperty("resourceName")
  public String getResourceName() {
    return resourceName;
  }

  /**
   * Setter for resourceName.
   * The resource name being checked.
   **/
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  /**
   * Getter for isHealthy.
   * The boolean that indicates the health status.
   **/
  @JsonProperty("isHealthy")
  public Boolean getIsHealthy() {
    return isHealthy;
  }

  /**
   * Setter for isHealthy.
   * The boolean that indicates the health status.
   **/
  public void setIsHealthy(Boolean isHealthy) {
    this.isHealthy = isHealthy;
  }

  /**
   * Getter for updatedAt.
   * The unix timestamp for the heartbeat.
   **/
  @JsonProperty("updatedAt")
  public ZonedDateTime getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Setter for updatedAt.
   * The unix timestamp for the heartbeat.
   **/
  public void setUpdatedAt(ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Getter for message.
   * The message to show for the health info.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * The message to show for the health info.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for details.
   * The detail of the health info.
   **/
  @JsonProperty("details")
  public List<String> getDetails() {
    return details;
  }

  /**
   * Setter for details.
   * The detail of the health info.
   **/
  public void setDetails(List<String> details) {
    this.details = details;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthInfo healthInfo = (HealthInfo) o;
    if (!Objects.equals(this.resourceName, healthInfo.resourceName)) {
      return false;
    }
    if (!Objects.equals(this.isHealthy, healthInfo.isHealthy)) {
      return false;
    }
    if (!Objects.equals(this.updatedAt, healthInfo.updatedAt)) {
      return false;
    }
    if (!Objects.equals(this.message, healthInfo.message)) {
      return false;
    }
    if (!Objects.equals(this.details, healthInfo.details)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, isHealthy, updatedAt, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthInfo {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    isHealthy: ").append(toIndentedString(isHealthy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

