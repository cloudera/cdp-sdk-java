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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.AllowedInstanceTypes;

/**
 * Response object for the describeAllowedInstanceTypes method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:33.344-07:00")
public class DescribeAllowedInstanceTypesResponse extends CdpResponse {

  /**
   * Instance type settings that are being used during cluster creation command on the AWS platform
   **/
  private AllowedInstanceTypes aws = null;

  /**
   * Instance type settings that are being used during cluster creation command on the Azure platform
   **/
  private AllowedInstanceTypes azure = null;

  /**
   * Getter for aws.
   * Instance type settings that are being used during cluster creation command on the AWS platform
   **/
  @JsonProperty("aws")
  public AllowedInstanceTypes getAws() {
    return aws;
  }

  /**
   * Setter for aws.
   * Instance type settings that are being used during cluster creation command on the AWS platform
   **/
  public void setAws(AllowedInstanceTypes aws) {
    this.aws = aws;
  }

  /**
   * Getter for azure.
   * Instance type settings that are being used during cluster creation command on the Azure platform
   **/
  @JsonProperty("azure")
  public AllowedInstanceTypes getAzure() {
    return azure;
  }

  /**
   * Setter for azure.
   * Instance type settings that are being used during cluster creation command on the Azure platform
   **/
  public void setAzure(AllowedInstanceTypes azure) {
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
    DescribeAllowedInstanceTypesResponse describeAllowedInstanceTypesResponse = (DescribeAllowedInstanceTypesResponse) o;
    if (!Objects.equals(this.aws, describeAllowedInstanceTypesResponse.aws)) {
      return false;
    }
    if (!Objects.equals(this.azure, describeAllowedInstanceTypesResponse.azure)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(aws, azure, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAllowedInstanceTypesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
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

