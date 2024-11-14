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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * The encryption parameters used by the DataFlow service for K8s secret encryption and EBS volume encryption.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:27.676-08:00")
public class EncryptionParameters  {

  /**
   * The encryption strategy used by the DataFlow service.
   **/
  private String encryptionStrategy = null;

  /**
   * The AWS KMS key ARN used for encryption of Kubernetes secrets and EBS volumes.
   **/
  private String encryptionKeyArn = null;

  /**
   * Getter for encryptionStrategy.
   * The encryption strategy used by the DataFlow service.
   **/
  @JsonProperty("encryptionStrategy")
  public String getEncryptionStrategy() {
    return encryptionStrategy;
  }

  /**
   * Setter for encryptionStrategy.
   * The encryption strategy used by the DataFlow service.
   **/
  public void setEncryptionStrategy(String encryptionStrategy) {
    this.encryptionStrategy = encryptionStrategy;
  }

  /**
   * Getter for encryptionKeyArn.
   * The AWS KMS key ARN used for encryption of Kubernetes secrets and EBS volumes.
   **/
  @JsonProperty("encryptionKeyArn")
  public String getEncryptionKeyArn() {
    return encryptionKeyArn;
  }

  /**
   * Setter for encryptionKeyArn.
   * The AWS KMS key ARN used for encryption of Kubernetes secrets and EBS volumes.
   **/
  public void setEncryptionKeyArn(String encryptionKeyArn) {
    this.encryptionKeyArn = encryptionKeyArn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionParameters encryptionParameters = (EncryptionParameters) o;
    if (!Objects.equals(this.encryptionStrategy, encryptionParameters.encryptionStrategy)) {
      return false;
    }
    if (!Objects.equals(this.encryptionKeyArn, encryptionParameters.encryptionKeyArn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionStrategy, encryptionKeyArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionParameters {\n");
    sb.append("    encryptionStrategy: ").append(toIndentedString(encryptionStrategy)).append("\n");
    sb.append("    encryptionKeyArn: ").append(toIndentedString(encryptionKeyArn)).append("\n");
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

