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
import com.cloudera.cdp.replicationmanager.model.CredentialDetails;
import java.util.*;

/**
 * Cloud Credentials listing.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:48.923-07:00")
public class CredentialCollection  {

  /**
   * Total number cloud credentials.
   **/
  private Long totalResults = null;

  /**
   * Number of cloud credentials in the response.
   **/
  private Long results = null;

  /**
   * Cloud credential details.
   **/
  private List<CredentialDetails> credentials = new ArrayList<CredentialDetails>();

  /**
   * Getter for totalResults.
   * Total number cloud credentials.
   **/
  @JsonProperty("totalResults")
  public Long getTotalResults() {
    return totalResults;
  }

  /**
   * Setter for totalResults.
   * Total number cloud credentials.
   **/
  public void setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
  }

  /**
   * Getter for results.
   * Number of cloud credentials in the response.
   **/
  @JsonProperty("results")
  public Long getResults() {
    return results;
  }

  /**
   * Setter for results.
   * Number of cloud credentials in the response.
   **/
  public void setResults(Long results) {
    this.results = results;
  }

  /**
   * Getter for credentials.
   * Cloud credential details.
   **/
  @JsonProperty("credentials")
  public List<CredentialDetails> getCredentials() {
    return credentials;
  }

  /**
   * Setter for credentials.
   * Cloud credential details.
   **/
  public void setCredentials(List<CredentialDetails> credentials) {
    this.credentials = credentials;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialCollection credentialCollection = (CredentialCollection) o;
    if (!Objects.equals(this.totalResults, credentialCollection.totalResults)) {
      return false;
    }
    if (!Objects.equals(this.results, credentialCollection.results)) {
      return false;
    }
    if (!Objects.equals(this.credentials, credentialCollection.credentials)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResults, results, credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialCollection {\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

