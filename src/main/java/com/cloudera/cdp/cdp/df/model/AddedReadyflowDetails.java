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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.df.model.ArtifactVersion;
import com.cloudera.cdp.df.model.ReadyflowDetails;
import java.util.*;

/**
 * A detailed representation of a ready flow as added by the current account
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-14T10:18:51.590-07:00")
public class AddedReadyflowDetails  {

  /**
   * The added ready flow crn
   **/
  private String addedReadyflowCrn = null;

  /**
   * The ready flow name
   **/
  private ReadyflowDetails readyflow = null;

  /**
   * The ready flow versions
   **/
  private List<ArtifactVersion> versions = new ArrayList<ArtifactVersion>();

  /**
   * Getter for addedReadyflowCrn.
   * The added ready flow crn
   **/
  @JsonProperty("addedReadyflowCrn")
  public String getAddedReadyflowCrn() {
    return addedReadyflowCrn;
  }

  /**
   * Setter for addedReadyflowCrn.
   * The added ready flow crn
   **/
  public void setAddedReadyflowCrn(String addedReadyflowCrn) {
    this.addedReadyflowCrn = addedReadyflowCrn;
  }

  /**
   * Getter for readyflow.
   * The ready flow name
   **/
  @JsonProperty("readyflow")
  public ReadyflowDetails getReadyflow() {
    return readyflow;
  }

  /**
   * Setter for readyflow.
   * The ready flow name
   **/
  public void setReadyflow(ReadyflowDetails readyflow) {
    this.readyflow = readyflow;
  }

  /**
   * Getter for versions.
   * The ready flow versions
   **/
  @JsonProperty("versions")
  public List<ArtifactVersion> getVersions() {
    return versions;
  }

  /**
   * Setter for versions.
   * The ready flow versions
   **/
  public void setVersions(List<ArtifactVersion> versions) {
    this.versions = versions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddedReadyflowDetails addedReadyflowDetails = (AddedReadyflowDetails) o;
    if (!Objects.equals(this.addedReadyflowCrn, addedReadyflowDetails.addedReadyflowCrn)) {
      return false;
    }
    if (!Objects.equals(this.readyflow, addedReadyflowDetails.readyflow)) {
      return false;
    }
    if (!Objects.equals(this.versions, addedReadyflowDetails.versions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedReadyflowCrn, readyflow, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddedReadyflowDetails {\n");
    sb.append("    addedReadyflowCrn: ").append(toIndentedString(addedReadyflowCrn)).append("\n");
    sb.append("    readyflow: ").append(toIndentedString(readyflow)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

