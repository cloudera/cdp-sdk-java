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
 * Set values for a configuration file of a service.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-12T15:07:42.845-07:00")
public class ConfigBlock  {

  /**
   * Configuration file to update.
   **/
  private String configFile = null;

  /**
   * Set values for key-value format configuration file e.g. ENV, PROPERTIES, FLAGFILE, HADOOP_XML typed file.
   **/
  private Map<String, String> keyValue = new HashMap<String, String>();

  /**
   * Set values for text format configuration file e.g. TEXT, JSON, YAML, XML typed file.
   **/
  private String content = null;

  /**
   * Getter for configFile.
   * Configuration file to update.
   **/
  @JsonProperty("configFile")
  public String getConfigFile() {
    return configFile;
  }

  /**
   * Setter for configFile.
   * Configuration file to update.
   **/
  public void setConfigFile(String configFile) {
    this.configFile = configFile;
  }

  /**
   * Getter for keyValue.
   * Set values for key-value format configuration file e.g. ENV, PROPERTIES, FLAGFILE, HADOOP_XML typed file.
   **/
  @JsonProperty("keyValue")
  public Map<String, String> getKeyValue() {
    return keyValue;
  }

  /**
   * Setter for keyValue.
   * Set values for key-value format configuration file e.g. ENV, PROPERTIES, FLAGFILE, HADOOP_XML typed file.
   **/
  public void setKeyValue(Map<String, String> keyValue) {
    this.keyValue = keyValue;
  }

  /**
   * Getter for content.
   * Set values for text format configuration file e.g. TEXT, JSON, YAML, XML typed file.
   **/
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  /**
   * Setter for content.
   * Set values for text format configuration file e.g. TEXT, JSON, YAML, XML typed file.
   **/
  public void setContent(String content) {
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
    ConfigBlock configBlock = (ConfigBlock) o;
    if (!Objects.equals(this.configFile, configBlock.configFile)) {
      return false;
    }
    if (!Objects.equals(this.keyValue, configBlock.keyValue)) {
      return false;
    }
    if (!Objects.equals(this.content, configBlock.content)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configFile, keyValue, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigBlock {\n");
    sb.append("    configFile: ").append(toIndentedString(configFile)).append("\n");
    sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
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

