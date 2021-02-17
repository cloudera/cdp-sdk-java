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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.iam.model.AccessKey;

/**
 * Response object for a create machine user access key request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-02-17T11:49:10.707-08:00")
public class CreateMachineUserAccessKeyResponse extends CdpResponse {

  /**
   * The access key that was created.
   **/
  private AccessKey accessKey = null;

  /**
   * The private key associated with this access key. This string is the contents of a PEM file containing a PKCS#8 private key.
   **/
  private String privateKey = null;

  /**
   * Getter for accessKey.
   * The access key that was created.
   **/
  @JsonProperty("accessKey")
  public AccessKey getAccessKey() {
    return accessKey;
  }

  /**
   * Setter for accessKey.
   * The access key that was created.
   **/
  public void setAccessKey(AccessKey accessKey) {
    this.accessKey = accessKey;
  }

  /**
   * Getter for privateKey.
   * The private key associated with this access key. This string is the contents of a PEM file containing a PKCS#8 private key.
   **/
  @JsonProperty("privateKey")
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * Setter for privateKey.
   * The private key associated with this access key. This string is the contents of a PEM file containing a PKCS#8 private key.
   **/
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMachineUserAccessKeyResponse createMachineUserAccessKeyResponse = (CreateMachineUserAccessKeyResponse) o;
    if (!Objects.equals(this.accessKey, createMachineUserAccessKeyResponse.accessKey)) {
      return false;
    }
    if (!Objects.equals(this.privateKey, createMachineUserAccessKeyResponse.privateKey)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, privateKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMachineUserAccessKeyResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

