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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.InstanceTemplate;

/**
 * The request object for Data Lake vertical scaling.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-12T15:29:02.578-08:00")
public class StartDatalakeVerticalScalingRequest  {

  /**
   * The name or CRN of the Data Lake.
   **/
  private String datalake = null;

  /**
   * The target group that requested vertical scaling.
   **/
  private String group = null;

  /**
   * Instance template that specifies the core information for the vertical scale.
   **/
  private InstanceTemplate instanceTemplate = null;

  /**
   * Getter for datalake.
   * The name or CRN of the Data Lake.
   **/
  @JsonProperty("datalake")
  public String getDatalake() {
    return datalake;
  }

  /**
   * Setter for datalake.
   * The name or CRN of the Data Lake.
   **/
  public void setDatalake(String datalake) {
    this.datalake = datalake;
  }

  /**
   * Getter for group.
   * The target group that requested vertical scaling.
   **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  /**
   * Setter for group.
   * The target group that requested vertical scaling.
   **/
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * Getter for instanceTemplate.
   * Instance template that specifies the core information for the vertical scale.
   **/
  @JsonProperty("instanceTemplate")
  public InstanceTemplate getInstanceTemplate() {
    return instanceTemplate;
  }

  /**
   * Setter for instanceTemplate.
   * Instance template that specifies the core information for the vertical scale.
   **/
  public void setInstanceTemplate(InstanceTemplate instanceTemplate) {
    this.instanceTemplate = instanceTemplate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartDatalakeVerticalScalingRequest startDatalakeVerticalScalingRequest = (StartDatalakeVerticalScalingRequest) o;
    if (!Objects.equals(this.datalake, startDatalakeVerticalScalingRequest.datalake)) {
      return false;
    }
    if (!Objects.equals(this.group, startDatalakeVerticalScalingRequest.group)) {
      return false;
    }
    if (!Objects.equals(this.instanceTemplate, startDatalakeVerticalScalingRequest.instanceTemplate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalake, group, instanceTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartDatalakeVerticalScalingRequest {\n");
    sb.append("    datalake: ").append(toIndentedString(datalake)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    instanceTemplate: ").append(toIndentedString(instanceTemplate)).append("\n");
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

