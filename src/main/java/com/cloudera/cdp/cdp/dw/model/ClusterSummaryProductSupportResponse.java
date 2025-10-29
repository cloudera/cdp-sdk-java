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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Support lifecycle details of the given Cluster version (see version field). Learn more at Support lifecycle site: https://www.cloudera.com/services-and-support/support-lifecycle-policy.html.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:26.728-07:00")
public class ClusterSummaryProductSupportResponse extends CdpResponse {

  /**
   * Status of the support lifecycle. *COVERED*: The Cluster version has active support. *EXPIRED*: The Cluster version is no-longer supported. *UNKNOWN*: The Cluster version is missing or incorrect.
   **/
  private String status = null;

  /**
   * Shows the expiration date of the support for this Cluster version.
   **/
  private ZonedDateTime expiryDate = null;

  /**
   * Message.
   **/
  private String message = null;

  /**
   * Getter for status.
   * Status of the support lifecycle. *COVERED*: The Cluster version has active support. *EXPIRED*: The Cluster version is no-longer supported. *UNKNOWN*: The Cluster version is missing or incorrect.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the support lifecycle. *COVERED*: The Cluster version has active support. *EXPIRED*: The Cluster version is no-longer supported. *UNKNOWN*: The Cluster version is missing or incorrect.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for expiryDate.
   * Shows the expiration date of the support for this Cluster version.
   **/
  @JsonProperty("expiryDate")
  public ZonedDateTime getExpiryDate() {
    return expiryDate;
  }

  /**
   * Setter for expiryDate.
   * Shows the expiration date of the support for this Cluster version.
   **/
  public void setExpiryDate(ZonedDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   * Getter for message.
   * Message.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Message.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSummaryProductSupportResponse clusterSummaryProductSupportResponse = (ClusterSummaryProductSupportResponse) o;
    if (!Objects.equals(this.status, clusterSummaryProductSupportResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.expiryDate, clusterSummaryProductSupportResponse.expiryDate)) {
      return false;
    }
    if (!Objects.equals(this.message, clusterSummaryProductSupportResponse.message)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, expiryDate, message, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSummaryProductSupportResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

