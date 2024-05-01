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
import com.cloudera.cdp.dw.model.ExternalBucketAccessInfo;

/**
 * External bucket details.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-30T10:56:32.945-07:00")
public class ExternalBucket  {

  /**
   * Name of the bucket.
   **/
  private String name = null;

  /**
   * AccessInfo of the bucket.
   **/
  private ExternalBucketAccessInfo accessInfo = null;

  /**
   * Getter for name.
   * Name of the bucket.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the bucket.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for accessInfo.
   * AccessInfo of the bucket.
   **/
  @JsonProperty("accessInfo")
  public ExternalBucketAccessInfo getAccessInfo() {
    return accessInfo;
  }

  /**
   * Setter for accessInfo.
   * AccessInfo of the bucket.
   **/
  public void setAccessInfo(ExternalBucketAccessInfo accessInfo) {
    this.accessInfo = accessInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalBucket externalBucket = (ExternalBucket) o;
    if (!Objects.equals(this.name, externalBucket.name)) {
      return false;
    }
    if (!Objects.equals(this.accessInfo, externalBucket.accessInfo)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accessInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalBucket {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessInfo: ").append(toIndentedString(accessInfo)).append("\n");
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

