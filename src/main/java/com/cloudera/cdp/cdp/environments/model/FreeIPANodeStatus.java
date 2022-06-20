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

/**
 * The status and issues of an individual FreeIPA node.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-17T10:50:06.954-07:00")
public class FreeIPANodeStatus  {

  /**
   * The hostname of the ipa instance.
   **/
  private String hostname = null;

  /**
   * The status of the individual node
   **/
  private String status = null;

  /**
   * A list of issues the node is having
   **/
  private List<String> issues = new ArrayList<String>();

  /**
   * Getter for hostname.
   * The hostname of the ipa instance.
   **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  /**
   * Setter for hostname.
   * The hostname of the ipa instance.
   **/
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * Getter for status.
   * The status of the individual node
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the individual node
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for issues.
   * A list of issues the node is having
   **/
  @JsonProperty("issues")
  public List<String> getIssues() {
    return issues;
  }

  /**
   * Setter for issues.
   * A list of issues the node is having
   **/
  public void setIssues(List<String> issues) {
    this.issues = issues;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeIPANodeStatus freeIPANodeStatus = (FreeIPANodeStatus) o;
    if (!Objects.equals(this.hostname, freeIPANodeStatus.hostname)) {
      return false;
    }
    if (!Objects.equals(this.status, freeIPANodeStatus.status)) {
      return false;
    }
    if (!Objects.equals(this.issues, freeIPANodeStatus.issues)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, status, issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeIPANodeStatus {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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

