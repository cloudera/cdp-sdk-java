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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for DisableService
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-12-16T12:55:42.233-08:00")
public class DisableServiceRequest  {

  /**
   * The service CRN.
   **/
  private String serviceCrn = null;

  /**
   * Whether or not to retain the database records of related entities
   **/
  private Boolean persist = null;

  /**
   * Whether or not to terminate all deployments associated with this DataFlow service
   **/
  private Boolean terminateDeployments = null;

  /**
   * Getter for serviceCrn.
   * The service CRN.
   **/
  @JsonProperty("serviceCrn")
  public String getServiceCrn() {
    return serviceCrn;
  }

  /**
   * Setter for serviceCrn.
   * The service CRN.
   **/
  public void setServiceCrn(String serviceCrn) {
    this.serviceCrn = serviceCrn;
  }

  /**
   * Getter for persist.
   * Whether or not to retain the database records of related entities
   **/
  @JsonProperty("persist")
  public Boolean getPersist() {
    return persist;
  }

  /**
   * Setter for persist.
   * Whether or not to retain the database records of related entities
   **/
  public void setPersist(Boolean persist) {
    this.persist = persist;
  }

  /**
   * Getter for terminateDeployments.
   * Whether or not to terminate all deployments associated with this DataFlow service
   **/
  @JsonProperty("terminateDeployments")
  public Boolean getTerminateDeployments() {
    return terminateDeployments;
  }

  /**
   * Setter for terminateDeployments.
   * Whether or not to terminate all deployments associated with this DataFlow service
   **/
  public void setTerminateDeployments(Boolean terminateDeployments) {
    this.terminateDeployments = terminateDeployments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisableServiceRequest disableServiceRequest = (DisableServiceRequest) o;
    if (!Objects.equals(this.serviceCrn, disableServiceRequest.serviceCrn)) {
      return false;
    }
    if (!Objects.equals(this.persist, disableServiceRequest.persist)) {
      return false;
    }
    if (!Objects.equals(this.terminateDeployments, disableServiceRequest.terminateDeployments)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCrn, persist, terminateDeployments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisableServiceRequest {\n");
    sb.append("    serviceCrn: ").append(toIndentedString(serviceCrn)).append("\n");
    sb.append("    persist: ").append(toIndentedString(persist)).append("\n");
    sb.append("    terminateDeployments: ").append(toIndentedString(terminateDeployments)).append("\n");
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

