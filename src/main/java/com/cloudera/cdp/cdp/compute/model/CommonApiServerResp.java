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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * API server response structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:19.452-08:00")
public class CommonApiServerResp  {

  /**
   * An array of IPv4 CIDR blocks.
   **/
  private List<String> authorizedIpRanges = new ArrayList<String>();

  /**
   * Flag to indicate if whitelist of IP Ranges (CIDR block) for public access to the kubernetes API server is enabled.
   **/
  private Boolean enabled = null;

  /**
   * Getter for authorizedIpRanges.
   * An array of IPv4 CIDR blocks.
   **/
  @JsonProperty("authorizedIpRanges")
  public List<String> getAuthorizedIpRanges() {
    return authorizedIpRanges;
  }

  /**
   * Setter for authorizedIpRanges.
   * An array of IPv4 CIDR blocks.
   **/
  public void setAuthorizedIpRanges(List<String> authorizedIpRanges) {
    this.authorizedIpRanges = authorizedIpRanges;
  }

  /**
   * Getter for enabled.
   * Flag to indicate if whitelist of IP Ranges (CIDR block) for public access to the kubernetes API server is enabled.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Flag to indicate if whitelist of IP Ranges (CIDR block) for public access to the kubernetes API server is enabled.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonApiServerResp commonApiServerResp = (CommonApiServerResp) o;
    if (!Objects.equals(this.authorizedIpRanges, commonApiServerResp.authorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.enabled, commonApiServerResp.enabled)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedIpRanges, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonApiServerResp {\n");
    sb.append("    authorizedIpRanges: ").append(toIndentedString(authorizedIpRanges)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
