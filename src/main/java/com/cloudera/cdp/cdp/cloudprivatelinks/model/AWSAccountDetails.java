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

package com.cloudera.cdp.cloudprivatelinks.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.cloudprivatelinks.model.CrossAccountRoleDetails;
import java.util.*;

/**
 * Details of the cloud network and the cross-account role required to create the PrivateLink endpoint.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:38.136-07:00")
public class AWSAccountDetails  {

  /**
   * Account ID to authorize access for PrivateLink.
   **/
  private String cloudAccountId = null;

  /**
   * Cross account role details.
   **/
  private CrossAccountRoleDetails crossAccountRoleDetails = null;

  /**
   * CDP Credential CRN to fetch the AWS cross-account RoleArn for the account where the endpoint gets deleted.
   **/
  private String credentialCrn = null;

  /**
   * Region in which VPC exists.
   **/
  private String region = null;

  /**
   * VPC ID in which the private link should be created.
   **/
  private String vpcId = null;

  /**
   * IDs of the private subnets in which the private link should be created.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * Getter for cloudAccountId.
   * Account ID to authorize access for PrivateLink.
   **/
  @JsonProperty("cloudAccountId")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  /**
   * Setter for cloudAccountId.
   * Account ID to authorize access for PrivateLink.
   **/
  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  /**
   * Getter for crossAccountRoleDetails.
   * Cross account role details.
   **/
  @JsonProperty("crossAccountRoleDetails")
  public CrossAccountRoleDetails getCrossAccountRoleDetails() {
    return crossAccountRoleDetails;
  }

  /**
   * Setter for crossAccountRoleDetails.
   * Cross account role details.
   **/
  public void setCrossAccountRoleDetails(CrossAccountRoleDetails crossAccountRoleDetails) {
    this.crossAccountRoleDetails = crossAccountRoleDetails;
  }

  /**
   * Getter for credentialCrn.
   * CDP Credential CRN to fetch the AWS cross-account RoleArn for the account where the endpoint gets deleted.
   **/
  @JsonProperty("credentialCrn")
  public String getCredentialCrn() {
    return credentialCrn;
  }

  /**
   * Setter for credentialCrn.
   * CDP Credential CRN to fetch the AWS cross-account RoleArn for the account where the endpoint gets deleted.
   **/
  public void setCredentialCrn(String credentialCrn) {
    this.credentialCrn = credentialCrn;
  }

  /**
   * Getter for region.
   * Region in which VPC exists.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Region in which VPC exists.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for vpcId.
   * VPC ID in which the private link should be created.
   **/
  @JsonProperty("vpcId")
  public String getVpcId() {
    return vpcId;
  }

  /**
   * Setter for vpcId.
   * VPC ID in which the private link should be created.
   **/
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  /**
   * Getter for subnetIds.
   * IDs of the private subnets in which the private link should be created.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * IDs of the private subnets in which the private link should be created.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountDetails aWSAccountDetails = (AWSAccountDetails) o;
    if (!Objects.equals(this.cloudAccountId, aWSAccountDetails.cloudAccountId)) {
      return false;
    }
    if (!Objects.equals(this.crossAccountRoleDetails, aWSAccountDetails.crossAccountRoleDetails)) {
      return false;
    }
    if (!Objects.equals(this.credentialCrn, aWSAccountDetails.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.region, aWSAccountDetails.region)) {
      return false;
    }
    if (!Objects.equals(this.vpcId, aWSAccountDetails.vpcId)) {
      return false;
    }
    if (!Objects.equals(this.subnetIds, aWSAccountDetails.subnetIds)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, crossAccountRoleDetails, credentialCrn, region, vpcId, subnetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountDetails {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    crossAccountRoleDetails: ").append(toIndentedString(crossAccountRoleDetails)).append("\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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

