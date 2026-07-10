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
 * Request object for the updateConnector method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:47.832Z")
public class UpdateConnectorRequest  {

  /**
   * The ID of the cluster to update.
   **/
  private String clusterId = null;

  /**
   * The ID of the connector to update.
   **/
  private String connectorId = null;

  /**
   * Cluster description.
   **/
  private String description = null;

  /**
   * The name of the connector.
   **/
  private String name = null;

  /**
   * The template of the connector.
   **/
  private String template = null;

  /**
   * Key-value type configurations.
   **/
  private Map<String, String> config = new HashMap<String, String>();

  /**
   * Getter for clusterId.
   * The ID of the cluster to update.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the cluster to update.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for connectorId.
   * The ID of the connector to update.
   **/
  @JsonProperty("connectorId")
  public String getConnectorId() {
    return connectorId;
  }

  /**
   * Setter for connectorId.
   * The ID of the connector to update.
   **/
  public void setConnectorId(String connectorId) {
    this.connectorId = connectorId;
  }

  /**
   * Getter for description.
   * Cluster description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Cluster description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for name.
   * The name of the connector.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the connector.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for template.
   * The template of the connector.
   **/
  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }

  /**
   * Setter for template.
   * The template of the connector.
   **/
  public void setTemplate(String template) {
    this.template = template;
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
    UpdateConnectorRequest updateConnectorRequest = (UpdateConnectorRequest) o;
    if (!Objects.equals(this.clusterId, updateConnectorRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.connectorId, updateConnectorRequest.connectorId)) {
      return false;
    }
    if (!Objects.equals(this.description, updateConnectorRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.name, updateConnectorRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.template, updateConnectorRequest.template)) {
      return false;
    }
    if (!Objects.equals(this.config, updateConnectorRequest.config)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, connectorId, description, name, template, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConnectorRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

