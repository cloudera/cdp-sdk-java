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
 * The response object for FreeIPA downscale.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-07-13T10:29:22.931-07:00")
public class DownscaleFreeipaResponse extends CdpResponse {

  /**
   * The target FreeIPA availability type.
   **/
  private String originalAvailabilityType = null;

  /**
   * The target FreeIPA availability type.
   **/
  private String targetAvailabilityType = null;

  /**
   * UUID of the request for this operation. This ID can be used to get the status of the operation.
   **/
  private String operationId = null;

  /**
   * Getter for originalAvailabilityType.
   * The target FreeIPA availability type.
   **/
  @JsonProperty("originalAvailabilityType")
  public String getOriginalAvailabilityType() {
    return originalAvailabilityType;
  }

  /**
   * Setter for originalAvailabilityType.
   * The target FreeIPA availability type.
   **/
  public void setOriginalAvailabilityType(String originalAvailabilityType) {
    this.originalAvailabilityType = originalAvailabilityType;
  }

  /**
   * Getter for targetAvailabilityType.
   * The target FreeIPA availability type.
   **/
  @JsonProperty("targetAvailabilityType")
  public String getTargetAvailabilityType() {
    return targetAvailabilityType;
  }

  /**
   * Setter for targetAvailabilityType.
   * The target FreeIPA availability type.
   **/
  public void setTargetAvailabilityType(String targetAvailabilityType) {
    this.targetAvailabilityType = targetAvailabilityType;
  }

  /**
   * Getter for operationId.
   * UUID of the request for this operation. This ID can be used to get the status of the operation.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * UUID of the request for this operation. This ID can be used to get the status of the operation.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownscaleFreeipaResponse downscaleFreeipaResponse = (DownscaleFreeipaResponse) o;
    if (!Objects.equals(this.originalAvailabilityType, downscaleFreeipaResponse.originalAvailabilityType)) {
      return false;
    }
    if (!Objects.equals(this.targetAvailabilityType, downscaleFreeipaResponse.targetAvailabilityType)) {
      return false;
    }
    if (!Objects.equals(this.operationId, downscaleFreeipaResponse.operationId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalAvailabilityType, targetAvailabilityType, operationId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownscaleFreeipaResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    originalAvailabilityType: ").append(toIndentedString(originalAvailabilityType)).append("\n");
    sb.append("    targetAvailabilityType: ").append(toIndentedString(targetAvailabilityType)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

