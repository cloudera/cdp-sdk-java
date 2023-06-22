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

/**
 * The request for retrieving notifications
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-21T23:16:17.949-07:00")
public class ListNotificationsRequest  {

  /**
   * Timestamp from when to list notifications since
   **/
  private Long timestampAfter = null;

  /**
   * Getter for timestampAfter.
   * Timestamp from when to list notifications since
   **/
  @JsonProperty("timestampAfter")
  public Long getTimestampAfter() {
    return timestampAfter;
  }

  /**
   * Setter for timestampAfter.
   * Timestamp from when to list notifications since
   **/
  public void setTimestampAfter(Long timestampAfter) {
    this.timestampAfter = timestampAfter;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNotificationsRequest listNotificationsRequest = (ListNotificationsRequest) o;
    if (!Objects.equals(this.timestampAfter, listNotificationsRequest.timestampAfter)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNotificationsRequest {\n");
    sb.append("    timestampAfter: ").append(toIndentedString(timestampAfter)).append("\n");
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

