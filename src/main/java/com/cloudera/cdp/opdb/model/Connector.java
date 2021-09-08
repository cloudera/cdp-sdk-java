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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.opdb.model.ConnectorConfiguration;
import com.cloudera.cdp.opdb.model.DependencyManagement;

/**
 * Information to use to connect to a database via some mechanism.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-09-08T16:23:13.211-07:00")
public class Connector  {

  /**
   * The name of the API/Library this connector represents.
   **/
  private String name = null;

  /**
   * The version of the connector.
   **/
  private String version = null;

  /**
   * A categorization of this connector.
   **/
  private String kind = null;

  /**
   * Software dependency information necessary to use the connector.
   **/
  private DependencyManagement dependencies = null;

  /**
   * Runtime details required to use the connector.
   **/
  private ConnectorConfiguration configuration = null;

  /**
   * True if the connector requires Kerberos to authenticate.
   **/
  private Boolean requiresKerberos = null;

  /**
   * Getter for name.
   * The name of the API/Library this connector represents.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the API/Library this connector represents.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for version.
   * The version of the connector.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the connector.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for kind.
   * A categorization of this connector.
   **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  /**
   * Setter for kind.
   * A categorization of this connector.
   **/
  public void setKind(String kind) {
    this.kind = kind;
  }

  /**
   * Getter for dependencies.
   * Software dependency information necessary to use the connector.
   **/
  @JsonProperty("dependencies")
  public DependencyManagement getDependencies() {
    return dependencies;
  }

  /**
   * Setter for dependencies.
   * Software dependency information necessary to use the connector.
   **/
  public void setDependencies(DependencyManagement dependencies) {
    this.dependencies = dependencies;
  }

  /**
   * Getter for configuration.
   * Runtime details required to use the connector.
   **/
  @JsonProperty("configuration")
  public ConnectorConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * Setter for configuration.
   * Runtime details required to use the connector.
   **/
  public void setConfiguration(ConnectorConfiguration configuration) {
    this.configuration = configuration;
  }

  /**
   * Getter for requiresKerberos.
   * True if the connector requires Kerberos to authenticate.
   **/
  @JsonProperty("requiresKerberos")
  public Boolean getRequiresKerberos() {
    return requiresKerberos;
  }

  /**
   * Setter for requiresKerberos.
   * True if the connector requires Kerberos to authenticate.
   **/
  public void setRequiresKerberos(Boolean requiresKerberos) {
    this.requiresKerberos = requiresKerberos;
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
    if (!Objects.equals(this.name, connector.name)) {
      return false;
    }
    if (!Objects.equals(this.version, connector.version)) {
      return false;
    }
    if (!Objects.equals(this.kind, connector.kind)) {
      return false;
    }
    if (!Objects.equals(this.dependencies, connector.dependencies)) {
      return false;
    }
    if (!Objects.equals(this.configuration, connector.configuration)) {
      return false;
    }
    if (!Objects.equals(this.requiresKerberos, connector.requiresKerberos)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, kind, dependencies, configuration, requiresKerberos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    requiresKerberos: ").append(toIndentedString(requiresKerberos)).append("\n");
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

