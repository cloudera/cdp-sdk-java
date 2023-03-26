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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.CustomConfigurations;
import java.util.*;

/**
 * The response object for the list custom configurations request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-03-24T14:52:51.199-07:00")
public class ListCustomConfigurationsResponse extends CdpResponse {

  /**
   * The list of custom configurations.
   **/
  private List<CustomConfigurations> customConfigurations = new ArrayList<CustomConfigurations>();

  /**
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  private String nextToken = null;

  /**
   * Getter for customConfigurations.
   * The list of custom configurations.
   **/
  @JsonProperty("customConfigurations")
  public List<CustomConfigurations> getCustomConfigurations() {
    return customConfigurations;
  }

  /**
   * Setter for customConfigurations.
   * The list of custom configurations.
   **/
  public void setCustomConfigurations(List<CustomConfigurations> customConfigurations) {
    this.customConfigurations = customConfigurations;
  }

  /**
   * Getter for nextToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCustomConfigurationsResponse listCustomConfigurationsResponse = (ListCustomConfigurationsResponse) o;
    if (!Objects.equals(this.customConfigurations, listCustomConfigurationsResponse.customConfigurations)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listCustomConfigurationsResponse.nextToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customConfigurations, nextToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomConfigurationsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customConfigurations: ").append(toIndentedString(customConfigurations)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

