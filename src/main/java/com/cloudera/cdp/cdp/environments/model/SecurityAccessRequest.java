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
import java.util.*;

/**
 * Security control configuration for FreeIPA and Datalake deployment. Choosing a CIDR will automatically create security groups. Alternatively existing security groups can be specified.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class SecurityAccessRequest  {

  /**
   * CIDR range which is allowed for inbound traffic. Either IPv4 or IPv6 is allowed.
   **/
  private String cidr = null;

  /**
   * Security group where Knox-enabled hosts are placed. Mutually exclusive with cidr.
   **/
  private String securityGroupIdForKnox = null;

  /**
   * Security group where all other hosts are placed. Mutually exclusive with cidr.
   **/
  private String defaultSecurityGroupId = null;

  /**
   * Security group IDs where Knox-enabled hosts are placed. Mutually exclusive with CIDR.
   **/
  private List<String> securityGroupIDsForKnox = new ArrayList<String>();

  /**
   * Security group IDs where all other hosts are placed. Mutually exclusive with CIDR.
   **/
  private List<String> defaultSecurityGroupIDs = new ArrayList<String>();

  /**
   * Getter for cidr.
   * CIDR range which is allowed for inbound traffic. Either IPv4 or IPv6 is allowed.
   **/
  @JsonProperty("cidr")
  public String getCidr() {
    return cidr;
  }

  /**
   * Setter for cidr.
   * CIDR range which is allowed for inbound traffic. Either IPv4 or IPv6 is allowed.
   **/
  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  /**
   * Getter for securityGroupIdForKnox.
   * Security group where Knox-enabled hosts are placed. Mutually exclusive with cidr.
   **/
  @JsonProperty("securityGroupIdForKnox")
  public String getSecurityGroupIdForKnox() {
    return securityGroupIdForKnox;
  }

  /**
   * Setter for securityGroupIdForKnox.
   * Security group where Knox-enabled hosts are placed. Mutually exclusive with cidr.
   **/
  public void setSecurityGroupIdForKnox(String securityGroupIdForKnox) {
    this.securityGroupIdForKnox = securityGroupIdForKnox;
  }

  /**
   * Getter for defaultSecurityGroupId.
   * Security group where all other hosts are placed. Mutually exclusive with cidr.
   **/
  @JsonProperty("defaultSecurityGroupId")
  public String getDefaultSecurityGroupId() {
    return defaultSecurityGroupId;
  }

  /**
   * Setter for defaultSecurityGroupId.
   * Security group where all other hosts are placed. Mutually exclusive with cidr.
   **/
  public void setDefaultSecurityGroupId(String defaultSecurityGroupId) {
    this.defaultSecurityGroupId = defaultSecurityGroupId;
  }

  /**
   * Getter for securityGroupIDsForKnox.
   * Security group IDs where Knox-enabled hosts are placed. Mutually exclusive with CIDR.
   **/
  @JsonProperty("securityGroupIDsForKnox")
  public List<String> getSecurityGroupIDsForKnox() {
    return securityGroupIDsForKnox;
  }

  /**
   * Setter for securityGroupIDsForKnox.
   * Security group IDs where Knox-enabled hosts are placed. Mutually exclusive with CIDR.
   **/
  public void setSecurityGroupIDsForKnox(List<String> securityGroupIDsForKnox) {
    this.securityGroupIDsForKnox = securityGroupIDsForKnox;
  }

  /**
   * Getter for defaultSecurityGroupIDs.
   * Security group IDs where all other hosts are placed. Mutually exclusive with CIDR.
   **/
  @JsonProperty("defaultSecurityGroupIDs")
  public List<String> getDefaultSecurityGroupIDs() {
    return defaultSecurityGroupIDs;
  }

  /**
   * Setter for defaultSecurityGroupIDs.
   * Security group IDs where all other hosts are placed. Mutually exclusive with CIDR.
   **/
  public void setDefaultSecurityGroupIDs(List<String> defaultSecurityGroupIDs) {
    this.defaultSecurityGroupIDs = defaultSecurityGroupIDs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAccessRequest securityAccessRequest = (SecurityAccessRequest) o;
    if (!Objects.equals(this.cidr, securityAccessRequest.cidr)) {
      return false;
    }
    if (!Objects.equals(this.securityGroupIdForKnox, securityAccessRequest.securityGroupIdForKnox)) {
      return false;
    }
    if (!Objects.equals(this.defaultSecurityGroupId, securityAccessRequest.defaultSecurityGroupId)) {
      return false;
    }
    if (!Objects.equals(this.securityGroupIDsForKnox, securityAccessRequest.securityGroupIDsForKnox)) {
      return false;
    }
    if (!Objects.equals(this.defaultSecurityGroupIDs, securityAccessRequest.defaultSecurityGroupIDs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidr, securityGroupIdForKnox, defaultSecurityGroupId, securityGroupIDsForKnox, defaultSecurityGroupIDs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAccessRequest {\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    securityGroupIdForKnox: ").append(toIndentedString(securityGroupIdForKnox)).append("\n");
    sb.append("    defaultSecurityGroupId: ").append(toIndentedString(defaultSecurityGroupId)).append("\n");
    sb.append("    securityGroupIDsForKnox: ").append(toIndentedString(securityGroupIDsForKnox)).append("\n");
    sb.append("    defaultSecurityGroupIDs: ").append(toIndentedString(defaultSecurityGroupIDs)).append("\n");
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

