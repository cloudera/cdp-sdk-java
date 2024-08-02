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
 * The credential properties that closely related to those that have created on GCP.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-02T09:36:50.221-07:00")
public class GCPCredentialProperties  {

  /**
   * The GCP credential key type. Json is the only supported key type.
   **/
  private String keyType = null;

  /**
   * Getter for keyType.
   * The GCP credential key type. Json is the only supported key type.
   **/
  @JsonProperty("keyType")
  public String getKeyType() {
    return keyType;
  }

  /**
   * Setter for keyType.
   * The GCP credential key type. Json is the only supported key type.
   **/
  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPCredentialProperties gCPCredentialProperties = (GCPCredentialProperties) o;
    if (!Objects.equals(this.keyType, gCPCredentialProperties.keyType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPCredentialProperties {\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
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

