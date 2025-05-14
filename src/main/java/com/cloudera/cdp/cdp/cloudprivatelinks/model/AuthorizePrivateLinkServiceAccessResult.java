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
 * Authorization response containing PrivateLink service name, service component and its authorization status.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:39.239-07:00")
public class AuthorizePrivateLinkServiceAccessResult  {

  /**
   * Name of the Private link service.
   **/
  private String privateLinkService = null;

  /**
   * CDP service component.
   **/
  private String serviceComponent = null;

  /**
   * Authorization status for the private link service.
   **/
  private String authorizationStatus = null;

  /**
   * Availability zone list.
   **/
  private String availabilityZoneList = null;

  /**
   * VPCE Client TCP port list.
   **/
  private String vpceClientTcpPortList = null;

  /**
   * Hostname of the Private Link Service.
   **/
  private String hostname = null;

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
   * Getter for authorizationStatus.
   * Authorization status for the private link service.
   **/
  @JsonProperty("authorizationStatus")
  public String getAuthorizationStatus() {
    return authorizationStatus;
  }

  /**
   * Setter for authorizationStatus.
   * Authorization status for the private link service.
   **/
  public void setAuthorizationStatus(String authorizationStatus) {
    this.authorizationStatus = authorizationStatus;
  }

  /**
   * Getter for availabilityZoneList.
   * Availability zone list.
   **/
  @JsonProperty("availabilityZoneList")
  public String getAvailabilityZoneList() {
    return availabilityZoneList;
  }

  /**
   * Setter for availabilityZoneList.
   * Availability zone list.
   **/
  public void setAvailabilityZoneList(String availabilityZoneList) {
    this.availabilityZoneList = availabilityZoneList;
  }

  /**
   * Getter for vpceClientTcpPortList.
   * VPCE Client TCP port list.
   **/
  @JsonProperty("vpceClientTcpPortList")
  public String getVpceClientTcpPortList() {
    return vpceClientTcpPortList;
  }

  /**
   * Setter for vpceClientTcpPortList.
   * VPCE Client TCP port list.
   **/
  public void setVpceClientTcpPortList(String vpceClientTcpPortList) {
    this.vpceClientTcpPortList = vpceClientTcpPortList;
  }

  /**
   * Getter for hostname.
   * Hostname of the Private Link Service.
   **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  /**
   * Setter for hostname.
   * Hostname of the Private Link Service.
   **/
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizePrivateLinkServiceAccessResult authorizePrivateLinkServiceAccessResult = (AuthorizePrivateLinkServiceAccessResult) o;
    if (!Objects.equals(this.privateLinkService, authorizePrivateLinkServiceAccessResult.privateLinkService)) {
      return false;
    }
    if (!Objects.equals(this.serviceComponent, authorizePrivateLinkServiceAccessResult.serviceComponent)) {
      return false;
    }
    if (!Objects.equals(this.authorizationStatus, authorizePrivateLinkServiceAccessResult.authorizationStatus)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZoneList, authorizePrivateLinkServiceAccessResult.availabilityZoneList)) {
      return false;
    }
    if (!Objects.equals(this.vpceClientTcpPortList, authorizePrivateLinkServiceAccessResult.vpceClientTcpPortList)) {
      return false;
    }
    if (!Objects.equals(this.hostname, authorizePrivateLinkServiceAccessResult.hostname)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateLinkService, serviceComponent, authorizationStatus, availabilityZoneList, vpceClientTcpPortList, hostname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizePrivateLinkServiceAccessResult {\n");
    sb.append("    privateLinkService: ").append(toIndentedString(privateLinkService)).append("\n");
    sb.append("    serviceComponent: ").append(toIndentedString(serviceComponent)).append("\n");
    sb.append("    authorizationStatus: ").append(toIndentedString(authorizationStatus)).append("\n");
    sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
    sb.append("    vpceClientTcpPortList: ").append(toIndentedString(vpceClientTcpPortList)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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

