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
 * Information about a resource role. A resource role is a role that grants a collection of rights to a user on resources.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-09-13T18:00:50.855-07:00")
public class ResourceRole  {

  /**
   * The CRN of the resource role.
   **/
  private String crn = null;

  /**
   * The rights granted by this role.
   **/
  private List<String> rights = new ArrayList<String>();

  /**
   * Getter for crn.
   * The CRN of the resource role.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the resource role.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for rights.
   * The rights granted by this role.
   **/
  @JsonProperty("rights")
  public List<String> getRights() {
    return rights;
  }

  /**
   * Setter for rights.
   * The rights granted by this role.
   **/
  public void setRights(List<String> rights) {
    this.rights = rights;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceRole resourceRole = (ResourceRole) o;
    if (!Objects.equals(this.crn, resourceRole.crn)) {
      return false;
    }
    if (!Objects.equals(this.rights, resourceRole.rights)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, rights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRole {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

