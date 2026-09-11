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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datacatalog.model.AssetForFGACStatus;
import java.util.*;

/**
 * Assets to get FGAC status for.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-09-10T20:30:44.071Z")
public class GetFgacStatusByAssetsRequest  {

  /**
   * The CRN of the Data Lake where the assets are located.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the Environment where the assets are located.
   **/
  private String environmentCrn = null;

  /**
   * List of assets to get FGAC status for.
   **/
  private List<AssetForFGACStatus> assets = new ArrayList<AssetForFGACStatus>();

  /**
   * Getter for datalakeCrn.
   * The CRN of the Data Lake where the assets are located.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Data Lake where the assets are located.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the Environment where the assets are located.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the Environment where the assets are located.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for assets.
   * List of assets to get FGAC status for.
   **/
  @JsonProperty("assets")
  public List<AssetForFGACStatus> getAssets() {
    return assets;
  }

  /**
   * Setter for assets.
   * List of assets to get FGAC status for.
   **/
  public void setAssets(List<AssetForFGACStatus> assets) {
    this.assets = assets;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFgacStatusByAssetsRequest getFgacStatusByAssetsRequest = (GetFgacStatusByAssetsRequest) o;
    if (!Objects.equals(this.datalakeCrn, getFgacStatusByAssetsRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, getFgacStatusByAssetsRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.assets, getFgacStatusByAssetsRequest.assets)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, environmentCrn, assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFgacStatusByAssetsRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

