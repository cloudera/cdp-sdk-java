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
import com.cloudera.cdp.compute.model.CreateClusterRequest;
import com.cloudera.cdp.compute.model.CreateClusterResponse;
import com.cloudera.cdp.compute.model.DeleteClusterRequest;
import com.cloudera.cdp.compute.model.DeleteClusterResponse;
import com.cloudera.cdp.compute.model.DescribeClusterRequest;
import com.cloudera.cdp.compute.model.DescribeClusterResponse;
import com.cloudera.cdp.compute.model.DescribeDeploymentRequest;
import com.cloudera.cdp.compute.model.DescribeDeploymentResponse;
import com.cloudera.cdp.compute.model.Error;
import com.cloudera.cdp.compute.model.ListClustersRequest;
import com.cloudera.cdp.compute.model.ListClustersResponse;
import com.cloudera.cdp.compute.model.ListDeploymentsRequest;
import com.cloudera.cdp.compute.model.ListDeploymentsResponse;
import com.cloudera.cdp.compute.model.ResumeClusterRequest;
import com.cloudera.cdp.compute.model.ResumeClusterResponse;
import com.cloudera.cdp.compute.model.SuspendClusterRequest;
import com.cloudera.cdp.compute.model.SuspendClusterResponse;
import com.cloudera.cdp.compute.model.UpgradeDeploymentRequest;
import com.cloudera.cdp.compute.model.UpgradeDeploymentResponse;
import com.cloudera.cdp.compute.model.ValidateClusterRequest;
import com.cloudera.cdp.compute.model.ValidateClusterResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:16.183-07:00")
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
   * Create compute cluster
   * @param input
   * @return CreateClusterResponse
   */
  public CreateClusterResponse createCluster(CreateClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createCluster");
    }

    return this.invokeAPI("createCluster", "/api/v1/compute/createCluster", input, new GenericType<CreateClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete compute cluster
   * @param input
   * @return DeleteClusterResponse
   */
  public DeleteClusterResponse deleteCluster(DeleteClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteCluster");
    }

    return this.invokeAPI("deleteCluster", "/api/v1/compute/deleteCluster", input, new GenericType<DeleteClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe compute cluster
   * @param input
   * @return DescribeClusterResponse
   */
  public DescribeClusterResponse describeCluster(DescribeClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeCluster");
    }

    return this.invokeAPI("describeCluster", "/api/v1/compute/describeCluster", input, new GenericType<DescribeClusterResponse>(){}, NO_EXTENSION);
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
   * List deployments in the cluster.
   * @param input
   * @return ListDeploymentsResponse
   */
  public ListDeploymentsResponse listDeployments(ListDeploymentsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDeployments");
    }

    return this.invokeAPI("listDeployments", "/api/v1/compute/listDeployments", input, new GenericType<ListDeploymentsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Resume Cluster
   * @param input
   * @return ResumeClusterResponse
   */
  public ResumeClusterResponse resumeCluster(ResumeClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling resumeCluster");
    }

    return this.invokeAPI("resumeCluster", "/api/v1/compute/resumeCluster", input, new GenericType<ResumeClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Suspend Cluster
   * @param input
   * @return SuspendClusterResponse
   */
  public SuspendClusterResponse suspendCluster(SuspendClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling suspendCluster");
    }

    return this.invokeAPI("suspendCluster", "/api/v1/compute/suspendCluster", input, new GenericType<SuspendClusterResponse>(){}, NO_EXTENSION);
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

  /**
   * Validate compute cluster
   * @param input
   * @return ValidateClusterResponse
   */
  public ValidateClusterResponse validateCluster(ValidateClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling validateCluster");
    }

    return this.invokeAPI("validateCluster", "/api/v1/compute/validateCluster", input, new GenericType<ValidateClusterResponse>(){}, NO_EXTENSION);
  }
}
