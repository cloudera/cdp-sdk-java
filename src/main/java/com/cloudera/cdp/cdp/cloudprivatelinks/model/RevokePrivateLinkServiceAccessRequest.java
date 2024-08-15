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
 * Request object for the RevokePrivateLinkServiceAccess method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:20.381-07:00")
public class RevokePrivateLinkServiceAccessRequest  {

  /**
   * Account ID to revoke access for PrivateLink.
   **/
  private String cloudAccountId = null;

  /**
   * Region where the private link service exists.
   **/
  private String region = null;

  /**
   * CDP service group. Currently supported \"CDP-CONTROL-PLANE\" for PaaS.
   **/
  private String serviceGroup = null;

  /**
   * Getter for cloudAccountId.
   * Account ID to revoke access for PrivateLink.
   **/
  @JsonProperty("cloudAccountId")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  /**
   * Setter for cloudAccountId.
   * Account ID to revoke access for PrivateLink.
   **/
  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  /**
   * Getter for region.
   * Region where the private link service exists.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Region where the private link service exists.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for serviceGroup.
   * CDP service group. Currently supported \&quot;CDP-CONTROL-PLANE\&quot; for PaaS.
   **/
  @JsonProperty("serviceGroup")
  public String getServiceGroup() {
    return serviceGroup;
  }

  /**
   * Setter for serviceGroup.
   * CDP service group. Currently supported \&quot;CDP-CONTROL-PLANE\&quot; for PaaS.
   **/
  public void setServiceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokePrivateLinkServiceAccessRequest revokePrivateLinkServiceAccessRequest = (RevokePrivateLinkServiceAccessRequest) o;
    if (!Objects.equals(this.cloudAccountId, revokePrivateLinkServiceAccessRequest.cloudAccountId)) {
      return false;
    }
    if (!Objects.equals(this.region, revokePrivateLinkServiceAccessRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.serviceGroup, revokePrivateLinkServiceAccessRequest.serviceGroup)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, region, serviceGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokePrivateLinkServiceAccessRequest {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
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

