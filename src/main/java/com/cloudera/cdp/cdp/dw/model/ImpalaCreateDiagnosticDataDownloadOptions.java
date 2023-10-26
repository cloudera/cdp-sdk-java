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
 * Flags that denote which diagnostics to include for an Impala Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-25T14:07:11.904-07:00")
public class ImpalaCreateDiagnosticDataDownloadOptions  {

  /**
   * Include the HMS diagnostics.
   **/
  private Boolean includeHms = false;

  /**
   * Include the minidump.
   **/
  private Boolean includeMinidump = false;

  /**
   * Include the profile.
   **/
  private Boolean includeProfile = false;

  /**
   * Include the sidecar diagnostics.
   **/
  private Boolean includeSidecar = false;

  /**
   * Include the workload diagnostics.
   **/
  private Boolean includeWorkload = false;

  /**
   * Include kubernetes resource info.
   **/
  private Boolean includeKubernetesResourceInfo = false;

  /**
   * Getter for includeHms.
   * Include the HMS diagnostics.
   **/
  @JsonProperty("includeHms")
  public Boolean getIncludeHms() {
    return includeHms;
  }

  /**
   * Setter for includeHms.
   * Include the HMS diagnostics.
   **/
  public void setIncludeHms(Boolean includeHms) {
    this.includeHms = includeHms;
  }

  /**
   * Getter for includeMinidump.
   * Include the minidump.
   **/
  @JsonProperty("includeMinidump")
  public Boolean getIncludeMinidump() {
    return includeMinidump;
  }

  /**
   * Setter for includeMinidump.
   * Include the minidump.
   **/
  public void setIncludeMinidump(Boolean includeMinidump) {
    this.includeMinidump = includeMinidump;
  }

  /**
   * Getter for includeProfile.
   * Include the profile.
   **/
  @JsonProperty("includeProfile")
  public Boolean getIncludeProfile() {
    return includeProfile;
  }

  /**
   * Setter for includeProfile.
   * Include the profile.
   **/
  public void setIncludeProfile(Boolean includeProfile) {
    this.includeProfile = includeProfile;
  }

  /**
   * Getter for includeSidecar.
   * Include the sidecar diagnostics.
   **/
  @JsonProperty("includeSidecar")
  public Boolean getIncludeSidecar() {
    return includeSidecar;
  }

  /**
   * Setter for includeSidecar.
   * Include the sidecar diagnostics.
   **/
  public void setIncludeSidecar(Boolean includeSidecar) {
    this.includeSidecar = includeSidecar;
  }

  /**
   * Getter for includeWorkload.
   * Include the workload diagnostics.
   **/
  @JsonProperty("includeWorkload")
  public Boolean getIncludeWorkload() {
    return includeWorkload;
  }

  /**
   * Setter for includeWorkload.
   * Include the workload diagnostics.
   **/
  public void setIncludeWorkload(Boolean includeWorkload) {
    this.includeWorkload = includeWorkload;
  }

  /**
   * Getter for includeKubernetesResourceInfo.
   * Include kubernetes resource info.
   **/
  @JsonProperty("includeKubernetesResourceInfo")
  public Boolean getIncludeKubernetesResourceInfo() {
    return includeKubernetesResourceInfo;
  }

  /**
   * Setter for includeKubernetesResourceInfo.
   * Include kubernetes resource info.
   **/
  public void setIncludeKubernetesResourceInfo(Boolean includeKubernetesResourceInfo) {
    this.includeKubernetesResourceInfo = includeKubernetesResourceInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaCreateDiagnosticDataDownloadOptions impalaCreateDiagnosticDataDownloadOptions = (ImpalaCreateDiagnosticDataDownloadOptions) o;
    if (!Objects.equals(this.includeHms, impalaCreateDiagnosticDataDownloadOptions.includeHms)) {
      return false;
    }
    if (!Objects.equals(this.includeMinidump, impalaCreateDiagnosticDataDownloadOptions.includeMinidump)) {
      return false;
    }
    if (!Objects.equals(this.includeProfile, impalaCreateDiagnosticDataDownloadOptions.includeProfile)) {
      return false;
    }
    if (!Objects.equals(this.includeSidecar, impalaCreateDiagnosticDataDownloadOptions.includeSidecar)) {
      return false;
    }
    if (!Objects.equals(this.includeWorkload, impalaCreateDiagnosticDataDownloadOptions.includeWorkload)) {
      return false;
    }
    if (!Objects.equals(this.includeKubernetesResourceInfo, impalaCreateDiagnosticDataDownloadOptions.includeKubernetesResourceInfo)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeHms, includeMinidump, includeProfile, includeSidecar, includeWorkload, includeKubernetesResourceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaCreateDiagnosticDataDownloadOptions {\n");
    sb.append("    includeHms: ").append(toIndentedString(includeHms)).append("\n");
    sb.append("    includeMinidump: ").append(toIndentedString(includeMinidump)).append("\n");
    sb.append("    includeProfile: ").append(toIndentedString(includeProfile)).append("\n");
    sb.append("    includeSidecar: ").append(toIndentedString(includeSidecar)).append("\n");
    sb.append("    includeWorkload: ").append(toIndentedString(includeWorkload)).append("\n");
    sb.append("    includeKubernetesResourceInfo: ").append(toIndentedString(includeKubernetesResourceInfo)).append("\n");
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

