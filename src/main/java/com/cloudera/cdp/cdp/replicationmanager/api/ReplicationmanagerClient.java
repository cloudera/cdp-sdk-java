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

package com.cloudera.cdp.replicationmanager.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.replicationmanager.model.ActivatePolicyRequest;
import com.cloudera.cdp.replicationmanager.model.ActivatePolicyResponse;
import com.cloudera.cdp.replicationmanager.model.CollectDiagnosticBundleRequest;
import com.cloudera.cdp.replicationmanager.model.CollectDiagnosticBundleResponse;
import com.cloudera.cdp.replicationmanager.model.CreateAbfsCredentialRequest;
import com.cloudera.cdp.replicationmanager.model.CreateAbfsCredentialResponse;
import com.cloudera.cdp.replicationmanager.model.CreateAwsCredentialRequest;
import com.cloudera.cdp.replicationmanager.model.CreateAwsCredentialResponse;
import com.cloudera.cdp.replicationmanager.model.CreatePolicyRequest;
import com.cloudera.cdp.replicationmanager.model.CreatePolicyResponse;
import com.cloudera.cdp.replicationmanager.model.DeleteCredentialRequest;
import com.cloudera.cdp.replicationmanager.model.DeleteCredentialResponse;
import com.cloudera.cdp.replicationmanager.model.DeletePolicyRequest;
import com.cloudera.cdp.replicationmanager.model.DeletePolicyResponse;
import com.cloudera.cdp.replicationmanager.model.DownloadDiagnosticBundleRequest;
import com.cloudera.cdp.replicationmanager.model.DownloadDiagnosticBundleResponse;
import com.cloudera.cdp.replicationmanager.model.Error;
import com.cloudera.cdp.replicationmanager.model.GetCommandStatusRequest;
import com.cloudera.cdp.replicationmanager.model.GetCommandStatusResponse;
import com.cloudera.cdp.replicationmanager.model.GetCredentialsRequest;
import com.cloudera.cdp.replicationmanager.model.GetCredentialsResponse;
import com.cloudera.cdp.replicationmanager.model.ListAllCredentialsRequest;
import com.cloudera.cdp.replicationmanager.model.ListAllCredentialsResponse;
import com.cloudera.cdp.replicationmanager.model.ListClusterServiceStatusesRequest;
import com.cloudera.cdp.replicationmanager.model.ListClusterServiceStatusesResponse;
import com.cloudera.cdp.replicationmanager.model.ListClustersRequest;
import com.cloudera.cdp.replicationmanager.model.ListClustersResponse;
import com.cloudera.cdp.replicationmanager.model.ListPoliciesRequest;
import com.cloudera.cdp.replicationmanager.model.ListPoliciesResponse;
import com.cloudera.cdp.replicationmanager.model.SuspendPolicyRequest;
import com.cloudera.cdp.replicationmanager.model.SuspendPolicyResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-12T14:16:23.012-07:00")
public class ReplicationmanagerClient extends CdpClient {

  public static final String SERVICE_NAME = "replicationmanager";

  public ReplicationmanagerClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public ReplicationmanagerClient(CdpRequestContext<?> context) {
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
   * Resume all replication tasks defined by the policy.
   * @param input
   * @return ActivatePolicyResponse
   */
  public ActivatePolicyResponse activatePolicy(ActivatePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling activatePolicy");
    }

    return this.invokeAPI("activatePolicy", "/api/v1/replicationmanager/activatePolicy", input, new GenericType<ActivatePolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Collect diagnostic bundle for a policy.
   * @param input
   * @return CollectDiagnosticBundleResponse
   */
  public CollectDiagnosticBundleResponse collectDiagnosticBundle(CollectDiagnosticBundleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling collectDiagnosticBundle");
    }

    return this.invokeAPI("collectDiagnosticBundle", "/api/v1/replicationmanager/collectDiagnosticBundle", input, new GenericType<CollectDiagnosticBundleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create an ABFS Cloud Credential.
   * @param input
   * @return CreateAbfsCredentialResponse
   */
  public CreateAbfsCredentialResponse createAbfsCredential(CreateAbfsCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAbfsCredential");
    }

    return this.invokeAPI("createAbfsCredential", "/api/v1/replicationmanager/createAbfsCredential", input, new GenericType<CreateAbfsCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create an AWS Cloud Credential.
   * @param input
   * @return CreateAwsCredentialResponse
   */
  public CreateAwsCredentialResponse createAwsCredential(CreateAwsCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAwsCredential");
    }

    return this.invokeAPI("createAwsCredential", "/api/v1/replicationmanager/createAwsCredential", input, new GenericType<CreateAwsCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Replication Policy.
   * @param input
   * @return CreatePolicyResponse
   */
  public CreatePolicyResponse createPolicy(CreatePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createPolicy");
    }

    return this.invokeAPI("createPolicy", "/api/v1/replicationmanager/createPolicy", input, new GenericType<CreatePolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete Cloud Credential.
   * @param input
   * @return DeleteCredentialResponse
   */
  public DeleteCredentialResponse deleteCredential(DeleteCredentialRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteCredential");
    }

    return this.invokeAPI("deleteCredential", "/api/v1/replicationmanager/deleteCredential", input, new GenericType<DeleteCredentialResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete Replication Policy.
   * @param input
   * @return DeletePolicyResponse
   */
  public DeletePolicyResponse deletePolicy(DeletePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deletePolicy");
    }

    return this.invokeAPI("deletePolicy", "/api/v1/replicationmanager/deletePolicy", input, new GenericType<DeletePolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Download diagnostic bundle for a policy.
   * @param input
   * @return DownloadDiagnosticBundleResponse
   */
  public DownloadDiagnosticBundleResponse downloadDiagnosticBundle(DownloadDiagnosticBundleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling downloadDiagnosticBundle");
    }

    return this.invokeAPI("downloadDiagnosticBundle", "/api/v1/replicationmanager/downloadDiagnosticBundle", input, new GenericType<DownloadDiagnosticBundleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the status of the given CM command.
   * @param input
   * @return GetCommandStatusResponse
   */
  public GetCommandStatusResponse getCommandStatus(GetCommandStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getCommandStatus");
    }

    return this.invokeAPI("getCommandStatus", "/api/v1/replicationmanager/getCommandStatus", input, new GenericType<GetCommandStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get Cloud Credentials from a Cluster.
   * @param input
   * @return GetCredentialsResponse
   */
  public GetCredentialsResponse getCredentials(GetCredentialsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getCredentials");
    }

    return this.invokeAPI("getCredentials", "/api/v1/replicationmanager/getCredentials", input, new GenericType<GetCredentialsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists Cloud Credentials.
   * @param input
   * @return ListAllCredentialsResponse
   */
  public ListAllCredentialsResponse listAllCredentials(ListAllCredentialsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listAllCredentials");
    }

    return this.invokeAPI("listAllCredentials", "/api/v1/replicationmanager/listAllCredentials", input, new GenericType<ListAllCredentialsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists Cluster Service Statuses.
   * @param input
   * @return ListClusterServiceStatusesResponse
   */
  public ListClusterServiceStatusesResponse listClusterServiceStatuses(ListClusterServiceStatusesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusterServiceStatuses");
    }

    return this.invokeAPI("listClusterServiceStatuses", "/api/v1/replicationmanager/listClusterServiceStatuses", input, new GenericType<ListClusterServiceStatusesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists all clusters.
   * @param input
   * @return ListClustersResponse
   */
  public ListClustersResponse listClusters(ListClustersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusters");
    }

    return this.invokeAPI("listClusters", "/api/v1/replicationmanager/listClusters", input, new GenericType<ListClustersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get All Replication Policies.
   * @param input
   * @return ListPoliciesResponse
   */
  public ListPoliciesResponse listPolicies(ListPoliciesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listPolicies");
    }

    return this.invokeAPI("listPolicies", "/api/v1/replicationmanager/listPolicies", input, new GenericType<ListPoliciesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Stop all replication tasks defined by the policy.
   * @param input
   * @return SuspendPolicyResponse
   */
  public SuspendPolicyResponse suspendPolicy(SuspendPolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling suspendPolicy");
    }

    return this.invokeAPI("suspendPolicy", "/api/v1/replicationmanager/suspendPolicy", input, new GenericType<SuspendPolicyResponse>(){}, NO_EXTENSION);
  }
}
