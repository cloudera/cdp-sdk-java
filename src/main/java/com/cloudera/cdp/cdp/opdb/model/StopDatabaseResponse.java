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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A response from stopping the database.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-16T15:45:12.822-07:00")
public class StopDatabaseResponse extends CdpResponse {

  /**
   * True if the database stop request accepted
   **/
  private Boolean wasStopped = null;

  /**
   * The status of the database prior to the stop request.
   **/
  private String previousStatus = null;

  /**
   * Getter for wasStopped.
   * True if the database stop request accepted
   **/
  @JsonProperty("wasStopped")
  public Boolean getWasStopped() {
    return wasStopped;
  }

  /**
   * Setter for wasStopped.
   * True if the database stop request accepted
   **/
  public void setWasStopped(Boolean wasStopped) {
    this.wasStopped = wasStopped;
  }

  /**
   * Getter for previousStatus.
   * The status of the database prior to the stop request.
   **/
  @JsonProperty("previousStatus")
  public String getPreviousStatus() {
    return previousStatus;
  }

  /**
   * Setter for previousStatus.
   * The status of the database prior to the stop request.
   **/
  public void setPreviousStatus(String previousStatus) {
    this.previousStatus = previousStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopDatabaseResponse stopDatabaseResponse = (StopDatabaseResponse) o;
    if (!Objects.equals(this.wasStopped, stopDatabaseResponse.wasStopped)) {
      return false;
    }
    if (!Objects.equals(this.previousStatus, stopDatabaseResponse.previousStatus)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(wasStopped, previousStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopDatabaseResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    wasStopped: ").append(toIndentedString(wasStopped)).append("\n");
    sb.append("    previousStatus: ").append(toIndentedString(previousStatus)).append("\n");
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

