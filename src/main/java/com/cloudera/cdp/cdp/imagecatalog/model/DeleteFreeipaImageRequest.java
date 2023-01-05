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

/**
 * The request object to delete FreeIPA image from a catalog.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-01-04T11:10:11.242-08:00")
public class DeleteFreeipaImageRequest  {

  /**
   * Image catalog name
   **/
  private String catalogName = null;

  /**
   * Image UUID
   **/
  private String imageId = null;

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
   * Getter for imageId.
   * Image UUID
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * Image UUID
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteFreeipaImageRequest deleteFreeipaImageRequest = (DeleteFreeipaImageRequest) o;
    if (!Objects.equals(this.catalogName, deleteFreeipaImageRequest.catalogName)) {
      return false;
    }
    if (!Objects.equals(this.imageId, deleteFreeipaImageRequest.imageId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, imageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteFreeipaImageRequest {\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

