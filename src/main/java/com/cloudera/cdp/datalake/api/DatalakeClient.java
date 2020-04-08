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

package com.cloudera.cdp.datalake.api;

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.datalake.model.CheckDatalakeUpgradeOptionsRequest;
import com.cloudera.cdp.datalake.model.CheckDatalakeUpgradeOptionsResponse;
import com.cloudera.cdp.datalake.model.CreateAWSDatalakeRequest;
import com.cloudera.cdp.datalake.model.CreateAWSDatalakeResponse;
import com.cloudera.cdp.datalake.model.CreateAzureDatalakeRequest;
import com.cloudera.cdp.datalake.model.CreateAzureDatalakeResponse;
import com.cloudera.cdp.datalake.model.DeleteDatalakeRequest;
import com.cloudera.cdp.datalake.model.DeleteDatalakeResponse;
import com.cloudera.cdp.datalake.model.DescribeDatalakeRequest;
import com.cloudera.cdp.datalake.model.DescribeDatalakeResponse;
import com.cloudera.cdp.datalake.model.Error;
import com.cloudera.cdp.datalake.model.GetClusterHostStatusRequest;
import com.cloudera.cdp.datalake.model.GetClusterHostStatusResponse;
import com.cloudera.cdp.datalake.model.GetClusterServiceStatusRequest;
import com.cloudera.cdp.datalake.model.GetClusterServiceStatusResponse;
import com.cloudera.cdp.datalake.model.ListDatalakesRequest;
import com.cloudera.cdp.datalake.model.ListDatalakesResponse;
import com.cloudera.cdp.datalake.model.RepairDatalakeRequest;
import com.cloudera.cdp.datalake.model.RepairDatalakeResponse;
import com.cloudera.cdp.datalake.model.StartDatalakeRequest;
import com.cloudera.cdp.datalake.model.StartDatalakeResponse;
import com.cloudera.cdp.datalake.model.StopDatalakeRequest;
import com.cloudera.cdp.datalake.model.StopDatalakeResponse;
import com.cloudera.cdp.datalake.model.UpgradeDatalakeRequest;
import com.cloudera.cdp.datalake.model.UpgradeDatalakeResponse;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-04-07T22:32:18.772-07:00")
public class DatalakeClient extends CdpClient {

  public static final String SERVICE_NAME = "api";

  public DatalakeClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  /**
   * Check upgrade options.
   * @param input
   * @return CheckDatalakeUpgradeOptionsResponse
   */
  public CheckDatalakeUpgradeOptionsResponse checkDatalakeUpgradeOptions(CheckDatalakeUpgradeOptionsRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling checkDatalakeUpgradeOptions");
     }
    return this.invokeAPI("/api/v1/datalake/checkDatalakeUpgradeOptions", input, new GenericType<CheckDatalakeUpgradeOptionsResponse>(){});
  }

  /**
   * Creates an AWS datalake.
   * @param input
   * @return CreateAWSDatalakeResponse
   */
  public CreateAWSDatalakeResponse createAWSDatalake(CreateAWSDatalakeRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling createAWSDatalake");
     }
    return this.invokeAPI("/api/v1/datalake/createAWSDatalake", input, new GenericType<CreateAWSDatalakeResponse>(){});
  }

  /**
   * Creates an Azure datalake.
   * @param input
   * @return CreateAzureDatalakeResponse
   */
  public CreateAzureDatalakeResponse createAzureDatalake(CreateAzureDatalakeRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling createAzureDatalake");
     }
    return this.invokeAPI("/api/v1/datalake/createAzureDatalake", input, new GenericType<CreateAzureDatalakeResponse>(){});
  }

  /**
   * Deletes a datalake.
   * @param input
   * @return DeleteDatalakeResponse
   */
  public DeleteDatalakeResponse deleteDatalake(DeleteDatalakeRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling deleteDatalake");
     }
    return this.invokeAPI("/api/v1/datalake/deleteDatalake", input, new GenericType<DeleteDatalakeResponse>(){});
  }

  /**
   * Describes a datalake.
   * @param input
   * @return DescribeDatalakeResponse
   */
  public DescribeDatalakeResponse describeDatalake(DescribeDatalakeRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling describeDatalake");
     }
    return this.invokeAPI("/api/v1/datalake/describeDatalake", input, new GenericType<DescribeDatalakeResponse>(){});
  }

  /**
   * Get cluster host status.
   * @param input
   * @return GetClusterHostStatusResponse
   */
  public GetClusterHostStatusResponse getClusterHostStatus(GetClusterHostStatusRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling getClusterHostStatus");
     }
    return this.invokeAPI("/api/v1/datalake/getClusterHostStatus", input, new GenericType<GetClusterHostStatusResponse>(){});
  }

  /**
   * Get cluster service status.
   * @param input
   * @return GetClusterServiceStatusResponse
   */
  public GetClusterServiceStatusResponse getClusterServiceStatus(GetClusterServiceStatusRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling getClusterServiceStatus");
     }
    return this.invokeAPI("/api/v1/datalake/getClusterServiceStatus", input, new GenericType<GetClusterServiceStatusResponse>(){});
  }

  /**
   * Lists datalakes.
   * @param input
   * @return ListDatalakesResponse
   */
  public ListDatalakesResponse listDatalakes(ListDatalakesRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling listDatalakes");
     }
    return this.invokeAPI("/api/v1/datalake/listDatalakes", input, new GenericType<ListDatalakesResponse>(){});
  }

  /**
   * Repairs a datalake.
   * @param input
   * @return RepairDatalakeResponse
   */
  public RepairDatalakeResponse repairDatalake(RepairDatalakeRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling repairDatalake");
     }
    return this.invokeAPI("/api/v1/datalake/repairDatalake", input, new GenericType<RepairDatalakeResponse>(){});
  }

  /**
   * Start Datalake
   * @param input
   * @return StartDatalakeResponse
   */
  public StartDatalakeResponse startDatalake(StartDatalakeRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling startDatalake");
     }
    return this.invokeAPI("/api/v1/datalake/startDatalake", input, new GenericType<StartDatalakeResponse>(){});
  }

  /**
   * Stop Datalake
   * @param input
   * @return StopDatalakeResponse
   */
  public StopDatalakeResponse stopDatalake(StopDatalakeRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling stopDatalake");
     }
    return this.invokeAPI("/api/v1/datalake/stopDatalake", input, new GenericType<StopDatalakeResponse>(){});
  }

  /**
   * Upgrade cluster OS.
   * @param input
   * @return UpgradeDatalakeResponse
   */
  public UpgradeDatalakeResponse upgradeDatalake(UpgradeDatalakeRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling upgradeDatalake");
     }
    return this.invokeAPI("/api/v1/datalake/upgradeDatalake", input, new GenericType<UpgradeDatalakeResponse>(){});
  }
}
