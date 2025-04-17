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
import com.cloudera.cdp.imagecatalog.model.VmImageResponse;
import java.util.*;

/**
 * The response object for holding data about an image retrieved from the default image catalog.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:16.034-07:00")
public class FindDefaultImageResponse extends CdpResponse {

  /**
   * Image UUID
   **/
  private String imageId = null;

  /**
   * List of images
   **/
  private List<VmImageResponse> vmImages = new ArrayList<VmImageResponse>();

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

  /**
   * Getter for vmImages.
   * List of images
   **/
  @JsonProperty("vmImages")
  public List<VmImageResponse> getVmImages() {
    return vmImages;
  }

  /**
   * Setter for vmImages.
   * List of images
   **/
  public void setVmImages(List<VmImageResponse> vmImages) {
    this.vmImages = vmImages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindDefaultImageResponse findDefaultImageResponse = (FindDefaultImageResponse) o;
    if (!Objects.equals(this.imageId, findDefaultImageResponse.imageId)) {
      return false;
    }
    if (!Objects.equals(this.vmImages, findDefaultImageResponse.vmImages)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, vmImages, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDefaultImageResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    vmImages: ").append(toIndentedString(vmImages)).append("\n");
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

