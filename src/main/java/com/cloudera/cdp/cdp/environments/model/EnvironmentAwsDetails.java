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
 * AWS-specific environment configuration information.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-01-18T15:00:50.178-08:00")
public class EnvironmentAwsDetails  {

  /**
   * The name for the DynamoDB table backing S3Guard.
   **/
  private String s3GuardTableName = null;

  /**
   * Getter for s3GuardTableName.
   * The name for the DynamoDB table backing S3Guard.
   **/
  @JsonProperty("s3GuardTableName")
  public String getS3GuardTableName() {
    return s3GuardTableName;
  }

  /**
   * Setter for s3GuardTableName.
   * The name for the DynamoDB table backing S3Guard.
   **/
  public void setS3GuardTableName(String s3GuardTableName) {
    this.s3GuardTableName = s3GuardTableName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentAwsDetails environmentAwsDetails = (EnvironmentAwsDetails) o;
    if (!Objects.equals(this.s3GuardTableName, environmentAwsDetails.s3GuardTableName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3GuardTableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentAwsDetails {\n");
    sb.append("    s3GuardTableName: ").append(toIndentedString(s3GuardTableName)).append("\n");
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

