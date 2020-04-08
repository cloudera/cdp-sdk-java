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

/**
 * Response object to check datalake upgrade options.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-04-07T22:32:18.772-07:00")
public class CheckDatalakeUpgradeOptionsResponse extends CdpResponse {

  /**
   * Details of the image, that datalake is currently uses.
   **/
  private ImageInfo current = null;

  /**
   * Details of the image, that datalake can be upgraded to.
   **/
  private ImageInfo upgrade = null;

  /**
   * Getter for current.
   * Details of the image, that datalake is currently uses.
   **/
  @JsonProperty("current")
  public ImageInfo getCurrent() {
    return current;
  }

  /**
   * Setter for current.
   * Details of the image, that datalake is currently uses.
   **/
  public void setCurrent(ImageInfo current) {
    this.current = current;
  }

  /**
   * Getter for upgrade.
   * Details of the image, that datalake can be upgraded to.
   **/
  @JsonProperty("upgrade")
  public ImageInfo getUpgrade() {
    return upgrade;
  }

  /**
   * Setter for upgrade.
   * Details of the image, that datalake can be upgraded to.
   **/
  public void setUpgrade(ImageInfo upgrade) {
    this.upgrade = upgrade;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDatalakeUpgradeOptionsResponse checkDatalakeUpgradeOptionsResponse = (CheckDatalakeUpgradeOptionsResponse) o;
    if (!Objects.equals(this.current, checkDatalakeUpgradeOptionsResponse.current)) {
      return false;
    }
    if (!Objects.equals(this.upgrade, checkDatalakeUpgradeOptionsResponse.upgrade)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, upgrade, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDatalakeUpgradeOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
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

