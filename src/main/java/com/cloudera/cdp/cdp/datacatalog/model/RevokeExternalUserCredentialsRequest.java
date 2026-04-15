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

/**
 * Revoke external user credentials request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class RevokeExternalUserCredentialsRequest  {

  /**
   * The CRN of the Data Lake where the external user credentials will be revoked.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the Environment where the external user credentials will be revoked.
   **/
  private String environmentCrn = null;

  /**
   * The unique identifier of the external user whose credentials are to be revoked.
   **/
  private Long externalUserId = null;

  /**
   * Getter for datalakeCrn.
   * The CRN of the Data Lake where the external user credentials will be revoked.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Data Lake where the external user credentials will be revoked.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the Environment where the external user credentials will be revoked.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the Environment where the external user credentials will be revoked.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for externalUserId.
   * The unique identifier of the external user whose credentials are to be revoked.
   **/
  @JsonProperty("externalUserId")
  public Long getExternalUserId() {
    return externalUserId;
  }

  /**
   * Setter for externalUserId.
   * The unique identifier of the external user whose credentials are to be revoked.
   **/
  public void setExternalUserId(Long externalUserId) {
    this.externalUserId = externalUserId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeExternalUserCredentialsRequest revokeExternalUserCredentialsRequest = (RevokeExternalUserCredentialsRequest) o;
    if (!Objects.equals(this.datalakeCrn, revokeExternalUserCredentialsRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, revokeExternalUserCredentialsRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.externalUserId, revokeExternalUserCredentialsRequest.externalUserId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, environmentCrn, externalUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeExternalUserCredentialsRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
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

