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
 * Response object for GetSuspendResumeStatus request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:53.384-07:00")
public class GetSuspendResumeStatusResponse extends CdpResponse {

  /**
   * The status of the suspend/resume operation.
   **/
  private String statusMessage = null;

  /**
   * The next step to take in the multi-step suspend/resume process.
   **/
  private String nextStep = null;

  /**
   * Indicates if all steps in the multi-step suspend/resume process were successfully completed.
   **/
  private Boolean allStepsCompleted = null;

  /**
   * Getter for statusMessage.
   * The status of the suspend/resume operation.
   **/
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Setter for statusMessage.
   * The status of the suspend/resume operation.
   **/
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  /**
   * Getter for nextStep.
   * The next step to take in the multi-step suspend/resume process.
   **/
  @JsonProperty("nextStep")
  public String getNextStep() {
    return nextStep;
  }

  /**
   * Setter for nextStep.
   * The next step to take in the multi-step suspend/resume process.
   **/
  public void setNextStep(String nextStep) {
    this.nextStep = nextStep;
  }

  /**
   * Getter for allStepsCompleted.
   * Indicates if all steps in the multi-step suspend/resume process were successfully completed.
   **/
  @JsonProperty("allStepsCompleted")
  public Boolean getAllStepsCompleted() {
    return allStepsCompleted;
  }

  /**
   * Setter for allStepsCompleted.
   * Indicates if all steps in the multi-step suspend/resume process were successfully completed.
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
    GetSuspendResumeStatusResponse getSuspendResumeStatusResponse = (GetSuspendResumeStatusResponse) o;
    if (!Objects.equals(this.statusMessage, getSuspendResumeStatusResponse.statusMessage)) {
      return false;
    }
    if (!Objects.equals(this.nextStep, getSuspendResumeStatusResponse.nextStep)) {
      return false;
    }
    if (!Objects.equals(this.allStepsCompleted, getSuspendResumeStatusResponse.allStepsCompleted)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusMessage, nextStep, allStepsCompleted, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuspendResumeStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

