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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dfworkload.model.EnvCloudRegion;

/**
 * The meta information about a DataFlow service.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-07-12T15:10:00.591-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ServiceMeta  {

  /**
   * The CRN of the DataFlow service
   **/
  private String crn = null;

  /**
   * The name of the DataFlow service
   **/
  private String name = null;

  /**
   * The cloudPlatform flag of the DataFlow service
   **/
  private String cloudPlatform = null;

  /**
   * The region of the DataFlow service
   **/
  private EnvCloudRegion region = null;

  /**
   * Crn of associated CDP environment
   **/
  private String environmentCrn = null;

  /**
   * Getter for crn.
   * The CRN of the DataFlow service
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the DataFlow service
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The name of the DataFlow service
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the DataFlow service
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for cloudPlatform.
   * The cloudPlatform flag of the DataFlow service
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloudPlatform flag of the DataFlow service
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for region.
   * The region of the DataFlow service
   **/
  @JsonProperty("region")
  public EnvCloudRegion getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * The region of the DataFlow service
   **/
  public void setRegion(EnvCloudRegion region) {
    this.region = region;
  }

  /**
   * Getter for environmentCrn.
   * Crn of associated CDP environment
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * Crn of associated CDP environment
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
    if (!Objects.equals(this.cloudPlatform, serviceMeta.cloudPlatform)) {
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
    return Objects.hash(crn, name, cloudPlatform, region, environmentCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMeta {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
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

