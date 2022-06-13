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

package com.cloudera.cdp.de.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.de.model.CreateVcRequest;
import com.cloudera.cdp.de.model.CreateVcResponse;
import com.cloudera.cdp.de.model.DeleteVcRequest;
import com.cloudera.cdp.de.model.DeleteVcResponse;
import com.cloudera.cdp.de.model.DescribeServiceRequest;
import com.cloudera.cdp.de.model.DescribeServiceResponse;
import com.cloudera.cdp.de.model.DescribeVcRequest;
import com.cloudera.cdp.de.model.DescribeVcResponse;
import com.cloudera.cdp.de.model.DisableServiceRequest;
import com.cloudera.cdp.de.model.DisableServiceResponse;
import com.cloudera.cdp.de.model.EnableServiceRequest;
import com.cloudera.cdp.de.model.EnableServiceResponse;
import com.cloudera.cdp.de.model.Error;
import com.cloudera.cdp.de.model.GetKubeconfigRequest;
import com.cloudera.cdp.de.model.GetKubeconfigResponse;
import com.cloudera.cdp.de.model.ListServicesRequest;
import com.cloudera.cdp.de.model.ListServicesResponse;
import com.cloudera.cdp.de.model.ListVcsRequest;
import com.cloudera.cdp.de.model.ListVcsResponse;
import com.cloudera.cdp.de.model.UpdateServiceRequest;
import com.cloudera.cdp.de.model.UpdateServiceResponse;
import com.cloudera.cdp.de.model.UpdateVcRequest;
import com.cloudera.cdp.de.model.UpdateVcResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-10T11:26:36.145-07:00")
public class DeClient extends CdpClient {

  public static final String SERVICE_NAME = "de";

  public DeClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DeClient(CdpRequestContext<?> context) {
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
   * Create Virtual Cluster
   * @param input
   * @return CreateVcResponse
   */
  public CreateVcResponse createVc(CreateVcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createVc");
    }

    return this.invokeAPI("createVc", "/api/v1/de/createVc", input, new GenericType<CreateVcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete Virtual Cluster
   * @param input
   * @return DeleteVcResponse
   */
  public DeleteVcResponse deleteVc(DeleteVcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteVc");
    }

    return this.invokeAPI("deleteVc", "/api/v1/de/deleteVc", input, new GenericType<DeleteVcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe Cloudera Data Engineering(CDE) Service
   * @param input
   * @return DescribeServiceResponse
   */
  public DescribeServiceResponse describeService(DescribeServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeService");
    }

    return this.invokeAPI("describeService", "/api/v1/de/describeService", input, new GenericType<DescribeServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe Virtual Cluster
   * @param input
   * @return DescribeVcResponse
   */
  public DescribeVcResponse describeVc(DescribeVcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeVc");
    }

    return this.invokeAPI("describeVc", "/api/v1/de/describeVc", input, new GenericType<DescribeVcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Disable Cloudera Data Engineering(CDE) Service
   * @param input
   * @return DisableServiceResponse
   */
  public DisableServiceResponse disableService(DisableServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling disableService");
    }

    return this.invokeAPI("disableService", "/api/v1/de/disableService", input, new GenericType<DisableServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Enable Cloudera Data Engineering(CDE) Service
   * @param input
   * @return EnableServiceResponse
   */
  public EnableServiceResponse enableService(EnableServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling enableService");
    }

    return this.invokeAPI("enableService", "/api/v1/de/enableService", input, new GenericType<EnableServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get Kubeconfig for the CDE service
   * @param input
   * @return GetKubeconfigResponse
   */
  public GetKubeconfigResponse getKubeconfig(GetKubeconfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getKubeconfig");
    }

    return this.invokeAPI("getKubeconfig", "/api/v1/de/getKubeconfig", input, new GenericType<GetKubeconfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Cloudera Data Engineering(CDE) Services
   * @param input
   * @return ListServicesResponse
   */
  public ListServicesResponse listServices(ListServicesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listServices");
    }

    return this.invokeAPI("listServices", "/api/v1/de/listServices", input, new GenericType<ListServicesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Virtual Clusters
   * @param input
   * @return ListVcsResponse
   */
  public ListVcsResponse listVcs(ListVcsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listVcs");
    }

    return this.invokeAPI("listVcs", "/api/v1/de/listVcs", input, new GenericType<ListVcsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update Cloudera Data Engineering (CDE) Service
   * @param input
   * @return UpdateServiceResponse
   */
  public UpdateServiceResponse updateService(UpdateServiceRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateService");
    }

    return this.invokeAPI("updateService", "/api/v1/de/updateService", input, new GenericType<UpdateServiceResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update Cloudera Data Engineering (CDE) Virtual Cluster
   * @param input
   * @return UpdateVcResponse
   */
  public UpdateVcResponse updateVc(UpdateVcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateVc");
    }

    return this.invokeAPI("updateVc", "/api/v1/de/updateVc", input, new GenericType<UpdateVcResponse>(){}, NO_EXTENSION);
  }
}
