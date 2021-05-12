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

/**
 * Request object for the describeConfigDiff method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-05-12T14:54:20.607-07:00")
public class DescribeConfigDiffRequest  {

  /**
   * ID of the cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the old service configuration.
   **/
  private String fromConfigId = null;

  /**
   * ID of the new service configuration.
   **/
  private String toConfigId = null;

  /**
   * Getter for clusterId.
   * ID of the cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of the cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for fromConfigId.
   * ID of the old service configuration.
   **/
  @JsonProperty("fromConfigId")
  public String getFromConfigId() {
    return fromConfigId;
  }

  /**
   * Setter for fromConfigId.
   * ID of the old service configuration.
   **/
  public void setFromConfigId(String fromConfigId) {
    this.fromConfigId = fromConfigId;
  }

  /**
   * Getter for toConfigId.
   * ID of the new service configuration.
   **/
  @JsonProperty("toConfigId")
  public String getToConfigId() {
    return toConfigId;
  }

  /**
   * Setter for toConfigId.
   * ID of the new service configuration.
   **/
  public void setToConfigId(String toConfigId) {
    this.toConfigId = toConfigId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeConfigDiffRequest describeConfigDiffRequest = (DescribeConfigDiffRequest) o;
    if (!Objects.equals(this.clusterId, describeConfigDiffRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.fromConfigId, describeConfigDiffRequest.fromConfigId)) {
      return false;
    }
    if (!Objects.equals(this.toConfigId, describeConfigDiffRequest.toConfigId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, fromConfigId, toConfigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeConfigDiffRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    fromConfigId: ").append(toIndentedString(fromConfigId)).append("\n");
    sb.append("    toConfigId: ").append(toIndentedString(toConfigId)).append("\n");
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

