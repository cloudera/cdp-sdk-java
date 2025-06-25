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
import java.util.*;

/**
 * Custom AWS node storage limits.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-24T14:06:24.983-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class AWSNodeStorageProfileMetaData  {

  /**
   * The minimum size of the volume in GB.
   **/
  private Integer minRepoSize = null;

  /**
   * The maximum size of the volume in GB.
   **/
  private Integer maxRepoSize = null;

  /**
   * The IOPS values of the volume.
   **/
  private List<String> iops = new ArrayList<String>();

  /**
   * The throughput values of the volume.
   **/
  private List<String> throughput = new ArrayList<String>();

  /**
   * Getter for minRepoSize.
   * The minimum size of the volume in GB.
   **/
  @JsonProperty("minRepoSize")
  public Integer getMinRepoSize() {
    return minRepoSize;
  }

  /**
   * Setter for minRepoSize.
   * The minimum size of the volume in GB.
   **/
  public void setMinRepoSize(Integer minRepoSize) {
    this.minRepoSize = minRepoSize;
  }

  /**
   * Getter for maxRepoSize.
   * The maximum size of the volume in GB.
   **/
  @JsonProperty("maxRepoSize")
  public Integer getMaxRepoSize() {
    return maxRepoSize;
  }

  /**
   * Setter for maxRepoSize.
   * The maximum size of the volume in GB.
   **/
  public void setMaxRepoSize(Integer maxRepoSize) {
    this.maxRepoSize = maxRepoSize;
  }

  /**
   * Getter for iops.
   * The IOPS values of the volume.
   **/
  @JsonProperty("iops")
  public List<String> getIops() {
    return iops;
  }

  /**
   * Setter for iops.
   * The IOPS values of the volume.
   **/
  public void setIops(List<String> iops) {
    this.iops = iops;
  }

  /**
   * Getter for throughput.
   * The throughput values of the volume.
   **/
  @JsonProperty("throughput")
  public List<String> getThroughput() {
    return throughput;
  }

  /**
   * Setter for throughput.
   * The throughput values of the volume.
   **/
  public void setThroughput(List<String> throughput) {
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
    AWSNodeStorageProfileMetaData aWSNodeStorageProfileMetaData = (AWSNodeStorageProfileMetaData) o;
    if (!Objects.equals(this.minRepoSize, aWSNodeStorageProfileMetaData.minRepoSize)) {
      return false;
    }
    if (!Objects.equals(this.maxRepoSize, aWSNodeStorageProfileMetaData.maxRepoSize)) {
      return false;
    }
    if (!Objects.equals(this.iops, aWSNodeStorageProfileMetaData.iops)) {
      return false;
    }
    if (!Objects.equals(this.throughput, aWSNodeStorageProfileMetaData.throughput)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(minRepoSize, maxRepoSize, iops, throughput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSNodeStorageProfileMetaData {\n");
    sb.append("    minRepoSize: ").append(toIndentedString(minRepoSize)).append("\n");
    sb.append("    maxRepoSize: ").append(toIndentedString(maxRepoSize)).append("\n");
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

