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

package com.cloudera.cdp.drscp.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.drscp.model.CreateBackupRequest;
import com.cloudera.cdp.drscp.model.CreateBackupResponse;
import com.cloudera.cdp.drscp.model.DeleteBackupRequest;
import com.cloudera.cdp.drscp.model.DeleteBackupResponse;
import com.cloudera.cdp.drscp.model.DescribeBackupRequest;
import com.cloudera.cdp.drscp.model.DescribeBackupResponse;
import com.cloudera.cdp.drscp.model.DescribeRestoreRequest;
import com.cloudera.cdp.drscp.model.DescribeRestoreResponse;
import com.cloudera.cdp.drscp.model.Error;
import com.cloudera.cdp.drscp.model.GetLogsRequest;
import com.cloudera.cdp.drscp.model.GetLogsResponse;
import com.cloudera.cdp.drscp.model.ListBackupEntitiesRequest;
import com.cloudera.cdp.drscp.model.ListBackupEntitiesResponse;
import com.cloudera.cdp.drscp.model.ListBackupsRequest;
import com.cloudera.cdp.drscp.model.ListBackupsResponse;
import com.cloudera.cdp.drscp.model.ListRestoresRequest;
import com.cloudera.cdp.drscp.model.ListRestoresResponse;
import com.cloudera.cdp.drscp.model.RestoreBackupRequest;
import com.cloudera.cdp.drscp.model.RestoreBackupResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-02T09:36:50.043-07:00")
public class DrscpClient extends CdpClient {

  public static final String SERVICE_NAME = "drscp";

  public DrscpClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DrscpClient(CdpRequestContext<?> context) {
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
   * Creates a backup for the control plane.
   * @param input
   * @return CreateBackupResponse
   */
  public CreateBackupResponse createBackup(CreateBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createBackup");
    }

    return this.invokeAPI("createBackup", "/api/v1/drscp/createBackup", input, new GenericType<CreateBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a control plane backup.
   * @param input
   * @return DeleteBackupResponse
   */
  public DeleteBackupResponse deleteBackup(DeleteBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteBackup");
    }

    return this.invokeAPI("deleteBackup", "/api/v1/drscp/deleteBackup", input, new GenericType<DeleteBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes the backup.
   * @param input
   * @return DescribeBackupResponse
   */
  public DescribeBackupResponse describeBackup(DescribeBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeBackup");
    }

    return this.invokeAPI("describeBackup", "/api/v1/drscp/describeBackup", input, new GenericType<DescribeBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restores the backup.
   * @param input
   * @return DescribeRestoreResponse
   */
  public DescribeRestoreResponse describeRestore(DescribeRestoreRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeRestore");
    }

    return this.invokeAPI("describeRestore", "/api/v1/drscp/describeRestore", input, new GenericType<DescribeRestoreResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets job logs.
   * @param input
   * @return GetLogsResponse
   */
  public GetLogsResponse getLogs(GetLogsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getLogs");
    }

    return this.invokeAPI("getLogs", "/api/v1/drscp/getLogs", input, new GenericType<GetLogsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists potential backup entities associated with the control plane.
   * @param input
   * @return ListBackupEntitiesResponse
   */
  public ListBackupEntitiesResponse listBackupEntities(ListBackupEntitiesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listBackupEntities");
    }

    return this.invokeAPI("listBackupEntities", "/api/v1/drscp/listBackupEntities", input, new GenericType<ListBackupEntitiesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists backups
   * @param input
   * @return ListBackupsResponse
   */
  public ListBackupsResponse listBackups(ListBackupsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listBackups");
    }

    return this.invokeAPI("listBackups", "/api/v1/drscp/listBackups", input, new GenericType<ListBackupsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists restores.
   * @param input
   * @return ListRestoresResponse
   */
  public ListRestoresResponse listRestores(ListRestoresRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listRestores");
    }

    return this.invokeAPI("listRestores", "/api/v1/drscp/listRestores", input, new GenericType<ListRestoresResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restores backup.
   * @param input
   * @return RestoreBackupResponse
   */
  public RestoreBackupResponse restoreBackup(RestoreBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restoreBackup");
    }

    return this.invokeAPI("restoreBackup", "/api/v1/drscp/restoreBackup", input, new GenericType<RestoreBackupResponse>(){}, NO_EXTENSION);
  }
}
