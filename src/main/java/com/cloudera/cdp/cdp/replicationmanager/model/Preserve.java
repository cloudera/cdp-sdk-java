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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Properties to preserve after replication.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:16.355-07:00")
public class Preserve  {

  /**
   * Block size.
   **/
  private Boolean blockSize = null;

  /**
   * Replication count.
   **/
  private Boolean replicationCount = null;

  /**
   * Permissions.
   **/
  private Boolean permissions = null;

  /**
   * Extended attributes.
   **/
  private Boolean extendedAttributes = null;

  /**
   * Getter for blockSize.
   * Block size.
   **/
  @JsonProperty("blockSize")
  public Boolean getBlockSize() {
    return blockSize;
  }

  /**
   * Setter for blockSize.
   * Block size.
   **/
  public void setBlockSize(Boolean blockSize) {
    this.blockSize = blockSize;
  }

  /**
   * Getter for replicationCount.
   * Replication count.
   **/
  @JsonProperty("replicationCount")
  public Boolean getReplicationCount() {
    return replicationCount;
  }

  /**
   * Setter for replicationCount.
   * Replication count.
   **/
  public void setReplicationCount(Boolean replicationCount) {
    this.replicationCount = replicationCount;
  }

  /**
   * Getter for permissions.
   * Permissions.
   **/
  @JsonProperty("permissions")
  public Boolean getPermissions() {
    return permissions;
  }

  /**
   * Setter for permissions.
   * Permissions.
   **/
  public void setPermissions(Boolean permissions) {
    this.permissions = permissions;
  }

  /**
   * Getter for extendedAttributes.
   * Extended attributes.
   **/
  @JsonProperty("extendedAttributes")
  public Boolean getExtendedAttributes() {
    return extendedAttributes;
  }

  /**
   * Setter for extendedAttributes.
   * Extended attributes.
   **/
  public void setExtendedAttributes(Boolean extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preserve preserve = (Preserve) o;
    if (!Objects.equals(this.blockSize, preserve.blockSize)) {
      return false;
    }
    if (!Objects.equals(this.replicationCount, preserve.replicationCount)) {
      return false;
    }
    if (!Objects.equals(this.permissions, preserve.permissions)) {
      return false;
    }
    if (!Objects.equals(this.extendedAttributes, preserve.extendedAttributes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockSize, replicationCount, permissions, extendedAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preserve {\n");
    sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
    sb.append("    replicationCount: ").append(toIndentedString(replicationCount)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
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

