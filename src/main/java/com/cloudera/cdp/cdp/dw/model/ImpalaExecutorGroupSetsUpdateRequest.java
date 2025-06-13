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
import com.cloudera.cdp.dw.model.ImpalaExecutorGroupSetUpdateRequest;

/**
 * Re-configure executor group sets for workload aware autoscaling.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:26.077-07:00")
public class ImpalaExecutorGroupSetsUpdateRequest  {

  /**
   * Re-configure small executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetUpdateRequest small = null;

  /**
   * Re-configure first optional custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetUpdateRequest custom1 = null;

  /**
   * Re-configure second optional custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetUpdateRequest custom2 = null;

  /**
   * Re-configure third optional custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetUpdateRequest custom3 = null;

  /**
   * Re-configure large executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetUpdateRequest large = null;

  /**
   * Getter for small.
   * Re-configure small executor group set for workload aware autoscaling.
   **/
  @JsonProperty("small")
  public ImpalaExecutorGroupSetUpdateRequest getSmall() {
    return small;
  }

  /**
   * Setter for small.
   * Re-configure small executor group set for workload aware autoscaling.
   **/
  public void setSmall(ImpalaExecutorGroupSetUpdateRequest small) {
    this.small = small;
  }

  /**
   * Getter for custom1.
   * Re-configure first optional custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom1")
  public ImpalaExecutorGroupSetUpdateRequest getCustom1() {
    return custom1;
  }

  /**
   * Setter for custom1.
   * Re-configure first optional custom executor group set for workload aware autoscaling.
   **/
  public void setCustom1(ImpalaExecutorGroupSetUpdateRequest custom1) {
    this.custom1 = custom1;
  }

  /**
   * Getter for custom2.
   * Re-configure second optional custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom2")
  public ImpalaExecutorGroupSetUpdateRequest getCustom2() {
    return custom2;
  }

  /**
   * Setter for custom2.
   * Re-configure second optional custom executor group set for workload aware autoscaling.
   **/
  public void setCustom2(ImpalaExecutorGroupSetUpdateRequest custom2) {
    this.custom2 = custom2;
  }

  /**
   * Getter for custom3.
   * Re-configure third optional custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom3")
  public ImpalaExecutorGroupSetUpdateRequest getCustom3() {
    return custom3;
  }

  /**
   * Setter for custom3.
   * Re-configure third optional custom executor group set for workload aware autoscaling.
   **/
  public void setCustom3(ImpalaExecutorGroupSetUpdateRequest custom3) {
    this.custom3 = custom3;
  }

  /**
   * Getter for large.
   * Re-configure large executor group set for workload aware autoscaling.
   **/
  @JsonProperty("large")
  public ImpalaExecutorGroupSetUpdateRequest getLarge() {
    return large;
  }

  /**
   * Setter for large.
   * Re-configure large executor group set for workload aware autoscaling.
   **/
  public void setLarge(ImpalaExecutorGroupSetUpdateRequest large) {
    this.large = large;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaExecutorGroupSetsUpdateRequest impalaExecutorGroupSetsUpdateRequest = (ImpalaExecutorGroupSetsUpdateRequest) o;
    if (!Objects.equals(this.small, impalaExecutorGroupSetsUpdateRequest.small)) {
      return false;
    }
    if (!Objects.equals(this.custom1, impalaExecutorGroupSetsUpdateRequest.custom1)) {
      return false;
    }
    if (!Objects.equals(this.custom2, impalaExecutorGroupSetsUpdateRequest.custom2)) {
      return false;
    }
    if (!Objects.equals(this.custom3, impalaExecutorGroupSetsUpdateRequest.custom3)) {
      return false;
    }
    if (!Objects.equals(this.large, impalaExecutorGroupSetsUpdateRequest.large)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, custom1, custom2, custom3, large);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaExecutorGroupSetsUpdateRequest {\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    custom1: ").append(toIndentedString(custom1)).append("\n");
    sb.append("    custom2: ").append(toIndentedString(custom2)).append("\n");
    sb.append("    custom3: ").append(toIndentedString(custom3)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
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

