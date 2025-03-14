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
 * Attached volume configuration.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:43.637-07:00")
public class AddDisks  {

  /**
   * Number of disks to add on all the instances in a group.
   **/
  private Integer numberOfDisks = null;

  /**
   * Type of disks to add on all the instances in a group.
   **/
  private String volumeType = null;

  /**
   * Size of disks to add on all the instances in a group in GB.
   **/
  private Integer size = null;

  /**
   * Usage for the requested disks.
   **/
  private String cloudVolumeUsageType = null;

  /**
   * Getter for numberOfDisks.
   * Number of disks to add on all the instances in a group.
   **/
  @JsonProperty("numberOfDisks")
  public Integer getNumberOfDisks() {
    return numberOfDisks;
  }

  /**
   * Setter for numberOfDisks.
   * Number of disks to add on all the instances in a group.
   **/
  public void setNumberOfDisks(Integer numberOfDisks) {
    this.numberOfDisks = numberOfDisks;
  }

  /**
   * Getter for volumeType.
   * Type of disks to add on all the instances in a group.
   **/
  @JsonProperty("volumeType")
  public String getVolumeType() {
    return volumeType;
  }

  /**
   * Setter for volumeType.
   * Type of disks to add on all the instances in a group.
   **/
  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  /**
   * Getter for size.
   * Size of disks to add on all the instances in a group in GB.
   **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  /**
   * Setter for size.
   * Size of disks to add on all the instances in a group in GB.
   **/
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Getter for cloudVolumeUsageType.
   * Usage for the requested disks.
   **/
  @JsonProperty("cloudVolumeUsageType")
  public String getCloudVolumeUsageType() {
    return cloudVolumeUsageType;
  }

  /**
   * Setter for cloudVolumeUsageType.
   * Usage for the requested disks.
   **/
  public void setCloudVolumeUsageType(String cloudVolumeUsageType) {
    this.cloudVolumeUsageType = cloudVolumeUsageType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDisks addDisks = (AddDisks) o;
    if (!Objects.equals(this.numberOfDisks, addDisks.numberOfDisks)) {
      return false;
    }
    if (!Objects.equals(this.volumeType, addDisks.volumeType)) {
      return false;
    }
    if (!Objects.equals(this.size, addDisks.size)) {
      return false;
    }
    if (!Objects.equals(this.cloudVolumeUsageType, addDisks.cloudVolumeUsageType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfDisks, volumeType, size, cloudVolumeUsageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDisks {\n");
    sb.append("    numberOfDisks: ").append(toIndentedString(numberOfDisks)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    cloudVolumeUsageType: ").append(toIndentedString(cloudVolumeUsageType)).append("\n");
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

