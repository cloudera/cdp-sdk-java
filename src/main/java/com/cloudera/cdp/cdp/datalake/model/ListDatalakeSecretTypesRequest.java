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
 * Request for listing possible secret values for Datalake.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:45.021-07:00")
public class ListDatalakeSecretTypesRequest  {

  /**
   * The Datalake CRN where we wish to get the rotatable secrets.
   **/
  private String datalake = null;

  /**
   * Getter for datalake.
   * The Datalake CRN where we wish to get the rotatable secrets.
   **/
  @JsonProperty("datalake")
  public String getDatalake() {
    return datalake;
  }

  /**
   * Setter for datalake.
   * The Datalake CRN where we wish to get the rotatable secrets.
   **/
  public void setDatalake(String datalake) {
    this.datalake = datalake;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDatalakeSecretTypesRequest listDatalakeSecretTypesRequest = (ListDatalakeSecretTypesRequest) o;
    if (!Objects.equals(this.datalake, listDatalakeSecretTypesRequest.datalake)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalake);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDatalakeSecretTypesRequest {\n");
    sb.append("    datalake: ").append(toIndentedString(datalake)).append("\n");
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

