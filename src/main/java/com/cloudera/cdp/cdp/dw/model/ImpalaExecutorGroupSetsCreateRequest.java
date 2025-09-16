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
import com.cloudera.cdp.dw.model.ImpalaExecutorGroupSetCreateRequest;

/**
 * Configure executor group sets for workload aware autoscaling.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:41.843-07:00")
public class ImpalaExecutorGroupSetsCreateRequest  {

  /**
   * Configure small executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetCreateRequest small = null;

  /**
   * Configure first optional custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetCreateRequest custom1 = null;

  /**
   * Configure second optional custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetCreateRequest custom2 = null;

  /**
   * Configure third optional custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetCreateRequest custom3 = null;

  /**
   * Configure large executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetCreateRequest large = null;

  /**
   * Getter for small.
   * Configure small executor group set for workload aware autoscaling.
   **/
  @JsonProperty("small")
  public ImpalaExecutorGroupSetCreateRequest getSmall() {
    return small;
  }

  /**
   * Setter for small.
   * Configure small executor group set for workload aware autoscaling.
   **/
  public void setSmall(ImpalaExecutorGroupSetCreateRequest small) {
    this.small = small;
  }

  /**
   * Getter for custom1.
   * Configure first optional custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom1")
  public ImpalaExecutorGroupSetCreateRequest getCustom1() {
    return custom1;
  }

  /**
   * Setter for custom1.
   * Configure first optional custom executor group set for workload aware autoscaling.
   **/
  public void setCustom1(ImpalaExecutorGroupSetCreateRequest custom1) {
    this.custom1 = custom1;
  }

  /**
   * Getter for custom2.
   * Configure second optional custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom2")
  public ImpalaExecutorGroupSetCreateRequest getCustom2() {
    return custom2;
  }

  /**
   * Setter for custom2.
   * Configure second optional custom executor group set for workload aware autoscaling.
   **/
  public void setCustom2(ImpalaExecutorGroupSetCreateRequest custom2) {
    this.custom2 = custom2;
  }

  /**
   * Getter for custom3.
   * Configure third optional custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom3")
  public ImpalaExecutorGroupSetCreateRequest getCustom3() {
    return custom3;
  }

  /**
   * Setter for custom3.
   * Configure third optional custom executor group set for workload aware autoscaling.
   **/
  public void setCustom3(ImpalaExecutorGroupSetCreateRequest custom3) {
    this.custom3 = custom3;
  }

  /**
   * Getter for large.
   * Configure large executor group set for workload aware autoscaling.
   **/
  @JsonProperty("large")
  public ImpalaExecutorGroupSetCreateRequest getLarge() {
    return large;
  }

  /**
   * Setter for large.
   * Configure large executor group set for workload aware autoscaling.
   **/
  public void setLarge(ImpalaExecutorGroupSetCreateRequest large) {
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
    ImpalaExecutorGroupSetsCreateRequest impalaExecutorGroupSetsCreateRequest = (ImpalaExecutorGroupSetsCreateRequest) o;
    if (!Objects.equals(this.small, impalaExecutorGroupSetsCreateRequest.small)) {
      return false;
    }
    if (!Objects.equals(this.custom1, impalaExecutorGroupSetsCreateRequest.custom1)) {
      return false;
    }
    if (!Objects.equals(this.custom2, impalaExecutorGroupSetsCreateRequest.custom2)) {
      return false;
    }
    if (!Objects.equals(this.custom3, impalaExecutorGroupSetsCreateRequest.custom3)) {
      return false;
    }
    if (!Objects.equals(this.large, impalaExecutorGroupSetsCreateRequest.large)) {
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
    sb.append("class ImpalaExecutorGroupSetsCreateRequest {\n");
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

