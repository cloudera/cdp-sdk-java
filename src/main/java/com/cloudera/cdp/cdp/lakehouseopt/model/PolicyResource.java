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

/**
 * The policy resources such as policy script and arguments.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class PolicyResource  {

  /**
   * A base64 encoded version of policy arguments json.
   **/
  private String arguments = null;

  /**
   * A base64 encoded jexl script.
   **/
  private String script = null;

  /**
   * Getter for arguments.
   * A base64 encoded version of policy arguments json.
   **/
  @JsonProperty("arguments")
  public String getArguments() {
    return arguments;
  }

  /**
   * Setter for arguments.
   * A base64 encoded version of policy arguments json.
   **/
  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  /**
   * Getter for script.
   * A base64 encoded jexl script.
   **/
  @JsonProperty("script")
  public String getScript() {
    return script;
  }

  /**
   * Setter for script.
   * A base64 encoded jexl script.
   **/
  public void setScript(String script) {
    this.script = script;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyResource policyResource = (PolicyResource) o;
    if (!Objects.equals(this.arguments, policyResource.arguments)) {
      return false;
    }
    if (!Objects.equals(this.script, policyResource.script)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, script);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyResource {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

