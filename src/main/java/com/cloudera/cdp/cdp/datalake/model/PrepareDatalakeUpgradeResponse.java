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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.ImageInfo;
import java.util.*;

/**
 * Response object for prepare Data Lake upgrade request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.225-07:00")
public class PrepareDatalakeUpgradeResponse extends CdpResponse {

  /**
   * Information about the current image
   **/
  private ImageInfo current = null;

  /**
   * List of images and components to upgrade to
   **/
  private List<ImageInfo> upgradeCandidates = new ArrayList<ImageInfo>();

  /**
   * The reason why upgrade is not possible
   **/
  private String reason = null;

  /**
   * Unique operation ID assigned to this command execution. Use this identifier with 'get-operation' to track status and retrieve detailed results.
   **/
  private String operationId = null;

  /**
   * Getter for current.
   * Information about the current image
   **/
  @JsonProperty("current")
  public ImageInfo getCurrent() {
    return current;
  }

  /**
   * Setter for current.
   * Information about the current image
   **/
  public void setCurrent(ImageInfo current) {
    this.current = current;
  }

  /**
   * Getter for upgradeCandidates.
   * List of images and components to upgrade to
   **/
  @JsonProperty("upgradeCandidates")
  public List<ImageInfo> getUpgradeCandidates() {
    return upgradeCandidates;
  }

  /**
   * Setter for upgradeCandidates.
   * List of images and components to upgrade to
   **/
  public void setUpgradeCandidates(List<ImageInfo> upgradeCandidates) {
    this.upgradeCandidates = upgradeCandidates;
  }

  /**
   * Getter for reason.
   * The reason why upgrade is not possible
   **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  /**
   * Setter for reason.
   * The reason why upgrade is not possible
   **/
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Getter for operationId.
   * Unique operation ID assigned to this command execution. Use this identifier with &#39;get-operation&#39; to track status and retrieve detailed results.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * Unique operation ID assigned to this command execution. Use this identifier with &#39;get-operation&#39; to track status and retrieve detailed results.
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
    PrepareDatalakeUpgradeResponse prepareDatalakeUpgradeResponse = (PrepareDatalakeUpgradeResponse) o;
    if (!Objects.equals(this.current, prepareDatalakeUpgradeResponse.current)) {
      return false;
    }
    if (!Objects.equals(this.upgradeCandidates, prepareDatalakeUpgradeResponse.upgradeCandidates)) {
      return false;
    }
    if (!Objects.equals(this.reason, prepareDatalakeUpgradeResponse.reason)) {
      return false;
    }
    if (!Objects.equals(this.operationId, prepareDatalakeUpgradeResponse.operationId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, upgradeCandidates, reason, operationId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareDatalakeUpgradeResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    upgradeCandidates: ").append(toIndentedString(upgradeCandidates)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

