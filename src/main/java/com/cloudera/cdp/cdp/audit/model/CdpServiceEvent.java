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
import java.util.*;

/**
 * The model for a service event, as a part of CdpAuditEvent. These events are created by Cloudera CDP services, but are not directly triggered by a request to a public CDP API service.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:47.141-08:00")
public class CdpServiceEvent  {

  /**
   * Optional JSON that contains additional details for an event and/or a result associated with the event. Each service defines the structure of details for each event.
   **/
  private String additionalServiceEventDetails = null;

  /**
   * The CRNs of the resources operated on.
   **/
  private List<String> resourceCrns = new ArrayList<String>();

  /**
   * The schema version of the additional service event details for this service event. Maintained by the service.
   **/
  private String detailsVersion = null;

  /**
   * Getter for additionalServiceEventDetails.
   * Optional JSON that contains additional details for an event and/or a result associated with the event. Each service defines the structure of details for each event.
   **/
  @JsonProperty("additionalServiceEventDetails")
  public String getAdditionalServiceEventDetails() {
    return additionalServiceEventDetails;
  }

  /**
   * Setter for additionalServiceEventDetails.
   * Optional JSON that contains additional details for an event and/or a result associated with the event. Each service defines the structure of details for each event.
   **/
  public void setAdditionalServiceEventDetails(String additionalServiceEventDetails) {
    this.additionalServiceEventDetails = additionalServiceEventDetails;
  }

  /**
   * Getter for resourceCrns.
   * The CRNs of the resources operated on.
   **/
  @JsonProperty("resourceCrns")
  public List<String> getResourceCrns() {
    return resourceCrns;
  }

  /**
   * Setter for resourceCrns.
   * The CRNs of the resources operated on.
   **/
  public void setResourceCrns(List<String> resourceCrns) {
    this.resourceCrns = resourceCrns;
  }

  /**
   * Getter for detailsVersion.
   * The schema version of the additional service event details for this service event. Maintained by the service.
   **/
  @JsonProperty("detailsVersion")
  public String getDetailsVersion() {
    return detailsVersion;
  }

  /**
   * Setter for detailsVersion.
   * The schema version of the additional service event details for this service event. Maintained by the service.
   **/
  public void setDetailsVersion(String detailsVersion) {
    this.detailsVersion = detailsVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdpServiceEvent cdpServiceEvent = (CdpServiceEvent) o;
    if (!Objects.equals(this.additionalServiceEventDetails, cdpServiceEvent.additionalServiceEventDetails)) {
      return false;
    }
    if (!Objects.equals(this.resourceCrns, cdpServiceEvent.resourceCrns)) {
      return false;
    }
    if (!Objects.equals(this.detailsVersion, cdpServiceEvent.detailsVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalServiceEventDetails, resourceCrns, detailsVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdpServiceEvent {\n");
    sb.append("    additionalServiceEventDetails: ").append(toIndentedString(additionalServiceEventDetails)).append("\n");
    sb.append("    resourceCrns: ").append(toIndentedString(resourceCrns)).append("\n");
    sb.append("    detailsVersion: ").append(toIndentedString(detailsVersion)).append("\n");
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

