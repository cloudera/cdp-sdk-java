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
import com.cloudera.cdp.dfworkload.model.RpcDeploymentArchiveMetadata;
import java.util.*;

/**
 * Response for listing the deployment configuration backup archives.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:12.301-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ListDeploymentArchivesResponse extends CdpResponse {

  /**
   * The deployment configuration exported archives.
   **/
  private List<RpcDeploymentArchiveMetadata> archives = new ArrayList<RpcDeploymentArchiveMetadata>();

  /**
   * Getter for archives.
   * The deployment configuration exported archives.
   **/
  @JsonProperty("archives")
  public List<RpcDeploymentArchiveMetadata> getArchives() {
    return archives;
  }

  /**
   * Setter for archives.
   * The deployment configuration exported archives.
   **/
  public void setArchives(List<RpcDeploymentArchiveMetadata> archives) {
    this.archives = archives;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeploymentArchivesResponse listDeploymentArchivesResponse = (ListDeploymentArchivesResponse) o;
    if (!Objects.equals(this.archives, listDeploymentArchivesResponse.archives)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(archives, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeploymentArchivesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    archives: ").append(toIndentedString(archives)).append("\n");
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

