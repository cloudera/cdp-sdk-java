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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Instance state counts response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:48.661-07:00")
public class CommonInstanceStateCounts  {

  /**
   * Number of instances in running state.
   **/
  private Long running = null;

  /**
   * Number of instances in creating state.
   **/
  private Long creating = null;

  /**
   * Number of instances in terminating state.
   **/
  private Long terminating = null;

  /**
   * Total number of instances.
   **/
  private Long total = null;

  /**
   * Getter for running.
   * Number of instances in running state.
   **/
  @JsonProperty("running")
  public Long getRunning() {
    return running;
  }

  /**
   * Setter for running.
   * Number of instances in running state.
   **/
  public void setRunning(Long running) {
    this.running = running;
  }

  /**
   * Getter for creating.
   * Number of instances in creating state.
   **/
  @JsonProperty("creating")
  public Long getCreating() {
    return creating;
  }

  /**
   * Setter for creating.
   * Number of instances in creating state.
   **/
  public void setCreating(Long creating) {
    this.creating = creating;
  }

  /**
   * Getter for terminating.
   * Number of instances in terminating state.
   **/
  @JsonProperty("terminating")
  public Long getTerminating() {
    return terminating;
  }

  /**
   * Setter for terminating.
   * Number of instances in terminating state.
   **/
  public void setTerminating(Long terminating) {
    this.terminating = terminating;
  }

  /**
   * Getter for total.
   * Total number of instances.
   **/
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  /**
   * Setter for total.
   * Total number of instances.
   **/
  public void setTotal(Long total) {
    this.total = total;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonInstanceStateCounts commonInstanceStateCounts = (CommonInstanceStateCounts) o;
    if (!Objects.equals(this.running, commonInstanceStateCounts.running)) {
      return false;
    }
    if (!Objects.equals(this.creating, commonInstanceStateCounts.creating)) {
      return false;
    }
    if (!Objects.equals(this.terminating, commonInstanceStateCounts.terminating)) {
      return false;
    }
    if (!Objects.equals(this.total, commonInstanceStateCounts.total)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(running, creating, terminating, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonInstanceStateCounts {\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    creating: ").append(toIndentedString(creating)).append("\n");
    sb.append("    terminating: ").append(toIndentedString(terminating)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

