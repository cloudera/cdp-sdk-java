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

/**
 * Chart structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:12.496-08:00")
public class Chart  {

  /**
   * The version (usually of the images) of the components being deployed.
   **/
  private String applicationVersion = null;

  /**
   * The version of this chart (which is not the version of the components being deployed).
   **/
  private String deploymentVersion = null;

  /**
   * The chart description.
   **/
  private String description = null;

  /**
   * The chart name.
   **/
  private String name = null;

  /**
   * Escaped JSON for values.yaml of that chart.
   **/
  private String values = null;

  /**
   * Getter for applicationVersion.
   * The version (usually of the images) of the components being deployed.
   **/
  @JsonProperty("applicationVersion")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  /**
   * Setter for applicationVersion.
   * The version (usually of the images) of the components being deployed.
   **/
  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  /**
   * Getter for deploymentVersion.
   * The version of this chart (which is not the version of the components being deployed).
   **/
  @JsonProperty("deploymentVersion")
  public String getDeploymentVersion() {
    return deploymentVersion;
  }

  /**
   * Setter for deploymentVersion.
   * The version of this chart (which is not the version of the components being deployed).
   **/
  public void setDeploymentVersion(String deploymentVersion) {
    this.deploymentVersion = deploymentVersion;
  }

  /**
   * Getter for description.
   * The chart description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The chart description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for name.
   * The chart name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The chart name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for values.
   * Escaped JSON for values.yaml of that chart.
   **/
  @JsonProperty("values")
  public String getValues() {
    return values;
  }

  /**
   * Setter for values.
   * Escaped JSON for values.yaml of that chart.
   **/
  public void setValues(String values) {
    this.values = values;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chart chart = (Chart) o;
    if (!Objects.equals(this.applicationVersion, chart.applicationVersion)) {
      return false;
    }
    if (!Objects.equals(this.deploymentVersion, chart.deploymentVersion)) {
      return false;
    }
    if (!Objects.equals(this.description, chart.description)) {
      return false;
    }
    if (!Objects.equals(this.name, chart.name)) {
      return false;
    }
    if (!Objects.equals(this.values, chart.values)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationVersion, deploymentVersion, description, name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chart {\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    deploymentVersion: ").append(toIndentedString(deploymentVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

