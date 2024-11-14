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
 * External bucket definition.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:24.581-08:00")
public class ExternalBucketAccessInfo  {

  /**
   * Specifies whether the external bucket will be added in read-only or read-write mode.
   **/
  private String accessMode = null;

  /**
   * Enable server side encryption with the specified KMS CMK ARN. If the value is empty or unspecified, default server side encryption will be used when the access mode is read-write. Otherwise this value is ignored.
   **/
  private String kmsCmkArn = null;

  /**
   * Getter for accessMode.
   * Specifies whether the external bucket will be added in read-only or read-write mode.
   **/
  @JsonProperty("accessMode")
  public String getAccessMode() {
    return accessMode;
  }

  /**
   * Setter for accessMode.
   * Specifies whether the external bucket will be added in read-only or read-write mode.
   **/
  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }

  /**
   * Getter for kmsCmkArn.
   * Enable server side encryption with the specified KMS CMK ARN. If the value is empty or unspecified, default server side encryption will be used when the access mode is read-write. Otherwise this value is ignored.
   **/
  @JsonProperty("kmsCmkArn")
  public String getKmsCmkArn() {
    return kmsCmkArn;
  }

  /**
   * Setter for kmsCmkArn.
   * Enable server side encryption with the specified KMS CMK ARN. If the value is empty or unspecified, default server side encryption will be used when the access mode is read-write. Otherwise this value is ignored.
   **/
  public void setKmsCmkArn(String kmsCmkArn) {
    this.kmsCmkArn = kmsCmkArn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalBucketAccessInfo externalBucketAccessInfo = (ExternalBucketAccessInfo) o;
    if (!Objects.equals(this.accessMode, externalBucketAccessInfo.accessMode)) {
      return false;
    }
    if (!Objects.equals(this.kmsCmkArn, externalBucketAccessInfo.kmsCmkArn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, kmsCmkArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalBucketAccessInfo {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    kmsCmkArn: ").append(toIndentedString(kmsCmkArn)).append("\n");
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

