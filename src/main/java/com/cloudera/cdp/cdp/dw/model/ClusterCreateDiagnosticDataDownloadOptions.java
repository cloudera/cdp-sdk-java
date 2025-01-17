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

/**
 * DEPRECATED: Included by default, no need to specify
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:20.552-08:00")
public class ClusterCreateDiagnosticDataDownloadOptions  {

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeClusterInfo = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeIstioSystem = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeSharedServices = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeKubeSystem = false;

  /**
   * Getter for includeClusterInfo.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeClusterInfo")
  public Boolean getIncludeClusterInfo() {
    return includeClusterInfo;
  }

  /**
   * Setter for includeClusterInfo.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeClusterInfo(Boolean includeClusterInfo) {
    this.includeClusterInfo = includeClusterInfo;
  }

  /**
   * Getter for includeIstioSystem.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeIstioSystem")
  public Boolean getIncludeIstioSystem() {
    return includeIstioSystem;
  }

  /**
   * Setter for includeIstioSystem.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeIstioSystem(Boolean includeIstioSystem) {
    this.includeIstioSystem = includeIstioSystem;
  }

  /**
   * Getter for includeSharedServices.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeSharedServices")
  public Boolean getIncludeSharedServices() {
    return includeSharedServices;
  }

  /**
   * Setter for includeSharedServices.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeSharedServices(Boolean includeSharedServices) {
    this.includeSharedServices = includeSharedServices;
  }

  /**
   * Getter for includeKubeSystem.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeKubeSystem")
  public Boolean getIncludeKubeSystem() {
    return includeKubeSystem;
  }

  /**
   * Setter for includeKubeSystem.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeKubeSystem(Boolean includeKubeSystem) {
    this.includeKubeSystem = includeKubeSystem;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterCreateDiagnosticDataDownloadOptions clusterCreateDiagnosticDataDownloadOptions = (ClusterCreateDiagnosticDataDownloadOptions) o;
    if (!Objects.equals(this.includeClusterInfo, clusterCreateDiagnosticDataDownloadOptions.includeClusterInfo)) {
      return false;
    }
    if (!Objects.equals(this.includeIstioSystem, clusterCreateDiagnosticDataDownloadOptions.includeIstioSystem)) {
      return false;
    }
    if (!Objects.equals(this.includeSharedServices, clusterCreateDiagnosticDataDownloadOptions.includeSharedServices)) {
      return false;
    }
    if (!Objects.equals(this.includeKubeSystem, clusterCreateDiagnosticDataDownloadOptions.includeKubeSystem)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeClusterInfo, includeIstioSystem, includeSharedServices, includeKubeSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterCreateDiagnosticDataDownloadOptions {\n");
    sb.append("    includeClusterInfo: ").append(toIndentedString(includeClusterInfo)).append("\n");
    sb.append("    includeIstioSystem: ").append(toIndentedString(includeIstioSystem)).append("\n");
    sb.append("    includeSharedServices: ").append(toIndentedString(includeSharedServices)).append("\n");
    sb.append("    includeKubeSystem: ").append(toIndentedString(includeKubeSystem)).append("\n");
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

