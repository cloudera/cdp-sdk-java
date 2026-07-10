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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for setting the default Java version on the Data Lake cluster.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:50.953Z")
public class SetDefaultJavaVersionRequest  {

  /**
   * The CRN of the Data Lake cluster.
   **/
  private String crn = null;

  /**
   * The default Java version to be set on the Data Lake cluster.
   **/
  private String javaVersion = null;

  /**
   * If set to true Cloudera Manager will use Rolling Restart to restart services running on the cluster. This operation can take a long time. Default value is false.
   **/
  private Boolean rollingRestart = false;

  /**
   * Getter for crn.
   * The CRN of the Data Lake cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the Data Lake cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for javaVersion.
   * The default Java version to be set on the Data Lake cluster.
   **/
  @JsonProperty("javaVersion")
  public String getJavaVersion() {
    return javaVersion;
  }

  /**
   * Setter for javaVersion.
   * The default Java version to be set on the Data Lake cluster.
   **/
  public void setJavaVersion(String javaVersion) {
    this.javaVersion = javaVersion;
  }

  /**
   * Getter for rollingRestart.
   * If set to true Cloudera Manager will use Rolling Restart to restart services running on the cluster. This operation can take a long time. Default value is false.
   **/
  @JsonProperty("rollingRestart")
  public Boolean getRollingRestart() {
    return rollingRestart;
  }

  /**
   * Setter for rollingRestart.
   * If set to true Cloudera Manager will use Rolling Restart to restart services running on the cluster. This operation can take a long time. Default value is false.
   **/
  public void setRollingRestart(Boolean rollingRestart) {
    this.rollingRestart = rollingRestart;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDefaultJavaVersionRequest setDefaultJavaVersionRequest = (SetDefaultJavaVersionRequest) o;
    if (!Objects.equals(this.crn, setDefaultJavaVersionRequest.crn)) {
      return false;
    }
    if (!Objects.equals(this.javaVersion, setDefaultJavaVersionRequest.javaVersion)) {
      return false;
    }
    if (!Objects.equals(this.rollingRestart, setDefaultJavaVersionRequest.rollingRestart)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, javaVersion, rollingRestart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDefaultJavaVersionRequest {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    javaVersion: ").append(toIndentedString(javaVersion)).append("\n");
    sb.append("    rollingRestart: ").append(toIndentedString(rollingRestart)).append("\n");
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

