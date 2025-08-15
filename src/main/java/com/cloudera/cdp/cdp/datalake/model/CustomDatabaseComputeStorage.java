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
 * Request object for modified database storage properties.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:45.021-07:00")
public class CustomDatabaseComputeStorage  {

  /**
   * The modified instance type.
   **/
  private String instanceType = null;

  /**
   * The modified storage size for the database.
   **/
  private Integer storageSize = null;

  /**
   * Getter for instanceType.
   * The modified instance type.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The modified instance type.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for storageSize.
   * The modified storage size for the database.
   **/
  @JsonProperty("storageSize")
  public Integer getStorageSize() {
    return storageSize;
  }

  /**
   * Setter for storageSize.
   * The modified storage size for the database.
   **/
  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDatabaseComputeStorage customDatabaseComputeStorage = (CustomDatabaseComputeStorage) o;
    if (!Objects.equals(this.instanceType, customDatabaseComputeStorage.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.storageSize, customDatabaseComputeStorage.storageSize)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, storageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDatabaseComputeStorage {\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
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

