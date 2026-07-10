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
import com.cloudera.cdp.ml.model.MlServingOzoneCreds;

/**
 * Request object for the UpdateMlServingAppS3Creds method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:49.791Z")
public class UpdateMlServingAppS3CredsRequest  {

  /**
   * The CRN of the Cloudera AI Inference Service to update.
   **/
  private String appCrn = null;

  /**
   * The S3 credentials to update.
   **/
  private MlServingOzoneCreds s3Creds = null;

  /**
   * The namespace of the AI Registry
   **/
  private String registryNamespace = null;

  /**
   * Whether to link the registry
   **/
  private Boolean linkRegistry = null;

  /**
   * The environment name of the linked registry
   **/
  private String envName = null;

  /**
   * Getter for appCrn.
   * The CRN of the Cloudera AI Inference Service to update.
   **/
  @JsonProperty("appCrn")
  public String getAppCrn() {
    return appCrn;
  }

  /**
   * Setter for appCrn.
   * The CRN of the Cloudera AI Inference Service to update.
   **/
  public void setAppCrn(String appCrn) {
    this.appCrn = appCrn;
  }

  /**
   * Getter for s3Creds.
   * The S3 credentials to update.
   **/
  @JsonProperty("s3Creds")
  public MlServingOzoneCreds getS3Creds() {
    return s3Creds;
  }

  /**
   * Setter for s3Creds.
   * The S3 credentials to update.
   **/
  public void setS3Creds(MlServingOzoneCreds s3Creds) {
    this.s3Creds = s3Creds;
  }

  /**
   * Getter for registryNamespace.
   * The namespace of the AI Registry
   **/
  @JsonProperty("registryNamespace")
  public String getRegistryNamespace() {
    return registryNamespace;
  }

  /**
   * Setter for registryNamespace.
   * The namespace of the AI Registry
   **/
  public void setRegistryNamespace(String registryNamespace) {
    this.registryNamespace = registryNamespace;
  }

  /**
   * Getter for linkRegistry.
   * Whether to link the registry
   **/
  @JsonProperty("linkRegistry")
  public Boolean getLinkRegistry() {
    return linkRegistry;
  }

  /**
   * Setter for linkRegistry.
   * Whether to link the registry
   **/
  public void setLinkRegistry(Boolean linkRegistry) {
    this.linkRegistry = linkRegistry;
  }

  /**
   * Getter for envName.
   * The environment name of the linked registry
   **/
  @JsonProperty("envName")
  public String getEnvName() {
    return envName;
  }

  /**
   * Setter for envName.
   * The environment name of the linked registry
   **/
  public void setEnvName(String envName) {
    this.envName = envName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMlServingAppS3CredsRequest updateMlServingAppS3CredsRequest = (UpdateMlServingAppS3CredsRequest) o;
    if (!Objects.equals(this.appCrn, updateMlServingAppS3CredsRequest.appCrn)) {
      return false;
    }
    if (!Objects.equals(this.s3Creds, updateMlServingAppS3CredsRequest.s3Creds)) {
      return false;
    }
    if (!Objects.equals(this.registryNamespace, updateMlServingAppS3CredsRequest.registryNamespace)) {
      return false;
    }
    if (!Objects.equals(this.linkRegistry, updateMlServingAppS3CredsRequest.linkRegistry)) {
      return false;
    }
    if (!Objects.equals(this.envName, updateMlServingAppS3CredsRequest.envName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCrn, s3Creds, registryNamespace, linkRegistry, envName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMlServingAppS3CredsRequest {\n");
    sb.append("    appCrn: ").append(toIndentedString(appCrn)).append("\n");
    sb.append("    s3Creds: ").append(toIndentedString(s3Creds)).append("\n");
    sb.append("    registryNamespace: ").append(toIndentedString(registryNamespace)).append("\n");
    sb.append("    linkRegistry: ").append(toIndentedString(linkRegistry)).append("\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
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

