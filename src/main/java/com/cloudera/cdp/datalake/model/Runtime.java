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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * An advertised datalake runtime version.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-11-17T16:25:35.720-08:00")
public class Runtime  {

  /**
   * The actual version number.
   **/
  private String runtimeVersion = null;

  /**
   * Whether it is a default runtime version or not.
   **/
  private Boolean defaultRuntimeVersion = null;

  /**
   * Getter for runtimeVersion.
   * The actual version number.
   **/
  @JsonProperty("runtimeVersion")
  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * Setter for runtimeVersion.
   * The actual version number.
   **/
  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }

  /**
   * Getter for defaultRuntimeVersion.
   * Whether it is a default runtime version or not.
   **/
  @JsonProperty("defaultRuntimeVersion")
  public Boolean getDefaultRuntimeVersion() {
    return defaultRuntimeVersion;
  }

  /**
   * Setter for defaultRuntimeVersion.
   * Whether it is a default runtime version or not.
   **/
  public void setDefaultRuntimeVersion(Boolean defaultRuntimeVersion) {
    this.defaultRuntimeVersion = defaultRuntimeVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Runtime runtime = (Runtime) o;
    if (!Objects.equals(this.runtimeVersion, runtime.runtimeVersion)) {
      return false;
    }
    if (!Objects.equals(this.defaultRuntimeVersion, runtime.defaultRuntimeVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(runtimeVersion, defaultRuntimeVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Runtime {\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
    sb.append("    defaultRuntimeVersion: ").append(toIndentedString(defaultRuntimeVersion)).append("\n");
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

