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

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-06-25T14:27:48.608-07:00")
public class ScimPatchOperation  {

  /**
   * 
   **/
  private String op = null;

  /**
   * 
   **/
  private String _path = null;

  /**
   * 
   **/
  private Object value = null;

  /**
   * Getter for op.
   * 
   **/
  @JsonProperty("op")
  public String getOp() {
    return op;
  }

  /**
   * Setter for op.
   * 
   **/
  public void setOp(String op) {
    this.op = op;
  }

  /**
   * Getter for _path.
   * 
   **/
  @JsonProperty("path")
  public String getPath() {
    return _path;
  }

  /**
   * Setter for _path.
   * 
   **/
  public void setPath(String _path) {
    this._path = _path;
  }

  /**
   * Getter for value.
   * 
   **/
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  /**
   * Setter for value.
   * 
   **/
  public void setValue(Object value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimPatchOperation scimPatchOperation = (ScimPatchOperation) o;
    if (!Objects.equals(this.op, scimPatchOperation.op)) {
      return false;
    }
    if (!Objects.equals(this._path, scimPatchOperation._path)) {
      return false;
    }
    if (!Objects.equals(this.value, scimPatchOperation.value)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, _path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimPatchOperation {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

