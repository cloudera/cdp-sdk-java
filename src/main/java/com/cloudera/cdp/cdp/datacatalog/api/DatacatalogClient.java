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

package com.cloudera.cdp.datacatalog.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.datacatalog.model.AddAssetsToDataShareRequest;
import com.cloudera.cdp.datacatalog.model.AddAssetsToDataShareResponse;
import com.cloudera.cdp.datacatalog.model.CreateDataShareRequest;
import com.cloudera.cdp.datacatalog.model.CreateDataShareResponse;
import com.cloudera.cdp.datacatalog.model.CreateExternalUsersRequest;
import com.cloudera.cdp.datacatalog.model.CreateExternalUsersResponse;
import com.cloudera.cdp.datacatalog.model.DeleteDataShareRequest;
import com.cloudera.cdp.datacatalog.model.DeleteDataShareResponse;
import com.cloudera.cdp.datacatalog.model.DeleteExternalUserRequest;
import com.cloudera.cdp.datacatalog.model.DeleteExternalUserResponse;
import com.cloudera.cdp.datacatalog.model.Error;
import com.cloudera.cdp.datacatalog.model.GetDataShareRequest;
import com.cloudera.cdp.datacatalog.model.GetDataShareResponse;
import com.cloudera.cdp.datacatalog.model.GetSuggestedTagsRequest;
import com.cloudera.cdp.datacatalog.model.GetSuggestedTagsResponse;
import com.cloudera.cdp.datacatalog.model.GrantAccessToExternalUsersOnDataShareRequest;
import com.cloudera.cdp.datacatalog.model.GrantAccessToExternalUsersOnDataShareResponse;
import com.cloudera.cdp.datacatalog.model.LaunchProfilersRequest;
import com.cloudera.cdp.datacatalog.model.LaunchProfilersResponse;
import com.cloudera.cdp.datacatalog.model.ListDataSharesRequest;
import com.cloudera.cdp.datacatalog.model.ListDataSharesResponse;
import com.cloudera.cdp.datacatalog.model.ListExternalUsersRequest;
import com.cloudera.cdp.datacatalog.model.ListExternalUsersResponse;
import com.cloudera.cdp.datacatalog.model.RegenerateExternalUserCredentialsRequest;
import com.cloudera.cdp.datacatalog.model.RegenerateExternalUserCredentialsResponse;
import com.cloudera.cdp.datacatalog.model.RemoveAccessOfExternalUsersOnDataShareRequest;
import com.cloudera.cdp.datacatalog.model.RemoveAccessOfExternalUsersOnDataShareResponse;
import com.cloudera.cdp.datacatalog.model.RemoveAssetsFromDataShareRequest;
import com.cloudera.cdp.datacatalog.model.RemoveAssetsFromDataShareResponse;
import com.cloudera.cdp.datacatalog.model.ReviewSuggestedTagsRequest;
import com.cloudera.cdp.datacatalog.model.ReviewSuggestedTagsResponse;
import com.cloudera.cdp.datacatalog.model.RevokeExternalUserCredentialsRequest;
import com.cloudera.cdp.datacatalog.model.RevokeExternalUserCredentialsResponse;
import com.cloudera.cdp.datacatalog.model.ShareDataShareRequest;
import com.cloudera.cdp.datacatalog.model.ShareDataShareResponse;
import com.cloudera.cdp.datacatalog.model.UnshareDataShareRequest;
import com.cloudera.cdp.datacatalog.model.UnshareDataShareResponse;
import com.cloudera.cdp.datacatalog.model.UpdateAccessOfExternalUsersOnDataShareRequest;
import com.cloudera.cdp.datacatalog.model.UpdateAccessOfExternalUsersOnDataShareResponse;
import com.cloudera.cdp.datacatalog.model.UpdateDataShareRequest;
import com.cloudera.cdp.datacatalog.model.UpdateDataShareResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class DatacatalogClient extends CdpClient {

  public static final String SERVICE_NAME = "datacatalog";

  public DatacatalogClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DatacatalogClient(CdpRequestContext<?> context) {
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
   * Add assets to an existing Data Share.
   * @param input
   * @return AddAssetsToDataShareResponse
   */
  public AddAssetsToDataShareResponse addAssetsToDataShare(AddAssetsToDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addAssetsToDataShare");
    }

    return this.invokeAPI("addAssetsToDataShare", "/api/v1/datacatalog/addAssetsToDataShare", input, new GenericType<AddAssetsToDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a Data Share for Data Sharing.
   * @param input
   * @return CreateDataShareResponse
   */
  public CreateDataShareResponse createDataShare(CreateDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createDataShare");
    }

    return this.invokeAPI("createDataShare", "/api/v1/datacatalog/createDataShare", input, new GenericType<CreateDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create external users for Data Sharing.
   * @param input
   * @return CreateExternalUsersResponse
   */
  public CreateExternalUsersResponse createExternalUsers(CreateExternalUsersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createExternalUsers");
    }

    return this.invokeAPI("createExternalUsers", "/api/v1/datacatalog/createExternalUsers", input, new GenericType<CreateExternalUsersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a Data Share by its ID.
   * @param input
   * @return DeleteDataShareResponse
   */
  public DeleteDataShareResponse deleteDataShare(DeleteDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteDataShare");
    }

    return this.invokeAPI("deleteDataShare", "/api/v1/datacatalog/deleteDataShare", input, new GenericType<DeleteDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete an external user.
   * @param input
   * @return DeleteExternalUserResponse
   */
  public DeleteExternalUserResponse deleteExternalUser(DeleteExternalUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteExternalUser");
    }

    return this.invokeAPI("deleteExternalUser", "/api/v1/datacatalog/deleteExternalUser", input, new GenericType<DeleteExternalUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get a Data Share by its ID.
   * @param input
   * @return GetDataShareResponse
   */
  public GetDataShareResponse getDataShare(GetDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDataShare");
    }

    return this.invokeAPI("getDataShare", "/api/v1/datacatalog/getDataShare", input, new GenericType<GetDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get Suggested tags by the Data Compliance profiler.
   * @param input
   * @return GetSuggestedTagsResponse
   */
  public GetSuggestedTagsResponse getSuggestedTags(GetSuggestedTagsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getSuggestedTags");
    }

    return this.invokeAPI("getSuggestedTags", "/api/v1/datacatalog/getSuggestedTags", input, new GenericType<GetSuggestedTagsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Grant access to external users on a Data Share.
   * @param input
   * @return GrantAccessToExternalUsersOnDataShareResponse
   */
  public GrantAccessToExternalUsersOnDataShareResponse grantAccessToExternalUsersOnDataShare(GrantAccessToExternalUsersOnDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling grantAccessToExternalUsersOnDataShare");
    }

    return this.invokeAPI("grantAccessToExternalUsersOnDataShare", "/api/v1/datacatalog/grantAccessToExternalUsersOnDataShare", input, new GenericType<GrantAccessToExternalUsersOnDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Launches DataCatalog profilers in a given datalake.
   * @param input
   * @return LaunchProfilersResponse
   */
  public LaunchProfilersResponse launchProfilers(LaunchProfilersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling launchProfilers");
    }

    return this.invokeAPI("launchProfilers", "/api/v1/datacatalog/launchProfilers", input, new GenericType<LaunchProfilersResponse>(){}, NO_EXTENSION);
  }

  /**
   * List Data Shares.
   * @param input
   * @return ListDataSharesResponse
   */
  public ListDataSharesResponse listDataShares(ListDataSharesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDataShares");
    }

    return this.invokeAPI("listDataShares", "/api/v1/datacatalog/listDataShares", input, new GenericType<ListDataSharesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List external users for Data Sharing.
   * @param input
   * @return ListExternalUsersResponse
   */
  public ListExternalUsersResponse listExternalUsers(ListExternalUsersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listExternalUsers");
    }

    return this.invokeAPI("listExternalUsers", "/api/v1/datacatalog/listExternalUsers", input, new GenericType<ListExternalUsersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Regenerate credentials for an external user.
   * @param input
   * @return RegenerateExternalUserCredentialsResponse
   */
  public RegenerateExternalUserCredentialsResponse regenerateExternalUserCredentials(RegenerateExternalUserCredentialsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling regenerateExternalUserCredentials");
    }

    return this.invokeAPI("regenerateExternalUserCredentials", "/api/v1/datacatalog/regenerateExternalUserCredentials", input, new GenericType<RegenerateExternalUserCredentialsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Remove access of external users on a Data Share.
   * @param input
   * @return RemoveAccessOfExternalUsersOnDataShareResponse
   */
  public RemoveAccessOfExternalUsersOnDataShareResponse removeAccessOfExternalUsersOnDataShare(RemoveAccessOfExternalUsersOnDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling removeAccessOfExternalUsersOnDataShare");
    }

    return this.invokeAPI("removeAccessOfExternalUsersOnDataShare", "/api/v1/datacatalog/removeAccessOfExternalUsersOnDataShare", input, new GenericType<RemoveAccessOfExternalUsersOnDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Remove assets from an existing Data Share.
   * @param input
   * @return RemoveAssetsFromDataShareResponse
   */
  public RemoveAssetsFromDataShareResponse removeAssetsFromDataShare(RemoveAssetsFromDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling removeAssetsFromDataShare");
    }

    return this.invokeAPI("removeAssetsFromDataShare", "/api/v1/datacatalog/removeAssetsFromDataShare", input, new GenericType<RemoveAssetsFromDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Review tags suggested by Data Compliance Profiler
   * @param input
   * @return ReviewSuggestedTagsResponse
   */
  public ReviewSuggestedTagsResponse reviewSuggestedTags(ReviewSuggestedTagsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling reviewSuggestedTags");
    }

    return this.invokeAPI("reviewSuggestedTags", "/api/v1/datacatalog/reviewSuggestedTags", input, new GenericType<ReviewSuggestedTagsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Revoke credentials for an external user.
   * @param input
   * @return RevokeExternalUserCredentialsResponse
   */
  public RevokeExternalUserCredentialsResponse revokeExternalUserCredentials(RevokeExternalUserCredentialsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling revokeExternalUserCredentials");
    }

    return this.invokeAPI("revokeExternalUserCredentials", "/api/v1/datacatalog/revokeExternalUserCredentials", input, new GenericType<RevokeExternalUserCredentialsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Share the Data Share for external users.
   * @param input
   * @return ShareDataShareResponse
   */
  public ShareDataShareResponse shareDataShare(ShareDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling shareDataShare");
    }

    return this.invokeAPI("shareDataShare", "/api/v1/datacatalog/shareDataShare", input, new GenericType<ShareDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unshare the Data Share for external users.
   * @param input
   * @return UnshareDataShareResponse
   */
  public UnshareDataShareResponse unshareDataShare(UnshareDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unshareDataShare");
    }

    return this.invokeAPI("unshareDataShare", "/api/v1/datacatalog/unshareDataShare", input, new GenericType<UnshareDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update access of external users on a Data Share.
   * @param input
   * @return UpdateAccessOfExternalUsersOnDataShareResponse
   */
  public UpdateAccessOfExternalUsersOnDataShareResponse updateAccessOfExternalUsersOnDataShare(UpdateAccessOfExternalUsersOnDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAccessOfExternalUsersOnDataShare");
    }

    return this.invokeAPI("updateAccessOfExternalUsersOnDataShare", "/api/v1/datacatalog/updateAccessOfExternalUsersOnDataShare", input, new GenericType<UpdateAccessOfExternalUsersOnDataShareResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update the Data Share.
   * @param input
   * @return UpdateDataShareResponse
   */
  public UpdateDataShareResponse updateDataShare(UpdateDataShareRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateDataShare");
    }

    return this.invokeAPI("updateDataShare", "/api/v1/datacatalog/updateDataShare", input, new GenericType<UpdateDataShareResponse>(){}, NO_EXTENSION);
  }
}
