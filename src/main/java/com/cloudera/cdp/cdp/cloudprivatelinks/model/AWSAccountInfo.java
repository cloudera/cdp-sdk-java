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

/**
 * Details of the cloud network and the cross-account role required to delete the PrivateLink endpoint.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:46.268-08:00")
public class AWSAccountInfo  {

  /**
   * Cross account role details.
   **/
  private CrossAccountRoleDetails crossAccountRoleDetails = null;

  /**
   * CDP Credential CRN to fetch the AWS cross-account roleArn for the account where the endpoint gets deleted.
   **/
  private String credentialCrn = null;

  /**
   * Region in which VPC exists.
   **/
  private String region = null;

  /**
   * VPC ID in which the vpc endpoint should be deleted.
   **/
  private String vpcId = null;

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
   * CDP Credential CRN to fetch the AWS cross-account roleArn for the account where the endpoint gets deleted.
   **/
  @JsonProperty("credentialCrn")
  public String getCredentialCrn() {
    return credentialCrn;
  }

  /**
   * Setter for credentialCrn.
   * CDP Credential CRN to fetch the AWS cross-account roleArn for the account where the endpoint gets deleted.
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
   * VPC ID in which the vpc endpoint should be deleted.
   **/
  @JsonProperty("vpcId")
  public String getVpcId() {
    return vpcId;
  }

  /**
   * Setter for vpcId.
   * VPC ID in which the vpc endpoint should be deleted.
   **/
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountInfo aWSAccountInfo = (AWSAccountInfo) o;
    if (!Objects.equals(this.crossAccountRoleDetails, aWSAccountInfo.crossAccountRoleDetails)) {
      return false;
    }
    if (!Objects.equals(this.credentialCrn, aWSAccountInfo.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.region, aWSAccountInfo.region)) {
      return false;
    }
    if (!Objects.equals(this.vpcId, aWSAccountInfo.vpcId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossAccountRoleDetails, credentialCrn, region, vpcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountInfo {\n");
    sb.append("    crossAccountRoleDetails: ").append(toIndentedString(crossAccountRoleDetails)).append("\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

