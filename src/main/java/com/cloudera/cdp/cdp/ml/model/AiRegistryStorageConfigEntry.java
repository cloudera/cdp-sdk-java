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

/**
 * One AI Registry storage row keyed by Kubernetes namespace in FetchAiRegistriesStorageConfigResponse.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:49.791Z")
public class AiRegistryStorageConfigEntry  {

  /**
   * S3-compatible access key ID from the database.
   **/
  private String s3AccessId = null;

  /**
   * S3-compatible secret access key from the database.
   **/
  private String s3SecretKey = null;

  /**
   * S3-compatible endpoint URL from the database.
   **/
  private String s3EndpointUrl = null;

  /**
   * S3-compatible region from the database.
   **/
  private String s3Region = null;

  /**
   * True when this registry is linked per ai-registry-secrets for its namespace.
   **/
  private Boolean linkRegistry = null;

  /**
   * CDP environment name for this AI Registry (from the database).
   **/
  private String environmentName = null;

  /**
   * Getter for s3AccessId.
   * S3-compatible access key ID from the database.
   **/
  @JsonProperty("s3AccessId")
  public String getS3AccessId() {
    return s3AccessId;
  }

  /**
   * Setter for s3AccessId.
   * S3-compatible access key ID from the database.
   **/
  public void setS3AccessId(String s3AccessId) {
    this.s3AccessId = s3AccessId;
  }

  /**
   * Getter for s3SecretKey.
   * S3-compatible secret access key from the database.
   **/
  @JsonProperty("s3SecretKey")
  public String getS3SecretKey() {
    return s3SecretKey;
  }

  /**
   * Setter for s3SecretKey.
   * S3-compatible secret access key from the database.
   **/
  public void setS3SecretKey(String s3SecretKey) {
    this.s3SecretKey = s3SecretKey;
  }

  /**
   * Getter for s3EndpointUrl.
   * S3-compatible endpoint URL from the database.
   **/
  @JsonProperty("s3EndpointUrl")
  public String getS3EndpointUrl() {
    return s3EndpointUrl;
  }

  /**
   * Setter for s3EndpointUrl.
   * S3-compatible endpoint URL from the database.
   **/
  public void setS3EndpointUrl(String s3EndpointUrl) {
    this.s3EndpointUrl = s3EndpointUrl;
  }

  /**
   * Getter for s3Region.
   * S3-compatible region from the database.
   **/
  @JsonProperty("s3Region")
  public String getS3Region() {
    return s3Region;
  }

  /**
   * Setter for s3Region.
   * S3-compatible region from the database.
   **/
  public void setS3Region(String s3Region) {
    this.s3Region = s3Region;
  }

  /**
   * Getter for linkRegistry.
   * True when this registry is linked per ai-registry-secrets for its namespace.
   **/
  @JsonProperty("linkRegistry")
  public Boolean getLinkRegistry() {
    return linkRegistry;
  }

  /**
   * Setter for linkRegistry.
   * True when this registry is linked per ai-registry-secrets for its namespace.
   **/
  public void setLinkRegistry(Boolean linkRegistry) {
    this.linkRegistry = linkRegistry;
  }

  /**
   * Getter for environmentName.
   * CDP environment name for this AI Registry (from the database).
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * CDP environment name for this AI Registry (from the database).
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiRegistryStorageConfigEntry aiRegistryStorageConfigEntry = (AiRegistryStorageConfigEntry) o;
    if (!Objects.equals(this.s3AccessId, aiRegistryStorageConfigEntry.s3AccessId)) {
      return false;
    }
    if (!Objects.equals(this.s3SecretKey, aiRegistryStorageConfigEntry.s3SecretKey)) {
      return false;
    }
    if (!Objects.equals(this.s3EndpointUrl, aiRegistryStorageConfigEntry.s3EndpointUrl)) {
      return false;
    }
    if (!Objects.equals(this.s3Region, aiRegistryStorageConfigEntry.s3Region)) {
      return false;
    }
    if (!Objects.equals(this.linkRegistry, aiRegistryStorageConfigEntry.linkRegistry)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, aiRegistryStorageConfigEntry.environmentName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3AccessId, s3SecretKey, s3EndpointUrl, s3Region, linkRegistry, environmentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiRegistryStorageConfigEntry {\n");
    sb.append("    s3AccessId: ").append(toIndentedString(s3AccessId)).append("\n");
    sb.append("    s3SecretKey: ").append(toIndentedString(s3SecretKey)).append("\n");
    sb.append("    s3EndpointUrl: ").append(toIndentedString(s3EndpointUrl)).append("\n");
    sb.append("    s3Region: ").append(toIndentedString(s3Region)).append("\n");
    sb.append("    linkRegistry: ").append(toIndentedString(linkRegistry)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
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

