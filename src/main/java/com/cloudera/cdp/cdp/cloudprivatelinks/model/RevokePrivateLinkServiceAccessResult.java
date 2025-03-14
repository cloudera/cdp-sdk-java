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
 * Revoke response containing PrivateLink service name, service component and its revocation status.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:49.082-07:00")
public class RevokePrivateLinkServiceAccessResult  {

  /**
   * Name of the Private link service.
   **/
  private String privateLinkService = null;

  /**
   * CDP service component.
   **/
  private String serviceComponent = null;

  /**
   * Revocation status for the private link service.
   **/
  private String revocationStatus = null;

  /**
   * Getter for privateLinkService.
   * Name of the Private link service.
   **/
  @JsonProperty("privateLinkService")
  public String getPrivateLinkService() {
    return privateLinkService;
  }

  /**
   * Setter for privateLinkService.
   * Name of the Private link service.
   **/
  public void setPrivateLinkService(String privateLinkService) {
    this.privateLinkService = privateLinkService;
  }

  /**
   * Getter for serviceComponent.
   * CDP service component.
   **/
  @JsonProperty("serviceComponent")
  public String getServiceComponent() {
    return serviceComponent;
  }

  /**
   * Setter for serviceComponent.
   * CDP service component.
   **/
  public void setServiceComponent(String serviceComponent) {
    this.serviceComponent = serviceComponent;
  }

  /**
   * Getter for revocationStatus.
   * Revocation status for the private link service.
   **/
  @JsonProperty("revocationStatus")
  public String getRevocationStatus() {
    return revocationStatus;
  }

  /**
   * Setter for revocationStatus.
   * Revocation status for the private link service.
   **/
  public void setRevocationStatus(String revocationStatus) {
    this.revocationStatus = revocationStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokePrivateLinkServiceAccessResult revokePrivateLinkServiceAccessResult = (RevokePrivateLinkServiceAccessResult) o;
    if (!Objects.equals(this.privateLinkService, revokePrivateLinkServiceAccessResult.privateLinkService)) {
      return false;
    }
    if (!Objects.equals(this.serviceComponent, revokePrivateLinkServiceAccessResult.serviceComponent)) {
      return false;
    }
    if (!Objects.equals(this.revocationStatus, revokePrivateLinkServiceAccessResult.revocationStatus)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateLinkService, serviceComponent, revocationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokePrivateLinkServiceAccessResult {\n");
    sb.append("    privateLinkService: ").append(toIndentedString(privateLinkService)).append("\n");
    sb.append("    serviceComponent: ").append(toIndentedString(serviceComponent)).append("\n");
    sb.append("    revocationStatus: ").append(toIndentedString(revocationStatus)).append("\n");
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

