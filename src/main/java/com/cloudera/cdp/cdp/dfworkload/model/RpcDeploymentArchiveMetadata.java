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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Provides the metadata about deployment exported archive
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:38.216-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class RpcDeploymentArchiveMetadata  {

  /**
   * The version of workload when deployment configuration is exported.
   **/
  private String workloadVersion = null;

  /**
   * The name of the deployment
   **/
  private String deploymentName = null;

  /**
   * The name of the flow
   **/
  private String flowName = null;

  /**
   * The name of the exported deployment archive
   **/
  private String archiveName = null;

  /**
   * The time when the deployment archive is created or modified
   **/
  private Long modifiedTime = null;

  /**
   * The description provided during deployment configuration export
   **/
  private String archiveDescription = null;

  /**
   * The time when the deployment archive is uploaded to cloud
   **/
  private Long uploadTime = null;

  /**
   * The CRN of the project that exported deployment is assigned to.
   **/
  private String projectCrn = null;

  /**
   * Getter for workloadVersion.
   * The version of workload when deployment configuration is exported.
   **/
  @JsonProperty("workloadVersion")
  public String getWorkloadVersion() {
    return workloadVersion;
  }

  /**
   * Setter for workloadVersion.
   * The version of workload when deployment configuration is exported.
   **/
  public void setWorkloadVersion(String workloadVersion) {
    this.workloadVersion = workloadVersion;
  }

  /**
   * Getter for deploymentName.
   * The name of the deployment
   **/
  @JsonProperty("deploymentName")
  public String getDeploymentName() {
    return deploymentName;
  }

  /**
   * Setter for deploymentName.
   * The name of the deployment
   **/
  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  /**
   * Getter for flowName.
   * The name of the flow
   **/
  @JsonProperty("flowName")
  public String getFlowName() {
    return flowName;
  }

  /**
   * Setter for flowName.
   * The name of the flow
   **/
  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  /**
   * Getter for archiveName.
   * The name of the exported deployment archive
   **/
  @JsonProperty("archiveName")
  public String getArchiveName() {
    return archiveName;
  }

  /**
   * Setter for archiveName.
   * The name of the exported deployment archive
   **/
  public void setArchiveName(String archiveName) {
    this.archiveName = archiveName;
  }

  /**
   * Getter for modifiedTime.
   * The time when the deployment archive is created or modified
   **/
  @JsonProperty("modifiedTime")
  public Long getModifiedTime() {
    return modifiedTime;
  }

  /**
   * Setter for modifiedTime.
   * The time when the deployment archive is created or modified
   **/
  public void setModifiedTime(Long modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  /**
   * Getter for archiveDescription.
   * The description provided during deployment configuration export
   **/
  @JsonProperty("archiveDescription")
  public String getArchiveDescription() {
    return archiveDescription;
  }

  /**
   * Setter for archiveDescription.
   * The description provided during deployment configuration export
   **/
  public void setArchiveDescription(String archiveDescription) {
    this.archiveDescription = archiveDescription;
  }

  /**
   * Getter for uploadTime.
   * The time when the deployment archive is uploaded to cloud
   **/
  @JsonProperty("uploadTime")
  public Long getUploadTime() {
    return uploadTime;
  }

  /**
   * Setter for uploadTime.
   * The time when the deployment archive is uploaded to cloud
   **/
  public void setUploadTime(Long uploadTime) {
    this.uploadTime = uploadTime;
  }

  /**
   * Getter for projectCrn.
   * The CRN of the project that exported deployment is assigned to.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The CRN of the project that exported deployment is assigned to.
   **/
  public void setProjectCrn(String projectCrn) {
    this.projectCrn = projectCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcDeploymentArchiveMetadata rpcDeploymentArchiveMetadata = (RpcDeploymentArchiveMetadata) o;
    if (!Objects.equals(this.workloadVersion, rpcDeploymentArchiveMetadata.workloadVersion)) {
      return false;
    }
    if (!Objects.equals(this.deploymentName, rpcDeploymentArchiveMetadata.deploymentName)) {
      return false;
    }
    if (!Objects.equals(this.flowName, rpcDeploymentArchiveMetadata.flowName)) {
      return false;
    }
    if (!Objects.equals(this.archiveName, rpcDeploymentArchiveMetadata.archiveName)) {
      return false;
    }
    if (!Objects.equals(this.modifiedTime, rpcDeploymentArchiveMetadata.modifiedTime)) {
      return false;
    }
    if (!Objects.equals(this.archiveDescription, rpcDeploymentArchiveMetadata.archiveDescription)) {
      return false;
    }
    if (!Objects.equals(this.uploadTime, rpcDeploymentArchiveMetadata.uploadTime)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, rpcDeploymentArchiveMetadata.projectCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadVersion, deploymentName, flowName, archiveName, modifiedTime, archiveDescription, uploadTime, projectCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcDeploymentArchiveMetadata {\n");
    sb.append("    workloadVersion: ").append(toIndentedString(workloadVersion)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    archiveName: ").append(toIndentedString(archiveName)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
    sb.append("    archiveDescription: ").append(toIndentedString(archiveDescription)).append("\n");
    sb.append("    uploadTime: ").append(toIndentedString(uploadTime)).append("\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
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

