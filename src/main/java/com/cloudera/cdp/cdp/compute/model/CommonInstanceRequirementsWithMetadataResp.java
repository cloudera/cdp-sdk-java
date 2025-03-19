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
import com.cloudera.cdp.compute.model.CommonInstanceRequirementsResp;
import java.util.*;

/**
 * Instance requirements with metadata response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:31.556-07:00")
public class CommonInstanceRequirementsWithMetadataResp  {

  /**
   * The architecture types. For eg, i386, x86_64, arm64, x86_64_mac, arm64_mac.
   **/
  private List<String> architectureTypes = new ArrayList<String>();

  /**
   * The virtualization types. For eg. hvm, paravirtual.
   **/
  private List<String> virtualizationTypes = new ArrayList<String>();

  /**
   * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with those attributes.
   **/
  private CommonInstanceRequirementsResp instanceRequirements = null;

  /**
   * Getter for architectureTypes.
   * The architecture types. For eg, i386, x86_64, arm64, x86_64_mac, arm64_mac.
   **/
  @JsonProperty("architectureTypes")
  public List<String> getArchitectureTypes() {
    return architectureTypes;
  }

  /**
   * Setter for architectureTypes.
   * The architecture types. For eg, i386, x86_64, arm64, x86_64_mac, arm64_mac.
   **/
  public void setArchitectureTypes(List<String> architectureTypes) {
    this.architectureTypes = architectureTypes;
  }

  /**
   * Getter for virtualizationTypes.
   * The virtualization types. For eg. hvm, paravirtual.
   **/
  @JsonProperty("virtualizationTypes")
  public List<String> getVirtualizationTypes() {
    return virtualizationTypes;
  }

  /**
   * Setter for virtualizationTypes.
   * The virtualization types. For eg. hvm, paravirtual.
   **/
  public void setVirtualizationTypes(List<String> virtualizationTypes) {
    this.virtualizationTypes = virtualizationTypes;
  }

  /**
   * Getter for instanceRequirements.
   * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with those attributes.
   **/
  @JsonProperty("instanceRequirements")
  public CommonInstanceRequirementsResp getInstanceRequirements() {
    return instanceRequirements;
  }

  /**
   * Setter for instanceRequirements.
   * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with those attributes.
   **/
  public void setInstanceRequirements(CommonInstanceRequirementsResp instanceRequirements) {
    this.instanceRequirements = instanceRequirements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonInstanceRequirementsWithMetadataResp commonInstanceRequirementsWithMetadataResp = (CommonInstanceRequirementsWithMetadataResp) o;
    if (!Objects.equals(this.architectureTypes, commonInstanceRequirementsWithMetadataResp.architectureTypes)) {
      return false;
    }
    if (!Objects.equals(this.virtualizationTypes, commonInstanceRequirementsWithMetadataResp.virtualizationTypes)) {
      return false;
    }
    if (!Objects.equals(this.instanceRequirements, commonInstanceRequirementsWithMetadataResp.instanceRequirements)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(architectureTypes, virtualizationTypes, instanceRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonInstanceRequirementsWithMetadataResp {\n");
    sb.append("    architectureTypes: ").append(toIndentedString(architectureTypes)).append("\n");
    sb.append("    virtualizationTypes: ").append(toIndentedString(virtualizationTypes)).append("\n");
    sb.append("    instanceRequirements: ").append(toIndentedString(instanceRequirements)).append("\n");
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

