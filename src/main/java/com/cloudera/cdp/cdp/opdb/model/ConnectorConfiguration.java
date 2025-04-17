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
import com.cloudera.cdp.opdb.model.ClientConfigurationDetails;
import java.util.*;

/**
 * Runtime details necessary to use a connector.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:14.354-07:00")
public class ConnectorConfiguration  {

  /**
   * Configuration information required to use a Connector
   **/
  private List<ClientConfigurationDetails> clientConfigurationDetails = new ArrayList<ClientConfigurationDetails>();

  /**
   * A base JDBC URL if the connector is a JDBC driver.
   **/
  private String jdbcUrl = null;

  /**
   * A base service URL
   **/
  private String serviceUrl = null;

  /**
   * Getter for clientConfigurationDetails.
   * Configuration information required to use a Connector
   **/
  @JsonProperty("clientConfigurationDetails")
  public List<ClientConfigurationDetails> getClientConfigurationDetails() {
    return clientConfigurationDetails;
  }

  /**
   * Setter for clientConfigurationDetails.
   * Configuration information required to use a Connector
   **/
  public void setClientConfigurationDetails(List<ClientConfigurationDetails> clientConfigurationDetails) {
    this.clientConfigurationDetails = clientConfigurationDetails;
  }

  /**
   * Getter for jdbcUrl.
   * A base JDBC URL if the connector is a JDBC driver.
   **/
  @JsonProperty("jdbcUrl")
  public String getJdbcUrl() {
    return jdbcUrl;
  }

  /**
   * Setter for jdbcUrl.
   * A base JDBC URL if the connector is a JDBC driver.
   **/
  public void setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
  }

  /**
   * Getter for serviceUrl.
   * A base service URL
   **/
  @JsonProperty("serviceUrl")
  public String getServiceUrl() {
    return serviceUrl;
  }

  /**
   * Setter for serviceUrl.
   * A base service URL
   **/
  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorConfiguration connectorConfiguration = (ConnectorConfiguration) o;
    if (!Objects.equals(this.clientConfigurationDetails, connectorConfiguration.clientConfigurationDetails)) {
      return false;
    }
    if (!Objects.equals(this.jdbcUrl, connectorConfiguration.jdbcUrl)) {
      return false;
    }
    if (!Objects.equals(this.serviceUrl, connectorConfiguration.serviceUrl)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientConfigurationDetails, jdbcUrl, serviceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorConfiguration {\n");
    sb.append("    clientConfigurationDetails: ").append(toIndentedString(clientConfigurationDetails)).append("\n");
    sb.append("    jdbcUrl: ").append(toIndentedString(jdbcUrl)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
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

