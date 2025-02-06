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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Configurations for volume encryption.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-06T11:00:47.347-08:00")
public class VolumeEncryptionRequest  {

  /**
   * Enable encyrption for all volumes in the instance group. Default is false.
   **/
  private Boolean enableEncryption = null;

  /**
   * The ARN of the encryption key to use. If nothing is specified, the default key will be used.
   **/
  private String encryptionKey = null;

  /**
   * Getter for enableEncryption.
   * Enable encyrption for all volumes in the instance group. Default is false.
   **/
  @JsonProperty("enableEncryption")
  public Boolean getEnableEncryption() {
    return enableEncryption;
  }

  /**
   * Setter for enableEncryption.
   * Enable encyrption for all volumes in the instance group. Default is false.
   **/
  public void setEnableEncryption(Boolean enableEncryption) {
    this.enableEncryption = enableEncryption;
  }

  /**
   * Getter for encryptionKey.
   * The ARN of the encryption key to use. If nothing is specified, the default key will be used.
   **/
  @JsonProperty("encryptionKey")
  public String getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * Setter for encryptionKey.
   * The ARN of the encryption key to use. If nothing is specified, the default key will be used.
   **/
  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeEncryptionRequest volumeEncryptionRequest = (VolumeEncryptionRequest) o;
    if (!Objects.equals(this.enableEncryption, volumeEncryptionRequest.enableEncryption)) {
      return false;
    }
    if (!Objects.equals(this.encryptionKey, volumeEncryptionRequest.encryptionKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableEncryption, encryptionKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeEncryptionRequest {\n");
    sb.append("    enableEncryption: ").append(toIndentedString(enableEncryption)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
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

