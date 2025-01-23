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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Specify volume encryption key for instance group.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:41.282-08:00")
public class VolumeEncryption  {

  /**
   * Encryption key.
   **/
  private String encryptionKey = null;

  /**
   * Instance group to apply the encryption key to.
   **/
  private String instanceGroup = null;

  /**
   * Getter for encryptionKey.
   * Encryption key.
   **/
  @JsonProperty("encryptionKey")
  public String getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * Setter for encryptionKey.
   * Encryption key.
   **/
  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  /**
   * Getter for instanceGroup.
   * Instance group to apply the encryption key to.
   **/
  @JsonProperty("instanceGroup")
  public String getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Setter for instanceGroup.
   * Instance group to apply the encryption key to.
   **/
  public void setInstanceGroup(String instanceGroup) {
    this.instanceGroup = instanceGroup;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeEncryption volumeEncryption = (VolumeEncryption) o;
    if (!Objects.equals(this.encryptionKey, volumeEncryption.encryptionKey)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroup, volumeEncryption.instanceGroup)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionKey, instanceGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeEncryption {\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    instanceGroup: ").append(toIndentedString(instanceGroup)).append("\n");
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

