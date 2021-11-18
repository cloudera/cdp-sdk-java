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
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.audit.model.ArchiveAuditEventsRequest;
import com.cloudera.cdp.audit.model.ArchiveAuditEventsResponse;
import com.cloudera.cdp.audit.model.ConfigureArchivingRequest;
import com.cloudera.cdp.audit.model.ConfigureArchivingResponse;
import com.cloudera.cdp.audit.model.Error;
import com.cloudera.cdp.audit.model.GetArchivingConfigRequest;
import com.cloudera.cdp.audit.model.GetArchivingConfigResponse;
import com.cloudera.cdp.audit.model.GetArchivingStatusRequest;
import com.cloudera.cdp.audit.model.GetArchivingStatusResponse;
import com.cloudera.cdp.audit.model.ListEventsRequest;
import com.cloudera.cdp.audit.model.ListEventsResponse;
import com.cloudera.cdp.audit.model.ListRecentArchiveRunsRequest;
import com.cloudera.cdp.audit.model.ListRecentArchiveRunsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-11-17T16:25:36.276-08:00")
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
}
