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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Inbound Connection Endpoint summary
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-16T15:45:13.576-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class InboundConnectionEndpointSummary  {

  /**
   * The FQDN of the inbound connection hostname
   **/
  private String fullyQualifiedDomainName = null;

  /**
   * State of the inbound connection endpoint
   **/
  private String state = null;

  /**
   * ID of deployment the hostname is assigned to
   **/
  private String deploymentId = null;

  /**
   * Internal identifier of the inbound connection endpoint
   **/
  private String id = null;

  /**
   * Getter for fullyQualifiedDomainName.
   * The FQDN of the inbound connection hostname
   **/
  @JsonProperty("fullyQualifiedDomainName")
  public String getFullyQualifiedDomainName() {
    return fullyQualifiedDomainName;
  }

  /**
   * Setter for fullyQualifiedDomainName.
   * The FQDN of the inbound connection hostname
   **/
  public void setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
    this.fullyQualifiedDomainName = fullyQualifiedDomainName;
  }

  /**
   * Getter for state.
   * State of the inbound connection endpoint
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * State of the inbound connection endpoint
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for deploymentId.
   * ID of deployment the hostname is assigned to
   **/
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }

  /**
   * Setter for deploymentId.
   * ID of deployment the hostname is assigned to
   **/
  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  /**
   * Getter for id.
   * Internal identifier of the inbound connection endpoint
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Internal identifier of the inbound connection endpoint
   **/
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundConnectionEndpointSummary inboundConnectionEndpointSummary = (InboundConnectionEndpointSummary) o;
    if (!Objects.equals(this.fullyQualifiedDomainName, inboundConnectionEndpointSummary.fullyQualifiedDomainName)) {
      return false;
    }
    if (!Objects.equals(this.state, inboundConnectionEndpointSummary.state)) {
      return false;
    }
    if (!Objects.equals(this.deploymentId, inboundConnectionEndpointSummary.deploymentId)) {
      return false;
    }
    if (!Objects.equals(this.id, inboundConnectionEndpointSummary.id)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullyQualifiedDomainName, state, deploymentId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundConnectionEndpointSummary {\n");
    sb.append("    fullyQualifiedDomainName: ").append(toIndentedString(fullyQualifiedDomainName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

