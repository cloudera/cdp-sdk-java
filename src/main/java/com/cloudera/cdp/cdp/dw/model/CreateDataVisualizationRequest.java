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
import com.cloudera.cdp.dw.model.VizConfig;

/**
 * Request object for the createDataVisualization call.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:20.552-08:00")
public class CreateDataVisualizationRequest  {

  /**
   * ID of cluster where Cloudera Data Visualization should be created.
   **/
  private String clusterId = null;

  /**
   * Name of the Cloudera Data Visualization
   **/
  private String name = null;

  /**
   * The LDAP admin and user group configuration for Cloudera Data Visualization.
   **/
  private VizConfig config = null;

  /**
   * Version of the Cloudera Data Visualization.
   **/
  private String imageVersion = null;

  /**
   * The name of the available resource template to use for the Cloudera Data Visualization.
   **/
  private String resourceTemplate = null;

  /**
   * Getter for clusterId.
   * ID of cluster where Cloudera Data Visualization should be created.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of cluster where Cloudera Data Visualization should be created.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for name.
   * Name of the Cloudera Data Visualization
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the Cloudera Data Visualization
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for config.
   * The LDAP admin and user group configuration for Cloudera Data Visualization.
   **/
  @JsonProperty("config")
  public VizConfig getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * The LDAP admin and user group configuration for Cloudera Data Visualization.
   **/
  public void setConfig(VizConfig config) {
    this.config = config;
  }

  /**
   * Getter for imageVersion.
   * Version of the Cloudera Data Visualization.
   **/
  @JsonProperty("imageVersion")
  public String getImageVersion() {
    return imageVersion;
  }

  /**
   * Setter for imageVersion.
   * Version of the Cloudera Data Visualization.
   **/
  public void setImageVersion(String imageVersion) {
    this.imageVersion = imageVersion;
  }

  /**
   * Getter for resourceTemplate.
   * The name of the available resource template to use for the Cloudera Data Visualization.
   **/
  @JsonProperty("resourceTemplate")
  public String getResourceTemplate() {
    return resourceTemplate;
  }

  /**
   * Setter for resourceTemplate.
   * The name of the available resource template to use for the Cloudera Data Visualization.
   **/
  public void setResourceTemplate(String resourceTemplate) {
    this.resourceTemplate = resourceTemplate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataVisualizationRequest createDataVisualizationRequest = (CreateDataVisualizationRequest) o;
    if (!Objects.equals(this.clusterId, createDataVisualizationRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.name, createDataVisualizationRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.config, createDataVisualizationRequest.config)) {
      return false;
    }
    if (!Objects.equals(this.imageVersion, createDataVisualizationRequest.imageVersion)) {
      return false;
    }
    if (!Objects.equals(this.resourceTemplate, createDataVisualizationRequest.resourceTemplate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, name, config, imageVersion, resourceTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataVisualizationRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
    sb.append("    resourceTemplate: ").append(toIndentedString(resourceTemplate)).append("\n");
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

