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
 * EKS instance response structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-16T16:58:53.893-07:00")
public class EksInstance  {

  /**
   * Instance ID.
   **/
  private String instanceId = null;

  /**
   * Availability zone.
   **/
  private String availabilityZone = null;

  /**
   * Getter for instanceId.
   * Instance ID.
   **/
  @JsonProperty("instanceId")
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Setter for instanceId.
   * Instance ID.
   **/
  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  /**
   * Getter for availabilityZone.
   * Availability zone.
   **/
  @JsonProperty("availabilityZone")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * Setter for availabilityZone.
   * Availability zone.
   **/
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EksInstance eksInstance = (EksInstance) o;
    if (!Objects.equals(this.instanceId, eksInstance.instanceId)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZone, eksInstance.availabilityZone)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, availabilityZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EksInstance {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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

