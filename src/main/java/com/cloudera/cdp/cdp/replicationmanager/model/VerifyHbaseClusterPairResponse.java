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
import com.cloudera.cdp.replicationmanager.model.VerifyHbaseClusterPairResponseAfterPolicySteps;
import com.cloudera.cdp.replicationmanager.model.VerifyHbaseClusterPairResponseBeforePolicySteps;

/**
 * Response object for verifyHbaseClusterPair.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:30.576-07:00")
public class VerifyHbaseClusterPairResponse extends CdpResponse {

  /**
   * The current status of pairing.
   **/
  private String pairingStatus = null;

  /**
   * Substatus of an active pairing. Indicates if a pairing is resettable or in an erroneous state.
   **/
  private String pairedStatus = null;

  /**
   * Description of the pairing status.
   **/
  private String pairingMessage = null;

  /**
   * 
   **/
  private VerifyHbaseClusterPairResponseBeforePolicySteps beforePolicySteps = null;

  /**
   * 
   **/
  private VerifyHbaseClusterPairResponseAfterPolicySteps afterPolicySteps = null;

  /**
   * Getter for pairingStatus.
   * The current status of pairing.
   **/
  @JsonProperty("pairingStatus")
  public String getPairingStatus() {
    return pairingStatus;
  }

  /**
   * Setter for pairingStatus.
   * The current status of pairing.
   **/
  public void setPairingStatus(String pairingStatus) {
    this.pairingStatus = pairingStatus;
  }

  /**
   * Getter for pairedStatus.
   * Substatus of an active pairing. Indicates if a pairing is resettable or in an erroneous state.
   **/
  @JsonProperty("pairedStatus")
  public String getPairedStatus() {
    return pairedStatus;
  }

  /**
   * Setter for pairedStatus.
   * Substatus of an active pairing. Indicates if a pairing is resettable or in an erroneous state.
   **/
  public void setPairedStatus(String pairedStatus) {
    this.pairedStatus = pairedStatus;
  }

  /**
   * Getter for pairingMessage.
   * Description of the pairing status.
   **/
  @JsonProperty("pairingMessage")
  public String getPairingMessage() {
    return pairingMessage;
  }

  /**
   * Setter for pairingMessage.
   * Description of the pairing status.
   **/
  public void setPairingMessage(String pairingMessage) {
    this.pairingMessage = pairingMessage;
  }

  /**
   * Getter for beforePolicySteps.
   * 
   **/
  @JsonProperty("beforePolicySteps")
  public VerifyHbaseClusterPairResponseBeforePolicySteps getBeforePolicySteps() {
    return beforePolicySteps;
  }

  /**
   * Setter for beforePolicySteps.
   * 
   **/
  public void setBeforePolicySteps(VerifyHbaseClusterPairResponseBeforePolicySteps beforePolicySteps) {
    this.beforePolicySteps = beforePolicySteps;
  }

  /**
   * Getter for afterPolicySteps.
   * 
   **/
  @JsonProperty("afterPolicySteps")
  public VerifyHbaseClusterPairResponseAfterPolicySteps getAfterPolicySteps() {
    return afterPolicySteps;
  }

  /**
   * Setter for afterPolicySteps.
   * 
   **/
  public void setAfterPolicySteps(VerifyHbaseClusterPairResponseAfterPolicySteps afterPolicySteps) {
    this.afterPolicySteps = afterPolicySteps;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyHbaseClusterPairResponse verifyHbaseClusterPairResponse = (VerifyHbaseClusterPairResponse) o;
    if (!Objects.equals(this.pairingStatus, verifyHbaseClusterPairResponse.pairingStatus)) {
      return false;
    }
    if (!Objects.equals(this.pairedStatus, verifyHbaseClusterPairResponse.pairedStatus)) {
      return false;
    }
    if (!Objects.equals(this.pairingMessage, verifyHbaseClusterPairResponse.pairingMessage)) {
      return false;
    }
    if (!Objects.equals(this.beforePolicySteps, verifyHbaseClusterPairResponse.beforePolicySteps)) {
      return false;
    }
    if (!Objects.equals(this.afterPolicySteps, verifyHbaseClusterPairResponse.afterPolicySteps)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairingStatus, pairedStatus, pairingMessage, beforePolicySteps, afterPolicySteps, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyHbaseClusterPairResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pairingStatus: ").append(toIndentedString(pairingStatus)).append("\n");
    sb.append("    pairedStatus: ").append(toIndentedString(pairedStatus)).append("\n");
    sb.append("    pairingMessage: ").append(toIndentedString(pairingMessage)).append("\n");
    sb.append("    beforePolicySteps: ").append(toIndentedString(beforePolicySteps)).append("\n");
    sb.append("    afterPolicySteps: ").append(toIndentedString(afterPolicySteps)).append("\n");
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

