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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for ModifyClusterSecurity.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-28T12:35:41.194-07:00")
public class ModifyClusterSecurityRequest  {

  /**
   * The CRN of the workspace cluster to modify.
   **/
  private String workspaceCrn = null;

  /**
   * Whether to allow only authorized IP ranges given or all public IPs.
   **/
  private Boolean allowlistAuthorizedIPRanges = null;

  /**
   * The allowlist of CIDR blocks which can access the API server.
   **/
  private List<String> authorizedIPRanges = new ArrayList<String>();

  /**
   * Getter for workspaceCrn.
   * The CRN of the workspace cluster to modify.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * The CRN of the workspace cluster to modify.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for allowlistAuthorizedIPRanges.
   * Whether to allow only authorized IP ranges given or all public IPs.
   **/
  @JsonProperty("allowlistAuthorizedIPRanges")
  public Boolean getAllowlistAuthorizedIPRanges() {
    return allowlistAuthorizedIPRanges;
  }

  /**
   * Setter for allowlistAuthorizedIPRanges.
   * Whether to allow only authorized IP ranges given or all public IPs.
   **/
  public void setAllowlistAuthorizedIPRanges(Boolean allowlistAuthorizedIPRanges) {
    this.allowlistAuthorizedIPRanges = allowlistAuthorizedIPRanges;
  }

  /**
   * Getter for authorizedIPRanges.
   * The allowlist of CIDR blocks which can access the API server.
   **/
  @JsonProperty("authorizedIPRanges")
  public List<String> getAuthorizedIPRanges() {
    return authorizedIPRanges;
  }

  /**
   * Setter for authorizedIPRanges.
   * The allowlist of CIDR blocks which can access the API server.
   **/
  public void setAuthorizedIPRanges(List<String> authorizedIPRanges) {
    this.authorizedIPRanges = authorizedIPRanges;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyClusterSecurityRequest modifyClusterSecurityRequest = (ModifyClusterSecurityRequest) o;
    if (!Objects.equals(this.workspaceCrn, modifyClusterSecurityRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.allowlistAuthorizedIPRanges, modifyClusterSecurityRequest.allowlistAuthorizedIPRanges)) {
      return false;
    }
    if (!Objects.equals(this.authorizedIPRanges, modifyClusterSecurityRequest.authorizedIPRanges)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceCrn, allowlistAuthorizedIPRanges, authorizedIPRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyClusterSecurityRequest {\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    allowlistAuthorizedIPRanges: ").append(toIndentedString(allowlistAuthorizedIPRanges)).append("\n");
    sb.append("    authorizedIPRanges: ").append(toIndentedString(authorizedIPRanges)).append("\n");
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

