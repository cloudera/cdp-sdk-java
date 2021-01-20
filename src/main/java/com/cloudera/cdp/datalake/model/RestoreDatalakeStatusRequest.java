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
 * Request object to get the status of a restore operation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-01-20T11:27:18.833-08:00")
public class RestoreDatalakeStatusRequest  {

  /**
   * The name of the Data Lake for which the most recent restore status will be retrieved.
   **/
  private String datalakeName = null;

  /**
   * Unique identifier of the restore operation performed.
   **/
  private String restoreId = null;

  /**
   * Getter for datalakeName.
   * The name of the Data Lake for which the most recent restore status will be retrieved.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name of the Data Lake for which the most recent restore status will be retrieved.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for restoreId.
   * Unique identifier of the restore operation performed.
   **/
  @JsonProperty("restoreId")
  public String getRestoreId() {
    return restoreId;
  }

  /**
   * Setter for restoreId.
   * Unique identifier of the restore operation performed.
   **/
  public void setRestoreId(String restoreId) {
    this.restoreId = restoreId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreDatalakeStatusRequest restoreDatalakeStatusRequest = (RestoreDatalakeStatusRequest) o;
    if (!Objects.equals(this.datalakeName, restoreDatalakeStatusRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.restoreId, restoreDatalakeStatusRequest.restoreId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, restoreId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreDatalakeStatusRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    restoreId: ").append(toIndentedString(restoreId)).append("\n");
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

