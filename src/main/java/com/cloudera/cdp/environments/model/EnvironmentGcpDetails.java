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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * GCP specific environment configuration information.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-13T14:18:23.504-07:00")
public class EnvironmentGcpDetails  {

  /**
   * ID of the Google project where the resources are created.
   **/
  private String sharedProjectId = null;

  /**
   * Getter for sharedProjectId.
   * ID of the Google project where the resources are created.
   **/
  @JsonProperty("sharedProjectId")
  public String getSharedProjectId() {
    return sharedProjectId;
  }

  /**
   * Setter for sharedProjectId.
   * ID of the Google project where the resources are created.
   **/
  public void setSharedProjectId(String sharedProjectId) {
    this.sharedProjectId = sharedProjectId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentGcpDetails environmentGcpDetails = (EnvironmentGcpDetails) o;
    if (!Objects.equals(this.sharedProjectId, environmentGcpDetails.sharedProjectId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedProjectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentGcpDetails {\n");
    sb.append("    sharedProjectId: ").append(toIndentedString(sharedProjectId)).append("\n");
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

