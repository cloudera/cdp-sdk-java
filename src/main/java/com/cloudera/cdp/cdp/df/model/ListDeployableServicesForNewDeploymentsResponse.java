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
import com.cloudera.cdp.df.model.ServiceSummary;
import java.util.*;

/**
 * Response object for the ListDeployableServicesForNewDeploymentsRequest method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:19.082-07:00")
public class ListDeployableServicesForNewDeploymentsResponse extends CdpResponse {

  /**
   * The services.
   **/
  private List<ServiceSummary> services = new ArrayList<ServiceSummary>();

  /**
   * Getter for services.
   * The services.
   **/
  @JsonProperty("services")
  public List<ServiceSummary> getServices() {
    return services;
  }

  /**
   * Setter for services.
   * The services.
   **/
  public void setServices(List<ServiceSummary> services) {
    this.services = services;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeployableServicesForNewDeploymentsResponse listDeployableServicesForNewDeploymentsResponse = (ListDeployableServicesForNewDeploymentsResponse) o;
    if (!Objects.equals(this.services, listDeployableServicesForNewDeploymentsResponse.services)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(services, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeployableServicesForNewDeploymentsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

