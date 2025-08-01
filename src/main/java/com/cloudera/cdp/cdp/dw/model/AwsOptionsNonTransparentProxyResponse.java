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
import java.util.*;

/**
 * Non-transparent proxy settings. Read more: https://docs.cloudera.com/data-warehouse/cloud/aws-environments/topics/dw-aws-use-non-transparent-proxy.html
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class AwsOptionsNonTransparentProxyResponse extends CdpResponse {

  /**
   * Denotes whether the proxy settings turned on/off.
   **/
  private Boolean use = null;

  /**
   * Domains where the proxy is getting by-passed.
   **/
  private List<String> bypassedDomains = new ArrayList<String>();

  /**
   * Getter for use.
   * Denotes whether the proxy settings turned on/off.
   **/
  @JsonProperty("use")
  public Boolean getUse() {
    return use;
  }

  /**
   * Setter for use.
   * Denotes whether the proxy settings turned on/off.
   **/
  public void setUse(Boolean use) {
    this.use = use;
  }

  /**
   * Getter for bypassedDomains.
   * Domains where the proxy is getting by-passed.
   **/
  @JsonProperty("bypassedDomains")
  public List<String> getBypassedDomains() {
    return bypassedDomains;
  }

  /**
   * Setter for bypassedDomains.
   * Domains where the proxy is getting by-passed.
   **/
  public void setBypassedDomains(List<String> bypassedDomains) {
    this.bypassedDomains = bypassedDomains;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsOptionsNonTransparentProxyResponse awsOptionsNonTransparentProxyResponse = (AwsOptionsNonTransparentProxyResponse) o;
    if (!Objects.equals(this.use, awsOptionsNonTransparentProxyResponse.use)) {
      return false;
    }
    if (!Objects.equals(this.bypassedDomains, awsOptionsNonTransparentProxyResponse.bypassedDomains)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(use, bypassedDomains, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsOptionsNonTransparentProxyResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    bypassedDomains: ").append(toIndentedString(bypassedDomains)).append("\n");
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

