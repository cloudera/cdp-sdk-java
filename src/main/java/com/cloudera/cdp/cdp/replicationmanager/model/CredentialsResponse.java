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
import com.cloudera.cdp.replicationmanager.model.CredentialCollection;

/**
 * Response object for cloud credentials.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:28.719-08:00")
public class CredentialsResponse extends CdpResponse {

  /**
   * Cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * Cluster URL.
   **/
  private String clusterUrl = null;

  /**
   * Replication engine type.
   **/
  private String replicationEngineType = null;

  /**
   * Cloud credentials.
   **/
  private CredentialCollection credentials = null;

  /**
   * Getter for clusterCrn.
   * Cluster CRN.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Cluster CRN.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for clusterUrl.
   * Cluster URL.
   **/
  @JsonProperty("clusterUrl")
  public String getClusterUrl() {
    return clusterUrl;
  }

  /**
   * Setter for clusterUrl.
   * Cluster URL.
   **/
  public void setClusterUrl(String clusterUrl) {
    this.clusterUrl = clusterUrl;
  }

  /**
   * Getter for replicationEngineType.
   * Replication engine type.
   **/
  @JsonProperty("replicationEngineType")
  public String getReplicationEngineType() {
    return replicationEngineType;
  }

  /**
   * Setter for replicationEngineType.
   * Replication engine type.
   **/
  public void setReplicationEngineType(String replicationEngineType) {
    this.replicationEngineType = replicationEngineType;
  }

  /**
   * Getter for credentials.
   * Cloud credentials.
   **/
  @JsonProperty("credentials")
  public CredentialCollection getCredentials() {
    return credentials;
  }

  /**
   * Setter for credentials.
   * Cloud credentials.
   **/
  public void setCredentials(CredentialCollection credentials) {
    this.credentials = credentials;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsResponse credentialsResponse = (CredentialsResponse) o;
    if (!Objects.equals(this.clusterCrn, credentialsResponse.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterUrl, credentialsResponse.clusterUrl)) {
      return false;
    }
    if (!Objects.equals(this.replicationEngineType, credentialsResponse.replicationEngineType)) {
      return false;
    }
    if (!Objects.equals(this.credentials, credentialsResponse.credentials)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, clusterUrl, replicationEngineType, credentials, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    clusterUrl: ").append(toIndentedString(clusterUrl)).append("\n");
    sb.append("    replicationEngineType: ").append(toIndentedString(replicationEngineType)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

