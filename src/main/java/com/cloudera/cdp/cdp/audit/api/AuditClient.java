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

package com.cloudera.cdp.audit.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.audit.model.ArchiveAuditEventsRequest;
import com.cloudera.cdp.audit.model.ArchiveAuditEventsResponse;
import com.cloudera.cdp.audit.model.BatchEventsForArchivingRequest;
import com.cloudera.cdp.audit.model.BatchEventsForArchivingResponse;
import com.cloudera.cdp.audit.model.ConfigureArchivingRequest;
import com.cloudera.cdp.audit.model.ConfigureArchivingResponse;
import com.cloudera.cdp.audit.model.Error;
import com.cloudera.cdp.audit.model.GetArchivingConfigRequest;
import com.cloudera.cdp.audit.model.GetArchivingConfigResponse;
import com.cloudera.cdp.audit.model.GetArchivingStatusRequest;
import com.cloudera.cdp.audit.model.GetArchivingStatusResponse;
import com.cloudera.cdp.audit.model.GetBatchEventsForArchivingStatusRequest;
import com.cloudera.cdp.audit.model.GetBatchEventsForArchivingStatusResponse;
import com.cloudera.cdp.audit.model.ListEventsInArchiveBatchRequest;
import com.cloudera.cdp.audit.model.ListEventsInArchiveBatchResponse;
import com.cloudera.cdp.audit.model.ListEventsRequest;
import com.cloudera.cdp.audit.model.ListEventsResponse;
import com.cloudera.cdp.audit.model.ListOutstandingArchiveBatchesRequest;
import com.cloudera.cdp.audit.model.ListOutstandingArchiveBatchesResponse;
import com.cloudera.cdp.audit.model.ListRecentArchiveRunsRequest;
import com.cloudera.cdp.audit.model.ListRecentArchiveRunsResponse;
import com.cloudera.cdp.audit.model.MarkArchiveBatchesAsSuccessfulRequest;
import com.cloudera.cdp.audit.model.MarkArchiveBatchesAsSuccessfulResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:43.638-07:00")
public class AuditClient extends CdpClient {

  public static final String SERVICE_NAME = "audit";

  public AuditClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public AuditClient(CdpRequestContext<?> context) {
    super(context);
  }

  @Override
  protected String getServiceName() {
    return SERVICE_NAME;
  }

  @Override
  protected String getRequestContentType() {
    return "application/json";
  }

  @Override
  protected String getResponseContentType() {
    return "application/json";
  }

  /**
   * Archive audit events.
   * @param input
   * @return ArchiveAuditEventsResponse
   */
  public ArchiveAuditEventsResponse archiveAuditEvents(ArchiveAuditEventsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling archiveAuditEvents");
    }

    return this.invokeAPI("archiveAuditEvents", "/api/v1/audit/archiveAuditEvents", input, new GenericType<ArchiveAuditEventsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create batches of audit events to be archived.
   * @param input
   * @return BatchEventsForArchivingResponse
   */
  public BatchEventsForArchivingResponse batchEventsForArchiving(BatchEventsForArchivingRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling batchEventsForArchiving");
    }

    return this.invokeAPI("batchEventsForArchiving", "/api/v1/audit/batchEventsForArchiving", input, new GenericType<BatchEventsForArchivingResponse>(){}, NO_EXTENSION);
  }

  /**
   * Configures the audit system for archiving audit events to external cloud storage.
   * @param input
   * @return ConfigureArchivingResponse
   */
  public ConfigureArchivingResponse configureArchiving(ConfigureArchivingRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling configureArchiving");
    }

    return this.invokeAPI("configureArchiving", "/api/v1/audit/configureArchiving", input, new GenericType<ConfigureArchivingResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retrieve the current archiving configuration.
   * @param input
   * @return GetArchivingConfigResponse
   */
  public GetArchivingConfigResponse getArchivingConfig(GetArchivingConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getArchivingConfig");
    }

    return this.invokeAPI("getArchivingConfig", "/api/v1/audit/getArchivingConfig", input, new GenericType<GetArchivingConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retrieve the status for an archive process.
   * @param input
   * @return GetArchivingStatusResponse
   */
  public GetArchivingStatusResponse getArchivingStatus(GetArchivingStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getArchivingStatus");
    }

    return this.invokeAPI("getArchivingStatus", "/api/v1/audit/getArchivingStatus", input, new GenericType<GetArchivingStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the status of creating batches of audit events to be archived.
   * @param input
   * @return GetBatchEventsForArchivingStatusResponse
   */
  public GetBatchEventsForArchivingStatusResponse getBatchEventsForArchivingStatus(GetBatchEventsForArchivingStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getBatchEventsForArchivingStatus");
    }

    return this.invokeAPI("getBatchEventsForArchivingStatus", "/api/v1/audit/getBatchEventsForArchivingStatus", input, new GenericType<GetBatchEventsForArchivingStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * List all audit events recorded in a specified time span, and optionally with a specified request ID and/or event source.
   * @param input
   * @return ListEventsResponse
   */
  public ListEventsResponse listEvents(ListEventsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listEvents");
    }

    return this.invokeAPI("listEvents", "/api/v1/audit/listEvents", input, new GenericType<ListEventsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List events contained in a single archive batch.
   * @param input
   * @return ListEventsInArchiveBatchResponse
   */
  public ListEventsInArchiveBatchResponse listEventsInArchiveBatch(ListEventsInArchiveBatchRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listEventsInArchiveBatch");
    }

    return this.invokeAPI("listEventsInArchiveBatch", "/api/v1/audit/listEventsInArchiveBatch", input, new GenericType<ListEventsInArchiveBatchResponse>(){}, NO_EXTENSION);
  }

  /**
   * List outstanding (unarchived) archive batches.
   * @param input
   * @return ListOutstandingArchiveBatchesResponse
   */
  public ListOutstandingArchiveBatchesResponse listOutstandingArchiveBatches(ListOutstandingArchiveBatchesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listOutstandingArchiveBatches");
    }

    return this.invokeAPI("listOutstandingArchiveBatches", "/api/v1/audit/listOutstandingArchiveBatches", input, new GenericType<ListOutstandingArchiveBatchesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List recent archive runs.
   * @param input
   * @return ListRecentArchiveRunsResponse
   */
  public ListRecentArchiveRunsResponse listRecentArchiveRuns(ListRecentArchiveRunsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listRecentArchiveRuns");
    }

    return this.invokeAPI("listRecentArchiveRuns", "/api/v1/audit/listRecentArchiveRuns", input, new GenericType<ListRecentArchiveRunsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Mark archive batches as successful.
   * @param input
   * @return MarkArchiveBatchesAsSuccessfulResponse
   */
  public MarkArchiveBatchesAsSuccessfulResponse markArchiveBatchesAsSuccessful(MarkArchiveBatchesAsSuccessfulRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling markArchiveBatchesAsSuccessful");
    }

    return this.invokeAPI("markArchiveBatchesAsSuccessful", "/api/v1/audit/markArchiveBatchesAsSuccessful", input, new GenericType<MarkArchiveBatchesAsSuccessfulResponse>(){}, NO_EXTENSION);
  }
}
