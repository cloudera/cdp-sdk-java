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
import com.cloudera.cdp.replicationmanager.model.ApiError;
import com.cloudera.cdp.replicationmanager.model.HbaseCrnPairs;
import java.util.*;

/**
 * Response object for listPairedHbaseClusters.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:28.719-08:00")
public class ListPairedHbaseClustersResponse extends CdpResponse {

  /**
   * The list of CRN pairings.
   **/
  private List<HbaseCrnPairs> pairings = new ArrayList<HbaseCrnPairs>();

  /**
   * Cluster CRNs where the HBase service was missing and pairing status could not be determined.
   **/
  private List<String> crnsMissingHbaseService = new ArrayList<String>();

  /**
   * The list of errors for unreachable clusters.
   **/
  private List<ApiError> unreachableClusters = new ArrayList<ApiError>();

  /**
   * Getter for pairings.
   * The list of CRN pairings.
   **/
  @JsonProperty("pairings")
  public List<HbaseCrnPairs> getPairings() {
    return pairings;
  }

  /**
   * Setter for pairings.
   * The list of CRN pairings.
   **/
  public void setPairings(List<HbaseCrnPairs> pairings) {
    this.pairings = pairings;
  }

  /**
   * Getter for crnsMissingHbaseService.
   * Cluster CRNs where the HBase service was missing and pairing status could not be determined.
   **/
  @JsonProperty("crnsMissingHbaseService")
  public List<String> getCrnsMissingHbaseService() {
    return crnsMissingHbaseService;
  }

  /**
   * Setter for crnsMissingHbaseService.
   * Cluster CRNs where the HBase service was missing and pairing status could not be determined.
   **/
  public void setCrnsMissingHbaseService(List<String> crnsMissingHbaseService) {
    this.crnsMissingHbaseService = crnsMissingHbaseService;
  }

  /**
   * Getter for unreachableClusters.
   * The list of errors for unreachable clusters.
   **/
  @JsonProperty("unreachableClusters")
  public List<ApiError> getUnreachableClusters() {
    return unreachableClusters;
  }

  /**
   * Setter for unreachableClusters.
   * The list of errors for unreachable clusters.
   **/
  public void setUnreachableClusters(List<ApiError> unreachableClusters) {
    this.unreachableClusters = unreachableClusters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPairedHbaseClustersResponse listPairedHbaseClustersResponse = (ListPairedHbaseClustersResponse) o;
    if (!Objects.equals(this.pairings, listPairedHbaseClustersResponse.pairings)) {
      return false;
    }
    if (!Objects.equals(this.crnsMissingHbaseService, listPairedHbaseClustersResponse.crnsMissingHbaseService)) {
      return false;
    }
    if (!Objects.equals(this.unreachableClusters, listPairedHbaseClustersResponse.unreachableClusters)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairings, crnsMissingHbaseService, unreachableClusters, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPairedHbaseClustersResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pairings: ").append(toIndentedString(pairings)).append("\n");
    sb.append("    crnsMissingHbaseService: ").append(toIndentedString(crnsMissingHbaseService)).append("\n");
    sb.append("    unreachableClusters: ").append(toIndentedString(unreachableClusters)).append("\n");
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

