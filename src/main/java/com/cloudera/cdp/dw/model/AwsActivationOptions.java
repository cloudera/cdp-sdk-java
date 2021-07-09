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
import java.util.*;

/**
 * Options for activating an AWS environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-09T16:32:32.573-07:00")
public class AwsActivationOptions  {

  /**
   * IDs of private AWS subnets where the cluster should be deployed.
   **/
  private List<String> privateSubnetIds = new ArrayList<String>();

  /**
   * IDs of public AWS subnets where the cluster should be deployed.
   **/
  private List<String> publicSubnetIds = new ArrayList<String>();

  /**
   * Getter for privateSubnetIds.
   * IDs of private AWS subnets where the cluster should be deployed.
   **/
  @JsonProperty("privateSubnetIds")
  public List<String> getPrivateSubnetIds() {
    return privateSubnetIds;
  }

  /**
   * Setter for privateSubnetIds.
   * IDs of private AWS subnets where the cluster should be deployed.
   **/
  public void setPrivateSubnetIds(List<String> privateSubnetIds) {
    this.privateSubnetIds = privateSubnetIds;
  }

  /**
   * Getter for publicSubnetIds.
   * IDs of public AWS subnets where the cluster should be deployed.
   **/
  @JsonProperty("publicSubnetIds")
  public List<String> getPublicSubnetIds() {
    return publicSubnetIds;
  }

  /**
   * Setter for publicSubnetIds.
   * IDs of public AWS subnets where the cluster should be deployed.
   **/
  public void setPublicSubnetIds(List<String> publicSubnetIds) {
    this.publicSubnetIds = publicSubnetIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsActivationOptions awsActivationOptions = (AwsActivationOptions) o;
    if (!Objects.equals(this.privateSubnetIds, awsActivationOptions.privateSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.publicSubnetIds, awsActivationOptions.publicSubnetIds)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateSubnetIds, publicSubnetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsActivationOptions {\n");
    sb.append("    privateSubnetIds: ").append(toIndentedString(privateSubnetIds)).append("\n");
    sb.append("    publicSubnetIds: ").append(toIndentedString(publicSubnetIds)).append("\n");
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

