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
 * Endpoints for accessing the Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-22T17:07:45.249-08:00")
public class VwSummaryEndpoints  {

  /**
   * JDBC URL for Hive Virtual Warehouses.
   **/
  private String hiveJdbc = null;

  /**
   * JDBC URL for Impala Virtual Warehouses.
   **/
  private String impalaJdbc = null;

  /**
   * FENG JDBC URL for Impala Virtual Warehouses.
   **/
  private String impalaFENGJdbc = null;

  /**
   * Command to use impala-shell for Impala Virtual Warehouses.
   **/
  private String impalaShell = null;

  /**
   * URL of Hue for both Hive and Impala Virtual Warehouses.
   **/
  private String hue = null;

  /**
   * URL of Data Analytics Studio for Hive Virtual Warehouses.
   **/
  private String das = null;

  /**
   * Getter for hiveJdbc.
   * JDBC URL for Hive Virtual Warehouses.
   **/
  @JsonProperty("hiveJdbc")
  public String getHiveJdbc() {
    return hiveJdbc;
  }

  /**
   * Setter for hiveJdbc.
   * JDBC URL for Hive Virtual Warehouses.
   **/
  public void setHiveJdbc(String hiveJdbc) {
    this.hiveJdbc = hiveJdbc;
  }

  /**
   * Getter for impalaJdbc.
   * JDBC URL for Impala Virtual Warehouses.
   **/
  @JsonProperty("impalaJdbc")
  public String getImpalaJdbc() {
    return impalaJdbc;
  }

  /**
   * Setter for impalaJdbc.
   * JDBC URL for Impala Virtual Warehouses.
   **/
  public void setImpalaJdbc(String impalaJdbc) {
    this.impalaJdbc = impalaJdbc;
  }

  /**
   * Getter for impalaFENGJdbc.
   * FENG JDBC URL for Impala Virtual Warehouses.
   **/
  @JsonProperty("impalaFENGJdbc")
  public String getImpalaFENGJdbc() {
    return impalaFENGJdbc;
  }

  /**
   * Setter for impalaFENGJdbc.
   * FENG JDBC URL for Impala Virtual Warehouses.
   **/
  public void setImpalaFENGJdbc(String impalaFENGJdbc) {
    this.impalaFENGJdbc = impalaFENGJdbc;
  }

  /**
   * Getter for impalaShell.
   * Command to use impala-shell for Impala Virtual Warehouses.
   **/
  @JsonProperty("impalaShell")
  public String getImpalaShell() {
    return impalaShell;
  }

  /**
   * Setter for impalaShell.
   * Command to use impala-shell for Impala Virtual Warehouses.
   **/
  public void setImpalaShell(String impalaShell) {
    this.impalaShell = impalaShell;
  }

  /**
   * Getter for hue.
   * URL of Hue for both Hive and Impala Virtual Warehouses.
   **/
  @JsonProperty("hue")
  public String getHue() {
    return hue;
  }

  /**
   * Setter for hue.
   * URL of Hue for both Hive and Impala Virtual Warehouses.
   **/
  public void setHue(String hue) {
    this.hue = hue;
  }

  /**
   * Getter for das.
   * URL of Data Analytics Studio for Hive Virtual Warehouses.
   **/
  @JsonProperty("das")
  public String getDas() {
    return das;
  }

  /**
   * Setter for das.
   * URL of Data Analytics Studio for Hive Virtual Warehouses.
   **/
  public void setDas(String das) {
    this.das = das;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VwSummaryEndpoints vwSummaryEndpoints = (VwSummaryEndpoints) o;
    if (!Objects.equals(this.hiveJdbc, vwSummaryEndpoints.hiveJdbc)) {
      return false;
    }
    if (!Objects.equals(this.impalaJdbc, vwSummaryEndpoints.impalaJdbc)) {
      return false;
    }
    if (!Objects.equals(this.impalaFENGJdbc, vwSummaryEndpoints.impalaFENGJdbc)) {
      return false;
    }
    if (!Objects.equals(this.impalaShell, vwSummaryEndpoints.impalaShell)) {
      return false;
    }
    if (!Objects.equals(this.hue, vwSummaryEndpoints.hue)) {
      return false;
    }
    if (!Objects.equals(this.das, vwSummaryEndpoints.das)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiveJdbc, impalaJdbc, impalaFENGJdbc, impalaShell, hue, das);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VwSummaryEndpoints {\n");
    sb.append("    hiveJdbc: ").append(toIndentedString(hiveJdbc)).append("\n");
    sb.append("    impalaJdbc: ").append(toIndentedString(impalaJdbc)).append("\n");
    sb.append("    impalaFENGJdbc: ").append(toIndentedString(impalaFENGJdbc)).append("\n");
    sb.append("    impalaShell: ").append(toIndentedString(impalaShell)).append("\n");
    sb.append("    hue: ").append(toIndentedString(hue)).append("\n");
    sb.append("    das: ").append(toIndentedString(das)).append("\n");
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

