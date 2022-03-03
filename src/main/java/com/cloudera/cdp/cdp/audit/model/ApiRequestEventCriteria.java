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
 * Filter criteria for listing API request audit events.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:47.141-08:00")
public class ApiRequestEventCriteria  {

  /**
   * The source IP address of the requester.
   **/
  private String sourceIPAddress = null;

  /**
   * The user agent that made the API request.
   **/
  private String userAgent = null;

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
    ApiRequestEventCriteria apiRequestEventCriteria = (ApiRequestEventCriteria) o;
    if (!Objects.equals(this.sourceIPAddress, apiRequestEventCriteria.sourceIPAddress)) {
      return false;
    }
    if (!Objects.equals(this.userAgent, apiRequestEventCriteria.userAgent)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceIPAddress, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestEventCriteria {\n");
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

