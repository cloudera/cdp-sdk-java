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
import com.cloudera.cdp.compute.model.AzureSecretEncryptionResp;

/**
 * Secret Encryption response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:31.430-07:00")
public class CommonSecretEncryptionResp  {

  /**
   * AWS KMS key ARN.
   **/
  private String customerKmsKeyArn = null;

  /**
   * Azure secret encryption details.
   **/
  private AzureSecretEncryptionResp azure = null;

  /**
   * Getter for customerKmsKeyArn.
   * AWS KMS key ARN.
   **/
  @JsonProperty("customerKmsKeyArn")
  public String getCustomerKmsKeyArn() {
    return customerKmsKeyArn;
  }

  /**
   * Setter for customerKmsKeyArn.
   * AWS KMS key ARN.
   **/
  public void setCustomerKmsKeyArn(String customerKmsKeyArn) {
    this.customerKmsKeyArn = customerKmsKeyArn;
  }

  /**
   * Getter for azure.
   * Azure secret encryption details.
   **/
  @JsonProperty("azure")
  public AzureSecretEncryptionResp getAzure() {
    return azure;
  }

  /**
   * Setter for azure.
   * Azure secret encryption details.
   **/
  public void setAzure(AzureSecretEncryptionResp azure) {
    this.azure = azure;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonSecretEncryptionResp commonSecretEncryptionResp = (CommonSecretEncryptionResp) o;
    if (!Objects.equals(this.customerKmsKeyArn, commonSecretEncryptionResp.customerKmsKeyArn)) {
      return false;
    }
    if (!Objects.equals(this.azure, commonSecretEncryptionResp.azure)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerKmsKeyArn, azure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonSecretEncryptionResp {\n");
    sb.append("    customerKmsKeyArn: ").append(toIndentedString(customerKmsKeyArn)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
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

