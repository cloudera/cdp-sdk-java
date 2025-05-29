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
 * Request object when updating a catalog collection.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:22.132-07:00")
public class UpdateCollectionRequest  {

  /**
   * The catalog collection CRN.
   **/
  private String catalogCollectionCrn = null;

  /**
   * The new name of the collection.
   **/
  private String name = null;

  /**
   * The new description of the collection.
   **/
  private String description = null;

  /**
   * Getter for catalogCollectionCrn.
   * The catalog collection CRN.
   **/
  @JsonProperty("catalogCollectionCrn")
  public String getCatalogCollectionCrn() {
    return catalogCollectionCrn;
  }

  /**
   * Setter for catalogCollectionCrn.
   * The catalog collection CRN.
   **/
  public void setCatalogCollectionCrn(String catalogCollectionCrn) {
    this.catalogCollectionCrn = catalogCollectionCrn;
  }

  /**
   * Getter for name.
   * The new name of the collection.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The new name of the collection.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * The new description of the collection.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The new description of the collection.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCollectionRequest updateCollectionRequest = (UpdateCollectionRequest) o;
    if (!Objects.equals(this.catalogCollectionCrn, updateCollectionRequest.catalogCollectionCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, updateCollectionRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.description, updateCollectionRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogCollectionCrn, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCollectionRequest {\n");
    sb.append("    catalogCollectionCrn: ").append(toIndentedString(catalogCollectionCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

