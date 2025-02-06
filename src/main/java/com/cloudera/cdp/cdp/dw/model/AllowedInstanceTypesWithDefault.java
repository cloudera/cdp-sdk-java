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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Allowed Virtual Warehouse compute instance types and their defaults.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-06T11:00:48.289-08:00")
public class AllowedInstanceTypesWithDefault  {

  /**
   * Default value for the compute instance type usage. This instance type will be used in the 'create-vw' command's 'instance-type' field in case it has to be customized. The default value also depends on the cloud platform of the Cluster (AWS/Azure).
   **/
  private String _default = null;

  /**
   * Allowed values for the compute instance type usage. One of these values can be used in the 'create-vw' command's 'instance-type' field .
   **/
  private List<String> allowed = new ArrayList<String>();

  /**
   * Getter for _default.
   * Default value for the compute instance type usage. This instance type will be used in the &#39;create-vw&#39; command&#39;s &#39;instance-type&#39; field in case it has to be customized. The default value also depends on the cloud platform of the Cluster (AWS/Azure).
   **/
  @JsonProperty("default")
  public String getDefault() {
    return _default;
  }

  /**
   * Setter for _default.
   * Default value for the compute instance type usage. This instance type will be used in the &#39;create-vw&#39; command&#39;s &#39;instance-type&#39; field in case it has to be customized. The default value also depends on the cloud platform of the Cluster (AWS/Azure).
   **/
  public void setDefault(String _default) {
    this._default = _default;
  }

  /**
   * Getter for allowed.
   * Allowed values for the compute instance type usage. One of these values can be used in the &#39;create-vw&#39; command&#39;s &#39;instance-type&#39; field .
   **/
  @JsonProperty("allowed")
  public List<String> getAllowed() {
    return allowed;
  }

  /**
   * Setter for allowed.
   * Allowed values for the compute instance type usage. One of these values can be used in the &#39;create-vw&#39; command&#39;s &#39;instance-type&#39; field .
   **/
  public void setAllowed(List<String> allowed) {
    this.allowed = allowed;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedInstanceTypesWithDefault allowedInstanceTypesWithDefault = (AllowedInstanceTypesWithDefault) o;
    if (!Objects.equals(this._default, allowedInstanceTypesWithDefault._default)) {
      return false;
    }
    if (!Objects.equals(this.allowed, allowedInstanceTypesWithDefault.allowed)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, allowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedInstanceTypesWithDefault {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
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

