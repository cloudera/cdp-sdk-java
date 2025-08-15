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

/**
 * The request object to set catalog for a DataLake.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:45.021-07:00")
public class SetCatalogRequest  {

  /**
   * The name or CRN of the affected DataLake.
   **/
  private String datalake = null;

  /**
   * The name of the catalog to be used.
   **/
  private String catalogName = null;

  /**
   * Getter for datalake.
   * The name or CRN of the affected DataLake.
   **/
  @JsonProperty("datalake")
  public String getDatalake() {
    return datalake;
  }

  /**
   * Setter for datalake.
   * The name or CRN of the affected DataLake.
   **/
  public void setDatalake(String datalake) {
    this.datalake = datalake;
  }

  /**
   * Getter for catalogName.
   * The name of the catalog to be used.
   **/
  @JsonProperty("catalogName")
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Setter for catalogName.
   * The name of the catalog to be used.
   **/
  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCatalogRequest setCatalogRequest = (SetCatalogRequest) o;
    if (!Objects.equals(this.datalake, setCatalogRequest.datalake)) {
      return false;
    }
    if (!Objects.equals(this.catalogName, setCatalogRequest.catalogName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalake, catalogName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCatalogRequest {\n");
    sb.append("    datalake: ").append(toIndentedString(datalake)).append("\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
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

