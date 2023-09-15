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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.HiveDatabaseAndTables;
import java.util.*;

/**
 * Hive replication arguments.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:20.396-07:00")
public class HiveArguments  {

  /**
   * Scope of the replication.
   **/
  private List<HiveDatabaseAndTables> databasesAndTables = new ArrayList<HiveDatabaseAndTables>();

  /**
   * Include or exclude Sentry permissions.
   **/
  private String sentryPermissions = null;

  /**
   * Skip URL permissions.
   **/
  private Boolean skipUrlPermissions = null;

  /**
   * Number of threads to use during replication.
   **/
  private Long numThreads = null;

  /**
   * Getter for databasesAndTables.
   * Scope of the replication.
   **/
  @JsonProperty("databasesAndTables")
  public List<HiveDatabaseAndTables> getDatabasesAndTables() {
    return databasesAndTables;
  }

  /**
   * Setter for databasesAndTables.
   * Scope of the replication.
   **/
  public void setDatabasesAndTables(List<HiveDatabaseAndTables> databasesAndTables) {
    this.databasesAndTables = databasesAndTables;
  }

  /**
   * Getter for sentryPermissions.
   * Include or exclude Sentry permissions.
   **/
  @JsonProperty("sentryPermissions")
  public String getSentryPermissions() {
    return sentryPermissions;
  }

  /**
   * Setter for sentryPermissions.
   * Include or exclude Sentry permissions.
   **/
  public void setSentryPermissions(String sentryPermissions) {
    this.sentryPermissions = sentryPermissions;
  }

  /**
   * Getter for skipUrlPermissions.
   * Skip URL permissions.
   **/
  @JsonProperty("skipUrlPermissions")
  public Boolean getSkipUrlPermissions() {
    return skipUrlPermissions;
  }

  /**
   * Setter for skipUrlPermissions.
   * Skip URL permissions.
   **/
  public void setSkipUrlPermissions(Boolean skipUrlPermissions) {
    this.skipUrlPermissions = skipUrlPermissions;
  }

  /**
   * Getter for numThreads.
   * Number of threads to use during replication.
   **/
  @JsonProperty("numThreads")
  public Long getNumThreads() {
    return numThreads;
  }

  /**
   * Setter for numThreads.
   * Number of threads to use during replication.
   **/
  public void setNumThreads(Long numThreads) {
    this.numThreads = numThreads;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HiveArguments hiveArguments = (HiveArguments) o;
    if (!Objects.equals(this.databasesAndTables, hiveArguments.databasesAndTables)) {
      return false;
    }
    if (!Objects.equals(this.sentryPermissions, hiveArguments.sentryPermissions)) {
      return false;
    }
    if (!Objects.equals(this.skipUrlPermissions, hiveArguments.skipUrlPermissions)) {
      return false;
    }
    if (!Objects.equals(this.numThreads, hiveArguments.numThreads)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(databasesAndTables, sentryPermissions, skipUrlPermissions, numThreads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HiveArguments {\n");
    sb.append("    databasesAndTables: ").append(toIndentedString(databasesAndTables)).append("\n");
    sb.append("    sentryPermissions: ").append(toIndentedString(sentryPermissions)).append("\n");
    sb.append("    skipUrlPermissions: ").append(toIndentedString(skipUrlPermissions)).append("\n");
    sb.append("    numThreads: ").append(toIndentedString(numThreads)).append("\n");
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

