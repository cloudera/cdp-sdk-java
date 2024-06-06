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
 * Firewall rules for FreeIPA, Data Lake and Data Hub deployment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:30:58.948-07:00")
public class GcpSecurityAccessRequest  {

  /**
   * Firewall rule for Knox hosts.
   **/
  private String securityGroupIdForKnox = null;

  /**
   * Firewall rule for other hosts.
   **/
  private String defaultSecurityGroupId = null;

  /**
   * Getter for securityGroupIdForKnox.
   * Firewall rule for Knox hosts.
   **/
  @JsonProperty("securityGroupIdForKnox")
  public String getSecurityGroupIdForKnox() {
    return securityGroupIdForKnox;
  }

  /**
   * Setter for securityGroupIdForKnox.
   * Firewall rule for Knox hosts.
   **/
  public void setSecurityGroupIdForKnox(String securityGroupIdForKnox) {
    this.securityGroupIdForKnox = securityGroupIdForKnox;
  }

  /**
   * Getter for defaultSecurityGroupId.
   * Firewall rule for other hosts.
   **/
  @JsonProperty("defaultSecurityGroupId")
  public String getDefaultSecurityGroupId() {
    return defaultSecurityGroupId;
  }

  /**
   * Setter for defaultSecurityGroupId.
   * Firewall rule for other hosts.
   **/
  public void setDefaultSecurityGroupId(String defaultSecurityGroupId) {
    this.defaultSecurityGroupId = defaultSecurityGroupId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcpSecurityAccessRequest gcpSecurityAccessRequest = (GcpSecurityAccessRequest) o;
    if (!Objects.equals(this.securityGroupIdForKnox, gcpSecurityAccessRequest.securityGroupIdForKnox)) {
      return false;
    }
    if (!Objects.equals(this.defaultSecurityGroupId, gcpSecurityAccessRequest.defaultSecurityGroupId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityGroupIdForKnox, defaultSecurityGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcpSecurityAccessRequest {\n");
    sb.append("    securityGroupIdForKnox: ").append(toIndentedString(securityGroupIdForKnox)).append("\n");
    sb.append("    defaultSecurityGroupId: ").append(toIndentedString(defaultSecurityGroupId)).append("\n");
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

