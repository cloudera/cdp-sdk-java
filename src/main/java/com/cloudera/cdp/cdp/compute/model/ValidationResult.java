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
 * Validation result structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-18T18:28:47.390-08:00")
public class ValidationResult  {

  /**
   * Name.
   **/
  private String name = null;

  /**
   * Description.
   **/
  private String description = null;

  /**
   * Validation check categories such as COMMON, ENTITLEMENTS, CONTROL_PLANE, NETWORK, or DEPLOYMENT. New values may be added in the future.
   **/
  private String category = null;

  /**
   * Validation check status such as PASSED, FAILED, or SKIPPED. New values may be added in the future.
   **/
  private String status = null;

  /**
   * A short, human-readable message that describes the end result of the validation.
   **/
  private String message = null;

  /**
   * A supporting message which contains additional details, such as subnet names, instance types, etc.
   **/
  private String detailedMessage = null;

  /**
   * Time taken to get the end result of the validation in a human-readable time format.
   **/
  private String duration = null;

  /**
   * Getter for name.
   * Name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * Description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for category.
   * Validation check categories such as COMMON, ENTITLEMENTS, CONTROL_PLANE, NETWORK, or DEPLOYMENT. New values may be added in the future.
   **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  /**
   * Setter for category.
   * Validation check categories such as COMMON, ENTITLEMENTS, CONTROL_PLANE, NETWORK, or DEPLOYMENT. New values may be added in the future.
   **/
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Getter for status.
   * Validation check status such as PASSED, FAILED, or SKIPPED. New values may be added in the future.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Validation check status such as PASSED, FAILED, or SKIPPED. New values may be added in the future.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for message.
   * A short, human-readable message that describes the end result of the validation.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * A short, human-readable message that describes the end result of the validation.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for detailedMessage.
   * A supporting message which contains additional details, such as subnet names, instance types, etc.
   **/
  @JsonProperty("detailedMessage")
  public String getDetailedMessage() {
    return detailedMessage;
  }

  /**
   * Setter for detailedMessage.
   * A supporting message which contains additional details, such as subnet names, instance types, etc.
   **/
  public void setDetailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage;
  }

  /**
   * Getter for duration.
   * Time taken to get the end result of the validation in a human-readable time format.
   **/
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  /**
   * Setter for duration.
   * Time taken to get the end result of the validation in a human-readable time format.
   **/
  public void setDuration(String duration) {
    this.duration = duration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResult validationResult = (ValidationResult) o;
    if (!Objects.equals(this.name, validationResult.name)) {
      return false;
    }
    if (!Objects.equals(this.description, validationResult.description)) {
      return false;
    }
    if (!Objects.equals(this.category, validationResult.category)) {
      return false;
    }
    if (!Objects.equals(this.status, validationResult.status)) {
      return false;
    }
    if (!Objects.equals(this.message, validationResult.message)) {
      return false;
    }
    if (!Objects.equals(this.detailedMessage, validationResult.detailedMessage)) {
      return false;
    }
    if (!Objects.equals(this.duration, validationResult.duration)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, category, status, message, detailedMessage, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResult {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    detailedMessage: ").append(toIndentedString(detailedMessage)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

