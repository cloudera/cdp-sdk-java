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
 * AWS-specific log storage configuration information.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-28T14:39:23.779-07:00")
public class LogStorageAwsDetails  {

  /**
   * The base location to store logs in S3. This should be an s3a:// url.
   **/
  private String storageLocationBase = null;

  /**
   * The AWS instance profile that which contains the necessary permissions to access the S3 storage location.
   **/
  private String instanceProfile = null;

  /**
   * Getter for storageLocationBase.
   * The base location to store logs in S3. This should be an s3a:// url.
   **/
  @JsonProperty("storageLocationBase")
  public String getStorageLocationBase() {
    return storageLocationBase;
  }

  /**
   * Setter for storageLocationBase.
   * The base location to store logs in S3. This should be an s3a:// url.
   **/
  public void setStorageLocationBase(String storageLocationBase) {
    this.storageLocationBase = storageLocationBase;
  }

  /**
   * Getter for instanceProfile.
   * The AWS instance profile that which contains the necessary permissions to access the S3 storage location.
   **/
  @JsonProperty("instanceProfile")
  public String getInstanceProfile() {
    return instanceProfile;
  }

  /**
   * Setter for instanceProfile.
   * The AWS instance profile that which contains the necessary permissions to access the S3 storage location.
   **/
  public void setInstanceProfile(String instanceProfile) {
    this.instanceProfile = instanceProfile;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogStorageAwsDetails logStorageAwsDetails = (LogStorageAwsDetails) o;
    if (!Objects.equals(this.storageLocationBase, logStorageAwsDetails.storageLocationBase)) {
      return false;
    }
    if (!Objects.equals(this.instanceProfile, logStorageAwsDetails.instanceProfile)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageLocationBase, instanceProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogStorageAwsDetails {\n");
    sb.append("    storageLocationBase: ").append(toIndentedString(storageLocationBase)).append("\n");
    sb.append("    instanceProfile: ").append(toIndentedString(instanceProfile)).append("\n");
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

