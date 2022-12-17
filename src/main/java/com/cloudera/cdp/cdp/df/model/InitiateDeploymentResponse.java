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
 * A response from initiating a deployment
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-12-16T12:55:42.233-08:00")
public class InitiateDeploymentResponse extends CdpResponse {

  /**
   * The newly created deployment request CRN.
   **/
  private String deploymentRequestCrn = null;

  /**
   * Base URL to the dfx-local instance running an eventually created deployment
   **/
  private String dfxLocalUrl = null;

  /**
   * Getter for deploymentRequestCrn.
   * The newly created deployment request CRN.
   **/
  @JsonProperty("deploymentRequestCrn")
  public String getDeploymentRequestCrn() {
    return deploymentRequestCrn;
  }

  /**
   * Setter for deploymentRequestCrn.
   * The newly created deployment request CRN.
   **/
  public void setDeploymentRequestCrn(String deploymentRequestCrn) {
    this.deploymentRequestCrn = deploymentRequestCrn;
  }

  /**
   * Getter for dfxLocalUrl.
   * Base URL to the dfx-local instance running an eventually created deployment
   **/
  @JsonProperty("dfxLocalUrl")
  public String getDfxLocalUrl() {
    return dfxLocalUrl;
  }

  /**
   * Setter for dfxLocalUrl.
   * Base URL to the dfx-local instance running an eventually created deployment
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
    InitiateDeploymentResponse initiateDeploymentResponse = (InitiateDeploymentResponse) o;
    if (!Objects.equals(this.deploymentRequestCrn, initiateDeploymentResponse.deploymentRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.dfxLocalUrl, initiateDeploymentResponse.dfxLocalUrl)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentRequestCrn, dfxLocalUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDeploymentResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deploymentRequestCrn: ").append(toIndentedString(deploymentRequestCrn)).append("\n");
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

