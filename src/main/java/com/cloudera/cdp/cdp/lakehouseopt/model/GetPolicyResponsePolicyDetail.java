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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.lakehouseopt.model.NamespaceAssociation;
import java.util.*;
import java.util.Arrays;

/**
 * Policy detail corresponding to a unique policy version.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:05.230-07:00")
public class GetPolicyResponsePolicyDetail  {

  /**
   * The policy version which is a UUID.
   **/
  private String version = null;

  /**
   * JSON containing the action specific arguments and other user defined arguments.
   **/
  private byte[] arguments = null;

  /**
   * The scope of the policy. It can be Catalog or Namespace.
   **/
  private String scope = null;

  /**
   * The list containing table associations for each namespace.
   **/
  private List<NamespaceAssociation> associations = new ArrayList<NamespaceAssociation>();

  /**
   * The count of associated tables.
   **/
  private Integer tableCount = null;

  /**
   * The policy creation time in epoch milliseconds.
   **/
  private Long creationTime = null;

  /**
   * The recent policy execution epoch time in milliseconds.
   **/
  private Long lastExecutionTime = null;

  /**
   * Getter for version.
   * The policy version which is a UUID.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The policy version which is a UUID.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for arguments.
   * JSON containing the action specific arguments and other user defined arguments.
   **/
  @JsonProperty("arguments")
  public byte[] getArguments() {
    return Arrays.copyOf(arguments, arguments.length);
  }

  /**
   * Setter for arguments.
   * JSON containing the action specific arguments and other user defined arguments.
   **/
  public void setArguments(byte[] arguments) {
    this.arguments = Arrays.copyOf(arguments, arguments.length);
  }

  /**
   * Getter for scope.
   * The scope of the policy. It can be Catalog or Namespace.
   **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  /**
   * Setter for scope.
   * The scope of the policy. It can be Catalog or Namespace.
   **/
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * Getter for associations.
   * The list containing table associations for each namespace.
   **/
  @JsonProperty("associations")
  public List<NamespaceAssociation> getAssociations() {
    return associations;
  }

  /**
   * Setter for associations.
   * The list containing table associations for each namespace.
   **/
  public void setAssociations(List<NamespaceAssociation> associations) {
    this.associations = associations;
  }

  /**
   * Getter for tableCount.
   * The count of associated tables.
   **/
  @JsonProperty("tableCount")
  public Integer getTableCount() {
    return tableCount;
  }

  /**
   * Setter for tableCount.
   * The count of associated tables.
   **/
  public void setTableCount(Integer tableCount) {
    this.tableCount = tableCount;
  }

  /**
   * Getter for creationTime.
   * The policy creation time in epoch milliseconds.
   **/
  @JsonProperty("creationTime")
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * Setter for creationTime.
   * The policy creation time in epoch milliseconds.
   **/
  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Getter for lastExecutionTime.
   * The recent policy execution epoch time in milliseconds.
   **/
  @JsonProperty("lastExecutionTime")
  public Long getLastExecutionTime() {
    return lastExecutionTime;
  }

  /**
   * Setter for lastExecutionTime.
   * The recent policy execution epoch time in milliseconds.
   **/
  public void setLastExecutionTime(Long lastExecutionTime) {
    this.lastExecutionTime = lastExecutionTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPolicyResponsePolicyDetail getPolicyResponsePolicyDetail = (GetPolicyResponsePolicyDetail) o;
    if (!Objects.equals(this.version, getPolicyResponsePolicyDetail.version)) {
      return false;
    }
    if (!Objects.deepEquals(this.arguments, getPolicyResponsePolicyDetail.arguments)) {
      return false;
    }
    if (!Objects.equals(this.scope, getPolicyResponsePolicyDetail.scope)) {
      return false;
    }
    if (!Objects.equals(this.associations, getPolicyResponsePolicyDetail.associations)) {
      return false;
    }
    if (!Objects.equals(this.tableCount, getPolicyResponsePolicyDetail.tableCount)) {
      return false;
    }
    if (!Objects.equals(this.creationTime, getPolicyResponsePolicyDetail.creationTime)) {
      return false;
    }
    if (!Objects.equals(this.lastExecutionTime, getPolicyResponsePolicyDetail.lastExecutionTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, Arrays.hashCode(arguments), scope, associations, tableCount, creationTime, lastExecutionTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPolicyResponsePolicyDetail {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
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

