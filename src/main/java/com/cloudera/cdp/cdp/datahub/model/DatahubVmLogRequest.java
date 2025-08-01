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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Log descriptor, contains a path and label pair. Used for diagnostics collections.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:39.671-07:00")
public class DatahubVmLogRequest  {

  /**
   * Path of the log file(s) that needs to be collected. (Can be glob wildcard)
   **/
  private String _path = null;

  /**
   * Label that will be used to identify a log descriptor. (will be used as a folder inside logs folder)
   **/
  private String label = null;

  /**
   * Getter for _path.
   * Path of the log file(s) that needs to be collected. (Can be glob wildcard)
   **/
  @JsonProperty("path")
  public String getPath() {
    return _path;
  }

  /**
   * Setter for _path.
   * Path of the log file(s) that needs to be collected. (Can be glob wildcard)
   **/
  public void setPath(String _path) {
    this._path = _path;
  }

  /**
   * Getter for label.
   * Label that will be used to identify a log descriptor. (will be used as a folder inside logs folder)
   **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   * Setter for label.
   * Label that will be used to identify a log descriptor. (will be used as a folder inside logs folder)
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatahubVmLogRequest datahubVmLogRequest = (DatahubVmLogRequest) o;
    if (!Objects.equals(this._path, datahubVmLogRequest._path)) {
      return false;
    }
    if (!Objects.equals(this.label, datahubVmLogRequest.label)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(_path, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatahubVmLogRequest {\n");
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

