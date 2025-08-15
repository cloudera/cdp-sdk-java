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

package com.cloudera.cdp.consumption.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.consumption.model.Error;
import com.cloudera.cdp.consumption.model.ListComputeUsageRecordsRequest;
import com.cloudera.cdp.consumption.model.ListComputeUsageRecordsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:48.539-07:00")
public class ConsumptionClient extends CdpClient {

  public static final String SERVICE_NAME = "consumption";

  public ConsumptionClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public ConsumptionClient(CdpRequestContext<?> context) {
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
   * Lists compute usage records.
   * @param input
   * @return ListComputeUsageRecordsResponse
   */
  public ListComputeUsageRecordsResponse listComputeUsageRecords(ListComputeUsageRecordsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listComputeUsageRecords");
    }

    return this.invokeAPI("listComputeUsageRecords", "/api/v1/consumption/listComputeUsageRecords", input, new GenericType<ListComputeUsageRecordsResponse>(){}, NO_EXTENSION);
  }
}
