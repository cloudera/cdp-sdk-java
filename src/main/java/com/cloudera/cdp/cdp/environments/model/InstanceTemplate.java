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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.AttachedVolume;
import com.cloudera.cdp.environments.model.AwsFreeIpaInstanceTemplateParams;
import java.util.*;

/**
 * Instance template that specifies the core information for the instances.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-12T15:07:44.583-07:00")
public class InstanceTemplate  {

  /**
   * The attached volume configuration(s).
   **/
  private List<AttachedVolume> attachedVolumes = new ArrayList<AttachedVolume>();

  /**
   * AWS specific FreeIPA parameters.
   **/
  private AwsFreeIpaInstanceTemplateParams awsProperties = null;

  /**
   * The type of the instance.
   **/
  private String instanceType = null;

  /**
   * Getter for attachedVolumes.
   * The attached volume configuration(s).
   **/
  @JsonProperty("attachedVolumes")
  public List<AttachedVolume> getAttachedVolumes() {
    return attachedVolumes;
  }

  /**
   * Setter for attachedVolumes.
   * The attached volume configuration(s).
   **/
  public void setAttachedVolumes(List<AttachedVolume> attachedVolumes) {
    this.attachedVolumes = attachedVolumes;
  }

  /**
   * Getter for awsProperties.
   * AWS specific FreeIPA parameters.
   **/
  @JsonProperty("awsProperties")
  public AwsFreeIpaInstanceTemplateParams getAwsProperties() {
    return awsProperties;
  }

  /**
   * Setter for awsProperties.
   * AWS specific FreeIPA parameters.
   **/
  public void setAwsProperties(AwsFreeIpaInstanceTemplateParams awsProperties) {
    this.awsProperties = awsProperties;
  }

  /**
   * Getter for instanceType.
   * The type of the instance.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The type of the instance.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTemplate instanceTemplate = (InstanceTemplate) o;
    if (!Objects.equals(this.attachedVolumes, instanceTemplate.attachedVolumes)) {
      return false;
    }
    if (!Objects.equals(this.awsProperties, instanceTemplate.awsProperties)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, instanceTemplate.instanceType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachedVolumes, awsProperties, instanceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTemplate {\n");
    sb.append("    attachedVolumes: ").append(toIndentedString(attachedVolumes)).append("\n");
    sb.append("    awsProperties: ").append(toIndentedString(awsProperties)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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

