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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object to check connectivity to private cloud environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:46.489-08:00")
public class CheckEnvironmentConnectivityRequest  {

  /**
   * The address of the Cloudera Manager managing the Datalake cluster.
   **/
  private String address = null;

  /**
   * User name for accessing the Cloudera Manager.
   **/
  private String user = null;

  /**
   * A string (text or json) used to authenticate to the Cloudera Manager.
   **/
  private String authenticationToken = null;

  /**
   * How to interpret the authenticationToken field. Defaults to CLEARTEXT_PASSWORD.
   **/
  private String authenticationTokenType = null;

  /**
   * The name of the cluster(s) to use as a Datalake for the environment.
   **/
  private List<String> clusterNames = new ArrayList<String>();

  /**
   * Getter for address.
   * The address of the Cloudera Manager managing the Datalake cluster.
   **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  /**
   * Setter for address.
   * The address of the Cloudera Manager managing the Datalake cluster.
   **/
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Getter for user.
   * User name for accessing the Cloudera Manager.
   **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Setter for user.
   * User name for accessing the Cloudera Manager.
   **/
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Getter for authenticationToken.
   * A string (text or json) used to authenticate to the Cloudera Manager.
   **/
  @JsonProperty("authenticationToken")
  public String getAuthenticationToken() {
    return authenticationToken;
  }

  /**
   * Setter for authenticationToken.
   * A string (text or json) used to authenticate to the Cloudera Manager.
   **/
  public void setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
  }

  /**
   * Getter for authenticationTokenType.
   * How to interpret the authenticationToken field. Defaults to CLEARTEXT_PASSWORD.
   **/
  @JsonProperty("authenticationTokenType")
  public String getAuthenticationTokenType() {
    return authenticationTokenType;
  }

  /**
   * Setter for authenticationTokenType.
   * How to interpret the authenticationToken field. Defaults to CLEARTEXT_PASSWORD.
   **/
  public void setAuthenticationTokenType(String authenticationTokenType) {
    this.authenticationTokenType = authenticationTokenType;
  }

  /**
   * Getter for clusterNames.
   * The name of the cluster(s) to use as a Datalake for the environment.
   **/
  @JsonProperty("clusterNames")
  public List<String> getClusterNames() {
    return clusterNames;
  }

  /**
   * Setter for clusterNames.
   * The name of the cluster(s) to use as a Datalake for the environment.
   **/
  public void setClusterNames(List<String> clusterNames) {
    this.clusterNames = clusterNames;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckEnvironmentConnectivityRequest checkEnvironmentConnectivityRequest = (CheckEnvironmentConnectivityRequest) o;
    if (!Objects.equals(this.address, checkEnvironmentConnectivityRequest.address)) {
      return false;
    }
    if (!Objects.equals(this.user, checkEnvironmentConnectivityRequest.user)) {
      return false;
    }
    if (!Objects.equals(this.authenticationToken, checkEnvironmentConnectivityRequest.authenticationToken)) {
      return false;
    }
    if (!Objects.equals(this.authenticationTokenType, checkEnvironmentConnectivityRequest.authenticationTokenType)) {
      return false;
    }
    if (!Objects.equals(this.clusterNames, checkEnvironmentConnectivityRequest.clusterNames)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, user, authenticationToken, authenticationTokenType, clusterNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckEnvironmentConnectivityRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    authenticationToken: ").append(toIndentedString(authenticationToken)).append("\n");
    sb.append("    authenticationTokenType: ").append(toIndentedString(authenticationTokenType)).append("\n");
    sb.append("    clusterNames: ").append(toIndentedString(clusterNames)).append("\n");
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

