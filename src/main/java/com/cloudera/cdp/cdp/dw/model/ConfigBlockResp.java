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
import com.cloudera.cdp.dw.model.ConfigContentResp;

/**
 * A piece of configuration stored in the same place (e.g. same file or environment variables).
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-12T15:29:01.507-08:00")
public class ConfigBlockResp  {

  /**
   * ID of the ConfigBlock. Unique within an ApplicationConfig.
   **/
  private String id = null;

  /**
   * Format of ConfigBlock.
   **/
  private String format = null;

  /**
   * Contents of a ConfigBlock.
   **/
  private ConfigContentResp content = null;

  /**
   * Getter for id.
   * ID of the ConfigBlock. Unique within an ApplicationConfig.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * ID of the ConfigBlock. Unique within an ApplicationConfig.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for format.
   * Format of ConfigBlock.
   **/
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  /**
   * Setter for format.
   * Format of ConfigBlock.
   **/
  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * Getter for content.
   * Contents of a ConfigBlock.
   **/
  @JsonProperty("content")
  public ConfigContentResp getContent() {
    return content;
  }

  /**
   * Setter for content.
   * Contents of a ConfigBlock.
   **/
  public void setContent(ConfigContentResp content) {
    this.content = content;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigBlockResp configBlockResp = (ConfigBlockResp) o;
    if (!Objects.equals(this.id, configBlockResp.id)) {
      return false;
    }
    if (!Objects.equals(this.format, configBlockResp.format)) {
      return false;
    }
    if (!Objects.equals(this.content, configBlockResp.content)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, format, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigBlockResp {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

