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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Verification steps.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:24.443-08:00")
public class VerificationSteps  {

  /**
   * The cluster manager URL to reach the cluster's UI.
   **/
  private String clusterManagerUrl = null;

  /**
   * The list of manual steps to perform or verify.
   **/
  private List<String> steps = new ArrayList<String>();

  /**
   * Getter for clusterManagerUrl.
   * The cluster manager URL to reach the cluster&#39;s UI.
   **/
  @JsonProperty("clusterManagerUrl")
  public String getClusterManagerUrl() {
    return clusterManagerUrl;
  }

  /**
   * Setter for clusterManagerUrl.
   * The cluster manager URL to reach the cluster&#39;s UI.
   **/
  public void setClusterManagerUrl(String clusterManagerUrl) {
    this.clusterManagerUrl = clusterManagerUrl;
  }

  /**
   * Getter for steps.
   * The list of manual steps to perform or verify.
   **/
  @JsonProperty("steps")
  public List<String> getSteps() {
    return steps;
  }

  /**
   * Setter for steps.
   * The list of manual steps to perform or verify.
   **/
  public void setSteps(List<String> steps) {
    this.steps = steps;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationSteps verificationSteps = (VerificationSteps) o;
    if (!Objects.equals(this.clusterManagerUrl, verificationSteps.clusterManagerUrl)) {
      return false;
    }
    if (!Objects.equals(this.steps, verificationSteps.steps)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterManagerUrl, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationSteps {\n");
    sb.append("    clusterManagerUrl: ").append(toIndentedString(clusterManagerUrl)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

