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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.CustomDatabaseComputeStorage;
import com.cloudera.cdp.datalake.model.CustomInstanceDisk;
import com.cloudera.cdp.datalake.model.CustomInstanceType;
import java.util.*;

/**
 * Datalake resize request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:45.749-07:00")
public class ResizeDatalakeRequest  {

  /**
   * The name or CRN of the datalake.
   **/
  private String datalakeName = null;

  /**
   * The target size for the datalake. The resize target size can be MEDIUM_DUTY or ENTERPRISE. If the runtime version >= 7.2.17 target size is ENTERPRISE. If not, the target size is MEDIUM_DUTY.
   **/
  private String targetSize = null;

  /**
   * Whether to deploy a new datalake in a multi-availability zone way.
   **/
  private Boolean multiAz = false;

  /**
   * Any custom instance type to override defaults.
   **/
  private List<CustomInstanceType> customInstanceTypes = new ArrayList<CustomInstanceType>();

  /**
   * Any custom instance disk size to override defaults.
   **/
  private List<CustomInstanceDisk> customInstanceDisks = new ArrayList<CustomInstanceDisk>();

  /**
   * Any custom database properties to override defaults.
   **/
  private CustomDatabaseComputeStorage customDatabaseComputeStorage = null;

  /**
   * Skips the validation steps that run prior to the resize. If this option is not provided, the validations are performed by default. If skip-validation and validation-only are used together an error is thrown.
   **/
  private Boolean skipValidation = null;

  /**
   * Runs only the validation steps and then returns. If this option is not provided, the resize is performed as normal by default. If skip-validation and validation-only are used together an error is thrown.
   **/
  private Boolean validationOnly = null;

  /**
   * Getter for datalakeName.
   * The name or CRN of the datalake.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name or CRN of the datalake.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for targetSize.
   * The target size for the datalake. The resize target size can be MEDIUM_DUTY or ENTERPRISE. If the runtime version &gt;&#x3D; 7.2.17 target size is ENTERPRISE. If not, the target size is MEDIUM_DUTY.
   **/
  @JsonProperty("targetSize")
  public String getTargetSize() {
    return targetSize;
  }

  /**
   * Setter for targetSize.
   * The target size for the datalake. The resize target size can be MEDIUM_DUTY or ENTERPRISE. If the runtime version &gt;&#x3D; 7.2.17 target size is ENTERPRISE. If not, the target size is MEDIUM_DUTY.
   **/
  public void setTargetSize(String targetSize) {
    this.targetSize = targetSize;
  }

  /**
   * Getter for multiAz.
   * Whether to deploy a new datalake in a multi-availability zone way.
   **/
  @JsonProperty("multiAz")
  public Boolean getMultiAz() {
    return multiAz;
  }

  /**
   * Setter for multiAz.
   * Whether to deploy a new datalake in a multi-availability zone way.
   **/
  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }

  /**
   * Getter for customInstanceTypes.
   * Any custom instance type to override defaults.
   **/
  @JsonProperty("customInstanceTypes")
  public List<CustomInstanceType> getCustomInstanceTypes() {
    return customInstanceTypes;
  }

  /**
   * Setter for customInstanceTypes.
   * Any custom instance type to override defaults.
   **/
  public void setCustomInstanceTypes(List<CustomInstanceType> customInstanceTypes) {
    this.customInstanceTypes = customInstanceTypes;
  }

  /**
   * Getter for customInstanceDisks.
   * Any custom instance disk size to override defaults.
   **/
  @JsonProperty("customInstanceDisks")
  public List<CustomInstanceDisk> getCustomInstanceDisks() {
    return customInstanceDisks;
  }

  /**
   * Setter for customInstanceDisks.
   * Any custom instance disk size to override defaults.
   **/
  public void setCustomInstanceDisks(List<CustomInstanceDisk> customInstanceDisks) {
    this.customInstanceDisks = customInstanceDisks;
  }

  /**
   * Getter for customDatabaseComputeStorage.
   * Any custom database properties to override defaults.
   **/
  @JsonProperty("customDatabaseComputeStorage")
  public CustomDatabaseComputeStorage getCustomDatabaseComputeStorage() {
    return customDatabaseComputeStorage;
  }

  /**
   * Setter for customDatabaseComputeStorage.
   * Any custom database properties to override defaults.
   **/
  public void setCustomDatabaseComputeStorage(CustomDatabaseComputeStorage customDatabaseComputeStorage) {
    this.customDatabaseComputeStorage = customDatabaseComputeStorage;
  }

  /**
   * Getter for skipValidation.
   * Skips the validation steps that run prior to the resize. If this option is not provided, the validations are performed by default. If skip-validation and validation-only are used together an error is thrown.
   **/
  @JsonProperty("skipValidation")
  public Boolean getSkipValidation() {
    return skipValidation;
  }

  /**
   * Setter for skipValidation.
   * Skips the validation steps that run prior to the resize. If this option is not provided, the validations are performed by default. If skip-validation and validation-only are used together an error is thrown.
   **/
  public void setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
  }

  /**
   * Getter for validationOnly.
   * Runs only the validation steps and then returns. If this option is not provided, the resize is performed as normal by default. If skip-validation and validation-only are used together an error is thrown.
   **/
  @JsonProperty("validationOnly")
  public Boolean getValidationOnly() {
    return validationOnly;
  }

  /**
   * Setter for validationOnly.
   * Runs only the validation steps and then returns. If this option is not provided, the resize is performed as normal by default. If skip-validation and validation-only are used together an error is thrown.
   **/
  public void setValidationOnly(Boolean validationOnly) {
    this.validationOnly = validationOnly;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResizeDatalakeRequest resizeDatalakeRequest = (ResizeDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, resizeDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.targetSize, resizeDatalakeRequest.targetSize)) {
      return false;
    }
    if (!Objects.equals(this.multiAz, resizeDatalakeRequest.multiAz)) {
      return false;
    }
    if (!Objects.equals(this.customInstanceTypes, resizeDatalakeRequest.customInstanceTypes)) {
      return false;
    }
    if (!Objects.equals(this.customInstanceDisks, resizeDatalakeRequest.customInstanceDisks)) {
      return false;
    }
    if (!Objects.equals(this.customDatabaseComputeStorage, resizeDatalakeRequest.customDatabaseComputeStorage)) {
      return false;
    }
    if (!Objects.equals(this.skipValidation, resizeDatalakeRequest.skipValidation)) {
      return false;
    }
    if (!Objects.equals(this.validationOnly, resizeDatalakeRequest.validationOnly)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, targetSize, multiAz, customInstanceTypes, customInstanceDisks, customDatabaseComputeStorage, skipValidation, validationOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResizeDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    targetSize: ").append(toIndentedString(targetSize)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
    sb.append("    customInstanceTypes: ").append(toIndentedString(customInstanceTypes)).append("\n");
    sb.append("    customInstanceDisks: ").append(toIndentedString(customInstanceDisks)).append("\n");
    sb.append("    customDatabaseComputeStorage: ").append(toIndentedString(customDatabaseComputeStorage)).append("\n");
    sb.append("    skipValidation: ").append(toIndentedString(skipValidation)).append("\n");
    sb.append("    validationOnly: ").append(toIndentedString(validationOnly)).append("\n");
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

