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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object to retrieve specific cloud credentials.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-01-04T11:10:11.417-08:00")
public class GetCredentialsRequest  {

  /**
   * CRN of the cluster where the credential is.
   **/
  private String clusterCrn = null;

  /**
   * Name of the credential. If both name and Id are specified, the Id is considered.
   **/
  private String credentialName = null;

  /**
   * Id of the credential. If both name and Id are specified, the Id is considered.
   **/
  private String credentialId = null;

  /**
   * Getter for clusterCrn.
   * CRN of the cluster where the credential is.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * CRN of the cluster where the credential is.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for credentialName.
   * Name of the credential. If both name and Id are specified, the Id is considered.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * Name of the credential. If both name and Id are specified, the Id is considered.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for credentialId.
   * Id of the credential. If both name and Id are specified, the Id is considered.
   **/
  @JsonProperty("credentialId")
  public String getCredentialId() {
    return credentialId;
  }

  /**
   * Setter for credentialId.
   * Id of the credential. If both name and Id are specified, the Id is considered.
   **/
  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCredentialsRequest getCredentialsRequest = (GetCredentialsRequest) o;
    if (!Objects.equals(this.clusterCrn, getCredentialsRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.credentialName, getCredentialsRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.credentialId, getCredentialsRequest.credentialId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, credentialName, credentialId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCredentialsRequest {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
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

