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
 * Options for activating a Private Cloud environment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:18.456-07:00")
public class PrivateCloudActivationOptions  {

  /**
   * DEPRECATED: As of PVC 1.5.4 we no longer use delegation user. Name of delegation user. This user is used between Hue - Impala to create a session, as Hue should not pass the user credentials, instead Hue authenticates with the delegation user, then this user will impersonate the logged in user. This means that the Delegation User and Password should be able to authenticate through LDAP.
   **/
  private String delegationUsername = null;

  /**
   * DEPRECATED: As of PVC 1.5.4 we no longer use delegation user. Password of delegation user.
   **/
  private String delegationPassword = null;

  /**
   * DEPRECATED: This option will be removed in future releases. Instead of creating a custom Security Context Constraint, we rely on the cluster default. The name of the Hive Security Context Constraint.
   **/
  private String securityContextConstraintName = null;

  /**
   * The storage class for the Local Storage Operator.
   **/
  private String storageClass = null;

  /**
   * DEPRECATED: Current Private Cloud releases only support embedded database, the value of this field is ignored. The name of the DAS database. Not required for embedded databases.
   **/
  private String dbDas = null;

  /**
   * DEPRECATED: Current Private Cloud releases only support embedded database, the value of this field is ignored. The name of the HUE database. Not required for embedded databases.
   **/
  private String dbHue = null;

  /**
   * Enable to use dedicated nodes exclusively for executors and coordinators, and improve performance. You can enable this only if you reserved nodes while adding a CDP Private Cloud containerized ECS cluster. When disabled, non-compute pods such as MetaStore and Data Visualization can also use the reserved nodes.
   **/
  private Boolean dedicatedExecutorNodes = false;

  /**
   * A certificate and private key pair belonging together for mutual SSL handshake when Database Catalog (aka DBC) connects to the metastore database.
   **/
  private KeyPairCredentials dbClientCredentials = null;

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
   * DEPRECATED: This option will be removed in future releases. Instead of creating a custom Security Context Constraint, we rely on the cluster default. The name of the Hive Security Context Constraint.
   **/
  @Deprecated
  @JsonProperty("securityContextConstraintName")
  public String getSecurityContextConstraintName() {
    return securityContextConstraintName;
  }

  /**
   * Setter for securityContextConstraintName.
   * DEPRECATED: This option will be removed in future releases. Instead of creating a custom Security Context Constraint, we rely on the cluster default. The name of the Hive Security Context Constraint.
   **/
  @Deprecated
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
   * Getter for dbDas.
   * DEPRECATED: Current Private Cloud releases only support embedded database, the value of this field is ignored. The name of the DAS database. Not required for embedded databases.
   **/
  @Deprecated
  @JsonProperty("dbDas")
  public String getDbDas() {
    return dbDas;
  }

  /**
   * Setter for dbDas.
   * DEPRECATED: Current Private Cloud releases only support embedded database, the value of this field is ignored. The name of the DAS database. Not required for embedded databases.
   **/
  @Deprecated
  public void setDbDas(String dbDas) {
    this.dbDas = dbDas;
  }

  /**
   * Getter for dbHue.
   * DEPRECATED: Current Private Cloud releases only support embedded database, the value of this field is ignored. The name of the HUE database. Not required for embedded databases.
   **/
  @Deprecated
  @JsonProperty("dbHue")
  public String getDbHue() {
    return dbHue;
  }

  /**
   * Setter for dbHue.
   * DEPRECATED: Current Private Cloud releases only support embedded database, the value of this field is ignored. The name of the HUE database. Not required for embedded databases.
   **/
  @Deprecated
  public void setDbHue(String dbHue) {
    this.dbHue = dbHue;
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
    PrivateCloudActivationOptions privateCloudActivationOptions = (PrivateCloudActivationOptions) o;
    if (!Objects.equals(this.delegationUsername, privateCloudActivationOptions.delegationUsername)) {
      return false;
    }
    if (!Objects.equals(this.delegationPassword, privateCloudActivationOptions.delegationPassword)) {
      return false;
    }
    if (!Objects.equals(this.securityContextConstraintName, privateCloudActivationOptions.securityContextConstraintName)) {
      return false;
    }
    if (!Objects.equals(this.storageClass, privateCloudActivationOptions.storageClass)) {
      return false;
    }
    if (!Objects.equals(this.dbDas, privateCloudActivationOptions.dbDas)) {
      return false;
    }
    if (!Objects.equals(this.dbHue, privateCloudActivationOptions.dbHue)) {
      return false;
    }
    if (!Objects.equals(this.dedicatedExecutorNodes, privateCloudActivationOptions.dedicatedExecutorNodes)) {
      return false;
    }
    if (!Objects.equals(this.dbClientCredentials, privateCloudActivationOptions.dbClientCredentials)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegationUsername, delegationPassword, securityContextConstraintName, storageClass, dbDas, dbHue, dedicatedExecutorNodes, dbClientCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateCloudActivationOptions {\n");
    sb.append("    delegationUsername: ").append(toIndentedString(delegationUsername)).append("\n");
    sb.append("    delegationPassword: ").append(toIndentedString(delegationPassword)).append("\n");
    sb.append("    securityContextConstraintName: ").append(toIndentedString(securityContextConstraintName)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
    sb.append("    dbDas: ").append(toIndentedString(dbDas)).append("\n");
    sb.append("    dbHue: ").append(toIndentedString(dbHue)).append("\n");
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

