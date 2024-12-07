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

package com.cloudera.cdp.de.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.de.model.CancelBackupRequest;
import com.cloudera.cdp.de.model.CancelBackupResponse;
import com.cloudera.cdp.de.model.CreateBackupRequest;
import com.cloudera.cdp.de.model.CreateBackupResponse;
import com.cloudera.cdp.de.model.CreateVcRequest;
import com.cloudera.cdp.de.model.CreateVcResponse;
import com.cloudera.cdp.de.model.DeleteBackupRequest;
import com.cloudera.cdp.de.model.DeleteBackupResponse;
import com.cloudera.cdp.de.model.DeleteVcRequest;
import com.cloudera.cdp.de.model.DeleteVcResponse;
import com.cloudera.cdp.de.model.DescribeBackupRequest;
import com.cloudera.cdp.de.model.DescribeBackupResponse;
import com.cloudera.cdp.de.model.DescribeServiceRequest;
import com.cloudera.cdp.de.model.DescribeServiceResponse;
import com.cloudera.cdp.de.model.DescribeVcRequest;
import com.cloudera.cdp.de.model.DescribeVcResponse;
import com.cloudera.cdp.de.model.DisableServiceRequest;
import com.cloudera.cdp.de.model.DisableServiceResponse;
import com.cloudera.cdp.de.model.EnableServiceRequest;
import com.cloudera.cdp.de.model.EnableServiceResponse;
import com.cloudera.cdp.de.model.Error;
import com.cloudera.cdp.de.model.GetBackupLogsRequest;
import com.cloudera.cdp.de.model.GetBackupLogsResponse;
import com.cloudera.cdp.de.model.GetKubeconfigRequest;
import com.cloudera.cdp.de.model.GetKubeconfigResponse;
import com.cloudera.cdp.de.model.GetServiceInitLogsRequest;
import com.cloudera.cdp.de.model.GetServiceInitLogsResponse;
import com.cloudera.cdp.de.model.GetUpgradeStatusRequest;
import com.cloudera.cdp.de.model.GetUpgradeStatusResponse;
import com.cloudera.cdp.de.model.ListBackupsRequest;
import com.cloudera.cdp.de.model.ListBackupsResponse;
import com.cloudera.cdp.de.model.ListServicesRequest;
import com.cloudera.cdp.de.model.ListServicesResponse;
import com.cloudera.cdp.de.model.ListVcsRequest;
import com.cloudera.cdp.de.model.ListVcsResponse;
import com.cloudera.cdp.de.model.RestoreServiceRequest;
import com.cloudera.cdp.de.model.RestoreServiceResponse;
import com.cloudera.cdp.de.model.UpdateServiceRequest;
import com.cloudera.cdp.de.model.UpdateServiceResponse;
import com.cloudera.cdp.de.model.UpdateVcRequest;
import com.cloudera.cdp.de.model.UpdateVcResponse;
import com.cloudera.cdp.de.model.UpgradeServiceRequest;
import com.cloudera.cdp.de.model.UpgradeServiceResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:17.909-08:00")
public class DeClient extends CdpClient {

  public static final String SERVICE_NAME = "de";

  public DeClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DeClient(CdpRequestContext<?> context) {
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
   * Cancel Cloudera Data Engineering(CDE) Service Backup
   * @param input
   * @return CancelBackupResponse
   */
  public CancelBackupResponse cancelBackup(CancelBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling cancelBackup");
    }

    return this.invokeAPI("cancelBackup", "/api/v1/de/cancelBackup", input, new GenericType<CancelBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Backup Cloudera Data Engineering(CDE) Service
   * @param input
   * @return CreateBackupResponse
   */
  public CreateBackupResponse createBackup(CreateBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createBackup");
    }

    return this.invokeAPI("createBackup", "/api/v1/de/createBackup", input, new GenericType<CreateBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create Virtual Cluster
   * @param input
   * @return CreateVcResponse
   */
  public CreateVcResponse createVc(CreateVcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createVc");
    }

    return this.invokeAPI("createVc", "/api/v1/de/createVc", input, new GenericType<CreateVcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete Cloudera Data Engineering(CDE) Service Backup
   * @param input
   * @return DeleteBackupResponse
   */
  public DeleteBackupResponse deleteBackup(DeleteBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteBackup");
    }

    return this.invokeAPI("deleteBackup", "/api/v1/de/deleteBackup", input, new GenericType<DeleteBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete Virtual Cluster
   * @param input
   * @return DeleteVcResponse
   */
  public DeleteVcResponse deleteVc(DeleteVcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteVc");
    }

    return this.invokeAPI("deleteVc", "/api/v1/de/deleteVc", input, new GenericType<DeleteVcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe Cloudera Data Engineering(CDE) Service Backup
   * @param input
   * @return DescribeBackupResponse
   */
  public DescribeBackupResponse describeBackup(DescribeBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeBackup");
    }

    return this.invokeAPI("describeBackup", "/api/v1/de/describeBackup", input, new GenericType<DescribeBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe Cloudera Data Engineering(CDE) Service
   * @param input
   * @return DescribeServiceResponse
   */
  public DescribeServiceResponse describeService(DescribeServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeService");
    }

    return this.invokeAPI("describeService", "/api/v1/de/describeService", input, new GenericType<DescribeServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe Virtual Cluster
   * @param input
   * @return DescribeVcResponse
   */
  public DescribeVcResponse describeVc(DescribeVcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeVc");
    }

    return this.invokeAPI("describeVc", "/api/v1/de/describeVc", input, new GenericType<DescribeVcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Disable Cloudera Data Engineering(CDE) Service
   * @param input
   * @return DisableServiceResponse
   */
  public DisableServiceResponse disableService(DisableServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling disableService");
    }

    return this.invokeAPI("disableService", "/api/v1/de/disableService", input, new GenericType<DisableServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Enable Cloudera Data Engineering(CDE) Service
   * @param input
   * @return EnableServiceResponse
   */
  public EnableServiceResponse enableService(EnableServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling enableService");
    }

    return this.invokeAPI("enableService", "/api/v1/de/enableService", input, new GenericType<EnableServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retrieve Cloudera Data Engineering(CDE) Service Backup Logs
   * @param input
   * @return GetBackupLogsResponse
   */
  public GetBackupLogsResponse getBackupLogs(GetBackupLogsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getBackupLogs");
    }

    return this.invokeAPI("getBackupLogs", "/api/v1/de/getBackupLogs", input, new GenericType<GetBackupLogsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get Kubeconfig for the CDE service
   * @param input
   * @return GetKubeconfigResponse
   */
  public GetKubeconfigResponse getKubeconfig(GetKubeconfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getKubeconfig");
    }

    return this.invokeAPI("getKubeconfig", "/api/v1/de/getKubeconfig", input, new GenericType<GetKubeconfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retrieve Cloudera Data Engineering(CDE) Service Initialization Logs
   * @param input
   * @return GetServiceInitLogsResponse
   */
  public GetServiceInitLogsResponse getServiceInitLogs(GetServiceInitLogsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getServiceInitLogs");
    }

    return this.invokeAPI("getServiceInitLogs", "/api/v1/de/getServiceInitLogs", input, new GenericType<GetServiceInitLogsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get CDE Service Upgrade Status.
   * @param input
   * @return GetUpgradeStatusResponse
   */
  public GetUpgradeStatusResponse getUpgradeStatus(GetUpgradeStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getUpgradeStatus");
    }

    return this.invokeAPI("getUpgradeStatus", "/api/v1/de/getUpgradeStatus", input, new GenericType<GetUpgradeStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Cloudera Data Engineering(CDE) Service Backups
   * @param input
   * @return ListBackupsResponse
   */
  public ListBackupsResponse listBackups(ListBackupsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listBackups");
    }

    return this.invokeAPI("listBackups", "/api/v1/de/listBackups", input, new GenericType<ListBackupsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Cloudera Data Engineering(CDE) Services
   * @param input
   * @return ListServicesResponse
   */
  public ListServicesResponse listServices(ListServicesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listServices");
    }

    return this.invokeAPI("listServices", "/api/v1/de/listServices", input, new GenericType<ListServicesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Virtual Clusters
   * @param input
   * @return ListVcsResponse
   */
  public ListVcsResponse listVcs(ListVcsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listVcs");
    }

    return this.invokeAPI("listVcs", "/api/v1/de/listVcs", input, new GenericType<ListVcsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restore Cloudera Data Engineering(CDE) Service
   * @param input
   * @return RestoreServiceResponse
   */
  public RestoreServiceResponse restoreService(RestoreServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restoreService");
    }

    return this.invokeAPI("restoreService", "/api/v1/de/restoreService", input, new GenericType<RestoreServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update Cloudera Data Engineering (CDE) Service
   * @param input
   * @return UpdateServiceResponse
   */
  public UpdateServiceResponse updateService(UpdateServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateService");
    }

    return this.invokeAPI("updateService", "/api/v1/de/updateService", input, new GenericType<UpdateServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update Cloudera Data Engineering (CDE) Virtual Cluster
   * @param input
   * @return UpdateVcResponse
   */
  public UpdateVcResponse updateVc(UpdateVcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateVc");
    }

    return this.invokeAPI("updateVc", "/api/v1/de/updateVc", input, new GenericType<UpdateVcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Trigger a particular step (prepare, backup, upgrade, resume) of the upgrade framework.
   * @param input
   * @return UpgradeServiceResponse
   */
  public UpgradeServiceResponse upgradeService(UpgradeServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeService");
    }

    return this.invokeAPI("upgradeService", "/api/v1/de/upgradeService", input, new GenericType<UpgradeServiceResponse>(){}, NO_EXTENSION);
  }
}
