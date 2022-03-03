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
import com.cloudera.cdp.dw.model.AutoscalingOptions;
import com.cloudera.cdp.dw.model.ServiceConfigReq;
import com.cloudera.cdp.dw.model.TagRequest;
import java.util.*;

/**
 * Request object for the createVw method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:45.753-08:00")
public class CreateVwRequest  {

  /**
   * ID of cluster where Virtual Warehouse should be created.
   **/
  private String clusterId = null;

  /**
   * ID of Database Catalog that the Virtual Warehouse should be attached to.
   **/
  private String dbcId = null;

  /**
   * Type of Virtual Warehouse to be created.
   **/
  private String vwType = null;

  /**
   * Name of the Virtual Warehouse.
   **/
  private String name = null;

  /**
   * version of the Virtual Warehouse.
   **/
  private String imageVersion = "";

  /**
   * Name of configuration template to use.
   **/
  private String template = null;

  /**
   * Autoscaling settings for the Virtual Warehouse.
   **/
  private AutoscalingOptions autoscaling = null;

  /**
   * Configuration settings for the Virtual Warehouse.
   **/
  private ServiceConfigReq config = null;

  /**
   * Tags associated with the resources.
   **/
  private List<TagRequest> tags = new ArrayList<TagRequest>();

  /**
   * Getter for clusterId.
   * ID of cluster where Virtual Warehouse should be created.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of cluster where Virtual Warehouse should be created.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for dbcId.
   * ID of Database Catalog that the Virtual Warehouse should be attached to.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * ID of Database Catalog that the Virtual Warehouse should be attached to.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for vwType.
   * Type of Virtual Warehouse to be created.
   **/
  @JsonProperty("vwType")
  public String getVwType() {
    return vwType;
  }

  /**
   * Setter for vwType.
   * Type of Virtual Warehouse to be created.
   **/
  public void setVwType(String vwType) {
    this.vwType = vwType;
  }

  /**
   * Getter for name.
   * Name of the Virtual Warehouse.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the Virtual Warehouse.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for imageVersion.
   * version of the Virtual Warehouse.
   **/
  @JsonProperty("imageVersion")
  public String getImageVersion() {
    return imageVersion;
  }

  /**
   * Setter for imageVersion.
   * version of the Virtual Warehouse.
   **/
  public void setImageVersion(String imageVersion) {
    this.imageVersion = imageVersion;
  }

  /**
   * Getter for template.
   * Name of configuration template to use.
   **/
  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }

  /**
   * Setter for template.
   * Name of configuration template to use.
   **/
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   * Getter for autoscaling.
   * Autoscaling settings for the Virtual Warehouse.
   **/
  @JsonProperty("autoscaling")
  public AutoscalingOptions getAutoscaling() {
    return autoscaling;
  }

  /**
   * Setter for autoscaling.
   * Autoscaling settings for the Virtual Warehouse.
   **/
  public void setAutoscaling(AutoscalingOptions autoscaling) {
    this.autoscaling = autoscaling;
  }

  /**
   * Getter for config.
   * Configuration settings for the Virtual Warehouse.
   **/
  @JsonProperty("config")
  public ServiceConfigReq getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * Configuration settings for the Virtual Warehouse.
   **/
  public void setConfig(ServiceConfigReq config) {
    this.config = config;
  }

  /**
   * Getter for tags.
   * Tags associated with the resources.
   **/
  @JsonProperty("tags")
  public List<TagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags associated with the resources.
   **/
  public void setTags(List<TagRequest> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVwRequest createVwRequest = (CreateVwRequest) o;
    if (!Objects.equals(this.clusterId, createVwRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, createVwRequest.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.vwType, createVwRequest.vwType)) {
      return false;
    }
    if (!Objects.equals(this.name, createVwRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.imageVersion, createVwRequest.imageVersion)) {
      return false;
    }
    if (!Objects.equals(this.template, createVwRequest.template)) {
      return false;
    }
    if (!Objects.equals(this.autoscaling, createVwRequest.autoscaling)) {
      return false;
    }
    if (!Objects.equals(this.config, createVwRequest.config)) {
      return false;
    }
    if (!Objects.equals(this.tags, createVwRequest.tags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dbcId, vwType, name, imageVersion, template, autoscaling, config, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVwRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    vwType: ").append(toIndentedString(vwType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

