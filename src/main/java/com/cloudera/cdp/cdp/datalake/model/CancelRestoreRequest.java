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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Details of the restore that has to be cancelled.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:27.264-07:00")
public class CancelRestoreRequest  {

  /**
   * Restore-id that identifies the restore to be cancelled.
   **/
  private String restoreId = null;

  /**
   * Mark the operation as cancelled regardless of the progress.
   **/
  private Boolean force = false;

  /**
   * Getter for restoreId.
   * Restore-id that identifies the restore to be cancelled.
   **/
  @JsonProperty("restoreId")
  public String getRestoreId() {
    return restoreId;
  }

  /**
   * Setter for restoreId.
   * Restore-id that identifies the restore to be cancelled.
   **/
  public void setRestoreId(String restoreId) {
    this.restoreId = restoreId;
  }

  /**
   * Getter for force.
   * Mark the operation as cancelled regardless of the progress.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Mark the operation as cancelled regardless of the progress.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelRestoreRequest cancelRestoreRequest = (CancelRestoreRequest) o;
    if (!Objects.equals(this.restoreId, cancelRestoreRequest.restoreId)) {
      return false;
    }
    if (!Objects.equals(this.force, cancelRestoreRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(restoreId, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelRestoreRequest {\n");
    sb.append("    restoreId: ").append(toIndentedString(restoreId)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

