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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for modified instance disk.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-27T08:40:26.246-07:00")
public class CustomInstanceDisk  {

  /**
   * The name of the modified instance.
   **/
  private String name = null;

  /**
   * The modified disk size
   **/
  private Integer diskSize = null;

  /**
   * Getter for name.
   * The name of the modified instance.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the modified instance.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for diskSize.
   * The modified disk size
   **/
  @JsonProperty("diskSize")
  public Integer getDiskSize() {
    return diskSize;
  }

  /**
   * Setter for diskSize.
   * The modified disk size
   **/
  public void setDiskSize(Integer diskSize) {
    this.diskSize = diskSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomInstanceDisk customInstanceDisk = (CustomInstanceDisk) o;
    if (!Objects.equals(this.name, customInstanceDisk.name)) {
      return false;
    }
    if (!Objects.equals(this.diskSize, customInstanceDisk.diskSize)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, diskSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomInstanceDisk {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
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

