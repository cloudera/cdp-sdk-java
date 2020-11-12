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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Information about a resource assignment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-11-12T10:44:16.810-08:00")
public class ResourceAssignment  {

  /**
   * The assigned resource's CRN.
   **/
  private String resourceCrn = null;

  /**
   * The assigned resource role CRN.
   **/
  private String resourceRoleCrn = null;

  /**
   * Getter for resourceCrn.
   * The assigned resource&#39;s CRN.
   **/
  @JsonProperty("resourceCrn")
  public String getResourceCrn() {
    return resourceCrn;
  }

  /**
   * Setter for resourceCrn.
   * The assigned resource&#39;s CRN.
   **/
  public void setResourceCrn(String resourceCrn) {
    this.resourceCrn = resourceCrn;
  }

  /**
   * Getter for resourceRoleCrn.
   * The assigned resource role CRN.
   **/
  @JsonProperty("resourceRoleCrn")
  public String getResourceRoleCrn() {
    return resourceRoleCrn;
  }

  /**
   * Setter for resourceRoleCrn.
   * The assigned resource role CRN.
   **/
  public void setResourceRoleCrn(String resourceRoleCrn) {
    this.resourceRoleCrn = resourceRoleCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceAssignment resourceAssignment = (ResourceAssignment) o;
    if (!Objects.equals(this.resourceCrn, resourceAssignment.resourceCrn)) {
      return false;
    }
    if (!Objects.equals(this.resourceRoleCrn, resourceAssignment.resourceRoleCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCrn, resourceRoleCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceAssignment {\n");
    sb.append("    resourceCrn: ").append(toIndentedString(resourceCrn)).append("\n");
    sb.append("    resourceRoleCrn: ").append(toIndentedString(resourceRoleCrn)).append("\n");
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

