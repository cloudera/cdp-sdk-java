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
 * Request object for a create GCP credential request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:30:58.948-07:00")
public class CreateGCPCredentialRequest  {

  /**
   * The name of the credential.
   **/
  private String credentialName = null;

  /**
   * The JSON key for the service account. Please use local path when using the CLI (e.g. file:///absolute/path/to/cred.json) to avoid exposing the keys in the command line history.
   **/
  private String credentialKey = null;

  /**
   * A description for the credential.
   **/
  private String description = null;

  /**
   * Getter for credentialName.
   * The name of the credential.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * The name of the credential.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for credentialKey.
   * The JSON key for the service account. Please use local path when using the CLI (e.g. file:///absolute/path/to/cred.json) to avoid exposing the keys in the command line history.
   **/
  @JsonProperty("credentialKey")
  public String getCredentialKey() {
    return credentialKey;
  }

  /**
   * Setter for credentialKey.
   * The JSON key for the service account. Please use local path when using the CLI (e.g. file:///absolute/path/to/cred.json) to avoid exposing the keys in the command line history.
   **/
  public void setCredentialKey(String credentialKey) {
    this.credentialKey = credentialKey;
  }

  /**
   * Getter for description.
   * A description for the credential.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * A description for the credential.
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
    CreateGCPCredentialRequest createGCPCredentialRequest = (CreateGCPCredentialRequest) o;
    if (!Objects.equals(this.credentialName, createGCPCredentialRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.credentialKey, createGCPCredentialRequest.credentialKey)) {
      return false;
    }
    if (!Objects.equals(this.description, createGCPCredentialRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialName, credentialKey, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGCPCredentialRequest {\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    credentialKey: ").append(toIndentedString(credentialKey)).append("\n");
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

