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
 * Storage related information.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:24.581-08:00")
public class UpdateApplicationResourcesLocalStorageSize  {

  /**
   * Local disk space used for writing scratch data.
   **/
  private String scratch = null;

  /**
   * Local disk space used for writing cache data.
   **/
  private String cache = null;

  /**
   * Local disk space used for writing other temporary data, tools, etc.
   **/
  private String overhead = null;

  /**
   * Getter for scratch.
   * Local disk space used for writing scratch data.
   **/
  @JsonProperty("scratch")
  public String getScratch() {
    return scratch;
  }

  /**
   * Setter for scratch.
   * Local disk space used for writing scratch data.
   **/
  public void setScratch(String scratch) {
    this.scratch = scratch;
  }

  /**
   * Getter for cache.
   * Local disk space used for writing cache data.
   **/
  @JsonProperty("cache")
  public String getCache() {
    return cache;
  }

  /**
   * Setter for cache.
   * Local disk space used for writing cache data.
   **/
  public void setCache(String cache) {
    this.cache = cache;
  }

  /**
   * Getter for overhead.
   * Local disk space used for writing other temporary data, tools, etc.
   **/
  @JsonProperty("overhead")
  public String getOverhead() {
    return overhead;
  }

  /**
   * Setter for overhead.
   * Local disk space used for writing other temporary data, tools, etc.
   **/
  public void setOverhead(String overhead) {
    this.overhead = overhead;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateApplicationResourcesLocalStorageSize updateApplicationResourcesLocalStorageSize = (UpdateApplicationResourcesLocalStorageSize) o;
    if (!Objects.equals(this.scratch, updateApplicationResourcesLocalStorageSize.scratch)) {
      return false;
    }
    if (!Objects.equals(this.cache, updateApplicationResourcesLocalStorageSize.cache)) {
      return false;
    }
    if (!Objects.equals(this.overhead, updateApplicationResourcesLocalStorageSize.overhead)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(scratch, cache, overhead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApplicationResourcesLocalStorageSize {\n");
    sb.append("    scratch: ").append(toIndentedString(scratch)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
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

