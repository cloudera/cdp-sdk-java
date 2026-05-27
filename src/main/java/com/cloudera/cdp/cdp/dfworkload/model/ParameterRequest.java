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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dfworkload.model.AssetReference;
import java.util.*;

/**
 * Represents a parameter in a parameter group.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:04.223-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ParameterRequest  {

  /**
   * The name of the parameter.
   **/
  private String name = null;

  /**
   * Whether or not the parameter value is sensitive.
   **/
  private Boolean sensitive = null;

  /**
   * A brief explanation of how the parameter is used.
   **/
  private String description = null;

  /**
   * The value of the parameter in this context.
   **/
  private String value = null;

  /**
   * The list of asset references. Required if this parameter is a FILE or FILES type.
   **/
  private List<AssetReference> assetReferences = new ArrayList<AssetReference>();

  /**
   * Getter for name.
   * The name of the parameter.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the parameter.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for sensitive.
   * Whether or not the parameter value is sensitive.
   **/
  @JsonProperty("sensitive")
  public Boolean getSensitive() {
    return sensitive;
  }

  /**
   * Setter for sensitive.
   * Whether or not the parameter value is sensitive.
   **/
  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  /**
   * Getter for description.
   * A brief explanation of how the parameter is used.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * A brief explanation of how the parameter is used.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for value.
   * The value of the parameter in this context.
   **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Setter for value.
   * The value of the parameter in this context.
   **/
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Getter for assetReferences.
   * The list of asset references. Required if this parameter is a FILE or FILES type.
   **/
  @JsonProperty("assetReferences")
  public List<AssetReference> getAssetReferences() {
    return assetReferences;
  }

  /**
   * Setter for assetReferences.
   * The list of asset references. Required if this parameter is a FILE or FILES type.
   **/
  public void setAssetReferences(List<AssetReference> assetReferences) {
    this.assetReferences = assetReferences;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterRequest parameterRequest = (ParameterRequest) o;
    if (!Objects.equals(this.name, parameterRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.sensitive, parameterRequest.sensitive)) {
      return false;
    }
    if (!Objects.equals(this.description, parameterRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.value, parameterRequest.value)) {
      return false;
    }
    if (!Objects.equals(this.assetReferences, parameterRequest.assetReferences)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sensitive, description, value, assetReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    assetReferences: ").append(toIndentedString(assetReferences)).append("\n");
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

