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
 * The image request for the datalake. When the &#39;runtime&#39; parameter is set, only the &#39;os&#39; parameter can be provided. Otherwise, you can use &#39;catalog name&#39; and/or &#39;id&#39; for selecting an image.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-27T08:40:26.246-07:00")
public class ImageRequest  {

  /**
   * The image ID from the catalog. The corresponding image will be used for the created cluster machines.
   **/
  private String id = null;

  /**
   * The name of the custom image catalog to use, defaulting to 'cdp-default' if not present.
   **/
  private String catalogName = "cdp-default";

  /**
   * The OS of the image used for cluster instances.
   **/
  private String os = null;

  /**
   * Getter for id.
   * The image ID from the catalog. The corresponding image will be used for the created cluster machines.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The image ID from the catalog. The corresponding image will be used for the created cluster machines.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for catalogName.
   * The name of the custom image catalog to use, defaulting to &#39;cdp-default&#39; if not present.
   **/
  @JsonProperty("catalogName")
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Setter for catalogName.
   * The name of the custom image catalog to use, defaulting to &#39;cdp-default&#39; if not present.
   **/
  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }

  /**
   * Getter for os.
   * The OS of the image used for cluster instances.
   **/
  @JsonProperty("os")
  public String getOs() {
    return os;
  }

  /**
   * Setter for os.
   * The OS of the image used for cluster instances.
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
    ImageRequest imageRequest = (ImageRequest) o;
    if (!Objects.equals(this.id, imageRequest.id)) {
      return false;
    }
    if (!Objects.equals(this.catalogName, imageRequest.catalogName)) {
      return false;
    }
    if (!Objects.equals(this.os, imageRequest.os)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, catalogName, os);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
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

