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

package com.cloudera.cdp.compute.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.compute.model.DescribeDeploymentRequest;
import com.cloudera.cdp.compute.model.DescribeDeploymentResponse;
import com.cloudera.cdp.compute.model.Error;
import com.cloudera.cdp.compute.model.ListClustersRequest;
import com.cloudera.cdp.compute.model.ListClustersResponse;
import com.cloudera.cdp.compute.model.UpgradeDeploymentRequest;
import com.cloudera.cdp.compute.model.UpgradeDeploymentResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-10T13:24:01.486-07:00")
public class ComputeClient extends CdpClient {

  public static final String SERVICE_NAME = "compute";

  public ComputeClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public ComputeClient(CdpRequestContext<?> context) {
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
   * Describes a deployment
   * @param input
   * @return DescribeDeploymentResponse
   */
  public DescribeDeploymentResponse describeDeployment(DescribeDeploymentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDeployment");
    }

    return this.invokeAPI("describeDeployment", "/api/v1/compute/describeDeployment", input, new GenericType<DescribeDeploymentResponse>(){}, NO_EXTENSION);
  }

  /**
   * List compute clusters
   * @param input
   * @return ListClustersResponse
   */
  public ListClustersResponse listClusters(ListClustersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusters");
    }

    return this.invokeAPI("listClusters", "/api/v1/compute/listClusters", input, new GenericType<ListClustersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades a deployment to a different chart.
   * @param input
   * @return UpgradeDeploymentResponse
   */
  public UpgradeDeploymentResponse upgradeDeployment(UpgradeDeploymentRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeDeployment");
    }

    return this.invokeAPI("upgradeDeployment", "/api/v1/compute/upgradeDeployment", input, new GenericType<UpgradeDeploymentResponse>(){}, NO_EXTENSION);
  }
}
