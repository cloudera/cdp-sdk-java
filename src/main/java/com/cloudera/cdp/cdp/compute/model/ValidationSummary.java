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

/**
 * Validation summary structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:48.661-07:00")
public class ValidationSummary  {

  /**
   * Total number of passed validations.
   **/
  private Integer passed = null;

  /**
   * Total number of validations that passed but have warnings associated with them.
   **/
  private Integer warning = null;

  /**
   * Total number of failed validations.
   **/
  private Integer failed = null;

  /**
   * Total number of skipped validations.
   **/
  private Integer skipped = null;

  /**
   * Total number of validations.
   **/
  private Integer total = null;

  /**
   * Getter for passed.
   * Total number of passed validations.
   **/
  @JsonProperty("passed")
  public Integer getPassed() {
    return passed;
  }

  /**
   * Setter for passed.
   * Total number of passed validations.
   **/
  public void setPassed(Integer passed) {
    this.passed = passed;
  }

  /**
   * Getter for warning.
   * Total number of validations that passed but have warnings associated with them.
   **/
  @JsonProperty("warning")
  public Integer getWarning() {
    return warning;
  }

  /**
   * Setter for warning.
   * Total number of validations that passed but have warnings associated with them.
   **/
  public void setWarning(Integer warning) {
    this.warning = warning;
  }

  /**
   * Getter for failed.
   * Total number of failed validations.
   **/
  @JsonProperty("failed")
  public Integer getFailed() {
    return failed;
  }

  /**
   * Setter for failed.
   * Total number of failed validations.
   **/
  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  /**
   * Getter for skipped.
   * Total number of skipped validations.
   **/
  @JsonProperty("skipped")
  public Integer getSkipped() {
    return skipped;
  }

  /**
   * Setter for skipped.
   * Total number of skipped validations.
   **/
  public void setSkipped(Integer skipped) {
    this.skipped = skipped;
  }

  /**
   * Getter for total.
   * Total number of validations.
   **/
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  /**
   * Setter for total.
   * Total number of validations.
   **/
  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationSummary validationSummary = (ValidationSummary) o;
    if (!Objects.equals(this.passed, validationSummary.passed)) {
      return false;
    }
    if (!Objects.equals(this.warning, validationSummary.warning)) {
      return false;
    }
    if (!Objects.equals(this.failed, validationSummary.failed)) {
      return false;
    }
    if (!Objects.equals(this.skipped, validationSummary.skipped)) {
      return false;
    }
    if (!Objects.equals(this.total, validationSummary.total)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(passed, warning, failed, skipped, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationSummary {\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

