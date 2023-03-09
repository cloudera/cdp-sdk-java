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
 * A response from starting the database.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-03-09T11:03:08.636-08:00")
public class StartDatabaseResponse extends CdpResponse {

  /**
   * True if the database start request accepted
   **/
  private Boolean wasStarted = null;

  /**
   * The status of the database prior to the start request.
   **/
  private String previousStatus = null;

  /**
   * Getter for wasStarted.
   * True if the database start request accepted
   **/
  @JsonProperty("wasStarted")
  public Boolean getWasStarted() {
    return wasStarted;
  }

  /**
   * Setter for wasStarted.
   * True if the database start request accepted
   **/
  public void setWasStarted(Boolean wasStarted) {
    this.wasStarted = wasStarted;
  }

  /**
   * Getter for previousStatus.
   * The status of the database prior to the start request.
   **/
  @JsonProperty("previousStatus")
  public String getPreviousStatus() {
    return previousStatus;
  }

  /**
   * Setter for previousStatus.
   * The status of the database prior to the start request.
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
    StartDatabaseResponse startDatabaseResponse = (StartDatabaseResponse) o;
    if (!Objects.equals(this.wasStarted, startDatabaseResponse.wasStarted)) {
      return false;
    }
    if (!Objects.equals(this.previousStatus, startDatabaseResponse.previousStatus)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(wasStarted, previousStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartDatabaseResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    wasStarted: ").append(toIndentedString(wasStarted)).append("\n");
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

