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
import com.cloudera.cdp.datacatalog.model.AssetRequest;
import java.util.*;

/**
 * Add assets to Data Share request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class AddAssetsToDataShareRequest  {

  /**
   * The CRN of the Data Lake where the Data Share is located.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the Environment where the Data Share is located.
   **/
  private String environmentCrn = null;

  /**
   * The unique identifier of the Data Share to which assets will be added.
   **/
  private String dataShareId = null;

  /**
   * List of assets to be added to the Data Share.
   **/
  private List<AssetRequest> assets = new ArrayList<AssetRequest>();

  /**
   * Getter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share is located.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share is located.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the Environment where the Data Share is located.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the Environment where the Data Share is located.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for dataShareId.
   * The unique identifier of the Data Share to which assets will be added.
   **/
  @JsonProperty("dataShareId")
  public String getDataShareId() {
    return dataShareId;
  }

  /**
   * Setter for dataShareId.
   * The unique identifier of the Data Share to which assets will be added.
   **/
  public void setDataShareId(String dataShareId) {
    this.dataShareId = dataShareId;
  }

  /**
   * Getter for assets.
   * List of assets to be added to the Data Share.
   **/
  @JsonProperty("assets")
  public List<AssetRequest> getAssets() {
    return assets;
  }

  /**
   * Setter for assets.
   * List of assets to be added to the Data Share.
   **/
  public void setAssets(List<AssetRequest> assets) {
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
    AddAssetsToDataShareRequest addAssetsToDataShareRequest = (AddAssetsToDataShareRequest) o;
    if (!Objects.equals(this.datalakeCrn, addAssetsToDataShareRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, addAssetsToDataShareRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.dataShareId, addAssetsToDataShareRequest.dataShareId)) {
      return false;
    }
    if (!Objects.equals(this.assets, addAssetsToDataShareRequest.assets)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, environmentCrn, dataShareId, assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAssetsToDataShareRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    dataShareId: ").append(toIndentedString(dataShareId)).append("\n");
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

