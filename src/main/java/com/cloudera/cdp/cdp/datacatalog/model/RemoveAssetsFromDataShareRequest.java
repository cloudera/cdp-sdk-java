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
import java.util.*;

/**
 * Remove assets from Data Share request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class RemoveAssetsFromDataShareRequest  {

  /**
   * The CRN of the Data Lake where the Data Share is located.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the Environment where the Data Share is located.
   **/
  private String environmentCrn = null;

  /**
   * The unique identifier of the Data Share from which assets will be removed.
   **/
  private String dataShareId = null;

  /**
   * List of asset resource IDs to be removed from the Data Share.
   **/
  private List<String> resourceIds = new ArrayList<String>();

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
   * The unique identifier of the Data Share from which assets will be removed.
   **/
  @JsonProperty("dataShareId")
  public String getDataShareId() {
    return dataShareId;
  }

  /**
   * Setter for dataShareId.
   * The unique identifier of the Data Share from which assets will be removed.
   **/
  public void setDataShareId(String dataShareId) {
    this.dataShareId = dataShareId;
  }

  /**
   * Getter for resourceIds.
   * List of asset resource IDs to be removed from the Data Share.
   **/
  @JsonProperty("resourceIds")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  /**
   * Setter for resourceIds.
   * List of asset resource IDs to be removed from the Data Share.
   **/
  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveAssetsFromDataShareRequest removeAssetsFromDataShareRequest = (RemoveAssetsFromDataShareRequest) o;
    if (!Objects.equals(this.datalakeCrn, removeAssetsFromDataShareRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, removeAssetsFromDataShareRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.dataShareId, removeAssetsFromDataShareRequest.dataShareId)) {
      return false;
    }
    if (!Objects.equals(this.resourceIds, removeAssetsFromDataShareRequest.resourceIds)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, environmentCrn, dataShareId, resourceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveAssetsFromDataShareRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    dataShareId: ").append(toIndentedString(dataShareId)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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

