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
import com.cloudera.cdp.dfworkload.model.InboundConnectionEndpointCertificateSummary;
import java.util.*;

/**
 * Inbound Connection Endpoint Summary
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-25T14:07:14.632-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class InboundConnectionEndpointSummary  {

  /**
   * The FQDN of the inbound connection hostname
   **/
  private String fullyQualifiedDomainName = null;

  /**
   * State of the Inbound Connection Endpoint
   **/
  private String state = null;

  /**
   * The CRN of the deployment the hostname is assigned to
   **/
  private String deploymentCrn = null;

  /**
   * The CRN of the Inbound Connection Endpoint
   **/
  private String crn = null;

  /**
   * The summaries of certificates associated with the Inbound Connection Endpoint
   **/
  private List<InboundConnectionEndpointCertificateSummary> certificateSummaries = new ArrayList<InboundConnectionEndpointCertificateSummary>();

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
   * State of the Inbound Connection Endpoint
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * State of the Inbound Connection Endpoint
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for deploymentCrn.
   * The CRN of the deployment the hostname is assigned to
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The CRN of the deployment the hostname is assigned to
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  /**
   * Getter for crn.
   * The CRN of the Inbound Connection Endpoint
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the Inbound Connection Endpoint
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for certificateSummaries.
   * The summaries of certificates associated with the Inbound Connection Endpoint
   **/
  @JsonProperty("certificateSummaries")
  public List<InboundConnectionEndpointCertificateSummary> getCertificateSummaries() {
    return certificateSummaries;
  }

  /**
   * Setter for certificateSummaries.
   * The summaries of certificates associated with the Inbound Connection Endpoint
   **/
  public void setCertificateSummaries(List<InboundConnectionEndpointCertificateSummary> certificateSummaries) {
    this.certificateSummaries = certificateSummaries;
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
    if (!Objects.equals(this.deploymentCrn, inboundConnectionEndpointSummary.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.crn, inboundConnectionEndpointSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.certificateSummaries, inboundConnectionEndpointSummary.certificateSummaries)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullyQualifiedDomainName, state, deploymentCrn, crn, certificateSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundConnectionEndpointSummary {\n");
    sb.append("    fullyQualifiedDomainName: ").append(toIndentedString(fullyQualifiedDomainName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    certificateSummaries: ").append(toIndentedString(certificateSummaries)).append("\n");
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

