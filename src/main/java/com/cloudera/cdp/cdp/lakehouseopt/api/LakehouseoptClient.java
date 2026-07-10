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

package com.cloudera.cdp.lakehouseopt.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.lakehouseopt.model.ChangeTablePolicyRequest;
import com.cloudera.cdp.lakehouseopt.model.ChangeTablePolicyResponse;
import com.cloudera.cdp.lakehouseopt.model.CreateAssociationsRequest;
import com.cloudera.cdp.lakehouseopt.model.CreateAssociationsResponse;
import com.cloudera.cdp.lakehouseopt.model.CreatePolicyRequest;
import com.cloudera.cdp.lakehouseopt.model.CreatePolicyResponse;
import com.cloudera.cdp.lakehouseopt.model.CreateTablePoliciesAssociationsRequest;
import com.cloudera.cdp.lakehouseopt.model.CreateTablePoliciesAssociationsResponse;
import com.cloudera.cdp.lakehouseopt.model.DeletePolicyRequest;
import com.cloudera.cdp.lakehouseopt.model.DeletePolicyResponse;
import com.cloudera.cdp.lakehouseopt.model.DownloadPolicyRequest;
import com.cloudera.cdp.lakehouseopt.model.DownloadPolicyResponse;
import com.cloudera.cdp.lakehouseopt.model.Error;
import com.cloudera.cdp.lakehouseopt.model.ExecutePolicyRequest;
import com.cloudera.cdp.lakehouseopt.model.ExecutePolicyResponse;
import com.cloudera.cdp.lakehouseopt.model.GetAssociatedNamespacesRequest;
import com.cloudera.cdp.lakehouseopt.model.GetAssociatedNamespacesResponse;
import com.cloudera.cdp.lakehouseopt.model.GetAssociatedTablesRequest;
import com.cloudera.cdp.lakehouseopt.model.GetAssociatedTablesResponse;
import com.cloudera.cdp.lakehouseopt.model.GetAssociationDetailsRequest;
import com.cloudera.cdp.lakehouseopt.model.GetAssociationDetailsResponse;
import com.cloudera.cdp.lakehouseopt.model.GetAssociationsRequest;
import com.cloudera.cdp.lakehouseopt.model.GetAssociationsResponse;
import com.cloudera.cdp.lakehouseopt.model.GetCloDatahubRequest;
import com.cloudera.cdp.lakehouseopt.model.GetCloDatahubResponse;
import com.cloudera.cdp.lakehouseopt.model.GetDatahubCrnRequest;
import com.cloudera.cdp.lakehouseopt.model.GetDatahubCrnResponse;
import com.cloudera.cdp.lakehouseopt.model.GetHealthRequest;
import com.cloudera.cdp.lakehouseopt.model.GetHealthResponse;
import com.cloudera.cdp.lakehouseopt.model.GetNamespacesRequest;
import com.cloudera.cdp.lakehouseopt.model.GetNamespacesResponse;
import com.cloudera.cdp.lakehouseopt.model.GetPolicyNamesRequest;
import com.cloudera.cdp.lakehouseopt.model.GetPolicyNamesResponse;
import com.cloudera.cdp.lakehouseopt.model.GetPolicyRequest;
import com.cloudera.cdp.lakehouseopt.model.GetPolicyResponse;
import com.cloudera.cdp.lakehouseopt.model.GetScriptsRequest;
import com.cloudera.cdp.lakehouseopt.model.GetScriptsResponse;
import com.cloudera.cdp.lakehouseopt.model.GetTableNamesRequest;
import com.cloudera.cdp.lakehouseopt.model.GetTableNamesResponse;
import com.cloudera.cdp.lakehouseopt.model.GetTablePoliciesRequest;
import com.cloudera.cdp.lakehouseopt.model.GetTablePoliciesResponse;
import com.cloudera.cdp.lakehouseopt.model.GetTableStatusDetailsRequest;
import com.cloudera.cdp.lakehouseopt.model.GetTableStatusDetailsResponse;
import com.cloudera.cdp.lakehouseopt.model.GetTimezonesRequest;
import com.cloudera.cdp.lakehouseopt.model.GetTimezonesResponse;
import com.cloudera.cdp.lakehouseopt.model.ListEnvironmentsRequest;
import com.cloudera.cdp.lakehouseopt.model.ListEnvironmentsResponse;
import com.cloudera.cdp.lakehouseopt.model.ListPoliciesRequest;
import com.cloudera.cdp.lakehouseopt.model.ListPoliciesResponse;
import com.cloudera.cdp.lakehouseopt.model.ListTablesRequest;
import com.cloudera.cdp.lakehouseopt.model.ListTablesResponse;
import com.cloudera.cdp.lakehouseopt.model.ListTasksRequest;
import com.cloudera.cdp.lakehouseopt.model.ListTasksResponse;
import com.cloudera.cdp.lakehouseopt.model.PauseTableRequest;
import com.cloudera.cdp.lakehouseopt.model.PauseTableResponse;
import com.cloudera.cdp.lakehouseopt.model.UnpauseTableRequest;
import com.cloudera.cdp.lakehouseopt.model.UnpauseTableResponse;
import com.cloudera.cdp.lakehouseopt.model.UnsubscribePolicyRequest;
import com.cloudera.cdp.lakehouseopt.model.UnsubscribePolicyResponse;
import com.cloudera.cdp.lakehouseopt.model.UpdatePolicyRequest;
import com.cloudera.cdp.lakehouseopt.model.UpdatePolicyResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class LakehouseoptClient extends CdpClient {

  public static final String SERVICE_NAME = "lakehouseopt";

  public LakehouseoptClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public LakehouseoptClient(CdpRequestContext<?> context) {
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
   * Perform policy change operations on a table.
   * @param input
   * @return ChangeTablePolicyResponse
   */
  public ChangeTablePolicyResponse changeTablePolicy(ChangeTablePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling changeTablePolicy");
    }

    return this.invokeAPI("changeTablePolicy", "/api/v1/lakehouseopt/changeTablePolicy", input, new GenericType<ChangeTablePolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create policy to table associations.
   * @param input
   * @return CreateAssociationsResponse
   */
  public CreateAssociationsResponse createAssociations(CreateAssociationsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAssociations");
    }

    return this.invokeAPI("createAssociations", "/api/v1/lakehouseopt/createAssociations", input, new GenericType<CreateAssociationsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a new policy.
   * @param input
   * @return CreatePolicyResponse
   */
  public CreatePolicyResponse createPolicy(CreatePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createPolicy");
    }

    return this.invokeAPI("createPolicy", "/api/v1/lakehouseopt/createPolicy", input, new GenericType<CreatePolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * create associations of a table and policies.
   * @param input
   * @return CreateTablePoliciesAssociationsResponse
   */
  public CreateTablePoliciesAssociationsResponse createTablePoliciesAssociations(CreateTablePoliciesAssociationsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createTablePoliciesAssociations");
    }

    return this.invokeAPI("createTablePoliciesAssociations", "/api/v1/lakehouseopt/createTablePoliciesAssociations", input, new GenericType<CreateTablePoliciesAssociationsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a policy definition for a resource.
   * @param input
   * @return DeletePolicyResponse
   */
  public DeletePolicyResponse deletePolicy(DeletePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deletePolicy");
    }

    return this.invokeAPI("deletePolicy", "/api/v1/lakehouseopt/deletePolicy", input, new GenericType<DeletePolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Downloads the policy definition for a particular policy version.
   * @param input
   * @return DownloadPolicyResponse
   */
  public DownloadPolicyResponse downloadPolicy(DownloadPolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling downloadPolicy");
    }

    return this.invokeAPI("downloadPolicy", "/api/v1/lakehouseopt/downloadPolicy", input, new GenericType<DownloadPolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Execute a policy on a table.
   * @param input
   * @return ExecutePolicyResponse
   */
  public ExecutePolicyResponse executePolicy(ExecutePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling executePolicy");
    }

    return this.invokeAPI("executePolicy", "/api/v1/lakehouseopt/executePolicy", input, new GenericType<ExecutePolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get all associated namespaces for a policy.
   * @param input
   * @return GetAssociatedNamespacesResponse
   */
  public GetAssociatedNamespacesResponse getAssociatedNamespaces(GetAssociatedNamespacesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAssociatedNamespaces");
    }

    return this.invokeAPI("getAssociatedNamespaces", "/api/v1/lakehouseopt/getAssociatedNamespaces", input, new GenericType<GetAssociatedNamespacesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get all associated tables for a policy
   * @param input
   * @return GetAssociatedTablesResponse
   */
  public GetAssociatedTablesResponse getAssociatedTables(GetAssociatedTablesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAssociatedTables");
    }

    return this.invokeAPI("getAssociatedTables", "/api/v1/lakehouseopt/getAssociatedTables", input, new GenericType<GetAssociatedTablesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get policy association details.
   * @param input
   * @return GetAssociationDetailsResponse
   */
  public GetAssociationDetailsResponse getAssociationDetails(GetAssociationDetailsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAssociationDetails");
    }

    return this.invokeAPI("getAssociationDetails", "/api/v1/lakehouseopt/getAssociationDetails", input, new GenericType<GetAssociationDetailsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get policy to table associations.
   * @param input
   * @return GetAssociationsResponse
   */
  public GetAssociationsResponse getAssociations(GetAssociationsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAssociations");
    }

    return this.invokeAPI("getAssociations", "/api/v1/lakehouseopt/getAssociations", input, new GenericType<GetAssociationsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Fetches CLO Data Hub for an environment.
   * @param input
   * @return GetCloDatahubResponse
   */
  public GetCloDatahubResponse getCloDatahub(GetCloDatahubRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getCloDatahub");
    }

    return this.invokeAPI("getCloDatahub", "/api/v1/lakehouseopt/getCloDatahub", input, new GenericType<GetCloDatahubResponse>(){}, NO_EXTENSION);
  }

  /**
   * Fetches Data Hub CRN for an environment.
   * @param input
   * @return GetDatahubCrnResponse
   */
  public GetDatahubCrnResponse getDatahubCrn(GetDatahubCrnRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDatahubCrn");
    }

    return this.invokeAPI("getDatahubCrn", "/api/v1/lakehouseopt/getDatahubCrn", input, new GenericType<GetDatahubCrnResponse>(){}, NO_EXTENSION);
  }

  /**
   * Performs health check on CLO components.
   * @param input
   * @return GetHealthResponse
   */
  public GetHealthResponse getHealth(GetHealthRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getHealth");
    }

    return this.invokeAPI("getHealth", "/api/v1/lakehouseopt/getHealth", input, new GenericType<GetHealthResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get all namespaces.
   * @param input
   * @return GetNamespacesResponse
   */
  public GetNamespacesResponse getNamespaces(GetNamespacesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getNamespaces");
    }

    return this.invokeAPI("getNamespaces", "/api/v1/lakehouseopt/getNamespaces", input, new GenericType<GetNamespacesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Fetches the policy details.
   * @param input
   * @return GetPolicyResponse
   */
  public GetPolicyResponse getPolicy(GetPolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getPolicy");
    }

    return this.invokeAPI("getPolicy", "/api/v1/lakehouseopt/getPolicy", input, new GenericType<GetPolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * get all policy names associated with a namespace.
   * @param input
   * @return GetPolicyNamesResponse
   */
  public GetPolicyNamesResponse getPolicyNames(GetPolicyNamesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getPolicyNames");
    }

    return this.invokeAPI("getPolicyNames", "/api/v1/lakehouseopt/getPolicyNames", input, new GenericType<GetPolicyNamesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get scripts.
   * @param input
   * @return GetScriptsResponse
   */
  public GetScriptsResponse getScripts(GetScriptsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getScripts");
    }

    return this.invokeAPI("getScripts", "/api/v1/lakehouseopt/getScripts", input, new GenericType<GetScriptsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get table names in a namespace.
   * @param input
   * @return GetTableNamesResponse
   */
  public GetTableNamesResponse getTableNames(GetTableNamesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getTableNames");
    }

    return this.invokeAPI("getTableNames", "/api/v1/lakehouseopt/getTableNames", input, new GenericType<GetTableNamesResponse>(){}, NO_EXTENSION);
  }

  /**
   * get policies of a table in a namespace.
   * @param input
   * @return GetTablePoliciesResponse
   */
  public GetTablePoliciesResponse getTablePolicies(GetTablePoliciesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getTablePolicies");
    }

    return this.invokeAPI("getTablePolicies", "/api/v1/lakehouseopt/getTablePolicies", input, new GenericType<GetTablePoliciesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get table status details.
   * @param input
   * @return GetTableStatusDetailsResponse
   */
  public GetTableStatusDetailsResponse getTableStatusDetails(GetTableStatusDetailsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getTableStatusDetails");
    }

    return this.invokeAPI("getTableStatusDetails", "/api/v1/lakehouseopt/getTableStatusDetails", input, new GenericType<GetTableStatusDetailsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get all supported timezones.
   * @param input
   * @return GetTimezonesResponse
   */
  public GetTimezonesResponse getTimezones(GetTimezonesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getTimezones");
    }

    return this.invokeAPI("getTimezones", "/api/v1/lakehouseopt/getTimezones", input, new GenericType<GetTimezonesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List environments.
   * @param input
   * @return ListEnvironmentsResponse
   */
  public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listEnvironments");
    }

    return this.invokeAPI("listEnvironments", "/api/v1/lakehouseopt/listEnvironments", input, new GenericType<ListEnvironmentsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists policies.
   * @param input
   * @return ListPoliciesResponse
   */
  public ListPoliciesResponse listPolicies(ListPoliciesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listPolicies");
    }

    return this.invokeAPI("listPolicies", "/api/v1/lakehouseopt/listPolicies", input, new GenericType<ListPoliciesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List tables in a namespace.
   * @param input
   * @return ListTablesResponse
   */
  public ListTablesResponse listTables(ListTablesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listTables");
    }

    return this.invokeAPI("listTables", "/api/v1/lakehouseopt/listTables", input, new GenericType<ListTablesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retrieves CLO maintenance tasks.
   * @param input
   * @return ListTasksResponse
   */
  public ListTasksResponse listTasks(ListTasksRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listTasks");
    }

    return this.invokeAPI("listTasks", "/api/v1/lakehouseopt/listTasks", input, new GenericType<ListTasksResponse>(){}, NO_EXTENSION);
  }

  /**
   * Pause a table.
   * @param input
   * @return PauseTableResponse
   */
  public PauseTableResponse pauseTable(PauseTableRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling pauseTable");
    }

    return this.invokeAPI("pauseTable", "/api/v1/lakehouseopt/pauseTable", input, new GenericType<PauseTableResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unpause a table.
   * @param input
   * @return UnpauseTableResponse
   */
  public UnpauseTableResponse unpauseTable(UnpauseTableRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unpauseTable");
    }

    return this.invokeAPI("unpauseTable", "/api/v1/lakehouseopt/unpauseTable", input, new GenericType<UnpauseTableResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unsubscribe a policy from the table.
   * @param input
   * @return UnsubscribePolicyResponse
   */
  public UnsubscribePolicyResponse unsubscribePolicy(UnsubscribePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unsubscribePolicy");
    }

    return this.invokeAPI("unsubscribePolicy", "/api/v1/lakehouseopt/unsubscribePolicy", input, new GenericType<UnsubscribePolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update an existing policy.
   * @param input
   * @return UpdatePolicyResponse
   */
  public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updatePolicy");
    }

    return this.invokeAPI("updatePolicy", "/api/v1/lakehouseopt/updatePolicy", input, new GenericType<UpdatePolicyResponse>(){}, NO_EXTENSION);
  }
}
