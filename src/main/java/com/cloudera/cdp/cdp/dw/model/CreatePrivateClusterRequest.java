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
import com.cloudera.cdp.dw.model.KeyPairCredentials;

/**
 * Request object for the createPrivateCluster method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:04.824-08:00")
public class CreatePrivateClusterRequest  {

  /**
   * The CRN of the environment for the cluster to create.
   **/
  private String environmentCrn = null;

  /**
   * The storage class for the Local Storage Operator.
   **/
  private String storageClass = null;

  /**
   * DEPRECATED: As of 1.5.5, this feature flag can be set as an advanced configuration. Enable to use dedicated nodes exclusively for executors and coordinators, and improve performance. You can enable this only if you reserved nodes while adding a CDP Private Cloud containerized ECS cluster. When disabled, non-compute pods such as MetaStore and Data Visualization can also use the reserved nodes.
   **/
  private Boolean dedicatedExecutorNodes = false;

  /**
   * A certificate and private key pair belonging together for mutual SSL handshake when Database Catalog (aka DBC) connects to the metastore database.
   **/
  private KeyPairCredentials dbClientCredentials = null;

  /**
   * Getter for environmentCrn.
   * The CRN of the environment for the cluster to create.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment for the cluster to create.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for storageClass.
   * The storage class for the Local Storage Operator.
   **/
  @JsonProperty("storageClass")
  public String getStorageClass() {
    return storageClass;
  }

  /**
   * Setter for storageClass.
   * The storage class for the Local Storage Operator.
   **/
  public void setStorageClass(String storageClass) {
    this.storageClass = storageClass;
  }

  /**
   * Getter for dedicatedExecutorNodes.
   * DEPRECATED: As of 1.5.5, this feature flag can be set as an advanced configuration. Enable to use dedicated nodes exclusively for executors and coordinators, and improve performance. You can enable this only if you reserved nodes while adding a CDP Private Cloud containerized ECS cluster. When disabled, non-compute pods such as MetaStore and Data Visualization can also use the reserved nodes.
   **/
  @Deprecated
  @JsonProperty("dedicatedExecutorNodes")
  public Boolean getDedicatedExecutorNodes() {
    return dedicatedExecutorNodes;
  }

  /**
   * Setter for dedicatedExecutorNodes.
   * DEPRECATED: As of 1.5.5, this feature flag can be set as an advanced configuration. Enable to use dedicated nodes exclusively for executors and coordinators, and improve performance. You can enable this only if you reserved nodes while adding a CDP Private Cloud containerized ECS cluster. When disabled, non-compute pods such as MetaStore and Data Visualization can also use the reserved nodes.
   **/
  @Deprecated
  public void setDedicatedExecutorNodes(Boolean dedicatedExecutorNodes) {
    this.dedicatedExecutorNodes = dedicatedExecutorNodes;
  }

  /**
   * Getter for dbClientCredentials.
   * A certificate and private key pair belonging together for mutual SSL handshake when Database Catalog (aka DBC) connects to the metastore database.
   **/
  @JsonProperty("dbClientCredentials")
  public KeyPairCredentials getDbClientCredentials() {
    return dbClientCredentials;
  }

  /**
   * Setter for dbClientCredentials.
   * A certificate and private key pair belonging together for mutual SSL handshake when Database Catalog (aka DBC) connects to the metastore database.
   **/
  public void setDbClientCredentials(KeyPairCredentials dbClientCredentials) {
    this.dbClientCredentials = dbClientCredentials;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePrivateClusterRequest createPrivateClusterRequest = (CreatePrivateClusterRequest) o;
    if (!Objects.equals(this.environmentCrn, createPrivateClusterRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.storageClass, createPrivateClusterRequest.storageClass)) {
      return false;
    }
    if (!Objects.equals(this.dedicatedExecutorNodes, createPrivateClusterRequest.dedicatedExecutorNodes)) {
      return false;
    }
    if (!Objects.equals(this.dbClientCredentials, createPrivateClusterRequest.dbClientCredentials)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, storageClass, dedicatedExecutorNodes, dbClientCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrivateClusterRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
    sb.append("    dedicatedExecutorNodes: ").append(toIndentedString(dedicatedExecutorNodes)).append("\n");
    sb.append("    dbClientCredentials: ").append(toIndentedString(dbClientCredentials)).append("\n");
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

