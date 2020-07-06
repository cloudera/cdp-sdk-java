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

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.datahub.model.CreateAWSClusterRequest;
import com.cloudera.cdp.datahub.model.CreateAWSClusterResponse;
import com.cloudera.cdp.datahub.model.CreateAzureClusterRequest;
import com.cloudera.cdp.datahub.model.CreateAzureClusterResponse;
import com.cloudera.cdp.datahub.model.CreateClusterDefinitionRequest;
import com.cloudera.cdp.datahub.model.CreateClusterDefinitionResponse;
import com.cloudera.cdp.datahub.model.CreateClusterTemplateRequest;
import com.cloudera.cdp.datahub.model.CreateClusterTemplateResponse;
import com.cloudera.cdp.datahub.model.CreateRecipeRequest;
import com.cloudera.cdp.datahub.model.CreateRecipeResponse;
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
import com.cloudera.cdp.datahub.model.ListClusterDefinitionsRequest;
import com.cloudera.cdp.datahub.model.ListClusterDefinitionsResponse;
import com.cloudera.cdp.datahub.model.ListClusterTemplatesRequest;
import com.cloudera.cdp.datahub.model.ListClusterTemplatesResponse;
import com.cloudera.cdp.datahub.model.ListClustersRequest;
import com.cloudera.cdp.datahub.model.ListClustersResponse;
import com.cloudera.cdp.datahub.model.ListRecipesRequest;
import com.cloudera.cdp.datahub.model.ListRecipesResponse;
import com.cloudera.cdp.datahub.model.RepairClusterRequest;
import com.cloudera.cdp.datahub.model.RepairClusterResponse;
import com.cloudera.cdp.datahub.model.RetryClusterRequest;
import com.cloudera.cdp.datahub.model.RetryClusterResponse;
import com.cloudera.cdp.datahub.model.ScaleClusterRequest;
import com.cloudera.cdp.datahub.model.ScaleClusterResponse;
import com.cloudera.cdp.datahub.model.StartClusterRequest;
import com.cloudera.cdp.datahub.model.StartClusterResponse;
import com.cloudera.cdp.datahub.model.StopClusterRequest;
import com.cloudera.cdp.datahub.model.StopClusterResponse;
import com.cloudera.cdp.datahub.model.SyncClusterRequest;
import com.cloudera.cdp.datahub.model.SyncClusterResponse;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-07-06T11:30:38.416-07:00")
public class DatahubClient extends CdpClient {

  public static final String SERVICE_NAME = "api";

  public DatahubClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
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
    return this.invokeAPI("/api/v1/datahub/createAWSCluster", input, new GenericType<CreateAWSClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/createAzureCluster", input, new GenericType<CreateAzureClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/createClusterDefinition", input, new GenericType<CreateClusterDefinitionResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/createClusterTemplate", input, new GenericType<CreateClusterTemplateResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/createRecipe", input, new GenericType<CreateRecipeResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/deleteCluster", input, new GenericType<DeleteClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/deleteClusterDefinitions", input, new GenericType<DeleteClusterDefinitionsResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/deleteClusterTemplates", input, new GenericType<DeleteClusterTemplatesResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/deleteInstances", input, new GenericType<DeleteInstancesResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/deleteRecipes", input, new GenericType<DeleteRecipesResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/describeCluster", input, new GenericType<DescribeClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/describeClusterDefinition", input, new GenericType<DescribeClusterDefinitionResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/describeClusterTemplate", input, new GenericType<DescribeClusterTemplateResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/describeRecipe", input, new GenericType<DescribeRecipeResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/getClusterHostStatus", input, new GenericType<GetClusterHostStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/getClusterServiceStatus", input, new GenericType<GetClusterServiceStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/listClusterDefinitions", input, new GenericType<ListClusterDefinitionsResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/listClusterTemplates", input, new GenericType<ListClusterTemplatesResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/listClusters", input, new GenericType<ListClustersResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/listRecipes", input, new GenericType<ListRecipesResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/repairCluster", input, new GenericType<RepairClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/retryCluster", input, new GenericType<RetryClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/scaleCluster", input, new GenericType<ScaleClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/startCluster", input, new GenericType<StartClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/stopCluster", input, new GenericType<StopClusterResponse>(){});
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
    return this.invokeAPI("/api/v1/datahub/syncCluster", input, new GenericType<SyncClusterResponse>(){});
  }
}
