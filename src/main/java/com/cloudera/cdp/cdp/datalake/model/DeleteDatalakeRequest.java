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
 * Request object for delete datalake request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:40.257-08:00")
public class DeleteDatalakeRequest  {

  /**
   * The name or CRN of the datalake to be deleted.
   **/
  private String datalakeName = null;

  /**
   * Whether the datalake should be force deleted. This option can be used when cluster deletion fails. This removes the entry from Cloudera Datalake service. Any lingering resources have to be deleted from the cloud provider manually. The default is false.
   **/
  private Boolean force = null;

  /**
   * Getter for datalakeName.
   * The name or CRN of the datalake to be deleted.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name or CRN of the datalake to be deleted.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for force.
   * Whether the datalake should be force deleted. This option can be used when cluster deletion fails. This removes the entry from Cloudera Datalake service. Any lingering resources have to be deleted from the cloud provider manually. The default is false.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Whether the datalake should be force deleted. This option can be used when cluster deletion fails. This removes the entry from Cloudera Datalake service. Any lingering resources have to be deleted from the cloud provider manually. The default is false.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDatalakeRequest deleteDatalakeRequest = (DeleteDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, deleteDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.force, deleteDatalakeRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

