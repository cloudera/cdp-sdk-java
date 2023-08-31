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

/**
 * Request object for FreeIPA image.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-30T17:23:16.951-07:00")
public class FreeIpaImageRequest  {

  /**
   * Image catalog to use for FreeIPA image selection.
   **/
  private String catalog = null;

  /**
   * Image ID to use for creating FreeIPA instances.
   **/
  private String id = null;

  /**
   * The OS to use for creating FreeIPA instances.
   **/
  private String os = null;

  /**
   * Getter for catalog.
   * Image catalog to use for FreeIPA image selection.
   **/
  @JsonProperty("catalog")
  public String getCatalog() {
    return catalog;
  }

  /**
   * Setter for catalog.
   * Image catalog to use for FreeIPA image selection.
   **/
  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }

  /**
   * Getter for id.
   * Image ID to use for creating FreeIPA instances.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Image ID to use for creating FreeIPA instances.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for os.
   * The OS to use for creating FreeIPA instances.
   **/
  @JsonProperty("os")
  public String getOs() {
    return os;
  }

  /**
   * Setter for os.
   * The OS to use for creating FreeIPA instances.
   **/
  public void setOs(String os) {
    this.os = os;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeIpaImageRequest freeIpaImageRequest = (FreeIpaImageRequest) o;
    if (!Objects.equals(this.catalog, freeIpaImageRequest.catalog)) {
      return false;
    }
    if (!Objects.equals(this.id, freeIpaImageRequest.id)) {
      return false;
    }
    if (!Objects.equals(this.os, freeIpaImageRequest.os)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, id, os);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeIpaImageRequest {\n");
    sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
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

