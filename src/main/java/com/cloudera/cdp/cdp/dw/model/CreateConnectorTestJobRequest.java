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
import java.util.*;
import java.util.Map;

/**
 * Request for the createConnectorTestJob call.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:41.156-07:00")
public class CreateConnectorTestJobRequest  {

  /**
   * The ID of the cluster.
   **/
  private String clusterId = null;

  /**
   * The ID of the connector to test.
   **/
  private String connectorId = null;

  /**
   * The name of the connector to test.
   **/
  private String connectorName = null;

  /**
   * Key-value type configurations.
   **/
  private Map<String, String> config = new HashMap<String, String>();

  /**
   * Getter for clusterId.
   * The ID of the cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for connectorId.
   * The ID of the connector to test.
   **/
  @JsonProperty("connectorId")
  public String getConnectorId() {
    return connectorId;
  }

  /**
   * Setter for connectorId.
   * The ID of the connector to test.
   **/
  public void setConnectorId(String connectorId) {
    this.connectorId = connectorId;
  }

  /**
   * Getter for connectorName.
   * The name of the connector to test.
   **/
  @JsonProperty("connectorName")
  public String getConnectorName() {
    return connectorName;
  }

  /**
   * Setter for connectorName.
   * The name of the connector to test.
   **/
  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
  }

  /**
   * Getter for config.
   * Key-value type configurations.
   **/
  @JsonProperty("config")
  public Map<String, String> getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * Key-value type configurations.
   **/
  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConnectorTestJobRequest createConnectorTestJobRequest = (CreateConnectorTestJobRequest) o;
    if (!Objects.equals(this.clusterId, createConnectorTestJobRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.connectorId, createConnectorTestJobRequest.connectorId)) {
      return false;
    }
    if (!Objects.equals(this.connectorName, createConnectorTestJobRequest.connectorName)) {
      return false;
    }
    if (!Objects.equals(this.config, createConnectorTestJobRequest.config)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, connectorId, connectorName, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConnectorTestJobRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

