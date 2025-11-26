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
import com.cloudera.cdp.environments.model.LastAutomatedSyncDetails;

/**
 * Response object for getting automated sync environment status.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:43.397-08:00")
public class GetAutomatedSyncEnvironmentStatusResponse extends CdpResponse {

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The state to indicate whether the environment is synced or has a sync pending.
   **/
  private String syncPendingState = null;

  /**
   * Status of the last automated sync operation for the environment.
   **/
  private LastAutomatedSyncDetails lastSyncStatus = null;

  /**
   * Getter for environmentCrn.
   * The CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for syncPendingState.
   * The state to indicate whether the environment is synced or has a sync pending.
   **/
  @JsonProperty("syncPendingState")
  public String getSyncPendingState() {
    return syncPendingState;
  }

  /**
   * Setter for syncPendingState.
   * The state to indicate whether the environment is synced or has a sync pending.
   **/
  public void setSyncPendingState(String syncPendingState) {
    this.syncPendingState = syncPendingState;
  }

  /**
   * Getter for lastSyncStatus.
   * Status of the last automated sync operation for the environment.
   **/
  @JsonProperty("lastSyncStatus")
  public LastAutomatedSyncDetails getLastSyncStatus() {
    return lastSyncStatus;
  }

  /**
   * Setter for lastSyncStatus.
   * Status of the last automated sync operation for the environment.
   **/
  public void setLastSyncStatus(LastAutomatedSyncDetails lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAutomatedSyncEnvironmentStatusResponse getAutomatedSyncEnvironmentStatusResponse = (GetAutomatedSyncEnvironmentStatusResponse) o;
    if (!Objects.equals(this.environmentCrn, getAutomatedSyncEnvironmentStatusResponse.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.syncPendingState, getAutomatedSyncEnvironmentStatusResponse.syncPendingState)) {
      return false;
    }
    if (!Objects.equals(this.lastSyncStatus, getAutomatedSyncEnvironmentStatusResponse.lastSyncStatus)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, syncPendingState, lastSyncStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAutomatedSyncEnvironmentStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    syncPendingState: ").append(toIndentedString(syncPendingState)).append("\n");
    sb.append("    lastSyncStatus: ").append(toIndentedString(lastSyncStatus)).append("\n");
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

