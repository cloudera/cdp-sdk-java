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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:24.581-08:00")
public class HiveCreateDiagnosticDataDownloadOptions  {

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeHms = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeErrordump = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeGclogs = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeHeapdump = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeLogs = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeComputeResourceInfo = false;

  /**
   * DEPRECATED: Included by default, no need to specify
   **/
  private Boolean includeKubernetesResourceInfo = false;

  /**
   * Getter for includeHms.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeHms")
  public Boolean getIncludeHms() {
    return includeHms;
  }

  /**
   * Setter for includeHms.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeHms(Boolean includeHms) {
    this.includeHms = includeHms;
  }

  /**
   * Getter for includeErrordump.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeErrordump")
  public Boolean getIncludeErrordump() {
    return includeErrordump;
  }

  /**
   * Setter for includeErrordump.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeErrordump(Boolean includeErrordump) {
    this.includeErrordump = includeErrordump;
  }

  /**
   * Getter for includeGclogs.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeGclogs")
  public Boolean getIncludeGclogs() {
    return includeGclogs;
  }

  /**
   * Setter for includeGclogs.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeGclogs(Boolean includeGclogs) {
    this.includeGclogs = includeGclogs;
  }

  /**
   * Getter for includeHeapdump.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeHeapdump")
  public Boolean getIncludeHeapdump() {
    return includeHeapdump;
  }

  /**
   * Setter for includeHeapdump.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeHeapdump(Boolean includeHeapdump) {
    this.includeHeapdump = includeHeapdump;
  }

  /**
   * Getter for includeLogs.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeLogs")
  public Boolean getIncludeLogs() {
    return includeLogs;
  }

  /**
   * Setter for includeLogs.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeLogs(Boolean includeLogs) {
    this.includeLogs = includeLogs;
  }

  /**
   * Getter for includeComputeResourceInfo.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeComputeResourceInfo")
  public Boolean getIncludeComputeResourceInfo() {
    return includeComputeResourceInfo;
  }

  /**
   * Setter for includeComputeResourceInfo.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  public void setIncludeComputeResourceInfo(Boolean includeComputeResourceInfo) {
    this.includeComputeResourceInfo = includeComputeResourceInfo;
  }

  /**
   * Getter for includeKubernetesResourceInfo.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
  @JsonProperty("includeKubernetesResourceInfo")
  public Boolean getIncludeKubernetesResourceInfo() {
    return includeKubernetesResourceInfo;
  }

  /**
   * Setter for includeKubernetesResourceInfo.
   * DEPRECATED: Included by default, no need to specify
   **/
  @Deprecated
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
    HiveCreateDiagnosticDataDownloadOptions hiveCreateDiagnosticDataDownloadOptions = (HiveCreateDiagnosticDataDownloadOptions) o;
    if (!Objects.equals(this.includeHms, hiveCreateDiagnosticDataDownloadOptions.includeHms)) {
      return false;
    }
    if (!Objects.equals(this.includeErrordump, hiveCreateDiagnosticDataDownloadOptions.includeErrordump)) {
      return false;
    }
    if (!Objects.equals(this.includeGclogs, hiveCreateDiagnosticDataDownloadOptions.includeGclogs)) {
      return false;
    }
    if (!Objects.equals(this.includeHeapdump, hiveCreateDiagnosticDataDownloadOptions.includeHeapdump)) {
      return false;
    }
    if (!Objects.equals(this.includeLogs, hiveCreateDiagnosticDataDownloadOptions.includeLogs)) {
      return false;
    }
    if (!Objects.equals(this.includeComputeResourceInfo, hiveCreateDiagnosticDataDownloadOptions.includeComputeResourceInfo)) {
      return false;
    }
    if (!Objects.equals(this.includeKubernetesResourceInfo, hiveCreateDiagnosticDataDownloadOptions.includeKubernetesResourceInfo)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeHms, includeErrordump, includeGclogs, includeHeapdump, includeLogs, includeComputeResourceInfo, includeKubernetesResourceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HiveCreateDiagnosticDataDownloadOptions {\n");
    sb.append("    includeHms: ").append(toIndentedString(includeHms)).append("\n");
    sb.append("    includeErrordump: ").append(toIndentedString(includeErrordump)).append("\n");
    sb.append("    includeGclogs: ").append(toIndentedString(includeGclogs)).append("\n");
    sb.append("    includeHeapdump: ").append(toIndentedString(includeHeapdump)).append("\n");
    sb.append("    includeLogs: ").append(toIndentedString(includeLogs)).append("\n");
    sb.append("    includeComputeResourceInfo: ").append(toIndentedString(includeComputeResourceInfo)).append("\n");
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

