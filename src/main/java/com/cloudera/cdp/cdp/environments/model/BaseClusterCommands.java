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

/**
 * The commands to be run on the base cluster for trust setup.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:52.207-07:00")
public class BaseClusterCommands  {

  /**
   * Configuration entries to be added to the Kerberos KDC configuration file on the base cluster.
   **/
  private String krb5Conf = null;

  /**
   * Getter for krb5Conf.
   * Configuration entries to be added to the Kerberos KDC configuration file on the base cluster.
   **/
  @JsonProperty("krb5Conf")
  public String getKrb5Conf() {
    return krb5Conf;
  }

  /**
   * Setter for krb5Conf.
   * Configuration entries to be added to the Kerberos KDC configuration file on the base cluster.
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
    BaseClusterCommands baseClusterCommands = (BaseClusterCommands) o;
    if (!Objects.equals(this.krb5Conf, baseClusterCommands.krb5Conf)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(krb5Conf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseClusterCommands {\n");
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

