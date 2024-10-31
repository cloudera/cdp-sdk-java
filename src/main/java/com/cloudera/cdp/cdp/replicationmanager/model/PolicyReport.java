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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.PolicyReportDetails;

/**
 * Policy report.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:13.128-07:00")
public class PolicyReport  {

  /**
   * Last successful instance.
   **/
  private PolicyReportDetails lastSucceededInstance = null;

  /**
   * Last failed instance.
   **/
  private PolicyReportDetails lastFailedInstance = null;

  /**
   * Getter for lastSucceededInstance.
   * Last successful instance.
   **/
  @JsonProperty("lastSucceededInstance")
  public PolicyReportDetails getLastSucceededInstance() {
    return lastSucceededInstance;
  }

  /**
   * Setter for lastSucceededInstance.
   * Last successful instance.
   **/
  public void setLastSucceededInstance(PolicyReportDetails lastSucceededInstance) {
    this.lastSucceededInstance = lastSucceededInstance;
  }

  /**
   * Getter for lastFailedInstance.
   * Last failed instance.
   **/
  @JsonProperty("lastFailedInstance")
  public PolicyReportDetails getLastFailedInstance() {
    return lastFailedInstance;
  }

  /**
   * Setter for lastFailedInstance.
   * Last failed instance.
   **/
  public void setLastFailedInstance(PolicyReportDetails lastFailedInstance) {
    this.lastFailedInstance = lastFailedInstance;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyReport policyReport = (PolicyReport) o;
    if (!Objects.equals(this.lastSucceededInstance, policyReport.lastSucceededInstance)) {
      return false;
    }
    if (!Objects.equals(this.lastFailedInstance, policyReport.lastFailedInstance)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSucceededInstance, lastFailedInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyReport {\n");
    sb.append("    lastSucceededInstance: ").append(toIndentedString(lastSucceededInstance)).append("\n");
    sb.append("    lastFailedInstance: ").append(toIndentedString(lastFailedInstance)).append("\n");
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

