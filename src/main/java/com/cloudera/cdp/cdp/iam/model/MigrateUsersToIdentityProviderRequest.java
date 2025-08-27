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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for migrating users from an Identity Provider Connector to a new one.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:30.759-07:00")
public class MigrateUsersToIdentityProviderRequest  {

  /**
   * The name or CRN of the original IdP provider to migrate from.
   **/
  private String originalProviderName = null;

  /**
   * The name or CRN of the new IdP provider to migrate to.
   **/
  private String newProviderName = null;

  /**
   * Getter for originalProviderName.
   * The name or CRN of the original IdP provider to migrate from.
   **/
  @JsonProperty("originalProviderName")
  public String getOriginalProviderName() {
    return originalProviderName;
  }

  /**
   * Setter for originalProviderName.
   * The name or CRN of the original IdP provider to migrate from.
   **/
  public void setOriginalProviderName(String originalProviderName) {
    this.originalProviderName = originalProviderName;
  }

  /**
   * Getter for newProviderName.
   * The name or CRN of the new IdP provider to migrate to.
   **/
  @JsonProperty("newProviderName")
  public String getNewProviderName() {
    return newProviderName;
  }

  /**
   * Setter for newProviderName.
   * The name or CRN of the new IdP provider to migrate to.
   **/
  public void setNewProviderName(String newProviderName) {
    this.newProviderName = newProviderName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateUsersToIdentityProviderRequest migrateUsersToIdentityProviderRequest = (MigrateUsersToIdentityProviderRequest) o;
    if (!Objects.equals(this.originalProviderName, migrateUsersToIdentityProviderRequest.originalProviderName)) {
      return false;
    }
    if (!Objects.equals(this.newProviderName, migrateUsersToIdentityProviderRequest.newProviderName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalProviderName, newProviderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateUsersToIdentityProviderRequest {\n");
    sb.append("    originalProviderName: ").append(toIndentedString(originalProviderName)).append("\n");
    sb.append("    newProviderName: ").append(toIndentedString(newProviderName)).append("\n");
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

