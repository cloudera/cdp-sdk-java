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

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.WorkloadResponse;
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

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-03-03T09:29:05.072-08:00")
public class DeClient extends CdpClient {

  public static final String SERVICE_NAME = "de";

  public DeClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
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

    return this.invokeAPI("/api/v1/de/createVc", input, new GenericType<CreateVcResponse>(){});
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

    return this.invokeAPI("/api/v1/de/deleteVc", input, new GenericType<DeleteVcResponse>(){});
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

    return this.invokeAPI("/api/v1/de/describeService", input, new GenericType<DescribeServiceResponse>(){});
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

    return this.invokeAPI("/api/v1/de/describeVc", input, new GenericType<DescribeVcResponse>(){});
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

    return this.invokeAPI("/api/v1/de/disableService", input, new GenericType<DisableServiceResponse>(){});
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

    return this.invokeAPI("/api/v1/de/enableService", input, new GenericType<EnableServiceResponse>(){});
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

    return this.invokeAPI("/api/v1/de/getKubeconfig", input, new GenericType<GetKubeconfigResponse>(){});
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

    return this.invokeAPI("/api/v1/de/listServices", input, new GenericType<ListServicesResponse>(){});
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

    return this.invokeAPI("/api/v1/de/listVcs", input, new GenericType<ListVcsResponse>(){});
  }
}
