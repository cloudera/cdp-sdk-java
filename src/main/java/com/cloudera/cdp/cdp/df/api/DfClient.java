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
import com.cloudera.cdp.df.model.DeleteAddedReadyflowRequest;
import com.cloudera.cdp.df.model.DeleteAddedReadyflowResponse;
import com.cloudera.cdp.df.model.DeleteFlowRequest;
import com.cloudera.cdp.df.model.DeleteFlowResponse;
import com.cloudera.cdp.df.model.DescribeAddedReadyflowRequest;
import com.cloudera.cdp.df.model.DescribeAddedReadyflowResponse;
import com.cloudera.cdp.df.model.DescribeDeploymentEventDetailRequest;
import com.cloudera.cdp.df.model.DescribeDeploymentEventDetailResponse;
import com.cloudera.cdp.df.model.DescribeDeploymentRequest;
import com.cloudera.cdp.df.model.DescribeDeploymentResponse;
import com.cloudera.cdp.df.model.DescribeFlowRequest;
import com.cloudera.cdp.df.model.DescribeFlowResponse;
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
import com.cloudera.cdp.df.model.ListFilterOptionsRequest;
import com.cloudera.cdp.df.model.ListFilterOptionsResponse;
import com.cloudera.cdp.df.model.ListFlowDefinitionsRequest;
import com.cloudera.cdp.df.model.ListFlowDefinitionsResponse;
import com.cloudera.cdp.df.model.ListNotificationsRequest;
import com.cloudera.cdp.df.model.ListNotificationsResponse;
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
import com.cloudera.cdp.df.model.UpdateServiceRequest;
import com.cloudera.cdp.df.model.UpdateServiceResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-07-12T15:10:00.396-07:00")
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
}
