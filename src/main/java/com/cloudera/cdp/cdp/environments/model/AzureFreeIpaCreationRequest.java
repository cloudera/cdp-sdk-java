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
 * Request object for creating FreeIPA in the environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-07-12T15:09:59.507-07:00")
public class AzureFreeIpaCreationRequest  {

  /**
   * The number of FreeIPA instances to create per group when creating FreeIPA in the environment
   **/
  private Integer instanceCountByGroup = null;

  /**
   * Getter for instanceCountByGroup.
   * The number of FreeIPA instances to create per group when creating FreeIPA in the environment
   **/
  @JsonProperty("instanceCountByGroup")
  public Integer getInstanceCountByGroup() {
    return instanceCountByGroup;
  }

  /**
   * Setter for instanceCountByGroup.
   * The number of FreeIPA instances to create per group when creating FreeIPA in the environment
   **/
  public void setInstanceCountByGroup(Integer instanceCountByGroup) {
    this.instanceCountByGroup = instanceCountByGroup;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureFreeIpaCreationRequest azureFreeIpaCreationRequest = (AzureFreeIpaCreationRequest) o;
    if (!Objects.equals(this.instanceCountByGroup, azureFreeIpaCreationRequest.instanceCountByGroup)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceCountByGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureFreeIpaCreationRequest {\n");
    sb.append("    instanceCountByGroup: ").append(toIndentedString(instanceCountByGroup)).append("\n");
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

