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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.VmTypeResponseWithMetadata;
import java.util.*;

/**
 * Response object from the VM type fetch operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-06T11:00:47.347-08:00")
public class GetVmTypesResponse extends CdpResponse {

  /**
   * The supported VM types based on the given parameters.
   **/
  private List<String> vmTypes = new ArrayList<String>();

  /**
   * The supported VM types based on the given parameters with metadata.
   **/
  private List<VmTypeResponseWithMetadata> vmTypesWithMetadata = new ArrayList<VmTypeResponseWithMetadata>();

  /**
   * Getter for vmTypes.
   * The supported VM types based on the given parameters.
   **/
  @JsonProperty("vmTypes")
  public List<String> getVmTypes() {
    return vmTypes;
  }

  /**
   * Setter for vmTypes.
   * The supported VM types based on the given parameters.
   **/
  public void setVmTypes(List<String> vmTypes) {
    this.vmTypes = vmTypes;
  }

  /**
   * Getter for vmTypesWithMetadata.
   * The supported VM types based on the given parameters with metadata.
   **/
  @JsonProperty("vmTypesWithMetadata")
  public List<VmTypeResponseWithMetadata> getVmTypesWithMetadata() {
    return vmTypesWithMetadata;
  }

  /**
   * Setter for vmTypesWithMetadata.
   * The supported VM types based on the given parameters with metadata.
   **/
  public void setVmTypesWithMetadata(List<VmTypeResponseWithMetadata> vmTypesWithMetadata) {
    this.vmTypesWithMetadata = vmTypesWithMetadata;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetVmTypesResponse getVmTypesResponse = (GetVmTypesResponse) o;
    if (!Objects.equals(this.vmTypes, getVmTypesResponse.vmTypes)) {
      return false;
    }
    if (!Objects.equals(this.vmTypesWithMetadata, getVmTypesResponse.vmTypesWithMetadata)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmTypes, vmTypesWithMetadata, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetVmTypesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vmTypes: ").append(toIndentedString(vmTypes)).append("\n");
    sb.append("    vmTypesWithMetadata: ").append(toIndentedString(vmTypesWithMetadata)).append("\n");
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

