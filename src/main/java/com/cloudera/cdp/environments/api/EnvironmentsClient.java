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

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.environments.model.ChangeEnvironmentCredentialRequest;
import com.cloudera.cdp.environments.model.ChangeEnvironmentCredentialResponse;
import com.cloudera.cdp.environments.model.CreateAWSCredentialRequest;
import com.cloudera.cdp.environments.model.CreateAWSCredentialResponse;
import com.cloudera.cdp.environments.model.CreateAWSEnvironmentRequest;
import com.cloudera.cdp.environments.model.CreateAWSEnvironmentResponse;
import com.cloudera.cdp.environments.model.CreateAzureCredentialRequest;
import com.cloudera.cdp.environments.model.CreateAzureCredentialResponse;
import com.cloudera.cdp.environments.model.CreateAzureEnvironmentRequest;
import com.cloudera.cdp.environments.model.CreateAzureEnvironmentResponse;
import com.cloudera.cdp.environments.model.CreateProxyConfigRequest;
import com.cloudera.cdp.environments.model.CreateProxyConfigResponse;
import com.cloudera.cdp.environments.model.DeleteCredentialRequest;
import com.cloudera.cdp.environments.model.DeleteCredentialResponse;
import com.cloudera.cdp.environments.model.DeleteEnvironmentRequest;
import com.cloudera.cdp.environments.model.DeleteEnvironmentResponse;
import com.cloudera.cdp.environments.model.DeleteProxyConfigRequest;
import com.cloudera.cdp.environments.model.DeleteProxyConfigResponse;
import com.cloudera.cdp.environments.model.DescribeEnvironmentRequest;
import com.cloudera.cdp.environments.model.DescribeEnvironmentResponse;
import com.cloudera.cdp.environments.model.Error;
import com.cloudera.cdp.environments.model.GetAccountTelemetryDefaultRequest;
import com.cloudera.cdp.environments.model.GetAccountTelemetryDefaultResponse;
import com.cloudera.cdp.environments.model.GetAccountTelemetryRequest;
import com.cloudera.cdp.environments.model.GetAccountTelemetryResponse;
import com.cloudera.cdp.environments.model.GetAuditCredentialPrerequisitesRequest;
import com.cloudera.cdp.environments.model.GetAuditCredentialPrerequisitesResponse;
import com.cloudera.cdp.environments.model.GetCredentialPrerequisitesRequest;
import com.cloudera.cdp.environments.model.GetCredentialPrerequisitesResponse;
import com.cloudera.cdp.environments.model.GetFreeipaStatusRequest;
import com.cloudera.cdp.environments.model.GetFreeipaStatusResponse;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsRequest;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsResponse;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsSyncStatusRequest;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsSyncStatusResponse;
import com.cloudera.cdp.environments.model.GetKeytabRequest;
import com.cloudera.cdp.environments.model.GetKeytabResponse;
import com.cloudera.cdp.environments.model.GetRepairFreeipaStatusRequest;
import com.cloudera.cdp.environments.model.GetRepairFreeipaStatusResponse;
import com.cloudera.cdp.environments.model.GetRootCertificateRequest;
import com.cloudera.cdp.environments.model.GetRootCertificateResponse;
import com.cloudera.cdp.environments.model.ListAuditCredentialsRequest;
import com.cloudera.cdp.environments.model.ListAuditCredentialsResponse;
import com.cloudera.cdp.environments.model.ListCredentialsRequest;
import com.cloudera.cdp.environments.model.ListCredentialsResponse;
import com.cloudera.cdp.environments.model.ListEnvironmentsRequest;
import com.cloudera.cdp.environments.model.ListEnvironmentsResponse;
import com.cloudera.cdp.environments.model.ListProxyConfigsRequest;
import com.cloudera.cdp.environments.model.ListProxyConfigsResponse;
import com.cloudera.cdp.environments.model.RepairFreeipaRequest;
import com.cloudera.cdp.environments.model.RepairFreeipaResponse;
import com.cloudera.cdp.environments.model.SetAWSAuditCredentialRequest;
import com.cloudera.cdp.environments.model.SetAWSAuditCredentialResponse;
import com.cloudera.cdp.environments.model.SetAccountTelemetryRequest;
import com.cloudera.cdp.environments.model.SetAccountTelemetryResponse;
import com.cloudera.cdp.environments.model.SetAzureAuditCredentialRequest;
import com.cloudera.cdp.environments.model.SetAzureAuditCredentialResponse;
import com.cloudera.cdp.environments.model.SetIdBrokerMappingsRequest;
import com.cloudera.cdp.environments.model.SetIdBrokerMappingsResponse;
import com.cloudera.cdp.environments.model.SetPasswordRequest;
import com.cloudera.cdp.environments.model.SetPasswordResponse;
import com.cloudera.cdp.environments.model.SetTelemetryFeaturesRequest;
import com.cloudera.cdp.environments.model.SetTelemetryFeaturesResponse;
import com.cloudera.cdp.environments.model.StartEnvironmentRequest;
import com.cloudera.cdp.environments.model.StartEnvironmentResponse;
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

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-10-13T09:35:49.151-07:00")
public class EnvironmentsClient extends CdpClient {

  public static final String SERVICE_NAME = "api";

  public EnvironmentsClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
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
    return this.invokeAPI("/api/v1/environments2/changeEnvironmentCredential", input, new GenericType<ChangeEnvironmentCredentialResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/createAWSCredential", input, new GenericType<CreateAWSCredentialResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/createAWSEnvironment", input, new GenericType<CreateAWSEnvironmentResponse>(){});
  }

  /**
   * Creates a new Azure credential that can be attatched to an environment. The credential is used for authorization to provision resources such as compute instances within your cloud provider account.
   * @param input
   * @return CreateAzureCredentialResponse
   */
  public CreateAzureCredentialResponse createAzureCredential(CreateAzureCredentialRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling createAzureCredential");
     }
    return this.invokeAPI("/api/v1/environments2/createAzureCredential", input, new GenericType<CreateAzureCredentialResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/createAzureEnvironment", input, new GenericType<CreateAzureEnvironmentResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/createProxyConfig", input, new GenericType<CreateProxyConfigResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/deleteCredential", input, new GenericType<DeleteCredentialResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/deleteEnvironment", input, new GenericType<DeleteEnvironmentResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/deleteProxyConfig", input, new GenericType<DeleteProxyConfigResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/describeEnvironment", input, new GenericType<DescribeEnvironmentResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getAccountTelemetry", input, new GenericType<GetAccountTelemetryResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getAccountTelemetryDefault", input, new GenericType<GetAccountTelemetryDefaultResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getAuditCredentialPrerequisites", input, new GenericType<GetAuditCredentialPrerequisitesResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getCredentialPrerequisites", input, new GenericType<GetCredentialPrerequisitesResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getFreeipaStatus", input, new GenericType<GetFreeipaStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getIdBrokerMappings", input, new GenericType<GetIdBrokerMappingsResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getIdBrokerMappingsSyncStatus", input, new GenericType<GetIdBrokerMappingsSyncStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getKeytab", input, new GenericType<GetKeytabResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getRepairFreeipaStatus", input, new GenericType<GetRepairFreeipaStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/getRootCertificate", input, new GenericType<GetRootCertificateResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/listAuditCredentials", input, new GenericType<ListAuditCredentialsResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/listCredentials", input, new GenericType<ListCredentialsResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/listEnvironments", input, new GenericType<ListEnvironmentsResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/listProxyConfigs", input, new GenericType<ListProxyConfigsResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/repairFreeipa", input, new GenericType<RepairFreeipaResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/setAWSAuditCredential", input, new GenericType<SetAWSAuditCredentialResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/setAccountTelemetry", input, new GenericType<SetAccountTelemetryResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/setAzureAuditCredential", input, new GenericType<SetAzureAuditCredentialResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/setIdBrokerMappings", input, new GenericType<SetIdBrokerMappingsResponse>(){});
  }

  /**
   * Sets workload user&#39;s password and updates into all environments.
   * @param input
   * @return SetPasswordResponse
   */
  public SetPasswordResponse setPassword(SetPasswordRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling setPassword");
     }
    return this.invokeAPI("/api/v1/environments2/setPassword", input, new GenericType<SetPasswordResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/setTelemetryFeatures", input, new GenericType<SetTelemetryFeaturesResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/startEnvironment", input, new GenericType<StartEnvironmentResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/stopEnvironment", input, new GenericType<StopEnvironmentResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/syncAllUsers", input, new GenericType<SyncAllUsersResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/syncIdBrokerMappings", input, new GenericType<SyncIdBrokerMappingsResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/syncStatus", input, new GenericType<SyncStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/syncUser", input, new GenericType<SyncUserResponse>(){});
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
    return this.invokeAPI("/api/v1/environments2/testAccountTelemetryRules", input, new GenericType<TestAccountTelemetryRulesResponse>(){});
  }
}
