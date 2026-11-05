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

package com.cloudera.cdp.publicendpointmanagement.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * ResourceRecords holds a list of values for DNS resource records, such as IP addresses or CNAMEs.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-10-27T19:34:58.374Z")
public class ResourceRecords  {

  /**
   * Values can be IP addresses or CNAMEs.
   **/
  private List<String> values = new ArrayList<String>();

  /**
   * Getter for values.
   * Values can be IP addresses or CNAMEs.
   **/
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }

  /**
   * Setter for values.
   * Values can be IP addresses or CNAMEs.
   **/
  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceRecords resourceRecords = (ResourceRecords) o;
    if (!Objects.equals(this.values, resourceRecords.values)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRecords {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

