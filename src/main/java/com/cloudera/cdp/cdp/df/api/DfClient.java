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

package com.cloudera.cdp.df.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.df.model.AddReadyflowRequest;
import com.cloudera.cdp.df.model.AddReadyflowResponse;
import com.cloudera.cdp.df.model.CancelDeleteProjectRequest;
import com.cloudera.cdp.df.model.CancelDeleteProjectResponse;
import com.cloudera.cdp.df.model.CreateFlowVersionTagRequest;
import com.cloudera.cdp.df.model.CreateFlowVersionTagResponse;
import com.cloudera.cdp.df.model.CreateProjectRequest;
import com.cloudera.cdp.df.model.CreateProjectResponse;
import com.cloudera.cdp.df.model.DeleteAddedReadyflowRequest;
import com.cloudera.cdp.df.model.DeleteAddedReadyflowResponse;
import com.cloudera.cdp.df.model.DeleteFlowRequest;
import com.cloudera.cdp.df.model.DeleteFlowResponse;
import com.cloudera.cdp.df.model.DeleteFlowVersionTagRequest;
import com.cloudera.cdp.df.model.DeleteFlowVersionTagResponse;
import com.cloudera.cdp.df.model.DeleteProjectRequest;
import com.cloudera.cdp.df.model.DeleteProjectResponse;
import com.cloudera.cdp.df.model.DescribeAddedReadyflowRequest;
import com.cloudera.cdp.df.model.DescribeAddedReadyflowResponse;
import com.cloudera.cdp.df.model.DescribeDeploymentEventDetailRequest;
import com.cloudera.cdp.df.model.DescribeDeploymentEventDetailResponse;
import com.cloudera.cdp.df.model.DescribeDeploymentRequest;
import com.cloudera.cdp.df.model.DescribeDeploymentResponse;
import com.cloudera.cdp.df.model.DescribeFlowRequest;
import com.cloudera.cdp.df.model.DescribeFlowResponse;
import com.cloudera.cdp.df.model.DescribeProjectRequest;
import com.cloudera.cdp.df.model.DescribeProjectResponse;
import com.cloudera.cdp.df.model.DescribeReadyflowRequest;
import com.cloudera.cdp.df.model.DescribeReadyflowResponse;
import com.cloudera.cdp.df.model.DescribeServiceEventDetailRequest;
import com.cloudera.cdp.df.model.DescribeServiceEventDetailResponse;
import com.cloudera.cdp.df.model.DescribeServiceRequest;
import com.cloudera.cdp.df.model.DescribeServiceResponse;
import com.cloudera.cdp.df.model.DisableServiceRequest;
import com.cloudera.cdp.df.model.DisableServiceResponse;
import com.cloudera.cdp.df.model.EnableServiceRequest;
import com.cloudera.cdp.df.model.EnableServiceResponse;
import com.cloudera.cdp.df.model.Error;
import com.cloudera.cdp.df.model.GetFlowVersionRequest;
import com.cloudera.cdp.df.model.GetFlowVersionResponse;
import com.cloudera.cdp.df.model.GetKubeconfigRequest;
import com.cloudera.cdp.df.model.GetKubeconfigResponse;
import com.cloudera.cdp.df.model.GrantUserKubernetesAccessRequest;
import com.cloudera.cdp.df.model.GrantUserKubernetesAccessResponse;
import com.google.common.collect.ImmutableList;
import com.cloudera.cdp.df.model.ImportFlowDefinitionRequest;
import com.cloudera.cdp.df.model.ImportFlowDefinitionResponse;
import com.cloudera.cdp.df.model.ImportFlowDefinitionVersionRequest;
import com.cloudera.cdp.df.model.ImportFlowDefinitionVersionResponse;
import com.cloudera.cdp.df.model.InitiateDeploymentRequest;
import com.cloudera.cdp.df.model.InitiateDeploymentResponse;
import com.cloudera.cdp.df.model.ListDeployableServicesForNewDeploymentsRequest;
import com.cloudera.cdp.df.model.ListDeployableServicesForNewDeploymentsResponse;
import com.cloudera.cdp.df.model.ListDeploymentActiveAlertsRequest;
import com.cloudera.cdp.df.model.ListDeploymentActiveAlertsResponse;
import com.cloudera.cdp.df.model.ListDeploymentEventsRequest;
import com.cloudera.cdp.df.model.ListDeploymentEventsResponse;
import com.cloudera.cdp.df.model.ListDeploymentKPIsRequest;
import com.cloudera.cdp.df.model.ListDeploymentKPIsResponse;
import com.cloudera.cdp.df.model.ListDeploymentSystemMetricsRequest;
import com.cloudera.cdp.df.model.ListDeploymentSystemMetricsResponse;
import com.cloudera.cdp.df.model.ListDeploymentsRequest;
import com.cloudera.cdp.df.model.ListDeploymentsResponse;
import com.cloudera.cdp.df.model.ListDiagnosticsRequest;
import com.cloudera.cdp.df.model.ListDiagnosticsResponse;
import com.cloudera.cdp.df.model.ListFilterOptionsRequest;
import com.cloudera.cdp.df.model.ListFilterOptionsResponse;
import com.cloudera.cdp.df.model.ListFlowDefinitionVersionsRequest;
import com.cloudera.cdp.df.model.ListFlowDefinitionVersionsResponse;
import com.cloudera.cdp.df.model.ListFlowDefinitionsRequest;
import com.cloudera.cdp.df.model.ListFlowDefinitionsResponse;
import com.cloudera.cdp.df.model.ListFlowVersionTagsRequest;
import com.cloudera.cdp.df.model.ListFlowVersionTagsResponse;
import com.cloudera.cdp.df.model.ListNotificationsRequest;
import com.cloudera.cdp.df.model.ListNotificationsResponse;
import com.cloudera.cdp.df.model.ListProjectFilterOptionsRequest;
import com.cloudera.cdp.df.model.ListProjectFilterOptionsResponse;
import com.cloudera.cdp.df.model.ListProjectsRequest;
import com.cloudera.cdp.df.model.ListProjectsResponse;
import com.cloudera.cdp.df.model.ListReadyflowsRequest;
import com.cloudera.cdp.df.model.ListReadyflowsResponse;
import com.cloudera.cdp.df.model.ListServiceActiveAlertsRequest;
import com.cloudera.cdp.df.model.ListServiceActiveAlertsResponse;
import com.cloudera.cdp.df.model.ListServiceEventsRequest;
import com.cloudera.cdp.df.model.ListServiceEventsResponse;
import com.cloudera.cdp.df.model.ListServiceSystemMetricsRequest;
import com.cloudera.cdp.df.model.ListServiceSystemMetricsResponse;
import com.cloudera.cdp.df.model.ListServicesRequest;
import com.cloudera.cdp.df.model.ListServicesResponse;
import com.cloudera.cdp.df.model.ListUserKubernetesAccessRequest;
import com.cloudera.cdp.df.model.ListUserKubernetesAccessResponse;
import com.cloudera.cdp.df.model.RenewCertificatesRequest;
import com.cloudera.cdp.df.model.RenewCertificatesResponse;
import com.cloudera.cdp.df.model.ResetServiceRequest;
import com.cloudera.cdp.df.model.ResetServiceResponse;
import com.cloudera.cdp.df.model.RevokeUserKubernetesAccessRequest;
import com.cloudera.cdp.df.model.RevokeUserKubernetesAccessResponse;
import com.cloudera.cdp.df.model.StartGetDiagnosticsCollectionRequest;
import com.cloudera.cdp.df.model.StartGetDiagnosticsCollectionResponse;
import com.cloudera.cdp.df.model.UpdateProjectRequest;
import com.cloudera.cdp.df.model.UpdateProjectResponse;
import com.cloudera.cdp.df.model.UpdateServiceRequest;
import com.cloudera.cdp.df.model.UpdateServiceResponse;
import com.cloudera.cdp.df.model.UpgradeServiceRequest;
import com.cloudera.cdp.df.model.UpgradeServiceResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:18.456-08:00")
public class DfClient extends CdpClient {

  public static final String SERVICE_NAME = "df";

  public DfClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DfClient(CdpRequestContext<?> context) {
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
   * Add ready flow.
   * @param input
   * @return AddReadyflowResponse
   */
  public AddReadyflowResponse addReadyflow(AddReadyflowRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addReadyflow");
    }

    return this.invokeAPI("addReadyflow", "/api/v1/df/addReadyflow", input, new GenericType<AddReadyflowResponse>(){}, NO_EXTENSION);
  }

  /**
   * Cancels deletion of a Project.
   * @param input
   * @return CancelDeleteProjectResponse
   */
  public CancelDeleteProjectResponse cancelDeleteProject(CancelDeleteProjectRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling cancelDeleteProject");
    }

    return this.invokeAPI("cancelDeleteProject", "/api/v1/df/cancelDeleteProject", input, new GenericType<CancelDeleteProjectResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create flow version tag.
   * @param input
   * @return CreateFlowVersionTagResponse
   */
  public CreateFlowVersionTagResponse createFlowVersionTag(CreateFlowVersionTagRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createFlowVersionTag");
    }

    return this.invokeAPI("createFlowVersionTag", "/api/v1/df/createFlowVersionTag", input, new GenericType<CreateFlowVersionTagResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a Project.
   * @param input
   * @return CreateProjectResponse
   */
  public CreateProjectResponse createProject(CreateProjectRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createProject");
    }

    return this.invokeAPI("createProject", "/api/v1/df/createProject", input, new GenericType<CreateProjectResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete added ready flow.
   * @param input
   * @return DeleteAddedReadyflowResponse
   */
  public DeleteAddedReadyflowResponse deleteAddedReadyflow(DeleteAddedReadyflowRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteAddedReadyflow");
    }

    return this.invokeAPI("deleteAddedReadyflow", "/api/v1/df/deleteAddedReadyflow", input, new GenericType<DeleteAddedReadyflowResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete flow.
   * @param input
   * @return DeleteFlowResponse
   */
  public DeleteFlowResponse deleteFlow(DeleteFlowRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteFlow");
    }

    return this.invokeAPI("deleteFlow", "/api/v1/df/deleteFlow", input, new GenericType<DeleteFlowResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete flow version tag.
   * @param input
   * @return DeleteFlowVersionTagResponse
   */
  public DeleteFlowVersionTagResponse deleteFlowVersionTag(DeleteFlowVersionTagRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteFlowVersionTag");
    }

    return this.invokeAPI("deleteFlowVersionTag", "/api/v1/df/deleteFlowVersionTag", input, new GenericType<DeleteFlowVersionTagResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a Project.
   * @param input
   * @return DeleteProjectResponse
   */
  public DeleteProjectResponse deleteProject(DeleteProjectRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteProject");
    }

    return this.invokeAPI("deleteProject", "/api/v1/df/deleteProject", input, new GenericType<DeleteProjectResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe added ready flow detail.
   * @param input
   * @return DescribeAddedReadyflowResponse
   */
  public DescribeAddedReadyflowResponse describeAddedReadyflow(DescribeAddedReadyflowRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeAddedReadyflow");
    }

    return this.invokeAPI("describeAddedReadyflow", "/api/v1/df/describeAddedReadyflow", input, new GenericType<DescribeAddedReadyflowResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe deployment.
   * @param input
   * @return DescribeDeploymentResponse
   */
  public DescribeDeploymentResponse describeDeployment(DescribeDeploymentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDeployment");
    }

    return this.invokeAPI("describeDeployment", "/api/v1/df/describeDeployment", input, new GenericType<DescribeDeploymentResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe event detail for deployment.
   * @param input
   * @return DescribeDeploymentEventDetailResponse
   */
  public DescribeDeploymentEventDetailResponse describeDeploymentEventDetail(DescribeDeploymentEventDetailRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDeploymentEventDetail");
    }

    return this.invokeAPI("describeDeploymentEventDetail", "/api/v1/df/describeDeploymentEventDetail", input, new GenericType<DescribeDeploymentEventDetailResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe flow.
   * @param input
   * @return DescribeFlowResponse
   */
  public DescribeFlowResponse describeFlow(DescribeFlowRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeFlow");
    }

    return this.invokeAPI("describeFlow", "/api/v1/df/describeFlow", input, new GenericType<DescribeFlowResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes a Project.
   * @param input
   * @return DescribeProjectResponse
   */
  public DescribeProjectResponse describeProject(DescribeProjectRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeProject");
    }

    return this.invokeAPI("describeProject", "/api/v1/df/describeProject", input, new GenericType<DescribeProjectResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe ready flow.
   * @param input
   * @return DescribeReadyflowResponse
   */
  public DescribeReadyflowResponse describeReadyflow(DescribeReadyflowRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeReadyflow");
    }

    return this.invokeAPI("describeReadyflow", "/api/v1/df/describeReadyflow", input, new GenericType<DescribeReadyflowResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe service.
   * @param input
   * @return DescribeServiceResponse
   */
  public DescribeServiceResponse describeService(DescribeServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeService");
    }

    return this.invokeAPI("describeService", "/api/v1/df/describeService", input, new GenericType<DescribeServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe event history detail for service.
   * @param input
   * @return DescribeServiceEventDetailResponse
   */
  public DescribeServiceEventDetailResponse describeServiceEventDetail(DescribeServiceEventDetailRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeServiceEventDetail");
    }

    return this.invokeAPI("describeServiceEventDetail", "/api/v1/df/describeServiceEventDetail", input, new GenericType<DescribeServiceEventDetailResponse>(){}, NO_EXTENSION);
  }

  /**
   * Disable service.
   * @param input
   * @return DisableServiceResponse
   */
  public DisableServiceResponse disableService(DisableServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling disableService");
    }

    return this.invokeAPI("disableService", "/api/v1/df/disableService", input, new GenericType<DisableServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Enable DataFlow service from a CDP environment.
   * @param input
   * @return EnableServiceResponse
   */
  public EnableServiceResponse enableService(EnableServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling enableService");
    }

    return this.invokeAPI("enableService", "/api/v1/df/enableService", input, new GenericType<EnableServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get flow version.
   * @param input
   * @return GetFlowVersionResponse
   */
  public GetFlowVersionResponse getFlowVersion(GetFlowVersionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getFlowVersion");
    }

    return this.invokeAPI("getFlowVersion", "/api/v1/df/getFlowVersion", input, new GenericType<GetFlowVersionResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Df.class));
  }

  /**
   * Get Kubeconfig.
   * @param input
   * @return GetKubeconfigResponse
   */
  public GetKubeconfigResponse getKubeconfig(GetKubeconfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getKubeconfig");
    }

    return this.invokeAPI("getKubeconfig", "/api/v1/df/getKubeconfig", input, new GenericType<GetKubeconfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Grant remote user access to the service&#39;s cluster.
   * @param input
   * @return GrantUserKubernetesAccessResponse
   */
  public GrantUserKubernetesAccessResponse grantUserKubernetesAccess(GrantUserKubernetesAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling grantUserKubernetesAccess");
    }

    return this.invokeAPI("grantUserKubernetesAccess", "/api/v1/df/grantUserKubernetesAccess", input, new GenericType<GrantUserKubernetesAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * Import a new flow definition.
   * @param input
   * @return ImportFlowDefinitionResponse
   */
  public ImportFlowDefinitionResponse importFlowDefinition(ImportFlowDefinitionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling importFlowDefinition");
    }

    return this.invokeAPI("importFlowDefinition", "/api/v1/df/importFlowDefinition", input, new GenericType<ImportFlowDefinitionResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Redirect.class, com.cloudera.cdp.extension.Df.class));
  }

  /**
   * Import a new flow definition version to an existing flow.
   * @param input
   * @return ImportFlowDefinitionVersionResponse
   */
  public ImportFlowDefinitionVersionResponse importFlowDefinitionVersion(ImportFlowDefinitionVersionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling importFlowDefinitionVersion");
    }

    return this.invokeAPI("importFlowDefinitionVersion", "/api/v1/df/importFlowDefinitionVersion", input, new GenericType<ImportFlowDefinitionVersionResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Redirect.class, com.cloudera.cdp.extension.Df.class));
  }

  /**
   * Initiate a deployment creation.
   * @param input
   * @return InitiateDeploymentResponse
   */
  public InitiateDeploymentResponse initiateDeployment(InitiateDeploymentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling initiateDeployment");
    }

    return this.invokeAPI("initiateDeployment", "/api/v1/df/initiateDeployment", input, new GenericType<InitiateDeploymentResponse>(){}, NO_EXTENSION);
  }

  /**
   * List services that a DataFlow Admin can deploy to.
   * @param input
   * @return ListDeployableServicesForNewDeploymentsResponse
   */
  public ListDeployableServicesForNewDeploymentsResponse listDeployableServicesForNewDeployments(ListDeployableServicesForNewDeploymentsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDeployableServicesForNewDeployments");
    }

    return this.invokeAPI("listDeployableServicesForNewDeployments", "/api/v1/df/listDeployableServicesForNewDeployments", input, new GenericType<ListDeployableServicesForNewDeploymentsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List active alerts for deployment.
   * @param input
   * @return ListDeploymentActiveAlertsResponse
   */
  public ListDeploymentActiveAlertsResponse listDeploymentActiveAlerts(ListDeploymentActiveAlertsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDeploymentActiveAlerts");
    }

    return this.invokeAPI("listDeploymentActiveAlerts", "/api/v1/df/listDeploymentActiveAlerts", input, new GenericType<ListDeploymentActiveAlertsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List event history for deployment.
   * @param input
   * @return ListDeploymentEventsResponse
   */
  public ListDeploymentEventsResponse listDeploymentEvents(ListDeploymentEventsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDeploymentEvents");
    }

    return this.invokeAPI("listDeploymentEvents", "/api/v1/df/listDeploymentEvents", input, new GenericType<ListDeploymentEventsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List deployment KPIs.
   * @param input
   * @return ListDeploymentKPIsResponse
   */
  public ListDeploymentKPIsResponse listDeploymentKPIs(ListDeploymentKPIsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDeploymentKPIs");
    }

    return this.invokeAPI("listDeploymentKPIs", "/api/v1/df/listDeploymentKPIs", input, new GenericType<ListDeploymentKPIsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List deployment System metrics.
   * @param input
   * @return ListDeploymentSystemMetricsResponse
   */
  public ListDeploymentSystemMetricsResponse listDeploymentSystemMetrics(ListDeploymentSystemMetricsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDeploymentSystemMetrics");
    }

    return this.invokeAPI("listDeploymentSystemMetrics", "/api/v1/df/listDeploymentSystemMetrics", input, new GenericType<ListDeploymentSystemMetricsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List deployments.
   * @param input
   * @return ListDeploymentsResponse
   */
  public ListDeploymentsResponse listDeployments(ListDeploymentsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDeployments");
    }

    return this.invokeAPI("listDeployments", "/api/v1/df/listDeployments", input, new GenericType<ListDeploymentsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List diagnostics.
   * @param input
   * @return ListDiagnosticsResponse
   */
  public ListDiagnosticsResponse listDiagnostics(ListDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDiagnostics");
    }

    return this.invokeAPI("listDiagnostics", "/api/v1/df/listDiagnostics", input, new GenericType<ListDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List filter options.
   * @param input
   * @return ListFilterOptionsResponse
   */
  public ListFilterOptionsResponse listFilterOptions(ListFilterOptionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listFilterOptions");
    }

    return this.invokeAPI("listFilterOptions", "/api/v1/df/listFilterOptions", input, new GenericType<ListFilterOptionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List flow definition versions.
   * @param input
   * @return ListFlowDefinitionVersionsResponse
   */
  public ListFlowDefinitionVersionsResponse listFlowDefinitionVersions(ListFlowDefinitionVersionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listFlowDefinitionVersions");
    }

    return this.invokeAPI("listFlowDefinitionVersions", "/api/v1/df/listFlowDefinitionVersions", input, new GenericType<ListFlowDefinitionVersionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List flow definitions.
   * @param input
   * @return ListFlowDefinitionsResponse
   */
  public ListFlowDefinitionsResponse listFlowDefinitions(ListFlowDefinitionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listFlowDefinitions");
    }

    return this.invokeAPI("listFlowDefinitions", "/api/v1/df/listFlowDefinitions", input, new GenericType<ListFlowDefinitionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List flow version tags.
   * @param input
   * @return ListFlowVersionTagsResponse
   */
  public ListFlowVersionTagsResponse listFlowVersionTags(ListFlowVersionTagsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listFlowVersionTags");
    }

    return this.invokeAPI("listFlowVersionTags", "/api/v1/df/listFlowVersionTags", input, new GenericType<ListFlowVersionTagsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List notifications.
   * @param input
   * @return ListNotificationsResponse
   */
  public ListNotificationsResponse listNotifications(ListNotificationsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listNotifications");
    }

    return this.invokeAPI("listNotifications", "/api/v1/df/listNotifications", input, new GenericType<ListNotificationsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List filter options.
   * @param input
   * @return ListProjectFilterOptionsResponse
   */
  public ListProjectFilterOptionsResponse listProjectFilterOptions(ListProjectFilterOptionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listProjectFilterOptions");
    }

    return this.invokeAPI("listProjectFilterOptions", "/api/v1/df/listProjectFilterOptions", input, new GenericType<ListProjectFilterOptionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Projects.
   * @param input
   * @return ListProjectsResponse
   */
  public ListProjectsResponse listProjects(ListProjectsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listProjects");
    }

    return this.invokeAPI("listProjects", "/api/v1/df/listProjects", input, new GenericType<ListProjectsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List ready flows.
   * @param input
   * @return ListReadyflowsResponse
   */
  public ListReadyflowsResponse listReadyflows(ListReadyflowsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listReadyflows");
    }

    return this.invokeAPI("listReadyflows", "/api/v1/df/listReadyflows", input, new GenericType<ListReadyflowsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List active alerts for service.
   * @param input
   * @return ListServiceActiveAlertsResponse
   */
  public ListServiceActiveAlertsResponse listServiceActiveAlerts(ListServiceActiveAlertsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listServiceActiveAlerts");
    }

    return this.invokeAPI("listServiceActiveAlerts", "/api/v1/df/listServiceActiveAlerts", input, new GenericType<ListServiceActiveAlertsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List events for service.
   * @param input
   * @return ListServiceEventsResponse
   */
  public ListServiceEventsResponse listServiceEvents(ListServiceEventsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listServiceEvents");
    }

    return this.invokeAPI("listServiceEvents", "/api/v1/df/listServiceEvents", input, new GenericType<ListServiceEventsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List service System metrics.
   * @param input
   * @return ListServiceSystemMetricsResponse
   */
  public ListServiceSystemMetricsResponse listServiceSystemMetrics(ListServiceSystemMetricsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listServiceSystemMetrics");
    }

    return this.invokeAPI("listServiceSystemMetrics", "/api/v1/df/listServiceSystemMetrics", input, new GenericType<ListServiceSystemMetricsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List services.
   * @param input
   * @return ListServicesResponse
   */
  public ListServicesResponse listServices(ListServicesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listServices");
    }

    return this.invokeAPI("listServices", "/api/v1/df/listServices", input, new GenericType<ListServicesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List users that have access to the service&#39;s cluster.
   * @param input
   * @return ListUserKubernetesAccessResponse
   */
  public ListUserKubernetesAccessResponse listUserKubernetesAccess(ListUserKubernetesAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listUserKubernetesAccess");
    }

    return this.invokeAPI("listUserKubernetesAccess", "/api/v1/df/listUserKubernetesAccess", input, new GenericType<ListUserKubernetesAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * Renew workload UI certificates.
   * @param input
   * @return RenewCertificatesResponse
   */
  public RenewCertificatesResponse renewCertificates(RenewCertificatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling renewCertificates");
    }

    return this.invokeAPI("renewCertificates", "/api/v1/df/renewCertificates", input, new GenericType<RenewCertificatesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Resets all references to a service. Only not-enabled services can be reset. Makes no attempt to clean-up resources.
   * @param input
   * @return ResetServiceResponse
   */
  public ResetServiceResponse resetService(ResetServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling resetService");
    }

    return this.invokeAPI("resetService", "/api/v1/df/resetService", input, new GenericType<ResetServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Revoke access for the remote user from the service&#39;s cluster.
   * @param input
   * @return RevokeUserKubernetesAccessResponse
   */
  public RevokeUserKubernetesAccessResponse revokeUserKubernetesAccess(RevokeUserKubernetesAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling revokeUserKubernetesAccess");
    }

    return this.invokeAPI("revokeUserKubernetesAccess", "/api/v1/df/revokeUserKubernetesAccess", input, new GenericType<RevokeUserKubernetesAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start diagnostics collection.
   * @param input
   * @return StartGetDiagnosticsCollectionResponse
   */
  public StartGetDiagnosticsCollectionResponse startGetDiagnosticsCollection(StartGetDiagnosticsCollectionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startGetDiagnosticsCollection");
    }

    return this.invokeAPI("startGetDiagnosticsCollection", "/api/v1/df/startGetDiagnosticsCollection", input, new GenericType<StartGetDiagnosticsCollectionResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates a Project.
   * @param input
   * @return UpdateProjectResponse
   */
  public UpdateProjectResponse updateProject(UpdateProjectRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateProject");
    }

    return this.invokeAPI("updateProject", "/api/v1/df/updateProject", input, new GenericType<UpdateProjectResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update service.
   * @param input
   * @return UpdateServiceResponse
   */
  public UpdateServiceResponse updateService(UpdateServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateService");
    }

    return this.invokeAPI("updateService", "/api/v1/df/updateService", input, new GenericType<UpdateServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrade service.
   * @param input
   * @return UpgradeServiceResponse
   */
  public UpgradeServiceResponse upgradeService(UpgradeServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeService");
    }

    return this.invokeAPI("upgradeService", "/api/v1/df/upgradeService", input, new GenericType<UpgradeServiceResponse>(){}, NO_EXTENSION);
  }
}
