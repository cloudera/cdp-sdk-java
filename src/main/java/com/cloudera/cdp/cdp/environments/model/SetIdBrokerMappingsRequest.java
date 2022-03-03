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
import com.cloudera.cdp.environments.model.IdBrokerMappingRequest;
import java.util.*;

/**
 * Request object for setting ID Broker mappings for an environment. Overwrites all existing mappings.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:46.489-08:00")
public class SetIdBrokerMappingsRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environmentName = null;

  /**
   * The cloud provider role to which data access services will be mapped (e.g. an ARN in AWS, a Resource ID in Azure).
   **/
  private String dataAccessRole = null;

  /**
   * The cloud provider role to which services that write to Ranger audit logs will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). Note that some data access services also write to Ranger audit logs; such services will be mapped to the dataAccessRole, not the rangerAuditRole. ``THIS PARAMETER IS REQUIRED.``
   **/
  private String rangerAuditRole = null;

  /**
   * The cloud provider role to which the Ranger RAZ service will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). This is required in RAZ-enabled environments.
   **/
  private String rangerCloudAccessAuthorizerRole = null;

  /**
   * Deprecated. Please use rangerAuditRole instead.
   **/
  private String baselineRole = null;

  /**
   * ID Broker mappings for individual actors and groups. Does not include mappings for data access services. If omitted or set to an empty list, you must also specify the ``--set-empty-mappings`` option, to confirm that you want to remove any existing individual mappings.
   **/
  private List<IdBrokerMappingRequest> mappings = new ArrayList<IdBrokerMappingRequest>();

  /**
   * Whether to install an empty set of individual mappings, deleting any existing mappings. The ``--set-empty-mappings`` option is required if ``--mappings`` is omitted or if its value is an empty list, and disallowed otherwise.
   **/
  private Boolean setEmptyMappings = false;

  /**
   * Getter for environmentName.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name or CRN of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
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
   * The cloud provider role to which services that write to Ranger audit logs will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). Note that some data access services also write to Ranger audit logs; such services will be mapped to the dataAccessRole, not the rangerAuditRole. &#x60;&#x60;THIS PARAMETER IS REQUIRED.&#x60;&#x60;
   **/
  @JsonProperty("rangerAuditRole")
  public String getRangerAuditRole() {
    return rangerAuditRole;
  }

  /**
   * Setter for rangerAuditRole.
   * The cloud provider role to which services that write to Ranger audit logs will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). Note that some data access services also write to Ranger audit logs; such services will be mapped to the dataAccessRole, not the rangerAuditRole. &#x60;&#x60;THIS PARAMETER IS REQUIRED.&#x60;&#x60;
   **/
  public void setRangerAuditRole(String rangerAuditRole) {
    this.rangerAuditRole = rangerAuditRole;
  }

  /**
   * Getter for rangerCloudAccessAuthorizerRole.
   * The cloud provider role to which the Ranger RAZ service will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). This is required in RAZ-enabled environments.
   **/
  @JsonProperty("rangerCloudAccessAuthorizerRole")
  public String getRangerCloudAccessAuthorizerRole() {
    return rangerCloudAccessAuthorizerRole;
  }

  /**
   * Setter for rangerCloudAccessAuthorizerRole.
   * The cloud provider role to which the Ranger RAZ service will be mapped (e.g. an ARN in AWS, a Resource ID in Azure). This is required in RAZ-enabled environments.
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
   * ID Broker mappings for individual actors and groups. Does not include mappings for data access services. If omitted or set to an empty list, you must also specify the &#x60;&#x60;--set-empty-mappings&#x60;&#x60; option, to confirm that you want to remove any existing individual mappings.
   **/
  @JsonProperty("mappings")
  public List<IdBrokerMappingRequest> getMappings() {
    return mappings;
  }

  /**
   * Setter for mappings.
   * ID Broker mappings for individual actors and groups. Does not include mappings for data access services. If omitted or set to an empty list, you must also specify the &#x60;&#x60;--set-empty-mappings&#x60;&#x60; option, to confirm that you want to remove any existing individual mappings.
   **/
  public void setMappings(List<IdBrokerMappingRequest> mappings) {
    this.mappings = mappings;
  }

  /**
   * Getter for setEmptyMappings.
   * Whether to install an empty set of individual mappings, deleting any existing mappings. The &#x60;&#x60;--set-empty-mappings&#x60;&#x60; option is required if &#x60;&#x60;--mappings&#x60;&#x60; is omitted or if its value is an empty list, and disallowed otherwise.
   **/
  @JsonProperty("setEmptyMappings")
  public Boolean getSetEmptyMappings() {
    return setEmptyMappings;
  }

  /**
   * Setter for setEmptyMappings.
   * Whether to install an empty set of individual mappings, deleting any existing mappings. The &#x60;&#x60;--set-empty-mappings&#x60;&#x60; option is required if &#x60;&#x60;--mappings&#x60;&#x60; is omitted or if its value is an empty list, and disallowed otherwise.
   **/
  public void setSetEmptyMappings(Boolean setEmptyMappings) {
    this.setEmptyMappings = setEmptyMappings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetIdBrokerMappingsRequest setIdBrokerMappingsRequest = (SetIdBrokerMappingsRequest) o;
    if (!Objects.equals(this.environmentName, setIdBrokerMappingsRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.dataAccessRole, setIdBrokerMappingsRequest.dataAccessRole)) {
      return false;
    }
    if (!Objects.equals(this.rangerAuditRole, setIdBrokerMappingsRequest.rangerAuditRole)) {
      return false;
    }
    if (!Objects.equals(this.rangerCloudAccessAuthorizerRole, setIdBrokerMappingsRequest.rangerCloudAccessAuthorizerRole)) {
      return false;
    }
    if (!Objects.equals(this.baselineRole, setIdBrokerMappingsRequest.baselineRole)) {
      return false;
    }
    if (!Objects.equals(this.mappings, setIdBrokerMappingsRequest.mappings)) {
      return false;
    }
    if (!Objects.equals(this.setEmptyMappings, setIdBrokerMappingsRequest.setEmptyMappings)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, dataAccessRole, rangerAuditRole, rangerCloudAccessAuthorizerRole, baselineRole, mappings, setEmptyMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetIdBrokerMappingsRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    dataAccessRole: ").append(toIndentedString(dataAccessRole)).append("\n");
    sb.append("    rangerAuditRole: ").append(toIndentedString(rangerAuditRole)).append("\n");
    sb.append("    rangerCloudAccessAuthorizerRole: ").append(toIndentedString(rangerCloudAccessAuthorizerRole)).append("\n");
    sb.append("    baselineRole: ").append(toIndentedString(baselineRole)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    setEmptyMappings: ").append(toIndentedString(setEmptyMappings)).append("\n");
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

