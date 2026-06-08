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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * The environment details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class Environment  {

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The flag indicating if CLO is enabled. If enabled it is true else false.
   **/
  private Boolean isCloEnabled = null;

  /**
   * The name of the CLO Data Hub. If CLO is not enabled it will be null.
   **/
  private String datahubName = null;

  /**
   * The CRN of the CLO Data Hub. If CLO is not enabled it will be null.
   **/
  private String datahubCrn = null;

  /**
   * The cloud platform of the environment, possible values are AZURE or AWS.
   **/
  private String cloudPlatform = null;

  /**
   * The CLO Data Hub status. If CLO is not enabled it will be null.
   **/
  private String status = null;

  /**
   * Getter for environmentName.
   * The name of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for isCloEnabled.
   * The flag indicating if CLO is enabled. If enabled it is true else false.
   **/
  @JsonProperty("isCloEnabled")
  public Boolean getIsCloEnabled() {
    return isCloEnabled;
  }

  /**
   * Setter for isCloEnabled.
   * The flag indicating if CLO is enabled. If enabled it is true else false.
   **/
  public void setIsCloEnabled(Boolean isCloEnabled) {
    this.isCloEnabled = isCloEnabled;
  }

  /**
   * Getter for datahubName.
   * The name of the CLO Data Hub. If CLO is not enabled it will be null.
   **/
  @JsonProperty("datahubName")
  public String getDatahubName() {
    return datahubName;
  }

  /**
   * Setter for datahubName.
   * The name of the CLO Data Hub. If CLO is not enabled it will be null.
   **/
  public void setDatahubName(String datahubName) {
    this.datahubName = datahubName;
  }

  /**
   * Getter for datahubCrn.
   * The CRN of the CLO Data Hub. If CLO is not enabled it will be null.
   **/
  @JsonProperty("datahubCrn")
  public String getDatahubCrn() {
    return datahubCrn;
  }

  /**
   * Setter for datahubCrn.
   * The CRN of the CLO Data Hub. If CLO is not enabled it will be null.
   **/
  public void setDatahubCrn(String datahubCrn) {
    this.datahubCrn = datahubCrn;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform of the environment, possible values are AZURE or AWS.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform of the environment, possible values are AZURE or AWS.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for status.
   * The CLO Data Hub status. If CLO is not enabled it will be null.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The CLO Data Hub status. If CLO is not enabled it will be null.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    if (!Objects.equals(this.environmentName, environment.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, environment.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.isCloEnabled, environment.isCloEnabled)) {
      return false;
    }
    if (!Objects.equals(this.datahubName, environment.datahubName)) {
      return false;
    }
    if (!Objects.equals(this.datahubCrn, environment.datahubCrn)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, environment.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.status, environment.status)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, environmentCrn, isCloEnabled, datahubName, datahubCrn, cloudPlatform, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    isCloEnabled: ").append(toIndentedString(isCloEnabled)).append("\n");
    sb.append("    datahubName: ").append(toIndentedString(datahubName)).append("\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

