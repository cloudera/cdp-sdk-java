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
 * Response object for upgrade datalake request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-08-18T09:49:26.046-07:00")
public class UpgradeDatalakeResponse extends CdpResponse {

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDatalakeResponse upgradeDatalakeResponse = (UpgradeDatalakeResponse) o;
    if (!Objects.equals(this.current, upgradeDatalakeResponse.current)) {
      return false;
    }
    if (!Objects.equals(this.upgradeCandidates, upgradeDatalakeResponse.upgradeCandidates)) {
      return false;
    }
    if (!Objects.equals(this.reason, upgradeDatalakeResponse.reason)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, upgradeCandidates, reason, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDatalakeResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    upgradeCandidates: ").append(toIndentedString(upgradeCandidates)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

