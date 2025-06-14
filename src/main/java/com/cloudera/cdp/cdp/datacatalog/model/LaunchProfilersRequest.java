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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Launch Profilers request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:26.716-07:00")
public class LaunchProfilersRequest  {

  /**
   * The CRN of the Datalake.
   **/
  private String datalake = null;

  /**
   * Enables High Availability (HA) for datacatalog profilers (default value is false). The High Availability (HA) Profiler cluster provides failure resilience and scalability but incurs additional cost.
   **/
  private Boolean enableHA = null;

  /**
   * Getter for datalake.
   * The CRN of the Datalake.
   **/
  @JsonProperty("datalake")
  public String getDatalake() {
    return datalake;
  }

  /**
   * Setter for datalake.
   * The CRN of the Datalake.
   **/
  public void setDatalake(String datalake) {
    this.datalake = datalake;
  }

  /**
   * Getter for enableHA.
   * Enables High Availability (HA) for datacatalog profilers (default value is false). The High Availability (HA) Profiler cluster provides failure resilience and scalability but incurs additional cost.
   **/
  @JsonProperty("enableHA")
  public Boolean getEnableHA() {
    return enableHA;
  }

  /**
   * Setter for enableHA.
   * Enables High Availability (HA) for datacatalog profilers (default value is false). The High Availability (HA) Profiler cluster provides failure resilience and scalability but incurs additional cost.
   **/
  public void setEnableHA(Boolean enableHA) {
    this.enableHA = enableHA;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchProfilersRequest launchProfilersRequest = (LaunchProfilersRequest) o;
    if (!Objects.equals(this.datalake, launchProfilersRequest.datalake)) {
      return false;
    }
    if (!Objects.equals(this.enableHA, launchProfilersRequest.enableHA)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalake, enableHA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchProfilersRequest {\n");
    sb.append("    datalake: ").append(toIndentedString(datalake)).append("\n");
    sb.append("    enableHA: ").append(toIndentedString(enableHA)).append("\n");
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

