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

/**
 * Information about a batch of audit events that were archived.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:46.583-07:00")
public class ArchiveBatch  {

  /**
   * The account ID for which events were archived.
   **/
  private String accountId = null;

  /**
   * The number of events archived. A negative number indicates that the count is not available.
   **/
  private Long eventCount = null;

  /**
   * The archive ID of the batch.
   **/
  private String archiveId = null;

  /**
   * The archive timestamp of the batch.
   **/
  private Long archiveTimestamp = null;

  /**
   * Getter for accountId.
   * The account ID for which events were archived.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * The account ID for which events were archived.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Getter for eventCount.
   * The number of events archived. A negative number indicates that the count is not available.
   **/
  @JsonProperty("eventCount")
  public Long getEventCount() {
    return eventCount;
  }

  /**
   * Setter for eventCount.
   * The number of events archived. A negative number indicates that the count is not available.
   **/
  public void setEventCount(Long eventCount) {
    this.eventCount = eventCount;
  }

  /**
   * Getter for archiveId.
   * The archive ID of the batch.
   **/
  @JsonProperty("archiveId")
  public String getArchiveId() {
    return archiveId;
  }

  /**
   * Setter for archiveId.
   * The archive ID of the batch.
   **/
  public void setArchiveId(String archiveId) {
    this.archiveId = archiveId;
  }

  /**
   * Getter for archiveTimestamp.
   * The archive timestamp of the batch.
   **/
  @JsonProperty("archiveTimestamp")
  public Long getArchiveTimestamp() {
    return archiveTimestamp;
  }

  /**
   * Setter for archiveTimestamp.
   * The archive timestamp of the batch.
   **/
  public void setArchiveTimestamp(Long archiveTimestamp) {
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
    ArchiveBatch archiveBatch = (ArchiveBatch) o;
    if (!Objects.equals(this.accountId, archiveBatch.accountId)) {
      return false;
    }
    if (!Objects.equals(this.eventCount, archiveBatch.eventCount)) {
      return false;
    }
    if (!Objects.equals(this.archiveId, archiveBatch.archiveId)) {
      return false;
    }
    if (!Objects.equals(this.archiveTimestamp, archiveBatch.archiveTimestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, eventCount, archiveId, archiveTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveBatch {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    archiveId: ").append(toIndentedString(archiveId)).append("\n");
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

