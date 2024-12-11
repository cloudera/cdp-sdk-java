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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.ValidationResult;
import com.cloudera.cdp.compute.model.ValidationSummary;
import java.util.*;

/**
 * Validate cluster response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:12.496-08:00")
public class ValidateClusterResponse extends CdpResponse {

  /**
   * Validation result.
   **/
  private String result = null;

  /**
   * Numerical summary of the validations.
   **/
  private ValidationSummary summary = null;

  /**
   * A message describing the end result of the validations.
   **/
  private String message = null;

  /**
   * The list of detailed validation results.
   **/
  private List<ValidationResult> validations = new ArrayList<ValidationResult>();

  /**
   * Getter for result.
   * Validation result.
   **/
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  /**
   * Setter for result.
   * Validation result.
   **/
  public void setResult(String result) {
    this.result = result;
  }

  /**
   * Getter for summary.
   * Numerical summary of the validations.
   **/
  @JsonProperty("summary")
  public ValidationSummary getSummary() {
    return summary;
  }

  /**
   * Setter for summary.
   * Numerical summary of the validations.
   **/
  public void setSummary(ValidationSummary summary) {
    this.summary = summary;
  }

  /**
   * Getter for message.
   * A message describing the end result of the validations.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * A message describing the end result of the validations.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for validations.
   * The list of detailed validation results.
   **/
  @JsonProperty("validations")
  public List<ValidationResult> getValidations() {
    return validations;
  }

  /**
   * Setter for validations.
   * The list of detailed validation results.
   **/
  public void setValidations(List<ValidationResult> validations) {
    this.validations = validations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateClusterResponse validateClusterResponse = (ValidateClusterResponse) o;
    if (!Objects.equals(this.result, validateClusterResponse.result)) {
      return false;
    }
    if (!Objects.equals(this.summary, validateClusterResponse.summary)) {
      return false;
    }
    if (!Objects.equals(this.message, validateClusterResponse.message)) {
      return false;
    }
    if (!Objects.equals(this.validations, validateClusterResponse.validations)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, summary, message, validations, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateClusterResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
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

