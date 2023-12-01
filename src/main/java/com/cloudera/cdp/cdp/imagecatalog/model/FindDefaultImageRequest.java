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
 * The request object to filter data that is used for retrieving an image from the default image catalog.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-01T13:59:43.026-08:00")
public class FindDefaultImageRequest  {

  /**
   * Cloud provider - either AWS, AZURE or GCP
   **/
  private String provider = null;

  /**
   * Image type - either \"FREEIPA\" or \"RUNTIME\"
   **/
  private String imageType = null;

  /**
   * Cloudera runtime version
   **/
  private String runtimeVersion = null;

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
   * Getter for runtimeVersion.
   * Cloudera runtime version
   **/
  @JsonProperty("runtimeVersion")
  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * Setter for runtimeVersion.
   * Cloudera runtime version
   **/
  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindDefaultImageRequest findDefaultImageRequest = (FindDefaultImageRequest) o;
    if (!Objects.equals(this.provider, findDefaultImageRequest.provider)) {
      return false;
    }
    if (!Objects.equals(this.imageType, findDefaultImageRequest.imageType)) {
      return false;
    }
    if (!Objects.equals(this.runtimeVersion, findDefaultImageRequest.runtimeVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, imageType, runtimeVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDefaultImageRequest {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
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

