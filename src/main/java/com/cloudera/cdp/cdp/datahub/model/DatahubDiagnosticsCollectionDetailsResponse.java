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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object for diagnostic collection details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-24T14:06:20.043-07:00")
public class DatahubDiagnosticsCollectionDetailsResponse extends CdpResponse {

  /**
   * Case number for the diagnostics collection.
   **/
  private String _case = null;

  /**
   * Output destination of the diagnostics collection.
   **/
  private String output = null;

  /**
   * Destination type of the diagnostics collection.
   **/
  private String destination = null;

  /**
   * Description of the diagnostics collection.
   **/
  private String description = null;

  /**
   * Account Id that was used for the diagnostics collection.
   **/
  private String accountId = null;

  /**
   * Crn of the cluster.
   **/
  private String resourceCrn = null;

  /**
   * Version of the cluster that was used for the diagnostics collection.
   **/
  private String clusterVersion = null;

  /**
   * Getter for _case.
   * Case number for the diagnostics collection.
   **/
  @JsonProperty("case")
  public String getCase() {
    return _case;
  }

  /**
   * Setter for _case.
   * Case number for the diagnostics collection.
   **/
  public void setCase(String _case) {
    this._case = _case;
  }

  /**
   * Getter for output.
   * Output destination of the diagnostics collection.
   **/
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }

  /**
   * Setter for output.
   * Output destination of the diagnostics collection.
   **/
  public void setOutput(String output) {
    this.output = output;
  }

  /**
   * Getter for destination.
   * Destination type of the diagnostics collection.
   **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * Destination type of the diagnostics collection.
   **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Getter for description.
   * Description of the diagnostics collection.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the diagnostics collection.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for accountId.
   * Account Id that was used for the diagnostics collection.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * Account Id that was used for the diagnostics collection.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Getter for resourceCrn.
   * Crn of the cluster.
   **/
  @JsonProperty("resourceCrn")
  public String getResourceCrn() {
    return resourceCrn;
  }

  /**
   * Setter for resourceCrn.
   * Crn of the cluster.
   **/
  public void setResourceCrn(String resourceCrn) {
    this.resourceCrn = resourceCrn;
  }

  /**
   * Getter for clusterVersion.
   * Version of the cluster that was used for the diagnostics collection.
   **/
  @JsonProperty("clusterVersion")
  public String getClusterVersion() {
    return clusterVersion;
  }

  /**
   * Setter for clusterVersion.
   * Version of the cluster that was used for the diagnostics collection.
   **/
  public void setClusterVersion(String clusterVersion) {
    this.clusterVersion = clusterVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatahubDiagnosticsCollectionDetailsResponse datahubDiagnosticsCollectionDetailsResponse = (DatahubDiagnosticsCollectionDetailsResponse) o;
    if (!Objects.equals(this._case, datahubDiagnosticsCollectionDetailsResponse._case)) {
      return false;
    }
    if (!Objects.equals(this.output, datahubDiagnosticsCollectionDetailsResponse.output)) {
      return false;
    }
    if (!Objects.equals(this.destination, datahubDiagnosticsCollectionDetailsResponse.destination)) {
      return false;
    }
    if (!Objects.equals(this.description, datahubDiagnosticsCollectionDetailsResponse.description)) {
      return false;
    }
    if (!Objects.equals(this.accountId, datahubDiagnosticsCollectionDetailsResponse.accountId)) {
      return false;
    }
    if (!Objects.equals(this.resourceCrn, datahubDiagnosticsCollectionDetailsResponse.resourceCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterVersion, datahubDiagnosticsCollectionDetailsResponse.clusterVersion)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(_case, output, destination, description, accountId, resourceCrn, clusterVersion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatahubDiagnosticsCollectionDetailsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    resourceCrn: ").append(toIndentedString(resourceCrn)).append("\n");
    sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
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

