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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Configuration information to enable Kerberos authentication
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-10-05T14:03:45.643-07:00")
public class KerberosConfiguration  {

  /**
   * The hostname of the KDC
   **/
  private String kdcHost = null;

  /**
   * The Kerberos realm
   **/
  private String realm = null;

  /**
   * A base64-encoded krb5.conf file
   **/
  private String krb5Conf = null;

  /**
   * Getter for kdcHost.
   * The hostname of the KDC
   **/
  @JsonProperty("kdcHost")
  public String getKdcHost() {
    return kdcHost;
  }

  /**
   * Setter for kdcHost.
   * The hostname of the KDC
   **/
  public void setKdcHost(String kdcHost) {
    this.kdcHost = kdcHost;
  }

  /**
   * Getter for realm.
   * The Kerberos realm
   **/
  @JsonProperty("realm")
  public String getRealm() {
    return realm;
  }

  /**
   * Setter for realm.
   * The Kerberos realm
   **/
  public void setRealm(String realm) {
    this.realm = realm;
  }

  /**
   * Getter for krb5Conf.
   * A base64-encoded krb5.conf file
   **/
  @JsonProperty("krb5Conf")
  public String getKrb5Conf() {
    return krb5Conf;
  }

  /**
   * Setter for krb5Conf.
   * A base64-encoded krb5.conf file
   **/
  public void setKrb5Conf(String krb5Conf) {
    this.krb5Conf = krb5Conf;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KerberosConfiguration kerberosConfiguration = (KerberosConfiguration) o;
    if (!Objects.equals(this.kdcHost, kerberosConfiguration.kdcHost)) {
      return false;
    }
    if (!Objects.equals(this.realm, kerberosConfiguration.realm)) {
      return false;
    }
    if (!Objects.equals(this.krb5Conf, kerberosConfiguration.krb5Conf)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kdcHost, realm, krb5Conf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KerberosConfiguration {\n");
    sb.append("    kdcHost: ").append(toIndentedString(kdcHost)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    krb5Conf: ").append(toIndentedString(krb5Conf)).append("\n");
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

