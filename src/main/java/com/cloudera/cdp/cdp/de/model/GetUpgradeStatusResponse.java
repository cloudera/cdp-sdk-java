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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object for GetUpgradeStatus request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:08.005-08:00")
public class GetUpgradeStatusResponse extends CdpResponse {

  /**
   * The status of the upgrade.
   **/
  private String upgradeStatusMessage = null;

  /**
   * The next step to take in multi-step upgrade process. Currently supported steps are prepare, backup, upgrade and resume.
   **/
  private String nextStep = null;

  /**
   * Whether all the steps of the multi-step upgrade process completed.
   **/
  private Boolean allStepsCompleted = null;

  /**
   * Getter for upgradeStatusMessage.
   * The status of the upgrade.
   **/
  @JsonProperty("upgradeStatusMessage")
  public String getUpgradeStatusMessage() {
    return upgradeStatusMessage;
  }

  /**
   * Setter for upgradeStatusMessage.
   * The status of the upgrade.
   **/
  public void setUpgradeStatusMessage(String upgradeStatusMessage) {
    this.upgradeStatusMessage = upgradeStatusMessage;
  }

  /**
   * Getter for nextStep.
   * The next step to take in multi-step upgrade process. Currently supported steps are prepare, backup, upgrade and resume.
   **/
  @JsonProperty("nextStep")
  public String getNextStep() {
    return nextStep;
  }

  /**
   * Setter for nextStep.
   * The next step to take in multi-step upgrade process. Currently supported steps are prepare, backup, upgrade and resume.
   **/
  public void setNextStep(String nextStep) {
    this.nextStep = nextStep;
  }

  /**
   * Getter for allStepsCompleted.
   * Whether all the steps of the multi-step upgrade process completed.
   **/
  @JsonProperty("allStepsCompleted")
  public Boolean getAllStepsCompleted() {
    return allStepsCompleted;
  }

  /**
   * Setter for allStepsCompleted.
   * Whether all the steps of the multi-step upgrade process completed.
   **/
  public void setAllStepsCompleted(Boolean allStepsCompleted) {
    this.allStepsCompleted = allStepsCompleted;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUpgradeStatusResponse getUpgradeStatusResponse = (GetUpgradeStatusResponse) o;
    if (!Objects.equals(this.upgradeStatusMessage, getUpgradeStatusResponse.upgradeStatusMessage)) {
      return false;
    }
    if (!Objects.equals(this.nextStep, getUpgradeStatusResponse.nextStep)) {
      return false;
    }
    if (!Objects.equals(this.allStepsCompleted, getUpgradeStatusResponse.allStepsCompleted)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(upgradeStatusMessage, nextStep, allStepsCompleted, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUpgradeStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    upgradeStatusMessage: ").append(toIndentedString(upgradeStatusMessage)).append("\n");
    sb.append("    nextStep: ").append(toIndentedString(nextStep)).append("\n");
    sb.append("    allStepsCompleted: ").append(toIndentedString(allStepsCompleted)).append("\n");
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

