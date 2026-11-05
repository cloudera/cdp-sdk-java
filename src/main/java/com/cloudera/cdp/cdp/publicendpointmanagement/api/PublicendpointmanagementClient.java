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

package com.cloudera.cdp.publicendpointmanagement.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.publicendpointmanagement.model.CreateDnsEntryRequest;
import com.cloudera.cdp.publicendpointmanagement.model.CreateDnsEntryResponse;
import com.cloudera.cdp.publicendpointmanagement.model.DeleteDnsEntryRequest;
import com.cloudera.cdp.publicendpointmanagement.model.DeleteDnsEntryResponse;
import com.cloudera.cdp.publicendpointmanagement.model.Error;
import com.cloudera.cdp.publicendpointmanagement.model.ListDnsEntriesRequest;
import com.cloudera.cdp.publicendpointmanagement.model.ListDnsEntriesResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-10-27T19:34:58.374Z")
public class PublicendpointmanagementClient extends CdpClient {

  public static final String SERVICE_NAME = "publicendpointmanagement";

  public PublicendpointmanagementClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public PublicendpointmanagementClient(CdpRequestContext<?> context) {
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
   * Create or update a DNS entry.
   * @param input
   * @return CreateDnsEntryResponse
   */
  public CreateDnsEntryResponse createDnsEntry(CreateDnsEntryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createDnsEntry");
    }

    return this.invokeAPI("createDnsEntry", "/api/v1/publicendpointmanagement/createDnsEntry", input, new GenericType<CreateDnsEntryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a DNS entry.
   * @param input
   * @return DeleteDnsEntryResponse
   */
  public DeleteDnsEntryResponse deleteDnsEntry(DeleteDnsEntryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteDnsEntry");
    }

    return this.invokeAPI("deleteDnsEntry", "/api/v1/publicendpointmanagement/deleteDnsEntry", input, new GenericType<DeleteDnsEntryResponse>(){}, NO_EXTENSION);
  }

  /**
   * List all DNS entries.
   * @param input
   * @return ListDnsEntriesResponse
   */
  public ListDnsEntriesResponse listDnsEntries(ListDnsEntriesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDnsEntries");
    }

    return this.invokeAPI("listDnsEntries", "/api/v1/publicendpointmanagement/listDnsEntries", input, new GenericType<ListDnsEntriesResponse>(){}, NO_EXTENSION);
  }
}
