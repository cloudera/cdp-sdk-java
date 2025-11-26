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

package com.cloudera.cdp.cloudprivatelinks.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.cloudprivatelinks.model.AWSAccountInfo;

/**
 * Request object for the MigratePrivateLinkEndpoints method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:46.268-08:00")
public class MigratePrivateLinkEndpointsRequest  {

  /**
   * Migration is for AWS-only. AWS account info for the PrivateLink endpoint migration. Only VPC ID, region, and credentials are required. Subnets and other details are retrieved from DB.
   **/
  private AWSAccountInfo awsAccountInfo = null;

  /**
   * Getter for awsAccountInfo.
   * Migration is for AWS-only. AWS account info for the PrivateLink endpoint migration. Only VPC ID, region, and credentials are required. Subnets and other details are retrieved from DB.
   **/
  @JsonProperty("awsAccountInfo")
  public AWSAccountInfo getAwsAccountInfo() {
    return awsAccountInfo;
  }

  /**
   * Setter for awsAccountInfo.
   * Migration is for AWS-only. AWS account info for the PrivateLink endpoint migration. Only VPC ID, region, and credentials are required. Subnets and other details are retrieved from DB.
   **/
  public void setAwsAccountInfo(AWSAccountInfo awsAccountInfo) {
    this.awsAccountInfo = awsAccountInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigratePrivateLinkEndpointsRequest migratePrivateLinkEndpointsRequest = (MigratePrivateLinkEndpointsRequest) o;
    if (!Objects.equals(this.awsAccountInfo, migratePrivateLinkEndpointsRequest.awsAccountInfo)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccountInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigratePrivateLinkEndpointsRequest {\n");
    sb.append("    awsAccountInfo: ").append(toIndentedString(awsAccountInfo)).append("\n");
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

