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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.VerificationSteps;

/**
 * Manual steps to perform before HBase policy creation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:45.641-07:00")
public class VerifyHbaseClusterPairResponseBeforePolicySteps  {

  /**
   * Summary of the steps to perform.
   **/
  private String summary = null;

  /**
   * Link to the HBase replication manual steps documentation.
   **/
  private String documentationLink = null;

  /**
   * Steps to perform for the source cluster.
   **/
  private VerificationSteps source = null;

  /**
   * Steps to perform for the destination cluster.
   **/
  private VerificationSteps destination = null;

  /**
   * Getter for summary.
   * Summary of the steps to perform.
   **/
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  /**
   * Setter for summary.
   * Summary of the steps to perform.
   **/
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Getter for documentationLink.
   * Link to the HBase replication manual steps documentation.
   **/
  @JsonProperty("documentationLink")
  public String getDocumentationLink() {
    return documentationLink;
  }

  /**
   * Setter for documentationLink.
   * Link to the HBase replication manual steps documentation.
   **/
  public void setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
  }

  /**
   * Getter for source.
   * Steps to perform for the source cluster.
   **/
  @JsonProperty("source")
  public VerificationSteps getSource() {
    return source;
  }

  /**
   * Setter for source.
   * Steps to perform for the source cluster.
   **/
  public void setSource(VerificationSteps source) {
    this.source = source;
  }

  /**
   * Getter for destination.
   * Steps to perform for the destination cluster.
   **/
  @JsonProperty("destination")
  public VerificationSteps getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * Steps to perform for the destination cluster.
   **/
  public void setDestination(VerificationSteps destination) {
    this.destination = destination;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyHbaseClusterPairResponseBeforePolicySteps verifyHbaseClusterPairResponseBeforePolicySteps = (VerifyHbaseClusterPairResponseBeforePolicySteps) o;
    if (!Objects.equals(this.summary, verifyHbaseClusterPairResponseBeforePolicySteps.summary)) {
      return false;
    }
    if (!Objects.equals(this.documentationLink, verifyHbaseClusterPairResponseBeforePolicySteps.documentationLink)) {
      return false;
    }
    if (!Objects.equals(this.source, verifyHbaseClusterPairResponseBeforePolicySteps.source)) {
      return false;
    }
    if (!Objects.equals(this.destination, verifyHbaseClusterPairResponseBeforePolicySteps.destination)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, documentationLink, source, destination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyHbaseClusterPairResponseBeforePolicySteps {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    documentationLink: ").append(toIndentedString(documentationLink)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

