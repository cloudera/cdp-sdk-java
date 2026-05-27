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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object to get the table status details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:05.230-07:00")
public class GetTableStatusDetailsRequest  {

  /**
   * The CRN of the CLO Data Hub.
   **/
  private String datahubCrn = null;

  /**
   * The namespace.
   **/
  private String namespace = null;

  /**
   * The table name.
   **/
  private String tableName = null;

  /**
   * The policy name.
   **/
  private String policyName = null;

  /**
   * The table status. It can be UNAVAILABLE, SUCCESS, ERROR, PAUSED. UNAVAILABLE if no tasks ran recently, SUCCESS if recent task got completed successfully, ERROR if recent task has failed, PAUSED if the table is in paused state.
   **/
  private String status = "UNAVAILABLE";

  /**
   * Getter for datahubCrn.
   * The CRN of the CLO Data Hub.
   **/
  @JsonProperty("datahubCrn")
  public String getDatahubCrn() {
    return datahubCrn;
  }

  /**
   * Setter for datahubCrn.
   * The CRN of the CLO Data Hub.
   **/
  public void setDatahubCrn(String datahubCrn) {
    this.datahubCrn = datahubCrn;
  }

  /**
   * Getter for namespace.
   * The namespace.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for tableName.
   * The table name.
   **/
  @JsonProperty("tableName")
  public String getTableName() {
    return tableName;
  }

  /**
   * Setter for tableName.
   * The table name.
   **/
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * Getter for policyName.
   * The policy name.
   **/
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Setter for policyName.
   * The policy name.
   **/
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  /**
   * Getter for status.
   * The table status. It can be UNAVAILABLE, SUCCESS, ERROR, PAUSED. UNAVAILABLE if no tasks ran recently, SUCCESS if recent task got completed successfully, ERROR if recent task has failed, PAUSED if the table is in paused state.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The table status. It can be UNAVAILABLE, SUCCESS, ERROR, PAUSED. UNAVAILABLE if no tasks ran recently, SUCCESS if recent task got completed successfully, ERROR if recent task has failed, PAUSED if the table is in paused state.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTableStatusDetailsRequest getTableStatusDetailsRequest = (GetTableStatusDetailsRequest) o;
    if (!Objects.equals(this.datahubCrn, getTableStatusDetailsRequest.datahubCrn)) {
      return false;
    }
    if (!Objects.equals(this.namespace, getTableStatusDetailsRequest.namespace)) {
      return false;
    }
    if (!Objects.equals(this.tableName, getTableStatusDetailsRequest.tableName)) {
      return false;
    }
    if (!Objects.equals(this.policyName, getTableStatusDetailsRequest.policyName)) {
      return false;
    }
    if (!Objects.equals(this.status, getTableStatusDetailsRequest.status)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahubCrn, namespace, tableName, policyName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTableStatusDetailsRequest {\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

