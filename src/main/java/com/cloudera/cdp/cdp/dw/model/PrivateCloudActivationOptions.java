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
 * Options for activating a Private Cloud environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-16T15:45:11.677-07:00")
public class PrivateCloudActivationOptions  {

  /**
   * Name of delegation user. This user is used between Hue - Impala to create a session, as Hue should not pass the user credentials, instead Hue authenticates with the delegation user, then this user will impersonate the logged in user. This means that the Delegation User and Password should be able to authenticate through LDAP.
   **/
  private String delegationUsername = null;

  /**
   * Password of delegation user.
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
   * The name of the DAS database. Not required for embedded databases
   **/
  private String dbDas = null;

  /**
   * The name of the HUE database. Not required for embedded databases.
   **/
  private String dbHue = null;

  /**
   * Getter for delegationUsername.
   * Name of delegation user. This user is used between Hue - Impala to create a session, as Hue should not pass the user credentials, instead Hue authenticates with the delegation user, then this user will impersonate the logged in user. This means that the Delegation User and Password should be able to authenticate through LDAP.
   **/
  @JsonProperty("delegationUsername")
  public String getDelegationUsername() {
    return delegationUsername;
  }

  /**
   * Setter for delegationUsername.
   * Name of delegation user. This user is used between Hue - Impala to create a session, as Hue should not pass the user credentials, instead Hue authenticates with the delegation user, then this user will impersonate the logged in user. This means that the Delegation User and Password should be able to authenticate through LDAP.
   **/
  public void setDelegationUsername(String delegationUsername) {
    this.delegationUsername = delegationUsername;
  }

  /**
   * Getter for delegationPassword.
   * Password of delegation user.
   **/
  @JsonProperty("delegationPassword")
  public String getDelegationPassword() {
    return delegationPassword;
  }

  /**
   * Setter for delegationPassword.
   * Password of delegation user.
   **/
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
   * Getter for dbDas.
   * The name of the DAS database. Not required for embedded databases
   **/
  @JsonProperty("dbDas")
  public String getDbDas() {
    return dbDas;
  }

  /**
   * Setter for dbDas.
   * The name of the DAS database. Not required for embedded databases
   **/
  public void setDbDas(String dbDas) {
    this.dbDas = dbDas;
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegationUsername, delegationPassword, securityContextConstraintName, storageClass, dbDas, dbHue);
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

