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

package com.cloudera.cdp.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Request to create batches of audit events for archiving.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-20T12:01:41.059-07:00")
public class BatchEventsForArchivingRequest  {

  /**
   * The beginning timestamp for the search range.
   **/
  private ZonedDateTime fromTimestamp = null;

  /**
   * The ending timestamp for the search range.
   **/
  private ZonedDateTime toTimestamp = null;

  /**
   * Getter for fromTimestamp.
   * The beginning timestamp for the search range.
   **/
  @JsonProperty("fromTimestamp")
  public ZonedDateTime getFromTimestamp() {
    return fromTimestamp;
  }

  /**
   * Setter for fromTimestamp.
   * The beginning timestamp for the search range.
   **/
  public void setFromTimestamp(ZonedDateTime fromTimestamp) {
    this.fromTimestamp = fromTimestamp;
  }

  /**
   * Getter for toTimestamp.
   * The ending timestamp for the search range.
   **/
  @JsonProperty("toTimestamp")
  public ZonedDateTime getToTimestamp() {
    return toTimestamp;
  }

  /**
   * Setter for toTimestamp.
   * The ending timestamp for the search range.
   **/
  public void setToTimestamp(ZonedDateTime toTimestamp) {
    this.toTimestamp = toTimestamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchEventsForArchivingRequest batchEventsForArchivingRequest = (BatchEventsForArchivingRequest) o;
    if (!Objects.equals(this.fromTimestamp, batchEventsForArchivingRequest.fromTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.toTimestamp, batchEventsForArchivingRequest.toTimestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTimestamp, toTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchEventsForArchivingRequest {\n");
    sb.append("    fromTimestamp: ").append(toIndentedString(fromTimestamp)).append("\n");
    sb.append("    toTimestamp: ").append(toIndentedString(toTimestamp)).append("\n");
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

