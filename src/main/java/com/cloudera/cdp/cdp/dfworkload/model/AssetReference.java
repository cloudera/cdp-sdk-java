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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A reference to an asset used in a flow parameter
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:37.211-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class AssetReference  {

  /**
   * The name of the asset
   **/
  private String name = null;

  /**
   * The path of the asset
   **/
  private String _path = null;

  /**
   * The version of the asset
   **/
  private String version = null;

  /**
   * Whether or not the asset is provided automatically by the environment. If true, the asset cannot removed or replaced.
   **/
  private Boolean environmentProvided = null;

  /**
   * Getter for name.
   * The name of the asset
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the asset
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for _path.
   * The path of the asset
   **/
  @JsonProperty("path")
  public String getPath() {
    return _path;
  }

  /**
   * Setter for _path.
   * The path of the asset
   **/
  public void setPath(String _path) {
    this._path = _path;
  }

  /**
   * Getter for version.
   * The version of the asset
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the asset
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for environmentProvided.
   * Whether or not the asset is provided automatically by the environment. If true, the asset cannot removed or replaced.
   **/
  @JsonProperty("environmentProvided")
  public Boolean getEnvironmentProvided() {
    return environmentProvided;
  }

  /**
   * Setter for environmentProvided.
   * Whether or not the asset is provided automatically by the environment. If true, the asset cannot removed or replaced.
   **/
  public void setEnvironmentProvided(Boolean environmentProvided) {
    this.environmentProvided = environmentProvided;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReference assetReference = (AssetReference) o;
    if (!Objects.equals(this.name, assetReference.name)) {
      return false;
    }
    if (!Objects.equals(this._path, assetReference._path)) {
      return false;
    }
    if (!Objects.equals(this.version, assetReference.version)) {
      return false;
    }
    if (!Objects.equals(this.environmentProvided, assetReference.environmentProvided)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, _path, version, environmentProvided);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReference {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    environmentProvided: ").append(toIndentedString(environmentProvided)).append("\n");
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

