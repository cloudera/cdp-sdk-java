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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * The request for revoking access
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-03-24T14:52:54.190-07:00")
public class RevokeUserKubernetesAccessRequest  {

  /**
   * The service CRN.
   **/
  private String serviceCrn = null;

  /**
   * The user to revoke remote access for
   **/
  private String cloudUserId = null;

  /**
   * Getter for serviceCrn.
   * The service CRN.
   **/
  @JsonProperty("serviceCrn")
  public String getServiceCrn() {
    return serviceCrn;
  }

  /**
   * Setter for serviceCrn.
   * The service CRN.
   **/
  public void setServiceCrn(String serviceCrn) {
    this.serviceCrn = serviceCrn;
  }

  /**
   * Getter for cloudUserId.
   * The user to revoke remote access for
   **/
  @JsonProperty("cloudUserId")
  public String getCloudUserId() {
    return cloudUserId;
  }

  /**
   * Setter for cloudUserId.
   * The user to revoke remote access for
   **/
  public void setCloudUserId(String cloudUserId) {
    this.cloudUserId = cloudUserId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeUserKubernetesAccessRequest revokeUserKubernetesAccessRequest = (RevokeUserKubernetesAccessRequest) o;
    if (!Objects.equals(this.serviceCrn, revokeUserKubernetesAccessRequest.serviceCrn)) {
      return false;
    }
    if (!Objects.equals(this.cloudUserId, revokeUserKubernetesAccessRequest.cloudUserId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCrn, cloudUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeUserKubernetesAccessRequest {\n");
    sb.append("    serviceCrn: ").append(toIndentedString(serviceCrn)).append("\n");
    sb.append("    cloudUserId: ").append(toIndentedString(cloudUserId)).append("\n");
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

