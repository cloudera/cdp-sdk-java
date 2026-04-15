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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datacatalog.model.ExternalUser;

/**
 * Response of the Regenerate external user credentials operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class RegenerateExternalUserCredentialsResponse extends CdpResponse {

  /**
   * The external user with regenerated credentials.
   **/
  private ExternalUser externalUser = null;

  /**
   * Getter for externalUser.
   * The external user with regenerated credentials.
   **/
  @JsonProperty("externalUser")
  public ExternalUser getExternalUser() {
    return externalUser;
  }

  /**
   * Setter for externalUser.
   * The external user with regenerated credentials.
   **/
  public void setExternalUser(ExternalUser externalUser) {
    this.externalUser = externalUser;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegenerateExternalUserCredentialsResponse regenerateExternalUserCredentialsResponse = (RegenerateExternalUserCredentialsResponse) o;
    if (!Objects.equals(this.externalUser, regenerateExternalUserCredentialsResponse.externalUser)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUser, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegenerateExternalUserCredentialsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalUser: ").append(toIndentedString(externalUser)).append("\n");
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

