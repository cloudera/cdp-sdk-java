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
import com.cloudera.cdp.dw.model.AllowedInstanceTypesWithDefault;
import java.util.*;

/**
 * Allowed compute instance type values and default compute instance type value.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-09T16:18:22.699-07:00")
public class AllowedInstanceTypes  {

  /**
   * Default value for the compute instance type usage. This setting is Cluster-wide.
   **/
  private List<String> _default = new ArrayList<String>();

  /**
   * Allowed values for the instance type. This setting is Cluster-wide.
   **/
  private List<String> allowed = new ArrayList<String>();

  /**
   * Allowed instance types for Hive Virtual Warehouses.
   **/
  private AllowedInstanceTypesWithDefault hive = null;

  /**
   * Allowed instance types for Impala Virtual Warehouses.
   **/
  private AllowedInstanceTypesWithDefault impala = null;

  /**
   * Allowed instance types for Trino Virtual Warehouses.
   **/
  private AllowedInstanceTypesWithDefault trino = null;

  /**
   * Getter for _default.
   * Default value for the compute instance type usage. This setting is Cluster-wide.
   **/
  @JsonProperty("default")
  public List<String> getDefault() {
    return _default;
  }

  /**
   * Setter for _default.
   * Default value for the compute instance type usage. This setting is Cluster-wide.
   **/
  public void setDefault(List<String> _default) {
    this._default = _default;
  }

  /**
   * Getter for allowed.
   * Allowed values for the instance type. This setting is Cluster-wide.
   **/
  @JsonProperty("allowed")
  public List<String> getAllowed() {
    return allowed;
  }

  /**
   * Setter for allowed.
   * Allowed values for the instance type. This setting is Cluster-wide.
   **/
  public void setAllowed(List<String> allowed) {
    this.allowed = allowed;
  }

  /**
   * Getter for hive.
   * Allowed instance types for Hive Virtual Warehouses.
   **/
  @JsonProperty("hive")
  public AllowedInstanceTypesWithDefault getHive() {
    return hive;
  }

  /**
   * Setter for hive.
   * Allowed instance types for Hive Virtual Warehouses.
   **/
  public void setHive(AllowedInstanceTypesWithDefault hive) {
    this.hive = hive;
  }

  /**
   * Getter for impala.
   * Allowed instance types for Impala Virtual Warehouses.
   **/
  @JsonProperty("impala")
  public AllowedInstanceTypesWithDefault getImpala() {
    return impala;
  }

  /**
   * Setter for impala.
   * Allowed instance types for Impala Virtual Warehouses.
   **/
  public void setImpala(AllowedInstanceTypesWithDefault impala) {
    this.impala = impala;
  }

  /**
   * Getter for trino.
   * Allowed instance types for Trino Virtual Warehouses.
   **/
  @JsonProperty("trino")
  public AllowedInstanceTypesWithDefault getTrino() {
    return trino;
  }

  /**
   * Setter for trino.
   * Allowed instance types for Trino Virtual Warehouses.
   **/
  public void setTrino(AllowedInstanceTypesWithDefault trino) {
    this.trino = trino;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedInstanceTypes allowedInstanceTypes = (AllowedInstanceTypes) o;
    if (!Objects.equals(this._default, allowedInstanceTypes._default)) {
      return false;
    }
    if (!Objects.equals(this.allowed, allowedInstanceTypes.allowed)) {
      return false;
    }
    if (!Objects.equals(this.hive, allowedInstanceTypes.hive)) {
      return false;
    }
    if (!Objects.equals(this.impala, allowedInstanceTypes.impala)) {
      return false;
    }
    if (!Objects.equals(this.trino, allowedInstanceTypes.trino)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, allowed, hive, impala, trino);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedInstanceTypes {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    hive: ").append(toIndentedString(hive)).append("\n");
    sb.append("    impala: ").append(toIndentedString(impala)).append("\n");
    sb.append("    trino: ").append(toIndentedString(trino)).append("\n");
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

