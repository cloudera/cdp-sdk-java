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
import com.cloudera.cdp.replicationmanager.model.HbaseDatabaseArguments;
import java.util.*;

/**
 * HBase replication parameters.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:19.690-08:00")
public class HbasePolicyArguments  {

  /**
   * List of tables to be replicated. The key should be in \"namespace:tablename\" format. If this list is empty, then the whole database will be replicated.
   **/
  private List<String> tables = null;

  /**
   * Cloud credentials to use to replicate the initial snapshot if the credential location is specified as 'EXTERNAL_ACCOUNT'.
   **/
  private String cloudCredential = null;

  /**
   * Optional parameters used for HBase database replication.
   **/
  private HbaseDatabaseArguments databaseArguments = null;

  /**
   * Getter for tables.
   * List of tables to be replicated. The key should be in \&quot;namespace:tablename\&quot; format. If this list is empty, then the whole database will be replicated.
   **/
  @JsonProperty("tables")
  public List<String> getTables() {
    return tables;
  }

  /**
   * Setter for tables.
   * List of tables to be replicated. The key should be in \&quot;namespace:tablename\&quot; format. If this list is empty, then the whole database will be replicated.
   **/
  public void setTables(List<String> tables) {
    this.tables = tables;
  }

  /**
   * Getter for cloudCredential.
   * Cloud credentials to use to replicate the initial snapshot if the credential location is specified as &#39;EXTERNAL_ACCOUNT&#39;.
   **/
  @JsonProperty("cloudCredential")
  public String getCloudCredential() {
    return cloudCredential;
  }

  /**
   * Setter for cloudCredential.
   * Cloud credentials to use to replicate the initial snapshot if the credential location is specified as &#39;EXTERNAL_ACCOUNT&#39;.
   **/
  public void setCloudCredential(String cloudCredential) {
    this.cloudCredential = cloudCredential;
  }

  /**
   * Getter for databaseArguments.
   * Optional parameters used for HBase database replication.
   **/
  @JsonProperty("databaseArguments")
  public HbaseDatabaseArguments getDatabaseArguments() {
    return databaseArguments;
  }

  /**
   * Setter for databaseArguments.
   * Optional parameters used for HBase database replication.
   **/
  public void setDatabaseArguments(HbaseDatabaseArguments databaseArguments) {
    this.databaseArguments = databaseArguments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HbasePolicyArguments hbasePolicyArguments = (HbasePolicyArguments) o;
    if (!Objects.equals(this.tables, hbasePolicyArguments.tables)) {
      return false;
    }
    if (!Objects.equals(this.cloudCredential, hbasePolicyArguments.cloudCredential)) {
      return false;
    }
    if (!Objects.equals(this.databaseArguments, hbasePolicyArguments.databaseArguments)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(tables, cloudCredential, databaseArguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HbasePolicyArguments {\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
    sb.append("    cloudCredential: ").append(toIndentedString(cloudCredential)).append("\n");
    sb.append("    databaseArguments: ").append(toIndentedString(databaseArguments)).append("\n");
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

