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
 * Basic information about an image.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:28.895-07:00")
public class ImageInfo  {

  /**
   * The ID of the image.
   **/
  private String imageId = null;

  /**
   * The name of the image catalog of the image.
   **/
  private String imageCatalogName = null;

  /**
   * The OS of the image.
   **/
  private String imageOs = null;

  /**
   * Getter for imageId.
   * The ID of the image.
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * The ID of the image.
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  /**
   * Getter for imageCatalogName.
   * The name of the image catalog of the image.
   **/
  @JsonProperty("imageCatalogName")
  public String getImageCatalogName() {
    return imageCatalogName;
  }

  /**
   * Setter for imageCatalogName.
   * The name of the image catalog of the image.
   **/
  public void setImageCatalogName(String imageCatalogName) {
    this.imageCatalogName = imageCatalogName;
  }

  /**
   * Getter for imageOs.
   * The OS of the image.
   **/
  @JsonProperty("imageOs")
  public String getImageOs() {
    return imageOs;
  }

  /**
   * Setter for imageOs.
   * The OS of the image.
   **/
  public void setImageOs(String imageOs) {
    this.imageOs = imageOs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInfo imageInfo = (ImageInfo) o;
    if (!Objects.equals(this.imageId, imageInfo.imageId)) {
      return false;
    }
    if (!Objects.equals(this.imageCatalogName, imageInfo.imageCatalogName)) {
      return false;
    }
    if (!Objects.equals(this.imageOs, imageInfo.imageOs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, imageCatalogName, imageOs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInfo {\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageCatalogName: ").append(toIndentedString(imageCatalogName)).append("\n");
    sb.append("    imageOs: ").append(toIndentedString(imageOs)).append("\n");
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

