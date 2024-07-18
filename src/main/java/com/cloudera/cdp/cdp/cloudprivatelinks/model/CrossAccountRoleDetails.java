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

package com.cloudera.cdp.cloudprivatelinks.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Customer cross account role details.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-07-18T14:59:57.730-07:00")
public class CrossAccountRoleDetails  {

  /**
   * Cross-account role.
   **/
  private String crossAccountRole = null;

  /**
   * External ID associated with the cross-account role.
   **/
  private String externalId = null;

  /**
   * Getter for crossAccountRole.
   * Cross-account role.
   **/
  @JsonProperty("crossAccountRole")
  public String getCrossAccountRole() {
    return crossAccountRole;
  }

  /**
   * Setter for crossAccountRole.
   * Cross-account role.
   **/
  public void setCrossAccountRole(String crossAccountRole) {
    this.crossAccountRole = crossAccountRole;
  }

  /**
   * Getter for externalId.
   * External ID associated with the cross-account role.
   **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  /**
   * Setter for externalId.
   * External ID associated with the cross-account role.
   **/
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossAccountRoleDetails crossAccountRoleDetails = (CrossAccountRoleDetails) o;
    if (!Objects.equals(this.crossAccountRole, crossAccountRoleDetails.crossAccountRole)) {
      return false;
    }
    if (!Objects.equals(this.externalId, crossAccountRoleDetails.externalId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossAccountRole, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossAccountRoleDetails {\n");
    sb.append("    crossAccountRole: ").append(toIndentedString(crossAccountRole)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

