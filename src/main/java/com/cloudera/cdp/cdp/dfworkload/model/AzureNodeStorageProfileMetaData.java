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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Azure node storage profile metadata.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:48.641-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class AzureNodeStorageProfileMetaData  {

  /**
   * Azure node storage profile name.
   **/
  private String profileName = null;

  /**
   * Azure node storage profile repo size.
   **/
  private Integer repoSize = null;

  /**
   * Azure node storage profile iops.
   **/
  private String iops = null;

  /**
   * Azure node storage profile throughput.
   **/
  private String throughput = null;

  /**
   * Getter for profileName.
   * Azure node storage profile name.
   **/
  @JsonProperty("profileName")
  public String getProfileName() {
    return profileName;
  }

  /**
   * Setter for profileName.
   * Azure node storage profile name.
   **/
  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  /**
   * Getter for repoSize.
   * Azure node storage profile repo size.
   **/
  @JsonProperty("repoSize")
  public Integer getRepoSize() {
    return repoSize;
  }

  /**
   * Setter for repoSize.
   * Azure node storage profile repo size.
   **/
  public void setRepoSize(Integer repoSize) {
    this.repoSize = repoSize;
  }

  /**
   * Getter for iops.
   * Azure node storage profile iops.
   **/
  @JsonProperty("iops")
  public String getIops() {
    return iops;
  }

  /**
   * Setter for iops.
   * Azure node storage profile iops.
   **/
  public void setIops(String iops) {
    this.iops = iops;
  }

  /**
   * Getter for throughput.
   * Azure node storage profile throughput.
   **/
  @JsonProperty("throughput")
  public String getThroughput() {
    return throughput;
  }

  /**
   * Setter for throughput.
   * Azure node storage profile throughput.
   **/
  public void setThroughput(String throughput) {
    this.throughput = throughput;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureNodeStorageProfileMetaData azureNodeStorageProfileMetaData = (AzureNodeStorageProfileMetaData) o;
    if (!Objects.equals(this.profileName, azureNodeStorageProfileMetaData.profileName)) {
      return false;
    }
    if (!Objects.equals(this.repoSize, azureNodeStorageProfileMetaData.repoSize)) {
      return false;
    }
    if (!Objects.equals(this.iops, azureNodeStorageProfileMetaData.iops)) {
      return false;
    }
    if (!Objects.equals(this.throughput, azureNodeStorageProfileMetaData.throughput)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileName, repoSize, iops, throughput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureNodeStorageProfileMetaData {\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    repoSize: ").append(toIndentedString(repoSize)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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

