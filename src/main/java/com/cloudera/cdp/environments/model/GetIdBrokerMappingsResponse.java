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
import com.cloudera.cdp.environments.model.IdBrokerMapping;
import java.util.*;

/**
 * Response object for getting ID Broker mappings for an environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-12-09T11:15:14.324-08:00")
public class GetIdBrokerMappingsResponse extends CdpResponse {

  /**
   * The version of the mappings.
   **/
  private Long mappingsVersion = null;

  /**
   * The cloud provider role to which data access services will be mapped (e.g. an ARN in AWS, a Resource ID in Azure).
   **/
  private String dataAccessRole = null;

  /**
   * The cloud provider role to which services that write to Ranger audit logs will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). Note that some data access services also write to Ranger audit logs; such services will be mapped to the dataAccessRole, not the rangerAuditRole.
   **/
  private String rangerAuditRole = null;

  /**
   * The cloud provider role to which the Ranger RAZ service will be mapped (e.g. an ARN in AWS, a Resource ID in Azure).
   **/
  private String rangerCloudAccessAuthorizerRole = null;

  /**
   * Deprecated. Please use rangerAuditRole instead.
   **/
  private String baselineRole = null;

  /**
   * ID Broker mappings for individual actors and groups. Does not include mappings for data access services. May be empty if no individual mappings are needed.
   **/
  private List<IdBrokerMapping> mappings = new ArrayList<IdBrokerMapping>();

  /**
   * Getter for mappingsVersion.
   * The version of the mappings.
   **/
  @JsonProperty("mappingsVersion")
  public Long getMappingsVersion() {
    return mappingsVersion;
  }

  /**
   * Setter for mappingsVersion.
   * The version of the mappings.
   **/
  public void setMappingsVersion(Long mappingsVersion) {
    this.mappingsVersion = mappingsVersion;
  }

  /**
   * Getter for dataAccessRole.
   * The cloud provider role to which data access services will be mapped (e.g. an ARN in AWS, a Resource ID in Azure).
   **/
  @JsonProperty("dataAccessRole")
  public String getDataAccessRole() {
    return dataAccessRole;
  }

  /**
   * Setter for dataAccessRole.
   * The cloud provider role to which data access services will be mapped (e.g. an ARN in AWS, a Resource ID in Azure).
   **/
  public void setDataAccessRole(String dataAccessRole) {
    this.dataAccessRole = dataAccessRole;
  }

  /**
   * Getter for rangerAuditRole.
   * The cloud provider role to which services that write to Ranger audit logs will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). Note that some data access services also write to Ranger audit logs; such services will be mapped to the dataAccessRole, not the rangerAuditRole.
   **/
  @JsonProperty("rangerAuditRole")
  public String getRangerAuditRole() {
    return rangerAuditRole;
  }

  /**
   * Setter for rangerAuditRole.
   * The cloud provider role to which services that write to Ranger audit logs will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). Note that some data access services also write to Ranger audit logs; such services will be mapped to the dataAccessRole, not the rangerAuditRole.
   **/
  public void setRangerAuditRole(String rangerAuditRole) {
    this.rangerAuditRole = rangerAuditRole;
  }

  /**
   * Getter for rangerCloudAccessAuthorizerRole.
   * The cloud provider role to which the Ranger RAZ service will be mapped (e.g. an ARN in AWS, a Resource ID in Azure).
   **/
  @JsonProperty("rangerCloudAccessAuthorizerRole")
  public String getRangerCloudAccessAuthorizerRole() {
    return rangerCloudAccessAuthorizerRole;
  }

  /**
   * Setter for rangerCloudAccessAuthorizerRole.
   * The cloud provider role to which the Ranger RAZ service will be mapped (e.g. an ARN in AWS, a Resource ID in Azure).
   **/
  public void setRangerCloudAccessAuthorizerRole(String rangerCloudAccessAuthorizerRole) {
    this.rangerCloudAccessAuthorizerRole = rangerCloudAccessAuthorizerRole;
  }

  /**
   * Getter for baselineRole.
   * Deprecated. Please use rangerAuditRole instead.
   **/
  @Deprecated
  @JsonProperty("baselineRole")
  public String getBaselineRole() {
    return baselineRole;
  }

  /**
   * Setter for baselineRole.
   * Deprecated. Please use rangerAuditRole instead.
   **/
  @Deprecated
  public void setBaselineRole(String baselineRole) {
    this.baselineRole = baselineRole;
  }

  /**
   * Getter for mappings.
   * ID Broker mappings for individual actors and groups. Does not include mappings for data access services. May be empty if no individual mappings are needed.
   **/
  @JsonProperty("mappings")
  public List<IdBrokerMapping> getMappings() {
    return mappings;
  }

  /**
   * Setter for mappings.
   * ID Broker mappings for individual actors and groups. Does not include mappings for data access services. May be empty if no individual mappings are needed.
   **/
  public void setMappings(List<IdBrokerMapping> mappings) {
    this.mappings = mappings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIdBrokerMappingsResponse getIdBrokerMappingsResponse = (GetIdBrokerMappingsResponse) o;
    if (!Objects.equals(this.mappingsVersion, getIdBrokerMappingsResponse.mappingsVersion)) {
      return false;
    }
    if (!Objects.equals(this.dataAccessRole, getIdBrokerMappingsResponse.dataAccessRole)) {
      return false;
    }
    if (!Objects.equals(this.rangerAuditRole, getIdBrokerMappingsResponse.rangerAuditRole)) {
      return false;
    }
    if (!Objects.equals(this.rangerCloudAccessAuthorizerRole, getIdBrokerMappingsResponse.rangerCloudAccessAuthorizerRole)) {
      return false;
    }
    if (!Objects.equals(this.baselineRole, getIdBrokerMappingsResponse.baselineRole)) {
      return false;
    }
    if (!Objects.equals(this.mappings, getIdBrokerMappingsResponse.mappings)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappingsVersion, dataAccessRole, rangerAuditRole, rangerCloudAccessAuthorizerRole, baselineRole, mappings, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIdBrokerMappingsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mappingsVersion: ").append(toIndentedString(mappingsVersion)).append("\n");
    sb.append("    dataAccessRole: ").append(toIndentedString(dataAccessRole)).append("\n");
    sb.append("    rangerAuditRole: ").append(toIndentedString(rangerAuditRole)).append("\n");
    sb.append("    rangerCloudAccessAuthorizerRole: ").append(toIndentedString(rangerCloudAccessAuthorizerRole)).append("\n");
    sb.append("    baselineRole: ").append(toIndentedString(baselineRole)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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

