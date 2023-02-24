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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Custom key/value configurations.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-22T17:07:48.516-08:00")
public class CustomConfigs  {

  /**
   * Name.
   **/
  private String name = null;

  /**
   * Value.
   **/
  private String value = null;

  /**
   * Whether the value is confidential.
   **/
  private Boolean confidential = null;

  /**
   * Getter for name.
   * Name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for value.
   * Value.
   **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Setter for value.
   * Value.
   **/
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Getter for confidential.
   * Whether the value is confidential.
   **/
  @JsonProperty("confidential")
  public Boolean getConfidential() {
    return confidential;
  }

  /**
   * Setter for confidential.
   * Whether the value is confidential.
   **/
  public void setConfidential(Boolean confidential) {
    this.confidential = confidential;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomConfigs customConfigs = (CustomConfigs) o;
    if (!Objects.equals(this.name, customConfigs.name)) {
      return false;
    }
    if (!Objects.equals(this.value, customConfigs.value)) {
      return false;
    }
    if (!Objects.equals(this.confidential, customConfigs.confidential)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, confidential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomConfigs {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    confidential: ").append(toIndentedString(confidential)).append("\n");
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

