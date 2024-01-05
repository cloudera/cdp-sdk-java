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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Datalake recover request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-05T09:16:30.675-08:00")
public class RecoverDatalakeRequest  {

  /**
   * The name or CRN of the datalake.
   **/
  private String datalakeName = null;

  /**
   * The type of the recovery. The default value is RECOVER_WITHOUT_DATA. The recovery always runs with RECOVER_WITH_DATA if the on resize failure.
   **/
  private String recoveryType = null;

  /**
   * Getter for datalakeName.
   * The name or CRN of the datalake.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name or CRN of the datalake.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for recoveryType.
   * The type of the recovery. The default value is RECOVER_WITHOUT_DATA. The recovery always runs with RECOVER_WITH_DATA if the on resize failure.
   **/
  @JsonProperty("recoveryType")
  public String getRecoveryType() {
    return recoveryType;
  }

  /**
   * Setter for recoveryType.
   * The type of the recovery. The default value is RECOVER_WITHOUT_DATA. The recovery always runs with RECOVER_WITH_DATA if the on resize failure.
   **/
  public void setRecoveryType(String recoveryType) {
    this.recoveryType = recoveryType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoverDatalakeRequest recoverDatalakeRequest = (RecoverDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, recoverDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.recoveryType, recoverDatalakeRequest.recoveryType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, recoveryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoverDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    recoveryType: ").append(toIndentedString(recoveryType)).append("\n");
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

