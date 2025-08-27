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

/**
 * Response object for showing the secret types and descriptions.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:29.563-07:00")
public class SecretTypeResponse extends CdpResponse {

  /**
   * The type of secret that can be used with the rotate-freeipa-secrets command.
   **/
  private String secretType = null;

  /**
   * The description of the secret type.
   **/
  private String description = null;

  /**
   * Getter for secretType.
   * The type of secret that can be used with the rotate-freeipa-secrets command.
   **/
  @JsonProperty("secretType")
  public String getSecretType() {
    return secretType;
  }

  /**
   * Setter for secretType.
   * The type of secret that can be used with the rotate-freeipa-secrets command.
   **/
  public void setSecretType(String secretType) {
    this.secretType = secretType;
  }

  /**
   * Getter for description.
   * The description of the secret type.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the secret type.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretTypeResponse secretTypeResponse = (SecretTypeResponse) o;
    if (!Objects.equals(this.secretType, secretTypeResponse.secretType)) {
      return false;
    }
    if (!Objects.equals(this.description, secretTypeResponse.description)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretType, description, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretTypeResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

