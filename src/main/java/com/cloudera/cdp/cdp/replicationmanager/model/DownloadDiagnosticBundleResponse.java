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
import java.util.Arrays;

/**
 * Response object for download-diagnostic-bundle. On certain clusters this response will show if the download is only available directly from CM.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-30T10:56:36.742-07:00")
public class DownloadDiagnosticBundleResponse extends CdpResponse {

  /**
   * Base64 encoded content of the diagnostic bundle zip file. A script like this can be used to save the response as file 'cat response.json | jq -r '.bundleFile' | base64 -D > bundle.zip'
   **/
  private byte[] bundleFile = null;

  /**
   * Getter for bundleFile.
   * Base64 encoded content of the diagnostic bundle zip file. A script like this can be used to save the response as file &#39;cat response.json | jq -r &#39;.bundleFile&#39; | base64 -D &gt; bundle.zip&#39;
   **/
  @JsonProperty("bundleFile")
  public byte[] getBundleFile() {
    return Arrays.copyOf(bundleFile, bundleFile.length);
  }

  /**
   * Setter for bundleFile.
   * Base64 encoded content of the diagnostic bundle zip file. A script like this can be used to save the response as file &#39;cat response.json | jq -r &#39;.bundleFile&#39; | base64 -D &gt; bundle.zip&#39;
   **/
  public void setBundleFile(byte[] bundleFile) {
    this.bundleFile = Arrays.copyOf(bundleFile, bundleFile.length);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadDiagnosticBundleResponse downloadDiagnosticBundleResponse = (DownloadDiagnosticBundleResponse) o;
    if (!Objects.deepEquals(this.bundleFile, downloadDiagnosticBundleResponse.bundleFile)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(bundleFile), super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadDiagnosticBundleResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bundleFile: ").append(toIndentedString(bundleFile)).append("\n");
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

