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
 * A metric value
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-05-04T19:25:16.392-07:00")
public class MetricValue  {

  /**
   * The timestamp of this data point
   **/
  private Long timestamp = null;

  /**
   * The value of this data point
   **/
  private Double value = null;

  /**
   * Getter for timestamp.
   * The timestamp of this data point
   **/
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The timestamp of this data point
   **/
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Getter for value.
   * The value of this data point
   **/
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  /**
   * Setter for value.
   * The value of this data point
   **/
  public void setValue(Double value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricValue metricValue = (MetricValue) o;
    if (!Objects.equals(this.timestamp, metricValue.timestamp)) {
      return false;
    }
    if (!Objects.equals(this.value, metricValue.value)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricValue {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

