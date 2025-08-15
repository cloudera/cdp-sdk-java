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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;
import java.util.Map;

/**
 * The request object for updating the tags of the given environment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:45.730-07:00")
public class UpdateTagsRequest  {

  /**
   * The name or the CRN of the environment.
   **/
  private String environment = null;

  /**
   * Map of tag names to values for the environment.
   **/
  private Map<String, String> tags = new HashMap<String, String>();

  /**
   * Getter for environment.
   * The name or the CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or the CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for tags.
   * Map of tag names to values for the environment.
   **/
  @JsonProperty("tags")
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Map of tag names to values for the environment.
   **/
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTagsRequest updateTagsRequest = (UpdateTagsRequest) o;
    if (!Objects.equals(this.environment, updateTagsRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.tags, updateTagsRequest.tags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTagsRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

