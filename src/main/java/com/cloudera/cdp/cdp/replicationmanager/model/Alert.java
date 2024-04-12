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

/**
 * Cloudera Manager alerting behavior.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-11T13:44:55.151-07:00")
public class Alert  {

  /**
   * Alert on failure.
   **/
  private Boolean onFailure = null;

  /**
   * Alert on start.
   **/
  private Boolean onStart = null;

  /**
   * ALert on success.
   **/
  private Boolean onSuccess = null;

  /**
   * Alert on abort.
   **/
  private Boolean onAbort = null;

  /**
   * Getter for onFailure.
   * Alert on failure.
   **/
  @JsonProperty("onFailure")
  public Boolean getOnFailure() {
    return onFailure;
  }

  /**
   * Setter for onFailure.
   * Alert on failure.
   **/
  public void setOnFailure(Boolean onFailure) {
    this.onFailure = onFailure;
  }

  /**
   * Getter for onStart.
   * Alert on start.
   **/
  @JsonProperty("onStart")
  public Boolean getOnStart() {
    return onStart;
  }

  /**
   * Setter for onStart.
   * Alert on start.
   **/
  public void setOnStart(Boolean onStart) {
    this.onStart = onStart;
  }

  /**
   * Getter for onSuccess.
   * ALert on success.
   **/
  @JsonProperty("onSuccess")
  public Boolean getOnSuccess() {
    return onSuccess;
  }

  /**
   * Setter for onSuccess.
   * ALert on success.
   **/
  public void setOnSuccess(Boolean onSuccess) {
    this.onSuccess = onSuccess;
  }

  /**
   * Getter for onAbort.
   * Alert on abort.
   **/
  @JsonProperty("onAbort")
  public Boolean getOnAbort() {
    return onAbort;
  }

  /**
   * Setter for onAbort.
   * Alert on abort.
   **/
  public void setOnAbort(Boolean onAbort) {
    this.onAbort = onAbort;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alert alert = (Alert) o;
    if (!Objects.equals(this.onFailure, alert.onFailure)) {
      return false;
    }
    if (!Objects.equals(this.onStart, alert.onStart)) {
      return false;
    }
    if (!Objects.equals(this.onSuccess, alert.onSuccess)) {
      return false;
    }
    if (!Objects.equals(this.onAbort, alert.onAbort)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onStart, onSuccess, onAbort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alert {\n");
    sb.append("    onFailure: ").append(toIndentedString(onFailure)).append("\n");
    sb.append("    onStart: ").append(toIndentedString(onStart)).append("\n");
    sb.append("    onSuccess: ").append(toIndentedString(onSuccess)).append("\n");
    sb.append("    onAbort: ").append(toIndentedString(onAbort)).append("\n");
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

