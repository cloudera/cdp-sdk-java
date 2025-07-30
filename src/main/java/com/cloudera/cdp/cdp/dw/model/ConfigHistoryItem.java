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
import java.time.ZonedDateTime;

/**
 * An entry in the configuration history of a service.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class ConfigHistoryItem  {

  /**
   * DBC or VW ID that this configuration belongs to.
   **/
  private String serviceId = null;

  /**
   * ID of the configuration.
   **/
  private String configId = null;

  /**
   * When was this configuration used from.
   **/
  private ZonedDateTime from = null;

  /**
   * Getter for serviceId.
   * DBC or VW ID that this configuration belongs to.
   **/
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }

  /**
   * Setter for serviceId.
   * DBC or VW ID that this configuration belongs to.
   **/
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Getter for configId.
   * ID of the configuration.
   **/
  @JsonProperty("configId")
  public String getConfigId() {
    return configId;
  }

  /**
   * Setter for configId.
   * ID of the configuration.
   **/
  public void setConfigId(String configId) {
    this.configId = configId;
  }

  /**
   * Getter for from.
   * When was this configuration used from.
   **/
  @JsonProperty("from")
  public ZonedDateTime getFrom() {
    return from;
  }

  /**
   * Setter for from.
   * When was this configuration used from.
   **/
  public void setFrom(ZonedDateTime from) {
    this.from = from;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigHistoryItem configHistoryItem = (ConfigHistoryItem) o;
    if (!Objects.equals(this.serviceId, configHistoryItem.serviceId)) {
      return false;
    }
    if (!Objects.equals(this.configId, configHistoryItem.configId)) {
      return false;
    }
    if (!Objects.equals(this.from, configHistoryItem.from)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, configId, from);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigHistoryItem {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

