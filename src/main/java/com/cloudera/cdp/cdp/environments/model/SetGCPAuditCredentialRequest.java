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
 * Request object for a set GCP audit credential request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-01T13:59:41.311-08:00")
public class SetGCPAuditCredentialRequest  {

  /**
   * The JSON key for the service account. Please use the local path when using the CLI (e.g. file:///absolute/path/to/cred.json) to avoid exposing the keys in the command line history.
   **/
  private String credentialKey = null;

  /**
   * Getter for credentialKey.
   * The JSON key for the service account. Please use the local path when using the CLI (e.g. file:///absolute/path/to/cred.json) to avoid exposing the keys in the command line history.
   **/
  @JsonProperty("credentialKey")
  public String getCredentialKey() {
    return credentialKey;
  }

  /**
   * Setter for credentialKey.
   * The JSON key for the service account. Please use the local path when using the CLI (e.g. file:///absolute/path/to/cred.json) to avoid exposing the keys in the command line history.
   **/
  public void setCredentialKey(String credentialKey) {
    this.credentialKey = credentialKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetGCPAuditCredentialRequest setGCPAuditCredentialRequest = (SetGCPAuditCredentialRequest) o;
    if (!Objects.equals(this.credentialKey, setGCPAuditCredentialRequest.credentialKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetGCPAuditCredentialRequest {\n");
    sb.append("    credentialKey: ").append(toIndentedString(credentialKey)).append("\n");
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
