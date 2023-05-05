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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Describes which authentication methods are supported on this Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-05-04T19:25:13.802-07:00")
public class VwSummarySupportedAuthMethods  {

  /**
   * Indicates if username/password access to this Virtual Warehouse is supported.
   **/
  private Boolean ldap = null;

  /**
   * Indicates if JWT auth is supported on this Virtual Warehouse.
   **/
  private Boolean jwt = null;

  /**
   * Indicates if SSO auth is supported on this Virtual Warehouse.
   **/
  private Boolean sso = null;

  /**
   * Getter for ldap.
   * Indicates if username/password access to this Virtual Warehouse is supported.
   **/
  @JsonProperty("ldap")
  public Boolean getLdap() {
    return ldap;
  }

  /**
   * Setter for ldap.
   * Indicates if username/password access to this Virtual Warehouse is supported.
   **/
  public void setLdap(Boolean ldap) {
    this.ldap = ldap;
  }

  /**
   * Getter for jwt.
   * Indicates if JWT auth is supported on this Virtual Warehouse.
   **/
  @JsonProperty("jwt")
  public Boolean getJwt() {
    return jwt;
  }

  /**
   * Setter for jwt.
   * Indicates if JWT auth is supported on this Virtual Warehouse.
   **/
  public void setJwt(Boolean jwt) {
    this.jwt = jwt;
  }

  /**
   * Getter for sso.
   * Indicates if SSO auth is supported on this Virtual Warehouse.
   **/
  @JsonProperty("sso")
  public Boolean getSso() {
    return sso;
  }

  /**
   * Setter for sso.
   * Indicates if SSO auth is supported on this Virtual Warehouse.
   **/
  public void setSso(Boolean sso) {
    this.sso = sso;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VwSummarySupportedAuthMethods vwSummarySupportedAuthMethods = (VwSummarySupportedAuthMethods) o;
    if (!Objects.equals(this.ldap, vwSummarySupportedAuthMethods.ldap)) {
      return false;
    }
    if (!Objects.equals(this.jwt, vwSummarySupportedAuthMethods.jwt)) {
      return false;
    }
    if (!Objects.equals(this.sso, vwSummarySupportedAuthMethods.sso)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldap, jwt, sso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VwSummarySupportedAuthMethods {\n");
    sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    sso: ").append(toIndentedString(sso)).append("\n");
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
