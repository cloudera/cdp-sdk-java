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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Azure Volume Encryption response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:30.235-07:00")
public class AzureVolumeEncryptionResp  {

  /**
   * Disk encryption set ID.
   **/
  private String diskEncryptionSetId = null;

  /**
   * Getter for diskEncryptionSetId.
   * Disk encryption set ID.
   **/
  @JsonProperty("diskEncryptionSetId")
  public String getDiskEncryptionSetId() {
    return diskEncryptionSetId;
  }

  /**
   * Setter for diskEncryptionSetId.
   * Disk encryption set ID.
   **/
  public void setDiskEncryptionSetId(String diskEncryptionSetId) {
    this.diskEncryptionSetId = diskEncryptionSetId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureVolumeEncryptionResp azureVolumeEncryptionResp = (AzureVolumeEncryptionResp) o;
    if (!Objects.equals(this.diskEncryptionSetId, azureVolumeEncryptionResp.diskEncryptionSetId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskEncryptionSetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureVolumeEncryptionResp {\n");
    sb.append("    diskEncryptionSetId: ").append(toIndentedString(diskEncryptionSetId)).append("\n");
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

