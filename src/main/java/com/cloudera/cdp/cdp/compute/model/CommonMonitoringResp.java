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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.CommonAlertmanagerResp;
import com.cloudera.cdp.compute.model.CommonResourceLimitsResp;

/**
 * Monitoring response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:09.511-08:00")
public class CommonMonitoringResp  {

  /**
   * Flag to indicate if Monitoring is enabled.
   **/
  private Boolean enabled = null;

  /**
   * Alertmanager.
   **/
  private CommonAlertmanagerResp alertmanager = null;

  /**
   * Server resource limits.
   **/
  private CommonResourceLimitsResp serverResourceLimits = null;

  /**
   * Getter for enabled.
   * Flag to indicate if Monitoring is enabled.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Flag to indicate if Monitoring is enabled.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for alertmanager.
   * Alertmanager.
   **/
  @JsonProperty("alertmanager")
  public CommonAlertmanagerResp getAlertmanager() {
    return alertmanager;
  }

  /**
   * Setter for alertmanager.
   * Alertmanager.
   **/
  public void setAlertmanager(CommonAlertmanagerResp alertmanager) {
    this.alertmanager = alertmanager;
  }

  /**
   * Getter for serverResourceLimits.
   * Server resource limits.
   **/
  @JsonProperty("serverResourceLimits")
  public CommonResourceLimitsResp getServerResourceLimits() {
    return serverResourceLimits;
  }

  /**
   * Setter for serverResourceLimits.
   * Server resource limits.
   **/
  public void setServerResourceLimits(CommonResourceLimitsResp serverResourceLimits) {
    this.serverResourceLimits = serverResourceLimits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonMonitoringResp commonMonitoringResp = (CommonMonitoringResp) o;
    if (!Objects.equals(this.enabled, commonMonitoringResp.enabled)) {
      return false;
    }
    if (!Objects.equals(this.alertmanager, commonMonitoringResp.alertmanager)) {
      return false;
    }
    if (!Objects.equals(this.serverResourceLimits, commonMonitoringResp.serverResourceLimits)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, alertmanager, serverResourceLimits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonMonitoringResp {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertmanager: ").append(toIndentedString(alertmanager)).append("\n");
    sb.append("    serverResourceLimits: ").append(toIndentedString(serverResourceLimits)).append("\n");
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

