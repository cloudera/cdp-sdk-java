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
 * Request object for the DescribeReadyflow method
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:44.473-07:00")
public class DescribeReadyflowRequest  {

  /**
   * The ready flow CRN
   **/
  private String readyflowCrn = null;

  /**
   * Getter for readyflowCrn.
   * The ready flow CRN
   **/
  @JsonProperty("readyflowCrn")
  public String getReadyflowCrn() {
    return readyflowCrn;
  }

  /**
   * Setter for readyflowCrn.
   * The ready flow CRN
   **/
  public void setReadyflowCrn(String readyflowCrn) {
    this.readyflowCrn = readyflowCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeReadyflowRequest describeReadyflowRequest = (DescribeReadyflowRequest) o;
    if (!Objects.equals(this.readyflowCrn, describeReadyflowRequest.readyflowCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(readyflowCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeReadyflowRequest {\n");
    sb.append("    readyflowCrn: ").append(toIndentedString(readyflowCrn)).append("\n");
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

