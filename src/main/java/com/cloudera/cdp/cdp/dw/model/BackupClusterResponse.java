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
import java.time.ZonedDateTime;

/**
 * Response object for the backupCluster method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-22T20:53:53.646-07:00")
public class BackupClusterResponse extends CdpResponse {

  /**
   * The ID of the cluster.
   **/
  private String clusterId = null;

  /**
   * The ID of the backup operation.
   **/
  private String operationId = null;

  /**
   * The date of the creation.
   **/
  private ZonedDateTime timestamp = null;

  /**
   * The backup data.
   **/
  private String data = null;

  /**
   * The md5 hash of the encoded data.
   **/
  private String md5 = null;

  /**
   * Getter for clusterId.
   * The ID of the cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for operationId.
   * The ID of the backup operation.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * The ID of the backup operation.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for timestamp.
   * The date of the creation.
   **/
  @JsonProperty("timestamp")
  public ZonedDateTime getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The date of the creation.
   **/
  public void setTimestamp(ZonedDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Getter for data.
   * The backup data.
   **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  /**
   * Setter for data.
   * The backup data.
   **/
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Getter for md5.
   * The md5 hash of the encoded data.
   **/
  @JsonProperty("md5")
  public String getMd5() {
    return md5;
  }

  /**
   * Setter for md5.
   * The md5 hash of the encoded data.
   **/
  public void setMd5(String md5) {
    this.md5 = md5;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupClusterResponse backupClusterResponse = (BackupClusterResponse) o;
    if (!Objects.equals(this.clusterId, backupClusterResponse.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.operationId, backupClusterResponse.operationId)) {
      return false;
    }
    if (!Objects.equals(this.timestamp, backupClusterResponse.timestamp)) {
      return false;
    }
    if (!Objects.equals(this.data, backupClusterResponse.data)) {
      return false;
    }
    if (!Objects.equals(this.md5, backupClusterResponse.md5)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, operationId, timestamp, data, md5, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupClusterResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
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

