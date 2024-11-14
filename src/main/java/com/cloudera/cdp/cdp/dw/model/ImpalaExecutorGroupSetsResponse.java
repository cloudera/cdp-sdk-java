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
import com.cloudera.cdp.dw.model.ImpalaExecutorGroupSetResponse;

/**
 * Describes executor group sets for workload aware autoscaling.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:24.581-08:00")
public class ImpalaExecutorGroupSetsResponse extends CdpResponse {

  /**
   * Describes small executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetResponse small = null;

  /**
   * Describes first custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetResponse custom1 = null;

  /**
   * Describes second custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetResponse custom2 = null;

  /**
   * Describes third custom executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetResponse custom3 = null;

  /**
   * Describes large executor group set for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetResponse large = null;

  /**
   * Getter for small.
   * Describes small executor group set for workload aware autoscaling.
   **/
  @JsonProperty("small")
  public ImpalaExecutorGroupSetResponse getSmall() {
    return small;
  }

  /**
   * Setter for small.
   * Describes small executor group set for workload aware autoscaling.
   **/
  public void setSmall(ImpalaExecutorGroupSetResponse small) {
    this.small = small;
  }

  /**
   * Getter for custom1.
   * Describes first custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom1")
  public ImpalaExecutorGroupSetResponse getCustom1() {
    return custom1;
  }

  /**
   * Setter for custom1.
   * Describes first custom executor group set for workload aware autoscaling.
   **/
  public void setCustom1(ImpalaExecutorGroupSetResponse custom1) {
    this.custom1 = custom1;
  }

  /**
   * Getter for custom2.
   * Describes second custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom2")
  public ImpalaExecutorGroupSetResponse getCustom2() {
    return custom2;
  }

  /**
   * Setter for custom2.
   * Describes second custom executor group set for workload aware autoscaling.
   **/
  public void setCustom2(ImpalaExecutorGroupSetResponse custom2) {
    this.custom2 = custom2;
  }

  /**
   * Getter for custom3.
   * Describes third custom executor group set for workload aware autoscaling.
   **/
  @JsonProperty("custom3")
  public ImpalaExecutorGroupSetResponse getCustom3() {
    return custom3;
  }

  /**
   * Setter for custom3.
   * Describes third custom executor group set for workload aware autoscaling.
   **/
  public void setCustom3(ImpalaExecutorGroupSetResponse custom3) {
    this.custom3 = custom3;
  }

  /**
   * Getter for large.
   * Describes large executor group set for workload aware autoscaling.
   **/
  @JsonProperty("large")
  public ImpalaExecutorGroupSetResponse getLarge() {
    return large;
  }

  /**
   * Setter for large.
   * Describes large executor group set for workload aware autoscaling.
   **/
  public void setLarge(ImpalaExecutorGroupSetResponse large) {
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
    ImpalaExecutorGroupSetsResponse impalaExecutorGroupSetsResponse = (ImpalaExecutorGroupSetsResponse) o;
    if (!Objects.equals(this.small, impalaExecutorGroupSetsResponse.small)) {
      return false;
    }
    if (!Objects.equals(this.custom1, impalaExecutorGroupSetsResponse.custom1)) {
      return false;
    }
    if (!Objects.equals(this.custom2, impalaExecutorGroupSetsResponse.custom2)) {
      return false;
    }
    if (!Objects.equals(this.custom3, impalaExecutorGroupSetsResponse.custom3)) {
      return false;
    }
    if (!Objects.equals(this.large, impalaExecutorGroupSetsResponse.large)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, custom1, custom2, custom3, large, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaExecutorGroupSetsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

