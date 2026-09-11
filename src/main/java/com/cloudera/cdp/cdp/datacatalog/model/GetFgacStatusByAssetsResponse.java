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
import java.util.Map;

/**
 * Map of asset identifier to FGAC enabled status.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-09-10T20:30:44.071Z")
public class GetFgacStatusByAssetsResponse extends CdpResponse {

  /**
   * list of FGAC statuses for the assets.
   **/
  private Map<String, String> listOfFgacStatus = new HashMap<String, String>();

  /**
   * Getter for listOfFgacStatus.
   * list of FGAC statuses for the assets.
   **/
  @JsonProperty("listOfFgacStatus")
  public Map<String, String> getListOfFgacStatus() {
    return listOfFgacStatus;
  }

  /**
   * Setter for listOfFgacStatus.
   * list of FGAC statuses for the assets.
   **/
  public void setListOfFgacStatus(Map<String, String> listOfFgacStatus) {
    this.listOfFgacStatus = listOfFgacStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFgacStatusByAssetsResponse getFgacStatusByAssetsResponse = (GetFgacStatusByAssetsResponse) o;
    if (!Objects.equals(this.listOfFgacStatus, getFgacStatusByAssetsResponse.listOfFgacStatus)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(listOfFgacStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFgacStatusByAssetsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    listOfFgacStatus: ").append(toIndentedString(listOfFgacStatus)).append("\n");
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

