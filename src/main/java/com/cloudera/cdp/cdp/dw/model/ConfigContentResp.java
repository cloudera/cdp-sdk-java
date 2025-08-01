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
import java.util.*;
import java.util.Map;

/**
 * Contents of a ConfigBlock.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class ConfigContentResp  {

  /**
   * Key-value type configurations.
   **/
  private Map<String, String> keyValues = new HashMap<String, String>();

  /**
   * Text type configuration.
   **/
  private String text = null;

  /**
   * JSON type configuration.
   **/
  private String json = null;

  /**
   * Getter for keyValues.
   * Key-value type configurations.
   **/
  @JsonProperty("keyValues")
  public Map<String, String> getKeyValues() {
    return keyValues;
  }

  /**
   * Setter for keyValues.
   * Key-value type configurations.
   **/
  public void setKeyValues(Map<String, String> keyValues) {
    this.keyValues = keyValues;
  }

  /**
   * Getter for text.
   * Text type configuration.
   **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Setter for text.
   * Text type configuration.
   **/
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Getter for json.
   * JSON type configuration.
   **/
  @JsonProperty("json")
  public String getJson() {
    return json;
  }

  /**
   * Setter for json.
   * JSON type configuration.
   **/
  public void setJson(String json) {
    this.json = json;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigContentResp configContentResp = (ConfigContentResp) o;
    if (!Objects.equals(this.keyValues, configContentResp.keyValues)) {
      return false;
    }
    if (!Objects.equals(this.text, configContentResp.text)) {
      return false;
    }
    if (!Objects.equals(this.json, configContentResp.json)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyValues, text, json);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigContentResp {\n");
    sb.append("    keyValues: ").append(toIndentedString(keyValues)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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

