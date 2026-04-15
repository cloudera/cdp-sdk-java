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
import com.cloudera.cdp.datacatalog.model.ExternalUserAccessUpdate;
import java.util.*;

/**
 * Grant access to external users on Data Share request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class GrantAccessToExternalUsersOnDataShareRequest  {

  /**
   * The CRN of the Data Lake where the Data Share is located.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the Environment where the Data Share is located.
   **/
  private String environmentCrn = null;

  /**
   * The unique identifier of the Data Share for which external user access will be updated.
   **/
  private String dataShareId = null;

  /**
   * List of external users with updated access permissions.
   **/
  private List<ExternalUserAccessUpdate> externalUsers = new ArrayList<ExternalUserAccessUpdate>();

  /**
   * Getter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share is located.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share is located.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the Environment where the Data Share is located.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the Environment where the Data Share is located.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for dataShareId.
   * The unique identifier of the Data Share for which external user access will be updated.
   **/
  @JsonProperty("dataShareId")
  public String getDataShareId() {
    return dataShareId;
  }

  /**
   * Setter for dataShareId.
   * The unique identifier of the Data Share for which external user access will be updated.
   **/
  public void setDataShareId(String dataShareId) {
    this.dataShareId = dataShareId;
  }

  /**
   * Getter for externalUsers.
   * List of external users with updated access permissions.
   **/
  @JsonProperty("externalUsers")
  public List<ExternalUserAccessUpdate> getExternalUsers() {
    return externalUsers;
  }

  /**
   * Setter for externalUsers.
   * List of external users with updated access permissions.
   **/
  public void setExternalUsers(List<ExternalUserAccessUpdate> externalUsers) {
    this.externalUsers = externalUsers;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantAccessToExternalUsersOnDataShareRequest grantAccessToExternalUsersOnDataShareRequest = (GrantAccessToExternalUsersOnDataShareRequest) o;
    if (!Objects.equals(this.datalakeCrn, grantAccessToExternalUsersOnDataShareRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, grantAccessToExternalUsersOnDataShareRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.dataShareId, grantAccessToExternalUsersOnDataShareRequest.dataShareId)) {
      return false;
    }
    if (!Objects.equals(this.externalUsers, grantAccessToExternalUsersOnDataShareRequest.externalUsers)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, environmentCrn, dataShareId, externalUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantAccessToExternalUsersOnDataShareRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    dataShareId: ").append(toIndentedString(dataShareId)).append("\n");
    sb.append("    externalUsers: ").append(toIndentedString(externalUsers)).append("\n");
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

