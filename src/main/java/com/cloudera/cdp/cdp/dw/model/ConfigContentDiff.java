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
import com.cloudera.cdp.dw.model.KeyValuesDiff;

/**
 * Difference between two ConfigContents.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-06T10:34:43.431-07:00")
public class ConfigContentDiff  {

  /**
   * Different between keyValues of two ConfigContents.
   **/
  private KeyValuesDiff keyValues = null;

  /**
   * Getter for keyValues.
   * Different between keyValues of two ConfigContents.
   **/
  @JsonProperty("keyValues")
  public KeyValuesDiff getKeyValues() {
    return keyValues;
  }

  /**
   * Setter for keyValues.
   * Different between keyValues of two ConfigContents.
   **/
  public void setKeyValues(KeyValuesDiff keyValues) {
    this.keyValues = keyValues;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigContentDiff configContentDiff = (ConfigContentDiff) o;
    if (!Objects.equals(this.keyValues, configContentDiff.keyValues)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigContentDiff {\n");
    sb.append("    keyValues: ").append(toIndentedString(keyValues)).append("\n");
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
