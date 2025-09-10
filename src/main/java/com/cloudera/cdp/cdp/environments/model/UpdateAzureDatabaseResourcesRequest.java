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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for updating Azure Database resources.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-09T16:18:24.748-07:00")
public class UpdateAzureDatabaseResourcesRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environment = null;

  /**
   * The full Azure resource ID of the existing Private DNS Zone used for Flexible Server and Single Server Databases.
   **/
  private String databasePrivateDnsZoneId = null;

  /**
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  private List<String> flexibleServerSubnetIds = new ArrayList<String>();

  /**
   * Getter for environment.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for databasePrivateDnsZoneId.
   * The full Azure resource ID of the existing Private DNS Zone used for Flexible Server and Single Server Databases.
   **/
  @JsonProperty("databasePrivateDnsZoneId")
  public String getDatabasePrivateDnsZoneId() {
    return databasePrivateDnsZoneId;
  }

  /**
   * Setter for databasePrivateDnsZoneId.
   * The full Azure resource ID of the existing Private DNS Zone used for Flexible Server and Single Server Databases.
   **/
  public void setDatabasePrivateDnsZoneId(String databasePrivateDnsZoneId) {
    this.databasePrivateDnsZoneId = databasePrivateDnsZoneId;
  }

  /**
   * Getter for flexibleServerSubnetIds.
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  @JsonProperty("flexibleServerSubnetIds")
  public List<String> getFlexibleServerSubnetIds() {
    return flexibleServerSubnetIds;
  }

  /**
   * Setter for flexibleServerSubnetIds.
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  public void setFlexibleServerSubnetIds(List<String> flexibleServerSubnetIds) {
    this.flexibleServerSubnetIds = flexibleServerSubnetIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAzureDatabaseResourcesRequest updateAzureDatabaseResourcesRequest = (UpdateAzureDatabaseResourcesRequest) o;
    if (!Objects.equals(this.environment, updateAzureDatabaseResourcesRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.databasePrivateDnsZoneId, updateAzureDatabaseResourcesRequest.databasePrivateDnsZoneId)) {
      return false;
    }
    if (!Objects.equals(this.flexibleServerSubnetIds, updateAzureDatabaseResourcesRequest.flexibleServerSubnetIds)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, databasePrivateDnsZoneId, flexibleServerSubnetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAzureDatabaseResourcesRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    databasePrivateDnsZoneId: ").append(toIndentedString(databasePrivateDnsZoneId)).append("\n");
    sb.append("    flexibleServerSubnetIds: ").append(toIndentedString(flexibleServerSubnetIds)).append("\n");
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

