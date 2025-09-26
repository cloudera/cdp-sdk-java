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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.AzureUpgradeOptions;

/**
 * Request for upgrading model registry.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:34.516-07:00")
public class UpgradeModelRegistryRequest  {

  /**
   * The CRN of the model registry to be upgraded.
   **/
  private String crn = null;

  /**
   * If true, opt out of enabling the object store CSI driver integration. CSI driver integration offers increased scalability but requires the \"Storage Account Contributor\" role on Azure.
   **/
  private Boolean disableObjectStoreCsiDriver = null;

  /**
   * AzureUpgradeOptions options for model registry upgrade when using User Defined Routing (UDR).
   **/
  private AzureUpgradeOptions azureOptions = null;

  /**
   * Getter for crn.
   * The CRN of the model registry to be upgraded.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the model registry to be upgraded.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for disableObjectStoreCsiDriver.
   * If true, opt out of enabling the object store CSI driver integration. CSI driver integration offers increased scalability but requires the \&quot;Storage Account Contributor\&quot; role on Azure.
   **/
  @JsonProperty("disableObjectStoreCsiDriver")
  public Boolean getDisableObjectStoreCsiDriver() {
    return disableObjectStoreCsiDriver;
  }

  /**
   * Setter for disableObjectStoreCsiDriver.
   * If true, opt out of enabling the object store CSI driver integration. CSI driver integration offers increased scalability but requires the \&quot;Storage Account Contributor\&quot; role on Azure.
   **/
  public void setDisableObjectStoreCsiDriver(Boolean disableObjectStoreCsiDriver) {
    this.disableObjectStoreCsiDriver = disableObjectStoreCsiDriver;
  }

  /**
   * Getter for azureOptions.
   * AzureUpgradeOptions options for model registry upgrade when using User Defined Routing (UDR).
   **/
  @JsonProperty("azureOptions")
  public AzureUpgradeOptions getAzureOptions() {
    return azureOptions;
  }

  /**
   * Setter for azureOptions.
   * AzureUpgradeOptions options for model registry upgrade when using User Defined Routing (UDR).
   **/
  public void setAzureOptions(AzureUpgradeOptions azureOptions) {
    this.azureOptions = azureOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeModelRegistryRequest upgradeModelRegistryRequest = (UpgradeModelRegistryRequest) o;
    if (!Objects.equals(this.crn, upgradeModelRegistryRequest.crn)) {
      return false;
    }
    if (!Objects.equals(this.disableObjectStoreCsiDriver, upgradeModelRegistryRequest.disableObjectStoreCsiDriver)) {
      return false;
    }
    if (!Objects.equals(this.azureOptions, upgradeModelRegistryRequest.azureOptions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, disableObjectStoreCsiDriver, azureOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeModelRegistryRequest {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    disableObjectStoreCsiDriver: ").append(toIndentedString(disableObjectStoreCsiDriver)).append("\n");
    sb.append("    azureOptions: ").append(toIndentedString(azureOptions)).append("\n");
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

