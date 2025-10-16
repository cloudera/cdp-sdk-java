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
 * Custom AWS node storage parameters.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:48.641-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class AWSNodeStorageProfile  {

  /**
   * The size of the repository in GB.
   **/
  private Integer repoSize = null;

  /**
   * The IOPS of the repository.
   **/
  private String iops = null;

  /**
   * The throughput of the repository.
   **/
  private String throughput = null;

  /**
   * Getter for repoSize.
   * The size of the repository in GB.
   **/
  @JsonProperty("repoSize")
  public Integer getRepoSize() {
    return repoSize;
  }

  /**
   * Setter for repoSize.
   * The size of the repository in GB.
   **/
  public void setRepoSize(Integer repoSize) {
    this.repoSize = repoSize;
  }

  /**
   * Getter for iops.
   * The IOPS of the repository.
   **/
  @JsonProperty("iops")
  public String getIops() {
    return iops;
  }

  /**
   * Setter for iops.
   * The IOPS of the repository.
   **/
  public void setIops(String iops) {
    this.iops = iops;
  }

  /**
   * Getter for throughput.
   * The throughput of the repository.
   **/
  @JsonProperty("throughput")
  public String getThroughput() {
    return throughput;
  }

  /**
   * Setter for throughput.
   * The throughput of the repository.
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
    AWSNodeStorageProfile aWSNodeStorageProfile = (AWSNodeStorageProfile) o;
    if (!Objects.equals(this.repoSize, aWSNodeStorageProfile.repoSize)) {
      return false;
    }
    if (!Objects.equals(this.iops, aWSNodeStorageProfile.iops)) {
      return false;
    }
    if (!Objects.equals(this.throughput, aWSNodeStorageProfile.throughput)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoSize, iops, throughput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSNodeStorageProfile {\n");
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

