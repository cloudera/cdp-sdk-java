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
import com.cloudera.cdp.environments.model.AzureResourceEncryptionParameters;

/**
 * Azure specific environment configuration information.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:10.185-07:00")
public class EnvironmentAzureDetails  {

  /**
   * Name of an existing Azure resource group to be used for the environment. If it is not specified then new resource groups will be generated.
   **/
  private String resourceGroupName = null;

  /**
   * Object containing details of encryption parameters for Azure cloud.
   **/
  private AzureResourceEncryptionParameters resourceEncryptionParameters = null;

  /**
   * Getter for resourceGroupName.
   * Name of an existing Azure resource group to be used for the environment. If it is not specified then new resource groups will be generated.
   **/
  @JsonProperty("resourceGroupName")
  public String getResourceGroupName() {
    return resourceGroupName;
  }

  /**
   * Setter for resourceGroupName.
   * Name of an existing Azure resource group to be used for the environment. If it is not specified then new resource groups will be generated.
   **/
  public void setResourceGroupName(String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }

  /**
   * Getter for resourceEncryptionParameters.
   * Object containing details of encryption parameters for Azure cloud.
   **/
  @JsonProperty("resourceEncryptionParameters")
  public AzureResourceEncryptionParameters getResourceEncryptionParameters() {
    return resourceEncryptionParameters;
  }

  /**
   * Setter for resourceEncryptionParameters.
   * Object containing details of encryption parameters for Azure cloud.
   **/
  public void setResourceEncryptionParameters(AzureResourceEncryptionParameters resourceEncryptionParameters) {
    this.resourceEncryptionParameters = resourceEncryptionParameters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentAzureDetails environmentAzureDetails = (EnvironmentAzureDetails) o;
    if (!Objects.equals(this.resourceGroupName, environmentAzureDetails.resourceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.resourceEncryptionParameters, environmentAzureDetails.resourceEncryptionParameters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceGroupName, resourceEncryptionParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentAzureDetails {\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    resourceEncryptionParameters: ").append(toIndentedString(resourceEncryptionParameters)).append("\n");
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

