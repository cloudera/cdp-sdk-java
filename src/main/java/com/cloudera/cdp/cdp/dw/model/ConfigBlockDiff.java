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
import com.cloudera.cdp.dw.model.ConfigContentDiff;

/**
 * Differences between two ConfigBlocks.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-11T11:03:30.419-07:00")
public class ConfigBlockDiff  {

  /**
   * ID of the ConfigBlock.
   **/
  private String id = null;

  /**
   * Differences between the contents.
   **/
  private ConfigContentDiff contentDiff = null;

  /**
   * Getter for id.
   * ID of the ConfigBlock.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * ID of the ConfigBlock.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for contentDiff.
   * Differences between the contents.
   **/
  @JsonProperty("contentDiff")
  public ConfigContentDiff getContentDiff() {
    return contentDiff;
  }

  /**
   * Setter for contentDiff.
   * Differences between the contents.
   **/
  public void setContentDiff(ConfigContentDiff contentDiff) {
    this.contentDiff = contentDiff;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigBlockDiff configBlockDiff = (ConfigBlockDiff) o;
    if (!Objects.equals(this.id, configBlockDiff.id)) {
      return false;
    }
    if (!Objects.equals(this.contentDiff, configBlockDiff.contentDiff)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contentDiff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigBlockDiff {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentDiff: ").append(toIndentedString(contentDiff)).append("\n");
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

