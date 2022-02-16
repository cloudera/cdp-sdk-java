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
import com.cloudera.cdp.ml.model.CreateWorkspaceRequest;
import com.cloudera.cdp.ml.model.CreateWorkspaceResponse;
import com.cloudera.cdp.ml.model.DeleteWorkspaceRequest;
import com.cloudera.cdp.ml.model.DeleteWorkspaceResponse;
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
import com.cloudera.cdp.ml.model.GrantWorkspaceAccessRequest;
import com.cloudera.cdp.ml.model.GrantWorkspaceAccessResponse;
import com.cloudera.cdp.ml.model.ListWorkspaceAccessRequest;
import com.cloudera.cdp.ml.model.ListWorkspaceAccessResponse;
import com.cloudera.cdp.ml.model.ListWorkspacesRequest;
import com.cloudera.cdp.ml.model.ListWorkspacesResponse;
import com.cloudera.cdp.ml.model.RevokeWorkspaceAccessRequest;
import com.cloudera.cdp.ml.model.RevokeWorkspaceAccessResponse;
import com.cloudera.cdp.ml.model.UpgradeWorkspaceRequest;
import com.cloudera.cdp.ml.model.UpgradeWorkspaceResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-02-16T12:25:47.965-08:00")
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
   * Create a Cloudera Machine Learning workspace.
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
   * Delete Cloudera Machine Learning Workspace.
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
   * Describe Cloudera Machine Learning Workspace.
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
   * Gets all the events belong to a workspace crn.
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
   * ListWorkspaceAccess Cloudera Machine Learning Workspace.
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
   * GetLatestWorkspaceVersion Cloudera Machine Learning Workspace.
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
   * GrantWorkspaceAccess Cloudera Machine Learning Workspace.
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
   * ListWorkspaceAccess Cloudera Machine Learning Workspace.
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
   * List Cloudera Machine Learning workspaces.
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
   * RevokeWorkspaceAccess Cloudera Machine Learning Workspace.
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
   * Upgrade Cloudera Machine Learning workspace.
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
