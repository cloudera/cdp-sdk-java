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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for starting secret rotation for datalake.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:12.765-07:00")
public class RotateSecretsRequest  {

  /**
   * The datalake name or CRN where we wish to rotate secrets.
   **/
  private String datalake = null;

  /**
   * The list of secrets that need replacement.
   **/
  private List<String> secretTypes = new ArrayList<String>();

  /**
   * Getter for datalake.
   * The datalake name or CRN where we wish to rotate secrets.
   **/
  @JsonProperty("datalake")
  public String getDatalake() {
    return datalake;
  }

  /**
   * Setter for datalake.
   * The datalake name or CRN where we wish to rotate secrets.
   **/
  public void setDatalake(String datalake) {
    this.datalake = datalake;
  }

  /**
   * Getter for secretTypes.
   * The list of secrets that need replacement.
   **/
  @JsonProperty("secretTypes")
  public List<String> getSecretTypes() {
    return secretTypes;
  }

  /**
   * Setter for secretTypes.
   * The list of secrets that need replacement.
   **/
  public void setSecretTypes(List<String> secretTypes) {
    this.secretTypes = secretTypes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotateSecretsRequest rotateSecretsRequest = (RotateSecretsRequest) o;
    if (!Objects.equals(this.datalake, rotateSecretsRequest.datalake)) {
      return false;
    }
    if (!Objects.equals(this.secretTypes, rotateSecretsRequest.secretTypes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalake, secretTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotateSecretsRequest {\n");
    sb.append("    datalake: ").append(toIndentedString(datalake)).append("\n");
    sb.append("    secretTypes: ").append(toIndentedString(secretTypes)).append("\n");
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

