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

/**
 * The request object for FreeIPA upgrade.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class UpgradeFreeipaRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environmentName = null;

  /**
   * Target image ID for upgrade.
   **/
  private String imageId = null;

  /**
   * Allows the upgrade to a subsequent major OS version in the series.
   **/
  private Boolean allowMajorOsUpgrade = null;

  /**
   * Getter for environmentName.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name or CRN of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for imageId.
   * Target image ID for upgrade.
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * Target image ID for upgrade.
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  /**
   * Getter for allowMajorOsUpgrade.
   * Allows the upgrade to a subsequent major OS version in the series.
   **/
  @JsonProperty("allowMajorOsUpgrade")
  public Boolean getAllowMajorOsUpgrade() {
    return allowMajorOsUpgrade;
  }

  /**
   * Setter for allowMajorOsUpgrade.
   * Allows the upgrade to a subsequent major OS version in the series.
   **/
  public void setAllowMajorOsUpgrade(Boolean allowMajorOsUpgrade) {
    this.allowMajorOsUpgrade = allowMajorOsUpgrade;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeFreeipaRequest upgradeFreeipaRequest = (UpgradeFreeipaRequest) o;
    if (!Objects.equals(this.environmentName, upgradeFreeipaRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.imageId, upgradeFreeipaRequest.imageId)) {
      return false;
    }
    if (!Objects.equals(this.allowMajorOsUpgrade, upgradeFreeipaRequest.allowMajorOsUpgrade)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, imageId, allowMajorOsUpgrade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeFreeipaRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    allowMajorOsUpgrade: ").append(toIndentedString(allowMajorOsUpgrade)).append("\n");
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

