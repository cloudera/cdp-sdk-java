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
 * Request object for listPrivateLinkEndpointStatuses method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:49.632-07:00")
public class ListPrivateLinkEndpointStatusesRequest  {

  /**
   * Tracking ID of the create endpoint request.
   **/
  private String trackingId = null;

  /**
   * Getter for trackingId.
   * Tracking ID of the create endpoint request.
   **/
  @JsonProperty("trackingId")
  public String getTrackingId() {
    return trackingId;
  }

  /**
   * Setter for trackingId.
   * Tracking ID of the create endpoint request.
   **/
  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPrivateLinkEndpointStatusesRequest listPrivateLinkEndpointStatusesRequest = (ListPrivateLinkEndpointStatusesRequest) o;
    if (!Objects.equals(this.trackingId, listPrivateLinkEndpointStatusesRequest.trackingId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPrivateLinkEndpointStatusesRequest {\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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

