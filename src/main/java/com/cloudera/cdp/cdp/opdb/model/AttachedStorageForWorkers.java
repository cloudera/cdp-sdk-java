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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Attached storage for the worker nodes for AWS, Azure, and GCP cloud providers.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:22.696-08:00")
public class AttachedStorageForWorkers  {

  /**
   * The number of Volumes. Default is 4. Valid Range: Minimum value of 1, maximum value 8.
   **/
  private Integer volumeCount = null;

  /**
   * The target size of the volume, in GiB. Default is 2048.
   **/
  private Integer volumeSize = null;

  /**
   * The volume type. This parameter can be HDD or SSD. Default is HDD.
   **/
  private String volumeType = null;

  /**
   * Getter for volumeCount.
   * The number of Volumes. Default is 4. Valid Range: Minimum value of 1, maximum value 8.
   **/
  @JsonProperty("volumeCount")
  public Integer getVolumeCount() {
    return volumeCount;
  }

  /**
   * Setter for volumeCount.
   * The number of Volumes. Default is 4. Valid Range: Minimum value of 1, maximum value 8.
   **/
  public void setVolumeCount(Integer volumeCount) {
    this.volumeCount = volumeCount;
  }

  /**
   * Getter for volumeSize.
   * The target size of the volume, in GiB. Default is 2048.
   **/
  @JsonProperty("volumeSize")
  public Integer getVolumeSize() {
    return volumeSize;
  }

  /**
   * Setter for volumeSize.
   * The target size of the volume, in GiB. Default is 2048.
   **/
  public void setVolumeSize(Integer volumeSize) {
    this.volumeSize = volumeSize;
  }

  /**
   * Getter for volumeType.
   * The volume type. This parameter can be HDD or SSD. Default is HDD.
   **/
  @JsonProperty("volumeType")
  public String getVolumeType() {
    return volumeType;
  }

  /**
   * Setter for volumeType.
   * The volume type. This parameter can be HDD or SSD. Default is HDD.
   **/
  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachedStorageForWorkers attachedStorageForWorkers = (AttachedStorageForWorkers) o;
    if (!Objects.equals(this.volumeCount, attachedStorageForWorkers.volumeCount)) {
      return false;
    }
    if (!Objects.equals(this.volumeSize, attachedStorageForWorkers.volumeSize)) {
      return false;
    }
    if (!Objects.equals(this.volumeType, attachedStorageForWorkers.volumeType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeCount, volumeSize, volumeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachedStorageForWorkers {\n");
    sb.append("    volumeCount: ").append(toIndentedString(volumeCount)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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

