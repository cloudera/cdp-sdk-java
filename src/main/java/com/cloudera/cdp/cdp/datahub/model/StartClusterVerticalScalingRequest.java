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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.DiskOptions;
import com.cloudera.cdp.datahub.model.InstanceTemplate;

/**
 * The request object for Data Hub vertical scaling.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:10.708-07:00")
public class StartClusterVerticalScalingRequest  {

  /**
   * The name or CRN of the Data Hub cluster.
   **/
  private String datahub = null;

  /**
   * The target group that reqested for vertical scaling.
   **/
  private String group = null;

  /**
   * Instance template that specifies the core information for the vertical scale.
   **/
  private InstanceTemplate instanceTemplate = null;

  /**
   * Disk options for vertical scaling. Available options are - add, remove, or modify.
   **/
  private DiskOptions diskOptions = null;

  /**
   * Getter for datahub.
   * The name or CRN of the Data Hub cluster.
   **/
  @JsonProperty("datahub")
  public String getDatahub() {
    return datahub;
  }

  /**
   * Setter for datahub.
   * The name or CRN of the Data Hub cluster.
   **/
  public void setDatahub(String datahub) {
    this.datahub = datahub;
  }

  /**
   * Getter for group.
   * The target group that reqested for vertical scaling.
   **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  /**
   * Setter for group.
   * The target group that reqested for vertical scaling.
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

  /**
   * Getter for diskOptions.
   * Disk options for vertical scaling. Available options are - add, remove, or modify.
   **/
  @JsonProperty("diskOptions")
  public DiskOptions getDiskOptions() {
    return diskOptions;
  }

  /**
   * Setter for diskOptions.
   * Disk options for vertical scaling. Available options are - add, remove, or modify.
   **/
  public void setDiskOptions(DiskOptions diskOptions) {
    this.diskOptions = diskOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartClusterVerticalScalingRequest startClusterVerticalScalingRequest = (StartClusterVerticalScalingRequest) o;
    if (!Objects.equals(this.datahub, startClusterVerticalScalingRequest.datahub)) {
      return false;
    }
    if (!Objects.equals(this.group, startClusterVerticalScalingRequest.group)) {
      return false;
    }
    if (!Objects.equals(this.instanceTemplate, startClusterVerticalScalingRequest.instanceTemplate)) {
      return false;
    }
    if (!Objects.equals(this.diskOptions, startClusterVerticalScalingRequest.diskOptions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahub, group, instanceTemplate, diskOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartClusterVerticalScalingRequest {\n");
    sb.append("    datahub: ").append(toIndentedString(datahub)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    instanceTemplate: ").append(toIndentedString(instanceTemplate)).append("\n");
    sb.append("    diskOptions: ").append(toIndentedString(diskOptions)).append("\n");
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

