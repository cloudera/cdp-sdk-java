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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.CommonApiServerResp;
import com.cloudera.cdp.compute.model.CommonSecretEncryptionResp;
import com.cloudera.cdp.compute.model.CommonVolumeEncryptionResp;

/**
 * Security response structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:28.434-08:00")
public class CommonSecurityResp  {

  /**
   * API server.
   **/
  private CommonApiServerResp apiServer = null;

  /**
   * Secret encryption.
   **/
  private CommonSecretEncryptionResp secretEncryption = null;

  /**
   * Volume encryption.
   **/
  private CommonVolumeEncryptionResp volumeEncryption = null;

  /**
   * Flag to indicate if this is a private cluster with API Server having internal IP addressees.
   **/
  private Boolean _private = null;

  /**
   * Getter for apiServer.
   * API server.
   **/
  @JsonProperty("apiServer")
  public CommonApiServerResp getApiServer() {
    return apiServer;
  }

  /**
   * Setter for apiServer.
   * API server.
   **/
  public void setApiServer(CommonApiServerResp apiServer) {
    this.apiServer = apiServer;
  }

  /**
   * Getter for secretEncryption.
   * Secret encryption.
   **/
  @JsonProperty("secretEncryption")
  public CommonSecretEncryptionResp getSecretEncryption() {
    return secretEncryption;
  }

  /**
   * Setter for secretEncryption.
   * Secret encryption.
   **/
  public void setSecretEncryption(CommonSecretEncryptionResp secretEncryption) {
    this.secretEncryption = secretEncryption;
  }

  /**
   * Getter for volumeEncryption.
   * Volume encryption.
   **/
  @JsonProperty("volumeEncryption")
  public CommonVolumeEncryptionResp getVolumeEncryption() {
    return volumeEncryption;
  }

  /**
   * Setter for volumeEncryption.
   * Volume encryption.
   **/
  public void setVolumeEncryption(CommonVolumeEncryptionResp volumeEncryption) {
    this.volumeEncryption = volumeEncryption;
  }

  /**
   * Getter for _private.
   * Flag to indicate if this is a private cluster with API Server having internal IP addressees.
   **/
  @JsonProperty("private")
  public Boolean getPrivate() {
    return _private;
  }

  /**
   * Setter for _private.
   * Flag to indicate if this is a private cluster with API Server having internal IP addressees.
   **/
  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonSecurityResp commonSecurityResp = (CommonSecurityResp) o;
    if (!Objects.equals(this.apiServer, commonSecurityResp.apiServer)) {
      return false;
    }
    if (!Objects.equals(this.secretEncryption, commonSecurityResp.secretEncryption)) {
      return false;
    }
    if (!Objects.equals(this.volumeEncryption, commonSecurityResp.volumeEncryption)) {
      return false;
    }
    if (!Objects.equals(this._private, commonSecurityResp._private)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiServer, secretEncryption, volumeEncryption, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonSecurityResp {\n");
    sb.append("    apiServer: ").append(toIndentedString(apiServer)).append("\n");
    sb.append("    secretEncryption: ").append(toIndentedString(secretEncryption)).append("\n");
    sb.append("    volumeEncryption: ").append(toIndentedString(volumeEncryption)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

