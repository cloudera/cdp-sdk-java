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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for AWS configuration.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.225-07:00")
public class AWSConfigurationRequest  {

  /**
   * The ARN of an IAM instance profile.
   **/
  private String instanceProfile = null;

  /**
   * The location of the S3 bucket to be used as storage. The location has to start with s3a:// followed by the bucket name.
   **/
  private String storageBucketLocation = null;

  /**
   * Getter for instanceProfile.
   * The ARN of an IAM instance profile.
   **/
  @JsonProperty("instanceProfile")
  public String getInstanceProfile() {
    return instanceProfile;
  }

  /**
   * Setter for instanceProfile.
   * The ARN of an IAM instance profile.
   **/
  public void setInstanceProfile(String instanceProfile) {
    this.instanceProfile = instanceProfile;
  }

  /**
   * Getter for storageBucketLocation.
   * The location of the S3 bucket to be used as storage. The location has to start with s3a:// followed by the bucket name.
   **/
  @JsonProperty("storageBucketLocation")
  public String getStorageBucketLocation() {
    return storageBucketLocation;
  }

  /**
   * Setter for storageBucketLocation.
   * The location of the S3 bucket to be used as storage. The location has to start with s3a:// followed by the bucket name.
   **/
  public void setStorageBucketLocation(String storageBucketLocation) {
    this.storageBucketLocation = storageBucketLocation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSConfigurationRequest aWSConfigurationRequest = (AWSConfigurationRequest) o;
    if (!Objects.equals(this.instanceProfile, aWSConfigurationRequest.instanceProfile)) {
      return false;
    }
    if (!Objects.equals(this.storageBucketLocation, aWSConfigurationRequest.storageBucketLocation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfile, storageBucketLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSConfigurationRequest {\n");
    sb.append("    instanceProfile: ").append(toIndentedString(instanceProfile)).append("\n");
    sb.append("    storageBucketLocation: ").append(toIndentedString(storageBucketLocation)).append("\n");
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

