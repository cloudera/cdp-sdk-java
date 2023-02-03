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
import com.cloudera.cdp.replicationmanager.model.CreatePolicyRequest;
import com.cloudera.cdp.replicationmanager.model.CreatePolicyResponse;
import com.cloudera.cdp.replicationmanager.model.DeletePolicyRequest;
import com.cloudera.cdp.replicationmanager.model.DeletePolicyResponse;
import com.cloudera.cdp.replicationmanager.model.Error;
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

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-02T11:31:01.939-08:00")
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
