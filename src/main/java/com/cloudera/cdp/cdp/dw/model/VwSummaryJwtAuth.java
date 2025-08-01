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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Details related to JWT Authentication settings on this Virtual Warehouse.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class VwSummaryJwtAuth  {

  /**
   * If JWT auth is enabled on the Virtual Warehouse, describes the type of provider.  If set to \"CDP\", then the CDP JWT auth provider is configured.  If set to \"CUSTOM\", then another JWT provider is configured.  If empty or missing, then JWT auth is not enabled on this Virtual Warehouse.
   **/
  private String provider = null;

  /**
   * Getter for provider.
   * If JWT auth is enabled on the Virtual Warehouse, describes the type of provider.  If set to \&quot;CDP\&quot;, then the CDP JWT auth provider is configured.  If set to \&quot;CUSTOM\&quot;, then another JWT provider is configured.  If empty or missing, then JWT auth is not enabled on this Virtual Warehouse.
   **/
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  /**
   * Setter for provider.
   * If JWT auth is enabled on the Virtual Warehouse, describes the type of provider.  If set to \&quot;CDP\&quot;, then the CDP JWT auth provider is configured.  If set to \&quot;CUSTOM\&quot;, then another JWT provider is configured.  If empty or missing, then JWT auth is not enabled on this Virtual Warehouse.
   **/
  public void setProvider(String provider) {
    this.provider = provider;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VwSummaryJwtAuth vwSummaryJwtAuth = (VwSummaryJwtAuth) o;
    if (!Objects.equals(this.provider, vwSummaryJwtAuth.provider)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VwSummaryJwtAuth {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

