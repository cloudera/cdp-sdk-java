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

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.RestResponse;
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
import com.cloudera.cdp.dw.model.ListClustersRequest;
import com.cloudera.cdp.dw.model.ListClustersResponse;
import com.cloudera.cdp.dw.model.ListDbcConfigsRequest;
import com.cloudera.cdp.dw.model.ListDbcConfigsResponse;
import com.cloudera.cdp.dw.model.ListDbcsRequest;
import com.cloudera.cdp.dw.model.ListDbcsResponse;
import com.cloudera.cdp.dw.model.ListVwConfigsRequest;
import com.cloudera.cdp.dw.model.ListVwConfigsResponse;
import com.cloudera.cdp.dw.model.ListVwsRequest;
import com.cloudera.cdp.dw.model.ListVwsResponse;
import com.cloudera.cdp.dw.model.UpdateDbcRequest;
import com.cloudera.cdp.dw.model.UpdateDbcResponse;
import com.cloudera.cdp.dw.model.UpdateSshKeyRequest;
import com.cloudera.cdp.dw.model.UpdateSshKeyResponse;
import com.cloudera.cdp.dw.model.UpdateVwRequest;
import com.cloudera.cdp.dw.model.UpdateVwResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-09T16:32:32.573-07:00")
public class DwClient extends CdpClient {

  public static final String SERVICE_NAME = "dw";

  public DwClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
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

    return this.invokeAPI("/api/v1/dw/createCluster", input, new GenericType<CreateClusterResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/createDbc", input, new GenericType<CreateDbcResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/createVw", input, new GenericType<CreateVwResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/deleteCluster", input, new GenericType<DeleteClusterResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/deleteDbc", input, new GenericType<DeleteDbcResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/deleteVw", input, new GenericType<DeleteVwResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/describeCluster", input, new GenericType<DescribeClusterResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/describeConfig", input, new GenericType<DescribeConfigResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/describeConfigDiff", input, new GenericType<DescribeConfigDiffResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/describeDbc", input, new GenericType<DescribeDbcResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/describeKubeconfig", input, new GenericType<DescribeKubeconfigResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/describeVw", input, new GenericType<DescribeVwResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/listClusters", input, new GenericType<ListClustersResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/listDbcConfigs", input, new GenericType<ListDbcConfigsResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/listDbcs", input, new GenericType<ListDbcsResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/listVwConfigs", input, new GenericType<ListVwConfigsResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/listVws", input, new GenericType<ListVwsResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/updateDbc", input, new GenericType<UpdateDbcResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/updateSshKey", input, new GenericType<UpdateSshKeyResponse>(){});
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

    return this.invokeAPI("/api/v1/dw/updateVw", input, new GenericType<UpdateVwResponse>(){});
  }
}
