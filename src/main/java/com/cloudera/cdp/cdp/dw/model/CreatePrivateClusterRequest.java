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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-16T16:58:49.860-07:00")
public class CreatePrivateClusterRequest  {

  /**
   * The CRN of the environment for the cluster to create.
   **/
  private String environmentCrn = null;

  /**
   * DEPRECATED: As of PVC 1.5.4 we no longer use delegation user. Name of delegation user. This user is used between Hue - Impala to create a session, as Hue should not pass the user credentials, instead Hue authenticates with the delegation user, then this user will impersonate the logged in user. This means that the Delegation User and Password should be able to authenticate through LDAP.
   **/
  private String delegationUsername = null;

  /**
   * DEPRECATED: As of PVC 1.5.4 we no longer use delegation user. Password of delegation user.
   **/
  private String delegationPassword = null;

  /**
   * The name of the Hive Security Context Constraint.
   **/
  private String securityContextConstraintName = null;

  /**
   * The storage class for the Local Storage Operator.
   **/
  private String storageClass = null;

  /**
   * The name of the HUE database. Not required for embedded databases.
   **/
  private String dbHue = null;

  /**
   * The Resource Pool of the cluster.
   **/
  private String resourcePool = null;

  /**
   * Enable to use dedicated nodes exclusively for executors and coordinators, and improve performance. You can enable this only if you reserved nodes while adding a CDP Private Cloud containerized ECS cluster. When disabled, non-compute pods such as MetaStore and Data Visualization can also use the reserved nodes.
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
   * Getter for delegationUsername.
   * DEPRECATED: As of PVC 1.5.4 we no longer use delegation user. Name of delegation user. This user is used between Hue - Impala to create a session, as Hue should not pass the user credentials, instead Hue authenticates with the delegation user, then this user will impersonate the logged in user. This means that the Delegation User and Password should be able to authenticate through LDAP.
   **/
  @Deprecated
  @JsonProperty("delegationUsername")
  public String getDelegationUsername() {
    return delegationUsername;
  }

  /**
   * Setter for delegationUsername.
   * DEPRECATED: As of PVC 1.5.4 we no longer use delegation user. Name of delegation user. This user is used between Hue - Impala to create a session, as Hue should not pass the user credentials, instead Hue authenticates with the delegation user, then this user will impersonate the logged in user. This means that the Delegation User and Password should be able to authenticate through LDAP.
   **/
  @Deprecated
  public void setDelegationUsername(String delegationUsername) {
    this.delegationUsername = delegationUsername;
  }

  /**
   * Getter for delegationPassword.
   * DEPRECATED: As of PVC 1.5.4 we no longer use delegation user. Password of delegation user.
   **/
  @Deprecated
  @JsonProperty("delegationPassword")
  public String getDelegationPassword() {
    return delegationPassword;
  }

  /**
   * Setter for delegationPassword.
   * DEPRECATED: As of PVC 1.5.4 we no longer use delegation user. Password of delegation user.
   **/
  @Deprecated
  public void setDelegationPassword(String delegationPassword) {
    this.delegationPassword = delegationPassword;
  }

  /**
   * Getter for securityContextConstraintName.
   * The name of the Hive Security Context Constraint.
   **/
  @JsonProperty("securityContextConstraintName")
  public String getSecurityContextConstraintName() {
    return securityContextConstraintName;
  }

  /**
   * Setter for securityContextConstraintName.
   * The name of the Hive Security Context Constraint.
   **/
  public void setSecurityContextConstraintName(String securityContextConstraintName) {
    this.securityContextConstraintName = securityContextConstraintName;
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
   * Getter for dbHue.
   * The name of the HUE database. Not required for embedded databases.
   **/
  @JsonProperty("dbHue")
  public String getDbHue() {
    return dbHue;
  }

  /**
   * Setter for dbHue.
   * The name of the HUE database. Not required for embedded databases.
   **/
  public void setDbHue(String dbHue) {
    this.dbHue = dbHue;
  }

  /**
   * Getter for resourcePool.
   * The Resource Pool of the cluster.
   **/
  @JsonProperty("resourcePool")
  public String getResourcePool() {
    return resourcePool;
  }

  /**
   * Setter for resourcePool.
   * The Resource Pool of the cluster.
   **/
  public void setResourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
  }

  /**
   * Getter for dedicatedExecutorNodes.
   * Enable to use dedicated nodes exclusively for executors and coordinators, and improve performance. You can enable this only if you reserved nodes while adding a CDP Private Cloud containerized ECS cluster. When disabled, non-compute pods such as MetaStore and Data Visualization can also use the reserved nodes.
   **/
  @JsonProperty("dedicatedExecutorNodes")
  public Boolean getDedicatedExecutorNodes() {
    return dedicatedExecutorNodes;
  }

  /**
   * Setter for dedicatedExecutorNodes.
   * Enable to use dedicated nodes exclusively for executors and coordinators, and improve performance. You can enable this only if you reserved nodes while adding a CDP Private Cloud containerized ECS cluster. When disabled, non-compute pods such as MetaStore and Data Visualization can also use the reserved nodes.
   **/
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
    if (!Objects.equals(this.delegationUsername, createPrivateClusterRequest.delegationUsername)) {
      return false;
    }
    if (!Objects.equals(this.delegationPassword, createPrivateClusterRequest.delegationPassword)) {
      return false;
    }
    if (!Objects.equals(this.securityContextConstraintName, createPrivateClusterRequest.securityContextConstraintName)) {
      return false;
    }
    if (!Objects.equals(this.storageClass, createPrivateClusterRequest.storageClass)) {
      return false;
    }
    if (!Objects.equals(this.dbHue, createPrivateClusterRequest.dbHue)) {
      return false;
    }
    if (!Objects.equals(this.resourcePool, createPrivateClusterRequest.resourcePool)) {
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
    return Objects.hash(environmentCrn, delegationUsername, delegationPassword, securityContextConstraintName, storageClass, dbHue, resourcePool, dedicatedExecutorNodes, dbClientCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrivateClusterRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    delegationUsername: ").append(toIndentedString(delegationUsername)).append("\n");
    sb.append("    delegationPassword: ").append(toIndentedString(delegationPassword)).append("\n");
    sb.append("    securityContextConstraintName: ").append(toIndentedString(securityContextConstraintName)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
    sb.append("    dbHue: ").append(toIndentedString(dbHue)).append("\n");
    sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
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

