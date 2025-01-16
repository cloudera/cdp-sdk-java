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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Nvidia response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:24.261-08:00")
public class CommonNvidiaResp  {

  /**
   * GPU label key.
   **/
  private String gpuLabelKey = null;

  /**
   * GPU label value.
   **/
  private String gpuLabelValue = null;

  /**
   * Getter for gpuLabelKey.
   * GPU label key.
   **/
  @JsonProperty("gpuLabelKey")
  public String getGpuLabelKey() {
    return gpuLabelKey;
  }

  /**
   * Setter for gpuLabelKey.
   * GPU label key.
   **/
  public void setGpuLabelKey(String gpuLabelKey) {
    this.gpuLabelKey = gpuLabelKey;
  }

  /**
   * Getter for gpuLabelValue.
   * GPU label value.
   **/
  @JsonProperty("gpuLabelValue")
  public String getGpuLabelValue() {
    return gpuLabelValue;
  }

  /**
   * Setter for gpuLabelValue.
   * GPU label value.
   **/
  public void setGpuLabelValue(String gpuLabelValue) {
    this.gpuLabelValue = gpuLabelValue;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonNvidiaResp commonNvidiaResp = (CommonNvidiaResp) o;
    if (!Objects.equals(this.gpuLabelKey, commonNvidiaResp.gpuLabelKey)) {
      return false;
    }
    if (!Objects.equals(this.gpuLabelValue, commonNvidiaResp.gpuLabelValue)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpuLabelKey, gpuLabelValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonNvidiaResp {\n");
    sb.append("    gpuLabelKey: ").append(toIndentedString(gpuLabelKey)).append("\n");
    sb.append("    gpuLabelValue: ").append(toIndentedString(gpuLabelValue)).append("\n");
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

