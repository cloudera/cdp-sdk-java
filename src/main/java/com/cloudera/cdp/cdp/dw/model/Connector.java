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
 * Represents the details of a connector used to integrate external systems or data sources with Cloudera Data Warehouse. A connector defines the configuration, and connection properties required to establish and manage connectivity.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:28:59.612-07:00")
public class Connector  {

  /**
   * The CRN of the connector.
   **/
  private String crn = null;

  /**
   * Unique per-cluster connector ID.
   **/
  private String id = null;

  /**
   * Display name.
   **/
  private String name = null;

  /**
   * The template of the connector.
   **/
  private String template = null;

  /**
   * The connector configuration in key-value format. For example, { \"connector.name\": \"hive\", \"fs.cache.directories\": \"/data/trino/fs_cache_hive\", \"fs.cache.enabled\": \"true\", \"fs.cache.max-disk-usage-percentages\": \"30\", \"fs.cache.preferred-hosts-count\": \"2\", \"fs.cache.ttl\": \"7d\", \"hive.allow-drop-table\": \"true\", \"hive.collect-column-statistics-on-write\": \"false\", \"hive.metastore.uri\": \"thrift://metastore-service.{{ .Values.warehouseId }}.svc.cluster.local:9083\", \"hive.non-managed-table-writes-enabled\": \"true\", \"hive.security\": \"{{ .Values.authorizationMode }}\", \"ranger.audit_config\": \"ranger-hive-audit.xml\", \"ranger.hadoop_config\": \"core-site.xml\", \"ranger.policy_mgr_ssl_config\": \"ranger-policymgr-ssl.xml\", \"ranger.security_config\": \"ranger-hive-security.xml\", \"ranger.service_name\": \"{{ .Values.rangerHiveSvcName }}\" }.
   **/
  private Map<String, String> config = new HashMap<String, String>();

  /**
   * User-provided description.
   **/
  private String description = null;

  /**
   * The CRN of the user who created the connector.
   **/
  private String createdBy = null;

  /**
   * The timestamp when the connector was created.
   **/
  private Long createdAt = null;

  /**
   * The timestamp when the connector was last updated.
   **/
  private Long updatedAt = null;

  /**
   * The CRN of the user who last updated the connector.
   **/
  private String updatedBy = null;

  /**
   * Getter for crn.
   * The CRN of the connector.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the connector.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for id.
   * Unique per-cluster connector ID.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Unique per-cluster connector ID.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * Display name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Display name.
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
   * The connector configuration in key-value format. For example, { \&quot;connector.name\&quot;: \&quot;hive\&quot;, \&quot;fs.cache.directories\&quot;: \&quot;/data/trino/fs_cache_hive\&quot;, \&quot;fs.cache.enabled\&quot;: \&quot;true\&quot;, \&quot;fs.cache.max-disk-usage-percentages\&quot;: \&quot;30\&quot;, \&quot;fs.cache.preferred-hosts-count\&quot;: \&quot;2\&quot;, \&quot;fs.cache.ttl\&quot;: \&quot;7d\&quot;, \&quot;hive.allow-drop-table\&quot;: \&quot;true\&quot;, \&quot;hive.collect-column-statistics-on-write\&quot;: \&quot;false\&quot;, \&quot;hive.metastore.uri\&quot;: \&quot;thrift://metastore-service.{{ .Values.warehouseId }}.svc.cluster.local:9083\&quot;, \&quot;hive.non-managed-table-writes-enabled\&quot;: \&quot;true\&quot;, \&quot;hive.security\&quot;: \&quot;{{ .Values.authorizationMode }}\&quot;, \&quot;ranger.audit_config\&quot;: \&quot;ranger-hive-audit.xml\&quot;, \&quot;ranger.hadoop_config\&quot;: \&quot;core-site.xml\&quot;, \&quot;ranger.policy_mgr_ssl_config\&quot;: \&quot;ranger-policymgr-ssl.xml\&quot;, \&quot;ranger.security_config\&quot;: \&quot;ranger-hive-security.xml\&quot;, \&quot;ranger.service_name\&quot;: \&quot;{{ .Values.rangerHiveSvcName }}\&quot; }.
   **/
  @JsonProperty("config")
  public Map<String, String> getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * The connector configuration in key-value format. For example, { \&quot;connector.name\&quot;: \&quot;hive\&quot;, \&quot;fs.cache.directories\&quot;: \&quot;/data/trino/fs_cache_hive\&quot;, \&quot;fs.cache.enabled\&quot;: \&quot;true\&quot;, \&quot;fs.cache.max-disk-usage-percentages\&quot;: \&quot;30\&quot;, \&quot;fs.cache.preferred-hosts-count\&quot;: \&quot;2\&quot;, \&quot;fs.cache.ttl\&quot;: \&quot;7d\&quot;, \&quot;hive.allow-drop-table\&quot;: \&quot;true\&quot;, \&quot;hive.collect-column-statistics-on-write\&quot;: \&quot;false\&quot;, \&quot;hive.metastore.uri\&quot;: \&quot;thrift://metastore-service.{{ .Values.warehouseId }}.svc.cluster.local:9083\&quot;, \&quot;hive.non-managed-table-writes-enabled\&quot;: \&quot;true\&quot;, \&quot;hive.security\&quot;: \&quot;{{ .Values.authorizationMode }}\&quot;, \&quot;ranger.audit_config\&quot;: \&quot;ranger-hive-audit.xml\&quot;, \&quot;ranger.hadoop_config\&quot;: \&quot;core-site.xml\&quot;, \&quot;ranger.policy_mgr_ssl_config\&quot;: \&quot;ranger-policymgr-ssl.xml\&quot;, \&quot;ranger.security_config\&quot;: \&quot;ranger-hive-security.xml\&quot;, \&quot;ranger.service_name\&quot;: \&quot;{{ .Values.rangerHiveSvcName }}\&quot; }.
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

  /**
   * Getter for createdBy.
   * The CRN of the user who created the connector.
   **/
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Setter for createdBy.
   * The CRN of the user who created the connector.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Getter for createdAt.
   * The timestamp when the connector was created.
   **/
  @JsonProperty("createdAt")
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Setter for createdAt.
   * The timestamp when the connector was created.
   **/
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Getter for updatedAt.
   * The timestamp when the connector was last updated.
   **/
  @JsonProperty("updatedAt")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Setter for updatedAt.
   * The timestamp when the connector was last updated.
   **/
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Getter for updatedBy.
   * The CRN of the user who last updated the connector.
   **/
  @JsonProperty("updatedBy")
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Setter for updatedBy.
   * The CRN of the user who last updated the connector.
   **/
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connector connector = (Connector) o;
    if (!Objects.equals(this.crn, connector.crn)) {
      return false;
    }
    if (!Objects.equals(this.id, connector.id)) {
      return false;
    }
    if (!Objects.equals(this.name, connector.name)) {
      return false;
    }
    if (!Objects.equals(this.template, connector.template)) {
      return false;
    }
    if (!Objects.equals(this.config, connector.config)) {
      return false;
    }
    if (!Objects.equals(this.description, connector.description)) {
      return false;
    }
    if (!Objects.equals(this.createdBy, connector.createdBy)) {
      return false;
    }
    if (!Objects.equals(this.createdAt, connector.createdAt)) {
      return false;
    }
    if (!Objects.equals(this.updatedAt, connector.updatedAt)) {
      return false;
    }
    if (!Objects.equals(this.updatedBy, connector.updatedBy)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, id, name, template, config, description, createdBy, createdAt, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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

