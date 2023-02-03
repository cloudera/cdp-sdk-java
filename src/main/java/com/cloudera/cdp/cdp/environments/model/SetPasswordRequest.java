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
 * Request object for set password request. (deprecated)
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-02T11:31:00.095-08:00")
public class SetPasswordRequest  {

  /**
   * password field.
   **/
  private String password = null;

  /**
   * Optional list of environment CRNs. Only the passed environments user's password will be affected. If this field is not present, all environments will be affected.
   **/
  private List<String> environmentCRNs = new ArrayList<String>();

  /**
   * Getter for password.
   * password field.
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * password field.
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Getter for environmentCRNs.
   * Optional list of environment CRNs. Only the passed environments user&#39;s password will be affected. If this field is not present, all environments will be affected.
   **/
  @JsonProperty("environmentCRNs")
  public List<String> getEnvironmentCRNs() {
    return environmentCRNs;
  }

  /**
   * Setter for environmentCRNs.
   * Optional list of environment CRNs. Only the passed environments user&#39;s password will be affected. If this field is not present, all environments will be affected.
   **/
  public void setEnvironmentCRNs(List<String> environmentCRNs) {
    this.environmentCRNs = environmentCRNs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPasswordRequest setPasswordRequest = (SetPasswordRequest) o;
    if (!Objects.equals(this.password, setPasswordRequest.password)) {
      return false;
    }
    if (!Objects.equals(this.environmentCRNs, setPasswordRequest.environmentCRNs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, environmentCRNs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPasswordRequest {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    environmentCRNs: ").append(toIndentedString(environmentCRNs)).append("\n");
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

