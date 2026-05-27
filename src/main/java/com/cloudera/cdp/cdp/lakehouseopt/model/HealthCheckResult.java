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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;
import java.util.Map;

/**
 * Health check result.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:05.230-07:00")
public class HealthCheckResult  {

  /**
   * Service health status. The supported values are true or false. \"true\" represents the service is healthy and \"false\" represents the service is in an unhealthy state.
   **/
  private Boolean isHealthy = null;

  /**
   * Service health check message.
   **/
  private String message = null;

  /**
   * Exception during health checks.
   **/
  private String error = null;

  /**
   * Map with additional service specific details.
   **/
  private Map<String, String> details = new HashMap<String, String>();

  /**
   * Time when the health check was performed. It will be in milliseconds.
   **/
  private Long time = null;

  /**
   * Health check duration in millis.
   **/
  private Long duration = null;

  /**
   * Getter for isHealthy.
   * Service health status. The supported values are true or false. \&quot;true\&quot; represents the service is healthy and \&quot;false\&quot; represents the service is in an unhealthy state.
   **/
  @JsonProperty("isHealthy")
  public Boolean getIsHealthy() {
    return isHealthy;
  }

  /**
   * Setter for isHealthy.
   * Service health status. The supported values are true or false. \&quot;true\&quot; represents the service is healthy and \&quot;false\&quot; represents the service is in an unhealthy state.
   **/
  public void setIsHealthy(Boolean isHealthy) {
    this.isHealthy = isHealthy;
  }

  /**
   * Getter for message.
   * Service health check message.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Service health check message.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for error.
   * Exception during health checks.
   **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  /**
   * Setter for error.
   * Exception during health checks.
   **/
  public void setError(String error) {
    this.error = error;
  }

  /**
   * Getter for details.
   * Map with additional service specific details.
   **/
  @JsonProperty("details")
  public Map<String, String> getDetails() {
    return details;
  }

  /**
   * Setter for details.
   * Map with additional service specific details.
   **/
  public void setDetails(Map<String, String> details) {
    this.details = details;
  }

  /**
   * Getter for time.
   * Time when the health check was performed. It will be in milliseconds.
   **/
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }

  /**
   * Setter for time.
   * Time when the health check was performed. It will be in milliseconds.
   **/
  public void setTime(Long time) {
    this.time = time;
  }

  /**
   * Getter for duration.
   * Health check duration in millis.
   **/
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }

  /**
   * Setter for duration.
   * Health check duration in millis.
   **/
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResult healthCheckResult = (HealthCheckResult) o;
    if (!Objects.equals(this.isHealthy, healthCheckResult.isHealthy)) {
      return false;
    }
    if (!Objects.equals(this.message, healthCheckResult.message)) {
      return false;
    }
    if (!Objects.equals(this.error, healthCheckResult.error)) {
      return false;
    }
    if (!Objects.equals(this.details, healthCheckResult.details)) {
      return false;
    }
    if (!Objects.equals(this.time, healthCheckResult.time)) {
      return false;
    }
    if (!Objects.equals(this.duration, healthCheckResult.duration)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHealthy, message, error, details, time, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    sb.append("    isHealthy: ").append(toIndentedString(isHealthy)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

