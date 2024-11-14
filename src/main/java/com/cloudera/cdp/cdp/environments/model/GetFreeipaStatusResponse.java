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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.FreeIPANodeStatus;
import java.util.*;
import java.util.Map;

/**
 * The overall status of the FreeIPA cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:26.302-08:00")
public class GetFreeipaStatusResponse extends CdpResponse {

  /**
   * The CRN of the environment
   **/
  private String environmentCrn = null;

  /**
   * The name of the Environment
   **/
  private String environmentName = null;

  /**
   * The overall status of the FreeIPA cluster
   **/
  private String status = null;

  /**
   * Status of individual nodes in the FreeIPA cluster
   **/
  private Map<String, FreeIPANodeStatus> instances = new HashMap<String, FreeIPANodeStatus>();

  /**
   * Getter for environmentCrn.
   * The CRN of the environment
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for environmentName.
   * The name of the Environment
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the Environment
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for status.
   * The overall status of the FreeIPA cluster
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The overall status of the FreeIPA cluster
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for instances.
   * Status of individual nodes in the FreeIPA cluster
   **/
  @JsonProperty("instances")
  public Map<String, FreeIPANodeStatus> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * Status of individual nodes in the FreeIPA cluster
   **/
  public void setInstances(Map<String, FreeIPANodeStatus> instances) {
    this.instances = instances;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFreeipaStatusResponse getFreeipaStatusResponse = (GetFreeipaStatusResponse) o;
    if (!Objects.equals(this.environmentCrn, getFreeipaStatusResponse.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, getFreeipaStatusResponse.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.status, getFreeipaStatusResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.instances, getFreeipaStatusResponse.instances)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, environmentName, status, instances, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFreeipaStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

