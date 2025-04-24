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

package com.cloudera.cdp.ml.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.ml.model.AddInstanceGroupsMlServingAppRequest;
import com.cloudera.cdp.ml.model.AddInstanceGroupsMlServingAppResponse;
import com.cloudera.cdp.ml.model.AddInstanceGroupsRequest;
import com.cloudera.cdp.ml.model.AddInstanceGroupsResponse;
import com.cloudera.cdp.ml.model.BackupWorkspaceRequest;
import com.cloudera.cdp.ml.model.BackupWorkspaceResponse;
import com.cloudera.cdp.ml.model.CreateMlServingAppRequest;
import com.cloudera.cdp.ml.model.CreateMlServingAppResponse;
import com.cloudera.cdp.ml.model.CreateModelRegistryRequest;
import com.cloudera.cdp.ml.model.CreateModelRegistryResponse;
import com.cloudera.cdp.ml.model.CreateWorkspaceRequest;
import com.cloudera.cdp.ml.model.CreateWorkspaceResponse;
import com.cloudera.cdp.ml.model.DeleteBackupRequest;
import com.cloudera.cdp.ml.model.DeleteBackupResponse;
import com.cloudera.cdp.ml.model.DeleteInstanceGroupMlServingAppRequest;
import com.cloudera.cdp.ml.model.DeleteInstanceGroupMlServingAppResponse;
import com.cloudera.cdp.ml.model.DeleteInstanceGroupRequest;
import com.cloudera.cdp.ml.model.DeleteInstanceGroupResponse;
import com.cloudera.cdp.ml.model.DeleteMlServingAppRequest;
import com.cloudera.cdp.ml.model.DeleteMlServingAppResponse;
import com.cloudera.cdp.ml.model.DeleteModelRegistryRequest;
import com.cloudera.cdp.ml.model.DeleteModelRegistryResponse;
import com.cloudera.cdp.ml.model.DeleteWorkspaceRequest;
import com.cloudera.cdp.ml.model.DeleteWorkspaceResponse;
import com.cloudera.cdp.ml.model.DescribeMlServingAppRequest;
import com.cloudera.cdp.ml.model.DescribeMlServingAppResponse;
import com.cloudera.cdp.ml.model.DescribeModelRegistryRequest;
import com.cloudera.cdp.ml.model.DescribeModelRegistryResponse;
import com.cloudera.cdp.ml.model.DescribeWorkspaceRequest;
import com.cloudera.cdp.ml.model.DescribeWorkspaceResponse;
import com.cloudera.cdp.ml.model.Error;
import com.cloudera.cdp.ml.model.GetAuditEventsRequest;
import com.cloudera.cdp.ml.model.GetAuditEventsResponse;
import com.cloudera.cdp.ml.model.GetKubeconfigRequest;
import com.cloudera.cdp.ml.model.GetKubeconfigResponse;
import com.cloudera.cdp.ml.model.GetLatestWorkspaceVersionRequest;
import com.cloudera.cdp.ml.model.GetLatestWorkspaceVersionResponse;
import com.cloudera.cdp.ml.model.GetLogsRequest;
import com.cloudera.cdp.ml.model.GetLogsResponse;
import com.cloudera.cdp.ml.model.GetMlServingAppKubeconfigRequest;
import com.cloudera.cdp.ml.model.GetMlServingAppKubeconfigResponse;
import com.cloudera.cdp.ml.model.GetModelRegistryKubeconfigRequest;
import com.cloudera.cdp.ml.model.GetModelRegistryKubeconfigResponse;
import com.cloudera.cdp.ml.model.GrantMlServingAppAccessRequest;
import com.cloudera.cdp.ml.model.GrantMlServingAppAccessResponse;
import com.cloudera.cdp.ml.model.GrantModelRegistryAccessRequest;
import com.cloudera.cdp.ml.model.GrantModelRegistryAccessResponse;
import com.cloudera.cdp.ml.model.GrantWorkspaceAccessRequest;
import com.cloudera.cdp.ml.model.GrantWorkspaceAccessResponse;
import com.cloudera.cdp.ml.model.ListInstanceTypeConfigurationRequest;
import com.cloudera.cdp.ml.model.ListInstanceTypeConfigurationResponse;
import com.cloudera.cdp.ml.model.ListMlServingAppAccessRequest;
import com.cloudera.cdp.ml.model.ListMlServingAppAccessResponse;
import com.cloudera.cdp.ml.model.ListMlServingAppsRequest;
import com.cloudera.cdp.ml.model.ListMlServingAppsResponse;
import com.cloudera.cdp.ml.model.ListModelRegistriesRequest;
import com.cloudera.cdp.ml.model.ListModelRegistriesResponse;
import com.cloudera.cdp.ml.model.ListModelRegistryAccessRequest;
import com.cloudera.cdp.ml.model.ListModelRegistryAccessResponse;
import com.cloudera.cdp.ml.model.ListRelevantInstancesRequest;
import com.cloudera.cdp.ml.model.ListRelevantInstancesResponse;
import com.cloudera.cdp.ml.model.ListWorkspaceAccessRequest;
import com.cloudera.cdp.ml.model.ListWorkspaceAccessResponse;
import com.cloudera.cdp.ml.model.ListWorkspaceBackupsRequest;
import com.cloudera.cdp.ml.model.ListWorkspaceBackupsResponse;
import com.cloudera.cdp.ml.model.ListWorkspacesRequest;
import com.cloudera.cdp.ml.model.ListWorkspacesResponse;
import com.cloudera.cdp.ml.model.ModifyClusterInstanceGroupRequest;
import com.cloudera.cdp.ml.model.ModifyClusterInstanceGroupResponse;
import com.cloudera.cdp.ml.model.ModifyClusterSecurityRequest;
import com.cloudera.cdp.ml.model.ModifyClusterSecurityResponse;
import com.cloudera.cdp.ml.model.ModifyMlServingAppRequest;
import com.cloudera.cdp.ml.model.ModifyMlServingAppResponse;
import com.cloudera.cdp.ml.model.ModifyWorkspaceLoadBalancerRequest;
import com.cloudera.cdp.ml.model.ModifyWorkspaceLoadBalancerResponse;
import com.cloudera.cdp.ml.model.RefreshModelRegistryConfigmapRequest;
import com.cloudera.cdp.ml.model.RefreshModelRegistryConfigmapResponse;
import com.cloudera.cdp.ml.model.RequestWorkflowCancellationRequest;
import com.cloudera.cdp.ml.model.RequestWorkflowCancellationResponse;
import com.cloudera.cdp.ml.model.RestoreWorkspaceRequest;
import com.cloudera.cdp.ml.model.RestoreWorkspaceResponse;
import com.cloudera.cdp.ml.model.ResumeWorkspaceRequest;
import com.cloudera.cdp.ml.model.ResumeWorkspaceResponse;
import com.cloudera.cdp.ml.model.RevokeMlServingAppAccessRequest;
import com.cloudera.cdp.ml.model.RevokeMlServingAppAccessResponse;
import com.cloudera.cdp.ml.model.RevokeModelRegistryAccessRequest;
import com.cloudera.cdp.ml.model.RevokeModelRegistryAccessResponse;
import com.cloudera.cdp.ml.model.RevokeWorkspaceAccessRequest;
import com.cloudera.cdp.ml.model.RevokeWorkspaceAccessResponse;
import com.cloudera.cdp.ml.model.RollbackModelRegistryUpgradeRequest;
import com.cloudera.cdp.ml.model.RollbackModelRegistryUpgradeResponse;
import com.cloudera.cdp.ml.model.SuspendWorkspaceRequest;
import com.cloudera.cdp.ml.model.SuspendWorkspaceResponse;
import com.cloudera.cdp.ml.model.UpgradeMlServingAppRequest;
import com.cloudera.cdp.ml.model.UpgradeMlServingAppResponse;
import com.cloudera.cdp.ml.model.UpgradeModelRegistryRequest;
import com.cloudera.cdp.ml.model.UpgradeModelRegistryResponse;
import com.cloudera.cdp.ml.model.UpgradeWorkspaceRequest;
import com.cloudera.cdp.ml.model.UpgradeWorkspaceResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:34.210-07:00")
public class MlClient extends CdpClient {

  public static final String SERVICE_NAME = "ml";

  public MlClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public MlClient(CdpRequestContext<?> context) {
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
   * Add new Cloudera AI workbench cluster instance groups.
   * @param input
   * @return AddInstanceGroupsResponse
   */
  public AddInstanceGroupsResponse addInstanceGroups(AddInstanceGroupsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addInstanceGroups");
    }

    return this.invokeAPI("addInstanceGroups", "/api/v1/ml/addInstanceGroups", input, new GenericType<AddInstanceGroupsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Add instance group to an existing Cloudera AI Inference Service instance.
   * @param input
   * @return AddInstanceGroupsMlServingAppResponse
   */
  public AddInstanceGroupsMlServingAppResponse addInstanceGroupsMlServingApp(AddInstanceGroupsMlServingAppRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addInstanceGroupsMlServingApp");
    }

    return this.invokeAPI("addInstanceGroupsMlServingApp", "/api/v1/ml/addInstanceGroupsMlServingApp", input, new GenericType<AddInstanceGroupsMlServingAppResponse>(){}, NO_EXTENSION);
  }

  /**
   * Backup a Cloudera AI workbench.
   * @param input
   * @return BackupWorkspaceResponse
   */
  public BackupWorkspaceResponse backupWorkspace(BackupWorkspaceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling backupWorkspace");
    }

    return this.invokeAPI("backupWorkspace", "/api/v1/ml/backupWorkspace", input, new GenericType<BackupWorkspaceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deploys Cloudera AI Inference Service into an existing Kubernetes cluster.
   * @param input
   * @return CreateMlServingAppResponse
   */
  public CreateMlServingAppResponse createMlServingApp(CreateMlServingAppRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createMlServingApp");
    }

    return this.invokeAPI("createMlServingApp", "/api/v1/ml/createMlServingApp", input, new GenericType<CreateMlServingAppResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new model registry.
   * @param input
   * @return CreateModelRegistryResponse
   */
  public CreateModelRegistryResponse createModelRegistry(CreateModelRegistryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createModelRegistry");
    }

    return this.invokeAPI("createModelRegistry", "/api/v1/ml/createModelRegistry", input, new GenericType<CreateModelRegistryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Cloudera AI workbench.
   * @param input
   * @return CreateWorkspaceResponse
   */
  public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createWorkspace");
    }

    return this.invokeAPI("createWorkspace", "/api/v1/ml/createWorkspace", input, new GenericType<CreateWorkspaceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a backup snapshot.
   * @param input
   * @return DeleteBackupResponse
   */
  public DeleteBackupResponse deleteBackup(DeleteBackupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteBackup");
    }

    return this.invokeAPI("deleteBackup", "/api/v1/ml/deleteBackup", input, new GenericType<DeleteBackupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes an instance group from the cluster.
   * @param input
   * @return DeleteInstanceGroupResponse
   */
  public DeleteInstanceGroupResponse deleteInstanceGroup(DeleteInstanceGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteInstanceGroup");
    }

    return this.invokeAPI("deleteInstanceGroup", "/api/v1/ml/deleteInstanceGroup", input, new GenericType<DeleteInstanceGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes an instance group from a Cloudera AI Inference Service instance.
   * @param input
   * @return DeleteInstanceGroupMlServingAppResponse
   */
  public DeleteInstanceGroupMlServingAppResponse deleteInstanceGroupMlServingApp(DeleteInstanceGroupMlServingAppRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteInstanceGroupMlServingApp");
    }

    return this.invokeAPI("deleteInstanceGroupMlServingApp", "/api/v1/ml/deleteInstanceGroupMlServingApp", input, new GenericType<DeleteInstanceGroupMlServingAppResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes Cloudera AI Inference Service instance.
   * @param input
   * @return DeleteMlServingAppResponse
   */
  public DeleteMlServingAppResponse deleteMlServingApp(DeleteMlServingAppRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteMlServingApp");
    }

    return this.invokeAPI("deleteMlServingApp", "/api/v1/ml/deleteMlServingApp", input, new GenericType<DeleteMlServingAppResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a model registry.
   * @param input
   * @return DeleteModelRegistryResponse
   */
  public DeleteModelRegistryResponse deleteModelRegistry(DeleteModelRegistryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteModelRegistry");
    }

    return this.invokeAPI("deleteModelRegistry", "/api/v1/ml/deleteModelRegistry", input, new GenericType<DeleteModelRegistryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete Cloudera AI workbench.
   * @param input
   * @return DeleteWorkspaceResponse
   */
  public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteWorkspace");
    }

    return this.invokeAPI("deleteWorkspace", "/api/v1/ml/deleteWorkspace", input, new GenericType<DeleteWorkspaceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe Cloudera AI Inference Service instance.
   * @param input
   * @return DescribeMlServingAppResponse
   */
  public DescribeMlServingAppResponse describeMlServingApp(DescribeMlServingAppRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeMlServingApp");
    }

    return this.invokeAPI("describeMlServingApp", "/api/v1/ml/describeMlServingApp", input, new GenericType<DescribeMlServingAppResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe Cloudera AI Model Registry.
   * @param input
   * @return DescribeModelRegistryResponse
   */
  public DescribeModelRegistryResponse describeModelRegistry(DescribeModelRegistryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeModelRegistry");
    }

    return this.invokeAPI("describeModelRegistry", "/api/v1/ml/describeModelRegistry", input, new GenericType<DescribeModelRegistryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe Cloudera AI workbench.
   * @param input
   * @return DescribeWorkspaceResponse
   */
  public DescribeWorkspaceResponse describeWorkspace(DescribeWorkspaceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeWorkspace");
    }

    return this.invokeAPI("describeWorkspace", "/api/v1/ml/describeWorkspace", input, new GenericType<DescribeWorkspaceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets all the events belong to a workbench crn.
   * @param input
   * @return GetAuditEventsResponse
   */
  public GetAuditEventsResponse getAuditEvents(GetAuditEventsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAuditEvents");
    }

    return this.invokeAPI("getAuditEvents", "/api/v1/ml/getAuditEvents", input, new GenericType<GetAuditEventsResponse>(){}, NO_EXTENSION);
  }

  /**
   * ListWorkspaceAccess Cloudera AI workbench.
   * @param input
   * @return GetKubeconfigResponse
   */
  public GetKubeconfigResponse getKubeconfig(GetKubeconfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getKubeconfig");
    }

    return this.invokeAPI("getKubeconfig", "/api/v1/ml/getKubeconfig", input, new GenericType<GetKubeconfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * GetLatestWorkspaceVersion Cloudera AI workbench.
   * @param input
   * @return GetLatestWorkspaceVersionResponse
   */
  public GetLatestWorkspaceVersionResponse getLatestWorkspaceVersion(GetLatestWorkspaceVersionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getLatestWorkspaceVersion");
    }

    return this.invokeAPI("getLatestWorkspaceVersion", "/api/v1/ml/getLatestWorkspaceVersion", input, new GenericType<GetLatestWorkspaceVersionResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets all the logs belong to a request id.
   * @param input
   * @return GetLogsResponse
   */
  public GetLogsResponse getLogs(GetLogsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getLogs");
    }

    return this.invokeAPI("getLogs", "/api/v1/ml/getLogs", input, new GenericType<GetLogsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Return kubeconfig for a Cloudera AI Inference Service Kubernetes cluster.
   * @param input
   * @return GetMlServingAppKubeconfigResponse
   */
  public GetMlServingAppKubeconfigResponse getMlServingAppKubeconfig(GetMlServingAppKubeconfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getMlServingAppKubeconfig");
    }

    return this.invokeAPI("getMlServingAppKubeconfig", "/api/v1/ml/getMlServingAppKubeconfig", input, new GenericType<GetMlServingAppKubeconfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * GetModelRegistryKubeconfig returns kube config for model registry.
   * @param input
   * @return GetModelRegistryKubeconfigResponse
   */
  public GetModelRegistryKubeconfigResponse getModelRegistryKubeconfig(GetModelRegistryKubeconfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getModelRegistryKubeconfig");
    }

    return this.invokeAPI("getModelRegistryKubeconfig", "/api/v1/ml/getModelRegistryKubeconfig", input, new GenericType<GetModelRegistryKubeconfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Grants admin access to a Cloudera AI Inference Service cluster.
   * @param input
   * @return GrantMlServingAppAccessResponse
   */
  public GrantMlServingAppAccessResponse grantMlServingAppAccess(GrantMlServingAppAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling grantMlServingAppAccess");
    }

    return this.invokeAPI("grantMlServingAppAccess", "/api/v1/ml/grantMlServingAppAccess", input, new GenericType<GrantMlServingAppAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * GrantModelRegistryAccess Cloudera AI Model Registry.
   * @param input
   * @return GrantModelRegistryAccessResponse
   */
  public GrantModelRegistryAccessResponse grantModelRegistryAccess(GrantModelRegistryAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling grantModelRegistryAccess");
    }

    return this.invokeAPI("grantModelRegistryAccess", "/api/v1/ml/grantModelRegistryAccess", input, new GenericType<GrantModelRegistryAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * GrantWorkspaceAccess Cloudera AI workbench.
   * @param input
   * @return GrantWorkspaceAccessResponse
   */
  public GrantWorkspaceAccessResponse grantWorkspaceAccess(GrantWorkspaceAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling grantWorkspaceAccess");
    }

    return this.invokeAPI("grantWorkspaceAccess", "/api/v1/ml/grantWorkspaceAccess", input, new GenericType<GrantWorkspaceAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * List the instance configuration for a given instance type.
   * @param input
   * @return ListInstanceTypeConfigurationResponse
   */
  public ListInstanceTypeConfigurationResponse listInstanceTypeConfiguration(ListInstanceTypeConfigurationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listInstanceTypeConfiguration");
    }

    return this.invokeAPI("listInstanceTypeConfiguration", "/api/v1/ml/listInstanceTypeConfiguration", input, new GenericType<ListInstanceTypeConfigurationResponse>(){}, NO_EXTENSION);
  }

  /**
   * List members that have Kubernetes access to a Cloudera AI Inference Service cluster.
   * @param input
   * @return ListMlServingAppAccessResponse
   */
  public ListMlServingAppAccessResponse listMlServingAppAccess(ListMlServingAppAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listMlServingAppAccess");
    }

    return this.invokeAPI("listMlServingAppAccess", "/api/v1/ml/listMlServingAppAccess", input, new GenericType<ListMlServingAppAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * List all Cloudera AI Inference Service instances.
   * @param input
   * @return ListMlServingAppsResponse
   */
  public ListMlServingAppsResponse listMlServingApps(ListMlServingAppsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listMlServingApps");
    }

    return this.invokeAPI("listMlServingApps", "/api/v1/ml/listMlServingApps", input, new GenericType<ListMlServingAppsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists all model registries.
   * @param input
   * @return ListModelRegistriesResponse
   */
  public ListModelRegistriesResponse listModelRegistries(ListModelRegistriesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listModelRegistries");
    }

    return this.invokeAPI("listModelRegistries", "/api/v1/ml/listModelRegistries", input, new GenericType<ListModelRegistriesResponse>(){}, NO_EXTENSION);
  }

  /**
   * ListWorkspaceAccess Cloudera AI Model Registry.
   * @param input
   * @return ListModelRegistryAccessResponse
   */
  public ListModelRegistryAccessResponse listModelRegistryAccess(ListModelRegistryAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listModelRegistryAccess");
    }

    return this.invokeAPI("listModelRegistryAccess", "/api/v1/ml/listModelRegistryAccess", input, new GenericType<ListModelRegistryAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * List the instance types for Cloudera AI workbench creation that have the requested resource.
   * @param input
   * @return ListRelevantInstancesResponse
   */
  public ListRelevantInstancesResponse listRelevantInstances(ListRelevantInstancesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listRelevantInstances");
    }

    return this.invokeAPI("listRelevantInstances", "/api/v1/ml/listRelevantInstances", input, new GenericType<ListRelevantInstancesResponse>(){}, NO_EXTENSION);
  }

  /**
   * ListWorkspaceAccess Cloudera AI workbench.
   * @param input
   * @return ListWorkspaceAccessResponse
   */
  public ListWorkspaceAccessResponse listWorkspaceAccess(ListWorkspaceAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listWorkspaceAccess");
    }

    return this.invokeAPI("listWorkspaceAccess", "/api/v1/ml/listWorkspaceAccess", input, new GenericType<ListWorkspaceAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * List backup snapshots of a workbench.
   * @param input
   * @return ListWorkspaceBackupsResponse
   */
  public ListWorkspaceBackupsResponse listWorkspaceBackups(ListWorkspaceBackupsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listWorkspaceBackups");
    }

    return this.invokeAPI("listWorkspaceBackups", "/api/v1/ml/listWorkspaceBackups", input, new GenericType<ListWorkspaceBackupsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Cloudera AI workbenches.
   * @param input
   * @return ListWorkspacesResponse
   */
  public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listWorkspaces");
    }

    return this.invokeAPI("listWorkspaces", "/api/v1/ml/listWorkspaces", input, new GenericType<ListWorkspacesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Modify Cloudera AI workbench cluster instance group.
   * @param input
   * @return ModifyClusterInstanceGroupResponse
   */
  public ModifyClusterInstanceGroupResponse modifyClusterInstanceGroup(ModifyClusterInstanceGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling modifyClusterInstanceGroup");
    }

    return this.invokeAPI("modifyClusterInstanceGroup", "/api/v1/ml/modifyClusterInstanceGroup", input, new GenericType<ModifyClusterInstanceGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Modify Cloudera AI workbench cluster security.
   * @param input
   * @return ModifyClusterSecurityResponse
   */
  public ModifyClusterSecurityResponse modifyClusterSecurity(ModifyClusterSecurityRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling modifyClusterSecurity");
    }

    return this.invokeAPI("modifyClusterSecurity", "/api/v1/ml/modifyClusterSecurity", input, new GenericType<ModifyClusterSecurityResponse>(){}, NO_EXTENSION);
  }

  /**
   * Modify instance groups for a Cloudera AI Inference Service cluster.
   * @param input
   * @return ModifyMlServingAppResponse
   */
  public ModifyMlServingAppResponse modifyMlServingApp(ModifyMlServingAppRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling modifyMlServingApp");
    }

    return this.invokeAPI("modifyMlServingApp", "/api/v1/ml/modifyMlServingApp", input, new GenericType<ModifyMlServingAppResponse>(){}, NO_EXTENSION);
  }

  /**
   * Modify Cloudera AI workbench loadbalancer.
   * @param input
   * @return ModifyWorkspaceLoadBalancerResponse
   */
  public ModifyWorkspaceLoadBalancerResponse modifyWorkspaceLoadBalancer(ModifyWorkspaceLoadBalancerRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling modifyWorkspaceLoadBalancer");
    }

    return this.invokeAPI("modifyWorkspaceLoadBalancer", "/api/v1/ml/modifyWorkspaceLoadBalancer", input, new GenericType<ModifyWorkspaceLoadBalancerResponse>(){}, NO_EXTENSION);
  }

  /**
   * Refreshes the model registry configmap of the workbench.
   * @param input
   * @return RefreshModelRegistryConfigmapResponse
   */
  public RefreshModelRegistryConfigmapResponse refreshModelRegistryConfigmap(RefreshModelRegistryConfigmapRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling refreshModelRegistryConfigmap");
    }

    return this.invokeAPI("refreshModelRegistryConfigmap", "/api/v1/ml/refreshModelRegistryConfigmap", input, new GenericType<RefreshModelRegistryConfigmapResponse>(){}, NO_EXTENSION);
  }

  /**
   * Request a workflow cancellation.
   * @param input
   * @return RequestWorkflowCancellationResponse
   */
  public RequestWorkflowCancellationResponse requestWorkflowCancellation(RequestWorkflowCancellationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling requestWorkflowCancellation");
    }

    return this.invokeAPI("requestWorkflowCancellation", "/api/v1/ml/requestWorkflowCancellation", input, new GenericType<RequestWorkflowCancellationResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restore a Cloudera AI workbench.
   * @param input
   * @return RestoreWorkspaceResponse
   */
  public RestoreWorkspaceResponse restoreWorkspace(RestoreWorkspaceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restoreWorkspace");
    }

    return this.invokeAPI("restoreWorkspace", "/api/v1/ml/restoreWorkspace", input, new GenericType<RestoreWorkspaceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Resume Cloudera AI workbench.
   * @param input
   * @return ResumeWorkspaceResponse
   */
  public ResumeWorkspaceResponse resumeWorkspace(ResumeWorkspaceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling resumeWorkspace");
    }

    return this.invokeAPI("resumeWorkspace", "/api/v1/ml/resumeWorkspace", input, new GenericType<ResumeWorkspaceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Revokes access to a Cloudera AI Inference Service cluster.
   * @param input
   * @return RevokeMlServingAppAccessResponse
   */
  public RevokeMlServingAppAccessResponse revokeMlServingAppAccess(RevokeMlServingAppAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling revokeMlServingAppAccess");
    }

    return this.invokeAPI("revokeMlServingAppAccess", "/api/v1/ml/revokeMlServingAppAccess", input, new GenericType<RevokeMlServingAppAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * RevokeModelRegistryAccess Cloudera AI Model Registry.
   * @param input
   * @return RevokeModelRegistryAccessResponse
   */
  public RevokeModelRegistryAccessResponse revokeModelRegistryAccess(RevokeModelRegistryAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling revokeModelRegistryAccess");
    }

    return this.invokeAPI("revokeModelRegistryAccess", "/api/v1/ml/revokeModelRegistryAccess", input, new GenericType<RevokeModelRegistryAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * RevokeWorkspaceAccess Cloudera AI workbench.
   * @param input
   * @return RevokeWorkspaceAccessResponse
   */
  public RevokeWorkspaceAccessResponse revokeWorkspaceAccess(RevokeWorkspaceAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling revokeWorkspaceAccess");
    }

    return this.invokeAPI("revokeWorkspaceAccess", "/api/v1/ml/revokeWorkspaceAccess", input, new GenericType<RevokeWorkspaceAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * Rollback a model registry upgrade. Restore prior model registry.
   * @param input
   * @return RollbackModelRegistryUpgradeResponse
   */
  public RollbackModelRegistryUpgradeResponse rollbackModelRegistryUpgrade(RollbackModelRegistryUpgradeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling rollbackModelRegistryUpgrade");
    }

    return this.invokeAPI("rollbackModelRegistryUpgrade", "/api/v1/ml/rollbackModelRegistryUpgrade", input, new GenericType<RollbackModelRegistryUpgradeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Suspend Cloudera AI workbench.
   * @param input
   * @return SuspendWorkspaceResponse
   */
  public SuspendWorkspaceResponse suspendWorkspace(SuspendWorkspaceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling suspendWorkspace");
    }

    return this.invokeAPI("suspendWorkspace", "/api/v1/ml/suspendWorkspace", input, new GenericType<SuspendWorkspaceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrade a Cloudera AI Inference Service instance.
   * @param input
   * @return UpgradeMlServingAppResponse
   */
  public UpgradeMlServingAppResponse upgradeMlServingApp(UpgradeMlServingAppRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeMlServingApp");
    }

    return this.invokeAPI("upgradeMlServingApp", "/api/v1/ml/upgradeMlServingApp", input, new GenericType<UpgradeMlServingAppResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrade a model registry.
   * @param input
   * @return UpgradeModelRegistryResponse
   */
  public UpgradeModelRegistryResponse upgradeModelRegistry(UpgradeModelRegistryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeModelRegistry");
    }

    return this.invokeAPI("upgradeModelRegistry", "/api/v1/ml/upgradeModelRegistry", input, new GenericType<UpgradeModelRegistryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrade Cloudera AI workbench.
   * @param input
   * @return UpgradeWorkspaceResponse
   */
  public UpgradeWorkspaceResponse upgradeWorkspace(UpgradeWorkspaceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeWorkspace");
    }

    return this.invokeAPI("upgradeWorkspace", "/api/v1/ml/upgradeWorkspace", input, new GenericType<UpgradeWorkspaceResponse>(){}, NO_EXTENSION);
  }
}
