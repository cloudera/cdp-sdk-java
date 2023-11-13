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
import com.cloudera.cdp.opdb.model.Connector;
import com.cloudera.cdp.opdb.model.KerberosConfiguration;
import java.util.*;

/**
 * A response with client API connectivity to a database.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-11-09T15:08:29.844-08:00")
public class DescribeClientConnectivityResponse extends CdpResponse {

  /**
   * Available connectors for this database
   **/
  private List<Connector> connectors = new ArrayList<Connector>();

  /**
   * Kerberos configuration information
   **/
  private KerberosConfiguration kerberosConfiguration = null;

  /**
   * Getter for connectors.
   * Available connectors for this database
   **/
  @JsonProperty("connectors")
  public List<Connector> getConnectors() {
    return connectors;
  }

  /**
   * Setter for connectors.
   * Available connectors for this database
   **/
  public void setConnectors(List<Connector> connectors) {
    this.connectors = connectors;
  }

  /**
   * Getter for kerberosConfiguration.
   * Kerberos configuration information
   **/
  @JsonProperty("kerberosConfiguration")
  public KerberosConfiguration getKerberosConfiguration() {
    return kerberosConfiguration;
  }

  /**
   * Setter for kerberosConfiguration.
   * Kerberos configuration information
   **/
  public void setKerberosConfiguration(KerberosConfiguration kerberosConfiguration) {
    this.kerberosConfiguration = kerberosConfiguration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeClientConnectivityResponse describeClientConnectivityResponse = (DescribeClientConnectivityResponse) o;
    if (!Objects.equals(this.connectors, describeClientConnectivityResponse.connectors)) {
      return false;
    }
    if (!Objects.equals(this.kerberosConfiguration, describeClientConnectivityResponse.kerberosConfiguration)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectors, kerberosConfiguration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeClientConnectivityResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
    sb.append("    kerberosConfiguration: ").append(toIndentedString(kerberosConfiguration)).append("\n");
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

