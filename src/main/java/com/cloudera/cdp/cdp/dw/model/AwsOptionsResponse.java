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
 * Response object of the cluster Aws settings.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-01T19:38:40.467-07:00")
public class AwsOptionsResponse extends CdpResponse {

  /**
   * IDs of AWS subnets where the cluster has been deployed.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * Id of the Custom Amazon Machine Image
   **/
  private String customAmiId = null;

  /**
   * Getter for subnetIds.
   * IDs of AWS subnets where the cluster has been deployed.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * IDs of AWS subnets where the cluster has been deployed.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  /**
   * Getter for customAmiId.
   * Id of the Custom Amazon Machine Image
   **/
  @JsonProperty("customAmiId")
  public String getCustomAmiId() {
    return customAmiId;
  }

  /**
   * Setter for customAmiId.
   * Id of the Custom Amazon Machine Image
   **/
  public void setCustomAmiId(String customAmiId) {
    this.customAmiId = customAmiId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsOptionsResponse awsOptionsResponse = (AwsOptionsResponse) o;
    if (!Objects.equals(this.subnetIds, awsOptionsResponse.subnetIds)) {
      return false;
    }
    if (!Objects.equals(this.customAmiId, awsOptionsResponse.customAmiId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetIds, customAmiId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    customAmiId: ").append(toIndentedString(customAmiId)).append("\n");
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

