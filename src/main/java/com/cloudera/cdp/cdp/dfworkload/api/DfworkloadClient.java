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

package com.cloudera.cdp.dfworkload.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.dfworkload.model.AbortAssetUpdateRequestRequest;
import com.cloudera.cdp.dfworkload.model.AbortAssetUpdateRequestResponse;
import com.cloudera.cdp.dfworkload.model.AbortDeploymentRequestRequest;
import com.cloudera.cdp.dfworkload.model.AbortDeploymentRequestResponse;
import com.cloudera.cdp.dfworkload.model.CancelNifiVersionUpdateRequest;
import com.cloudera.cdp.dfworkload.model.CancelNifiVersionUpdateResponse;
import com.cloudera.cdp.dfworkload.model.CreateAssetUpdateRequestRequest;
import com.cloudera.cdp.dfworkload.model.CreateAssetUpdateRequestResponse;
import com.cloudera.cdp.dfworkload.model.CreateCustomNarConfigurationRequest;
import com.cloudera.cdp.dfworkload.model.CreateCustomNarConfigurationResponse;
import com.cloudera.cdp.dfworkload.model.CreateDeploymentRequest;
import com.cloudera.cdp.dfworkload.model.CreateDeploymentResponse;
import com.cloudera.cdp.dfworkload.model.CreateInboundConnectionEndpointRequest;
import com.cloudera.cdp.dfworkload.model.CreateInboundConnectionEndpointResponse;
import com.cloudera.cdp.dfworkload.model.DeleteCustomNarConfigurationRequest;
import com.cloudera.cdp.dfworkload.model.DeleteCustomNarConfigurationResponse;
import com.cloudera.cdp.dfworkload.model.DeleteInboundConnectionEndpointRequest;
import com.cloudera.cdp.dfworkload.model.DeleteInboundConnectionEndpointResponse;
import com.cloudera.cdp.dfworkload.model.DescribeInboundConnectionEndpointRequest;
import com.cloudera.cdp.dfworkload.model.DescribeInboundConnectionEndpointResponse;
import com.cloudera.cdp.dfworkload.model.Error;
import com.cloudera.cdp.dfworkload.model.GetCustomNarConfigurationRequest;
import com.cloudera.cdp.dfworkload.model.GetCustomNarConfigurationResponse;
import com.cloudera.cdp.dfworkload.model.GetDefaultCustomNarConfigurationRequest;
import com.cloudera.cdp.dfworkload.model.GetDefaultCustomNarConfigurationResponse;
import com.cloudera.cdp.dfworkload.model.GetDeploymentConfigurationMetadataRequest;
import com.cloudera.cdp.dfworkload.model.GetDeploymentConfigurationMetadataResponse;
import com.cloudera.cdp.dfworkload.model.GetDeploymentConfigurationRequest;
import com.cloudera.cdp.dfworkload.model.GetDeploymentConfigurationResponse;
import com.cloudera.cdp.dfworkload.model.GetDeploymentRequestDetailsRequest;
import com.cloudera.cdp.dfworkload.model.GetDeploymentRequestDetailsResponse;
import com.google.common.collect.ImmutableList;
import com.cloudera.cdp.dfworkload.model.InboundConnectionEndpointClientCertificateRequest;
import com.cloudera.cdp.dfworkload.model.InboundConnectionEndpointClientCertificateResponse;
import com.cloudera.cdp.dfworkload.model.InboundConnectionEndpointClientPrivateKeyRequest;
import com.cloudera.cdp.dfworkload.model.InboundConnectionEndpointClientPrivateKeyResponse;
import com.cloudera.cdp.dfworkload.model.ListInboundConnectionEndpointsRequest;
import com.cloudera.cdp.dfworkload.model.ListInboundConnectionEndpointsResponse;
import com.cloudera.cdp.dfworkload.model.ListNifiVersionsRequest;
import com.cloudera.cdp.dfworkload.model.ListNifiVersionsResponse;
import com.cloudera.cdp.dfworkload.model.RenewInboundConnectionEndpointCertificateRequest;
import com.cloudera.cdp.dfworkload.model.RenewInboundConnectionEndpointCertificateResponse;
import com.cloudera.cdp.dfworkload.model.TerminateDeploymentRequest;
import com.cloudera.cdp.dfworkload.model.TerminateDeploymentResponse;
import com.cloudera.cdp.dfworkload.model.TransitionFlowRequest;
import com.cloudera.cdp.dfworkload.model.TransitionFlowResponse;
import com.cloudera.cdp.dfworkload.model.UpdateCustomNarConfigurationRequest;
import com.cloudera.cdp.dfworkload.model.UpdateCustomNarConfigurationResponse;
import com.cloudera.cdp.dfworkload.model.UpdateDeploymentRequest;
import com.cloudera.cdp.dfworkload.model.UpdateDeploymentResponse;
import com.cloudera.cdp.dfworkload.model.UpdateNifiVersionRequest;
import com.cloudera.cdp.dfworkload.model.UpdateNifiVersionResponse;
import com.cloudera.cdp.dfworkload.model.UploadAssetRequest;
import com.cloudera.cdp.dfworkload.model.UploadAssetResponse;
import com.cloudera.cdp.dfworkload.model.ValidateCustomNarConfigurationRequest;
import com.cloudera.cdp.dfworkload.model.ValidateCustomNarConfigurationResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-20T13:40:36.573-07:00")
public class DfworkloadClient extends CdpClient {

  public static final String SERVICE_NAME = "dfworkload";

  public DfworkloadClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DfworkloadClient(CdpRequestContext<?> context) {
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
   * Aborts asset update request.
   * @param input Abort Asset Update Request
   * @return AbortAssetUpdateRequestResponse
   */
  @WorkloadApi
  public AbortAssetUpdateRequestResponse abortAssetUpdateRequest(AbortAssetUpdateRequestRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling abortAssetUpdateRequest");
    }

    return this.invokeAPI("abortAssetUpdateRequest", "/dfx/api/rpc-v1/deployments/abort-asset-update-request", input, new GenericType<AbortAssetUpdateRequestResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Aborts a deployment request.
   * @param input Abort Deployment Request
   * @return AbortDeploymentRequestResponse
   */
  @WorkloadApi
  public AbortDeploymentRequestResponse abortDeploymentRequest(AbortDeploymentRequestRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling abortDeploymentRequest");
    }

    return this.invokeAPI("abortDeploymentRequest", "/dfx/api/rpc-v1/deployments/abort-deployment-request", input, new GenericType<AbortDeploymentRequestResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Cancels a NiFi version update for a deployment.
   * @param input Cancel NiFi Version Update
   * @return CancelNifiVersionUpdateResponse
   */
  @WorkloadApi
  public CancelNifiVersionUpdateResponse cancelNifiVersionUpdate(CancelNifiVersionUpdateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling cancelNifiVersionUpdate");
    }

    return this.invokeAPI("cancelNifiVersionUpdate", "/dfx/api/rpc-v1/deployments/cancel-nifi-version-update", input, new GenericType<CancelNifiVersionUpdateResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Create asset update request.
   * @param input Create Asset Update Request
   * @return CreateAssetUpdateRequestResponse
   */
  @WorkloadApi
  public CreateAssetUpdateRequestResponse createAssetUpdateRequest(CreateAssetUpdateRequestRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAssetUpdateRequest");
    }

    return this.invokeAPI("createAssetUpdateRequest", "/dfx/api/rpc-v1/deployments/create-asset-update-request", input, new GenericType<CreateAssetUpdateRequestResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Create the custom NAR configuration.
   * @param input Create Custom NAR Configuration Request
   * @return CreateCustomNarConfigurationResponse
   */
  @WorkloadApi
  public CreateCustomNarConfigurationResponse createCustomNarConfiguration(CreateCustomNarConfigurationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createCustomNarConfiguration");
    }

    return this.invokeAPI("createCustomNarConfiguration", "/dfx/api/rpc-v1/custom-nar-configurations/create-custom-nar-configuration", input, new GenericType<CreateCustomNarConfigurationResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Creates a deployment.
   * @param input Create Deployment Request
   * @return CreateDeploymentResponse
   */
  @WorkloadApi
  public CreateDeploymentResponse createDeployment(CreateDeploymentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createDeployment");
    }

    return this.invokeAPI("createDeployment", "/dfx/api/rpc-v1/deployments/create-deployment", input, new GenericType<CreateDeploymentResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Create Inbound Connection Endpoint
   * @param input Create Inbound Connection Endpoint request
   * @return CreateInboundConnectionEndpointResponse
   */
  @WorkloadApi
  public CreateInboundConnectionEndpointResponse createInboundConnectionEndpoint(CreateInboundConnectionEndpointRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createInboundConnectionEndpoint");
    }

    return this.invokeAPI("createInboundConnectionEndpoint", "/dfx/api/rpc-v1/inbound-connection-endpoints/create-inbound-connection-endpoint", input, new GenericType<CreateInboundConnectionEndpointResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Deletes an orphaned custom NAR configuration.
   * @param input Delete Custom NAR Configuration Request
   * @return DeleteCustomNarConfigurationResponse
   */
  @WorkloadApi
  public DeleteCustomNarConfigurationResponse deleteCustomNarConfiguration(DeleteCustomNarConfigurationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteCustomNarConfiguration");
    }

    return this.invokeAPI("deleteCustomNarConfiguration", "/dfx/api/rpc-v1/custom-nar-configurations/delete-custom-nar-configuration", input, new GenericType<DeleteCustomNarConfigurationResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Delete Inbound Connection Endpoint
   * @param input Delete Inbound Connection Endpoint request
   * @return DeleteInboundConnectionEndpointResponse
   */
  @WorkloadApi
  public DeleteInboundConnectionEndpointResponse deleteInboundConnectionEndpoint(DeleteInboundConnectionEndpointRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteInboundConnectionEndpoint");
    }

    return this.invokeAPI("deleteInboundConnectionEndpoint", "/dfx/api/rpc-v1/inbound-connection-endpoints/delete-inbound-connection-endpoint", input, new GenericType<DeleteInboundConnectionEndpointResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Describe Inbound Connection Endpoint
   * @param input Describe Inbound Connection Endpoint request
   * @return DescribeInboundConnectionEndpointResponse
   */
  @WorkloadApi
  public DescribeInboundConnectionEndpointResponse describeInboundConnectionEndpoint(DescribeInboundConnectionEndpointRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeInboundConnectionEndpoint");
    }

    return this.invokeAPI("describeInboundConnectionEndpoint", "/dfx/api/rpc-v1/inbound-connection-endpoints/describe-inbound-connection-endpoint", input, new GenericType<DescribeInboundConnectionEndpointResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Get Inbound Connection Endpoint Client Certificate (in PEM encoding)
   * @param input Get Inbound Connection Endpoint client&#39;s certificate request
   * @return InboundConnectionEndpointClientCertificateResponse
   */
  @WorkloadApi
  public InboundConnectionEndpointClientCertificateResponse getClientCertificateEncoded(InboundConnectionEndpointClientCertificateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getClientCertificateEncoded");
    }

    return this.invokeAPI("getClientCertificateEncoded", "/dfx/api/rpc-v1/inbound-connection-endpoint-certificates/download-client-certificate-encoded", input, new GenericType<InboundConnectionEndpointClientCertificateResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Get Inbound Connection Endpoint Client&#39;s Private Key (in PEM encoding)
   * @param input Get Inbound Connection Endpoint client&#39;s private key request
   * @return InboundConnectionEndpointClientPrivateKeyResponse
   */
  @WorkloadApi
  public InboundConnectionEndpointClientPrivateKeyResponse getClientPrivateKeyEncoded(InboundConnectionEndpointClientPrivateKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getClientPrivateKeyEncoded");
    }

    return this.invokeAPI("getClientPrivateKeyEncoded", "/dfx/api/rpc-v1/inbound-connection-endpoint-certificates/download-client-private-key-encoded", input, new GenericType<InboundConnectionEndpointClientPrivateKeyResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Get a custom NAR configuration.
   * @param input Get Custom NAR Configuration Request
   * @return GetCustomNarConfigurationResponse
   */
  @WorkloadApi
  public GetCustomNarConfigurationResponse getCustomNarConfiguration(GetCustomNarConfigurationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getCustomNarConfiguration");
    }

    return this.invokeAPI("getCustomNarConfiguration", "/dfx/api/rpc-v1/custom-nar-configurations/get-custom-nar-configuration", input, new GenericType<GetCustomNarConfigurationResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Get the default custom NAR configuration.
   * @param input Get Default Custom NAR Configuration Request
   * @return GetDefaultCustomNarConfigurationResponse
   */
  @WorkloadApi
  public GetDefaultCustomNarConfigurationResponse getDefaultCustomNarConfiguration(GetDefaultCustomNarConfigurationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDefaultCustomNarConfiguration");
    }

    return this.invokeAPI("getDefaultCustomNarConfiguration", "/dfx/api/rpc-v1/custom-nar-configurations/get-default-custom-nar-configuration", input, new GenericType<GetDefaultCustomNarConfigurationResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Retrieves the deployment configuration.
   * @param input Get Deployment Configuration Request
   * @return GetDeploymentConfigurationResponse
   */
  @WorkloadApi
  public GetDeploymentConfigurationResponse getDeploymentConfiguration(GetDeploymentConfigurationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDeploymentConfiguration");
    }

    return this.invokeAPI("getDeploymentConfiguration", "/dfx/api/rpc-v1/deployments/get-deployment-configuration", input, new GenericType<GetDeploymentConfigurationResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Retrieves the deployment configuration metadata.
   * @param input Get Deployment Configuration Metadata Request
   * @return GetDeploymentConfigurationMetadataResponse
   */
  @WorkloadApi
  public GetDeploymentConfigurationMetadataResponse getDeploymentConfigurationMetadata(GetDeploymentConfigurationMetadataRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDeploymentConfigurationMetadata");
    }

    return this.invokeAPI("getDeploymentConfigurationMetadata", "/dfx/api/rpc-v1/deployments/get-deployment-configuration-metadata", input, new GenericType<GetDeploymentConfigurationMetadataResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Retrieves deployment request details.
   * @param input Get Deployment Request details
   * @return GetDeploymentRequestDetailsResponse
   */
  @WorkloadApi
  public GetDeploymentRequestDetailsResponse getDeploymentRequestDetails(GetDeploymentRequestDetailsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDeploymentRequestDetails");
    }

    return this.invokeAPI("getDeploymentRequestDetails", "/dfx/api/rpc-v1/deployments/get-deployment-request-details", input, new GenericType<GetDeploymentRequestDetailsResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * List Inbound Connection Endpoints
   * @param input List Inbound Connection Endpoints request
   * @return ListInboundConnectionEndpointsResponse
   */
  @WorkloadApi
  public ListInboundConnectionEndpointsResponse listInboundConnectionEndpoints(ListInboundConnectionEndpointsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listInboundConnectionEndpoints");
    }

    return this.invokeAPI("listInboundConnectionEndpoints", "/dfx/api/rpc-v1/inbound-connection-endpoints/list-inbound-connection-endpoints", input, new GenericType<ListInboundConnectionEndpointsResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Lists all supported NiFi versions.
   * @param input List NiFi Versions Request
   * @return ListNifiVersionsResponse
   */
  @WorkloadApi
  public ListNifiVersionsResponse listNifiVersions(ListNifiVersionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listNifiVersions");
    }

    return this.invokeAPI("listNifiVersions", "/dfx/api/rpc-v1/environments/list-nifi-versions", input, new GenericType<ListNifiVersionsResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Renew Inbound Connection Endpoint certificates
   * @param body Inbound connection endpoint certificates renewal request
   * @return RenewInboundConnectionEndpointCertificateResponse
   */
  @WorkloadApi
  public RenewInboundConnectionEndpointCertificateResponse renewInboundConnectionEndpointCertificates(RenewInboundConnectionEndpointCertificateRequest body) {
    if (body == null) {
      throw new CdpClientException("Missing the required parameter 'body' when calling renewInboundConnectionEndpointCertificates");
    }

    return this.invokeAPI("renewInboundConnectionEndpointCertificates", "/dfx/api/rpc-v1/inbound-connection-endpoints/renew-certificates", body, new GenericType<RenewInboundConnectionEndpointCertificateResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Terminates a deployment.
   * @param input Terminate Deployment Request
   * @return TerminateDeploymentResponse
   */
  @WorkloadApi
  public TerminateDeploymentResponse terminateDeployment(TerminateDeploymentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling terminateDeployment");
    }

    return this.invokeAPI("terminateDeployment", "/dfx/api/rpc-v1/deployments/terminate-deployment", input, new GenericType<TerminateDeploymentResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Transitions a flow.
   * @param input Transition Flow
   * @return TransitionFlowResponse
   */
  @WorkloadApi
  public TransitionFlowResponse transitionFlow(TransitionFlowRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling transitionFlow");
    }

    return this.invokeAPI("transitionFlow", "/dfx/api/rpc-v1/deployments/transition-flow", input, new GenericType<TransitionFlowResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Update the custom NAR configuration.
   * @param input Update Custom NAR Configuration Request
   * @return UpdateCustomNarConfigurationResponse
   */
  @WorkloadApi
  public UpdateCustomNarConfigurationResponse updateCustomNarConfiguration(UpdateCustomNarConfigurationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateCustomNarConfiguration");
    }

    return this.invokeAPI("updateCustomNarConfiguration", "/dfx/api/rpc-v1/custom-nar-configurations/update-custom-nar-configuration", input, new GenericType<UpdateCustomNarConfigurationResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Updates a deployment.
   * @param input Update Deployment Request
   * @return UpdateDeploymentResponse
   */
  @WorkloadApi
  public UpdateDeploymentResponse updateDeployment(UpdateDeploymentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateDeployment");
    }

    return this.invokeAPI("updateDeployment", "/dfx/api/rpc-v1/deployments/update-deployment", input, new GenericType<UpdateDeploymentResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class, com.cloudera.cdp.extension.Df.class));
  }

  /**
   * Updates the NiFi version of a deployment.
   * @param input Update NiFi Version
   * @return UpdateNifiVersionResponse
   */
  @WorkloadApi
  public UpdateNifiVersionResponse updateNifiVersion(UpdateNifiVersionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateNifiVersion");
    }

    return this.invokeAPI("updateNifiVersion", "/dfx/api/rpc-v1/deployments/update-nifi-version", input, new GenericType<UpdateNifiVersionResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }

  /**
   * Upload an asset.
   * @param input Upload Asset
   * @return UploadAssetResponse
   */
  @WorkloadApi
  public UploadAssetResponse uploadAsset(UploadAssetRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling uploadAsset");
    }

    return this.invokeAPI("uploadAsset", "/dfx/api/rpc-v1/deployments/upload-asset", input, new GenericType<UploadAssetResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class, com.cloudera.cdp.extension.Df.class));
  }

  /**
   * Validates the custom NAR configuration.
   * @param input Validate Custom NAR Configuration Request
   * @return ValidateCustomNarConfigurationResponse
   */
  @WorkloadApi
  public ValidateCustomNarConfigurationResponse validateCustomNarConfiguration(ValidateCustomNarConfigurationRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling validateCustomNarConfiguration");
    }

    return this.invokeAPI("validateCustomNarConfiguration", "/dfx/api/rpc-v1/custom-nar-configurations/validate-custom-nar-configuration", input, new GenericType<ValidateCustomNarConfigurationResponse>(){}, ImmutableList.of(com.cloudera.cdp.extension.Workload.class));
  }
}
