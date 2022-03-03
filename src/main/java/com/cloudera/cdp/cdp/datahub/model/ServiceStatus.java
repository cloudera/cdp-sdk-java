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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.HealthCheck;
import java.util.*;

/**
 * Information about a cluster service.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:45.352-08:00")
public class ServiceStatus  {

  /**
   * The service type.
   **/
  private String type = null;

  /**
   * The service state.
   **/
  private String state = null;

  /**
   * The service health summary.
   **/
  private String healthSummary = null;

  /**
   * The service health checks.
   **/
  private List<HealthCheck> healthChecks = new ArrayList<HealthCheck>();

  /**
   * Getter for type.
   * The service type.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The service type.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for state.
   * The service state.
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The service state.
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for healthSummary.
   * The service health summary.
   **/
  @JsonProperty("healthSummary")
  public String getHealthSummary() {
    return healthSummary;
  }

  /**
   * Setter for healthSummary.
   * The service health summary.
   **/
  public void setHealthSummary(String healthSummary) {
    this.healthSummary = healthSummary;
  }

  /**
   * Getter for healthChecks.
   * The service health checks.
   **/
  @JsonProperty("healthChecks")
  public List<HealthCheck> getHealthChecks() {
    return healthChecks;
  }

  /**
   * Setter for healthChecks.
   * The service health checks.
   **/
  public void setHealthChecks(List<HealthCheck> healthChecks) {
    this.healthChecks = healthChecks;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStatus serviceStatus = (ServiceStatus) o;
    if (!Objects.equals(this.type, serviceStatus.type)) {
      return false;
    }
    if (!Objects.equals(this.state, serviceStatus.state)) {
      return false;
    }
    if (!Objects.equals(this.healthSummary, serviceStatus.healthSummary)) {
      return false;
    }
    if (!Objects.equals(this.healthChecks, serviceStatus.healthChecks)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, state, healthSummary, healthChecks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatus {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    healthSummary: ").append(toIndentedString(healthSummary)).append("\n");
    sb.append("    healthChecks: ").append(toIndentedString(healthChecks)).append("\n");
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

