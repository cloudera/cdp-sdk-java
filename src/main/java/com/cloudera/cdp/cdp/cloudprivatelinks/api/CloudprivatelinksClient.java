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

package com.cloudera.cdp.cloudprivatelinks.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.cloudprivatelinks.model.AuthorizePrivateLinkServiceAccessRequest;
import com.cloudera.cdp.cloudprivatelinks.model.AuthorizePrivateLinkServiceAccessResponse;
import com.cloudera.cdp.cloudprivatelinks.model.CreatePrivateLinkEndpointRequest;
import com.cloudera.cdp.cloudprivatelinks.model.CreatePrivateLinkEndpointResponse;
import com.cloudera.cdp.cloudprivatelinks.model.DeletePrivateLinkEndpointRequest;
import com.cloudera.cdp.cloudprivatelinks.model.DeletePrivateLinkEndpointResponse;
import com.cloudera.cdp.cloudprivatelinks.model.Error;
import com.cloudera.cdp.cloudprivatelinks.model.ListPrivateLinkEndpointStatusesRequest;
import com.cloudera.cdp.cloudprivatelinks.model.ListPrivateLinkEndpointStatusesResponse;
import com.cloudera.cdp.cloudprivatelinks.model.ListPrivateLinkServicesForRegionRequest;
import com.cloudera.cdp.cloudprivatelinks.model.ListPrivateLinkServicesForRegionResponse;
import com.cloudera.cdp.cloudprivatelinks.model.RevokePrivateLinkServiceAccessRequest;
import com.cloudera.cdp.cloudprivatelinks.model.RevokePrivateLinkServiceAccessResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-12T15:07:47.225-07:00")
public class CloudprivatelinksClient extends CdpClient {

  public static final String SERVICE_NAME = "cloudprivatelinks";

  public CloudprivatelinksClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public CloudprivatelinksClient(CdpRequestContext<?> context) {
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
   * Authorize private link services access for the cloud account id.
   * @param input
   * @return AuthorizePrivateLinkServiceAccessResponse
   */
  public AuthorizePrivateLinkServiceAccessResponse authorizePrivateLinkServiceAccess(AuthorizePrivateLinkServiceAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling authorizePrivateLinkServiceAccess");
    }

    return this.invokeAPI("authorizePrivateLinkServiceAccess", "/api/v1/cloudprivatelinks/authorizePrivateLinkServiceAccess", input, new GenericType<AuthorizePrivateLinkServiceAccessResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates PrivateLink endpoints.
   * @param input
   * @return CreatePrivateLinkEndpointResponse
   */
  public CreatePrivateLinkEndpointResponse createPrivateLinkEndpoint(CreatePrivateLinkEndpointRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createPrivateLinkEndpoint");
    }

    return this.invokeAPI("createPrivateLinkEndpoint", "/api/v1/cloudprivatelinks/createPrivateLinkEndpoint", input, new GenericType<CreatePrivateLinkEndpointResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes PrivateLink endpoints.
   * @param input
   * @return DeletePrivateLinkEndpointResponse
   */
  public DeletePrivateLinkEndpointResponse deletePrivateLinkEndpoint(DeletePrivateLinkEndpointRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deletePrivateLinkEndpoint");
    }

    return this.invokeAPI("deletePrivateLinkEndpoint", "/api/v1/cloudprivatelinks/deletePrivateLinkEndpoint", input, new GenericType<DeletePrivateLinkEndpointResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the statuses of the PrivateLink endpoints that are in creation/deletion status.
   * @param input
   * @return ListPrivateLinkEndpointStatusesResponse
   */
  public ListPrivateLinkEndpointStatusesResponse listPrivateLinkEndpointStatuses(ListPrivateLinkEndpointStatusesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listPrivateLinkEndpointStatuses");
    }

    return this.invokeAPI("listPrivateLinkEndpointStatuses", "/api/v1/cloudprivatelinks/listPrivateLinkEndpointStatuses", input, new GenericType<ListPrivateLinkEndpointStatusesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the PrivateLink services that are supported for the region and service group.
   * @param input
   * @return ListPrivateLinkServicesForRegionResponse
   */
  public ListPrivateLinkServicesForRegionResponse listPrivateLinkServicesForRegion(ListPrivateLinkServicesForRegionRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listPrivateLinkServicesForRegion");
    }

    return this.invokeAPI("listPrivateLinkServicesForRegion", "/api/v1/cloudprivatelinks/listPrivateLinkServicesForRegion", input, new GenericType<ListPrivateLinkServicesForRegionResponse>(){}, NO_EXTENSION);
  }

  /**
   * Revoke private link services access for the cloud account id.
   * @param input
   * @return RevokePrivateLinkServiceAccessResponse
   */
  public RevokePrivateLinkServiceAccessResponse revokePrivateLinkServiceAccess(RevokePrivateLinkServiceAccessRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling revokePrivateLinkServiceAccess");
    }

    return this.invokeAPI("revokePrivateLinkServiceAccess", "/api/v1/cloudprivatelinks/revokePrivateLinkServiceAccess", input, new GenericType<RevokePrivateLinkServiceAccessResponse>(){}, NO_EXTENSION);
  }
}
