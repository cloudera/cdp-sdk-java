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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dfworkload.model.DfxEnvironmentStatus;
import com.cloudera.cdp.dfworkload.model.EnvCloudRegion;

/**
 * Metadata about the workload.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:54.268-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class DfxLocalMeta  {

  /**
   * The CRN of the environment.
   **/
  private String crn = null;

  /**
   * The name of the environment.
   **/
  private String name = null;

  /**
   * The cloudPlatform flag of the environment.
   **/
  private String cloudPlatform = null;

  /**
   * The region of the environment.
   **/
  private EnvCloudRegion region = null;

  /**
   * Crn of associated cloudbreak environment.
   **/
  private String cloudbreakCrn = null;

  /**
   * The internal ID of the environment.
   **/
  private String id = null;

  /**
   * The DataFlow Service contact url.
   **/
  private String localUrl = null;

  /**
   * The version of the DataFlow Service.
   **/
  private String workloadVersion = null;

  /**
   * The status of the DataFlow Service.
   **/
  private DfxEnvironmentStatus environmentStatus = null;

  /**
   * The account ID from the CRN.
   **/
  private String accountId = null;

  /**
   * Getter for crn.
   * The CRN of the environment.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the environment.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The name of the environment.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the environment.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for cloudPlatform.
   * The cloudPlatform flag of the environment.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloudPlatform flag of the environment.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for region.
   * The region of the environment.
   **/
  @JsonProperty("region")
  public EnvCloudRegion getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * The region of the environment.
   **/
  public void setRegion(EnvCloudRegion region) {
    this.region = region;
  }

  /**
   * Getter for cloudbreakCrn.
   * Crn of associated cloudbreak environment.
   **/
  @JsonProperty("cloudbreakCrn")
  public String getCloudbreakCrn() {
    return cloudbreakCrn;
  }

  /**
   * Setter for cloudbreakCrn.
   * Crn of associated cloudbreak environment.
   **/
  public void setCloudbreakCrn(String cloudbreakCrn) {
    this.cloudbreakCrn = cloudbreakCrn;
  }

  /**
   * Getter for id.
   * The internal ID of the environment.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The internal ID of the environment.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for localUrl.
   * The DataFlow Service contact url.
   **/
  @JsonProperty("localUrl")
  public String getLocalUrl() {
    return localUrl;
  }

  /**
   * Setter for localUrl.
   * The DataFlow Service contact url.
   **/
  public void setLocalUrl(String localUrl) {
    this.localUrl = localUrl;
  }

  /**
   * Getter for workloadVersion.
   * The version of the DataFlow Service.
   **/
  @JsonProperty("workloadVersion")
  public String getWorkloadVersion() {
    return workloadVersion;
  }

  /**
   * Setter for workloadVersion.
   * The version of the DataFlow Service.
   **/
  public void setWorkloadVersion(String workloadVersion) {
    this.workloadVersion = workloadVersion;
  }

  /**
   * Getter for environmentStatus.
   * The status of the DataFlow Service.
   **/
  @JsonProperty("environmentStatus")
  public DfxEnvironmentStatus getEnvironmentStatus() {
    return environmentStatus;
  }

  /**
   * Setter for environmentStatus.
   * The status of the DataFlow Service.
   **/
  public void setEnvironmentStatus(DfxEnvironmentStatus environmentStatus) {
    this.environmentStatus = environmentStatus;
  }

  /**
   * Getter for accountId.
   * The account ID from the CRN.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * The account ID from the CRN.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfxLocalMeta dfxLocalMeta = (DfxLocalMeta) o;
    if (!Objects.equals(this.crn, dfxLocalMeta.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, dfxLocalMeta.name)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, dfxLocalMeta.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.region, dfxLocalMeta.region)) {
      return false;
    }
    if (!Objects.equals(this.cloudbreakCrn, dfxLocalMeta.cloudbreakCrn)) {
      return false;
    }
    if (!Objects.equals(this.id, dfxLocalMeta.id)) {
      return false;
    }
    if (!Objects.equals(this.localUrl, dfxLocalMeta.localUrl)) {
      return false;
    }
    if (!Objects.equals(this.workloadVersion, dfxLocalMeta.workloadVersion)) {
      return false;
    }
    if (!Objects.equals(this.environmentStatus, dfxLocalMeta.environmentStatus)) {
      return false;
    }
    if (!Objects.equals(this.accountId, dfxLocalMeta.accountId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, cloudPlatform, region, cloudbreakCrn, id, localUrl, workloadVersion, environmentStatus, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfxLocalMeta {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    cloudbreakCrn: ").append(toIndentedString(cloudbreakCrn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localUrl: ").append(toIndentedString(localUrl)).append("\n");
    sb.append("    workloadVersion: ").append(toIndentedString(workloadVersion)).append("\n");
    sb.append("    environmentStatus: ").append(toIndentedString(environmentStatus)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

