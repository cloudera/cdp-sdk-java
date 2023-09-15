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
import com.cloudera.cdp.imagecatalog.model.VmImageRequest;
import java.util.*;

/**
 * The request object to add or update a FreeIPA image in a catalog.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:20.174-07:00")
public class SetFreeipaImageRequest  {

  /**
   * Image catalog name
   **/
  private String catalogName = null;

  /**
   * UUID of the image customized by the current image
   **/
  private String sourceImageId = null;

  /**
   * List of images
   **/
  private List<VmImageRequest> vmImages = new ArrayList<VmImageRequest>();

  /**
   * Image UUID. If this is empty, a randomly generated UUID is used
   **/
  private String imageId = null;

  /**
   * Base parcel URL
   **/
  private String baseParcelUrl = null;

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
   * Getter for sourceImageId.
   * UUID of the image customized by the current image
   **/
  @JsonProperty("sourceImageId")
  public String getSourceImageId() {
    return sourceImageId;
  }

  /**
   * Setter for sourceImageId.
   * UUID of the image customized by the current image
   **/
  public void setSourceImageId(String sourceImageId) {
    this.sourceImageId = sourceImageId;
  }

  /**
   * Getter for vmImages.
   * List of images
   **/
  @JsonProperty("vmImages")
  public List<VmImageRequest> getVmImages() {
    return vmImages;
  }

  /**
   * Setter for vmImages.
   * List of images
   **/
  public void setVmImages(List<VmImageRequest> vmImages) {
    this.vmImages = vmImages;
  }

  /**
   * Getter for imageId.
   * Image UUID. If this is empty, a randomly generated UUID is used
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * Image UUID. If this is empty, a randomly generated UUID is used
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  /**
   * Getter for baseParcelUrl.
   * Base parcel URL
   **/
  @JsonProperty("baseParcelUrl")
  public String getBaseParcelUrl() {
    return baseParcelUrl;
  }

  /**
   * Setter for baseParcelUrl.
   * Base parcel URL
   **/
  public void setBaseParcelUrl(String baseParcelUrl) {
    this.baseParcelUrl = baseParcelUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetFreeipaImageRequest setFreeipaImageRequest = (SetFreeipaImageRequest) o;
    if (!Objects.equals(this.catalogName, setFreeipaImageRequest.catalogName)) {
      return false;
    }
    if (!Objects.equals(this.sourceImageId, setFreeipaImageRequest.sourceImageId)) {
      return false;
    }
    if (!Objects.equals(this.vmImages, setFreeipaImageRequest.vmImages)) {
      return false;
    }
    if (!Objects.equals(this.imageId, setFreeipaImageRequest.imageId)) {
      return false;
    }
    if (!Objects.equals(this.baseParcelUrl, setFreeipaImageRequest.baseParcelUrl)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, sourceImageId, vmImages, imageId, baseParcelUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetFreeipaImageRequest {\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    sourceImageId: ").append(toIndentedString(sourceImageId)).append("\n");
    sb.append("    vmImages: ").append(toIndentedString(vmImages)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    baseParcelUrl: ").append(toIndentedString(baseParcelUrl)).append("\n");
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

