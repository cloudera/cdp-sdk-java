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

package com.cloudera.cdp.imagecatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.imagecatalog.model.ImageItemResponse;
import java.util.*;

/**
 * The response object holding the retrieved data of a custom catalog.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:48.946-07:00")
public class DescribeCustomCatalogResponse extends CdpResponse {

  /**
   * Image catalog name
   **/
  private String catalogName = null;

  /**
   * Image catalog description
   **/
  private String description = null;

  /**
   * Detailed information of the images contained within
   **/
  private List<ImageItemResponse> images = new ArrayList<ImageItemResponse>();

  /**
   * Getter for catalogName.
   * Image catalog name
   **/
  @JsonProperty("catalogName")
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Setter for catalogName.
   * Image catalog name
   **/
  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }

  /**
   * Getter for description.
   * Image catalog description
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Image catalog description
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for images.
   * Detailed information of the images contained within
   **/
  @JsonProperty("images")
  public List<ImageItemResponse> getImages() {
    return images;
  }

  /**
   * Setter for images.
   * Detailed information of the images contained within
   **/
  public void setImages(List<ImageItemResponse> images) {
    this.images = images;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCustomCatalogResponse describeCustomCatalogResponse = (DescribeCustomCatalogResponse) o;
    if (!Objects.equals(this.catalogName, describeCustomCatalogResponse.catalogName)) {
      return false;
    }
    if (!Objects.equals(this.description, describeCustomCatalogResponse.description)) {
      return false;
    }
    if (!Objects.equals(this.images, describeCustomCatalogResponse.images)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, description, images, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCustomCatalogResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

