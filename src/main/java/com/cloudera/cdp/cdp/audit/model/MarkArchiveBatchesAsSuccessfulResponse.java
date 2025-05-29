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

package com.cloudera.cdp.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Response from marking archive batches as successful.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:21.350-07:00")
public class MarkArchiveBatchesAsSuccessfulResponse extends CdpResponse {

  /**
   * The archive IDs of the batches marked as successful.
   **/
  private List<String> archiveIds = new ArrayList<String>();

  /**
   * The archive timestamp marked for each batch.
   **/
  private ZonedDateTime archiveTimestamp = null;

  /**
   * Getter for archiveIds.
   * The archive IDs of the batches marked as successful.
   **/
  @JsonProperty("archiveIds")
  public List<String> getArchiveIds() {
    return archiveIds;
  }

  /**
   * Setter for archiveIds.
   * The archive IDs of the batches marked as successful.
   **/
  public void setArchiveIds(List<String> archiveIds) {
    this.archiveIds = archiveIds;
  }

  /**
   * Getter for archiveTimestamp.
   * The archive timestamp marked for each batch.
   **/
  @JsonProperty("archiveTimestamp")
  public ZonedDateTime getArchiveTimestamp() {
    return archiveTimestamp;
  }

  /**
   * Setter for archiveTimestamp.
   * The archive timestamp marked for each batch.
   **/
  public void setArchiveTimestamp(ZonedDateTime archiveTimestamp) {
    this.archiveTimestamp = archiveTimestamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkArchiveBatchesAsSuccessfulResponse markArchiveBatchesAsSuccessfulResponse = (MarkArchiveBatchesAsSuccessfulResponse) o;
    if (!Objects.equals(this.archiveIds, markArchiveBatchesAsSuccessfulResponse.archiveIds)) {
      return false;
    }
    if (!Objects.equals(this.archiveTimestamp, markArchiveBatchesAsSuccessfulResponse.archiveTimestamp)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveIds, archiveTimestamp, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkArchiveBatchesAsSuccessfulResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    archiveIds: ").append(toIndentedString(archiveIds)).append("\n");
    sb.append("    archiveTimestamp: ").append(toIndentedString(archiveTimestamp)).append("\n");
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

