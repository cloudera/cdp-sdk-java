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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A filter option
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-11-09T15:08:30.599-08:00")
public class FilterOption  {

  /**
   * The filter identifier
   **/
  private String identifier = null;

  /**
   * The filter label
   **/
  private String label = null;

  /**
   * The icon class
   **/
  private String iconClass = null;

  /**
   * Getter for identifier.
   * The filter identifier
   **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Setter for identifier.
   * The filter identifier
   **/
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  /**
   * Getter for label.
   * The filter label
   **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   * Setter for label.
   * The filter label
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Getter for iconClass.
   * The icon class
   **/
  @JsonProperty("iconClass")
  public String getIconClass() {
    return iconClass;
  }

  /**
   * Setter for iconClass.
   * The icon class
   **/
  public void setIconClass(String iconClass) {
    this.iconClass = iconClass;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterOption filterOption = (FilterOption) o;
    if (!Objects.equals(this.identifier, filterOption.identifier)) {
      return false;
    }
    if (!Objects.equals(this.label, filterOption.label)) {
      return false;
    }
    if (!Objects.equals(this.iconClass, filterOption.iconClass)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, label, iconClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterOption {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    iconClass: ").append(toIndentedString(iconClass)).append("\n");
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

