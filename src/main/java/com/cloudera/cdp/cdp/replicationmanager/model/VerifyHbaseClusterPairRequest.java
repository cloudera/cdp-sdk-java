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

/**
 * Request to verify a cluster pairing for HBase policy creation prerequisites.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:16.446-07:00")
public class VerifyHbaseClusterPairRequest  {

  /**
   * CRN of the source cluster.
   **/
  private String sourceClusterCrn = null;

  /**
   * CRN of the destination cluster.
   **/
  private String destinationClusterCrn = null;

  /**
   * Getter for sourceClusterCrn.
   * CRN of the source cluster.
   **/
  @JsonProperty("sourceClusterCrn")
  public String getSourceClusterCrn() {
    return sourceClusterCrn;
  }

  /**
   * Setter for sourceClusterCrn.
   * CRN of the source cluster.
   **/
  public void setSourceClusterCrn(String sourceClusterCrn) {
    this.sourceClusterCrn = sourceClusterCrn;
  }

  /**
   * Getter for destinationClusterCrn.
   * CRN of the destination cluster.
   **/
  @JsonProperty("destinationClusterCrn")
  public String getDestinationClusterCrn() {
    return destinationClusterCrn;
  }

  /**
   * Setter for destinationClusterCrn.
   * CRN of the destination cluster.
   **/
  public void setDestinationClusterCrn(String destinationClusterCrn) {
    this.destinationClusterCrn = destinationClusterCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyHbaseClusterPairRequest verifyHbaseClusterPairRequest = (VerifyHbaseClusterPairRequest) o;
    if (!Objects.equals(this.sourceClusterCrn, verifyHbaseClusterPairRequest.sourceClusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.destinationClusterCrn, verifyHbaseClusterPairRequest.destinationClusterCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceClusterCrn, destinationClusterCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyHbaseClusterPairRequest {\n");
    sb.append("    sourceClusterCrn: ").append(toIndentedString(sourceClusterCrn)).append("\n");
    sb.append("    destinationClusterCrn: ").append(toIndentedString(destinationClusterCrn)).append("\n");
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

