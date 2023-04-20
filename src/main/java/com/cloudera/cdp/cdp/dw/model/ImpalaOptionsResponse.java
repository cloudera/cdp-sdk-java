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
 * Impala specific settings.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-20T13:40:33.540-07:00")
public class ImpalaOptionsResponse extends CdpResponse {

  /**
   * Impala spill to S3 URI.
   **/
  private String spillToS3Uri = null;

  /**
   * Maximum scratch space used for spilling to disk.
   **/
  private Integer scratchSpaceLimit = null;

  /**
   * Getter for spillToS3Uri.
   * Impala spill to S3 URI.
   **/
  @JsonProperty("spillToS3Uri")
  public String getSpillToS3Uri() {
    return spillToS3Uri;
  }

  /**
   * Setter for spillToS3Uri.
   * Impala spill to S3 URI.
   **/
  public void setSpillToS3Uri(String spillToS3Uri) {
    this.spillToS3Uri = spillToS3Uri;
  }

  /**
   * Getter for scratchSpaceLimit.
   * Maximum scratch space used for spilling to disk.
   **/
  @JsonProperty("scratchSpaceLimit")
  public Integer getScratchSpaceLimit() {
    return scratchSpaceLimit;
  }

  /**
   * Setter for scratchSpaceLimit.
   * Maximum scratch space used for spilling to disk.
   **/
  public void setScratchSpaceLimit(Integer scratchSpaceLimit) {
    this.scratchSpaceLimit = scratchSpaceLimit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaOptionsResponse impalaOptionsResponse = (ImpalaOptionsResponse) o;
    if (!Objects.equals(this.spillToS3Uri, impalaOptionsResponse.spillToS3Uri)) {
      return false;
    }
    if (!Objects.equals(this.scratchSpaceLimit, impalaOptionsResponse.scratchSpaceLimit)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(spillToS3Uri, scratchSpaceLimit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    spillToS3Uri: ").append(toIndentedString(spillToS3Uri)).append("\n");
    sb.append("    scratchSpaceLimit: ").append(toIndentedString(scratchSpaceLimit)).append("\n");
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

