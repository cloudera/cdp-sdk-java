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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.CustomConfigs;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.Map;

/**
 * Cloud credential details for by-name or by-id cloud credential request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:13.128-07:00")
public class CredentialDetails  {

  /**
   * Credential id.
   **/
  private String id = null;

  /**
   * Credential name.
   **/
  private String name = null;

  /**
   * Credential provider.
   **/
  private String provider = null;

  /**
   * Authentication type.
   **/
  private String authType = null;

  /**
   * Creation time.
   **/
  private ZonedDateTime creationTime = null;

  /**
   * Last modified time.
   **/
  private ZonedDateTime lastModifiedTime = null;

  /**
   * Configurations.
   **/
  private Map<String, String> configs = new HashMap<String, String>();

  /**
   * Custom configurations.
   **/
  private List<CustomConfigs> customConfigs = new ArrayList<CustomConfigs>();

  /**
   * Getter for id.
   * Credential id.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Credential id.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * Credential name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Credential name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for provider.
   * Credential provider.
   **/
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  /**
   * Setter for provider.
   * Credential provider.
   **/
  public void setProvider(String provider) {
    this.provider = provider;
  }

  /**
   * Getter for authType.
   * Authentication type.
   **/
  @JsonProperty("authType")
  public String getAuthType() {
    return authType;
  }

  /**
   * Setter for authType.
   * Authentication type.
   **/
  public void setAuthType(String authType) {
    this.authType = authType;
  }

  /**
   * Getter for creationTime.
   * Creation time.
   **/
  @JsonProperty("creationTime")
  public ZonedDateTime getCreationTime() {
    return creationTime;
  }

  /**
   * Setter for creationTime.
   * Creation time.
   **/
  public void setCreationTime(ZonedDateTime creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Getter for lastModifiedTime.
   * Last modified time.
   **/
  @JsonProperty("lastModifiedTime")
  public ZonedDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  /**
   * Setter for lastModifiedTime.
   * Last modified time.
   **/
  public void setLastModifiedTime(ZonedDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  /**
   * Getter for configs.
   * Configurations.
   **/
  @JsonProperty("configs")
  public Map<String, String> getConfigs() {
    return configs;
  }

  /**
   * Setter for configs.
   * Configurations.
   **/
  public void setConfigs(Map<String, String> configs) {
    this.configs = configs;
  }

  /**
   * Getter for customConfigs.
   * Custom configurations.
   **/
  @JsonProperty("customConfigs")
  public List<CustomConfigs> getCustomConfigs() {
    return customConfigs;
  }

  /**
   * Setter for customConfigs.
   * Custom configurations.
   **/
  public void setCustomConfigs(List<CustomConfigs> customConfigs) {
    this.customConfigs = customConfigs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialDetails credentialDetails = (CredentialDetails) o;
    if (!Objects.equals(this.id, credentialDetails.id)) {
      return false;
    }
    if (!Objects.equals(this.name, credentialDetails.name)) {
      return false;
    }
    if (!Objects.equals(this.provider, credentialDetails.provider)) {
      return false;
    }
    if (!Objects.equals(this.authType, credentialDetails.authType)) {
      return false;
    }
    if (!Objects.equals(this.creationTime, credentialDetails.creationTime)) {
      return false;
    }
    if (!Objects.equals(this.lastModifiedTime, credentialDetails.lastModifiedTime)) {
      return false;
    }
    if (!Objects.equals(this.configs, credentialDetails.configs)) {
      return false;
    }
    if (!Objects.equals(this.customConfigs, credentialDetails.customConfigs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, provider, authType, creationTime, lastModifiedTime, configs, customConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    customConfigs: ").append(toIndentedString(customConfigs)).append("\n");
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

