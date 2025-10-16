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
import java.util.*;
import java.util.Map;

/**
 * Response object for the createVwDiagnosticDataJob method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:44.787-07:00")
public class CreateVwDiagnosticDataJobResponse extends CdpResponse {

  /**
   * Identifier for each bundle collection.
   **/
  private String id = null;

  /**
   * Status of the diagnostics collection request.
   **/
  private String status = null;

  /**
   * This URL points to a download location if the destination is DOWNLOAD.
   **/
  private String url = null;

  /**
   * Additional key-value pair attributes associated with the Diagnostic Data Job.
   **/
  private Map<String, String> labels = new HashMap<String, String>();

  /**
   * Getter for id.
   * Identifier for each bundle collection.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Identifier for each bundle collection.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for status.
   * Status of the diagnostics collection request.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the diagnostics collection request.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for url.
   * This URL points to a download location if the destination is DOWNLOAD.
   **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Setter for url.
   * This URL points to a download location if the destination is DOWNLOAD.
   **/
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Getter for labels.
   * Additional key-value pair attributes associated with the Diagnostic Data Job.
   **/
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  /**
   * Setter for labels.
   * Additional key-value pair attributes associated with the Diagnostic Data Job.
   **/
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVwDiagnosticDataJobResponse createVwDiagnosticDataJobResponse = (CreateVwDiagnosticDataJobResponse) o;
    if (!Objects.equals(this.id, createVwDiagnosticDataJobResponse.id)) {
      return false;
    }
    if (!Objects.equals(this.status, createVwDiagnosticDataJobResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.url, createVwDiagnosticDataJobResponse.url)) {
      return false;
    }
    if (!Objects.equals(this.labels, createVwDiagnosticDataJobResponse.labels)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, url, labels, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVwDiagnosticDataJobResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

