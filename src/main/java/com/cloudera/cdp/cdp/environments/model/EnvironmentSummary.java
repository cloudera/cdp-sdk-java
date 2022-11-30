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
import java.time.ZonedDateTime;

/**
 * The environment summary.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-29T14:06:17.865-08:00")
public class EnvironmentSummary  {

  /**
   * Name of the environment.
   **/
  private String environmentName = null;

  /**
   * CRN of the environment.
   **/
  private String crn = null;

  /**
   * Status of the environment,
   **/
  private String status = null;

  /**
   * Region of the environment.
   **/
  private String region = null;

  /**
   * Cloud platform of the environment.
   **/
  private String cloudPlatform = null;

  /**
   * Name of the credential of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  private String credentialName = null;

  /**
   * Description of the environment.
   **/
  private String description = null;

  /**
   * Creation date
   **/
  private ZonedDateTime created = null;

  /**
   * Name of the proxy config of the environment.
   **/
  private String proxyConfigName = null;

  /**
   * Getter for environmentName.
   * Name of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Name of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for crn.
   * CRN of the environment.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the environment.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for status.
   * Status of the environment,
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the environment,
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for region.
   * Region of the environment.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Region of the environment.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for cloudPlatform.
   * Cloud platform of the environment.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * Cloud platform of the environment.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for credentialName.
   * Name of the credential of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * Name of the credential of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for description.
   * Description of the environment.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the environment.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for created.
   * Creation date
   **/
  @JsonProperty("created")
  public ZonedDateTime getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Creation date
   **/
  public void setCreated(ZonedDateTime created) {
    this.created = created;
  }

  /**
   * Getter for proxyConfigName.
   * Name of the proxy config of the environment.
   **/
  @JsonProperty("proxyConfigName")
  public String getProxyConfigName() {
    return proxyConfigName;
  }

  /**
   * Setter for proxyConfigName.
   * Name of the proxy config of the environment.
   **/
  public void setProxyConfigName(String proxyConfigName) {
    this.proxyConfigName = proxyConfigName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentSummary environmentSummary = (EnvironmentSummary) o;
    if (!Objects.equals(this.environmentName, environmentSummary.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.crn, environmentSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.status, environmentSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.region, environmentSummary.region)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, environmentSummary.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.credentialName, environmentSummary.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.description, environmentSummary.description)) {
      return false;
    }
    if (!Objects.equals(this.created, environmentSummary.created)) {
      return false;
    }
    if (!Objects.equals(this.proxyConfigName, environmentSummary.proxyConfigName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, crn, status, region, cloudPlatform, credentialName, description, created, proxyConfigName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentSummary {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    proxyConfigName: ").append(toIndentedString(proxyConfigName)).append("\n");
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

