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
import com.cloudera.cdp.dfworkload.model.AWSNodeStorageProfile;

/**
 * Node storage parameters.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:38.216-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class NodeStorage  {

  /**
   * The Azure content repository profile.
   **/
  private String azureContentRepoProfile = null;

  /**
   * The Azure provenance repository profile.
   **/
  private String azureProvenanceRepoProfile = null;

  /**
   * The Azure flow file repository profile.
   **/
  private String azureFlowFileRepoProfile = null;

  /**
   * The AWS content repository profile.
   **/
  private AWSNodeStorageProfile awsContentRepoProfile = null;

  /**
   * The AWS provenance repository profile.
   **/
  private AWSNodeStorageProfile awsProvenanceRepoProfile = null;

  /**
   * The AWS flow file repository profile.
   **/
  private AWSNodeStorageProfile awsFlowFileRepoProfile = null;

  /**
   * Getter for azureContentRepoProfile.
   * The Azure content repository profile.
   **/
  @JsonProperty("azureContentRepoProfile")
  public String getAzureContentRepoProfile() {
    return azureContentRepoProfile;
  }

  /**
   * Setter for azureContentRepoProfile.
   * The Azure content repository profile.
   **/
  public void setAzureContentRepoProfile(String azureContentRepoProfile) {
    this.azureContentRepoProfile = azureContentRepoProfile;
  }

  /**
   * Getter for azureProvenanceRepoProfile.
   * The Azure provenance repository profile.
   **/
  @JsonProperty("azureProvenanceRepoProfile")
  public String getAzureProvenanceRepoProfile() {
    return azureProvenanceRepoProfile;
  }

  /**
   * Setter for azureProvenanceRepoProfile.
   * The Azure provenance repository profile.
   **/
  public void setAzureProvenanceRepoProfile(String azureProvenanceRepoProfile) {
    this.azureProvenanceRepoProfile = azureProvenanceRepoProfile;
  }

  /**
   * Getter for azureFlowFileRepoProfile.
   * The Azure flow file repository profile.
   **/
  @JsonProperty("azureFlowFileRepoProfile")
  public String getAzureFlowFileRepoProfile() {
    return azureFlowFileRepoProfile;
  }

  /**
   * Setter for azureFlowFileRepoProfile.
   * The Azure flow file repository profile.
   **/
  public void setAzureFlowFileRepoProfile(String azureFlowFileRepoProfile) {
    this.azureFlowFileRepoProfile = azureFlowFileRepoProfile;
  }

  /**
   * Getter for awsContentRepoProfile.
   * The AWS content repository profile.
   **/
  @JsonProperty("awsContentRepoProfile")
  public AWSNodeStorageProfile getAwsContentRepoProfile() {
    return awsContentRepoProfile;
  }

  /**
   * Setter for awsContentRepoProfile.
   * The AWS content repository profile.
   **/
  public void setAwsContentRepoProfile(AWSNodeStorageProfile awsContentRepoProfile) {
    this.awsContentRepoProfile = awsContentRepoProfile;
  }

  /**
   * Getter for awsProvenanceRepoProfile.
   * The AWS provenance repository profile.
   **/
  @JsonProperty("awsProvenanceRepoProfile")
  public AWSNodeStorageProfile getAwsProvenanceRepoProfile() {
    return awsProvenanceRepoProfile;
  }

  /**
   * Setter for awsProvenanceRepoProfile.
   * The AWS provenance repository profile.
   **/
  public void setAwsProvenanceRepoProfile(AWSNodeStorageProfile awsProvenanceRepoProfile) {
    this.awsProvenanceRepoProfile = awsProvenanceRepoProfile;
  }

  /**
   * Getter for awsFlowFileRepoProfile.
   * The AWS flow file repository profile.
   **/
  @JsonProperty("awsFlowFileRepoProfile")
  public AWSNodeStorageProfile getAwsFlowFileRepoProfile() {
    return awsFlowFileRepoProfile;
  }

  /**
   * Setter for awsFlowFileRepoProfile.
   * The AWS flow file repository profile.
   **/
  public void setAwsFlowFileRepoProfile(AWSNodeStorageProfile awsFlowFileRepoProfile) {
    this.awsFlowFileRepoProfile = awsFlowFileRepoProfile;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStorage nodeStorage = (NodeStorage) o;
    if (!Objects.equals(this.azureContentRepoProfile, nodeStorage.azureContentRepoProfile)) {
      return false;
    }
    if (!Objects.equals(this.azureProvenanceRepoProfile, nodeStorage.azureProvenanceRepoProfile)) {
      return false;
    }
    if (!Objects.equals(this.azureFlowFileRepoProfile, nodeStorage.azureFlowFileRepoProfile)) {
      return false;
    }
    if (!Objects.equals(this.awsContentRepoProfile, nodeStorage.awsContentRepoProfile)) {
      return false;
    }
    if (!Objects.equals(this.awsProvenanceRepoProfile, nodeStorage.awsProvenanceRepoProfile)) {
      return false;
    }
    if (!Objects.equals(this.awsFlowFileRepoProfile, nodeStorage.awsFlowFileRepoProfile)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureContentRepoProfile, azureProvenanceRepoProfile, azureFlowFileRepoProfile, awsContentRepoProfile, awsProvenanceRepoProfile, awsFlowFileRepoProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStorage {\n");
    sb.append("    azureContentRepoProfile: ").append(toIndentedString(azureContentRepoProfile)).append("\n");
    sb.append("    azureProvenanceRepoProfile: ").append(toIndentedString(azureProvenanceRepoProfile)).append("\n");
    sb.append("    azureFlowFileRepoProfile: ").append(toIndentedString(azureFlowFileRepoProfile)).append("\n");
    sb.append("    awsContentRepoProfile: ").append(toIndentedString(awsContentRepoProfile)).append("\n");
    sb.append("    awsProvenanceRepoProfile: ").append(toIndentedString(awsProvenanceRepoProfile)).append("\n");
    sb.append("    awsFlowFileRepoProfile: ").append(toIndentedString(awsFlowFileRepoProfile)).append("\n");
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

