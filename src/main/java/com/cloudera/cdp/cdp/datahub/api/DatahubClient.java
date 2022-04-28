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

package com.cloudera.cdp.datahub.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.datahub.model.CancelDatahubDiagnosticsRequest;
import com.cloudera.cdp.datahub.model.CancelDatahubDiagnosticsResponse;
import com.cloudera.cdp.datahub.model.CollectCmDiagnosticsRequest;
import com.cloudera.cdp.datahub.model.CollectCmDiagnosticsResponse;
import com.cloudera.cdp.datahub.model.CollectDatahubDiagnosticsRequest;
import com.cloudera.cdp.datahub.model.CollectDatahubDiagnosticsResponse;
import com.cloudera.cdp.datahub.model.CreateAWSClusterRequest;
import com.cloudera.cdp.datahub.model.CreateAWSClusterResponse;
import com.cloudera.cdp.datahub.model.CreateAutoScaleRulesRequest;
import com.cloudera.cdp.datahub.model.CreateAutoScaleRulesResponse;
import com.cloudera.cdp.datahub.model.CreateAzureClusterRequest;
import com.cloudera.cdp.datahub.model.CreateAzureClusterResponse;
import com.cloudera.cdp.datahub.model.CreateClusterDefinitionRequest;
import com.cloudera.cdp.datahub.model.CreateClusterDefinitionResponse;
import com.cloudera.cdp.datahub.model.CreateClusterTemplateRequest;
import com.cloudera.cdp.datahub.model.CreateClusterTemplateResponse;
import com.cloudera.cdp.datahub.model.CreateGCPClusterRequest;
import com.cloudera.cdp.datahub.model.CreateGCPClusterResponse;
import com.cloudera.cdp.datahub.model.CreateRecipeRequest;
import com.cloudera.cdp.datahub.model.CreateRecipeResponse;
import com.cloudera.cdp.datahub.model.DeleteAutoScaleRulesRequest;
import com.cloudera.cdp.datahub.model.DeleteAutoScaleRulesResponse;
import com.cloudera.cdp.datahub.model.DeleteClusterDefinitionsRequest;
import com.cloudera.cdp.datahub.model.DeleteClusterDefinitionsResponse;
import com.cloudera.cdp.datahub.model.DeleteClusterRequest;
import com.cloudera.cdp.datahub.model.DeleteClusterResponse;
import com.cloudera.cdp.datahub.model.DeleteClusterTemplatesRequest;
import com.cloudera.cdp.datahub.model.DeleteClusterTemplatesResponse;
import com.cloudera.cdp.datahub.model.DeleteInstancesRequest;
import com.cloudera.cdp.datahub.model.DeleteInstancesResponse;
import com.cloudera.cdp.datahub.model.DeleteRecipesRequest;
import com.cloudera.cdp.datahub.model.DeleteRecipesResponse;
import com.cloudera.cdp.datahub.model.DescribeAutoScaleRulesRequest;
import com.cloudera.cdp.datahub.model.DescribeAutoScaleRulesResponse;
import com.cloudera.cdp.datahub.model.DescribeClusterDefinitionRequest;
import com.cloudera.cdp.datahub.model.DescribeClusterDefinitionResponse;
import com.cloudera.cdp.datahub.model.DescribeClusterRequest;
import com.cloudera.cdp.datahub.model.DescribeClusterResponse;
import com.cloudera.cdp.datahub.model.DescribeClusterTemplateRequest;
import com.cloudera.cdp.datahub.model.DescribeClusterTemplateResponse;
import com.cloudera.cdp.datahub.model.DescribeRecipeRequest;
import com.cloudera.cdp.datahub.model.DescribeRecipeResponse;
import com.cloudera.cdp.datahub.model.Error;
import com.cloudera.cdp.datahub.model.GetClusterHostStatusRequest;
import com.cloudera.cdp.datahub.model.GetClusterHostStatusResponse;
import com.cloudera.cdp.datahub.model.GetClusterServiceStatusRequest;
import com.cloudera.cdp.datahub.model.GetClusterServiceStatusResponse;
import com.cloudera.cdp.datahub.model.GetCmRolesRequest;
import com.cloudera.cdp.datahub.model.GetCmRolesResponse;
import com.cloudera.cdp.datahub.model.GetDatahubLogDescriptorsRequest;
import com.cloudera.cdp.datahub.model.GetDatahubLogDescriptorsResponse;
import com.cloudera.cdp.datahub.model.ListAutoScaleHistoryRequest;
import com.cloudera.cdp.datahub.model.ListAutoScaleHistoryResponse;
import com.cloudera.cdp.datahub.model.ListClusterDefinitionsRequest;
import com.cloudera.cdp.datahub.model.ListClusterDefinitionsResponse;
import com.cloudera.cdp.datahub.model.ListClusterTemplatesRequest;
import com.cloudera.cdp.datahub.model.ListClusterTemplatesResponse;
import com.cloudera.cdp.datahub.model.ListClustersRequest;
import com.cloudera.cdp.datahub.model.ListClustersResponse;
import com.cloudera.cdp.datahub.model.ListDatahubDiagnosticsRequest;
import com.cloudera.cdp.datahub.model.ListDatahubDiagnosticsResponse;
import com.cloudera.cdp.datahub.model.ListRecipesRequest;
import com.cloudera.cdp.datahub.model.ListRecipesResponse;
import com.cloudera.cdp.datahub.model.RenewCertificateRequest;
import com.cloudera.cdp.datahub.model.RenewCertificateResponse;
import com.cloudera.cdp.datahub.model.RenewPublicCertificateRequest;
import com.cloudera.cdp.datahub.model.RenewPublicCertificateResponse;
import com.cloudera.cdp.datahub.model.RepairClusterRequest;
import com.cloudera.cdp.datahub.model.RepairClusterResponse;
import com.cloudera.cdp.datahub.model.ReplaceRecipesRequest;
import com.cloudera.cdp.datahub.model.ReplaceRecipesResponse;
import com.cloudera.cdp.datahub.model.RetryClusterRequest;
import com.cloudera.cdp.datahub.model.RetryClusterResponse;
import com.cloudera.cdp.datahub.model.RotateAutoTlsCertificatesRequest;
import com.cloudera.cdp.datahub.model.RotateAutoTlsCertificatesResponse;
import com.cloudera.cdp.datahub.model.RotatePrivateCertificatesRequest;
import com.cloudera.cdp.datahub.model.RotatePrivateCertificatesResponse;
import com.cloudera.cdp.datahub.model.ScaleClusterRequest;
import com.cloudera.cdp.datahub.model.ScaleClusterResponse;
import com.cloudera.cdp.datahub.model.SetCatalogRequest;
import com.cloudera.cdp.datahub.model.SetCatalogResponse;
import com.cloudera.cdp.datahub.model.StartClusterRequest;
import com.cloudera.cdp.datahub.model.StartClusterResponse;
import com.cloudera.cdp.datahub.model.StopClusterRequest;
import com.cloudera.cdp.datahub.model.StopClusterResponse;
import com.cloudera.cdp.datahub.model.SyncClusterRequest;
import com.cloudera.cdp.datahub.model.SyncClusterResponse;
import com.cloudera.cdp.datahub.model.SyncComponentVersionsFromCmRequest;
import com.cloudera.cdp.datahub.model.SyncComponentVersionsFromCmResponse;
import com.cloudera.cdp.datahub.model.UpdateAutoScaleRulesRequest;
import com.cloudera.cdp.datahub.model.UpdateAutoScaleRulesResponse;
import com.cloudera.cdp.datahub.model.UpgradeClusterRequest;
import com.cloudera.cdp.datahub.model.UpgradeClusterResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-28T14:39:22.553-07:00")
public class DatahubClient extends CdpClient {

  public static final String SERVICE_NAME = "datahub";

  public DatahubClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DatahubClient(CdpRequestContext<?> context) {
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
   * Cancel running Datahub diagnostics collections
   * @param input
   * @return CancelDatahubDiagnosticsResponse
   */
  public CancelDatahubDiagnosticsResponse cancelDatahubDiagnostics(CancelDatahubDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling cancelDatahubDiagnostics");
    }

    return this.invokeAPI("cancelDatahubDiagnostics", "/api/v1/datahub/cancelDatahubDiagnostics", input, new GenericType<CancelDatahubDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start Datahub Cloudera Manager based diagnostics collection
   * @param input
   * @return CollectCmDiagnosticsResponse
   */
  public CollectCmDiagnosticsResponse collectCmDiagnostics(CollectCmDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling collectCmDiagnostics");
    }

    return this.invokeAPI("collectCmDiagnostics", "/api/v1/datahub/collectCmDiagnostics", input, new GenericType<CollectCmDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start DataHub diagnostics collection
   * @param input
   * @return CollectDatahubDiagnosticsResponse
   */
  public CollectDatahubDiagnosticsResponse collectDatahubDiagnostics(CollectDatahubDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling collectDatahubDiagnostics");
    }

    return this.invokeAPI("collectDatahubDiagnostics", "/api/v1/datahub/collectDatahubDiagnostics", input, new GenericType<CollectDatahubDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates an AWS workload cluster.
   * @param input
   * @return CreateAWSClusterResponse
   */
  public CreateAWSClusterResponse createAWSCluster(CreateAWSClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAWSCluster");
    }

    return this.invokeAPI("createAWSCluster", "/api/v1/datahub/createAWSCluster", input, new GenericType<CreateAWSClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create Auto Scaling rules for a DataHub cluster
   * @param input
   * @return CreateAutoScaleRulesResponse
   */
  public CreateAutoScaleRulesResponse createAutoScaleRules(CreateAutoScaleRulesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAutoScaleRules");
    }

    return this.invokeAPI("createAutoScaleRules", "/api/v1/datahub/createAutoScaleRules", input, new GenericType<CreateAutoScaleRulesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates an Azure workload cluster.
   * @param input
   * @return CreateAzureClusterResponse
   */
  public CreateAzureClusterResponse createAzureCluster(CreateAzureClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAzureCluster");
    }

    return this.invokeAPI("createAzureCluster", "/api/v1/datahub/createAzureCluster", input, new GenericType<CreateAzureClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a cluster definition. A cluster definition is a reusable template in JSON format that can be used for creating multiple Data Hub clusters with identical cloud provider settings.
   * @param input
   * @return CreateClusterDefinitionResponse
   */
  public CreateClusterDefinitionResponse createClusterDefinition(CreateClusterDefinitionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createClusterDefinition");
    }

    return this.invokeAPI("createClusterDefinition", "/api/v1/datahub/createClusterDefinition", input, new GenericType<CreateClusterDefinitionResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a cluster template. A cluster template is a reusable template in JSON format that can be used for creating multiple Data Hub clusters with identical Cloudera Runtime settings.
   * @param input
   * @return CreateClusterTemplateResponse
   */
  public CreateClusterTemplateResponse createClusterTemplate(CreateClusterTemplateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createClusterTemplate");
    }

    return this.invokeAPI("createClusterTemplate", "/api/v1/datahub/createClusterTemplate", input, new GenericType<CreateClusterTemplateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a GCP workload cluster.
   * @param input
   * @return CreateGCPClusterResponse
   */
  public CreateGCPClusterResponse createGCPCluster(CreateGCPClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createGCPCluster");
    }

    return this.invokeAPI("createGCPCluster", "/api/v1/datahub/createGCPCluster", input, new GenericType<CreateGCPClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates recipe. A recipe is a script that runs on all nodes of a specified instance group.
   * @param input
   * @return CreateRecipeResponse
   */
  public CreateRecipeResponse createRecipe(CreateRecipeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createRecipe");
    }

    return this.invokeAPI("createRecipe", "/api/v1/datahub/createRecipe", input, new GenericType<CreateRecipeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete AutoScaling policies for a DataHub cluster
   * @param input
   * @return DeleteAutoScaleRulesResponse
   */
  public DeleteAutoScaleRulesResponse deleteAutoScaleRules(DeleteAutoScaleRulesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteAutoScaleRules");
    }

    return this.invokeAPI("deleteAutoScaleRules", "/api/v1/datahub/deleteAutoScaleRules", input, new GenericType<DeleteAutoScaleRulesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a workload cluster.
   * @param input
   * @return DeleteClusterResponse
   */
  public DeleteClusterResponse deleteCluster(DeleteClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteCluster");
    }

    return this.invokeAPI("deleteCluster", "/api/v1/datahub/deleteCluster", input, new GenericType<DeleteClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes cluster definitions. A cluster definition is a reusable template in JSON format that can be used for creating multiple Data Hub clusters with identical cloud provider settings.
   * @param input
   * @return DeleteClusterDefinitionsResponse
   */
  public DeleteClusterDefinitionsResponse deleteClusterDefinitions(DeleteClusterDefinitionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteClusterDefinitions");
    }

    return this.invokeAPI("deleteClusterDefinitions", "/api/v1/datahub/deleteClusterDefinitions", input, new GenericType<DeleteClusterDefinitionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes cluster templates. A cluster template is a reusable template in JSON format that can be used for creating multiple Data Hub clusters with identical Cloudera Runtime settings.
   * @param input
   * @return DeleteClusterTemplatesResponse
   */
  public DeleteClusterTemplatesResponse deleteClusterTemplates(DeleteClusterTemplatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteClusterTemplates");
    }

    return this.invokeAPI("deleteClusterTemplates", "/api/v1/datahub/deleteClusterTemplates", input, new GenericType<DeleteClusterTemplatesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes instances for the specified cluster.
   * @param input
   * @return DeleteInstancesResponse
   */
  public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteInstances");
    }

    return this.invokeAPI("deleteInstances", "/api/v1/datahub/deleteInstances", input, new GenericType<DeleteInstancesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes recipes. A recipe is a script that runs on all nodes of a specified instance group.
   * @param input
   * @return DeleteRecipesResponse
   */
  public DeleteRecipesResponse deleteRecipes(DeleteRecipesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteRecipes");
    }

    return this.invokeAPI("deleteRecipes", "/api/v1/datahub/deleteRecipes", input, new GenericType<DeleteRecipesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe the AutoScaling policies for a DataHub cluster
   * @param input
   * @return DescribeAutoScaleRulesResponse
   */
  public DescribeAutoScaleRulesResponse describeAutoScaleRules(DescribeAutoScaleRulesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeAutoScaleRules");
    }

    return this.invokeAPI("describeAutoScaleRules", "/api/v1/datahub/describeAutoScaleRules", input, new GenericType<DescribeAutoScaleRulesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes a workload cluster.
   * @param input
   * @return DescribeClusterResponse
   */
  public DescribeClusterResponse describeCluster(DescribeClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeCluster");
    }

    return this.invokeAPI("describeCluster", "/api/v1/datahub/describeCluster", input, new GenericType<DescribeClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes a cluster definition. A cluster definition is a reusable template in JSON format that can be used for creating multiple Data Hub clusters with identical cloud provider settings.
   * @param input
   * @return DescribeClusterDefinitionResponse
   */
  public DescribeClusterDefinitionResponse describeClusterDefinition(DescribeClusterDefinitionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeClusterDefinition");
    }

    return this.invokeAPI("describeClusterDefinition", "/api/v1/datahub/describeClusterDefinition", input, new GenericType<DescribeClusterDefinitionResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes a cluster template. A cluster template is a reusable template in JSON format that can be used for creating multiple Data Hub clusters with identical Cloudera Runtime settings.
   * @param input
   * @return DescribeClusterTemplateResponse
   */
  public DescribeClusterTemplateResponse describeClusterTemplate(DescribeClusterTemplateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeClusterTemplate");
    }

    return this.invokeAPI("describeClusterTemplate", "/api/v1/datahub/describeClusterTemplate", input, new GenericType<DescribeClusterTemplateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes recipe. A recipe is a script that runs on all nodes of a specified instance group.
   * @param input
   * @return DescribeRecipeResponse
   */
  public DescribeRecipeResponse describeRecipe(DescribeRecipeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeRecipe");
    }

    return this.invokeAPI("describeRecipe", "/api/v1/datahub/describeRecipe", input, new GenericType<DescribeRecipeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get cluster host status.
   * @param input
   * @return GetClusterHostStatusResponse
   */
  public GetClusterHostStatusResponse getClusterHostStatus(GetClusterHostStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getClusterHostStatus");
    }

    return this.invokeAPI("getClusterHostStatus", "/api/v1/datahub/getClusterHostStatus", input, new GenericType<GetClusterHostStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get cluster service status.
   * @param input
   * @return GetClusterServiceStatusResponse
   */
  public GetClusterServiceStatusResponse getClusterServiceStatus(GetClusterServiceStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getClusterServiceStatus");
    }

    return this.invokeAPI("getClusterServiceStatus", "/api/v1/datahub/getClusterServiceStatus", input, new GenericType<GetClusterServiceStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gather Cloudera Manager roles that can be used for filtering in CM based diagnostics collection.
   * @param input
   * @return GetCmRolesResponse
   */
  public GetCmRolesResponse getCmRoles(GetCmRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getCmRoles");
    }

    return this.invokeAPI("getCmRoles", "/api/v1/datahub/getCmRoles", input, new GenericType<GetCmRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gather log descriptors that are used for diagnostics collection.
   * @param input
   * @return GetDatahubLogDescriptorsResponse
   */
  public GetDatahubLogDescriptorsResponse getDatahubLogDescriptors(GetDatahubLogDescriptorsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDatahubLogDescriptors");
    }

    return this.invokeAPI("getDatahubLogDescriptors", "/api/v1/datahub/getDatahubLogDescriptors", input, new GenericType<GetDatahubLogDescriptorsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List AutoScale history activity for a DataHub cluster.
   * @param input
   * @return ListAutoScaleHistoryResponse
   */
  public ListAutoScaleHistoryResponse listAutoScaleHistory(ListAutoScaleHistoryRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listAutoScaleHistory");
    }

    return this.invokeAPI("listAutoScaleHistory", "/api/v1/datahub/listAutoScaleHistory", input, new GenericType<ListAutoScaleHistoryResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists cluster definitions. A cluster definition is a reusable template in JSON format that can be used for creating multiple Data Hub clusters with identical cloud provider settings.
   * @param input
   * @return ListClusterDefinitionsResponse
   */
  public ListClusterDefinitionsResponse listClusterDefinitions(ListClusterDefinitionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusterDefinitions");
    }

    return this.invokeAPI("listClusterDefinitions", "/api/v1/datahub/listClusterDefinitions", input, new GenericType<ListClusterDefinitionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists cluster templates. A cluster template is a reusable template in JSON format that can be used for creating multiple Data Hub clusters with identical Cloudera Runtime settings.
   * @param input
   * @return ListClusterTemplatesResponse
   */
  public ListClusterTemplatesResponse listClusterTemplates(ListClusterTemplatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusterTemplates");
    }

    return this.invokeAPI("listClusterTemplates", "/api/v1/datahub/listClusterTemplates", input, new GenericType<ListClusterTemplatesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists workload clusters.
   * @param input
   * @return ListClustersResponse
   */
  public ListClustersResponse listClusters(ListClustersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusters");
    }

    return this.invokeAPI("listClusters", "/api/v1/datahub/listClusters", input, new GenericType<ListClustersResponse>(){}, NO_EXTENSION);
  }

  /**
   * List recent Datahub diagnostics collections
   * @param input
   * @return ListDatahubDiagnosticsResponse
   */
  public ListDatahubDiagnosticsResponse listDatahubDiagnostics(ListDatahubDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDatahubDiagnostics");
    }

    return this.invokeAPI("listDatahubDiagnostics", "/api/v1/datahub/listDatahubDiagnostics", input, new GenericType<ListDatahubDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists recipes. A recipe is a script that runs on all nodes of a specified instance group.
   * @param input
   * @return ListRecipesResponse
   */
  public ListRecipesResponse listRecipes(ListRecipesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listRecipes");
    }

    return this.invokeAPI("listRecipes", "/api/v1/datahub/listRecipes", input, new GenericType<ListRecipesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Renew certificate on datahub cluster by name or CRN
   * @param input
   * @return RenewCertificateResponse
   */
  public RenewCertificateResponse renewCertificate(RenewCertificateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling renewCertificate");
    }

    return this.invokeAPI("renewCertificate", "/api/v1/datahub/renewCertificate", input, new GenericType<RenewCertificateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Renews public certificate on a Datahub cluster by name or CRN.
   * @param input
   * @return RenewPublicCertificateResponse
   */
  public RenewPublicCertificateResponse renewPublicCertificate(RenewPublicCertificateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling renewPublicCertificate");
    }

    return this.invokeAPI("renewPublicCertificate", "/api/v1/datahub/renewPublicCertificate", input, new GenericType<RenewPublicCertificateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Repairs a cluster.
   * @param input
   * @return RepairClusterResponse
   */
  public RepairClusterResponse repairCluster(RepairClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling repairCluster");
    }

    return this.invokeAPI("repairCluster", "/api/v1/datahub/repairCluster", input, new GenericType<RepairClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Replaces recipes for the given instance groups.
   * @param input
   * @return ReplaceRecipesResponse
   */
  public ReplaceRecipesResponse replaceRecipes(ReplaceRecipesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling replaceRecipes");
    }

    return this.invokeAPI("replaceRecipes", "/api/v1/datahub/replaceRecipes", input, new GenericType<ReplaceRecipesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retries creation of a failed workload cluster.
   * @param input
   * @return RetryClusterResponse
   */
  public RetryClusterResponse retryCluster(RetryClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling retryCluster");
    }

    return this.invokeAPI("retryCluster", "/api/v1/datahub/retryCluster", input, new GenericType<RetryClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Rotate autotls certificates on the datahub&#39;s hosts
   * @param input
   * @return RotateAutoTlsCertificatesResponse
   */
  public RotateAutoTlsCertificatesResponse rotateAutoTlsCertificates(RotateAutoTlsCertificatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling rotateAutoTlsCertificates");
    }

    return this.invokeAPI("rotateAutoTlsCertificates", "/api/v1/datahub/rotateAutoTlsCertificates", input, new GenericType<RotateAutoTlsCertificatesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Rotates private certificates on the hosts of Datahub.
   * @param input
   * @return RotatePrivateCertificatesResponse
   */
  public RotatePrivateCertificatesResponse rotatePrivateCertificates(RotatePrivateCertificatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling rotatePrivateCertificates");
    }

    return this.invokeAPI("rotatePrivateCertificates", "/api/v1/datahub/rotatePrivateCertificates", input, new GenericType<RotatePrivateCertificatesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Scales a cluster by adding or removing cluster nodes.
   * @param input
   * @return ScaleClusterResponse
   */
  public ScaleClusterResponse scaleCluster(ScaleClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling scaleCluster");
    }

    return this.invokeAPI("scaleCluster", "/api/v1/datahub/scaleCluster", input, new GenericType<ScaleClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Sets a catalog for a DataHub.
   * @param input
   * @return SetCatalogResponse
   */
  public SetCatalogResponse setCatalog(SetCatalogRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setCatalog");
    }

    return this.invokeAPI("setCatalog", "/api/v1/datahub/setCatalog", input, new GenericType<SetCatalogResponse>(){}, NO_EXTENSION);
  }

  /**
   * Starts a stopped workload cluster.
   * @param input
   * @return StartClusterResponse
   */
  public StartClusterResponse startCluster(StartClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startCluster");
    }

    return this.invokeAPI("startCluster", "/api/v1/datahub/startCluster", input, new GenericType<StartClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Stops a workload cluster.
   * @param input
   * @return StopClusterResponse
   */
  public StopClusterResponse stopCluster(StopClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling stopCluster");
    }

    return this.invokeAPI("stopCluster", "/api/v1/datahub/stopCluster", input, new GenericType<StopClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Synchronizes the state of a cluster with the cloud provider and Cloudera Manager.
   * @param input
   * @return SyncClusterResponse
   */
  public SyncClusterResponse syncCluster(SyncClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling syncCluster");
    }

    return this.invokeAPI("syncCluster", "/api/v1/datahub/syncCluster", input, new GenericType<SyncClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Syncs component versions from CM after a failed upgrade.
   * @param input
   * @return SyncComponentVersionsFromCmResponse
   */
  public SyncComponentVersionsFromCmResponse syncComponentVersionsFromCm(SyncComponentVersionsFromCmRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling syncComponentVersionsFromCm");
    }

    return this.invokeAPI("syncComponentVersionsFromCm", "/api/v1/datahub/syncComponentVersionsFromCm", input, new GenericType<SyncComponentVersionsFromCmResponse>(){}, NO_EXTENSION);
  }

  /**
   * Modify AutoScaling for a DataHub cluster
   * @param input
   * @return UpdateAutoScaleRulesResponse
   */
  public UpdateAutoScaleRulesResponse updateAutoScaleRules(UpdateAutoScaleRulesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAutoScaleRules");
    }

    return this.invokeAPI("updateAutoScaleRules", "/api/v1/datahub/updateAutoScaleRules", input, new GenericType<UpdateAutoScaleRulesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades the OS or data platform on a datahub cluster.
   * @param input
   * @return UpgradeClusterResponse
   */
  public UpgradeClusterResponse upgradeCluster(UpgradeClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeCluster");
    }

    return this.invokeAPI("upgradeCluster", "/api/v1/datahub/upgradeCluster", input, new GenericType<UpgradeClusterResponse>(){}, NO_EXTENSION);
  }
}
