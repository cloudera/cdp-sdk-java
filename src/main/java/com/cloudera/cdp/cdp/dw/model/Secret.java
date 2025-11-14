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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.SecretProperties;

/**
 * Details of a single DWX secret.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:04.824-08:00")
public class Secret  {

  /**
   * The user-facing name of the secret.
   **/
  private String secretName = null;

  /**
   * The provider key name associated with the secret.
   **/
  private String secretProviderKey = null;

  /**
   * The CRN of the user who created the secret.
   **/
  private String createdBy = null;

  /**
   * 
   **/
  private SecretProperties properties = null;

  /**
   * Getter for secretName.
   * The user-facing name of the secret.
   **/
  @JsonProperty("secretName")
  public String getSecretName() {
    return secretName;
  }

  /**
   * Setter for secretName.
   * The user-facing name of the secret.
   **/
  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  /**
   * Getter for secretProviderKey.
   * The provider key name associated with the secret.
   **/
  @JsonProperty("secretProviderKey")
  public String getSecretProviderKey() {
    return secretProviderKey;
  }

  /**
   * Setter for secretProviderKey.
   * The provider key name associated with the secret.
   **/
  public void setSecretProviderKey(String secretProviderKey) {
    this.secretProviderKey = secretProviderKey;
  }

  /**
   * Getter for createdBy.
   * The CRN of the user who created the secret.
   **/
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Setter for createdBy.
   * The CRN of the user who created the secret.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Getter for properties.
   * 
   **/
  @JsonProperty("properties")
  public SecretProperties getProperties() {
    return properties;
  }

  /**
   * Setter for properties.
   * 
   **/
  public void setProperties(SecretProperties properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secret secret = (Secret) o;
    if (!Objects.equals(this.secretName, secret.secretName)) {
      return false;
    }
    if (!Objects.equals(this.secretProviderKey, secret.secretProviderKey)) {
      return false;
    }
    if (!Objects.equals(this.createdBy, secret.createdBy)) {
      return false;
    }
    if (!Objects.equals(this.properties, secret.properties)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretName, secretProviderKey, createdBy, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secret {\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    secretProviderKey: ").append(toIndentedString(secretProviderKey)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

