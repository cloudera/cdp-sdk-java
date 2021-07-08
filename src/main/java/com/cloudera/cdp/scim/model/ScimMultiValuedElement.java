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

package com.cloudera.cdp.scim.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-07T21:20:15.648-07:00")
public class ScimMultiValuedElement  {

  /**
   * 
   **/
  private String type = null;

  /**
   * 
   **/
  private Boolean primary = null;

  /**
   * 
   **/
  private String display = null;

  /**
   * 
   **/
  private String value = null;

  /**
   * 
   **/
  private String ref = null;

  /**
   * Getter for type.
   * 
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * 
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for primary.
   * 
   **/
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }

  /**
   * Setter for primary.
   * 
   **/
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  /**
   * Getter for display.
   * 
   **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  /**
   * Setter for display.
   * 
   **/
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   * Getter for value.
   * 
   **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Setter for value.
   * 
   **/
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Getter for ref.
   * 
   **/
  @JsonProperty("$ref")
  public String getRef() {
    return ref;
  }

  /**
   * Setter for ref.
   * 
   **/
  public void setRef(String ref) {
    this.ref = ref;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimMultiValuedElement scimMultiValuedElement = (ScimMultiValuedElement) o;
    if (!Objects.equals(this.type, scimMultiValuedElement.type)) {
      return false;
    }
    if (!Objects.equals(this.primary, scimMultiValuedElement.primary)) {
      return false;
    }
    if (!Objects.equals(this.display, scimMultiValuedElement.display)) {
      return false;
    }
    if (!Objects.equals(this.value, scimMultiValuedElement.value)) {
      return false;
    }
    if (!Objects.equals(this.ref, scimMultiValuedElement.ref)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, primary, display, value, ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimMultiValuedElement {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

