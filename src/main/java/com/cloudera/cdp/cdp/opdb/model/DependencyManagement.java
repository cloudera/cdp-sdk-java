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
 * Information about dependencies necessary to use a connector.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-05T12:07:36.343-07:00")
public class DependencyManagement  {

  /**
   * The URL of a Maven repository containing the client JARs.
   **/
  private String mavenUrl = null;

  /**
   * Getter for mavenUrl.
   * The URL of a Maven repository containing the client JARs.
   **/
  @JsonProperty("mavenUrl")
  public String getMavenUrl() {
    return mavenUrl;
  }

  /**
   * Setter for mavenUrl.
   * The URL of a Maven repository containing the client JARs.
   **/
  public void setMavenUrl(String mavenUrl) {
    this.mavenUrl = mavenUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyManagement dependencyManagement = (DependencyManagement) o;
    if (!Objects.equals(this.mavenUrl, dependencyManagement.mavenUrl)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(mavenUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyManagement {\n");
    sb.append("    mavenUrl: ").append(toIndentedString(mavenUrl)).append("\n");
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

