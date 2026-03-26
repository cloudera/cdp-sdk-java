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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dfworkload.model.RpcDeployedFlow;

/**
 * Response object for stopping the NiFi flow.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-25T09:53:08.000-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class StopFlowInDeploymentResponse extends CdpResponse {

  /**
   * The deployment.
   **/
  private RpcDeployedFlow deployedFlow = null;

  /**
   * Getter for deployedFlow.
   * The deployment.
   **/
  @JsonProperty("deployedFlow")
  public RpcDeployedFlow getDeployedFlow() {
    return deployedFlow;
  }

  /**
   * Setter for deployedFlow.
   * The deployment.
   **/
  public void setDeployedFlow(RpcDeployedFlow deployedFlow) {
    this.deployedFlow = deployedFlow;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopFlowInDeploymentResponse stopFlowInDeploymentResponse = (StopFlowInDeploymentResponse) o;
    if (!Objects.equals(this.deployedFlow, stopFlowInDeploymentResponse.deployedFlow)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployedFlow, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopFlowInDeploymentResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deployedFlow: ").append(toIndentedString(deployedFlow)).append("\n");
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

