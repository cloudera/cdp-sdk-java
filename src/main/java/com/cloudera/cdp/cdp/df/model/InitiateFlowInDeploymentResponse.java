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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A response from initiating the flow creation process in a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:53.893-07:00")
public class InitiateFlowInDeploymentResponse extends CdpResponse {

  /**
   * The CRN of the newly created flow deployment request.
   **/
  private String deployedFlowRequestCrn = null;

  /**
   * The base URL of the dfx-local instance where the flow deployment will eventually be created.
   **/
  private String dfxLocalUrl = null;

  /**
   * Getter for deployedFlowRequestCrn.
   * The CRN of the newly created flow deployment request.
   **/
  @JsonProperty("deployedFlowRequestCrn")
  public String getDeployedFlowRequestCrn() {
    return deployedFlowRequestCrn;
  }

  /**
   * Setter for deployedFlowRequestCrn.
   * The CRN of the newly created flow deployment request.
   **/
  public void setDeployedFlowRequestCrn(String deployedFlowRequestCrn) {
    this.deployedFlowRequestCrn = deployedFlowRequestCrn;
  }

  /**
   * Getter for dfxLocalUrl.
   * The base URL of the dfx-local instance where the flow deployment will eventually be created.
   **/
  @JsonProperty("dfxLocalUrl")
  public String getDfxLocalUrl() {
    return dfxLocalUrl;
  }

  /**
   * Setter for dfxLocalUrl.
   * The base URL of the dfx-local instance where the flow deployment will eventually be created.
   **/
  public void setDfxLocalUrl(String dfxLocalUrl) {
    this.dfxLocalUrl = dfxLocalUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateFlowInDeploymentResponse initiateFlowInDeploymentResponse = (InitiateFlowInDeploymentResponse) o;
    if (!Objects.equals(this.deployedFlowRequestCrn, initiateFlowInDeploymentResponse.deployedFlowRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.dfxLocalUrl, initiateFlowInDeploymentResponse.dfxLocalUrl)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployedFlowRequestCrn, dfxLocalUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFlowInDeploymentResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deployedFlowRequestCrn: ").append(toIndentedString(deployedFlowRequestCrn)).append("\n");
    sb.append("    dfxLocalUrl: ").append(toIndentedString(dfxLocalUrl)).append("\n");
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

