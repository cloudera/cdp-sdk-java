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
import java.util.*;

/**
 * Details of the PrivateLink endpoints.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:28.902-08:00")
public class PrivateLinkEndpointStatus  {

  /**
   * CDP service component name [API/DBUSAPI/IAMAPI/CCMV2/CONSOLEAUTH].
   **/
  private String serviceComponent = null;

  /**
   * Status of the PrivateLink endpoints. The status is set to SUCCESS on successful creation of endpoint, IN_PROGRESS on endpoint creation is in progress and ERROR on failing to create the endpoint.
   **/
  private String status = null;

  /**
   * Error message on failure.
   **/
  private String error = null;

  /**
   * PrivateLink endpoint ID on success.
   **/
  private String endpointId = null;

  /**
   * List of PrivateLink endpoint DNS names on successful creation.
   **/
  private List<String> dnsNames = new ArrayList<String>();

  /**
   * Endpoint creation timestamp.
   **/
  private String creationTimestamp = null;

  /**
   * Getter for serviceComponent.
   * CDP service component name [API/DBUSAPI/IAMAPI/CCMV2/CONSOLEAUTH].
   **/
  @JsonProperty("serviceComponent")
  public String getServiceComponent() {
    return serviceComponent;
  }

  /**
   * Setter for serviceComponent.
   * CDP service component name [API/DBUSAPI/IAMAPI/CCMV2/CONSOLEAUTH].
   **/
  public void setServiceComponent(String serviceComponent) {
    this.serviceComponent = serviceComponent;
  }

  /**
   * Getter for status.
   * Status of the PrivateLink endpoints. The status is set to SUCCESS on successful creation of endpoint, IN_PROGRESS on endpoint creation is in progress and ERROR on failing to create the endpoint.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the PrivateLink endpoints. The status is set to SUCCESS on successful creation of endpoint, IN_PROGRESS on endpoint creation is in progress and ERROR on failing to create the endpoint.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for error.
   * Error message on failure.
   **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  /**
   * Setter for error.
   * Error message on failure.
   **/
  public void setError(String error) {
    this.error = error;
  }

  /**
   * Getter for endpointId.
   * PrivateLink endpoint ID on success.
   **/
  @JsonProperty("endpointId")
  public String getEndpointId() {
    return endpointId;
  }

  /**
   * Setter for endpointId.
   * PrivateLink endpoint ID on success.
   **/
  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  /**
   * Getter for dnsNames.
   * List of PrivateLink endpoint DNS names on successful creation.
   **/
  @JsonProperty("dnsNames")
  public List<String> getDnsNames() {
    return dnsNames;
  }

  /**
   * Setter for dnsNames.
   * List of PrivateLink endpoint DNS names on successful creation.
   **/
  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }

  /**
   * Getter for creationTimestamp.
   * Endpoint creation timestamp.
   **/
  @JsonProperty("creationTimestamp")
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * Setter for creationTimestamp.
   * Endpoint creation timestamp.
   **/
  public void setCreationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateLinkEndpointStatus privateLinkEndpointStatus = (PrivateLinkEndpointStatus) o;
    if (!Objects.equals(this.serviceComponent, privateLinkEndpointStatus.serviceComponent)) {
      return false;
    }
    if (!Objects.equals(this.status, privateLinkEndpointStatus.status)) {
      return false;
    }
    if (!Objects.equals(this.error, privateLinkEndpointStatus.error)) {
      return false;
    }
    if (!Objects.equals(this.endpointId, privateLinkEndpointStatus.endpointId)) {
      return false;
    }
    if (!Objects.equals(this.dnsNames, privateLinkEndpointStatus.dnsNames)) {
      return false;
    }
    if (!Objects.equals(this.creationTimestamp, privateLinkEndpointStatus.creationTimestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceComponent, status, error, endpointId, dnsNames, creationTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateLinkEndpointStatus {\n");
    sb.append("    serviceComponent: ").append(toIndentedString(serviceComponent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
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

