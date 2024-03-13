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
import com.cloudera.cdp.environments.model.AzureDataServicesParameters;

/**
 * Data Services parameters response of the environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-13T13:08:47.341-07:00")
public class DataServices  {

  /**
   * Azure-specific Data Service parameters response.
   **/
  private AzureDataServicesParameters azure = null;

  /**
   * Getter for azure.
   * Azure-specific Data Service parameters response.
   **/
  @JsonProperty("azure")
  public AzureDataServicesParameters getAzure() {
    return azure;
  }

  /**
   * Setter for azure.
   * Azure-specific Data Service parameters response.
   **/
  public void setAzure(AzureDataServicesParameters azure) {
    this.azure = azure;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataServices dataServices = (DataServices) o;
    if (!Objects.equals(this.azure, dataServices.azure)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(azure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataServices {\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
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

