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
import com.cloudera.cdp.datacatalog.model.AssetResponse;
import java.util.*;

/**
 * Response of the Add assets to Data Share operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class AddAssetsToDataShareResponse extends CdpResponse {

  /**
   * List of assets added to the Data Share.
   **/
  private List<AssetResponse> assets = new ArrayList<AssetResponse>();

  /**
   * Getter for assets.
   * List of assets added to the Data Share.
   **/
  @JsonProperty("assets")
  public List<AssetResponse> getAssets() {
    return assets;
  }

  /**
   * Setter for assets.
   * List of assets added to the Data Share.
   **/
  public void setAssets(List<AssetResponse> assets) {
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
    AddAssetsToDataShareResponse addAssetsToDataShareResponse = (AddAssetsToDataShareResponse) o;
    if (!Objects.equals(this.assets, addAssetsToDataShareResponse.assets)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAssetsToDataShareResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

