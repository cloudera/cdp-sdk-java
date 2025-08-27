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
 * A mapping of an actor or group to a cloud provider role, used in request objects.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:29.563-07:00")
public class IdBrokerMappingRequest  {

  /**
   * The CRN of the actor or group.
   **/
  private String accessorCrn = null;

  /**
   * The cloud provider role (e.g., ARN in AWS, Resource ID in Azure) to which the actor or group is mapped.
   **/
  private String role = null;

  /**
   * Getter for accessorCrn.
   * The CRN of the actor or group.
   **/
  @JsonProperty("accessorCrn")
  public String getAccessorCrn() {
    return accessorCrn;
  }

  /**
   * Setter for accessorCrn.
   * The CRN of the actor or group.
   **/
  public void setAccessorCrn(String accessorCrn) {
    this.accessorCrn = accessorCrn;
  }

  /**
   * Getter for role.
   * The cloud provider role (e.g., ARN in AWS, Resource ID in Azure) to which the actor or group is mapped.
   **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  /**
   * Setter for role.
   * The cloud provider role (e.g., ARN in AWS, Resource ID in Azure) to which the actor or group is mapped.
   **/
  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdBrokerMappingRequest idBrokerMappingRequest = (IdBrokerMappingRequest) o;
    if (!Objects.equals(this.accessorCrn, idBrokerMappingRequest.accessorCrn)) {
      return false;
    }
    if (!Objects.equals(this.role, idBrokerMappingRequest.role)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorCrn, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdBrokerMappingRequest {\n");
    sb.append("    accessorCrn: ").append(toIndentedString(accessorCrn)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

