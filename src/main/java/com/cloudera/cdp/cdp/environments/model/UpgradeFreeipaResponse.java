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

/**
 * The response object for FreeIPA upgrade.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-22T20:53:55.093-07:00")
public class UpgradeFreeipaResponse extends CdpResponse {

  /**
   * Image selected for upgrade.
   **/
  private ImageInfoResponse targetImage = null;

  /**
   * Original, current image.
   **/
  private ImageInfoResponse originalImage = null;

  /**
   * UUID of the request for this operation. This ID can be used for geting status on the operation.
   **/
  private String operationId = null;

  /**
   * Getter for targetImage.
   * Image selected for upgrade.
   **/
  @JsonProperty("targetImage")
  public ImageInfoResponse getTargetImage() {
    return targetImage;
  }

  /**
   * Setter for targetImage.
   * Image selected for upgrade.
   **/
  public void setTargetImage(ImageInfoResponse targetImage) {
    this.targetImage = targetImage;
  }

  /**
   * Getter for originalImage.
   * Original, current image.
   **/
  @JsonProperty("originalImage")
  public ImageInfoResponse getOriginalImage() {
    return originalImage;
  }

  /**
   * Setter for originalImage.
   * Original, current image.
   **/
  public void setOriginalImage(ImageInfoResponse originalImage) {
    this.originalImage = originalImage;
  }

  /**
   * Getter for operationId.
   * UUID of the request for this operation. This ID can be used for geting status on the operation.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * UUID of the request for this operation. This ID can be used for geting status on the operation.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeFreeipaResponse upgradeFreeipaResponse = (UpgradeFreeipaResponse) o;
    if (!Objects.equals(this.targetImage, upgradeFreeipaResponse.targetImage)) {
      return false;
    }
    if (!Objects.equals(this.originalImage, upgradeFreeipaResponse.originalImage)) {
      return false;
    }
    if (!Objects.equals(this.operationId, upgradeFreeipaResponse.operationId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetImage, originalImage, operationId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeFreeipaResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetImage: ").append(toIndentedString(targetImage)).append("\n");
    sb.append("    originalImage: ").append(toIndentedString(originalImage)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

