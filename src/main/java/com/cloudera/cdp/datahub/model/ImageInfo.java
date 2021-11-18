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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.ImageComponentVersions;

/**
 * Basic information about an image.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-11-17T16:25:34.833-08:00")
public class ImageInfo  {

  /**
   * The name of the image.
   **/
  private String imageName = null;

  /**
   * The id of the image.
   **/
  private String imageId = null;

  /**
   * Name of the image catalog, the image is from.
   **/
  private String imageCatalogName = null;

  /**
   * Image creation timestamp.
   **/
  private Long created = null;

  /**
   * Version of the image components.
   **/
  private ImageComponentVersions componentVersions = null;

  /**
   * Getter for imageName.
   * The name of the image.
   **/
  @JsonProperty("imageName")
  public String getImageName() {
    return imageName;
  }

  /**
   * Setter for imageName.
   * The name of the image.
   **/
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  /**
   * Getter for imageId.
   * The id of the image.
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * The id of the image.
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  /**
   * Getter for imageCatalogName.
   * Name of the image catalog, the image is from.
   **/
  @JsonProperty("imageCatalogName")
  public String getImageCatalogName() {
    return imageCatalogName;
  }

  /**
   * Setter for imageCatalogName.
   * Name of the image catalog, the image is from.
   **/
  public void setImageCatalogName(String imageCatalogName) {
    this.imageCatalogName = imageCatalogName;
  }

  /**
   * Getter for created.
   * Image creation timestamp.
   **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Image creation timestamp.
   **/
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   * Getter for componentVersions.
   * Version of the image components.
   **/
  @JsonProperty("componentVersions")
  public ImageComponentVersions getComponentVersions() {
    return componentVersions;
  }

  /**
   * Setter for componentVersions.
   * Version of the image components.
   **/
  public void setComponentVersions(ImageComponentVersions componentVersions) {
    this.componentVersions = componentVersions;
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
    if (!Objects.equals(this.imageName, imageInfo.imageName)) {
      return false;
    }
    if (!Objects.equals(this.imageId, imageInfo.imageId)) {
      return false;
    }
    if (!Objects.equals(this.imageCatalogName, imageInfo.imageCatalogName)) {
      return false;
    }
    if (!Objects.equals(this.created, imageInfo.created)) {
      return false;
    }
    if (!Objects.equals(this.componentVersions, imageInfo.componentVersions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageName, imageId, imageCatalogName, created, componentVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInfo {\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageCatalogName: ").append(toIndentedString(imageCatalogName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    componentVersions: ").append(toIndentedString(componentVersions)).append("\n");
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

