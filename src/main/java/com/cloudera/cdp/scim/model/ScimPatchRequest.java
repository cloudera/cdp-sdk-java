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

package com.cloudera.cdp.scim.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.scim.model.ScimPatchOperation;
import java.util.*;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-21T12:39:06.812-07:00")
public class ScimPatchRequest  {

  /**
   * 
   **/
  private List<String> schemas = new ArrayList<String>();

  /**
   * 
   **/
  private List<ScimPatchOperation> operations = new ArrayList<ScimPatchOperation>();

  /**
   * Getter for schemas.
   * 
   **/
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }

  /**
   * Setter for schemas.
   * 
   **/
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  /**
   * Getter for operations.
   * 
   **/
  @JsonProperty("Operations")
  public List<ScimPatchOperation> getOperations() {
    return operations;
  }

  /**
   * Setter for operations.
   * 
   **/
  public void setOperations(List<ScimPatchOperation> operations) {
    this.operations = operations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimPatchRequest scimPatchRequest = (ScimPatchRequest) o;
    if (!Objects.equals(this.schemas, scimPatchRequest.schemas)) {
      return false;
    }
    if (!Objects.equals(this.operations, scimPatchRequest.operations)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimPatchRequest {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

