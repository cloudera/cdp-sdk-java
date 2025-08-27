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
 * A reference to a specific version of a shared parameter group
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:31.577-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class VersionedParameterGroupReference  {

  /**
   * The ID of the parameter group
   **/
  private String groupId = null;

  /**
   * The version of the parameter group. Empty or null means the latest version.
   **/
  private Long version = null;

  /**
   * Getter for groupId.
   * The ID of the parameter group
   **/
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  /**
   * Setter for groupId.
   * The ID of the parameter group
   **/
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  /**
   * Getter for version.
   * The version of the parameter group. Empty or null means the latest version.
   **/
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the parameter group. Empty or null means the latest version.
   **/
  public void setVersion(Long version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedParameterGroupReference versionedParameterGroupReference = (VersionedParameterGroupReference) o;
    if (!Objects.equals(this.groupId, versionedParameterGroupReference.groupId)) {
      return false;
    }
    if (!Objects.equals(this.version, versionedParameterGroupReference.version)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedParameterGroupReference {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

