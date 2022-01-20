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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Object which holds the exposed endpoint.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-01-19T17:43:02.505-08:00")
public class Endpoint  {

  /**
   * The name of the exposed service
   **/
  private String serviceName = null;

  /**
   * The server url for the given exposed service's API.
   **/
  private String serviceUrl = null;

  /**
   * The more consumable name of the exposed service.
   **/
  private String displayName = null;

  /**
   * The related knox entry.
   **/
  private String knoxService = null;

  /**
   * The SSO mode of the given service.
   **/
  private String mode = null;

  /**
   * The access status of the given endpoint. Whether its open or not.
   **/
  private Boolean open = null;

  /**
   * Getter for serviceName.
   * The name of the exposed service
   **/
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Setter for serviceName.
   * The name of the exposed service
   **/
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * Getter for serviceUrl.
   * The server url for the given exposed service&#39;s API.
   **/
  @JsonProperty("serviceUrl")
  public String getServiceUrl() {
    return serviceUrl;
  }

  /**
   * Setter for serviceUrl.
   * The server url for the given exposed service&#39;s API.
   **/
  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  /**
   * Getter for displayName.
   * The more consumable name of the exposed service.
   **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Setter for displayName.
   * The more consumable name of the exposed service.
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Getter for knoxService.
   * The related knox entry.
   **/
  @JsonProperty("knoxService")
  public String getKnoxService() {
    return knoxService;
  }

  /**
   * Setter for knoxService.
   * The related knox entry.
   **/
  public void setKnoxService(String knoxService) {
    this.knoxService = knoxService;
  }

  /**
   * Getter for mode.
   * The SSO mode of the given service.
   **/
  @JsonProperty("mode")
  public String getMode() {
    return mode;
  }

  /**
   * Setter for mode.
   * The SSO mode of the given service.
   **/
  public void setMode(String mode) {
    this.mode = mode;
  }

  /**
   * Getter for open.
   * The access status of the given endpoint. Whether its open or not.
   **/
  @JsonProperty("open")
  public Boolean getOpen() {
    return open;
  }

  /**
   * Setter for open.
   * The access status of the given endpoint. Whether its open or not.
   **/
  public void setOpen(Boolean open) {
    this.open = open;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    if (!Objects.equals(this.serviceName, endpoint.serviceName)) {
      return false;
    }
    if (!Objects.equals(this.serviceUrl, endpoint.serviceUrl)) {
      return false;
    }
    if (!Objects.equals(this.displayName, endpoint.displayName)) {
      return false;
    }
    if (!Objects.equals(this.knoxService, endpoint.knoxService)) {
      return false;
    }
    if (!Objects.equals(this.mode, endpoint.mode)) {
      return false;
    }
    if (!Objects.equals(this.open, endpoint.open)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, serviceUrl, displayName, knoxService, mode, open);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    knoxService: ").append(toIndentedString(knoxService)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
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

