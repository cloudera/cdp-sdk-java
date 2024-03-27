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
import java.util.Map;

/**
 * The response object holding the data of the image retrieved from the given custom catalog.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-27T12:18:21.823-07:00")
public class DescribeCustomImageResponse extends CdpResponse {

  /**
   * Image UUID
   **/
  private String imageId = null;

  /**
   * Image creation date
   **/
  private Long imageDate = null;

  /**
   * Image type - either \"FREEIPA\" or \"RUNTIME\"
   **/
  private String imageType = null;

  /**
   * Customized image UUID
   **/
  private String sourceImageId = null;

  /**
   * Customized image creation date
   **/
  private Long sourceImageDate = null;

  /**
   * Package versions
   **/
  private Map<String, String> versions = new HashMap<String, String>();

  /**
   * Cloud provider - either AWS, AZURE or GCP
   **/
  private String provider = null;

  /**
   * Base parcel URL
   **/
  private String baseParcelUrl = null;

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
   * Getter for imageDate.
   * Image creation date
   **/
  @JsonProperty("imageDate")
  public Long getImageDate() {
    return imageDate;
  }

  /**
   * Setter for imageDate.
   * Image creation date
   **/
  public void setImageDate(Long imageDate) {
    this.imageDate = imageDate;
  }

  /**
   * Getter for imageType.
   * Image type - either \&quot;FREEIPA\&quot; or \&quot;RUNTIME\&quot;
   **/
  @JsonProperty("imageType")
  public String getImageType() {
    return imageType;
  }

  /**
   * Setter for imageType.
   * Image type - either \&quot;FREEIPA\&quot; or \&quot;RUNTIME\&quot;
   **/
  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  /**
   * Getter for sourceImageId.
   * Customized image UUID
   **/
  @JsonProperty("sourceImageId")
  public String getSourceImageId() {
    return sourceImageId;
  }

  /**
   * Setter for sourceImageId.
   * Customized image UUID
   **/
  public void setSourceImageId(String sourceImageId) {
    this.sourceImageId = sourceImageId;
  }

  /**
   * Getter for sourceImageDate.
   * Customized image creation date
   **/
  @JsonProperty("sourceImageDate")
  public Long getSourceImageDate() {
    return sourceImageDate;
  }

  /**
   * Setter for sourceImageDate.
   * Customized image creation date
   **/
  public void setSourceImageDate(Long sourceImageDate) {
    this.sourceImageDate = sourceImageDate;
  }

  /**
   * Getter for versions.
   * Package versions
   **/
  @JsonProperty("versions")
  public Map<String, String> getVersions() {
    return versions;
  }

  /**
   * Setter for versions.
   * Package versions
   **/
  public void setVersions(Map<String, String> versions) {
    this.versions = versions;
  }

  /**
   * Getter for provider.
   * Cloud provider - either AWS, AZURE or GCP
   **/
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  /**
   * Setter for provider.
   * Cloud provider - either AWS, AZURE or GCP
   **/
  public void setProvider(String provider) {
    this.provider = provider;
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
    DescribeCustomImageResponse describeCustomImageResponse = (DescribeCustomImageResponse) o;
    if (!Objects.equals(this.imageId, describeCustomImageResponse.imageId)) {
      return false;
    }
    if (!Objects.equals(this.imageDate, describeCustomImageResponse.imageDate)) {
      return false;
    }
    if (!Objects.equals(this.imageType, describeCustomImageResponse.imageType)) {
      return false;
    }
    if (!Objects.equals(this.sourceImageId, describeCustomImageResponse.sourceImageId)) {
      return false;
    }
    if (!Objects.equals(this.sourceImageDate, describeCustomImageResponse.sourceImageDate)) {
      return false;
    }
    if (!Objects.equals(this.versions, describeCustomImageResponse.versions)) {
      return false;
    }
    if (!Objects.equals(this.provider, describeCustomImageResponse.provider)) {
      return false;
    }
    if (!Objects.equals(this.baseParcelUrl, describeCustomImageResponse.baseParcelUrl)) {
      return false;
    }
    if (!Objects.equals(this.vmImages, describeCustomImageResponse.vmImages)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, imageDate, imageType, sourceImageId, sourceImageDate, versions, provider, baseParcelUrl, vmImages, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCustomImageResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageDate: ").append(toIndentedString(imageDate)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    sourceImageId: ").append(toIndentedString(sourceImageId)).append("\n");
    sb.append("    sourceImageDate: ").append(toIndentedString(sourceImageDate)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    baseParcelUrl: ").append(toIndentedString(baseParcelUrl)).append("\n");
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

