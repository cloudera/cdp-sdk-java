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
import java.time.ZonedDateTime;

/**
 * A ML workspace, which includes the cluster and storage.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-09-19T14:17:02.417-07:00")
public class Workspace  {

  /**
   * Creation date of workspace.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The CRN of the creator of the workspace.
   **/
  private String creatorCrn = null;

  /**
   * The CRN of the workspace.
   **/
  private String crn = null;

  /**
   * CRN of the environment.
   **/
  private String environmentCrn = null;

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
   * The Kubernetes cluster name.
   **/
  private String k8sClusterName = null;

  /**
   * The version of Clouder Machine Learning that was installed on the workspace.
   **/
  private String version = null;

  /**
   * Getter for creationDate.
   * Creation date of workspace.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of workspace.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for creatorCrn.
   * The CRN of the creator of the workspace.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The CRN of the creator of the workspace.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for crn.
   * The CRN of the workspace.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the workspace.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for environmentCrn.
   * CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

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

  /**
   * Getter for k8sClusterName.
   * The Kubernetes cluster name.
   **/
  @JsonProperty("k8sClusterName")
  public String getK8sClusterName() {
    return k8sClusterName;
  }

  /**
   * Setter for k8sClusterName.
   * The Kubernetes cluster name.
   **/
  public void setK8sClusterName(String k8sClusterName) {
    this.k8sClusterName = k8sClusterName;
  }

  /**
   * Getter for version.
   * The version of Clouder Machine Learning that was installed on the workspace.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of Clouder Machine Learning that was installed on the workspace.
   **/
  public void setVersion(String version) {
    this.version = version;
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
    if (!Objects.equals(this.creationDate, workspace.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, workspace.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.crn, workspace.crn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, workspace.environmentCrn)) {
      return false;
    }
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
    if (!Objects.equals(this.k8sClusterName, workspace.k8sClusterName)) {
      return false;
    }
    if (!Objects.equals(this.version, workspace.version)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, creatorCrn, crn, environmentCrn, environmentName, instanceName, instanceStatus, instanceUrl, k8sClusterName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
    sb.append("    k8sClusterName: ").append(toIndentedString(k8sClusterName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

