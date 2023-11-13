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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Difference between two strings.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-11-09T15:08:28.100-08:00")
public class StringDiff  {

  /**
   * The old value.
   **/
  private String from = null;

  /**
   * The new value.
   **/
  private String to = null;

  /**
   * Getter for from.
   * The old value.
   **/
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  /**
   * Setter for from.
   * The old value.
   **/
  public void setFrom(String from) {
    this.from = from;
  }

  /**
   * Getter for to.
   * The new value.
   **/
  @JsonProperty("to")
  public String getTo() {
    return to;
  }

  /**
   * Setter for to.
   * The new value.
   **/
  public void setTo(String to) {
    this.to = to;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringDiff stringDiff = (StringDiff) o;
    if (!Objects.equals(this.from, stringDiff.from)) {
      return false;
    }
    if (!Objects.equals(this.to, stringDiff.to)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringDiff {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

