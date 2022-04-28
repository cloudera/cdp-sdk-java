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

package com.cloudera.cdp.dw.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.dw.model.AddUserRequest;
import com.cloudera.cdp.dw.model.AddUserResponse;
import com.cloudera.cdp.dw.model.CreateClusterRequest;
import com.cloudera.cdp.dw.model.CreateClusterResponse;
import com.cloudera.cdp.dw.model.CreateDbcRequest;
import com.cloudera.cdp.dw.model.CreateDbcResponse;
import com.cloudera.cdp.dw.model.CreateVwRequest;
import com.cloudera.cdp.dw.model.CreateVwResponse;
import com.cloudera.cdp.dw.model.DeleteClusterRequest;
import com.cloudera.cdp.dw.model.DeleteClusterResponse;
import com.cloudera.cdp.dw.model.DeleteDbcRequest;
import com.cloudera.cdp.dw.model.DeleteDbcResponse;
import com.cloudera.cdp.dw.model.DeleteUserRequest;
import com.cloudera.cdp.dw.model.DeleteUserResponse;
import com.cloudera.cdp.dw.model.DeleteVwRequest;
import com.cloudera.cdp.dw.model.DeleteVwResponse;
import com.cloudera.cdp.dw.model.DescribeClusterRequest;
import com.cloudera.cdp.dw.model.DescribeClusterResponse;
import com.cloudera.cdp.dw.model.DescribeConfigDiffRequest;
import com.cloudera.cdp.dw.model.DescribeConfigDiffResponse;
import com.cloudera.cdp.dw.model.DescribeConfigRequest;
import com.cloudera.cdp.dw.model.DescribeConfigResponse;
import com.cloudera.cdp.dw.model.DescribeDbcRequest;
import com.cloudera.cdp.dw.model.DescribeDbcResponse;
import com.cloudera.cdp.dw.model.DescribeKubeconfigRequest;
import com.cloudera.cdp.dw.model.DescribeKubeconfigResponse;
import com.cloudera.cdp.dw.model.DescribeVwRequest;
import com.cloudera.cdp.dw.model.DescribeVwResponse;
import com.cloudera.cdp.dw.model.Error;
import com.cloudera.cdp.dw.model.GetUpgradeDbcVersionsRequest;
import com.cloudera.cdp.dw.model.GetUpgradeDbcVersionsResponse;
import com.cloudera.cdp.dw.model.GetUpgradeVwVersionsRequest;
import com.cloudera.cdp.dw.model.GetUpgradeVwVersionsResponse;
import com.cloudera.cdp.dw.model.HealthCheckRequest;
import com.cloudera.cdp.dw.model.HealthCheckResponse;
import com.cloudera.cdp.dw.model.ListClustersRequest;
import com.cloudera.cdp.dw.model.ListClustersResponse;
import com.cloudera.cdp.dw.model.ListDbcConfigsRequest;
import com.cloudera.cdp.dw.model.ListDbcConfigsResponse;
import com.cloudera.cdp.dw.model.ListDbcsRequest;
import com.cloudera.cdp.dw.model.ListDbcsResponse;
import com.cloudera.cdp.dw.model.ListLatestVersionsRequest;
import com.cloudera.cdp.dw.model.ListLatestVersionsResponse;
import com.cloudera.cdp.dw.model.ListUsersRequest;
import com.cloudera.cdp.dw.model.ListUsersResponse;
import com.cloudera.cdp.dw.model.ListVwConfigsRequest;
import com.cloudera.cdp.dw.model.ListVwConfigsResponse;
import com.cloudera.cdp.dw.model.ListVwsRequest;
import com.cloudera.cdp.dw.model.ListVwsResponse;
import com.cloudera.cdp.dw.model.PauseVwRequest;
import com.cloudera.cdp.dw.model.PauseVwResponse;
import com.cloudera.cdp.dw.model.RenewCertificatesRequest;
import com.cloudera.cdp.dw.model.RenewCertificatesResponse;
import com.cloudera.cdp.dw.model.RestartDbcRequest;
import com.cloudera.cdp.dw.model.RestartDbcResponse;
import com.cloudera.cdp.dw.model.RestartVwRequest;
import com.cloudera.cdp.dw.model.RestartVwResponse;
import com.cloudera.cdp.dw.model.StartVwRequest;
import com.cloudera.cdp.dw.model.StartVwResponse;
import com.cloudera.cdp.dw.model.UpdateClusterRequest;
import com.cloudera.cdp.dw.model.UpdateClusterResponse;
import com.cloudera.cdp.dw.model.UpdateDbcRequest;
import com.cloudera.cdp.dw.model.UpdateDbcResponse;
import com.cloudera.cdp.dw.model.UpdateSshKeyRequest;
import com.cloudera.cdp.dw.model.UpdateSshKeyResponse;
import com.cloudera.cdp.dw.model.UpdateVwRequest;
import com.cloudera.cdp.dw.model.UpdateVwResponse;
import com.cloudera.cdp.dw.model.UpgradeDbcRequest;
import com.cloudera.cdp.dw.model.UpgradeDbcResponse;
import com.cloudera.cdp.dw.model.UpgradeVwRequest;
import com.cloudera.cdp.dw.model.UpgradeVwResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-28T14:39:23.078-07:00")
public class DwClient extends CdpClient {

  public static final String SERVICE_NAME = "dw";

  public DwClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DwClient(CdpRequestContext<?> context) {
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
   * Adds the given user to the cluster.
   * @param input
   * @return AddUserResponse
   */
  public AddUserResponse addUser(AddUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addUser");
    }

    return this.invokeAPI("addUser", "/api/v1/dw/addUser", input, new GenericType<AddUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Cloudera Data Warehouse cluster.
   * @param input
   * @return CreateClusterResponse
   */
  public CreateClusterResponse createCluster(CreateClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createCluster");
    }

    return this.invokeAPI("createCluster", "/api/v1/dw/createCluster", input, new GenericType<CreateClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Database Catalog.
   * @param input
   * @return CreateDbcResponse
   */
  public CreateDbcResponse createDbc(CreateDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createDbc");
    }

    return this.invokeAPI("createDbc", "/api/v1/dw/createDbc", input, new GenericType<CreateDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Virtual Warehouse.
   * @param input
   * @return CreateVwResponse
   */
  public CreateVwResponse createVw(CreateVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createVw");
    }

    return this.invokeAPI("createVw", "/api/v1/dw/createVw", input, new GenericType<CreateVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a Cloudera Data Warehouse cluster.
   * @param input
   * @return DeleteClusterResponse
   */
  public DeleteClusterResponse deleteCluster(DeleteClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteCluster");
    }

    return this.invokeAPI("deleteCluster", "/api/v1/dw/deleteCluster", input, new GenericType<DeleteClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a Database Catalog.
   * @param input
   * @return DeleteDbcResponse
   */
  public DeleteDbcResponse deleteDbc(DeleteDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteDbc");
    }

    return this.invokeAPI("deleteDbc", "/api/v1/dw/deleteDbc", input, new GenericType<DeleteDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes the given user from the cluster.
   * @param input
   * @return DeleteUserResponse
   */
  public DeleteUserResponse deleteUser(DeleteUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteUser");
    }

    return this.invokeAPI("deleteUser", "/api/v1/dw/deleteUser", input, new GenericType<DeleteUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a Virtual Warehouse.
   * @param input
   * @return DeleteVwResponse
   */
  public DeleteVwResponse deleteVw(DeleteVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteVw");
    }

    return this.invokeAPI("deleteVw", "/api/v1/dw/deleteVw", input, new GenericType<DeleteVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a Cloudera Data Warehouse cluster.
   * @param input
   * @return DescribeClusterResponse
   */
  public DescribeClusterResponse describeCluster(DescribeClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeCluster");
    }

    return this.invokeAPI("describeCluster", "/api/v1/dw/describeCluster", input, new GenericType<DescribeClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a service configuration.
   * @param input
   * @return DescribeConfigResponse
   */
  public DescribeConfigResponse describeConfig(DescribeConfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeConfig");
    }

    return this.invokeAPI("describeConfig", "/api/v1/dw/describeConfig", input, new GenericType<DescribeConfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get differences between two service configurations.
   * @param input
   * @return DescribeConfigDiffResponse
   */
  public DescribeConfigDiffResponse describeConfigDiff(DescribeConfigDiffRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeConfigDiff");
    }

    return this.invokeAPI("describeConfigDiff", "/api/v1/dw/describeConfigDiff", input, new GenericType<DescribeConfigDiffResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a Database Catalog.
   * @param input
   * @return DescribeDbcResponse
   */
  public DescribeDbcResponse describeDbc(DescribeDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDbc");
    }

    return this.invokeAPI("describeDbc", "/api/v1/dw/describeDbc", input, new GenericType<DescribeDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get Kubeconfig for a Cloudera Data Warehouse cluster.
   * @param input
   * @return DescribeKubeconfigResponse
   */
  public DescribeKubeconfigResponse describeKubeconfig(DescribeKubeconfigRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeKubeconfig");
    }

    return this.invokeAPI("describeKubeconfig", "/api/v1/dw/describeKubeconfig", input, new GenericType<DescribeKubeconfigResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a Virtual Warehouse.
   * @param input
   * @return DescribeVwResponse
   */
  public DescribeVwResponse describeVw(DescribeVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeVw");
    }

    return this.invokeAPI("describeVw", "/api/v1/dw/describeVw", input, new GenericType<DescribeVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets the latest version and latest compatible version for Database Catalog.
   * @param input
   * @return GetUpgradeDbcVersionsResponse
   */
  public GetUpgradeDbcVersionsResponse getUpgradeDbcVersions(GetUpgradeDbcVersionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getUpgradeDbcVersions");
    }

    return this.invokeAPI("getUpgradeDbcVersions", "/api/v1/dw/getUpgradeDbcVersions", input, new GenericType<GetUpgradeDbcVersionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets the latest version and latest compatible version for Virtual Warehouse.
   * @param input
   * @return GetUpgradeVwVersionsResponse
   */
  public GetUpgradeVwVersionsResponse getUpgradeVwVersions(GetUpgradeVwVersionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getUpgradeVwVersions");
    }

    return this.invokeAPI("getUpgradeVwVersions", "/api/v1/dw/getUpgradeVwVersions", input, new GenericType<GetUpgradeVwVersionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Check the health of the API.
   * @param input
   * @return HealthCheckResponse
   */
  public HealthCheckResponse healthCheck(HealthCheckRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling healthCheck");
    }

    return this.invokeAPI("healthCheck", "/api/v1/dw/healthCheck", input, new GenericType<HealthCheckResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Cloudera Data Warehouse clusters.
   * @param input
   * @return ListClustersResponse
   */
  public ListClustersResponse listClusters(ListClustersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listClusters");
    }

    return this.invokeAPI("listClusters", "/api/v1/dw/listClusters", input, new GenericType<ListClustersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the configuration history of a Database Catalog.
   * @param input
   * @return ListDbcConfigsResponse
   */
  public ListDbcConfigsResponse listDbcConfigs(ListDbcConfigsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDbcConfigs");
    }

    return this.invokeAPI("listDbcConfigs", "/api/v1/dw/listDbcConfigs", input, new GenericType<ListDbcConfigsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Database Catalogs.
   * @param input
   * @return ListDbcsResponse
   */
  public ListDbcsResponse listDbcs(ListDbcsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDbcs");
    }

    return this.invokeAPI("listDbcs", "/api/v1/dw/listDbcs", input, new GenericType<ListDbcsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the latest version of the product (if available) for all catalogs in the environment.
   * @param input
   * @return ListLatestVersionsResponse
   */
  public ListLatestVersionsResponse listLatestVersions(ListLatestVersionsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listLatestVersions");
    }

    return this.invokeAPI("listLatestVersions", "/api/v1/dw/listLatestVersions", input, new GenericType<ListLatestVersionsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the users who have access to the cluster.
   * @param input
   * @return ListUsersResponse
   */
  public ListUsersResponse listUsers(ListUsersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listUsers");
    }

    return this.invokeAPI("listUsers", "/api/v1/dw/listUsers", input, new GenericType<ListUsersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get the configuration history of a Virtual Warehouse.
   * @param input
   * @return ListVwConfigsResponse
   */
  public ListVwConfigsResponse listVwConfigs(ListVwConfigsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listVwConfigs");
    }

    return this.invokeAPI("listVwConfigs", "/api/v1/dw/listVwConfigs", input, new GenericType<ListVwConfigsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Virtual Warehouses.
   * @param input
   * @return ListVwsResponse
   */
  public ListVwsResponse listVws(ListVwsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listVws");
    }

    return this.invokeAPI("listVws", "/api/v1/dw/listVws", input, new GenericType<ListVwsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Pauses a running Virtual Warehouse.
   * @param input
   * @return PauseVwResponse
   */
  public PauseVwResponse pauseVw(PauseVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling pauseVw");
    }

    return this.invokeAPI("pauseVw", "/api/v1/dw/pauseVw", input, new GenericType<PauseVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Renew certificates for a Cloudera Data Warehouse Azure cluster.
   * @param input
   * @return RenewCertificatesResponse
   */
  public RenewCertificatesResponse renewCertificates(RenewCertificatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling renewCertificates");
    }

    return this.invokeAPI("renewCertificates", "/api/v1/dw/renewCertificates", input, new GenericType<RenewCertificatesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restart a Database Catalog.
   * @param input
   * @return RestartDbcResponse
   */
  public RestartDbcResponse restartDbc(RestartDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restartDbc");
    }

    return this.invokeAPI("restartDbc", "/api/v1/dw/restartDbc", input, new GenericType<RestartDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restart a Virtual Warehouse.
   * @param input
   * @return RestartVwResponse
   */
  public RestartVwResponse restartVw(RestartVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restartVw");
    }

    return this.invokeAPI("restartVw", "/api/v1/dw/restartVw", input, new GenericType<RestartVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Starts a paused Virtual Warehouse.
   * @param input
   * @return StartVwResponse
   */
  public StartVwResponse startVw(StartVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startVw");
    }

    return this.invokeAPI("startVw", "/api/v1/dw/startVw", input, new GenericType<StartVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates the Cloudera Data Warehouse cluster.
   * @param input
   * @return UpdateClusterResponse
   */
  public UpdateClusterResponse updateCluster(UpdateClusterRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateCluster");
    }

    return this.invokeAPI("updateCluster", "/api/v1/dw/updateCluster", input, new GenericType<UpdateClusterResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the configuration of a Database Catalog.
   * @param input
   * @return UpdateDbcResponse
   */
  public UpdateDbcResponse updateDbc(UpdateDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateDbc");
    }

    return this.invokeAPI("updateDbc", "/api/v1/dw/updateDbc", input, new GenericType<UpdateDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the SSH Key for a Cloudera Data Warehouse cluster
   * @param input
   * @return UpdateSshKeyResponse
   */
  public UpdateSshKeyResponse updateSshKey(UpdateSshKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateSshKey");
    }

    return this.invokeAPI("updateSshKey", "/api/v1/dw/updateSshKey", input, new GenericType<UpdateSshKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the configuration of a Virtual Warehouse.
   * @param input
   * @return UpdateVwResponse
   */
  public UpdateVwResponse updateVw(UpdateVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateVw");
    }

    return this.invokeAPI("updateVw", "/api/v1/dw/updateVw", input, new GenericType<UpdateVwResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades the Database Catalog to a compatible version.
   * @param input
   * @return UpgradeDbcResponse
   */
  public UpgradeDbcResponse upgradeDbc(UpgradeDbcRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeDbc");
    }

    return this.invokeAPI("upgradeDbc", "/api/v1/dw/upgradeDbc", input, new GenericType<UpgradeDbcResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades the Virtual Warehouse to a compatible version.
   * @param input
   * @return UpgradeVwResponse
   */
  public UpgradeVwResponse upgradeVw(UpgradeVwRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeVw");
    }

    return this.invokeAPI("upgradeVw", "/api/v1/dw/upgradeVw", input, new GenericType<UpgradeVwResponse>(){}, NO_EXTENSION);
  }
}
