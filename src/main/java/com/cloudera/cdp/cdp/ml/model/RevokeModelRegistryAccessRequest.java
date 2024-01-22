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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the RevokeModelRegistry method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-19T13:24:33.475-08:00")
public class RevokeModelRegistryAccessRequest  {

  /**
   * The CRN of the Model Registry to grant access to.
   **/
  private String resourceCrn = null;

  /**
   * The cloud provider user id, such as ARN, which will be granted access to the model registry's Kubernetes cluster.
   **/
  private String identifier = null;

  /**
   * Getter for resourceCrn.
   * The CRN of the Model Registry to grant access to.
   **/
  @JsonProperty("resourceCrn")
  public String getResourceCrn() {
    return resourceCrn;
  }

  /**
   * Setter for resourceCrn.
   * The CRN of the Model Registry to grant access to.
   **/
  public void setResourceCrn(String resourceCrn) {
    this.resourceCrn = resourceCrn;
  }

  /**
   * Getter for identifier.
   * The cloud provider user id, such as ARN, which will be granted access to the model registry&#39;s Kubernetes cluster.
   **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Setter for identifier.
   * The cloud provider user id, such as ARN, which will be granted access to the model registry&#39;s Kubernetes cluster.
   **/
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeModelRegistryAccessRequest revokeModelRegistryAccessRequest = (RevokeModelRegistryAccessRequest) o;
    if (!Objects.equals(this.resourceCrn, revokeModelRegistryAccessRequest.resourceCrn)) {
      return false;
    }
    if (!Objects.equals(this.identifier, revokeModelRegistryAccessRequest.identifier)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCrn, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeModelRegistryAccessRequest {\n");
    sb.append("    resourceCrn: ").append(toIndentedString(resourceCrn)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

