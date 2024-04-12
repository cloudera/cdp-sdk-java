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
import java.util.*;

/**
 * Request object for creating AWS IAM or Access &amp; Secret Key cloud credentials.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-11T13:44:55.151-07:00")
public class CreateAwsCredentialRequest  {

  /**
   * Name of the credential.
   **/
  private String name = null;

  /**
   * List of cluster CRNs where the credential should be created.
   **/
  private List<String> clusters = new ArrayList<String>();

  /**
   * Type of the credential. Additional required parameters by type: IAM: none; ACCESSKEY: accessKey, secretKey. Superfluous parameters are ignored. Providing IAM will create an IAM Role-based Authentication account in Cloudera Manager. Providing ACCESSKEY will create an AWS Access Key Authentication account in Cloudera Manager.
   **/
  private String type = null;

  /**
   * AWS access key.
   **/
  private String accessKey = null;

  /**
   * AWS secret key.
   **/
  private String secretKey = null;

  /**
   * Getter for name.
   * Name of the credential.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the credential.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for clusters.
   * List of cluster CRNs where the credential should be created.
   **/
  @JsonProperty("clusters")
  public List<String> getClusters() {
    return clusters;
  }

  /**
   * Setter for clusters.
   * List of cluster CRNs where the credential should be created.
   **/
  public void setClusters(List<String> clusters) {
    this.clusters = clusters;
  }

  /**
   * Getter for type.
   * Type of the credential. Additional required parameters by type: IAM: none; ACCESSKEY: accessKey, secretKey. Superfluous parameters are ignored. Providing IAM will create an IAM Role-based Authentication account in Cloudera Manager. Providing ACCESSKEY will create an AWS Access Key Authentication account in Cloudera Manager.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * Type of the credential. Additional required parameters by type: IAM: none; ACCESSKEY: accessKey, secretKey. Superfluous parameters are ignored. Providing IAM will create an IAM Role-based Authentication account in Cloudera Manager. Providing ACCESSKEY will create an AWS Access Key Authentication account in Cloudera Manager.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for accessKey.
   * AWS access key.
   **/
  @JsonProperty("accessKey")
  public String getAccessKey() {
    return accessKey;
  }

  /**
   * Setter for accessKey.
   * AWS access key.
   **/
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  /**
   * Getter for secretKey.
   * AWS secret key.
   **/
  @JsonProperty("secretKey")
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * Setter for secretKey.
   * AWS secret key.
   **/
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAwsCredentialRequest createAwsCredentialRequest = (CreateAwsCredentialRequest) o;
    if (!Objects.equals(this.name, createAwsCredentialRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.clusters, createAwsCredentialRequest.clusters)) {
      return false;
    }
    if (!Objects.equals(this.type, createAwsCredentialRequest.type)) {
      return false;
    }
    if (!Objects.equals(this.accessKey, createAwsCredentialRequest.accessKey)) {
      return false;
    }
    if (!Objects.equals(this.secretKey, createAwsCredentialRequest.secretKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusters, type, accessKey, secretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAwsCredentialRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

