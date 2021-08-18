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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Configurations for additional attached volumes.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-08-18T09:49:25.133-07:00")
public class AttachedVolumeRequest  {

  /**
   * The attached volume size.
   **/
  private Integer volumeSize = null;

  /**
   * The attached volume count.
   **/
  private Integer volumeCount = null;

  /**
   * The attached volume type.
   **/
  private String volumeType = null;

  /**
   * Getter for volumeSize.
   * The attached volume size.
   **/
  @JsonProperty("volumeSize")
  public Integer getVolumeSize() {
    return volumeSize;
  }

  /**
   * Setter for volumeSize.
   * The attached volume size.
   **/
  public void setVolumeSize(Integer volumeSize) {
    this.volumeSize = volumeSize;
  }

  /**
   * Getter for volumeCount.
   * The attached volume count.
   **/
  @JsonProperty("volumeCount")
  public Integer getVolumeCount() {
    return volumeCount;
  }

  /**
   * Setter for volumeCount.
   * The attached volume count.
   **/
  public void setVolumeCount(Integer volumeCount) {
    this.volumeCount = volumeCount;
  }

  /**
   * Getter for volumeType.
   * The attached volume type.
   **/
  @JsonProperty("volumeType")
  public String getVolumeType() {
    return volumeType;
  }

  /**
   * Setter for volumeType.
   * The attached volume type.
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
    AttachedVolumeRequest attachedVolumeRequest = (AttachedVolumeRequest) o;
    if (!Objects.equals(this.volumeSize, attachedVolumeRequest.volumeSize)) {
      return false;
    }
    if (!Objects.equals(this.volumeCount, attachedVolumeRequest.volumeCount)) {
      return false;
    }
    if (!Objects.equals(this.volumeType, attachedVolumeRequest.volumeType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeSize, volumeCount, volumeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachedVolumeRequest {\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    volumeCount: ").append(toIndentedString(volumeCount)).append("\n");
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

