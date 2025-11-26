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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Get the tags suggested by the Data Compliance Profiler.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:42.264-08:00")
public class GetSuggestedTagsRequest  {

  /**
   * The CRN of the Datalake.
   **/
  private String datalakeCrn = null;

  /**
   * The fully qualified name of the table.
   **/
  private String tableFQN = null;

  /**
   * The fully qualified name of the column.
   **/
  private String columnFQN = null;

  /**
   * Tags suggested by the profiler since this date.
   **/
  private ZonedDateTime profiledSince = null;

  /**
   * Getter for datalakeCrn.
   * The CRN of the Datalake.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Datalake.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for tableFQN.
   * The fully qualified name of the table.
   **/
  @JsonProperty("tableFQN")
  public String getTableFQN() {
    return tableFQN;
  }

  /**
   * Setter for tableFQN.
   * The fully qualified name of the table.
   **/
  public void setTableFQN(String tableFQN) {
    this.tableFQN = tableFQN;
  }

  /**
   * Getter for columnFQN.
   * The fully qualified name of the column.
   **/
  @JsonProperty("columnFQN")
  public String getColumnFQN() {
    return columnFQN;
  }

  /**
   * Setter for columnFQN.
   * The fully qualified name of the column.
   **/
  public void setColumnFQN(String columnFQN) {
    this.columnFQN = columnFQN;
  }

  /**
   * Getter for profiledSince.
   * Tags suggested by the profiler since this date.
   **/
  @JsonProperty("profiledSince")
  public ZonedDateTime getProfiledSince() {
    return profiledSince;
  }

  /**
   * Setter for profiledSince.
   * Tags suggested by the profiler since this date.
   **/
  public void setProfiledSince(ZonedDateTime profiledSince) {
    this.profiledSince = profiledSince;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSuggestedTagsRequest getSuggestedTagsRequest = (GetSuggestedTagsRequest) o;
    if (!Objects.equals(this.datalakeCrn, getSuggestedTagsRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.tableFQN, getSuggestedTagsRequest.tableFQN)) {
      return false;
    }
    if (!Objects.equals(this.columnFQN, getSuggestedTagsRequest.columnFQN)) {
      return false;
    }
    if (!Objects.equals(this.profiledSince, getSuggestedTagsRequest.profiledSince)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, tableFQN, columnFQN, profiledSince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedTagsRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    tableFQN: ").append(toIndentedString(tableFQN)).append("\n");
    sb.append("    columnFQN: ").append(toIndentedString(columnFQN)).append("\n");
    sb.append("    profiledSince: ").append(toIndentedString(profiledSince)).append("\n");
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

