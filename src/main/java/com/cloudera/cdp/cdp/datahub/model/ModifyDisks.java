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
 * Root or additional volume properties to modify.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:03.663-08:00")
public class ModifyDisks  {

  /**
   * Size of disks to modify on all the instances in a group in GB.
   **/
  private Integer size = null;

  /**
   * Type of disks to modify on all the instances in a group.
   **/
  private String volumeType = null;

  /**
   * Whether to modify the root disk or additional disks.
   **/
  private String diskType = null;

  /**
   * Getter for size.
   * Size of disks to modify on all the instances in a group in GB.
   **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  /**
   * Setter for size.
   * Size of disks to modify on all the instances in a group in GB.
   **/
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Getter for volumeType.
   * Type of disks to modify on all the instances in a group.
   **/
  @JsonProperty("volumeType")
  public String getVolumeType() {
    return volumeType;
  }

  /**
   * Setter for volumeType.
   * Type of disks to modify on all the instances in a group.
   **/
  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  /**
   * Getter for diskType.
   * Whether to modify the root disk or additional disks.
   **/
  @JsonProperty("diskType")
  public String getDiskType() {
    return diskType;
  }

  /**
   * Setter for diskType.
   * Whether to modify the root disk or additional disks.
   **/
  public void setDiskType(String diskType) {
    this.diskType = diskType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDisks modifyDisks = (ModifyDisks) o;
    if (!Objects.equals(this.size, modifyDisks.size)) {
      return false;
    }
    if (!Objects.equals(this.volumeType, modifyDisks.volumeType)) {
      return false;
    }
    if (!Objects.equals(this.diskType, modifyDisks.diskType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, volumeType, diskType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDisks {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    diskType: ").append(toIndentedString(diskType)).append("\n");
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

