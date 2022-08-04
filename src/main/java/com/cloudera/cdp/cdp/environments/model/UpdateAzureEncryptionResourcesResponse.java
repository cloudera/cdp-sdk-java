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
import com.cloudera.cdp.environments.model.Environment;

/**
 * Response object for a update Azure encryption resources request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-03T22:29:42.201-07:00")
public class UpdateAzureEncryptionResourcesResponse extends CdpResponse {

  /**
   * The environment summary.
   **/
  private Environment environment = null;

  /**
   * Object containing details of encryption parameters for Azure cloud.
   **/
  private AzureResourceEncryptionParameters resourceEncryptionParameters = null;

  /**
   * Getter for environment.
   * The environment summary.
   **/
  @JsonProperty("environment")
  public Environment getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The environment summary.
   **/
  public void setEnvironment(Environment environment) {
    this.environment = environment;
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
    UpdateAzureEncryptionResourcesResponse updateAzureEncryptionResourcesResponse = (UpdateAzureEncryptionResourcesResponse) o;
    if (!Objects.equals(this.environment, updateAzureEncryptionResourcesResponse.environment)) {
      return false;
    }
    if (!Objects.equals(this.resourceEncryptionParameters, updateAzureEncryptionResourcesResponse.resourceEncryptionParameters)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, resourceEncryptionParameters, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAzureEncryptionResourcesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

