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
 * Object containing details of encryption parameters for AWS cloud.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-06T10:34:44.278-07:00")
public class AwsDiskEncryptionParameters  {

  /**
   * ARN of the CMK which is used to encrypt the AWS EBS volumes.
   **/
  private String encryptionKeyArn = null;

  /**
   * Getter for encryptionKeyArn.
   * ARN of the CMK which is used to encrypt the AWS EBS volumes.
   **/
  @JsonProperty("encryptionKeyArn")
  public String getEncryptionKeyArn() {
    return encryptionKeyArn;
  }

  /**
   * Setter for encryptionKeyArn.
   * ARN of the CMK which is used to encrypt the AWS EBS volumes.
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
    AwsDiskEncryptionParameters awsDiskEncryptionParameters = (AwsDiskEncryptionParameters) o;
    if (!Objects.equals(this.encryptionKeyArn, awsDiskEncryptionParameters.encryptionKeyArn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionKeyArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsDiskEncryptionParameters {\n");
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
