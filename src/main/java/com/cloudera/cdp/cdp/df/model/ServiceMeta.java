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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Metadata about a service
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-29T15:24:04.215-07:00")
public class ServiceMeta  {

  /**
   * The crn of the service
   **/
  private String crn = null;

  /**
   * the name of the environment
   **/
  private String name = null;

  /**
   * the cloud provider
   **/
  private String cloudProvider = null;

  /**
   * the region within the cloud provider
   **/
  private String region = null;

  /**
   * The CDP Environment CRN
   **/
  private String environmentCrn = null;

  /**
   * Getter for crn.
   * The crn of the service
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The crn of the service
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * the name of the environment
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * the name of the environment
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for cloudProvider.
   * the cloud provider
   **/
  @JsonProperty("cloudProvider")
  public String getCloudProvider() {
    return cloudProvider;
  }

  /**
   * Setter for cloudProvider.
   * the cloud provider
   **/
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  /**
   * Getter for region.
   * the region within the cloud provider
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * the region within the cloud provider
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for environmentCrn.
   * The CDP Environment CRN
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CDP Environment CRN
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMeta serviceMeta = (ServiceMeta) o;
    if (!Objects.equals(this.crn, serviceMeta.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, serviceMeta.name)) {
      return false;
    }
    if (!Objects.equals(this.cloudProvider, serviceMeta.cloudProvider)) {
      return false;
    }
    if (!Objects.equals(this.region, serviceMeta.region)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, serviceMeta.environmentCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, cloudProvider, region, environmentCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMeta {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
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

