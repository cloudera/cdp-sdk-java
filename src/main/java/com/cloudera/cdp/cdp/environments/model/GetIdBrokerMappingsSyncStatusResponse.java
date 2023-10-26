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
import com.cloudera.cdp.environments.model.IdBrokerSyncStatus;
import java.util.*;
import java.util.Map;

/**
 * Response object for getting ID Broker mappings sync status.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-25T14:07:13.279-07:00")
public class GetIdBrokerMappingsSyncStatusResponse extends CdpResponse {

  /**
   * Whether a sync is needed to bring in-cluster mappings up-to-date.
   **/
  private Boolean syncNeeded = null;

  /**
   * The overall mappings sync status for all datalake clusters in the environment.
   **/
  private String globalStatus = null;

  /**
   * Map of datalake cluster CRN to mappings sync status for each datalake cluster in the environment.
   **/
  private Map<String, IdBrokerSyncStatus> statuses = new HashMap<String, IdBrokerSyncStatus>();

  /**
   * Getter for syncNeeded.
   * Whether a sync is needed to bring in-cluster mappings up-to-date.
   **/
  @JsonProperty("syncNeeded")
  public Boolean getSyncNeeded() {
    return syncNeeded;
  }

  /**
   * Setter for syncNeeded.
   * Whether a sync is needed to bring in-cluster mappings up-to-date.
   **/
  public void setSyncNeeded(Boolean syncNeeded) {
    this.syncNeeded = syncNeeded;
  }

  /**
   * Getter for globalStatus.
   * The overall mappings sync status for all datalake clusters in the environment.
   **/
  @JsonProperty("globalStatus")
  public String getGlobalStatus() {
    return globalStatus;
  }

  /**
   * Setter for globalStatus.
   * The overall mappings sync status for all datalake clusters in the environment.
   **/
  public void setGlobalStatus(String globalStatus) {
    this.globalStatus = globalStatus;
  }

  /**
   * Getter for statuses.
   * Map of datalake cluster CRN to mappings sync status for each datalake cluster in the environment.
   **/
  @JsonProperty("statuses")
  public Map<String, IdBrokerSyncStatus> getStatuses() {
    return statuses;
  }

  /**
   * Setter for statuses.
   * Map of datalake cluster CRN to mappings sync status for each datalake cluster in the environment.
   **/
  public void setStatuses(Map<String, IdBrokerSyncStatus> statuses) {
    this.statuses = statuses;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIdBrokerMappingsSyncStatusResponse getIdBrokerMappingsSyncStatusResponse = (GetIdBrokerMappingsSyncStatusResponse) o;
    if (!Objects.equals(this.syncNeeded, getIdBrokerMappingsSyncStatusResponse.syncNeeded)) {
      return false;
    }
    if (!Objects.equals(this.globalStatus, getIdBrokerMappingsSyncStatusResponse.globalStatus)) {
      return false;
    }
    if (!Objects.equals(this.statuses, getIdBrokerMappingsSyncStatusResponse.statuses)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncNeeded, globalStatus, statuses, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIdBrokerMappingsSyncStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    syncNeeded: ").append(toIndentedString(syncNeeded)).append("\n");
    sb.append("    globalStatus: ").append(toIndentedString(globalStatus)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

