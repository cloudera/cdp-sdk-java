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

package com.cloudera.cdp.dw.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.dw.model.AddUserRequest;
import com.cloudera.cdp.dw.model.AddUserResponse;
import com.cloudera.cdp.dw.model.BackupClusterRequest;
import com.cloudera.cdp.dw.model.BackupClusterResponse;
import com.cloudera.cdp.dw.model.CreateAwsClusterRequest;
import com.cloudera.cdp.dw.model.CreateAwsClusterResponse;
import com.cloudera.cdp.dw.model.CreateAzureClusterRequest;
import com.cloudera.cdp.dw.model.CreateAzureClusterResponse;
import com.cloudera.cdp.dw.model.CreateBackupRequest;
import com.cloudera.cdp.dw.model.CreateBackupResponse;
import com.cloudera.cdp.dw.model.CreateClusterDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.CreateClusterDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.CreateClusterRequest;
import com.cloudera.cdp.dw.model.CreateClusterResponse;
import com.cloudera.cdp.dw.model.CreateDataVisualizationRequest;
import com.cloudera.cdp.dw.model.CreateDataVisualizationResponse;
import com.cloudera.cdp.dw.model.CreateDbcDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.CreateDbcDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.CreateDbcRequest;
import com.cloudera.cdp.dw.model.CreateDbcResponse;
import com.cloudera.cdp.dw.model.CreatePrivateClusterRequest;
import com.cloudera.cdp.dw.model.CreatePrivateClusterResponse;
import com.cloudera.cdp.dw.model.CreateResourceTemplateRequest;
import com.cloudera.cdp.dw.model.CreateResourceTemplateResponse;
import com.cloudera.cdp.dw.model.CreateVwDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.CreateVwDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.CreateVwRequest;
import com.cloudera.cdp.dw.model.CreateVwResponse;
import com.cloudera.cdp.dw.model.DeleteBackupRequest;
import com.cloudera.cdp.dw.model.DeleteBackupResponse;
import com.cloudera.cdp.dw.model.DeleteClusterDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.DeleteClusterDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.DeleteClusterRequest;
import com.cloudera.cdp.dw.model.DeleteClusterResponse;
import com.cloudera.cdp.dw.model.DeleteDataVisualizationRequest;
import com.cloudera.cdp.dw.model.DeleteDataVisualizationResponse;
import com.cloudera.cdp.dw.model.DeleteDbcDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.DeleteDbcDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.DeleteDbcRequest;
import com.cloudera.cdp.dw.model.DeleteDbcResponse;
import com.cloudera.cdp.dw.model.DeleteResourceTemplateRequest;
import com.cloudera.cdp.dw.model.DeleteResourceTemplateResponse;
import com.cloudera.cdp.dw.model.DeleteUserRequest;
import com.cloudera.cdp.dw.model.DeleteUserResponse;
import com.cloudera.cdp.dw.model.DeleteVwDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.DeleteVwDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.DeleteVwRequest;
import com.cloudera.cdp.dw.model.DeleteVwResponse;
import com.cloudera.cdp.dw.model.DescribeAllowedInstanceTypesRequest;
import com.cloudera.cdp.dw.model.DescribeAllowedInstanceTypesResponse;
import com.cloudera.cdp.dw.model.DescribeBackupRequest;
import com.cloudera.cdp.dw.model.DescribeBackupResponse;
import com.cloudera.cdp.dw.model.DescribeClusterDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.DescribeClusterDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.DescribeClusterRequest;
import com.cloudera.cdp.dw.model.DescribeClusterResponse;
import com.cloudera.cdp.dw.model.DescribeConfigDiffRequest;
import com.cloudera.cdp.dw.model.DescribeConfigDiffResponse;
import com.cloudera.cdp.dw.model.DescribeConfigRequest;
import com.cloudera.cdp.dw.model.DescribeConfigResponse;
import com.cloudera.cdp.dw.model.DescribeDataVisualizationRequest;
import com.cloudera.cdp.dw.model.DescribeDataVisualizationResponse;
import com.cloudera.cdp.dw.model.DescribeDbcConfigRequest;
import com.cloudera.cdp.dw.model.DescribeDbcConfigResponse;
import com.cloudera.cdp.dw.model.DescribeDbcDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.DescribeDbcDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.DescribeDbcRequest;
import com.cloudera.cdp.dw.model.DescribeDbcResponse;
import com.cloudera.cdp.dw.model.DescribeKubeconfigRequest;
import com.cloudera.cdp.dw.model.DescribeKubeconfigResponse;
import com.cloudera.cdp.dw.model.DescribeRestoreRequest;
import com.cloudera.cdp.dw.model.DescribeRestoreResponse;
import com.cloudera.cdp.dw.model.DescribeServerSettingRequest;
import com.cloudera.cdp.dw.model.DescribeServerSettingResponse;
import com.cloudera.cdp.dw.model.DescribeVwConfigRequest;
import com.cloudera.cdp.dw.model.DescribeVwConfigResponse;
import com.cloudera.cdp.dw.model.DescribeVwDiagnosticDataJobRequest;
import com.cloudera.cdp.dw.model.DescribeVwDiagnosticDataJobResponse;
import com.cloudera.cdp.dw.model.DescribeVwRequest;
import com.cloudera.cdp.dw.model.DescribeVwResponse;
import com.cloudera.cdp.dw.model.Error;
import com.cloudera.cdp.dw.model.GetDataVisualizationUpgradeVersionRequest;
import com.cloudera.cdp.dw.model.GetDataVisualizationUpgradeVersionResponse;
import com.cloudera.cdp.dw.model.GetLogsRequest;
import com.cloudera.cdp.dw.model.GetLogsResponse;
import com.cloudera.cdp.dw.model.GetUpgradeDbcVersionsRequest;
import com.cloudera.cdp.dw.model.GetUpgradeDbcVersionsResponse;
import com.cloudera.cdp.dw.model.GetUpgradeVwVersionsRequest;
import com.cloudera.cdp.dw.model.GetUpgradeVwVersionsResponse;
import com.cloudera.cdp.dw.model.HealthCheckRequest;
import com.cloudera.cdp.dw.model.HealthCheckResponse;
import com.cloudera.cdp.dw.model.ListBackupEntitiesRequest;
import com.cloudera.cdp.dw.model.ListBackupEntitiesResponse;
import com.cloudera.cdp.dw.model.ListBackupsRequest;
import com.cloudera.cdp.dw.model.ListBackupsResponse;
import com.cloudera.cdp.dw.model.ListClusterDiagnosticDataJobsRequest;
import com.cloudera.cdp.dw.model.ListClusterDiagnosticDataJobsResponse;
import com.cloudera.cdp.dw.model.ListClustersRequest;
import com.cloudera.cdp.dw.model.ListClustersResponse;
import com.cloudera.cdp.dw.model.ListDataVisualizationsRequest;
import com.cloudera.cdp.dw.model.ListDataVisualizationsResponse;
import com.cloudera.cdp.dw.model.ListDbcConfigsRequest;
import com.cloudera.cdp.dw.model.ListDbcConfigsResponse;
import com.cloudera.cdp.dw.model.ListDbcDiagnosticDataJobsRequest;
import com.cloudera.cdp.dw.model.ListDbcDiagnosticDataJobsResponse;
import com.cloudera.cdp.dw.model.ListDbcEventsRequest;
import com.cloudera.cdp.dw.model.ListDbcEventsResponse;
import com.cloudera.cdp.dw.model.ListDbcsRequest;
import com.cloudera.cdp.dw.model.ListDbcsResponse;
import com.cloudera.cdp.dw.model.ListEventsRequest;
import com.cloudera.cdp.dw.model.ListEventsResponse;
import com.cloudera.cdp.dw.model.ListLatestVersionsRequest;
import com.cloudera.cdp.dw.model.ListLatestVersionsResponse;
import com.cloudera.cdp.dw.model.ListResourceTemplatesRequest;
import com.cloudera.cdp.dw.model.ListResourceTemplatesResponse;
import com.cloudera.cdp.dw.model.ListRestoresRequest;
import com.cloudera.cdp.dw.model.ListRestoresResponse;
import com.cloudera.cdp.dw.model.ListUsersRequest;
import com.cloudera.cdp.dw.model.ListUsersResponse;
import com.cloudera.cdp.dw.model.ListVwConfigsRequest;
import com.cloudera.cdp.dw.model.ListVwConfigsResponse;
import com.cloudera.cdp.dw.model.ListVwDiagnosticDataJobsRequest;
import com.cloudera.cdp.dw.model.ListVwDiagnosticDataJobsResponse;
import com.cloudera.cdp.dw.model.ListVwEventsRequest;
import com.cloudera.cdp.dw.model.ListVwEventsResponse;
import com.cloudera.cdp.dw.model.ListVwsRequest;
import com.cloudera.cdp.dw.model.ListVwsResponse;
import com.cloudera.cdp.dw.model.RebuildDbcRequest;
import com.cloudera.cdp.dw.model.RebuildDbcResponse;
import com.cloudera.cdp.dw.model.RebuildVwRequest;
import com.cloudera.cdp.dw.model.RebuildVwResponse;
import com.cloudera.cdp.dw.model.RenewCertificatesRequest;
import com.cloudera.cdp.dw.model.RenewCertificatesResponse;
import com.cloudera.cdp.dw.model.ResetServerSettingsRequest;
import com.cloudera.cdp.dw.model.ResetServerSettingsResponse;
import com.cloudera.cdp.dw.model.RestartDbcRequest;
import com.cloudera.cdp.dw.model.RestartDbcResponse;
import com.cloudera.cdp.dw.model.RestartVwRequest;
import com.cloudera.cdp.dw.model.RestartVwResponse;
import com.cloudera.cdp.dw.model.RestoreBackupRequest;
import com.cloudera.cdp.dw.model.RestoreBackupResponse;
import com.cloudera.cdp.dw.model.RestoreClusterRequest;
import com.cloudera.cdp.dw.model.RestoreClusterResponse;
import com.cloudera.cdp.dw.model.StartDbcRequest;
import com.cloudera.cdp.dw.model.StartDbcResponse;
import com.cloudera.cdp.dw.model.StartVwRequest;
import com.cloudera.cdp.dw.model.StartVwResponse;
import com.cloudera.cdp.dw.model.SuspendDbcRequest;
import com.cloudera.cdp.dw.model.SuspendDbcResponse;
import com.cloudera.cdp.dw.model.SuspendVwRequest;
import com.cloudera.cdp.dw.model.SuspendVwResponse;
import com.cloudera.cdp.dw.model.UpdateClusterRequest;
import com.cloudera.cdp.dw.model.UpdateClusterResponse;
import com.cloudera.cdp.dw.model.UpdateDataVisualizationRequest;
import com.cloudera.cdp.dw.model.UpdateDataVisualizationResponse;
import com.cloudera.cdp.dw.model.UpdateDbcConfigRequest;
import com.cloudera.cdp.dw.model.UpdateDbcConfigResponse;
import com.cloudera.cdp.dw.model.UpdateDbcRequest;
import com.cloudera.cdp.dw.model.UpdateDbcResponse;
import com.cloudera.cdp.dw.model.UpdateResourceTemplateRequest;
import com.cloudera.cdp.dw.model.UpdateResourceTemplateResponse;
import com.cloudera.cdp.dw.model.UpdateServerSettingRequest;
import com.cloudera.cdp.dw.model.UpdateServerSettingResponse;
import com.cloudera.cdp.dw.model.UpdateSshKeyRequest;
import com.cloudera.cdp.dw.model.UpdateSshKeyResponse;
import com.cloudera.cdp.dw.model.UpdateVwConfigRequest;
import com.cloudera.cdp.dw.model.UpdateVwConfigResponse;
import com.cloudera.cdp.dw.model.UpdateVwRequest;
import com.cloudera.cdp.dw.model.UpdateVwResponse;
import com.cloudera.cdp.dw.model.UpgradeDataVisualizationRequest;
import com.cloudera.cdp.dw.model.UpgradeDataVisualizationResponse;
import com.cloudera.cdp.dw.model.UpgradeDbcRequest;
import com.cloudera.cdp.dw.model.UpgradeDbcResponse;
import com.cloudera.cdp.dw.model.UpgradeVwRequest;
import com.cloudera.cdp.dw.model.UpgradeVwResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class DwClient extends CdpClient {

  public static final String SERVICE_NAME = "dw";

  public DwClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DwClient(CdpRequestContext<?> context) {
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
   * Adds the given user to the cluster.
   * @param input
   * @return AddUserResponse
   */
  public AddUserResponse addUser(AddUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addUser");
    }

    return this.invokeAPI("addUser", "/api/v1/dw/addUser", input, new GenericType<AddUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a backup from the cluster configuration and settings.
   * @param input
   * @return BackupClusterResponse
   */
  public BackupClusterResponse backupCluster(BackupClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling backupCluster");
    }

    return this.invokeAPI("backupCluster", "/api/v1/dw/backupCluster", input, new GenericType<BackupClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create an AWS cluster in the Cloudera Data Warehouse.
   * @param input
   * @return CreateAwsClusterResponse
   */
  public CreateAwsClusterResponse createAwsCluster(CreateAwsClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAwsCluster");
    }

    return this.invokeAPI("createAwsCluster", "/api/v1/dw/createAwsCluster", input, new GenericType<CreateAwsClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create an Azure cluster in the Cloudera Data Warehouse.
   * @param input
   * @return CreateAzureClusterResponse
   */
  public CreateAzureClusterResponse createAzureCluster(CreateAzureClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAzureCluster");
    }

    return this.invokeAPI("createAzureCluster", "/api/v1/dw/createAzureCluster", input, new GenericType<CreateAzureClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a backup for the data warehouse.
   * @param input
   * @return CreateBackupResponse
   */
  public CreateBackupResponse createBackup(CreateBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createBackup");
    }

    return this.invokeAPI("createBackup", "/api/v1/dw/createBackup", input, new GenericType<CreateBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Cloudera Data Warehouse cluster.
   * @param input
   * @return CreateClusterResponse
   */
  public CreateClusterResponse createCluster(CreateClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createCluster");
    }

    return this.invokeAPI("createCluster", "/api/v1/dw/createCluster", input, new GenericType<CreateClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a diagnostic job for the given cluster.
   * @param input
   * @return CreateClusterDiagnosticDataJobResponse
   */
  public CreateClusterDiagnosticDataJobResponse createClusterDiagnosticDataJob(CreateClusterDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createClusterDiagnosticDataJob");
    }

    return this.invokeAPI("createClusterDiagnosticDataJob", "/api/v1/dw/createClusterDiagnosticDataJob", input, new GenericType<CreateClusterDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a Cloudera Data Visualization.
   * @param input
   * @return CreateDataVisualizationResponse
   */
  public CreateDataVisualizationResponse createDataVisualization(CreateDataVisualizationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createDataVisualization");
    }

    return this.invokeAPI("createDataVisualization", "/api/v1/dw/createDataVisualization", input, new GenericType<CreateDataVisualizationResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Database Catalog.
   * @param input
   * @return CreateDbcResponse
   */
  @Deprecated
  public CreateDbcResponse createDbc(CreateDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createDbc");
    }

    return this.invokeAPI("createDbc", "/api/v1/dw/createDbc", input, new GenericType<CreateDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a diagnostic job for the given database catalog.
   * @param input
   * @return CreateDbcDiagnosticDataJobResponse
   */
  public CreateDbcDiagnosticDataJobResponse createDbcDiagnosticDataJob(CreateDbcDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createDbcDiagnosticDataJob");
    }

    return this.invokeAPI("createDbcDiagnosticDataJob", "/api/v1/dw/createDbcDiagnosticDataJob", input, new GenericType<CreateDbcDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a  a Private Cloud cluster in the Cloudera Data Warehouse.
   * @param input
   * @return CreatePrivateClusterResponse
   */
  public CreatePrivateClusterResponse createPrivateCluster(CreatePrivateClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createPrivateCluster");
    }

    return this.invokeAPI("createPrivateCluster", "/api/v1/dw/createPrivateCluster", input, new GenericType<CreatePrivateClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a resource allocation template.
   * @param input
   * @return CreateResourceTemplateResponse
   */
  public CreateResourceTemplateResponse createResourceTemplate(CreateResourceTemplateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createResourceTemplate");
    }

    return this.invokeAPI("createResourceTemplate", "/api/v1/dw/createResourceTemplate", input, new GenericType<CreateResourceTemplateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Virtual Warehouse.
   * @param input
   * @return CreateVwResponse
   */
  public CreateVwResponse createVw(CreateVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createVw");
    }

    return this.invokeAPI("createVw", "/api/v1/dw/createVw", input, new GenericType<CreateVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a diagnostic job for the given Virtual Warehouse.
   * @param input
   * @return CreateVwDiagnosticDataJobResponse
   */
  public CreateVwDiagnosticDataJobResponse createVwDiagnosticDataJob(CreateVwDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createVwDiagnosticDataJob");
    }

    return this.invokeAPI("createVwDiagnosticDataJob", "/api/v1/dw/createVwDiagnosticDataJob", input, new GenericType<CreateVwDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a data warehouse backup.
   * @param input
   * @return DeleteBackupResponse
   */
  public DeleteBackupResponse deleteBackup(DeleteBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteBackup");
    }

    return this.invokeAPI("deleteBackup", "/api/v1/dw/deleteBackup", input, new GenericType<DeleteBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a Cloudera Data Warehouse cluster.
   * @param input
   * @return DeleteClusterResponse
   */
  public DeleteClusterResponse deleteCluster(DeleteClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteCluster");
    }

    return this.invokeAPI("deleteCluster", "/api/v1/dw/deleteCluster", input, new GenericType<DeleteClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a diagnostic job for the given cluster.
   * @param input
   * @return DeleteClusterDiagnosticDataJobResponse
   */
  public DeleteClusterDiagnosticDataJobResponse deleteClusterDiagnosticDataJob(DeleteClusterDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteClusterDiagnosticDataJob");
    }

    return this.invokeAPI("deleteClusterDiagnosticDataJob", "/api/v1/dw/deleteClusterDiagnosticDataJob", input, new GenericType<DeleteClusterDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Asynchronous operation that deletes a Cloudera Data Visualization. When the DV is in deleting state, we can still use describe-data-visualization to check the status. Once it is deleted, the describe-data-visualization would return a not found error.
   * @param input
   * @return DeleteDataVisualizationResponse
   */
  public DeleteDataVisualizationResponse deleteDataVisualization(DeleteDataVisualizationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteDataVisualization");
    }

    return this.invokeAPI("deleteDataVisualization", "/api/v1/dw/deleteDataVisualization", input, new GenericType<DeleteDataVisualizationResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a Database Catalog.
   * @param input
   * @return DeleteDbcResponse
   */
  public DeleteDbcResponse deleteDbc(DeleteDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteDbc");
    }

    return this.invokeAPI("deleteDbc", "/api/v1/dw/deleteDbc", input, new GenericType<DeleteDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a diagnostic job for the given Database Catalog.
   * @param input
   * @return DeleteDbcDiagnosticDataJobResponse
   */
  public DeleteDbcDiagnosticDataJobResponse deleteDbcDiagnosticDataJob(DeleteDbcDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteDbcDiagnosticDataJob");
    }

    return this.invokeAPI("deleteDbcDiagnosticDataJob", "/api/v1/dw/deleteDbcDiagnosticDataJob", input, new GenericType<DeleteDbcDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a resource allocation template.
   * @param input
   * @return DeleteResourceTemplateResponse
   */
  public DeleteResourceTemplateResponse deleteResourceTemplate(DeleteResourceTemplateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteResourceTemplate");
    }

    return this.invokeAPI("deleteResourceTemplate", "/api/v1/dw/deleteResourceTemplate", input, new GenericType<DeleteResourceTemplateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes the given user from the cluster.
   * @param input
   * @return DeleteUserResponse
   */
  public DeleteUserResponse deleteUser(DeleteUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteUser");
    }

    return this.invokeAPI("deleteUser", "/api/v1/dw/deleteUser", input, new GenericType<DeleteUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a Virtual Warehouse.
   * @param input
   * @return DeleteVwResponse
   */
  public DeleteVwResponse deleteVw(DeleteVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteVw");
    }

    return this.invokeAPI("deleteVw", "/api/v1/dw/deleteVw", input, new GenericType<DeleteVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a diagnostic job for the given Virtual Warehouse.
   * @param input
   * @return DeleteVwDiagnosticDataJobResponse
   */
  public DeleteVwDiagnosticDataJobResponse deleteVwDiagnosticDataJob(DeleteVwDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteVwDiagnosticDataJob");
    }

    return this.invokeAPI("deleteVwDiagnosticDataJob", "/api/v1/dw/deleteVwDiagnosticDataJob", input, new GenericType<DeleteVwDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get allowed compute instance types for both AWS and Azure cluster types and their default values.
   * @param input
   * @return DescribeAllowedInstanceTypesResponse
   */
  public DescribeAllowedInstanceTypesResponse describeAllowedInstanceTypes(DescribeAllowedInstanceTypesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeAllowedInstanceTypes");
    }

    return this.invokeAPI("describeAllowedInstanceTypes", "/api/v1/dw/describeAllowedInstanceTypes", input, new GenericType<DescribeAllowedInstanceTypesResponse>(){}, NO_EXTENSION);
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

    return this.invokeAPI("describeBackup", "/api/v1/dw/describeBackup", input, new GenericType<DescribeBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a Cloudera Data Warehouse cluster.
   * @param input
   * @return DescribeClusterResponse
   */
  public DescribeClusterResponse describeCluster(DescribeClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeCluster");
    }

    return this.invokeAPI("describeCluster", "/api/v1/dw/describeCluster", input, new GenericType<DescribeClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes a diagnostic job for the given Cluster.
   * @param input
   * @return DescribeClusterDiagnosticDataJobResponse
   */
  public DescribeClusterDiagnosticDataJobResponse describeClusterDiagnosticDataJob(DescribeClusterDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeClusterDiagnosticDataJob");
    }

    return this.invokeAPI("describeClusterDiagnosticDataJob", "/api/v1/dw/describeClusterDiagnosticDataJob", input, new GenericType<DescribeClusterDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a service configuration.
   * @param input
   * @return DescribeConfigResponse
   */
  public DescribeConfigResponse describeConfig(DescribeConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeConfig");
    }

    return this.invokeAPI("describeConfig", "/api/v1/dw/describeConfig", input, new GenericType<DescribeConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get differences between two service configurations.
   * @param input
   * @return DescribeConfigDiffResponse
   */
  public DescribeConfigDiffResponse describeConfigDiff(DescribeConfigDiffRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeConfigDiff");
    }

    return this.invokeAPI("describeConfigDiff", "/api/v1/dw/describeConfigDiff", input, new GenericType<DescribeConfigDiffResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes a Cloudera Data Visualization.
   * @param input
   * @return DescribeDataVisualizationResponse
   */
  public DescribeDataVisualizationResponse describeDataVisualization(DescribeDataVisualizationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDataVisualization");
    }

    return this.invokeAPI("describeDataVisualization", "/api/v1/dw/describeDataVisualization", input, new GenericType<DescribeDataVisualizationResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a Database Catalog.
   * @param input
   * @return DescribeDbcResponse
   */
  public DescribeDbcResponse describeDbc(DescribeDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDbc");
    }

    return this.invokeAPI("describeDbc", "/api/v1/dw/describeDbc", input, new GenericType<DescribeDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes the Database Catalog current configuration.
   * @param input
   * @return DescribeDbcConfigResponse
   */
  public DescribeDbcConfigResponse describeDbcConfig(DescribeDbcConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDbcConfig");
    }

    return this.invokeAPI("describeDbcConfig", "/api/v1/dw/describeDbcConfig", input, new GenericType<DescribeDbcConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes a diagnostic job for the given Database Catalog.
   * @param input
   * @return DescribeDbcDiagnosticDataJobResponse
   */
  public DescribeDbcDiagnosticDataJobResponse describeDbcDiagnosticDataJob(DescribeDbcDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDbcDiagnosticDataJob");
    }

    return this.invokeAPI("describeDbcDiagnosticDataJob", "/api/v1/dw/describeDbcDiagnosticDataJob", input, new GenericType<DescribeDbcDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get Kubeconfig for a Cloudera Data Warehouse cluster.
   * @param input
   * @return DescribeKubeconfigResponse
   */
  public DescribeKubeconfigResponse describeKubeconfig(DescribeKubeconfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeKubeconfig");
    }

    return this.invokeAPI("describeKubeconfig", "/api/v1/dw/describeKubeconfig", input, new GenericType<DescribeKubeconfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes the restore.
   * @param input
   * @return DescribeRestoreResponse
   */
  public DescribeRestoreResponse describeRestore(DescribeRestoreRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeRestore");
    }

    return this.invokeAPI("describeRestore", "/api/v1/dw/describeRestore", input, new GenericType<DescribeRestoreResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the DWX server settings.
   * @param input
   * @return DescribeServerSettingResponse
   */
  public DescribeServerSettingResponse describeServerSetting(DescribeServerSettingRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeServerSetting");
    }

    return this.invokeAPI("describeServerSetting", "/api/v1/dw/describeServerSetting", input, new GenericType<DescribeServerSettingResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a Virtual Warehouse.
   * @param input
   * @return DescribeVwResponse
   */
  public DescribeVwResponse describeVw(DescribeVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeVw");
    }

    return this.invokeAPI("describeVw", "/api/v1/dw/describeVw", input, new GenericType<DescribeVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes the current configuration of a Hive or Impala Virtual Warehouse.
   * @param input
   * @return DescribeVwConfigResponse
   */
  public DescribeVwConfigResponse describeVwConfig(DescribeVwConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeVwConfig");
    }

    return this.invokeAPI("describeVwConfig", "/api/v1/dw/describeVwConfig", input, new GenericType<DescribeVwConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a diagnostic jobs for the given Virtual Warehouse.
   * @param input
   * @return DescribeVwDiagnosticDataJobResponse
   */
  public DescribeVwDiagnosticDataJobResponse describeVwDiagnosticDataJob(DescribeVwDiagnosticDataJobRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeVwDiagnosticDataJob");
    }

    return this.invokeAPI("describeVwDiagnosticDataJob", "/api/v1/dw/describeVwDiagnosticDataJob", input, new GenericType<DescribeVwDiagnosticDataJobResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets latest version and latest compatible version for Cloudera Data Visualization.
   * @param input
   * @return GetDataVisualizationUpgradeVersionResponse
   */
  public GetDataVisualizationUpgradeVersionResponse getDataVisualizationUpgradeVersion(GetDataVisualizationUpgradeVersionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDataVisualizationUpgradeVersion");
    }

    return this.invokeAPI("getDataVisualizationUpgradeVersion", "/api/v1/dw/getDataVisualizationUpgradeVersion", input, new GenericType<GetDataVisualizationUpgradeVersionResponse>(){}, NO_EXTENSION);
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

    return this.invokeAPI("getLogs", "/api/v1/dw/getLogs", input, new GenericType<GetLogsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets the latest version and latest compatible version for Database Catalog.
   * @param input
   * @return GetUpgradeDbcVersionsResponse
   */
  public GetUpgradeDbcVersionsResponse getUpgradeDbcVersions(GetUpgradeDbcVersionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getUpgradeDbcVersions");
    }

    return this.invokeAPI("getUpgradeDbcVersions", "/api/v1/dw/getUpgradeDbcVersions", input, new GenericType<GetUpgradeDbcVersionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets the latest version and latest compatible version for Virtual Warehouse.
   * @param input
   * @return GetUpgradeVwVersionsResponse
   */
  public GetUpgradeVwVersionsResponse getUpgradeVwVersions(GetUpgradeVwVersionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getUpgradeVwVersions");
    }

    return this.invokeAPI("getUpgradeVwVersions", "/api/v1/dw/getUpgradeVwVersions", input, new GenericType<GetUpgradeVwVersionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Check the health of the API.
   * @param input
   * @return HealthCheckResponse
   */
  public HealthCheckResponse healthCheck(HealthCheckRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling healthCheck");
    }

    return this.invokeAPI("healthCheck", "/api/v1/dw/healthCheck", input, new GenericType<HealthCheckResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists potential backup entities associated with the data warehouse.
   * @param input
   * @return ListBackupEntitiesResponse
   */
  public ListBackupEntitiesResponse listBackupEntities(ListBackupEntitiesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listBackupEntities");
    }

    return this.invokeAPI("listBackupEntities", "/api/v1/dw/listBackupEntities", input, new GenericType<ListBackupEntitiesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists backups.
   * @param input
   * @return ListBackupsResponse
   */
  public ListBackupsResponse listBackups(ListBackupsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listBackups");
    }

    return this.invokeAPI("listBackups", "/api/v1/dw/listBackups", input, new GenericType<ListBackupsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get a list of diagnostic jobs for the given cluster.
   * @param input
   * @return ListClusterDiagnosticDataJobsResponse
   */
  public ListClusterDiagnosticDataJobsResponse listClusterDiagnosticDataJobs(ListClusterDiagnosticDataJobsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusterDiagnosticDataJobs");
    }

    return this.invokeAPI("listClusterDiagnosticDataJobs", "/api/v1/dw/listClusterDiagnosticDataJobs", input, new GenericType<ListClusterDiagnosticDataJobsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Cloudera Data Warehouse clusters.
   * @param input
   * @return ListClustersResponse
   */
  public ListClustersResponse listClusters(ListClustersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusters");
    }

    return this.invokeAPI("listClusters", "/api/v1/dw/listClusters", input, new GenericType<ListClustersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists Cloudera Data Visualization in the provided CDW cluster.
   * @param input
   * @return ListDataVisualizationsResponse
   */
  public ListDataVisualizationsResponse listDataVisualizations(ListDataVisualizationsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDataVisualizations");
    }

    return this.invokeAPI("listDataVisualizations", "/api/v1/dw/listDataVisualizations", input, new GenericType<ListDataVisualizationsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the configuration history of a Database Catalog.
   * @param input
   * @return ListDbcConfigsResponse
   */
  public ListDbcConfigsResponse listDbcConfigs(ListDbcConfigsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDbcConfigs");
    }

    return this.invokeAPI("listDbcConfigs", "/api/v1/dw/listDbcConfigs", input, new GenericType<ListDbcConfigsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get a list of diagnostic jobs for the given Database Catalog.
   * @param input
   * @return ListDbcDiagnosticDataJobsResponse
   */
  public ListDbcDiagnosticDataJobsResponse listDbcDiagnosticDataJobs(ListDbcDiagnosticDataJobsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDbcDiagnosticDataJobs");
    }

    return this.invokeAPI("listDbcDiagnosticDataJobs", "/api/v1/dw/listDbcDiagnosticDataJobs", input, new GenericType<ListDbcDiagnosticDataJobsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the list of events for the given Database Catalog.
   * @param input
   * @return ListDbcEventsResponse
   */
  public ListDbcEventsResponse listDbcEvents(ListDbcEventsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDbcEvents");
    }

    return this.invokeAPI("listDbcEvents", "/api/v1/dw/listDbcEvents", input, new GenericType<ListDbcEventsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Database Catalogs.
   * @param input
   * @return ListDbcsResponse
   */
  public ListDbcsResponse listDbcs(ListDbcsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDbcs");
    }

    return this.invokeAPI("listDbcs", "/api/v1/dw/listDbcs", input, new GenericType<ListDbcsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the list of events.
   * @param input
   * @return ListEventsResponse
   */
  public ListEventsResponse listEvents(ListEventsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listEvents");
    }

    return this.invokeAPI("listEvents", "/api/v1/dw/listEvents", input, new GenericType<ListEventsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the latest version of the product (if available) for all catalogs in the environment.
   * @param input
   * @return ListLatestVersionsResponse
   */
  public ListLatestVersionsResponse listLatestVersions(ListLatestVersionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listLatestVersions");
    }

    return this.invokeAPI("listLatestVersions", "/api/v1/dw/listLatestVersions", input, new GenericType<ListLatestVersionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get default resource allocation templates.
   * @param input
   * @return ListResourceTemplatesResponse
   */
  public ListResourceTemplatesResponse listResourceTemplates(ListResourceTemplatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listResourceTemplates");
    }

    return this.invokeAPI("listResourceTemplates", "/api/v1/dw/listResourceTemplates", input, new GenericType<ListResourceTemplatesResponse>(){}, NO_EXTENSION);
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

    return this.invokeAPI("listRestores", "/api/v1/dw/listRestores", input, new GenericType<ListRestoresResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the users who have access to the cluster.
   * @param input
   * @return ListUsersResponse
   */
  public ListUsersResponse listUsers(ListUsersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listUsers");
    }

    return this.invokeAPI("listUsers", "/api/v1/dw/listUsers", input, new GenericType<ListUsersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the configuration history of a Virtual Warehouse.
   * @param input
   * @return ListVwConfigsResponse
   */
  public ListVwConfigsResponse listVwConfigs(ListVwConfigsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listVwConfigs");
    }

    return this.invokeAPI("listVwConfigs", "/api/v1/dw/listVwConfigs", input, new GenericType<ListVwConfigsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get a list of diagnostic jobs for the given Virtual Warehouse.
   * @param input
   * @return ListVwDiagnosticDataJobsResponse
   */
  public ListVwDiagnosticDataJobsResponse listVwDiagnosticDataJobs(ListVwDiagnosticDataJobsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listVwDiagnosticDataJobs");
    }

    return this.invokeAPI("listVwDiagnosticDataJobs", "/api/v1/dw/listVwDiagnosticDataJobs", input, new GenericType<ListVwDiagnosticDataJobsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the list of events for the given Virtual Warehouse.
   * @param input
   * @return ListVwEventsResponse
   */
  public ListVwEventsResponse listVwEvents(ListVwEventsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listVwEvents");
    }

    return this.invokeAPI("listVwEvents", "/api/v1/dw/listVwEvents", input, new GenericType<ListVwEventsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Virtual Warehouses.
   * @param input
   * @return ListVwsResponse
   */
  public ListVwsResponse listVws(ListVwsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listVws");
    }

    return this.invokeAPI("listVws", "/api/v1/dw/listVws", input, new GenericType<ListVwsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Rebuild a Database Catalog.
   * @param input
   * @return RebuildDbcResponse
   */
  public RebuildDbcResponse rebuildDbc(RebuildDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling rebuildDbc");
    }

    return this.invokeAPI("rebuildDbc", "/api/v1/dw/rebuildDbc", input, new GenericType<RebuildDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Rebuild a Virtual Warehouse.
   * @param input
   * @return RebuildVwResponse
   */
  public RebuildVwResponse rebuildVw(RebuildVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling rebuildVw");
    }

    return this.invokeAPI("rebuildVw", "/api/v1/dw/rebuildVw", input, new GenericType<RebuildVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Renew certificates for a Cloudera Data Warehouse Azure cluster.
   * @param input
   * @return RenewCertificatesResponse
   */
  public RenewCertificatesResponse renewCertificates(RenewCertificatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling renewCertificates");
    }

    return this.invokeAPI("renewCertificates", "/api/v1/dw/renewCertificates", input, new GenericType<RenewCertificatesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restores the DWX server settings to the default values.
   * @param input
   * @return ResetServerSettingsResponse
   */
  public ResetServerSettingsResponse resetServerSettings(ResetServerSettingsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling resetServerSettings");
    }

    return this.invokeAPI("resetServerSettings", "/api/v1/dw/resetServerSettings", input, new GenericType<ResetServerSettingsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restart a Database Catalog.
   * @param input
   * @return RestartDbcResponse
   */
  @Deprecated
  public RestartDbcResponse restartDbc(RestartDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restartDbc");
    }

    return this.invokeAPI("restartDbc", "/api/v1/dw/restartDbc", input, new GenericType<RestartDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restart a Virtual Warehouse.
   * @param input
   * @return RestartVwResponse
   */
  @Deprecated
  public RestartVwResponse restartVw(RestartVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restartVw");
    }

    return this.invokeAPI("restartVw", "/api/v1/dw/restartVw", input, new GenericType<RestartVwResponse>(){}, NO_EXTENSION);
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

    return this.invokeAPI("restoreBackup", "/api/v1/dw/restoreBackup", input, new GenericType<RestoreBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restores the cluster from a backup data made by \&quot;backup-cluster\&quot; command.
   * @param input
   * @return RestoreClusterResponse
   */
  public RestoreClusterResponse restoreCluster(RestoreClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restoreCluster");
    }

    return this.invokeAPI("restoreCluster", "/api/v1/dw/restoreCluster", input, new GenericType<RestoreClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start a Database Catalog.
   * @param input
   * @return StartDbcResponse
   */
  public StartDbcResponse startDbc(StartDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startDbc");
    }

    return this.invokeAPI("startDbc", "/api/v1/dw/startDbc", input, new GenericType<StartDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Starts a suspended Virtual Warehouse.
   * @param input
   * @return StartVwResponse
   */
  public StartVwResponse startVw(StartVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startVw");
    }

    return this.invokeAPI("startVw", "/api/v1/dw/startVw", input, new GenericType<StartVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Suspends a running Database Catalog.
   * @param input
   * @return SuspendDbcResponse
   */
  public SuspendDbcResponse suspendDbc(SuspendDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling suspendDbc");
    }

    return this.invokeAPI("suspendDbc", "/api/v1/dw/suspendDbc", input, new GenericType<SuspendDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Suspends a running Virtual Warehouse.
   * @param input
   * @return SuspendVwResponse
   */
  public SuspendVwResponse suspendVw(SuspendVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling suspendVw");
    }

    return this.invokeAPI("suspendVw", "/api/v1/dw/suspendVw", input, new GenericType<SuspendVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates the Cloudera Data Warehouse cluster.
   * @param input
   * @return UpdateClusterResponse
   */
  public UpdateClusterResponse updateCluster(UpdateClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateCluster");
    }

    return this.invokeAPI("updateCluster", "/api/v1/dw/updateCluster", input, new GenericType<UpdateClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Asynchronous operation that updates the configuration of a Cloudera Data Visualization. The describe-data-visualization can be used at any time to get the latest status of a Data Visualization.
   * @param input
   * @return UpdateDataVisualizationResponse
   */
  public UpdateDataVisualizationResponse updateDataVisualization(UpdateDataVisualizationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateDataVisualization");
    }

    return this.invokeAPI("updateDataVisualization", "/api/v1/dw/updateDataVisualization", input, new GenericType<UpdateDataVisualizationResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the configuration of a Database Catalog.
   * @param input
   * @return UpdateDbcResponse
   */
  public UpdateDbcResponse updateDbc(UpdateDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateDbc");
    }

    return this.invokeAPI("updateDbc", "/api/v1/dw/updateDbc", input, new GenericType<UpdateDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update a Database Catalog configuration.
   * @param input
   * @return UpdateDbcConfigResponse
   */
  public UpdateDbcConfigResponse updateDbcConfig(UpdateDbcConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateDbcConfig");
    }

    return this.invokeAPI("updateDbcConfig", "/api/v1/dw/updateDbcConfig", input, new GenericType<UpdateDbcConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update a resource allocation template.
   * @param input
   * @return UpdateResourceTemplateResponse
   */
  public UpdateResourceTemplateResponse updateResourceTemplate(UpdateResourceTemplateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateResourceTemplate");
    }

    return this.invokeAPI("updateResourceTemplate", "/api/v1/dw/updateResourceTemplate", input, new GenericType<UpdateResourceTemplateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the DWX server settings.
   * @param input
   * @return UpdateServerSettingResponse
   */
  public UpdateServerSettingResponse updateServerSetting(UpdateServerSettingRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateServerSetting");
    }

    return this.invokeAPI("updateServerSetting", "/api/v1/dw/updateServerSetting", input, new GenericType<UpdateServerSettingResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the SSH Key for a Cloudera Data Warehouse cluster
   * @param input
   * @return UpdateSshKeyResponse
   */
  public UpdateSshKeyResponse updateSshKey(UpdateSshKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateSshKey");
    }

    return this.invokeAPI("updateSshKey", "/api/v1/dw/updateSshKey", input, new GenericType<UpdateSshKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the configuration of a Virtual Warehouse.
   * @param input
   * @return UpdateVwResponse
   */
  public UpdateVwResponse updateVw(UpdateVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateVw");
    }

    return this.invokeAPI("updateVw", "/api/v1/dw/updateVw", input, new GenericType<UpdateVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update a Virtual Warehouse configuration.
   * @param input
   * @return UpdateVwConfigResponse
   */
  public UpdateVwConfigResponse updateVwConfig(UpdateVwConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateVwConfig");
    }

    return this.invokeAPI("updateVwConfig", "/api/v1/dw/updateVwConfig", input, new GenericType<UpdateVwConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Asynchronous operation that upgrades a Cloudera Data Visualization to a compatible version. The describe-data-visualization can be used at any time to get the latest status of a Data Visualization.
   * @param input
   * @return UpgradeDataVisualizationResponse
   */
  public UpgradeDataVisualizationResponse upgradeDataVisualization(UpgradeDataVisualizationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeDataVisualization");
    }

    return this.invokeAPI("upgradeDataVisualization", "/api/v1/dw/upgradeDataVisualization", input, new GenericType<UpgradeDataVisualizationResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades the Database Catalog to a compatible version.
   * @param input
   * @return UpgradeDbcResponse
   */
  public UpgradeDbcResponse upgradeDbc(UpgradeDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeDbc");
    }

    return this.invokeAPI("upgradeDbc", "/api/v1/dw/upgradeDbc", input, new GenericType<UpgradeDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades the Virtual Warehouse to a compatible version.
   * @param input
   * @return UpgradeVwResponse
   */
  public UpgradeVwResponse upgradeVw(UpgradeVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeVw");
    }

    return this.invokeAPI("upgradeVw", "/api/v1/dw/upgradeVw", input, new GenericType<UpgradeVwResponse>(){}, NO_EXTENSION);
  }
}
