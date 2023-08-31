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
 * The message object used to display warnings and errors during DRS workflows
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-30T17:23:15.372-07:00")
public class Message  {

  /**
   * The text message of the warning/error.
   **/
  private String text = null;

  /**
   * The time when the warning/error is hit.
   **/
  private String timestamp = null;

  /**
   * The namespace that has the warning/error.
   **/
  private String namespace = null;

  /**
   * Getter for text.
   * The text message of the warning/error.
   **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Setter for text.
   * The text message of the warning/error.
   **/
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Getter for timestamp.
   * The time when the warning/error is hit.
   **/
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The time when the warning/error is hit.
   **/
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Getter for namespace.
   * The namespace that has the warning/error.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace that has the warning/error.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    if (!Objects.equals(this.text, message.text)) {
      return false;
    }
    if (!Objects.equals(this.timestamp, message.timestamp)) {
      return false;
    }
    if (!Objects.equals(this.namespace, message.namespace)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, timestamp, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

