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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Model registry object
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:44.648-07:00")
public class ModelRegistry  {

  /**
   * The id of model registry.
   **/
  private Long id = null;

  /**
   * The namespace of model registry.
   **/
  private String namespace = null;

  /**
   * The s3 bucket of model registry.
   **/
  private String s3Bucket = null;

  /**
   * The Ozone endpoint of model registry.
   **/
  private String s3Endpoint = null;

  /**
   * The creator of model registry.
   **/
  private String creator = null;

  /**
   * The status of model registry.
   **/
  private String status = null;

  /**
   * The environment CRN of model registry.
   **/
  private String environmentCrn = null;

  /**
   * The creation time of model registry.
   **/
  private ZonedDateTime createdAt = null;

  /**
   * ModelRegistry CRN.
   **/
  private String crn = null;

  /**
   * Deprecated. workbench CRN. This field is no longer used.
   **/
  private String workspaceCrn = null;

  /**
   * Environment name.
   **/
  private String environmentName = null;

  /**
   * Deprecated, please refer to serviceName. workbench name.
   **/
  private String workspaceName = null;

  /**
   * The machine user CRN of the model registry.
   **/
  private String machineUserCrn = null;

  /**
   * The service name of model registry.
   **/
  private String serviceName = null;

  /**
   * The version of the model registry.
   **/
  private String version = null;

  /**
   * The domain of the model registry
   **/
  private String domain = null;

  /**
   * To indicate if the model registry standalone API endpoint is publicly accessible or not.
   **/
  private Boolean endpointPublicAccess = null;

  /**
   * Getter for id.
   * The id of model registry.
   **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Setter for id.
   * The id of model registry.
   **/
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Getter for namespace.
   * The namespace of model registry.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace of model registry.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for s3Bucket.
   * The s3 bucket of model registry.
   **/
  @JsonProperty("s3Bucket")
  public String getS3Bucket() {
    return s3Bucket;
  }

  /**
   * Setter for s3Bucket.
   * The s3 bucket of model registry.
   **/
  public void setS3Bucket(String s3Bucket) {
    this.s3Bucket = s3Bucket;
  }

  /**
   * Getter for s3Endpoint.
   * The Ozone endpoint of model registry.
   **/
  @JsonProperty("s3Endpoint")
  public String getS3Endpoint() {
    return s3Endpoint;
  }

  /**
   * Setter for s3Endpoint.
   * The Ozone endpoint of model registry.
   **/
  public void setS3Endpoint(String s3Endpoint) {
    this.s3Endpoint = s3Endpoint;
  }

  /**
   * Getter for creator.
   * The creator of model registry.
   **/
  @JsonProperty("creator")
  public String getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The creator of model registry.
   **/
  public void setCreator(String creator) {
    this.creator = creator;
  }

  /**
   * Getter for status.
   * The status of model registry.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of model registry.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for environmentCrn.
   * The environment CRN of model registry.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The environment CRN of model registry.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for createdAt.
   * The creation time of model registry.
   **/
  @JsonProperty("createdAt")
  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Setter for createdAt.
   * The creation time of model registry.
   **/
  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Getter for crn.
   * ModelRegistry CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * ModelRegistry CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for workspaceCrn.
   * Deprecated. workbench CRN. This field is no longer used.
   **/
  @Deprecated
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * Deprecated. workbench CRN. This field is no longer used.
   **/
  @Deprecated
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for environmentName.
   * Environment name.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Environment name.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for workspaceName.
   * Deprecated, please refer to serviceName. workbench name.
   **/
  @Deprecated
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }

  /**
   * Setter for workspaceName.
   * Deprecated, please refer to serviceName. workbench name.
   **/
  @Deprecated
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  /**
   * Getter for machineUserCrn.
   * The machine user CRN of the model registry.
   **/
  @JsonProperty("machineUserCrn")
  public String getMachineUserCrn() {
    return machineUserCrn;
  }

  /**
   * Setter for machineUserCrn.
   * The machine user CRN of the model registry.
   **/
  public void setMachineUserCrn(String machineUserCrn) {
    this.machineUserCrn = machineUserCrn;
  }

  /**
   * Getter for serviceName.
   * The service name of model registry.
   **/
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Setter for serviceName.
   * The service name of model registry.
   **/
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * Getter for version.
   * The version of the model registry.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the model registry.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for domain.
   * The domain of the model registry
   **/
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  /**
   * Setter for domain.
   * The domain of the model registry
   **/
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Getter for endpointPublicAccess.
   * To indicate if the model registry standalone API endpoint is publicly accessible or not.
   **/
  @JsonProperty("endpointPublicAccess")
  public Boolean getEndpointPublicAccess() {
    return endpointPublicAccess;
  }

  /**
   * Setter for endpointPublicAccess.
   * To indicate if the model registry standalone API endpoint is publicly accessible or not.
   **/
  public void setEndpointPublicAccess(Boolean endpointPublicAccess) {
    this.endpointPublicAccess = endpointPublicAccess;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRegistry modelRegistry = (ModelRegistry) o;
    if (!Objects.equals(this.id, modelRegistry.id)) {
      return false;
    }
    if (!Objects.equals(this.namespace, modelRegistry.namespace)) {
      return false;
    }
    if (!Objects.equals(this.s3Bucket, modelRegistry.s3Bucket)) {
      return false;
    }
    if (!Objects.equals(this.s3Endpoint, modelRegistry.s3Endpoint)) {
      return false;
    }
    if (!Objects.equals(this.creator, modelRegistry.creator)) {
      return false;
    }
    if (!Objects.equals(this.status, modelRegistry.status)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, modelRegistry.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.createdAt, modelRegistry.createdAt)) {
      return false;
    }
    if (!Objects.equals(this.crn, modelRegistry.crn)) {
      return false;
    }
    if (!Objects.equals(this.workspaceCrn, modelRegistry.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, modelRegistry.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceName, modelRegistry.workspaceName)) {
      return false;
    }
    if (!Objects.equals(this.machineUserCrn, modelRegistry.machineUserCrn)) {
      return false;
    }
    if (!Objects.equals(this.serviceName, modelRegistry.serviceName)) {
      return false;
    }
    if (!Objects.equals(this.version, modelRegistry.version)) {
      return false;
    }
    if (!Objects.equals(this.domain, modelRegistry.domain)) {
      return false;
    }
    if (!Objects.equals(this.endpointPublicAccess, modelRegistry.endpointPublicAccess)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, s3Bucket, s3Endpoint, creator, status, environmentCrn, createdAt, crn, workspaceCrn, environmentName, workspaceName, machineUserCrn, serviceName, version, domain, endpointPublicAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRegistry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
    sb.append("    s3Endpoint: ").append(toIndentedString(s3Endpoint)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    machineUserCrn: ").append(toIndentedString(machineUserCrn)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    endpointPublicAccess: ").append(toIndentedString(endpointPublicAccess)).append("\n");
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

