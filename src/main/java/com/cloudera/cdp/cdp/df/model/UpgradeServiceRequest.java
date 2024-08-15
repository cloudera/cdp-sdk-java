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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for UpgradeService
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:19.082-07:00")
public class UpgradeServiceRequest  {

  /**
   * The service CRN.
   **/
  private String serviceCrn = null;

  /**
   * Indicates whether or not to skip preflight checks when upgrading the workload cluster.
   **/
  private Boolean skipPreflightChecks = null;

  /**
   * Indicates whether deployments NiFi version need to be upgraded; defaults to false
   **/
  private Boolean upgradeDeploymentsNifiVersion = false;

  /**
   * Getter for serviceCrn.
   * The service CRN.
   **/
  @JsonProperty("serviceCrn")
  public String getServiceCrn() {
    return serviceCrn;
  }

  /**
   * Setter for serviceCrn.
   * The service CRN.
   **/
  public void setServiceCrn(String serviceCrn) {
    this.serviceCrn = serviceCrn;
  }

  /**
   * Getter for skipPreflightChecks.
   * Indicates whether or not to skip preflight checks when upgrading the workload cluster.
   **/
  @JsonProperty("skipPreflightChecks")
  public Boolean getSkipPreflightChecks() {
    return skipPreflightChecks;
  }

  /**
   * Setter for skipPreflightChecks.
   * Indicates whether or not to skip preflight checks when upgrading the workload cluster.
   **/
  public void setSkipPreflightChecks(Boolean skipPreflightChecks) {
    this.skipPreflightChecks = skipPreflightChecks;
  }

  /**
   * Getter for upgradeDeploymentsNifiVersion.
   * Indicates whether deployments NiFi version need to be upgraded; defaults to false
   **/
  @JsonProperty("upgradeDeploymentsNifiVersion")
  public Boolean getUpgradeDeploymentsNifiVersion() {
    return upgradeDeploymentsNifiVersion;
  }

  /**
   * Setter for upgradeDeploymentsNifiVersion.
   * Indicates whether deployments NiFi version need to be upgraded; defaults to false
   **/
  public void setUpgradeDeploymentsNifiVersion(Boolean upgradeDeploymentsNifiVersion) {
    this.upgradeDeploymentsNifiVersion = upgradeDeploymentsNifiVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeServiceRequest upgradeServiceRequest = (UpgradeServiceRequest) o;
    if (!Objects.equals(this.serviceCrn, upgradeServiceRequest.serviceCrn)) {
      return false;
    }
    if (!Objects.equals(this.skipPreflightChecks, upgradeServiceRequest.skipPreflightChecks)) {
      return false;
    }
    if (!Objects.equals(this.upgradeDeploymentsNifiVersion, upgradeServiceRequest.upgradeDeploymentsNifiVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCrn, skipPreflightChecks, upgradeDeploymentsNifiVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeServiceRequest {\n");
    sb.append("    serviceCrn: ").append(toIndentedString(serviceCrn)).append("\n");
    sb.append("    skipPreflightChecks: ").append(toIndentedString(skipPreflightChecks)).append("\n");
    sb.append("    upgradeDeploymentsNifiVersion: ").append(toIndentedString(upgradeDeploymentsNifiVersion)).append("\n");
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

