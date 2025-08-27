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
 * Request object to enable or disable automatic acceptance of Azure Marketplace image terms.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:29.563-07:00")
public class UpdateAzureImageTermsPolicyRequest  {

  /**
   * Flag to enable or disable automatic acceptance of Azure Marketplace image terms.
   **/
  private Boolean accepted = null;

  /**
   * Getter for accepted.
   * Flag to enable or disable automatic acceptance of Azure Marketplace image terms.
   **/
  @JsonProperty("accepted")
  public Boolean getAccepted() {
    return accepted;
  }

  /**
   * Setter for accepted.
   * Flag to enable or disable automatic acceptance of Azure Marketplace image terms.
   **/
  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAzureImageTermsPolicyRequest updateAzureImageTermsPolicyRequest = (UpdateAzureImageTermsPolicyRequest) o;
    if (!Objects.equals(this.accepted, updateAzureImageTermsPolicyRequest.accepted)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAzureImageTermsPolicyRequest {\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
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

