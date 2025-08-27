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
 * Error handling behavior.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:32.351-07:00")
public class ErrorHandling  {

  /**
   * Skip checksum checks.
   **/
  private Boolean skipChecksumChecks = null;

  /**
   * Skip checksum checks for copy-listing.
   **/
  private Boolean skipListingChecksumChecks = null;

  /**
   * Abort policy on error.
   **/
  private Boolean abortOnError = null;

  /**
   * Abort policy if there are snapshot diff failures.
   **/
  private Boolean abortOnSnapshotDiffFailures = null;

  /**
   * Getter for skipChecksumChecks.
   * Skip checksum checks.
   **/
  @JsonProperty("skipChecksumChecks")
  public Boolean getSkipChecksumChecks() {
    return skipChecksumChecks;
  }

  /**
   * Setter for skipChecksumChecks.
   * Skip checksum checks.
   **/
  public void setSkipChecksumChecks(Boolean skipChecksumChecks) {
    this.skipChecksumChecks = skipChecksumChecks;
  }

  /**
   * Getter for skipListingChecksumChecks.
   * Skip checksum checks for copy-listing.
   **/
  @JsonProperty("skipListingChecksumChecks")
  public Boolean getSkipListingChecksumChecks() {
    return skipListingChecksumChecks;
  }

  /**
   * Setter for skipListingChecksumChecks.
   * Skip checksum checks for copy-listing.
   **/
  public void setSkipListingChecksumChecks(Boolean skipListingChecksumChecks) {
    this.skipListingChecksumChecks = skipListingChecksumChecks;
  }

  /**
   * Getter for abortOnError.
   * Abort policy on error.
   **/
  @JsonProperty("abortOnError")
  public Boolean getAbortOnError() {
    return abortOnError;
  }

  /**
   * Setter for abortOnError.
   * Abort policy on error.
   **/
  public void setAbortOnError(Boolean abortOnError) {
    this.abortOnError = abortOnError;
  }

  /**
   * Getter for abortOnSnapshotDiffFailures.
   * Abort policy if there are snapshot diff failures.
   **/
  @JsonProperty("abortOnSnapshotDiffFailures")
  public Boolean getAbortOnSnapshotDiffFailures() {
    return abortOnSnapshotDiffFailures;
  }

  /**
   * Setter for abortOnSnapshotDiffFailures.
   * Abort policy if there are snapshot diff failures.
   **/
  public void setAbortOnSnapshotDiffFailures(Boolean abortOnSnapshotDiffFailures) {
    this.abortOnSnapshotDiffFailures = abortOnSnapshotDiffFailures;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorHandling errorHandling = (ErrorHandling) o;
    if (!Objects.equals(this.skipChecksumChecks, errorHandling.skipChecksumChecks)) {
      return false;
    }
    if (!Objects.equals(this.skipListingChecksumChecks, errorHandling.skipListingChecksumChecks)) {
      return false;
    }
    if (!Objects.equals(this.abortOnError, errorHandling.abortOnError)) {
      return false;
    }
    if (!Objects.equals(this.abortOnSnapshotDiffFailures, errorHandling.abortOnSnapshotDiffFailures)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipChecksumChecks, skipListingChecksumChecks, abortOnError, abortOnSnapshotDiffFailures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorHandling {\n");
    sb.append("    skipChecksumChecks: ").append(toIndentedString(skipChecksumChecks)).append("\n");
    sb.append("    skipListingChecksumChecks: ").append(toIndentedString(skipListingChecksumChecks)).append("\n");
    sb.append("    abortOnError: ").append(toIndentedString(abortOnError)).append("\n");
    sb.append("    abortOnSnapshotDiffFailures: ").append(toIndentedString(abortOnSnapshotDiffFailures)).append("\n");
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

