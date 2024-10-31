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
import java.util.*;

/**
 * HBase CRN pairs.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:13.128-07:00")
public class HbaseCrnPairs  {

  /**
   * The list of CRNs which are peers of each other.
   **/
  private List<String> pairedCrns = new ArrayList<String>();

  /**
   * Getter for pairedCrns.
   * The list of CRNs which are peers of each other.
   **/
  @JsonProperty("pairedCrns")
  public List<String> getPairedCrns() {
    return pairedCrns;
  }

  /**
   * Setter for pairedCrns.
   * The list of CRNs which are peers of each other.
   **/
  public void setPairedCrns(List<String> pairedCrns) {
    this.pairedCrns = pairedCrns;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HbaseCrnPairs hbaseCrnPairs = (HbaseCrnPairs) o;
    if (!Objects.equals(this.pairedCrns, hbaseCrnPairs.pairedCrns)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairedCrns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HbaseCrnPairs {\n");
    sb.append("    pairedCrns: ").append(toIndentedString(pairedCrns)).append("\n");
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

