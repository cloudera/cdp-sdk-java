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
 * Model holding information about a custom VM image and the cloud region it belongs to. The format of the image reference is specific to the cloud provider, e.g. URL in case of Azure, AMI ID in case of AWS.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-07-12T15:10:00.696-07:00")
public class VmImageResponse extends CdpResponse {

  /**
   * Region
   **/
  private String region = null;

  /**
   * Image reference
   **/
  private String imageReference = null;

  /**
   * Getter for region.
   * Region
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Region
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for imageReference.
   * Image reference
   **/
  @JsonProperty("imageReference")
  public String getImageReference() {
    return imageReference;
  }

  /**
   * Setter for imageReference.
   * Image reference
   **/
  public void setImageReference(String imageReference) {
    this.imageReference = imageReference;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmImageResponse vmImageResponse = (VmImageResponse) o;
    if (!Objects.equals(this.region, vmImageResponse.region)) {
      return false;
    }
    if (!Objects.equals(this.imageReference, vmImageResponse.imageReference)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, imageReference, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmImageResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    imageReference: ").append(toIndentedString(imageReference)).append("\n");
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

