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
 * A ML workspace, which includes the cluster / storage.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-21T14:31:31.858-07:00")
public class Workspace  {

  /**
   * The name of the workspace's environment.
   **/
  private String environmentName = null;

  /**
   * The name of the workspace.
   **/
  private String instanceName = null;

  /**
   * The workspace's current status.
   **/
  private String instanceStatus = null;

  /**
   * URL of the workspace's user interface.
   **/
  private String instanceUrl = null;

  /**
   * Getter for environmentName.
   * The name of the workspace&#39;s environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the workspace&#39;s environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for instanceName.
   * The name of the workspace.
   **/
  @JsonProperty("instanceName")
  public String getInstanceName() {
    return instanceName;
  }

  /**
   * Setter for instanceName.
   * The name of the workspace.
   **/
  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  /**
   * Getter for instanceStatus.
   * The workspace&#39;s current status.
   **/
  @JsonProperty("instanceStatus")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  /**
   * Setter for instanceStatus.
   * The workspace&#39;s current status.
   **/
  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  /**
   * Getter for instanceUrl.
   * URL of the workspace&#39;s user interface.
   **/
  @JsonProperty("instanceUrl")
  public String getInstanceUrl() {
    return instanceUrl;
  }

  /**
   * Setter for instanceUrl.
   * URL of the workspace&#39;s user interface.
   **/
  public void setInstanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workspace workspace = (Workspace) o;
    if (!Objects.equals(this.environmentName, workspace.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.instanceName, workspace.instanceName)) {
      return false;
    }
    if (!Objects.equals(this.instanceStatus, workspace.instanceStatus)) {
      return false;
    }
    if (!Objects.equals(this.instanceUrl, workspace.instanceUrl)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, instanceName, instanceStatus, instanceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
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

