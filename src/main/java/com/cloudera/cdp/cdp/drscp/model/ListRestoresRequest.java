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

package com.cloudera.cdp.drscp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for the list restores request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-03-09T11:03:08.049-08:00")
public class ListRestoresRequest  {

  /**
   * The job states to filter by.
   **/
  private List<String> jobStates = new ArrayList<String>();;

  /**
   * CRN of the backup.
   **/
  private String backupCrn = null;

  /**
   * Getter for jobStates.
   * The job states to filter by.
   **/
  @JsonProperty("jobStates")
  public List<String> getJobStates() {
    return jobStates;
  }

  /**
   * Setter for jobStates.
   * The job states to filter by.
   **/
  public void setJobStates(List<String> jobStates) {
    this.jobStates = jobStates;
  }

  /**
   * Getter for backupCrn.
   * CRN of the backup.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * CRN of the backup.
   **/
  public void setBackupCrn(String backupCrn) {
    this.backupCrn = backupCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRestoresRequest listRestoresRequest = (ListRestoresRequest) o;
    if (!Objects.equals(this.jobStates, listRestoresRequest.jobStates)) {
      return false;
    }
    if (!Objects.equals(this.backupCrn, listRestoresRequest.backupCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobStates, backupCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRestoresRequest {\n");
    sb.append("    jobStates: ").append(toIndentedString(jobStates)).append("\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
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

