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

/**
 * Information about cluster host status.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-07T21:20:13.597-07:00")
public class HostStatus  {

  /**
   * Unique identifier of the cluster host given by Cloudera Manager.
   **/
  private String hostid = null;

  /**
   * The cluster hostname.
   **/
  private String hostname = null;

  /**
   * The host health summary.
   **/
  private String healthSummary = null;

  /**
   * Getter for hostid.
   * Unique identifier of the cluster host given by Cloudera Manager.
   **/
  @JsonProperty("hostid")
  public String getHostid() {
    return hostid;
  }

  /**
   * Setter for hostid.
   * Unique identifier of the cluster host given by Cloudera Manager.
   **/
  public void setHostid(String hostid) {
    this.hostid = hostid;
  }

  /**
   * Getter for hostname.
   * The cluster hostname.
   **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  /**
   * Setter for hostname.
   * The cluster hostname.
   **/
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * Getter for healthSummary.
   * The host health summary.
   **/
  @JsonProperty("healthSummary")
  public String getHealthSummary() {
    return healthSummary;
  }

  /**
   * Setter for healthSummary.
   * The host health summary.
   **/
  public void setHealthSummary(String healthSummary) {
    this.healthSummary = healthSummary;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostStatus hostStatus = (HostStatus) o;
    if (!Objects.equals(this.hostid, hostStatus.hostid)) {
      return false;
    }
    if (!Objects.equals(this.hostname, hostStatus.hostname)) {
      return false;
    }
    if (!Objects.equals(this.healthSummary, hostStatus.healthSummary)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostid, hostname, healthSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostStatus {\n");
    sb.append("    hostid: ").append(toIndentedString(hostid)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    healthSummary: ").append(toIndentedString(healthSummary)).append("\n");
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

