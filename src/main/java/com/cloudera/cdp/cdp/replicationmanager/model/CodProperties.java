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

/**
 * Additional properties for operational databases.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-24T14:06:25.870-07:00")
public class CodProperties  {

  /**
   * Name of the corresponding operational database..
   **/
  private String operationalDatabaseName = null;

  /**
   * Getter for operationalDatabaseName.
   * Name of the corresponding operational database..
   **/
  @JsonProperty("operationalDatabaseName")
  public String getOperationalDatabaseName() {
    return operationalDatabaseName;
  }

  /**
   * Setter for operationalDatabaseName.
   * Name of the corresponding operational database..
   **/
  public void setOperationalDatabaseName(String operationalDatabaseName) {
    this.operationalDatabaseName = operationalDatabaseName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodProperties codProperties = (CodProperties) o;
    if (!Objects.equals(this.operationalDatabaseName, codProperties.operationalDatabaseName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalDatabaseName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodProperties {\n");
    sb.append("    operationalDatabaseName: ").append(toIndentedString(operationalDatabaseName)).append("\n");
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

