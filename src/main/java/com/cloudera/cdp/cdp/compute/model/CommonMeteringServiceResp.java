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
 * Metering service response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:30.235-07:00")
public class CommonMeteringServiceResp  {

  /**
   * Service type.
   **/
  private String serviceType = null;

  /**
   * Service version.
   **/
  private String serviceVersion = null;

  /**
   * Workload CRN.
   **/
  private String workloadCrn = null;

  /**
   * Cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * Service configuration.
   **/
  private String serviceConfiguration = null;

  /**
   * Getter for serviceType.
   * Service type.
   **/
  @JsonProperty("serviceType")
  public String getServiceType() {
    return serviceType;
  }

  /**
   * Setter for serviceType.
   * Service type.
   **/
  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  /**
   * Getter for serviceVersion.
   * Service version.
   **/
  @JsonProperty("serviceVersion")
  public String getServiceVersion() {
    return serviceVersion;
  }

  /**
   * Setter for serviceVersion.
   * Service version.
   **/
  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  /**
   * Getter for workloadCrn.
   * Workload CRN.
   **/
  @JsonProperty("workloadCrn")
  public String getWorkloadCrn() {
    return workloadCrn;
  }

  /**
   * Setter for workloadCrn.
   * Workload CRN.
   **/
  public void setWorkloadCrn(String workloadCrn) {
    this.workloadCrn = workloadCrn;
  }

  /**
   * Getter for clusterCrn.
   * Cluster CRN.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Cluster CRN.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for serviceConfiguration.
   * Service configuration.
   **/
  @JsonProperty("serviceConfiguration")
  public String getServiceConfiguration() {
    return serviceConfiguration;
  }

  /**
   * Setter for serviceConfiguration.
   * Service configuration.
   **/
  public void setServiceConfiguration(String serviceConfiguration) {
    this.serviceConfiguration = serviceConfiguration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonMeteringServiceResp commonMeteringServiceResp = (CommonMeteringServiceResp) o;
    if (!Objects.equals(this.serviceType, commonMeteringServiceResp.serviceType)) {
      return false;
    }
    if (!Objects.equals(this.serviceVersion, commonMeteringServiceResp.serviceVersion)) {
      return false;
    }
    if (!Objects.equals(this.workloadCrn, commonMeteringServiceResp.workloadCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, commonMeteringServiceResp.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.serviceConfiguration, commonMeteringServiceResp.serviceConfiguration)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, serviceVersion, workloadCrn, clusterCrn, serviceConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonMeteringServiceResp {\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    workloadCrn: ").append(toIndentedString(workloadCrn)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    serviceConfiguration: ").append(toIndentedString(serviceConfiguration)).append("\n");
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

