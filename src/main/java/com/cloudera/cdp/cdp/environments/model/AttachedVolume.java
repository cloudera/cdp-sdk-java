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
 * The attached volume configuration.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:10.209-08:00")
public class AttachedVolume  {

  /**
   * The number of volumes.
   **/
  private Integer count = null;

  /**
   * The type of the volumes.
   **/
  private String volumeType = null;

  /**
   * The size of each volume in GB.
   **/
  private Long size = null;

  /**
   * Getter for count.
   * The number of volumes.
   **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  /**
   * Setter for count.
   * The number of volumes.
   **/
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Getter for volumeType.
   * The type of the volumes.
   **/
  @JsonProperty("volumeType")
  public String getVolumeType() {
    return volumeType;
  }

  /**
   * Setter for volumeType.
   * The type of the volumes.
   **/
  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  /**
   * Getter for size.
   * The size of each volume in GB.
   **/
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }

  /**
   * Setter for size.
   * The size of each volume in GB.
   **/
  public void setSize(Long size) {
    this.size = size;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachedVolume attachedVolume = (AttachedVolume) o;
    if (!Objects.equals(this.count, attachedVolume.count)) {
      return false;
    }
    if (!Objects.equals(this.volumeType, attachedVolume.volumeType)) {
      return false;
    }
    if (!Objects.equals(this.size, attachedVolume.size)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, volumeType, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachedVolume {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

