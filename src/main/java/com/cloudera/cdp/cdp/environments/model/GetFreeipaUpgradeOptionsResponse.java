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
import com.cloudera.cdp.environments.model.ImageInfoResponse;
import java.util.*;

/**
 * The response object with available FreeIPA upgrade candidates.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:29.236-07:00")
public class GetFreeipaUpgradeOptionsResponse extends CdpResponse {

  /**
   * The list of the upgrade candidates.
   **/
  private List<ImageInfoResponse> images = new ArrayList<ImageInfoResponse>();

  /**
   * The current image.
   **/
  private ImageInfoResponse currentImage = null;

  /**
   * Getter for images.
   * The list of the upgrade candidates.
   **/
  @JsonProperty("images")
  public List<ImageInfoResponse> getImages() {
    return images;
  }

  /**
   * Setter for images.
   * The list of the upgrade candidates.
   **/
  public void setImages(List<ImageInfoResponse> images) {
    this.images = images;
  }

  /**
   * Getter for currentImage.
   * The current image.
   **/
  @JsonProperty("currentImage")
  public ImageInfoResponse getCurrentImage() {
    return currentImage;
  }

  /**
   * Setter for currentImage.
   * The current image.
   **/
  public void setCurrentImage(ImageInfoResponse currentImage) {
    this.currentImage = currentImage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFreeipaUpgradeOptionsResponse getFreeipaUpgradeOptionsResponse = (GetFreeipaUpgradeOptionsResponse) o;
    if (!Objects.equals(this.images, getFreeipaUpgradeOptionsResponse.images)) {
      return false;
    }
    if (!Objects.equals(this.currentImage, getFreeipaUpgradeOptionsResponse.currentImage)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, currentImage, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFreeipaUpgradeOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    currentImage: ").append(toIndentedString(currentImage)).append("\n");
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

