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
 * Request object to create a new connector for integrating external systems or data sources with Cloudera Data Warehouse.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:28:59.612-07:00")
public class CreateConnectorRequest  {

  /**
   * The name of the connector.
   **/
  private String name = null;

  /**
   * The template of the connector.
   **/
  private String template = null;

  /**
   * THe ID of the Database Catalog's cluster.
   **/
  private String clusterId = null;

  /**
   * The connector configuration in key-value format. For example, { \"connector.name\": \"iceberg\", \"fs.cache.directories\": \"/data/trino/fs_cache_iceberg\", \"fs.cache.enabled\": \"true\", \"fs.cache.max-disk-usage-percentages\": \"30\", \"fs.cache.preferred-hosts-count\": \"2\", \"fs.cache.ttl\": \"7d\", \"hive.metastore.uri\": \"thrift://metastore-service.{{ .Values.warehouseId }}.svc.cluster.local:9083\", \"iceberg.catalog.type\": \"hive_metastore\", \"iceberg.security\": \"{{ .Values.authorizationMode }}\", \"ranger.audit_config\": \"ranger-hive-audit.xml\", \"ranger.hadoop_config\": \"core-site.xml\", \"ranger.policy_mgr_ssl_config\": \"ranger-policymgr-ssl.xml\", \"ranger.security_config\": \"ranger-hive-security.xml\", \"ranger.service_name\": \"{{ .Values.rangerHiveSvcName }}\" }
   **/
  private Map<String, String> config = new HashMap<String, String>();

  /**
   * User-provided description.
   **/
  private String description = null;

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
   * Getter for clusterId.
   * THe ID of the Database Catalog&#39;s cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * THe ID of the Database Catalog&#39;s cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for config.
   * The connector configuration in key-value format. For example, { \&quot;connector.name\&quot;: \&quot;iceberg\&quot;, \&quot;fs.cache.directories\&quot;: \&quot;/data/trino/fs_cache_iceberg\&quot;, \&quot;fs.cache.enabled\&quot;: \&quot;true\&quot;, \&quot;fs.cache.max-disk-usage-percentages\&quot;: \&quot;30\&quot;, \&quot;fs.cache.preferred-hosts-count\&quot;: \&quot;2\&quot;, \&quot;fs.cache.ttl\&quot;: \&quot;7d\&quot;, \&quot;hive.metastore.uri\&quot;: \&quot;thrift://metastore-service.{{ .Values.warehouseId }}.svc.cluster.local:9083\&quot;, \&quot;iceberg.catalog.type\&quot;: \&quot;hive_metastore\&quot;, \&quot;iceberg.security\&quot;: \&quot;{{ .Values.authorizationMode }}\&quot;, \&quot;ranger.audit_config\&quot;: \&quot;ranger-hive-audit.xml\&quot;, \&quot;ranger.hadoop_config\&quot;: \&quot;core-site.xml\&quot;, \&quot;ranger.policy_mgr_ssl_config\&quot;: \&quot;ranger-policymgr-ssl.xml\&quot;, \&quot;ranger.security_config\&quot;: \&quot;ranger-hive-security.xml\&quot;, \&quot;ranger.service_name\&quot;: \&quot;{{ .Values.rangerHiveSvcName }}\&quot; }
   **/
  @JsonProperty("config")
  public Map<String, String> getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * The connector configuration in key-value format. For example, { \&quot;connector.name\&quot;: \&quot;iceberg\&quot;, \&quot;fs.cache.directories\&quot;: \&quot;/data/trino/fs_cache_iceberg\&quot;, \&quot;fs.cache.enabled\&quot;: \&quot;true\&quot;, \&quot;fs.cache.max-disk-usage-percentages\&quot;: \&quot;30\&quot;, \&quot;fs.cache.preferred-hosts-count\&quot;: \&quot;2\&quot;, \&quot;fs.cache.ttl\&quot;: \&quot;7d\&quot;, \&quot;hive.metastore.uri\&quot;: \&quot;thrift://metastore-service.{{ .Values.warehouseId }}.svc.cluster.local:9083\&quot;, \&quot;iceberg.catalog.type\&quot;: \&quot;hive_metastore\&quot;, \&quot;iceberg.security\&quot;: \&quot;{{ .Values.authorizationMode }}\&quot;, \&quot;ranger.audit_config\&quot;: \&quot;ranger-hive-audit.xml\&quot;, \&quot;ranger.hadoop_config\&quot;: \&quot;core-site.xml\&quot;, \&quot;ranger.policy_mgr_ssl_config\&quot;: \&quot;ranger-policymgr-ssl.xml\&quot;, \&quot;ranger.security_config\&quot;: \&quot;ranger-hive-security.xml\&quot;, \&quot;ranger.service_name\&quot;: \&quot;{{ .Values.rangerHiveSvcName }}\&quot; }
   **/
  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  /**
   * Getter for description.
   * User-provided description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * User-provided description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConnectorRequest createConnectorRequest = (CreateConnectorRequest) o;
    if (!Objects.equals(this.name, createConnectorRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.template, createConnectorRequest.template)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, createConnectorRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.config, createConnectorRequest.config)) {
      return false;
    }
    if (!Objects.equals(this.description, createConnectorRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, template, clusterId, config, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConnectorRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

