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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Accelerator, i.e. GPU configurations.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:42.881-07:00")
public class AcceleratorResponse extends CdpResponse {

  /**
   * The GPU type.
   **/
  private String type = null;

  /**
   * The GPU count.
   **/
  private Long count = null;

  /**
   * Getter for type.
   * The GPU type.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The GPU type.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for count.
   * The GPU count.
   **/
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }

  /**
   * Setter for count.
   * The GPU count.
   **/
  public void setCount(Long count) {
    this.count = count;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceleratorResponse acceleratorResponse = (AcceleratorResponse) o;
    if (!Objects.equals(this.type, acceleratorResponse.type)) {
      return false;
    }
    if (!Objects.equals(this.count, acceleratorResponse.count)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, count, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceleratorResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

