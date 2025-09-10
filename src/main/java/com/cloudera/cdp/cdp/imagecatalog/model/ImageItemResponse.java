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
import java.util.*;
import java.util.Map;

/**
 * Model holding detailed information about a custom VM image.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-09T16:18:27.107-07:00")
public class ImageItemResponse extends CdpResponse {

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageItemResponse imageItemResponse = (ImageItemResponse) o;
    if (!Objects.equals(this.imageId, imageItemResponse.imageId)) {
      return false;
    }
    if (!Objects.equals(this.imageDate, imageItemResponse.imageDate)) {
      return false;
    }
    if (!Objects.equals(this.imageType, imageItemResponse.imageType)) {
      return false;
    }
    if (!Objects.equals(this.sourceImageId, imageItemResponse.sourceImageId)) {
      return false;
    }
    if (!Objects.equals(this.sourceImageDate, imageItemResponse.sourceImageDate)) {
      return false;
    }
    if (!Objects.equals(this.versions, imageItemResponse.versions)) {
      return false;
    }
    if (!Objects.equals(this.provider, imageItemResponse.provider)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, imageDate, imageType, sourceImageId, sourceImageDate, versions, provider, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageItemResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageDate: ").append(toIndentedString(imageDate)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    sourceImageId: ").append(toIndentedString(sourceImageId)).append("\n");
    sb.append("    sourceImageDate: ").append(toIndentedString(sourceImageDate)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

