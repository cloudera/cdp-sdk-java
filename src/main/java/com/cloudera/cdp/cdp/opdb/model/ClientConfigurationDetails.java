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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A URL which holds information necessary to configure a Connector.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-23T17:47:15.686-07:00")
public class ClientConfigurationDetails  {

  /**
   * The name of this configuration
   **/
  private String name = null;

  /**
   * The URL from which to fetch the configuration
   **/
  private String url = null;

  /**
   * Getter for name.
   * The name of this configuration
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of this configuration
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for url.
   * The URL from which to fetch the configuration
   **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Setter for url.
   * The URL from which to fetch the configuration
   **/
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientConfigurationDetails clientConfigurationDetails = (ClientConfigurationDetails) o;
    if (!Objects.equals(this.name, clientConfigurationDetails.name)) {
      return false;
    }
    if (!Objects.equals(this.url, clientConfigurationDetails.url)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientConfigurationDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

