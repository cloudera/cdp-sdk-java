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

package com.cloudera.cdp.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * The model for an API request event, as a part of CdpAuditEvent. These events are triggered by requests to public CDP API services.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-12-16T17:38:09.760-08:00")
public class ApiRequestEvent  {

  /**
   * The API request parameters.
   **/
  private String requestParameters = null;

  /**
   * The API response parameters. Only recorded for mutating calls.
   **/
  private String responseParameters = null;

  /**
   * Whether the request mutates the state of resources.
   **/
  private Boolean mutating = null;

  /**
   * The API version associated with the request.
   **/
  private String apiVersion = null;

  /**
   * The source IP address of the requester.
   **/
  private String sourceIPAddress = null;

  /**
   * The user agent that made the API request.
   **/
  private String userAgent = null;

  /**
   * Getter for requestParameters.
   * The API request parameters.
   **/
  @JsonProperty("requestParameters")
  public String getRequestParameters() {
    return requestParameters;
  }

  /**
   * Setter for requestParameters.
   * The API request parameters.
   **/
  public void setRequestParameters(String requestParameters) {
    this.requestParameters = requestParameters;
  }

  /**
   * Getter for responseParameters.
   * The API response parameters. Only recorded for mutating calls.
   **/
  @JsonProperty("responseParameters")
  public String getResponseParameters() {
    return responseParameters;
  }

  /**
   * Setter for responseParameters.
   * The API response parameters. Only recorded for mutating calls.
   **/
  public void setResponseParameters(String responseParameters) {
    this.responseParameters = responseParameters;
  }

  /**
   * Getter for mutating.
   * Whether the request mutates the state of resources.
   **/
  @JsonProperty("mutating")
  public Boolean getMutating() {
    return mutating;
  }

  /**
   * Setter for mutating.
   * Whether the request mutates the state of resources.
   **/
  public void setMutating(Boolean mutating) {
    this.mutating = mutating;
  }

  /**
   * Getter for apiVersion.
   * The API version associated with the request.
   **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  /**
   * Setter for apiVersion.
   * The API version associated with the request.
   **/
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Getter for sourceIPAddress.
   * The source IP address of the requester.
   **/
  @JsonProperty("sourceIPAddress")
  public String getSourceIPAddress() {
    return sourceIPAddress;
  }

  /**
   * Setter for sourceIPAddress.
   * The source IP address of the requester.
   **/
  public void setSourceIPAddress(String sourceIPAddress) {
    this.sourceIPAddress = sourceIPAddress;
  }

  /**
   * Getter for userAgent.
   * The user agent that made the API request.
   **/
  @JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }

  /**
   * Setter for userAgent.
   * The user agent that made the API request.
   **/
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestEvent apiRequestEvent = (ApiRequestEvent) o;
    if (!Objects.equals(this.requestParameters, apiRequestEvent.requestParameters)) {
      return false;
    }
    if (!Objects.equals(this.responseParameters, apiRequestEvent.responseParameters)) {
      return false;
    }
    if (!Objects.equals(this.mutating, apiRequestEvent.mutating)) {
      return false;
    }
    if (!Objects.equals(this.apiVersion, apiRequestEvent.apiVersion)) {
      return false;
    }
    if (!Objects.equals(this.sourceIPAddress, apiRequestEvent.sourceIPAddress)) {
      return false;
    }
    if (!Objects.equals(this.userAgent, apiRequestEvent.userAgent)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestParameters, responseParameters, mutating, apiVersion, sourceIPAddress, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestEvent {\n");
    sb.append("    requestParameters: ").append(toIndentedString(requestParameters)).append("\n");
    sb.append("    responseParameters: ").append(toIndentedString(responseParameters)).append("\n");
    sb.append("    mutating: ").append(toIndentedString(mutating)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    sourceIPAddress: ").append(toIndentedString(sourceIPAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

