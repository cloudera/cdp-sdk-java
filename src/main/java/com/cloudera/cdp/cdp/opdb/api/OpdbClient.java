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

package com.cloudera.cdp.opdb.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.opdb.model.CollectDiagnosticsRequest;
import com.cloudera.cdp.opdb.model.CollectDiagnosticsResponse;
import com.cloudera.cdp.opdb.model.CreateDatabaseRequest;
import com.cloudera.cdp.opdb.model.CreateDatabaseResponse;
import com.cloudera.cdp.opdb.model.CreateSnapshotRequest;
import com.cloudera.cdp.opdb.model.CreateSnapshotResponse;
import com.cloudera.cdp.opdb.model.DeleteSnapshotRequest;
import com.cloudera.cdp.opdb.model.DeleteSnapshotResponse;
import com.cloudera.cdp.opdb.model.DescribeClientConnectivityRequest;
import com.cloudera.cdp.opdb.model.DescribeClientConnectivityResponse;
import com.cloudera.cdp.opdb.model.DescribeDatabaseRequest;
import com.cloudera.cdp.opdb.model.DescribeDatabaseResponse;
import com.cloudera.cdp.opdb.model.DescribeUpgradeDatabaseRequest;
import com.cloudera.cdp.opdb.model.DescribeUpgradeDatabaseResponse;
import com.cloudera.cdp.opdb.model.DropDatabaseRequest;
import com.cloudera.cdp.opdb.model.DropDatabaseResponse;
import com.cloudera.cdp.opdb.model.Error;
import com.cloudera.cdp.opdb.model.ListDatabasesRequest;
import com.cloudera.cdp.opdb.model.ListDatabasesResponse;
import com.cloudera.cdp.opdb.model.ListDiagnosticsRequest;
import com.cloudera.cdp.opdb.model.ListDiagnosticsResponse;
import com.cloudera.cdp.opdb.model.ListRestoreSnapshotsRequest;
import com.cloudera.cdp.opdb.model.ListRestoreSnapshotsResponse;
import com.cloudera.cdp.opdb.model.ListSnapshotsRequest;
import com.cloudera.cdp.opdb.model.ListSnapshotsResponse;
import com.cloudera.cdp.opdb.model.ListSupportedEnvironmentsRequest;
import com.cloudera.cdp.opdb.model.ListSupportedEnvironmentsResponse;
import com.cloudera.cdp.opdb.model.RestoreSnapshotRequest;
import com.cloudera.cdp.opdb.model.RestoreSnapshotResponse;
import com.cloudera.cdp.opdb.model.StartDatabaseRequest;
import com.cloudera.cdp.opdb.model.StartDatabaseResponse;
import com.cloudera.cdp.opdb.model.StopDatabaseRequest;
import com.cloudera.cdp.opdb.model.StopDatabaseResponse;
import com.cloudera.cdp.opdb.model.UpdateDatabaseRequest;
import com.cloudera.cdp.opdb.model.UpdateDatabaseResponse;
import com.cloudera.cdp.opdb.model.UpgradeDatabaseRequest;
import com.cloudera.cdp.opdb.model.UpgradeDatabaseResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:07.608-08:00")
public class OpdbClient extends CdpClient {

  public static final String SERVICE_NAME = "opdb";

  public OpdbClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public OpdbClient(CdpRequestContext<?> context) {
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
   * Collect diagnostic data bundles from the database
   * @param input
   * @return CollectDiagnosticsResponse
   */
  public CollectDiagnosticsResponse collectDiagnostics(CollectDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling collectDiagnostics");
    }

    return this.invokeAPI("collectDiagnostics", "/api/v1/opdb/collectDiagnostics", input, new GenericType<CollectDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create opDb
   * @param input
   * @return CreateDatabaseResponse
   */
  public CreateDatabaseResponse createDatabase(CreateDatabaseRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createDatabase");
    }

    return this.invokeAPI("createDatabase", "/api/v1/opdb/createDatabase", input, new GenericType<CreateDatabaseResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a snapshot for a specific table.
   * @param input
   * @return CreateSnapshotResponse
   */
  public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createSnapshot");
    }

    return this.invokeAPI("createSnapshot", "/api/v1/opdb/createSnapshot", input, new GenericType<CreateSnapshotResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a snapshot.
   * @param input
   * @return DeleteSnapshotResponse
   */
  public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteSnapshot");
    }

    return this.invokeAPI("deleteSnapshot", "/api/v1/opdb/deleteSnapshot", input, new GenericType<DeleteSnapshotResponse>(){}, NO_EXTENSION);
  }

  /**
   * Returns client connectivity details
   * @param input
   * @return DescribeClientConnectivityResponse
   */
  public DescribeClientConnectivityResponse describeClientConnectivity(DescribeClientConnectivityRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeClientConnectivity");
    }

    return this.invokeAPI("describeClientConnectivity", "/api/v1/opdb/describeClientConnectivity", input, new GenericType<DescribeClientConnectivityResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe a opDb
   * @param input
   * @return DescribeDatabaseResponse
   */
  public DescribeDatabaseResponse describeDatabase(DescribeDatabaseRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDatabase");
    }

    return this.invokeAPI("describeDatabase", "/api/v1/opdb/describeDatabase", input, new GenericType<DescribeDatabaseResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes the upgrade availability.
   * @param input
   * @return DescribeUpgradeDatabaseResponse
   */
  public DescribeUpgradeDatabaseResponse describeUpgradeDatabase(DescribeUpgradeDatabaseRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeUpgradeDatabase");
    }

    return this.invokeAPI("describeUpgradeDatabase", "/api/v1/opdb/describeUpgradeDatabase", input, new GenericType<DescribeUpgradeDatabaseResponse>(){}, NO_EXTENSION);
  }

  /**
   * drop a opDb
   * @param input
   * @return DropDatabaseResponse
   */
  public DropDatabaseResponse dropDatabase(DropDatabaseRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling dropDatabase");
    }

    return this.invokeAPI("dropDatabase", "/api/v1/opdb/dropDatabase", input, new GenericType<DropDatabaseResponse>(){}, NO_EXTENSION);
  }

  /**
   * List all opDbs in an environment
   * @param input
   * @return ListDatabasesResponse
   */
  public ListDatabasesResponse listDatabases(ListDatabasesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDatabases");
    }

    return this.invokeAPI("listDatabases", "/api/v1/opdb/listDatabases", input, new GenericType<ListDatabasesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List all diagnostics associated to the database
   * @param input
   * @return ListDiagnosticsResponse
   */
  public ListDiagnosticsResponse listDiagnostics(ListDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDiagnostics");
    }

    return this.invokeAPI("listDiagnostics", "/api/v1/opdb/listDiagnostics", input, new GenericType<ListDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists instances when a snapshot was restored to a database.
   * @param input
   * @return ListRestoreSnapshotsResponse
   */
  public ListRestoreSnapshotsResponse listRestoreSnapshots(ListRestoreSnapshotsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listRestoreSnapshots");
    }

    return this.invokeAPI("listRestoreSnapshots", "/api/v1/opdb/listRestoreSnapshots", input, new GenericType<ListRestoreSnapshotsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Shows snapshot for a table name in a specific location.
   * @param input
   * @return ListSnapshotsResponse
   */
  public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listSnapshots");
    }

    return this.invokeAPI("listSnapshots", "/api/v1/opdb/listSnapshots", input, new GenericType<ListSnapshotsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List of environments available for the database creation
   * @param input
   * @return ListSupportedEnvironmentsResponse
   */
  public ListSupportedEnvironmentsResponse listSupportedEnvironments(ListSupportedEnvironmentsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listSupportedEnvironments");
    }

    return this.invokeAPI("listSupportedEnvironments", "/api/v1/opdb/listSupportedEnvironments", input, new GenericType<ListSupportedEnvironmentsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restores a snapshot.
   * @param input
   * @return RestoreSnapshotResponse
   */
  public RestoreSnapshotResponse restoreSnapshot(RestoreSnapshotRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restoreSnapshot");
    }

    return this.invokeAPI("restoreSnapshot", "/api/v1/opdb/restoreSnapshot", input, new GenericType<RestoreSnapshotResponse>(){}, NO_EXTENSION);
  }

  /**
   * Starts the database
   * @param input
   * @return StartDatabaseResponse
   */
  public StartDatabaseResponse startDatabase(StartDatabaseRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startDatabase");
    }

    return this.invokeAPI("startDatabase", "/api/v1/opdb/startDatabase", input, new GenericType<StartDatabaseResponse>(){}, NO_EXTENSION);
  }

  /**
   * Stops the database
   * @param input
   * @return StopDatabaseResponse
   */
  public StopDatabaseResponse stopDatabase(StopDatabaseRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling stopDatabase");
    }

    return this.invokeAPI("stopDatabase", "/api/v1/opdb/stopDatabase", input, new GenericType<StopDatabaseResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates the database
   * @param input
   * @return UpdateDatabaseResponse
   */
  public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateDatabase");
    }

    return this.invokeAPI("updateDatabase", "/api/v1/opdb/updateDatabase", input, new GenericType<UpdateDatabaseResponse>(){}, NO_EXTENSION);
  }

  /**
   * Upgrades the database.
   * @param input
   * @return UpgradeDatabaseResponse
   */
  public UpgradeDatabaseResponse upgradeDatabase(UpgradeDatabaseRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeDatabase");
    }

    return this.invokeAPI("upgradeDatabase", "/api/v1/opdb/upgradeDatabase", input, new GenericType<UpgradeDatabaseResponse>(){}, NO_EXTENSION);
  }
}
