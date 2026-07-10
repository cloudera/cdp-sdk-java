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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * The paused details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class PausedDetails  {

  /**
   * The paused time in ISO format.
   **/
  private String pausedSince = null;

  /**
   * The list containing the reasons for table getting paused.
   **/
  private List<String> reasons = new ArrayList<String>();

  /**
   * Getter for pausedSince.
   * The paused time in ISO format.
   **/
  @JsonProperty("pausedSince")
  public String getPausedSince() {
    return pausedSince;
  }

  /**
   * Setter for pausedSince.
   * The paused time in ISO format.
   **/
  public void setPausedSince(String pausedSince) {
    this.pausedSince = pausedSince;
  }

  /**
   * Getter for reasons.
   * The list containing the reasons for table getting paused.
   **/
  @JsonProperty("reasons")
  public List<String> getReasons() {
    return reasons;
  }

  /**
   * Setter for reasons.
   * The list containing the reasons for table getting paused.
   **/
  public void setReasons(List<String> reasons) {
    this.reasons = reasons;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PausedDetails pausedDetails = (PausedDetails) o;
    if (!Objects.equals(this.pausedSince, pausedDetails.pausedSince)) {
      return false;
    }
    if (!Objects.equals(this.reasons, pausedDetails.reasons)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pausedSince, reasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PausedDetails {\n");
    sb.append("    pausedSince: ").append(toIndentedString(pausedSince)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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

