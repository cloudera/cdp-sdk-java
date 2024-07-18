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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the listEvents method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-07-18T14:59:53.512-07:00")
public class ListEventsRequest  {

  /**
   * Filter events based on the operation ID. Either operation ID or service ID is required.
   **/
  private String operationId = null;

  /**
   * Filter events based on the service ID. It can be Cluster ID, Database Catalog ID, Virtual Warehouse ID or Data Visualization App ID.
   **/
  private String serviceId = null;

  /**
   * Limit the number of returned rows. If not specified then the recent 20 events will be returned. The maximum is 100.
   **/
  private Integer limit = null;

  /**
   * Provide the result in ascending order, default is descending.
   **/
  private Boolean ascending = false;

  /**
   * Getter for operationId.
   * Filter events based on the operation ID. Either operation ID or service ID is required.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * Filter events based on the operation ID. Either operation ID or service ID is required.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for serviceId.
   * Filter events based on the service ID. It can be Cluster ID, Database Catalog ID, Virtual Warehouse ID or Data Visualization App ID.
   **/
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }

  /**
   * Setter for serviceId.
   * Filter events based on the service ID. It can be Cluster ID, Database Catalog ID, Virtual Warehouse ID or Data Visualization App ID.
   **/
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Getter for limit.
   * Limit the number of returned rows. If not specified then the recent 20 events will be returned. The maximum is 100.
   **/
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  /**
   * Setter for limit.
   * Limit the number of returned rows. If not specified then the recent 20 events will be returned. The maximum is 100.
   **/
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * Getter for ascending.
   * Provide the result in ascending order, default is descending.
   **/
  @JsonProperty("ascending")
  public Boolean getAscending() {
    return ascending;
  }

  /**
   * Setter for ascending.
   * Provide the result in ascending order, default is descending.
   **/
  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEventsRequest listEventsRequest = (ListEventsRequest) o;
    if (!Objects.equals(this.operationId, listEventsRequest.operationId)) {
      return false;
    }
    if (!Objects.equals(this.serviceId, listEventsRequest.serviceId)) {
      return false;
    }
    if (!Objects.equals(this.limit, listEventsRequest.limit)) {
      return false;
    }
    if (!Objects.equals(this.ascending, listEventsRequest.ascending)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, serviceId, limit, ascending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEventsRequest {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
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

