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

/**
 * Request object for fetching the available virtual machine types based on the given parameters.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:23.628-08:00")
public class GetVmTypesRequest  {

  /**
   * The name of the given cluster template.
   **/
  private String clusterTemplate = null;

  /**
   * The name or CRN of the credential that is required to access the cloud provider.
   **/
  private String credential = null;

  /**
   * The region where we should look for the supported VM types.
   **/
  private String region = null;

  /**
   * The selected availability zone.
   **/
  private String availabilityZone = null;

  /**
   * The name of the cluster definition.
   **/
  private String clusterDefinitionName = null;

  /**
   * Getter for clusterTemplate.
   * The name of the given cluster template.
   **/
  @JsonProperty("clusterTemplate")
  public String getClusterTemplate() {
    return clusterTemplate;
  }

  /**
   * Setter for clusterTemplate.
   * The name of the given cluster template.
   **/
  public void setClusterTemplate(String clusterTemplate) {
    this.clusterTemplate = clusterTemplate;
  }

  /**
   * Getter for credential.
   * The name or CRN of the credential that is required to access the cloud provider.
   **/
  @JsonProperty("credential")
  public String getCredential() {
    return credential;
  }

  /**
   * Setter for credential.
   * The name or CRN of the credential that is required to access the cloud provider.
   **/
  public void setCredential(String credential) {
    this.credential = credential;
  }

  /**
   * Getter for region.
   * The region where we should look for the supported VM types.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * The region where we should look for the supported VM types.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for availabilityZone.
   * The selected availability zone.
   **/
  @JsonProperty("availabilityZone")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * Setter for availabilityZone.
   * The selected availability zone.
   **/
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * Getter for clusterDefinitionName.
   * The name of the cluster definition.
   **/
  @JsonProperty("clusterDefinitionName")
  public String getClusterDefinitionName() {
    return clusterDefinitionName;
  }

  /**
   * Setter for clusterDefinitionName.
   * The name of the cluster definition.
   **/
  public void setClusterDefinitionName(String clusterDefinitionName) {
    this.clusterDefinitionName = clusterDefinitionName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetVmTypesRequest getVmTypesRequest = (GetVmTypesRequest) o;
    if (!Objects.equals(this.clusterTemplate, getVmTypesRequest.clusterTemplate)) {
      return false;
    }
    if (!Objects.equals(this.credential, getVmTypesRequest.credential)) {
      return false;
    }
    if (!Objects.equals(this.region, getVmTypesRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZone, getVmTypesRequest.availabilityZone)) {
      return false;
    }
    if (!Objects.equals(this.clusterDefinitionName, getVmTypesRequest.clusterDefinitionName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterTemplate, credential, region, availabilityZone, clusterDefinitionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetVmTypesRequest {\n");
    sb.append("    clusterTemplate: ").append(toIndentedString(clusterTemplate)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    clusterDefinitionName: ").append(toIndentedString(clusterDefinitionName)).append("\n");
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

