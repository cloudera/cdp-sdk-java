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
import java.util.*;

/**
 * A policy statement is a list of rights and zero or more resources on which the rights are granted.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:23.215-08:00")
public class PolicyStatement  {

  /**
   * The list of rights in the policy statement.
   **/
  private List<String> rights = new ArrayList<String>();

  /**
   * The resources on which the rights are granted.
   **/
  private List<String> resources = new ArrayList<String>();

  /**
   * Getter for rights.
   * The list of rights in the policy statement.
   **/
  @JsonProperty("rights")
  public List<String> getRights() {
    return rights;
  }

  /**
   * Setter for rights.
   * The list of rights in the policy statement.
   **/
  public void setRights(List<String> rights) {
    this.rights = rights;
  }

  /**
   * Getter for resources.
   * The resources on which the rights are granted.
   **/
  @JsonProperty("resources")
  public List<String> getResources() {
    return resources;
  }

  /**
   * Setter for resources.
   * The resources on which the rights are granted.
   **/
  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyStatement policyStatement = (PolicyStatement) o;
    if (!Objects.equals(this.rights, policyStatement.rights)) {
      return false;
    }
    if (!Objects.equals(this.resources, policyStatement.resources)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(rights, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyStatement {\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

