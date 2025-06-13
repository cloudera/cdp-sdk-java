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
 * Request object for the RevokeMlServingAppAccess method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:26.860-07:00")
public class RevokeMlServingAppAccessRequest  {

  /**
   * The CRN of the Cloudera AI Inference Service instance to revoke access.
   **/
  private String resourceCrn = null;

  /**
   * The cloud provider user ID, such as ARN, from which access to the Cloudera AI Inference Service Kubernetes cluster needs to be revoked.
   **/
  private String identifier = null;

  /**
   * Getter for resourceCrn.
   * The CRN of the Cloudera AI Inference Service instance to revoke access.
   **/
  @JsonProperty("resourceCrn")
  public String getResourceCrn() {
    return resourceCrn;
  }

  /**
   * Setter for resourceCrn.
   * The CRN of the Cloudera AI Inference Service instance to revoke access.
   **/
  public void setResourceCrn(String resourceCrn) {
    this.resourceCrn = resourceCrn;
  }

  /**
   * Getter for identifier.
   * The cloud provider user ID, such as ARN, from which access to the Cloudera AI Inference Service Kubernetes cluster needs to be revoked.
   **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Setter for identifier.
   * The cloud provider user ID, such as ARN, from which access to the Cloudera AI Inference Service Kubernetes cluster needs to be revoked.
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
    RevokeMlServingAppAccessRequest revokeMlServingAppAccessRequest = (RevokeMlServingAppAccessRequest) o;
    if (!Objects.equals(this.resourceCrn, revokeMlServingAppAccessRequest.resourceCrn)) {
      return false;
    }
    if (!Objects.equals(this.identifier, revokeMlServingAppAccessRequest.identifier)) {
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
    sb.append("class RevokeMlServingAppAccessRequest {\n");
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

