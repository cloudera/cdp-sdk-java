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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Object which holds some details of an instance for the given cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-01-06T10:11:17.686-08:00")
public class Instance  {

  /**
   * The ID of the given instance.
   **/
  private String id = null;

  /**
   * The health state of the instance. UNHEALTHY represents instances with unhealthy services, lost instances, or failed operations.
   **/
  private String state = null;

  /**
   * The private ip of the given instance.
   **/
  private String privateIp = null;

  /**
   * The public ip of the given instance.
   **/
  private String publicIp = null;

  /**
   * The FQDN for the instance
   **/
  private String fqdn = null;

  /**
   * The status of the instance. This includes information like whether the instance is being provisioned, stopped, decommissioning failures etc.
   **/
  private String status = null;

  /**
   * Getter for id.
   * The ID of the given instance.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the given instance.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for state.
   * The health state of the instance. UNHEALTHY represents instances with unhealthy services, lost instances, or failed operations.
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The health state of the instance. UNHEALTHY represents instances with unhealthy services, lost instances, or failed operations.
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for privateIp.
   * The private ip of the given instance.
   **/
  @JsonProperty("privateIp")
  public String getPrivateIp() {
    return privateIp;
  }

  /**
   * Setter for privateIp.
   * The private ip of the given instance.
   **/
  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }

  /**
   * Getter for publicIp.
   * The public ip of the given instance.
   **/
  @JsonProperty("publicIp")
  public String getPublicIp() {
    return publicIp;
  }

  /**
   * Setter for publicIp.
   * The public ip of the given instance.
   **/
  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }

  /**
   * Getter for fqdn.
   * The FQDN for the instance
   **/
  @JsonProperty("fqdn")
  public String getFqdn() {
    return fqdn;
  }

  /**
   * Setter for fqdn.
   * The FQDN for the instance
   **/
  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  /**
   * Getter for status.
   * The status of the instance. This includes information like whether the instance is being provisioned, stopped, decommissioning failures etc.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the instance. This includes information like whether the instance is being provisioned, stopped, decommissioning failures etc.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    if (!Objects.equals(this.id, instance.id)) {
      return false;
    }
    if (!Objects.equals(this.state, instance.state)) {
      return false;
    }
    if (!Objects.equals(this.privateIp, instance.privateIp)) {
      return false;
    }
    if (!Objects.equals(this.publicIp, instance.publicIp)) {
      return false;
    }
    if (!Objects.equals(this.fqdn, instance.fqdn)) {
      return false;
    }
    if (!Objects.equals(this.status, instance.status)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, privateIp, publicIp, fqdn, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

