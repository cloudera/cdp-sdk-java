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
import com.cloudera.cdp.environments.model.EnvValidation;
import java.util.*;

/**
 * Exposed CDP DC service object.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:45.730-07:00")
public class ExposedService  {

  /**
   * Name of service.
   **/
  private String name = null;

  /**
   * Type of service.
   **/
  private String type = null;

  /**
   * Display name of service.
   **/
  private String displayName = null;

  /**
   * URL of service.
   **/
  private String serviceUrl = null;

  /**
   * Version of service.
   **/
  private String serviceVersion = null;

  /**
   * Status of service.
   **/
  private String status = null;

  /**
   * List of service validation message.
   **/
  private List<EnvValidation> serviceValidationMessages = new ArrayList<EnvValidation>();

  /**
   * Getter for name.
   * Name of service.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of service.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for type.
   * Type of service.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * Type of service.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for displayName.
   * Display name of service.
   **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Setter for displayName.
   * Display name of service.
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Getter for serviceUrl.
   * URL of service.
   **/
  @JsonProperty("serviceUrl")
  public String getServiceUrl() {
    return serviceUrl;
  }

  /**
   * Setter for serviceUrl.
   * URL of service.
   **/
  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  /**
   * Getter for serviceVersion.
   * Version of service.
   **/
  @JsonProperty("serviceVersion")
  public String getServiceVersion() {
    return serviceVersion;
  }

  /**
   * Setter for serviceVersion.
   * Version of service.
   **/
  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  /**
   * Getter for status.
   * Status of service.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of service.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for serviceValidationMessages.
   * List of service validation message.
   **/
  @JsonProperty("serviceValidationMessages")
  public List<EnvValidation> getServiceValidationMessages() {
    return serviceValidationMessages;
  }

  /**
   * Setter for serviceValidationMessages.
   * List of service validation message.
   **/
  public void setServiceValidationMessages(List<EnvValidation> serviceValidationMessages) {
    this.serviceValidationMessages = serviceValidationMessages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExposedService exposedService = (ExposedService) o;
    if (!Objects.equals(this.name, exposedService.name)) {
      return false;
    }
    if (!Objects.equals(this.type, exposedService.type)) {
      return false;
    }
    if (!Objects.equals(this.displayName, exposedService.displayName)) {
      return false;
    }
    if (!Objects.equals(this.serviceUrl, exposedService.serviceUrl)) {
      return false;
    }
    if (!Objects.equals(this.serviceVersion, exposedService.serviceVersion)) {
      return false;
    }
    if (!Objects.equals(this.status, exposedService.status)) {
      return false;
    }
    if (!Objects.equals(this.serviceValidationMessages, exposedService.serviceValidationMessages)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, displayName, serviceUrl, serviceVersion, status, serviceValidationMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExposedService {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    serviceValidationMessages: ").append(toIndentedString(serviceValidationMessages)).append("\n");
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

