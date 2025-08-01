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
 * AWS specific FreeIPA parameters.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class AwsFreeIpaInstanceTemplateParams  {

  /**
   * Percentage of spot instances.
   **/
  private Integer spotPercentage = null;

  /**
   * Maximum hourly price of spot instances.
   **/
  private Double spotMaxPrice = null;

  /**
   * Getter for spotPercentage.
   * Percentage of spot instances.
   **/
  @JsonProperty("spotPercentage")
  public Integer getSpotPercentage() {
    return spotPercentage;
  }

  /**
   * Setter for spotPercentage.
   * Percentage of spot instances.
   **/
  public void setSpotPercentage(Integer spotPercentage) {
    this.spotPercentage = spotPercentage;
  }

  /**
   * Getter for spotMaxPrice.
   * Maximum hourly price of spot instances.
   **/
  @JsonProperty("spotMaxPrice")
  public Double getSpotMaxPrice() {
    return spotMaxPrice;
  }

  /**
   * Setter for spotMaxPrice.
   * Maximum hourly price of spot instances.
   **/
  public void setSpotMaxPrice(Double spotMaxPrice) {
    this.spotMaxPrice = spotMaxPrice;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsFreeIpaInstanceTemplateParams awsFreeIpaInstanceTemplateParams = (AwsFreeIpaInstanceTemplateParams) o;
    if (!Objects.equals(this.spotPercentage, awsFreeIpaInstanceTemplateParams.spotPercentage)) {
      return false;
    }
    if (!Objects.equals(this.spotMaxPrice, awsFreeIpaInstanceTemplateParams.spotMaxPrice)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(spotPercentage, spotMaxPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsFreeIpaInstanceTemplateParams {\n");
    sb.append("    spotPercentage: ").append(toIndentedString(spotPercentage)).append("\n");
    sb.append("    spotMaxPrice: ").append(toIndentedString(spotMaxPrice)).append("\n");
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

