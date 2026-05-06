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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.Arrays;

/**
 * Response object containing the policy script and arguments.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-01T09:59:31.533-07:00")
public class DownloadPolicyResponse extends CdpResponse {

  /**
   * The policy script.
   **/
  private byte[] script = null;

  /**
   * The policy arguments.
   **/
  private byte[] arguments = null;

  /**
   * Getter for script.
   * The policy script.
   **/
  @JsonProperty("script")
  public byte[] getScript() {
    return Arrays.copyOf(script, script.length);
  }

  /**
   * Setter for script.
   * The policy script.
   **/
  public void setScript(byte[] script) {
    this.script = Arrays.copyOf(script, script.length);
  }

  /**
   * Getter for arguments.
   * The policy arguments.
   **/
  @JsonProperty("arguments")
  public byte[] getArguments() {
    return Arrays.copyOf(arguments, arguments.length);
  }

  /**
   * Setter for arguments.
   * The policy arguments.
   **/
  public void setArguments(byte[] arguments) {
    this.arguments = Arrays.copyOf(arguments, arguments.length);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadPolicyResponse downloadPolicyResponse = (DownloadPolicyResponse) o;
    if (!Objects.deepEquals(this.script, downloadPolicyResponse.script)) {
      return false;
    }
    if (!Objects.deepEquals(this.arguments, downloadPolicyResponse.arguments)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(script), Arrays.hashCode(arguments), super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadPolicyResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

