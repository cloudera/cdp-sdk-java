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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the DeleteMlServingApp method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-18T18:28:44.315-08:00")
public class DeleteMlServingAppRequest  {

  /**
   * The CRN of the Cloudera AI Inference Service to be deleted.
   **/
  private String appCrn = null;

  /**
   * Forcefully deletes the Cloudera AI Inference service, bypassing any errors encountered during the deletion process. Please note that using force delete removes the assurance that resources in your cloud account will be properly cleaned up. By default, force is set to false.
   **/
  private Boolean force = null;

  /**
   * Getter for appCrn.
   * The CRN of the Cloudera AI Inference Service to be deleted.
   **/
  @JsonProperty("appCrn")
  public String getAppCrn() {
    return appCrn;
  }

  /**
   * Setter for appCrn.
   * The CRN of the Cloudera AI Inference Service to be deleted.
   **/
  public void setAppCrn(String appCrn) {
    this.appCrn = appCrn;
  }

  /**
   * Getter for force.
   * Forcefully deletes the Cloudera AI Inference service, bypassing any errors encountered during the deletion process. Please note that using force delete removes the assurance that resources in your cloud account will be properly cleaned up. By default, force is set to false.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Forcefully deletes the Cloudera AI Inference service, bypassing any errors encountered during the deletion process. Please note that using force delete removes the assurance that resources in your cloud account will be properly cleaned up. By default, force is set to false.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteMlServingAppRequest deleteMlServingAppRequest = (DeleteMlServingAppRequest) o;
    if (!Objects.equals(this.appCrn, deleteMlServingAppRequest.appCrn)) {
      return false;
    }
    if (!Objects.equals(this.force, deleteMlServingAppRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCrn, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMlServingAppRequest {\n");
    sb.append("    appCrn: ").append(toIndentedString(appCrn)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

