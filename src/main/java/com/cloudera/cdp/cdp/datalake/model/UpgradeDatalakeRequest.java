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

/**
 * Request object to upgrade datalake.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:25.798-08:00")
public class UpgradeDatalakeRequest  {

  /**
   * The name or CRN of the datalake.
   **/
  private String datalakeName = null;

  /**
   * The id of an image to upgrade to
   **/
  private String imageId = null;

  /**
   * The runtime version to upgrade to
   **/
  private String runtime = null;

  /**
   * Perform an os upgrade only
   **/
  private Boolean lockComponents = null;

  /**
   * Checks the eligibility of an image to upgrade
   **/
  private Boolean dryRun = null;

  /**
   * Returns the list of images that are eligible for the upgrade
   **/
  private Boolean showAvailableImages = null;

  /**
   * Returns the latest image that is eligible for the upgrade for each runtime version with at least one available upgrade candidate
   **/
  private Boolean showLatestAvailableImagePerRuntime = null;

  /**
   * If provided, will skip the backup flow for the upgrade process.
   **/
  private Boolean skipBackup = null;

  /**
   * Skips the backup of the databases backing HMS/Ranger services. Redundant if --skip-backup is included. If this option is not provided, the HMS/Ranger services are backed up by default.
   **/
  private Boolean skipRangerHmsMetadata = null;

  /**
   * Skips the backup of the Atlas metadata. Redundant if --skip-backup is included. If this option is not provided, the Atlas metadata is backed up by default.
   **/
  private Boolean skipAtlasMetadata = null;

  /**
   * Skips the backup of the Ranger audits. Redundant if --skip-backup is included. If this option is not provided, Ranger audits are backed up by default.
   **/
  private Boolean skipRangerAudits = null;

  /**
   * Skips the validation steps that run prior to the backup. Redundant if --skip-backup is included. If this option is not provided, the validations are performed by default.
   **/
  private Boolean skipBackupValidation = null;

  /**
   * Enables the ability to perform rolling runtime upgrade.
   **/
  private Boolean rollingUpgradeEnabled = null;

  /**
   * Getter for datalakeName.
   * The name or CRN of the datalake.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name or CRN of the datalake.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for imageId.
   * The id of an image to upgrade to
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * The id of an image to upgrade to
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  /**
   * Getter for runtime.
   * The runtime version to upgrade to
   **/
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }

  /**
   * Setter for runtime.
   * The runtime version to upgrade to
   **/
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  /**
   * Getter for lockComponents.
   * Perform an os upgrade only
   **/
  @JsonProperty("lockComponents")
  public Boolean getLockComponents() {
    return lockComponents;
  }

  /**
   * Setter for lockComponents.
   * Perform an os upgrade only
   **/
  public void setLockComponents(Boolean lockComponents) {
    this.lockComponents = lockComponents;
  }

  /**
   * Getter for dryRun.
   * Checks the eligibility of an image to upgrade
   **/
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }

  /**
   * Setter for dryRun.
   * Checks the eligibility of an image to upgrade
   **/
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  /**
   * Getter for showAvailableImages.
   * Returns the list of images that are eligible for the upgrade
   **/
  @JsonProperty("showAvailableImages")
  public Boolean getShowAvailableImages() {
    return showAvailableImages;
  }

  /**
   * Setter for showAvailableImages.
   * Returns the list of images that are eligible for the upgrade
   **/
  public void setShowAvailableImages(Boolean showAvailableImages) {
    this.showAvailableImages = showAvailableImages;
  }

  /**
   * Getter for showLatestAvailableImagePerRuntime.
   * Returns the latest image that is eligible for the upgrade for each runtime version with at least one available upgrade candidate
   **/
  @JsonProperty("showLatestAvailableImagePerRuntime")
  public Boolean getShowLatestAvailableImagePerRuntime() {
    return showLatestAvailableImagePerRuntime;
  }

  /**
   * Setter for showLatestAvailableImagePerRuntime.
   * Returns the latest image that is eligible for the upgrade for each runtime version with at least one available upgrade candidate
   **/
  public void setShowLatestAvailableImagePerRuntime(Boolean showLatestAvailableImagePerRuntime) {
    this.showLatestAvailableImagePerRuntime = showLatestAvailableImagePerRuntime;
  }

  /**
   * Getter for skipBackup.
   * If provided, will skip the backup flow for the upgrade process.
   **/
  @JsonProperty("skipBackup")
  public Boolean getSkipBackup() {
    return skipBackup;
  }

  /**
   * Setter for skipBackup.
   * If provided, will skip the backup flow for the upgrade process.
   **/
  public void setSkipBackup(Boolean skipBackup) {
    this.skipBackup = skipBackup;
  }

  /**
   * Getter for skipRangerHmsMetadata.
   * Skips the backup of the databases backing HMS/Ranger services. Redundant if --skip-backup is included. If this option is not provided, the HMS/Ranger services are backed up by default.
   **/
  @JsonProperty("skipRangerHmsMetadata")
  public Boolean getSkipRangerHmsMetadata() {
    return skipRangerHmsMetadata;
  }

  /**
   * Setter for skipRangerHmsMetadata.
   * Skips the backup of the databases backing HMS/Ranger services. Redundant if --skip-backup is included. If this option is not provided, the HMS/Ranger services are backed up by default.
   **/
  public void setSkipRangerHmsMetadata(Boolean skipRangerHmsMetadata) {
    this.skipRangerHmsMetadata = skipRangerHmsMetadata;
  }

  /**
   * Getter for skipAtlasMetadata.
   * Skips the backup of the Atlas metadata. Redundant if --skip-backup is included. If this option is not provided, the Atlas metadata is backed up by default.
   **/
  @JsonProperty("skipAtlasMetadata")
  public Boolean getSkipAtlasMetadata() {
    return skipAtlasMetadata;
  }

  /**
   * Setter for skipAtlasMetadata.
   * Skips the backup of the Atlas metadata. Redundant if --skip-backup is included. If this option is not provided, the Atlas metadata is backed up by default.
   **/
  public void setSkipAtlasMetadata(Boolean skipAtlasMetadata) {
    this.skipAtlasMetadata = skipAtlasMetadata;
  }

  /**
   * Getter for skipRangerAudits.
   * Skips the backup of the Ranger audits. Redundant if --skip-backup is included. If this option is not provided, Ranger audits are backed up by default.
   **/
  @JsonProperty("skipRangerAudits")
  public Boolean getSkipRangerAudits() {
    return skipRangerAudits;
  }

  /**
   * Setter for skipRangerAudits.
   * Skips the backup of the Ranger audits. Redundant if --skip-backup is included. If this option is not provided, Ranger audits are backed up by default.
   **/
  public void setSkipRangerAudits(Boolean skipRangerAudits) {
    this.skipRangerAudits = skipRangerAudits;
  }

  /**
   * Getter for skipBackupValidation.
   * Skips the validation steps that run prior to the backup. Redundant if --skip-backup is included. If this option is not provided, the validations are performed by default.
   **/
  @JsonProperty("skipBackupValidation")
  public Boolean getSkipBackupValidation() {
    return skipBackupValidation;
  }

  /**
   * Setter for skipBackupValidation.
   * Skips the validation steps that run prior to the backup. Redundant if --skip-backup is included. If this option is not provided, the validations are performed by default.
   **/
  public void setSkipBackupValidation(Boolean skipBackupValidation) {
    this.skipBackupValidation = skipBackupValidation;
  }

  /**
   * Getter for rollingUpgradeEnabled.
   * Enables the ability to perform rolling runtime upgrade.
   **/
  @JsonProperty("rollingUpgradeEnabled")
  public Boolean getRollingUpgradeEnabled() {
    return rollingUpgradeEnabled;
  }

  /**
   * Setter for rollingUpgradeEnabled.
   * Enables the ability to perform rolling runtime upgrade.
   **/
  public void setRollingUpgradeEnabled(Boolean rollingUpgradeEnabled) {
    this.rollingUpgradeEnabled = rollingUpgradeEnabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDatalakeRequest upgradeDatalakeRequest = (UpgradeDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, upgradeDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.imageId, upgradeDatalakeRequest.imageId)) {
      return false;
    }
    if (!Objects.equals(this.runtime, upgradeDatalakeRequest.runtime)) {
      return false;
    }
    if (!Objects.equals(this.lockComponents, upgradeDatalakeRequest.lockComponents)) {
      return false;
    }
    if (!Objects.equals(this.dryRun, upgradeDatalakeRequest.dryRun)) {
      return false;
    }
    if (!Objects.equals(this.showAvailableImages, upgradeDatalakeRequest.showAvailableImages)) {
      return false;
    }
    if (!Objects.equals(this.showLatestAvailableImagePerRuntime, upgradeDatalakeRequest.showLatestAvailableImagePerRuntime)) {
      return false;
    }
    if (!Objects.equals(this.skipBackup, upgradeDatalakeRequest.skipBackup)) {
      return false;
    }
    if (!Objects.equals(this.skipRangerHmsMetadata, upgradeDatalakeRequest.skipRangerHmsMetadata)) {
      return false;
    }
    if (!Objects.equals(this.skipAtlasMetadata, upgradeDatalakeRequest.skipAtlasMetadata)) {
      return false;
    }
    if (!Objects.equals(this.skipRangerAudits, upgradeDatalakeRequest.skipRangerAudits)) {
      return false;
    }
    if (!Objects.equals(this.skipBackupValidation, upgradeDatalakeRequest.skipBackupValidation)) {
      return false;
    }
    if (!Objects.equals(this.rollingUpgradeEnabled, upgradeDatalakeRequest.rollingUpgradeEnabled)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, imageId, runtime, lockComponents, dryRun, showAvailableImages, showLatestAvailableImagePerRuntime, skipBackup, skipRangerHmsMetadata, skipAtlasMetadata, skipRangerAudits, skipBackupValidation, rollingUpgradeEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    lockComponents: ").append(toIndentedString(lockComponents)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    showAvailableImages: ").append(toIndentedString(showAvailableImages)).append("\n");
    sb.append("    showLatestAvailableImagePerRuntime: ").append(toIndentedString(showLatestAvailableImagePerRuntime)).append("\n");
    sb.append("    skipBackup: ").append(toIndentedString(skipBackup)).append("\n");
    sb.append("    skipRangerHmsMetadata: ").append(toIndentedString(skipRangerHmsMetadata)).append("\n");
    sb.append("    skipAtlasMetadata: ").append(toIndentedString(skipAtlasMetadata)).append("\n");
    sb.append("    skipRangerAudits: ").append(toIndentedString(skipRangerAudits)).append("\n");
    sb.append("    skipBackupValidation: ").append(toIndentedString(skipBackupValidation)).append("\n");
    sb.append("    rollingUpgradeEnabled: ").append(toIndentedString(rollingUpgradeEnabled)).append("\n");
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

