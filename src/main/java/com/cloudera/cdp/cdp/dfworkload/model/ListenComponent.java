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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Provides subset of metadata of a Listen* component
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-01T14:27:22.850-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ListenComponent  {

  /**
   * Inbound protocol
   **/
  private String protocol = null;

  /**
   * Listen component type
   **/
  private String listenComponentType = null;

  /**
   * Inbound port
   **/
  private String port = null;

  /**
   * Getter for protocol.
   * Inbound protocol
   **/
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  /**
   * Setter for protocol.
   * Inbound protocol
   **/
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  /**
   * Getter for listenComponentType.
   * Listen component type
   **/
  @JsonProperty("listenComponentType")
  public String getListenComponentType() {
    return listenComponentType;
  }

  /**
   * Setter for listenComponentType.
   * Listen component type
   **/
  public void setListenComponentType(String listenComponentType) {
    this.listenComponentType = listenComponentType;
  }

  /**
   * Getter for port.
   * Inbound port
   **/
  @JsonProperty("port")
  public String getPort() {
    return port;
  }

  /**
   * Setter for port.
   * Inbound port
   **/
  public void setPort(String port) {
    this.port = port;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListenComponent listenComponent = (ListenComponent) o;
    if (!Objects.equals(this.protocol, listenComponent.protocol)) {
      return false;
    }
    if (!Objects.equals(this.listenComponentType, listenComponent.listenComponentType)) {
      return false;
    }
    if (!Objects.equals(this.port, listenComponent.port)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, listenComponentType, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenComponent {\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    listenComponentType: ").append(toIndentedString(listenComponentType)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

