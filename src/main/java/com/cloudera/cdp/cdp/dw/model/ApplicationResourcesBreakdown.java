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
 * Breakdown of the service memory requirements.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:08.472-08:00")
public class ApplicationResourcesBreakdown  {

  /**
   * Java VM configuration for -Xms (initial and minimum heap size).
   **/
  private String xms = null;

  /**
   * Java VM configuration for -Xmx (maximum heap size).
   **/
  private String xmx = null;

  /**
   * DEPRECATED: Java VM configuration for -Xmx (maximum heap size).Java VM overhead for Garbage Collector structures, metaspace, etc., and a safety margin to avoid out-of-memory issues.
   **/
  private String headroom = null;

  /**
   * Java VM configuration for -Xss (thread stack size).
   **/
  private String xss = null;

  /**
   * Java VM configuration for -XX:MaxDirectMemorySize (limit for Direct Byte Buffers).
   **/
  private String maxDirectMemorySize = null;

  /**
   * DEPRECATED: Set the hive.query.isolation.slots.per.node configuration value instead. Overhead buffer for hive.query.isolation.slots.per.node. The total number of concurrent tasks the Hive query executor can process is the sum of the available CPU cores and the value you specify in this field.
   **/
  private Integer waitQueueSize = null;

  /**
   * Getter for xms.
   * Java VM configuration for -Xms (initial and minimum heap size).
   **/
  @JsonProperty("xms")
  public String getXms() {
    return xms;
  }

  /**
   * Setter for xms.
   * Java VM configuration for -Xms (initial and minimum heap size).
   **/
  public void setXms(String xms) {
    this.xms = xms;
  }

  /**
   * Getter for xmx.
   * Java VM configuration for -Xmx (maximum heap size).
   **/
  @JsonProperty("xmx")
  public String getXmx() {
    return xmx;
  }

  /**
   * Setter for xmx.
   * Java VM configuration for -Xmx (maximum heap size).
   **/
  public void setXmx(String xmx) {
    this.xmx = xmx;
  }

  /**
   * Getter for headroom.
   * DEPRECATED: Java VM configuration for -Xmx (maximum heap size).Java VM overhead for Garbage Collector structures, metaspace, etc., and a safety margin to avoid out-of-memory issues.
   **/
  @Deprecated
  @JsonProperty("headroom")
  public String getHeadroom() {
    return headroom;
  }

  /**
   * Setter for headroom.
   * DEPRECATED: Java VM configuration for -Xmx (maximum heap size).Java VM overhead for Garbage Collector structures, metaspace, etc., and a safety margin to avoid out-of-memory issues.
   **/
  @Deprecated
  public void setHeadroom(String headroom) {
    this.headroom = headroom;
  }

  /**
   * Getter for xss.
   * Java VM configuration for -Xss (thread stack size).
   **/
  @JsonProperty("xss")
  public String getXss() {
    return xss;
  }

  /**
   * Setter for xss.
   * Java VM configuration for -Xss (thread stack size).
   **/
  public void setXss(String xss) {
    this.xss = xss;
  }

  /**
   * Getter for maxDirectMemorySize.
   * Java VM configuration for -XX:MaxDirectMemorySize (limit for Direct Byte Buffers).
   **/
  @JsonProperty("maxDirectMemorySize")
  public String getMaxDirectMemorySize() {
    return maxDirectMemorySize;
  }

  /**
   * Setter for maxDirectMemorySize.
   * Java VM configuration for -XX:MaxDirectMemorySize (limit for Direct Byte Buffers).
   **/
  public void setMaxDirectMemorySize(String maxDirectMemorySize) {
    this.maxDirectMemorySize = maxDirectMemorySize;
  }

  /**
   * Getter for waitQueueSize.
   * DEPRECATED: Set the hive.query.isolation.slots.per.node configuration value instead. Overhead buffer for hive.query.isolation.slots.per.node. The total number of concurrent tasks the Hive query executor can process is the sum of the available CPU cores and the value you specify in this field.
   **/
  @Deprecated
  @JsonProperty("waitQueueSize")
  public Integer getWaitQueueSize() {
    return waitQueueSize;
  }

  /**
   * Setter for waitQueueSize.
   * DEPRECATED: Set the hive.query.isolation.slots.per.node configuration value instead. Overhead buffer for hive.query.isolation.slots.per.node. The total number of concurrent tasks the Hive query executor can process is the sum of the available CPU cores and the value you specify in this field.
   **/
  @Deprecated
  public void setWaitQueueSize(Integer waitQueueSize) {
    this.waitQueueSize = waitQueueSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationResourcesBreakdown applicationResourcesBreakdown = (ApplicationResourcesBreakdown) o;
    if (!Objects.equals(this.xms, applicationResourcesBreakdown.xms)) {
      return false;
    }
    if (!Objects.equals(this.xmx, applicationResourcesBreakdown.xmx)) {
      return false;
    }
    if (!Objects.equals(this.headroom, applicationResourcesBreakdown.headroom)) {
      return false;
    }
    if (!Objects.equals(this.xss, applicationResourcesBreakdown.xss)) {
      return false;
    }
    if (!Objects.equals(this.maxDirectMemorySize, applicationResourcesBreakdown.maxDirectMemorySize)) {
      return false;
    }
    if (!Objects.equals(this.waitQueueSize, applicationResourcesBreakdown.waitQueueSize)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(xms, xmx, headroom, xss, maxDirectMemorySize, waitQueueSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationResourcesBreakdown {\n");
    sb.append("    xms: ").append(toIndentedString(xms)).append("\n");
    sb.append("    xmx: ").append(toIndentedString(xmx)).append("\n");
    sb.append("    headroom: ").append(toIndentedString(headroom)).append("\n");
    sb.append("    xss: ").append(toIndentedString(xss)).append("\n");
    sb.append("    maxDirectMemorySize: ").append(toIndentedString(maxDirectMemorySize)).append("\n");
    sb.append("    waitQueueSize: ").append(toIndentedString(waitQueueSize)).append("\n");
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

