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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object to upgrade datahub.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-21T23:16:14.526-07:00")
public class UpgradeClusterRequest  {

  /**
   * The name or CRN of the datahub.
   **/
  private String clusterName = null;

  /**
   * The id of an image to upgrade to.
   **/
  private String imageId = null;

  /**
   * The runtime version to upgrade to.
   **/
  private String runtime = null;

  /**
   * Perform an os upgrade only.
   **/
  private Boolean lockComponents = null;

  /**
   * Checks the eligibility of an image to upgrade but do not perform the upgrade.
   **/
  private Boolean dryRun = null;

  /**
   * Returns the list of images that are eligible for the upgrade.
   **/
  private Boolean showAvailableImages = null;

  /**
   * Returns the latest image that is eligible for the upgrade for each runtime version with at least one available upgrade candidate.
   **/
  private Boolean showLatestAvailableImagePerRuntime = null;

  /**
   * Getter for clusterName.
   * The name or CRN of the datahub.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name or CRN of the datahub.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for imageId.
   * The id of an image to upgrade to.
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * The id of an image to upgrade to.
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  /**
   * Getter for runtime.
   * The runtime version to upgrade to.
   **/
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }

  /**
   * Setter for runtime.
   * The runtime version to upgrade to.
   **/
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  /**
   * Getter for lockComponents.
   * Perform an os upgrade only.
   **/
  @JsonProperty("lockComponents")
  public Boolean getLockComponents() {
    return lockComponents;
  }

  /**
   * Setter for lockComponents.
   * Perform an os upgrade only.
   **/
  public void setLockComponents(Boolean lockComponents) {
    this.lockComponents = lockComponents;
  }

  /**
   * Getter for dryRun.
   * Checks the eligibility of an image to upgrade but do not perform the upgrade.
   **/
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }

  /**
   * Setter for dryRun.
   * Checks the eligibility of an image to upgrade but do not perform the upgrade.
   **/
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  /**
   * Getter for showAvailableImages.
   * Returns the list of images that are eligible for the upgrade.
   **/
  @JsonProperty("showAvailableImages")
  public Boolean getShowAvailableImages() {
    return showAvailableImages;
  }

  /**
   * Setter for showAvailableImages.
   * Returns the list of images that are eligible for the upgrade.
   **/
  public void setShowAvailableImages(Boolean showAvailableImages) {
    this.showAvailableImages = showAvailableImages;
  }

  /**
   * Getter for showLatestAvailableImagePerRuntime.
   * Returns the latest image that is eligible for the upgrade for each runtime version with at least one available upgrade candidate.
   **/
  @JsonProperty("showLatestAvailableImagePerRuntime")
  public Boolean getShowLatestAvailableImagePerRuntime() {
    return showLatestAvailableImagePerRuntime;
  }

  /**
   * Setter for showLatestAvailableImagePerRuntime.
   * Returns the latest image that is eligible for the upgrade for each runtime version with at least one available upgrade candidate.
   **/
  public void setShowLatestAvailableImagePerRuntime(Boolean showLatestAvailableImagePerRuntime) {
    this.showLatestAvailableImagePerRuntime = showLatestAvailableImagePerRuntime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeClusterRequest upgradeClusterRequest = (UpgradeClusterRequest) o;
    if (!Objects.equals(this.clusterName, upgradeClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.imageId, upgradeClusterRequest.imageId)) {
      return false;
    }
    if (!Objects.equals(this.runtime, upgradeClusterRequest.runtime)) {
      return false;
    }
    if (!Objects.equals(this.lockComponents, upgradeClusterRequest.lockComponents)) {
      return false;
    }
    if (!Objects.equals(this.dryRun, upgradeClusterRequest.dryRun)) {
      return false;
    }
    if (!Objects.equals(this.showAvailableImages, upgradeClusterRequest.showAvailableImages)) {
      return false;
    }
    if (!Objects.equals(this.showLatestAvailableImagePerRuntime, upgradeClusterRequest.showLatestAvailableImagePerRuntime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, imageId, runtime, lockComponents, dryRun, showAvailableImages, showLatestAvailableImagePerRuntime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    lockComponents: ").append(toIndentedString(lockComponents)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    showAvailableImages: ").append(toIndentedString(showAvailableImages)).append("\n");
    sb.append("    showLatestAvailableImagePerRuntime: ").append(toIndentedString(showLatestAvailableImagePerRuntime)).append("\n");
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

