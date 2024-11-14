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

package com.cloudera.cdp.environments.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.environments.model.AttachFreeIpaRecipesRequest;
import com.cloudera.cdp.environments.model.AttachFreeIpaRecipesResponse;
import com.cloudera.cdp.environments.model.CancelFreeipaDiagnosticsRequest;
import com.cloudera.cdp.environments.model.CancelFreeipaDiagnosticsResponse;
import com.cloudera.cdp.environments.model.ChangeEnvironmentCredentialRequest;
import com.cloudera.cdp.environments.model.ChangeEnvironmentCredentialResponse;
import com.cloudera.cdp.environments.model.CheckDatabaseConnectivityRequest;
import com.cloudera.cdp.environments.model.CheckDatabaseConnectivityResponse;
import com.cloudera.cdp.environments.model.CheckEnvironmentConnectivityRequest;
import com.cloudera.cdp.environments.model.CheckEnvironmentConnectivityResponse;
import com.cloudera.cdp.environments.model.CheckKubernetesConnectivityRequest;
import com.cloudera.cdp.environments.model.CheckKubernetesConnectivityResponse;
import com.cloudera.cdp.environments.model.CollectFreeipaDiagnosticsRequest;
import com.cloudera.cdp.environments.model.CollectFreeipaDiagnosticsResponse;
import com.cloudera.cdp.environments.model.CreateAWSCredentialRequest;
import com.cloudera.cdp.environments.model.CreateAWSCredentialResponse;
import com.cloudera.cdp.environments.model.CreateAWSEnvironmentRequest;
import com.cloudera.cdp.environments.model.CreateAWSEnvironmentResponse;
import com.cloudera.cdp.environments.model.CreateAWSGovCloudCredentialRequest;
import com.cloudera.cdp.environments.model.CreateAWSGovCloudCredentialResponse;
import com.cloudera.cdp.environments.model.CreateAWSGovCloudEnvironmentRequest;
import com.cloudera.cdp.environments.model.CreateAWSGovCloudEnvironmentResponse;
import com.cloudera.cdp.environments.model.CreateAzureCredentialRequest;
import com.cloudera.cdp.environments.model.CreateAzureCredentialResponse;
import com.cloudera.cdp.environments.model.CreateAzureEnvironmentRequest;
import com.cloudera.cdp.environments.model.CreateAzureEnvironmentResponse;
import com.cloudera.cdp.environments.model.CreateGCPCredentialRequest;
import com.cloudera.cdp.environments.model.CreateGCPCredentialResponse;
import com.cloudera.cdp.environments.model.CreateGCPEnvironmentRequest;
import com.cloudera.cdp.environments.model.CreateGCPEnvironmentResponse;
import com.cloudera.cdp.environments.model.CreatePrivateEnvironmentRequest;
import com.cloudera.cdp.environments.model.CreatePrivateEnvironmentResponse;
import com.cloudera.cdp.environments.model.CreateProxyConfigRequest;
import com.cloudera.cdp.environments.model.CreateProxyConfigResponse;
import com.cloudera.cdp.environments.model.DeleteAuditCredentialRequest;
import com.cloudera.cdp.environments.model.DeleteAuditCredentialResponse;
import com.cloudera.cdp.environments.model.DeleteCredentialRequest;
import com.cloudera.cdp.environments.model.DeleteCredentialResponse;
import com.cloudera.cdp.environments.model.DeleteEnvironmentRequest;
import com.cloudera.cdp.environments.model.DeleteEnvironmentResponse;
import com.cloudera.cdp.environments.model.DeleteProxyConfigRequest;
import com.cloudera.cdp.environments.model.DeleteProxyConfigResponse;
import com.cloudera.cdp.environments.model.DescribeEnvironmentRequest;
import com.cloudera.cdp.environments.model.DescribeEnvironmentResponse;
import com.cloudera.cdp.environments.model.DetachFreeIpaRecipesRequest;
import com.cloudera.cdp.environments.model.DetachFreeIpaRecipesResponse;
import com.cloudera.cdp.environments.model.DownscaleFreeipaRequest;
import com.cloudera.cdp.environments.model.DownscaleFreeipaResponse;
import com.cloudera.cdp.environments.model.Error;
import com.cloudera.cdp.environments.model.GetAccountTelemetryDefaultRequest;
import com.cloudera.cdp.environments.model.GetAccountTelemetryDefaultResponse;
import com.cloudera.cdp.environments.model.GetAccountTelemetryRequest;
import com.cloudera.cdp.environments.model.GetAccountTelemetryResponse;
import com.cloudera.cdp.environments.model.GetAuditCredentialPrerequisitesRequest;
import com.cloudera.cdp.environments.model.GetAuditCredentialPrerequisitesResponse;
import com.cloudera.cdp.environments.model.GetAzureImageTermsPolicyRequest;
import com.cloudera.cdp.environments.model.GetAzureImageTermsPolicyResponse;
import com.cloudera.cdp.environments.model.GetCredentialPrerequisitesRequest;
import com.cloudera.cdp.environments.model.GetCredentialPrerequisitesResponse;
import com.cloudera.cdp.environments.model.GetEnvironmentSettingRequest;
import com.cloudera.cdp.environments.model.GetEnvironmentSettingResponse;
import com.cloudera.cdp.environments.model.GetEnvironmentUserSyncStateRequest;
import com.cloudera.cdp.environments.model.GetEnvironmentUserSyncStateResponse;
import com.cloudera.cdp.environments.model.GetFreeipaLogDescriptorsRequest;
import com.cloudera.cdp.environments.model.GetFreeipaLogDescriptorsResponse;
import com.cloudera.cdp.environments.model.GetFreeipaStatusRequest;
import com.cloudera.cdp.environments.model.GetFreeipaStatusResponse;
import com.cloudera.cdp.environments.model.GetFreeipaUpgradeOptionsRequest;
import com.cloudera.cdp.environments.model.GetFreeipaUpgradeOptionsResponse;
import com.cloudera.cdp.environments.model.GetGovCloudAuditCredentialPrerequisitesRequest;
import com.cloudera.cdp.environments.model.GetGovCloudAuditCredentialPrerequisitesResponse;
import com.cloudera.cdp.environments.model.GetGovCloudCredentialPrerequisitesRequest;
import com.cloudera.cdp.environments.model.GetGovCloudCredentialPrerequisitesResponse;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsRequest;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsResponse;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsSyncStatusRequest;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsSyncStatusResponse;
import com.cloudera.cdp.environments.model.GetKeytabRequest;
import com.cloudera.cdp.environments.model.GetKeytabResponse;
import com.cloudera.cdp.environments.model.GetOperationRequest;
import com.cloudera.cdp.environments.model.GetOperationResponse;
import com.cloudera.cdp.environments.model.GetRepairFreeipaStatusRequest;
import com.cloudera.cdp.environments.model.GetRepairFreeipaStatusResponse;
import com.cloudera.cdp.environments.model.GetRootCertificateRequest;
import com.cloudera.cdp.environments.model.GetRootCertificateResponse;
import com.cloudera.cdp.environments.model.InitializeAWSComputeClusterRequest;
import com.cloudera.cdp.environments.model.InitializeAWSComputeClusterResponse;
import com.cloudera.cdp.environments.model.InitializeAzureComputeClusterRequest;
import com.cloudera.cdp.environments.model.InitializeAzureComputeClusterResponse;
import com.cloudera.cdp.environments.model.LastSyncStatusRequest;
import com.cloudera.cdp.environments.model.LastSyncStatusResponse;
import com.cloudera.cdp.environments.model.ListAuditCredentialsRequest;
import com.cloudera.cdp.environments.model.ListAuditCredentialsResponse;
import com.cloudera.cdp.environments.model.ListConnectedDataServicesRequest;
import com.cloudera.cdp.environments.model.ListConnectedDataServicesResponse;
import com.cloudera.cdp.environments.model.ListCredentialsRequest;
import com.cloudera.cdp.environments.model.ListCredentialsResponse;
import com.cloudera.cdp.environments.model.ListEnvironmentsRequest;
import com.cloudera.cdp.environments.model.ListEnvironmentsResponse;
import com.cloudera.cdp.environments.model.ListFreeipaDiagnosticsRequest;
import com.cloudera.cdp.environments.model.ListFreeipaDiagnosticsResponse;
import com.cloudera.cdp.environments.model.ListProxyConfigsRequest;
import com.cloudera.cdp.environments.model.ListProxyConfigsResponse;
import com.cloudera.cdp.environments.model.RepairFreeipaRequest;
import com.cloudera.cdp.environments.model.RepairFreeipaResponse;
import com.cloudera.cdp.environments.model.RetryFreeipaRequest;
import com.cloudera.cdp.environments.model.RetryFreeipaResponse;
import com.cloudera.cdp.environments.model.RotateSaltPasswordRequest;
import com.cloudera.cdp.environments.model.RotateSaltPasswordResponse;
import com.cloudera.cdp.environments.model.SetAWSAuditCredentialRequest;
import com.cloudera.cdp.environments.model.SetAWSAuditCredentialResponse;
import com.cloudera.cdp.environments.model.SetAWSGovCloudAuditCredentialRequest;
import com.cloudera.cdp.environments.model.SetAWSGovCloudAuditCredentialResponse;
import com.cloudera.cdp.environments.model.SetAccountTelemetryRequest;
import com.cloudera.cdp.environments.model.SetAccountTelemetryResponse;
import com.cloudera.cdp.environments.model.SetAzureAuditCredentialRequest;
import com.cloudera.cdp.environments.model.SetAzureAuditCredentialResponse;
import com.cloudera.cdp.environments.model.SetCatalogRequest;
import com.cloudera.cdp.environments.model.SetCatalogResponse;
import com.cloudera.cdp.environments.model.SetEndpointAccessGatewayRequest;
import com.cloudera.cdp.environments.model.SetEndpointAccessGatewayResponse;
import com.cloudera.cdp.environments.model.SetEnvironmentSettingRequest;
import com.cloudera.cdp.environments.model.SetEnvironmentSettingResponse;
import com.cloudera.cdp.environments.model.SetGCPAuditCredentialRequest;
import com.cloudera.cdp.environments.model.SetGCPAuditCredentialResponse;
import com.cloudera.cdp.environments.model.SetIdBrokerMappingsRequest;
import com.cloudera.cdp.environments.model.SetIdBrokerMappingsResponse;
import com.cloudera.cdp.environments.model.SetPasswordRequest;
import com.cloudera.cdp.environments.model.SetPasswordResponse;
import com.cloudera.cdp.environments.model.SetTelemetryFeaturesRequest;
import com.cloudera.cdp.environments.model.SetTelemetryFeaturesResponse;
import com.cloudera.cdp.environments.model.StartEnvironmentRequest;
import com.cloudera.cdp.environments.model.StartEnvironmentResponse;
import com.cloudera.cdp.environments.model.StartFreeIpaVerticalScalingRequest;
import com.cloudera.cdp.environments.model.StartFreeIpaVerticalScalingResponse;
import com.cloudera.cdp.environments.model.StopEnvironmentRequest;
import com.cloudera.cdp.environments.model.StopEnvironmentResponse;
import com.cloudera.cdp.environments.model.SyncAllUsersRequest;
import com.cloudera.cdp.environments.model.SyncAllUsersResponse;
import com.cloudera.cdp.environments.model.SyncIdBrokerMappingsRequest;
import com.cloudera.cdp.environments.model.SyncIdBrokerMappingsResponse;
import com.cloudera.cdp.environments.model.SyncStatusRequest;
import com.cloudera.cdp.environments.model.SyncStatusResponse;
import com.cloudera.cdp.environments.model.SyncUserRequest;
import com.cloudera.cdp.environments.model.SyncUserResponse;
import com.cloudera.cdp.environments.model.TestAccountTelemetryRulesRequest;
import com.cloudera.cdp.environments.model.TestAccountTelemetryRulesResponse;
import com.cloudera.cdp.environments.model.UpdateAwsCredentialRequest;
import com.cloudera.cdp.environments.model.UpdateAwsCredentialResponse;
import com.cloudera.cdp.environments.model.UpdateAwsDiskEncryptionParametersRequest;
import com.cloudera.cdp.environments.model.UpdateAwsDiskEncryptionParametersResponse;
import com.cloudera.cdp.environments.model.UpdateAzureAvailabilityZonesRequest;
import com.cloudera.cdp.environments.model.UpdateAzureAvailabilityZonesResponse;
import com.cloudera.cdp.environments.model.UpdateAzureCredentialRequest;
import com.cloudera.cdp.environments.model.UpdateAzureCredentialResponse;
import com.cloudera.cdp.environments.model.UpdateAzureDatabaseResourcesRequest;
import com.cloudera.cdp.environments.model.UpdateAzureDatabaseResourcesResponse;
import com.cloudera.cdp.environments.model.UpdateAzureEncryptionResourcesRequest;
import com.cloudera.cdp.environments.model.UpdateAzureEncryptionResourcesResponse;
import com.cloudera.cdp.environments.model.UpdateAzureImageTermsPolicyRequest;
import com.cloudera.cdp.environments.model.UpdateAzureImageTermsPolicyResponse;
import com.cloudera.cdp.environments.model.UpdateCustomDockerRegistryRequest;
import com.cloudera.cdp.environments.model.UpdateCustomDockerRegistryResponse;
import com.cloudera.cdp.environments.model.UpdateDataServiceResourcesRequest;
import com.cloudera.cdp.environments.model.UpdateDataServiceResourcesResponse;
import com.cloudera.cdp.environments.model.UpdateFreeipaToAwsImdsV1Request;
import com.cloudera.cdp.environments.model.UpdateFreeipaToAwsImdsV1Response;
import com.cloudera.cdp.environments.model.UpdateFreeipaToAwsImdsV2Request;
import com.cloudera.cdp.environments.model.UpdateFreeipaToAwsImdsV2Response;
import com.cloudera.cdp.environments.model.UpdateOrchestratorStateRequest;
import com.cloudera.cdp.environments.model.UpdateOrchestratorStateResponse;
import com.cloudera.cdp.environments.model.UpdateProxyConfigRequest;
import com.cloudera.cdp.environments.model.UpdateProxyConfigResponse;
import com.cloudera.cdp.environments.model.UpdateSecurityAccessRequest;
import com.cloudera.cdp.environments.model.UpdateSecurityAccessResponse;
import com.cloudera.cdp.environments.model.UpdateSshKeyRequest;
import com.cloudera.cdp.environments.model.UpdateSshKeyResponse;
import com.cloudera.cdp.environments.model.UpdateSubnetRequest;
import com.cloudera.cdp.environments.model.UpdateSubnetResponse;
import com.cloudera.cdp.environments.model.UpgradeCcmRequest;
import com.cloudera.cdp.environments.model.UpgradeCcmResponse;
import com.cloudera.cdp.environments.model.UpgradeFreeipaRequest;
import com.cloudera.cdp.environments.model.UpgradeFreeipaResponse;
import com.cloudera.cdp.environments.model.UpscaleFreeipaRequest;
import com.cloudera.cdp.environments.model.UpscaleFreeipaResponse;
import com.cloudera.cdp.environments.model.ValidateAwsCloudStorageRequest;
import com.cloudera.cdp.environments.model.ValidateAwsCloudStorageResponse;
import com.cloudera.cdp.environments.model.ValidateAzureCloudStorageRequest;
import com.cloudera.cdp.environments.model.ValidateAzureCloudStorageResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:26.302-08:00")
public class EnvironmentsClient extends CdpClient {

  public static final String SERVICE_NAME = "environments2";

  public EnvironmentsClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public EnvironmentsClient(CdpRequestContext<?> context) {
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
   * Attach recipes to FreeIPA.
   * @param input
   * @return AttachFreeIpaRecipesResponse
   */
  public AttachFreeIpaRecipesResponse attachFreeIpaRecipes(AttachFreeIpaRecipesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling attachFreeIpaRecipes");
    }

    return this.invokeAPI("attachFreeIpaRecipes", "/api/v1/environments2/attachFreeIpaRecipes", input, new GenericType<AttachFreeIpaRecipesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Cancel running FreeIPA diagnostics collections
   * @param input
   * @return CancelFreeipaDiagnosticsResponse
   */
  public CancelFreeipaDiagnosticsResponse cancelFreeipaDiagnostics(CancelFreeipaDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling cancelFreeipaDiagnostics");
    }

    return this.invokeAPI("cancelFreeipaDiagnostics", "/api/v1/environments2/cancelFreeipaDiagnostics", input, new GenericType<CancelFreeipaDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Changes the credential for an environment.
   * @param input
   * @return ChangeEnvironmentCredentialResponse
   */
  public ChangeEnvironmentCredentialResponse changeEnvironmentCredential(ChangeEnvironmentCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling changeEnvironmentCredential");
    }

    return this.invokeAPI("changeEnvironmentCredential", "/api/v1/environments2/changeEnvironmentCredential", input, new GenericType<ChangeEnvironmentCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Checks Database connectivity based on the input parameters.
   * @param input
   * @return CheckDatabaseConnectivityResponse
   */
  public CheckDatabaseConnectivityResponse checkDatabaseConnectivity(CheckDatabaseConnectivityRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling checkDatabaseConnectivity");
    }

    return this.invokeAPI("checkDatabaseConnectivity", "/api/v1/environments2/checkDatabaseConnectivity", input, new GenericType<CheckDatabaseConnectivityResponse>(){}, NO_EXTENSION);
  }

  /**
   * Checks connectivity to a new Private Cloud environment by trying to access the Cloudera Manager address with provided credentials.
   * @param input
   * @return CheckEnvironmentConnectivityResponse
   */
  public CheckEnvironmentConnectivityResponse checkEnvironmentConnectivity(CheckEnvironmentConnectivityRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling checkEnvironmentConnectivity");
    }

    return this.invokeAPI("checkEnvironmentConnectivity", "/api/v1/environments2/checkEnvironmentConnectivity", input, new GenericType<CheckEnvironmentConnectivityResponse>(){}, NO_EXTENSION);
  }

  /**
   * Checks connectivity to a Kubernetes address with provided kubeconfig files.
   * @param input
   * @return CheckKubernetesConnectivityResponse
   */
  public CheckKubernetesConnectivityResponse checkKubernetesConnectivity(CheckKubernetesConnectivityRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling checkKubernetesConnectivity");
    }

    return this.invokeAPI("checkKubernetesConnectivity", "/api/v1/environments2/checkKubernetesConnectivity", input, new GenericType<CheckKubernetesConnectivityResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start FreeIPA diagnostics collection
   * @param input
   * @return CollectFreeipaDiagnosticsResponse
   */
  public CollectFreeipaDiagnosticsResponse collectFreeipaDiagnostics(CollectFreeipaDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling collectFreeipaDiagnostics");
    }

    return this.invokeAPI("collectFreeipaDiagnostics", "/api/v1/environments2/collectFreeipaDiagnostics", input, new GenericType<CollectFreeipaDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new AWS credential that can be attatched to an environment. The credential is used for authorization to provision resources such as compute instances within your cloud provider account.
   * @param input
   * @return CreateAWSCredentialResponse
   */
  public CreateAWSCredentialResponse createAWSCredential(CreateAWSCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAWSCredential");
    }

    return this.invokeAPI("createAWSCredential", "/api/v1/environments2/createAWSCredential", input, new GenericType<CreateAWSCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new AWS environment by providing the cloud provider access and network information. A FreeIPA server will be automatically provisioned when an environment is created.
   * @param input
   * @return CreateAWSEnvironmentResponse
   */
  public CreateAWSEnvironmentResponse createAWSEnvironment(CreateAWSEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAWSEnvironment");
    }

    return this.invokeAPI("createAWSEnvironment", "/api/v1/environments2/createAWSEnvironment", input, new GenericType<CreateAWSEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new AWS credential for GovCloud that can be attatched to an environment. The credential is used for authorization to provision resources such as compute instances within your cloud provider account.
   * @param input
   * @return CreateAWSGovCloudCredentialResponse
   */
  public CreateAWSGovCloudCredentialResponse createAWSGovCloudCredential(CreateAWSGovCloudCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAWSGovCloudCredential");
    }

    return this.invokeAPI("createAWSGovCloudCredential", "/api/v1/environments2/createAWSGovCloudCredential", input, new GenericType<CreateAWSGovCloudCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new AWS GovCloud environment by providing the cloud provider access and network information. A FreeIPA server will be automatically provisioned when an environment is created.
   * @param input
   * @return CreateAWSGovCloudEnvironmentResponse
   */
  public CreateAWSGovCloudEnvironmentResponse createAWSGovCloudEnvironment(CreateAWSGovCloudEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAWSGovCloudEnvironment");
    }

    return this.invokeAPI("createAWSGovCloudEnvironment", "/api/v1/environments2/createAWSGovCloudEnvironment", input, new GenericType<CreateAWSGovCloudEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new Azure credential that can be attached to an environment. The credential is used for authorization to provision resources such as compute instances within your cloud provider account.
   * @param input
   * @return CreateAzureCredentialResponse
   */
  public CreateAzureCredentialResponse createAzureCredential(CreateAzureCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAzureCredential");
    }

    return this.invokeAPI("createAzureCredential", "/api/v1/environments2/createAzureCredential", input, new GenericType<CreateAzureCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new Azure environment by providing the cloud provider access and network information. A FreeIPA server will be automatically provisioned when an environment is created.
   * @param input
   * @return CreateAzureEnvironmentResponse
   */
  public CreateAzureEnvironmentResponse createAzureEnvironment(CreateAzureEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAzureEnvironment");
    }

    return this.invokeAPI("createAzureEnvironment", "/api/v1/environments2/createAzureEnvironment", input, new GenericType<CreateAzureEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new GCP credential that can be attatched to an environment. The credential is used for authorization to provision resources such as compute instances within your cloud provider account.
   * @param input
   * @return CreateGCPCredentialResponse
   */
  public CreateGCPCredentialResponse createGCPCredential(CreateGCPCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createGCPCredential");
    }

    return this.invokeAPI("createGCPCredential", "/api/v1/environments2/createGCPCredential", input, new GenericType<CreateGCPCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new GCP environment by providing the cloud provider access and network information. A FreeIPA server will be automatically provisioned when an environment is created.
   * @param input
   * @return CreateGCPEnvironmentResponse
   */
  public CreateGCPEnvironmentResponse createGCPEnvironment(CreateGCPEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createGCPEnvironment");
    }

    return this.invokeAPI("createGCPEnvironment", "/api/v1/environments2/createGCPEnvironment", input, new GenericType<CreateGCPEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new Private Cloud environment by providing the Cloudera Manager address and credentials.
   * @param input
   * @return CreatePrivateEnvironmentResponse
   */
  public CreatePrivateEnvironmentResponse createPrivateEnvironment(CreatePrivateEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createPrivateEnvironment");
    }

    return this.invokeAPI("createPrivateEnvironment", "/api/v1/environments2/createPrivateEnvironment", input, new GenericType<CreatePrivateEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new proxy config that can be attatched to an environment.
   * @param input
   * @return CreateProxyConfigResponse
   */
  public CreateProxyConfigResponse createProxyConfig(CreateProxyConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createProxyConfig");
    }

    return this.invokeAPI("createProxyConfig", "/api/v1/environments2/createProxyConfig", input, new GenericType<CreateProxyConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes an audit credential.
   * @param input
   * @return DeleteAuditCredentialResponse
   */
  public DeleteAuditCredentialResponse deleteAuditCredential(DeleteAuditCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteAuditCredential");
    }

    return this.invokeAPI("deleteAuditCredential", "/api/v1/environments2/deleteAuditCredential", input, new GenericType<DeleteAuditCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a credential.
   * @param input
   * @return DeleteCredentialResponse
   */
  public DeleteCredentialResponse deleteCredential(DeleteCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteCredential");
    }

    return this.invokeAPI("deleteCredential", "/api/v1/environments2/deleteCredential", input, new GenericType<DeleteCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes an environment.
   * @param input
   * @return DeleteEnvironmentResponse
   */
  public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteEnvironment");
    }

    return this.invokeAPI("deleteEnvironment", "/api/v1/environments2/deleteEnvironment", input, new GenericType<DeleteEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a proxy config.
   * @param input
   * @return DeleteProxyConfigResponse
   */
  public DeleteProxyConfigResponse deleteProxyConfig(DeleteProxyConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteProxyConfig");
    }

    return this.invokeAPI("deleteProxyConfig", "/api/v1/environments2/deleteProxyConfig", input, new GenericType<DeleteProxyConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes an environment.
   * @param input
   * @return DescribeEnvironmentResponse
   */
  public DescribeEnvironmentResponse describeEnvironment(DescribeEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeEnvironment");
    }

    return this.invokeAPI("describeEnvironment", "/api/v1/environments2/describeEnvironment", input, new GenericType<DescribeEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Detach recipes from FreeIPA.
   * @param input
   * @return DetachFreeIpaRecipesResponse
   */
  public DetachFreeIpaRecipesResponse detachFreeIpaRecipes(DetachFreeIpaRecipesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling detachFreeIpaRecipes");
    }

    return this.invokeAPI("detachFreeIpaRecipes", "/api/v1/environments2/detachFreeIpaRecipes", input, new GenericType<DetachFreeIpaRecipesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Downscales FreeIPA instances.
   * @param input
   * @return DownscaleFreeipaResponse
   */
  public DownscaleFreeipaResponse downscaleFreeipa(DownscaleFreeipaRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling downscaleFreeipa");
    }

    return this.invokeAPI("downscaleFreeipa", "/api/v1/environments2/downscaleFreeipa", input, new GenericType<DownscaleFreeipaResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get account level telemetry settings. (telemetry features and anonymization rules)
   * @param input
   * @return GetAccountTelemetryResponse
   */
  public GetAccountTelemetryResponse getAccountTelemetry(GetAccountTelemetryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAccountTelemetry");
    }

    return this.invokeAPI("getAccountTelemetry", "/api/v1/environments2/getAccountTelemetry", input, new GenericType<GetAccountTelemetryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get default account level telemetry settings. Helps to set back the default values.
   * @param input
   * @return GetAccountTelemetryDefaultResponse
   */
  public GetAccountTelemetryDefaultResponse getAccountTelemetryDefault(GetAccountTelemetryDefaultRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAccountTelemetryDefault");
    }

    return this.invokeAPI("getAccountTelemetryDefault", "/api/v1/environments2/getAccountTelemetryDefault", input, new GenericType<GetAccountTelemetryDefaultResponse>(){}, NO_EXTENSION);
  }

  /**
   * This API provides the audit credential prerequisites for the given cloud provider.
   * @param input
   * @return GetAuditCredentialPrerequisitesResponse
   */
  public GetAuditCredentialPrerequisitesResponse getAuditCredentialPrerequisites(GetAuditCredentialPrerequisitesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAuditCredentialPrerequisites");
    }

    return this.invokeAPI("getAuditCredentialPrerequisites", "/api/v1/environments2/getAuditCredentialPrerequisites", input, new GenericType<GetAuditCredentialPrerequisitesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets account level Azure Marketplace image policy. CDP is capable to automatically accept Azure Marketplace image terms during cluster deployment. You can use this setting in your account to opt in or opt out this behaviour.
   * @param input
   * @return GetAzureImageTermsPolicyResponse
   */
  public GetAzureImageTermsPolicyResponse getAzureImageTermsPolicy(GetAzureImageTermsPolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAzureImageTermsPolicy");
    }

    return this.invokeAPI("getAzureImageTermsPolicy", "/api/v1/environments2/getAzureImageTermsPolicy", input, new GenericType<GetAzureImageTermsPolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * This API provides the credential prerequisites for the given cloud provider.
   * @param input
   * @return GetCredentialPrerequisitesResponse
   */
  public GetCredentialPrerequisitesResponse getCredentialPrerequisites(GetCredentialPrerequisitesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getCredentialPrerequisites");
    }

    return this.invokeAPI("getCredentialPrerequisites", "/api/v1/environments2/getCredentialPrerequisites", input, new GenericType<GetCredentialPrerequisitesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Read a configuration setting from the environment service.
   * @param input
   * @return GetEnvironmentSettingResponse
   */
  public GetEnvironmentSettingResponse getEnvironmentSetting(GetEnvironmentSettingRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getEnvironmentSetting");
    }

    return this.invokeAPI("getEnvironmentSetting", "/api/v1/environments2/getEnvironmentSetting", input, new GenericType<GetEnvironmentSettingResponse>(){}, NO_EXTENSION);
  }

  /**
   * Returns the user synchronization state for an environment.
   * @param input
   * @return GetEnvironmentUserSyncStateResponse
   */
  public GetEnvironmentUserSyncStateResponse getEnvironmentUserSyncState(GetEnvironmentUserSyncStateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getEnvironmentUserSyncState");
    }

    return this.invokeAPI("getEnvironmentUserSyncState", "/api/v1/environments2/getEnvironmentUserSyncState", input, new GenericType<GetEnvironmentUserSyncStateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gather log descriptors that are used for diagnostics collection.
   * @param input
   * @return GetFreeipaLogDescriptorsResponse
   */
  public GetFreeipaLogDescriptorsResponse getFreeipaLogDescriptors(GetFreeipaLogDescriptorsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getFreeipaLogDescriptors");
    }

    return this.invokeAPI("getFreeipaLogDescriptors", "/api/v1/environments2/getFreeipaLogDescriptors", input, new GenericType<GetFreeipaLogDescriptorsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the status of the FreeIPA services
   * @param input
   * @return GetFreeipaStatusResponse
   */
  public GetFreeipaStatusResponse getFreeipaStatus(GetFreeipaStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getFreeipaStatus");
    }

    return this.invokeAPI("getFreeipaStatus", "/api/v1/environments2/getFreeipaStatus", input, new GenericType<GetFreeipaStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get available images for FreeIPA upgrade.
   * @param input
   * @return GetFreeipaUpgradeOptionsResponse
   */
  public GetFreeipaUpgradeOptionsResponse getFreeipaUpgradeOptions(GetFreeipaUpgradeOptionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getFreeipaUpgradeOptions");
    }

    return this.invokeAPI("getFreeipaUpgradeOptions", "/api/v1/environments2/getFreeipaUpgradeOptions", input, new GenericType<GetFreeipaUpgradeOptionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * This API provides the audit credential prerequisites for GovCloud for the enabled providers.
   * @param input
   * @return GetGovCloudAuditCredentialPrerequisitesResponse
   */
  public GetGovCloudAuditCredentialPrerequisitesResponse getGovCloudAuditCredentialPrerequisites(GetGovCloudAuditCredentialPrerequisitesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getGovCloudAuditCredentialPrerequisites");
    }

    return this.invokeAPI("getGovCloudAuditCredentialPrerequisites", "/api/v1/environments2/getGovCloudAuditCredentialPrerequisites", input, new GenericType<GetGovCloudAuditCredentialPrerequisitesResponse>(){}, NO_EXTENSION);
  }

  /**
   * This API provides the credential prerequisites for GovCloud for the enabled providers.
   * @param input
   * @return GetGovCloudCredentialPrerequisitesResponse
   */
  public GetGovCloudCredentialPrerequisitesResponse getGovCloudCredentialPrerequisites(GetGovCloudCredentialPrerequisitesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getGovCloudCredentialPrerequisites");
    }

    return this.invokeAPI("getGovCloudCredentialPrerequisites", "/api/v1/environments2/getGovCloudCredentialPrerequisites", input, new GenericType<GetGovCloudCredentialPrerequisitesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets all ID Broker mappings for an environment.
   * @param input
   * @return GetIdBrokerMappingsResponse
   */
  public GetIdBrokerMappingsResponse getIdBrokerMappings(GetIdBrokerMappingsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getIdBrokerMappings");
    }

    return this.invokeAPI("getIdBrokerMappings", "/api/v1/environments2/getIdBrokerMappings", input, new GenericType<GetIdBrokerMappingsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets ID Broker mappings sync status.
   * @param input
   * @return GetIdBrokerMappingsSyncStatusResponse
   */
  public GetIdBrokerMappingsSyncStatusResponse getIdBrokerMappingsSyncStatus(GetIdBrokerMappingsSyncStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getIdBrokerMappingsSyncStatus");
    }

    return this.invokeAPI("getIdBrokerMappingsSyncStatus", "/api/v1/environments2/getIdBrokerMappingsSyncStatus", input, new GenericType<GetIdBrokerMappingsSyncStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retrieves a keytab for a user or machine user.
   * @param input
   * @return GetKeytabResponse
   */
  public GetKeytabResponse getKeytab(GetKeytabRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getKeytab");
    }

    return this.invokeAPI("getKeytab", "/api/v1/environments2/getKeytab", input, new GenericType<GetKeytabResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the latest (in progress or finished) operation for the environment resource.
   * @param input
   * @return GetOperationResponse
   */
  public GetOperationResponse getOperation(GetOperationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getOperation");
    }

    return this.invokeAPI("getOperation", "/api/v1/environments2/getOperation", input, new GenericType<GetOperationResponse>(){}, NO_EXTENSION);
  }

  /**
   * Returns status of the repair operation for the operation id.
   * @param input
   * @return GetRepairFreeipaStatusResponse
   */
  public GetRepairFreeipaStatusResponse getRepairFreeipaStatus(GetRepairFreeipaStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getRepairFreeipaStatus");
    }

    return this.invokeAPI("getRepairFreeipaStatus", "/api/v1/environments2/getRepairFreeipaStatus", input, new GenericType<GetRepairFreeipaStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * This API provides contents of public certificate for an environment.
   * @param input
   * @return GetRootCertificateResponse
   */
  public GetRootCertificateResponse getRootCertificate(GetRootCertificateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getRootCertificate");
    }

    return this.invokeAPI("getRootCertificate", "/api/v1/environments2/getRootCertificate", input, new GenericType<GetRootCertificateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Initialize compute cluster for AWS environment.
   * @param input
   * @return InitializeAWSComputeClusterResponse
   */
  public InitializeAWSComputeClusterResponse initializeAWSComputeCluster(InitializeAWSComputeClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling initializeAWSComputeCluster");
    }

    return this.invokeAPI("initializeAWSComputeCluster", "/api/v1/environments2/initializeAWSComputeCluster", input, new GenericType<InitializeAWSComputeClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Initialize compute cluster for Azure environment.
   * @param input
   * @return InitializeAzureComputeClusterResponse
   */
  public InitializeAzureComputeClusterResponse initializeAzureComputeCluster(InitializeAzureComputeClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling initializeAzureComputeCluster");
    }

    return this.invokeAPI("initializeAzureComputeCluster", "/api/v1/environments2/initializeAzureComputeCluster", input, new GenericType<InitializeAzureComputeClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Returns status of the sync operation for the environment crn.
   * @param input
   * @return LastSyncStatusResponse
   */
  public LastSyncStatusResponse lastSyncStatus(LastSyncStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling lastSyncStatus");
    }

    return this.invokeAPI("lastSyncStatus", "/api/v1/environments2/lastSyncStatus", input, new GenericType<LastSyncStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists audit credentials.
   * @param input
   * @return ListAuditCredentialsResponse
   */
  public ListAuditCredentialsResponse listAuditCredentials(ListAuditCredentialsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listAuditCredentials");
    }

    return this.invokeAPI("listAuditCredentials", "/api/v1/environments2/listAuditCredentials", input, new GenericType<ListAuditCredentialsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Returns the list of Data Services and their cluster names that are attached the given environment.
   * @param input
   * @return ListConnectedDataServicesResponse
   */
  public ListConnectedDataServicesResponse listConnectedDataServices(ListConnectedDataServicesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listConnectedDataServices");
    }

    return this.invokeAPI("listConnectedDataServices", "/api/v1/environments2/listConnectedDataServices", input, new GenericType<ListConnectedDataServicesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists credentials.
   * @param input
   * @return ListCredentialsResponse
   */
  public ListCredentialsResponse listCredentials(ListCredentialsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listCredentials");
    }

    return this.invokeAPI("listCredentials", "/api/v1/environments2/listCredentials", input, new GenericType<ListCredentialsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists environments.
   * @param input
   * @return ListEnvironmentsResponse
   */
  public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listEnvironments");
    }

    return this.invokeAPI("listEnvironments", "/api/v1/environments2/listEnvironments", input, new GenericType<ListEnvironmentsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List recent FreeIPA diagnostics collections
   * @param input
   * @return ListFreeipaDiagnosticsResponse
   */
  public ListFreeipaDiagnosticsResponse listFreeipaDiagnostics(ListFreeipaDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listFreeipaDiagnostics");
    }

    return this.invokeAPI("listFreeipaDiagnostics", "/api/v1/environments2/listFreeipaDiagnostics", input, new GenericType<ListFreeipaDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists proxy configs.
   * @param input
   * @return ListProxyConfigsResponse
   */
  public ListProxyConfigsResponse listProxyConfigs(ListProxyConfigsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listProxyConfigs");
    }

    return this.invokeAPI("listProxyConfigs", "/api/v1/environments2/listProxyConfigs", input, new GenericType<ListProxyConfigsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Repairs the FreeIPA nodes.
   * @param input
   * @return RepairFreeipaResponse
   */
  public RepairFreeipaResponse repairFreeipa(RepairFreeipaRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling repairFreeipa");
    }

    return this.invokeAPI("repairFreeipa", "/api/v1/environments2/repairFreeipa", input, new GenericType<RepairFreeipaResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retries the last failed operation on a FreeIPA.
   * @param input
   * @return RetryFreeipaResponse
   */
  public RetryFreeipaResponse retryFreeipa(RetryFreeipaRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling retryFreeipa");
    }

    return this.invokeAPI("retryFreeipa", "/api/v1/environments2/retryFreeipa", input, new GenericType<RetryFreeipaResponse>(){}, NO_EXTENSION);
  }

  /**
   * Rotate SaltStack user password on FreeIPA instances.
   * @param input
   * @return RotateSaltPasswordResponse
   */
  public RotateSaltPasswordResponse rotateSaltPassword(RotateSaltPasswordRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling rotateSaltPassword");
    }

    return this.invokeAPI("rotateSaltPassword", "/api/v1/environments2/rotateSaltPassword", input, new GenericType<RotateSaltPasswordResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates or updates the AWS audit credential for the account. The credential is used for authorization to archive audit events to your cloud storage.
   * @param input
   * @return SetAWSAuditCredentialResponse
   */
  public SetAWSAuditCredentialResponse setAWSAuditCredential(SetAWSAuditCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setAWSAuditCredential");
    }

    return this.invokeAPI("setAWSAuditCredential", "/api/v1/environments2/setAWSAuditCredential", input, new GenericType<SetAWSAuditCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates or updates the AWS GovCloud audit credential for the account. The credential is used for authorization to archive audit events to your cloud storage.
   * @param input
   * @return SetAWSGovCloudAuditCredentialResponse
   */
  public SetAWSGovCloudAuditCredentialResponse setAWSGovCloudAuditCredential(SetAWSGovCloudAuditCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setAWSGovCloudAuditCredential");
    }

    return this.invokeAPI("setAWSGovCloudAuditCredential", "/api/v1/environments2/setAWSGovCloudAuditCredential", input, new GenericType<SetAWSGovCloudAuditCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Set account level telemetry settings. (telemetry features and anonymization rules)
   * @param input
   * @return SetAccountTelemetryResponse
   */
  public SetAccountTelemetryResponse setAccountTelemetry(SetAccountTelemetryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setAccountTelemetry");
    }

    return this.invokeAPI("setAccountTelemetry", "/api/v1/environments2/setAccountTelemetry", input, new GenericType<SetAccountTelemetryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates or updates the Azure audit credential for the account. The credential is used for authorization to archive audit events to your cloud storage.
   * @param input
   * @return SetAzureAuditCredentialResponse
   */
  public SetAzureAuditCredentialResponse setAzureAuditCredential(SetAzureAuditCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setAzureAuditCredential");
    }

    return this.invokeAPI("setAzureAuditCredential", "/api/v1/environments2/setAzureAuditCredential", input, new GenericType<SetAzureAuditCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Sets a catalog for a FreeIPA installation.
   * @param input
   * @return SetCatalogResponse
   */
  public SetCatalogResponse setCatalog(SetCatalogRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setCatalog");
    }

    return this.invokeAPI("setCatalog", "/api/v1/environments2/setCatalog", input, new GenericType<SetCatalogResponse>(){}, NO_EXTENSION);
  }

  /**
   * Sets endpoint access gateway settings for the environment.
   * @param input
   * @return SetEndpointAccessGatewayResponse
   */
  public SetEndpointAccessGatewayResponse setEndpointAccessGateway(SetEndpointAccessGatewayRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setEndpointAccessGateway");
    }

    return this.invokeAPI("setEndpointAccessGateway", "/api/v1/environments2/setEndpointAccessGateway", input, new GenericType<SetEndpointAccessGatewayResponse>(){}, NO_EXTENSION);
  }

  /**
   * Read a configuration setting from the environment service.
   * @param input
   * @return SetEnvironmentSettingResponse
   */
  public SetEnvironmentSettingResponse setEnvironmentSetting(SetEnvironmentSettingRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setEnvironmentSetting");
    }

    return this.invokeAPI("setEnvironmentSetting", "/api/v1/environments2/setEnvironmentSetting", input, new GenericType<SetEnvironmentSettingResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates or updates the GCP audit credential for the account. The credential is used for authorization to archive audit events to your cloud storage.
   * @param input
   * @return SetGCPAuditCredentialResponse
   */
  public SetGCPAuditCredentialResponse setGCPAuditCredential(SetGCPAuditCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setGCPAuditCredential");
    }

    return this.invokeAPI("setGCPAuditCredential", "/api/v1/environments2/setGCPAuditCredential", input, new GenericType<SetGCPAuditCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Sets all ID Broker mappings for an environment.
   * @param input
   * @return SetIdBrokerMappingsResponse
   */
  public SetIdBrokerMappingsResponse setIdBrokerMappings(SetIdBrokerMappingsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setIdBrokerMappings");
    }

    return this.invokeAPI("setIdBrokerMappings", "/api/v1/environments2/setIdBrokerMappings", input, new GenericType<SetIdBrokerMappingsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Sets workload user&#39;s password and updates into all environments.
   * @param input
   * @return SetPasswordResponse
   */
  @Deprecated
  public SetPasswordResponse setPassword(SetPasswordRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setPassword");
    }

    return this.invokeAPI("setPassword", "/api/v1/environments2/setPassword", input, new GenericType<SetPasswordResponse>(){}, NO_EXTENSION);
  }

  /**
   * Configure environment level telemetry feature setting.
   * @param input
   * @return SetTelemetryFeaturesResponse
   */
  public SetTelemetryFeaturesResponse setTelemetryFeatures(SetTelemetryFeaturesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setTelemetryFeatures");
    }

    return this.invokeAPI("setTelemetryFeatures", "/api/v1/environments2/setTelemetryFeatures", input, new GenericType<SetTelemetryFeaturesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start an environment.
   * @param input
   * @return StartEnvironmentResponse
   */
  public StartEnvironmentResponse startEnvironment(StartEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startEnvironment");
    }

    return this.invokeAPI("startEnvironment", "/api/v1/environments2/startEnvironment", input, new GenericType<StartEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Initiates the vertical scaling on FreeIPA.
   * @param input
   * @return StartFreeIpaVerticalScalingResponse
   */
  public StartFreeIpaVerticalScalingResponse startFreeIpaVerticalScaling(StartFreeIpaVerticalScalingRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startFreeIpaVerticalScaling");
    }

    return this.invokeAPI("startFreeIpaVerticalScaling", "/api/v1/environments2/startFreeIpaVerticalScaling", input, new GenericType<StartFreeIpaVerticalScalingResponse>(){}, NO_EXTENSION);
  }

  /**
   * Stop an environment.
   * @param input
   * @return StopEnvironmentResponse
   */
  public StopEnvironmentResponse stopEnvironment(StopEnvironmentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling stopEnvironment");
    }

    return this.invokeAPI("stopEnvironment", "/api/v1/environments2/stopEnvironment", input, new GenericType<StopEnvironmentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Synchronizes environments with all users and groups state with CDP.
   * @param input
   * @return SyncAllUsersResponse
   */
  public SyncAllUsersResponse syncAllUsers(SyncAllUsersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling syncAllUsers");
    }

    return this.invokeAPI("syncAllUsers", "/api/v1/environments2/syncAllUsers", input, new GenericType<SyncAllUsersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Syncs all ID Broker mappings for an environment.
   * @param input
   * @return SyncIdBrokerMappingsResponse
   */
  public SyncIdBrokerMappingsResponse syncIdBrokerMappings(SyncIdBrokerMappingsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling syncIdBrokerMappings");
    }

    return this.invokeAPI("syncIdBrokerMappings", "/api/v1/environments2/syncIdBrokerMappings", input, new GenericType<SyncIdBrokerMappingsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Returns status of the sync operation for the operation id.
   * @param input
   * @return SyncStatusResponse
   */
  public SyncStatusResponse syncStatus(SyncStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling syncStatus");
    }

    return this.invokeAPI("syncStatus", "/api/v1/environments2/syncStatus", input, new GenericType<SyncStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Synchronizes environments with single user to the FreeIPA servers.
   * @param input
   * @return SyncUserResponse
   */
  public SyncUserResponse syncUser(SyncUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling syncUser");
    }

    return this.invokeAPI("syncUser", "/api/v1/environments2/syncUser", input, new GenericType<SyncUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Test anonymization rules (for account telemetry) against text input.
   * @param input
   * @return TestAccountTelemetryRulesResponse
   */
  public TestAccountTelemetryRulesResponse testAccountTelemetryRules(TestAccountTelemetryRulesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling testAccountTelemetryRules");
    }

    return this.invokeAPI("testAccountTelemetryRules", "/api/v1/environments2/testAccountTelemetryRules", input, new GenericType<TestAccountTelemetryRulesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates an AWS credential that can be attached to an environment. The credential is used for authorization to provision resources such as compute instances within your cloud provider account.
   * @param input
   * @return UpdateAwsCredentialResponse
   */
  public UpdateAwsCredentialResponse updateAwsCredential(UpdateAwsCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAwsCredential");
    }

    return this.invokeAPI("updateAwsCredential", "/api/v1/environments2/updateAwsCredential", input, new GenericType<UpdateAwsCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the AWS encryption key ARN for the environment.
   * @param input
   * @return UpdateAwsDiskEncryptionParametersResponse
   */
  public UpdateAwsDiskEncryptionParametersResponse updateAwsDiskEncryptionParameters(UpdateAwsDiskEncryptionParametersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAwsDiskEncryptionParameters");
    }

    return this.invokeAPI("updateAwsDiskEncryptionParameters", "/api/v1/environments2/updateAwsDiskEncryptionParameters", input, new GenericType<UpdateAwsDiskEncryptionParametersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the Availability Zones for the Azure environment.
   * @param input
   * @return UpdateAzureAvailabilityZonesResponse
   */
  public UpdateAzureAvailabilityZonesResponse updateAzureAvailabilityZones(UpdateAzureAvailabilityZonesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAzureAvailabilityZones");
    }

    return this.invokeAPI("updateAzureAvailabilityZones", "/api/v1/environments2/updateAzureAvailabilityZones", input, new GenericType<UpdateAzureAvailabilityZonesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates a new certificate based Azure credential that can be attached to an environment. The credential is used for authorization to provision resources such as compute instances within your cloud provider account.
   * @param input
   * @return UpdateAzureCredentialResponse
   */
  public UpdateAzureCredentialResponse updateAzureCredential(UpdateAzureCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAzureCredential");
    }

    return this.invokeAPI("updateAzureCredential", "/api/v1/environments2/updateAzureCredential", input, new GenericType<UpdateAzureCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the Azure database resources for the environment.
   * @param input
   * @return UpdateAzureDatabaseResourcesResponse
   */
  public UpdateAzureDatabaseResourcesResponse updateAzureDatabaseResources(UpdateAzureDatabaseResourcesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAzureDatabaseResources");
    }

    return this.invokeAPI("updateAzureDatabaseResources", "/api/v1/environments2/updateAzureDatabaseResources", input, new GenericType<UpdateAzureDatabaseResourcesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the Azure encryption resources for the environment.
   * @param input
   * @return UpdateAzureEncryptionResourcesResponse
   */
  public UpdateAzureEncryptionResourcesResponse updateAzureEncryptionResources(UpdateAzureEncryptionResourcesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAzureEncryptionResources");
    }

    return this.invokeAPI("updateAzureEncryptionResources", "/api/v1/environments2/updateAzureEncryptionResources", input, new GenericType<UpdateAzureEncryptionResourcesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates account level Azure Marketplace image policy. CDP is capable to automatically accept Azure Marketplace image terms during cluster deployment. You can use this setting in your account to opt in or opt out this behaviour.
   * @param input
   * @return UpdateAzureImageTermsPolicyResponse
   */
  public UpdateAzureImageTermsPolicyResponse updateAzureImageTermsPolicy(UpdateAzureImageTermsPolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAzureImageTermsPolicy");
    }

    return this.invokeAPI("updateAzureImageTermsPolicy", "/api/v1/environments2/updateAzureImageTermsPolicy", input, new GenericType<UpdateAzureImageTermsPolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates custom docker registry CRN of an environment.
   * @param input
   * @return UpdateCustomDockerRegistryResponse
   */
  public UpdateCustomDockerRegistryResponse updateCustomDockerRegistry(UpdateCustomDockerRegistryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateCustomDockerRegistry");
    }

    return this.invokeAPI("updateCustomDockerRegistry", "/api/v1/environments2/updateCustomDockerRegistry", input, new GenericType<UpdateCustomDockerRegistryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates Data Service resources of an environment.
   * @param input
   * @return UpdateDataServiceResourcesResponse
   */
  public UpdateDataServiceResourcesResponse updateDataServiceResources(UpdateDataServiceResourcesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateDataServiceResources");
    }

    return this.invokeAPI("updateDataServiceResources", "/api/v1/environments2/updateDataServiceResources", input, new GenericType<UpdateDataServiceResourcesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates FreeIPA AWS cluster to use IMDSv1.
   * @param input
   * @return UpdateFreeipaToAwsImdsV1Response
   */
  public UpdateFreeipaToAwsImdsV1Response updateFreeipaToAwsImdsV1(UpdateFreeipaToAwsImdsV1Request input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateFreeipaToAwsImdsV1");
    }

    return this.invokeAPI("updateFreeipaToAwsImdsV1", "/api/v1/environments2/updateFreeipaToAwsImdsV1", input, new GenericType<UpdateFreeipaToAwsImdsV1Response>(){}, NO_EXTENSION);
  }

  /**
   * Updates FreeIPA AWS cluster to use IMDSv2.
   * @param input
   * @return UpdateFreeipaToAwsImdsV2Response
   */
  public UpdateFreeipaToAwsImdsV2Response updateFreeipaToAwsImdsV2(UpdateFreeipaToAwsImdsV2Request input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateFreeipaToAwsImdsV2");
    }

    return this.invokeAPI("updateFreeipaToAwsImdsV2", "/api/v1/environments2/updateFreeipaToAwsImdsV2", input, new GenericType<UpdateFreeipaToAwsImdsV2Response>(){}, NO_EXTENSION);
  }

  /**
   * Run orchestrator engine state update on the FreeIPA cluster.
   * @param input
   * @return UpdateOrchestratorStateResponse
   */
  public UpdateOrchestratorStateResponse updateOrchestratorState(UpdateOrchestratorStateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateOrchestratorState");
    }

    return this.invokeAPI("updateOrchestratorState", "/api/v1/environments2/updateOrchestratorState", input, new GenericType<UpdateOrchestratorStateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates the proxy config of the given environment.
   * @param input
   * @return UpdateProxyConfigResponse
   */
  public UpdateProxyConfigResponse updateProxyConfig(UpdateProxyConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateProxyConfig");
    }

    return this.invokeAPI("updateProxyConfig", "/api/v1/environments2/updateProxyConfig", input, new GenericType<UpdateProxyConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates the security access settings of the given environment.
   * @param input
   * @return UpdateSecurityAccessResponse
   */
  public UpdateSecurityAccessResponse updateSecurityAccess(UpdateSecurityAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateSecurityAccess");
    }

    return this.invokeAPI("updateSecurityAccess", "/api/v1/environments2/updateSecurityAccess", input, new GenericType<UpdateSecurityAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates the designated SSH key for the given environment.
   * @param input
   * @return UpdateSshKeyResponse
   */
  public UpdateSshKeyResponse updateSshKey(UpdateSshKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateSshKey");
    }

    return this.invokeAPI("updateSshKey", "/api/v1/environments2/updateSshKey", input, new GenericType<UpdateSshKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates the subnet(s) of the given environment.
   * @param input
   * @return UpdateSubnetResponse
   */
  public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateSubnet");
    }

    return this.invokeAPI("updateSubnet", "/api/v1/environments2/updateSubnet", input, new GenericType<UpdateSubnetResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades Cluster Connectivity Manager on the environment to the latest available version.
   * @param input
   * @return UpgradeCcmResponse
   */
  public UpgradeCcmResponse upgradeCcm(UpgradeCcmRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeCcm");
    }

    return this.invokeAPI("upgradeCcm", "/api/v1/environments2/upgradeCcm", input, new GenericType<UpgradeCcmResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades FreeIPA to the latest or defined image.
   * @param input
   * @return UpgradeFreeipaResponse
   */
  public UpgradeFreeipaResponse upgradeFreeipa(UpgradeFreeipaRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeFreeipa");
    }

    return this.invokeAPI("upgradeFreeipa", "/api/v1/environments2/upgradeFreeipa", input, new GenericType<UpgradeFreeipaResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upscales FreeIPA instances.
   * @param input
   * @return UpscaleFreeipaResponse
   */
  public UpscaleFreeipaResponse upscaleFreeipa(UpscaleFreeipaRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upscaleFreeipa");
    }

    return this.invokeAPI("upscaleFreeipa", "/api/v1/environments2/upscaleFreeipa", input, new GenericType<UpscaleFreeipaResponse>(){}, NO_EXTENSION);
  }

  /**
   * Validates AWS cloud storage settings of the given environment.
   * @param input
   * @return ValidateAwsCloudStorageResponse
   */
  public ValidateAwsCloudStorageResponse validateAwsCloudStorage(ValidateAwsCloudStorageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling validateAwsCloudStorage");
    }

    return this.invokeAPI("validateAwsCloudStorage", "/api/v1/environments2/validateAwsCloudStorage", input, new GenericType<ValidateAwsCloudStorageResponse>(){}, NO_EXTENSION);
  }

  /**
   * Validates Azure cloud storage settings of the given environment.
   * @param input
   * @return ValidateAzureCloudStorageResponse
   */
  public ValidateAzureCloudStorageResponse validateAzureCloudStorage(ValidateAzureCloudStorageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling validateAzureCloudStorage");
    }

    return this.invokeAPI("validateAzureCloudStorage", "/api/v1/environments2/validateAzureCloudStorage", input, new GenericType<ValidateAzureCloudStorageResponse>(){}, NO_EXTENSION);
  }
}
