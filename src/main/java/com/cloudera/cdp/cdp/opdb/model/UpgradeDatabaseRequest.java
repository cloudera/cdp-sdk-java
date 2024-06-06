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
 * Asynchronous request to upgrade the CDP Runtime for a database.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:30:59.518-07:00")
public class UpgradeDatabaseRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environment = null;

  /**
   * The name or CRN of the database.
   **/
  private String database = null;

  /**
   * The CDP Runtime version to upgrade to.
   **/
  private String runtime = null;

  /**
   * Only perform an Operating System upgrade.
   **/
  private Boolean osUpgradeOnly = null;

  /**
   * Getter for environment.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for database.
   * The name or CRN of the database.
   **/
  @JsonProperty("database")
  public String getDatabase() {
    return database;
  }

  /**
   * Setter for database.
   * The name or CRN of the database.
   **/
  public void setDatabase(String database) {
    this.database = database;
  }

  /**
   * Getter for runtime.
   * The CDP Runtime version to upgrade to.
   **/
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }

  /**
   * Setter for runtime.
   * The CDP Runtime version to upgrade to.
   **/
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  /**
   * Getter for osUpgradeOnly.
   * Only perform an Operating System upgrade.
   **/
  @JsonProperty("osUpgradeOnly")
  public Boolean getOsUpgradeOnly() {
    return osUpgradeOnly;
  }

  /**
   * Setter for osUpgradeOnly.
   * Only perform an Operating System upgrade.
   **/
  public void setOsUpgradeOnly(Boolean osUpgradeOnly) {
    this.osUpgradeOnly = osUpgradeOnly;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDatabaseRequest upgradeDatabaseRequest = (UpgradeDatabaseRequest) o;
    if (!Objects.equals(this.environment, upgradeDatabaseRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.database, upgradeDatabaseRequest.database)) {
      return false;
    }
    if (!Objects.equals(this.runtime, upgradeDatabaseRequest.runtime)) {
      return false;
    }
    if (!Objects.equals(this.osUpgradeOnly, upgradeDatabaseRequest.osUpgradeOnly)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, database, runtime, osUpgradeOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDatabaseRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    osUpgradeOnly: ").append(toIndentedString(osUpgradeOnly)).append("\n");
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

