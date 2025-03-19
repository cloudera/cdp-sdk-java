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

package com.cloudera.cdp.iam.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.iam.model.AddMachineUserToGroupRequest;
import com.cloudera.cdp.iam.model.AddMachineUserToGroupResponse;
import com.cloudera.cdp.iam.model.AddSshPublicKeyRequest;
import com.cloudera.cdp.iam.model.AddSshPublicKeyResponse;
import com.cloudera.cdp.iam.model.AddUserToGroupRequest;
import com.cloudera.cdp.iam.model.AddUserToGroupResponse;
import com.cloudera.cdp.iam.model.AssignGroupResourceRoleRequest;
import com.cloudera.cdp.iam.model.AssignGroupResourceRoleResponse;
import com.cloudera.cdp.iam.model.AssignGroupRoleRequest;
import com.cloudera.cdp.iam.model.AssignGroupRoleResponse;
import com.cloudera.cdp.iam.model.AssignMachineUserResourceRoleRequest;
import com.cloudera.cdp.iam.model.AssignMachineUserResourceRoleResponse;
import com.cloudera.cdp.iam.model.AssignMachineUserRoleRequest;
import com.cloudera.cdp.iam.model.AssignMachineUserRoleResponse;
import com.cloudera.cdp.iam.model.AssignUserResourceRoleRequest;
import com.cloudera.cdp.iam.model.AssignUserResourceRoleResponse;
import com.cloudera.cdp.iam.model.AssignUserRoleRequest;
import com.cloudera.cdp.iam.model.AssignUserRoleResponse;
import com.cloudera.cdp.iam.model.CreateGroupRequest;
import com.cloudera.cdp.iam.model.CreateGroupResponse;
import com.cloudera.cdp.iam.model.CreateMachineUserAccessKeyRequest;
import com.cloudera.cdp.iam.model.CreateMachineUserAccessKeyResponse;
import com.cloudera.cdp.iam.model.CreateMachineUserRequest;
import com.cloudera.cdp.iam.model.CreateMachineUserResponse;
import com.cloudera.cdp.iam.model.CreateSamlProviderRequest;
import com.cloudera.cdp.iam.model.CreateSamlProviderResponse;
import com.cloudera.cdp.iam.model.CreateScimAccessTokenRequest;
import com.cloudera.cdp.iam.model.CreateScimAccessTokenResponse;
import com.cloudera.cdp.iam.model.CreateUserAccessKeyRequest;
import com.cloudera.cdp.iam.model.CreateUserAccessKeyResponse;
import com.cloudera.cdp.iam.model.CreateUserRequest;
import com.cloudera.cdp.iam.model.CreateUserResponse;
import com.cloudera.cdp.iam.model.DeleteAccessKeyRequest;
import com.cloudera.cdp.iam.model.DeleteAccessKeyResponse;
import com.cloudera.cdp.iam.model.DeleteGroupRequest;
import com.cloudera.cdp.iam.model.DeleteGroupResponse;
import com.cloudera.cdp.iam.model.DeleteMachineUserRequest;
import com.cloudera.cdp.iam.model.DeleteMachineUserResponse;
import com.cloudera.cdp.iam.model.DeleteSamlProviderRequest;
import com.cloudera.cdp.iam.model.DeleteSamlProviderResponse;
import com.cloudera.cdp.iam.model.DeleteScimAccessTokenRequest;
import com.cloudera.cdp.iam.model.DeleteScimAccessTokenResponse;
import com.cloudera.cdp.iam.model.DeleteSshPublicKeyRequest;
import com.cloudera.cdp.iam.model.DeleteSshPublicKeyResponse;
import com.cloudera.cdp.iam.model.DeleteUserRequest;
import com.cloudera.cdp.iam.model.DeleteUserResponse;
import com.cloudera.cdp.iam.model.DescribeSamlProviderRequest;
import com.cloudera.cdp.iam.model.DescribeSamlProviderResponse;
import com.cloudera.cdp.iam.model.DescribeSshPublicKeyRequest;
import com.cloudera.cdp.iam.model.DescribeSshPublicKeyResponse;
import com.cloudera.cdp.iam.model.DisableClouderaSSOLoginRequest;
import com.cloudera.cdp.iam.model.DisableClouderaSSOLoginResponse;
import com.cloudera.cdp.iam.model.EnableClouderaSSOLoginRequest;
import com.cloudera.cdp.iam.model.EnableClouderaSSOLoginResponse;
import com.cloudera.cdp.iam.model.Error;
import com.cloudera.cdp.iam.model.GenerateWorkloadAuthTokenRequest;
import com.cloudera.cdp.iam.model.GenerateWorkloadAuthTokenResponse;
import com.cloudera.cdp.iam.model.GetAccessKeyRequest;
import com.cloudera.cdp.iam.model.GetAccessKeyResponse;
import com.cloudera.cdp.iam.model.GetAccountMessagesRequest;
import com.cloudera.cdp.iam.model.GetAccountMessagesResponse;
import com.cloudera.cdp.iam.model.GetAccountRequest;
import com.cloudera.cdp.iam.model.GetAccountResponse;
import com.cloudera.cdp.iam.model.GetDefaultIdentityProviderRequest;
import com.cloudera.cdp.iam.model.GetDefaultIdentityProviderResponse;
import com.cloudera.cdp.iam.model.GetUserRequest;
import com.cloudera.cdp.iam.model.GetUserResponse;
import com.cloudera.cdp.iam.model.ListAccessKeysRequest;
import com.cloudera.cdp.iam.model.ListAccessKeysResponse;
import com.cloudera.cdp.iam.model.ListGroupAssignedResourceRolesRequest;
import com.cloudera.cdp.iam.model.ListGroupAssignedResourceRolesResponse;
import com.cloudera.cdp.iam.model.ListGroupAssignedRolesRequest;
import com.cloudera.cdp.iam.model.ListGroupAssignedRolesResponse;
import com.cloudera.cdp.iam.model.ListGroupMembersRequest;
import com.cloudera.cdp.iam.model.ListGroupMembersResponse;
import com.cloudera.cdp.iam.model.ListGroupsForMachineUserRequest;
import com.cloudera.cdp.iam.model.ListGroupsForMachineUserResponse;
import com.cloudera.cdp.iam.model.ListGroupsForUserRequest;
import com.cloudera.cdp.iam.model.ListGroupsForUserResponse;
import com.cloudera.cdp.iam.model.ListGroupsRequest;
import com.cloudera.cdp.iam.model.ListGroupsResponse;
import com.cloudera.cdp.iam.model.ListMachineUserAssignedResourceRolesRequest;
import com.cloudera.cdp.iam.model.ListMachineUserAssignedResourceRolesResponse;
import com.cloudera.cdp.iam.model.ListMachineUserAssignedRolesRequest;
import com.cloudera.cdp.iam.model.ListMachineUserAssignedRolesResponse;
import com.cloudera.cdp.iam.model.ListMachineUsersRequest;
import com.cloudera.cdp.iam.model.ListMachineUsersResponse;
import com.cloudera.cdp.iam.model.ListResourceAssigneesRequest;
import com.cloudera.cdp.iam.model.ListResourceAssigneesResponse;
import com.cloudera.cdp.iam.model.ListResourceRolesRequest;
import com.cloudera.cdp.iam.model.ListResourceRolesResponse;
import com.cloudera.cdp.iam.model.ListRolesRequest;
import com.cloudera.cdp.iam.model.ListRolesResponse;
import com.cloudera.cdp.iam.model.ListSamlProvidersRequest;
import com.cloudera.cdp.iam.model.ListSamlProvidersResponse;
import com.cloudera.cdp.iam.model.ListScimAccessTokensRequest;
import com.cloudera.cdp.iam.model.ListScimAccessTokensResponse;
import com.cloudera.cdp.iam.model.ListSshPublicKeysRequest;
import com.cloudera.cdp.iam.model.ListSshPublicKeysResponse;
import com.cloudera.cdp.iam.model.ListUserAssignedResourceRolesRequest;
import com.cloudera.cdp.iam.model.ListUserAssignedResourceRolesResponse;
import com.cloudera.cdp.iam.model.ListUserAssignedRolesRequest;
import com.cloudera.cdp.iam.model.ListUserAssignedRolesResponse;
import com.cloudera.cdp.iam.model.ListUsersRequest;
import com.cloudera.cdp.iam.model.ListUsersResponse;
import com.cloudera.cdp.iam.model.MigrateUsersToIdentityProviderRequest;
import com.cloudera.cdp.iam.model.MigrateUsersToIdentityProviderResponse;
import com.cloudera.cdp.iam.model.RemoveMachineUserFromGroupRequest;
import com.cloudera.cdp.iam.model.RemoveMachineUserFromGroupResponse;
import com.cloudera.cdp.iam.model.RemoveUserFromGroupRequest;
import com.cloudera.cdp.iam.model.RemoveUserFromGroupResponse;
import com.cloudera.cdp.iam.model.SetAccountMessagesRequest;
import com.cloudera.cdp.iam.model.SetAccountMessagesResponse;
import com.cloudera.cdp.iam.model.SetDefaultIdentityProviderRequest;
import com.cloudera.cdp.iam.model.SetDefaultIdentityProviderResponse;
import com.cloudera.cdp.iam.model.SetWorkloadPasswordPolicyRequest;
import com.cloudera.cdp.iam.model.SetWorkloadPasswordPolicyResponse;
import com.cloudera.cdp.iam.model.SetWorkloadPasswordRequest;
import com.cloudera.cdp.iam.model.SetWorkloadPasswordResponse;
import com.cloudera.cdp.iam.model.UnassignGroupResourceRoleRequest;
import com.cloudera.cdp.iam.model.UnassignGroupResourceRoleResponse;
import com.cloudera.cdp.iam.model.UnassignGroupRoleRequest;
import com.cloudera.cdp.iam.model.UnassignGroupRoleResponse;
import com.cloudera.cdp.iam.model.UnassignMachineUserResourceRoleRequest;
import com.cloudera.cdp.iam.model.UnassignMachineUserResourceRoleResponse;
import com.cloudera.cdp.iam.model.UnassignMachineUserRoleRequest;
import com.cloudera.cdp.iam.model.UnassignMachineUserRoleResponse;
import com.cloudera.cdp.iam.model.UnassignUserResourceRoleRequest;
import com.cloudera.cdp.iam.model.UnassignUserResourceRoleResponse;
import com.cloudera.cdp.iam.model.UnassignUserRoleRequest;
import com.cloudera.cdp.iam.model.UnassignUserRoleResponse;
import com.cloudera.cdp.iam.model.UnlockMachineUserInControlPlaneRequest;
import com.cloudera.cdp.iam.model.UnlockMachineUserInControlPlaneResponse;
import com.cloudera.cdp.iam.model.UnlockUserInControlPlaneRequest;
import com.cloudera.cdp.iam.model.UnlockUserInControlPlaneResponse;
import com.cloudera.cdp.iam.model.UnsetWorkloadPasswordMinLifetimeRequest;
import com.cloudera.cdp.iam.model.UnsetWorkloadPasswordMinLifetimeResponse;
import com.cloudera.cdp.iam.model.UnsetWorkloadPasswordPolicyRequest;
import com.cloudera.cdp.iam.model.UnsetWorkloadPasswordPolicyResponse;
import com.cloudera.cdp.iam.model.UpdateAccessKeyRequest;
import com.cloudera.cdp.iam.model.UpdateAccessKeyResponse;
import com.cloudera.cdp.iam.model.UpdateGroupRequest;
import com.cloudera.cdp.iam.model.UpdateGroupResponse;
import com.cloudera.cdp.iam.model.UpdateSamlProviderRequest;
import com.cloudera.cdp.iam.model.UpdateSamlProviderResponse;
import com.cloudera.cdp.iam.model.UpdateUserRequest;
import com.cloudera.cdp.iam.model.UpdateUserResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:30.375-07:00")
public class IamClient extends CdpClient {

  public static final String SERVICE_NAME = "iam";

  public IamClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public IamClient(CdpRequestContext<?> context) {
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
   * Add a machine user to group.
   * @param input
   * @return AddMachineUserToGroupResponse
   */
  public AddMachineUserToGroupResponse addMachineUserToGroup(AddMachineUserToGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addMachineUserToGroup");
    }

    return this.invokeAPI("addMachineUserToGroup", "/iam/addMachineUserToGroup", input, new GenericType<AddMachineUserToGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Adds an SSH public key for an actor.
   * @param input
   * @return AddSshPublicKeyResponse
   */
  public AddSshPublicKeyResponse addSshPublicKey(AddSshPublicKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addSshPublicKey");
    }

    return this.invokeAPI("addSshPublicKey", "/iam/addSshPublicKey", input, new GenericType<AddSshPublicKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Add a user to a group.
   * @param input
   * @return AddUserToGroupResponse
   */
  public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addUserToGroup");
    }

    return this.invokeAPI("addUserToGroup", "/iam/addUserToGroup", input, new GenericType<AddUserToGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Assign a resource role to a group.
   * @param input
   * @return AssignGroupResourceRoleResponse
   */
  public AssignGroupResourceRoleResponse assignGroupResourceRole(AssignGroupResourceRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling assignGroupResourceRole");
    }

    return this.invokeAPI("assignGroupResourceRole", "/iam/assignGroupResourceRole", input, new GenericType<AssignGroupResourceRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Assign a role to a group.
   * @param input
   * @return AssignGroupRoleResponse
   */
  public AssignGroupRoleResponse assignGroupRole(AssignGroupRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling assignGroupRole");
    }

    return this.invokeAPI("assignGroupRole", "/iam/assignGroupRole", input, new GenericType<AssignGroupRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Assign a resource role to a machine user.
   * @param input
   * @return AssignMachineUserResourceRoleResponse
   */
  public AssignMachineUserResourceRoleResponse assignMachineUserResourceRole(AssignMachineUserResourceRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling assignMachineUserResourceRole");
    }

    return this.invokeAPI("assignMachineUserResourceRole", "/iam/assignMachineUserResourceRole", input, new GenericType<AssignMachineUserResourceRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Assign a role to a machine user.
   * @param input
   * @return AssignMachineUserRoleResponse
   */
  public AssignMachineUserRoleResponse assignMachineUserRole(AssignMachineUserRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling assignMachineUserRole");
    }

    return this.invokeAPI("assignMachineUserRole", "/iam/assignMachineUserRole", input, new GenericType<AssignMachineUserRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Assign a resource role to a user.
   * @param input
   * @return AssignUserResourceRoleResponse
   */
  public AssignUserResourceRoleResponse assignUserResourceRole(AssignUserResourceRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling assignUserResourceRole");
    }

    return this.invokeAPI("assignUserResourceRole", "/iam/assignUserResourceRole", input, new GenericType<AssignUserResourceRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Assign a role to a user.
   * @param input
   * @return AssignUserRoleResponse
   */
  public AssignUserRoleResponse assignUserRole(AssignUserRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling assignUserRole");
    }

    return this.invokeAPI("assignUserRole", "/iam/assignUserRole", input, new GenericType<AssignUserRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a group.
   * @param input
   * @return CreateGroupResponse
   */
  public CreateGroupResponse createGroup(CreateGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createGroup");
    }

    return this.invokeAPI("createGroup", "/iam/createGroup", input, new GenericType<CreateGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Create a machine user.
   * @param input
   * @return CreateMachineUserResponse
   */
  public CreateMachineUserResponse createMachineUser(CreateMachineUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createMachineUser");
    }

    return this.invokeAPI("createMachineUser", "/iam/createMachineUser", input, new GenericType<CreateMachineUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new access key for a machine user.
   * @param input
   * @return CreateMachineUserAccessKeyResponse
   */
  public CreateMachineUserAccessKeyResponse createMachineUserAccessKey(CreateMachineUserAccessKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createMachineUserAccessKey");
    }

    return this.invokeAPI("createMachineUserAccessKey", "/iam/createMachineUserAccessKey", input, new GenericType<CreateMachineUserAccessKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a SAML provider in CDP.
   * @param input
   * @return CreateSamlProviderResponse
   */
  public CreateSamlProviderResponse createSamlProvider(CreateSamlProviderRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createSamlProvider");
    }

    return this.invokeAPI("createSamlProvider", "/iam/createSamlProvider", input, new GenericType<CreateSamlProviderResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a SCIM access token for a SCIM enabled identity provider.
   * @param input
   * @return CreateScimAccessTokenResponse
   */
  public CreateScimAccessTokenResponse createScimAccessToken(CreateScimAccessTokenRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createScimAccessToken");
    }

    return this.invokeAPI("createScimAccessToken", "/iam/createScimAccessToken", input, new GenericType<CreateScimAccessTokenResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a user in CDP.
   * @param input
   * @return CreateUserResponse
   */
  public CreateUserResponse createUser(CreateUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createUser");
    }

    return this.invokeAPI("createUser", "/iam/createUser", input, new GenericType<CreateUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates a new access key for a user.
   * @param input
   * @return CreateUserAccessKeyResponse
   */
  public CreateUserAccessKeyResponse createUserAccessKey(CreateUserAccessKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createUserAccessKey");
    }

    return this.invokeAPI("createUserAccessKey", "/iam/createUserAccessKey", input, new GenericType<CreateUserAccessKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes an access key.
   * @param input
   * @return DeleteAccessKeyResponse
   */
  public DeleteAccessKeyResponse deleteAccessKey(DeleteAccessKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteAccessKey");
    }

    return this.invokeAPI("deleteAccessKey", "/iam/deleteAccessKey", input, new GenericType<DeleteAccessKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a group.
   * @param input
   * @return DeleteGroupResponse
   */
  public DeleteGroupResponse deleteGroup(DeleteGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteGroup");
    }

    return this.invokeAPI("deleteGroup", "/iam/deleteGroup", input, new GenericType<DeleteGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete a machine user.
   * @param input
   * @return DeleteMachineUserResponse
   */
  public DeleteMachineUserResponse deleteMachineUser(DeleteMachineUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteMachineUser");
    }

    return this.invokeAPI("deleteMachineUser", "/iam/deleteMachineUser", input, new GenericType<DeleteMachineUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a SAML provider in CDP account.
   * @param input
   * @return DeleteSamlProviderResponse
   */
  public DeleteSamlProviderResponse deleteSamlProvider(DeleteSamlProviderRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteSamlProvider");
    }

    return this.invokeAPI("deleteSamlProvider", "/iam/deleteSamlProvider", input, new GenericType<DeleteSamlProviderResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a SCIM access token.
   * @param input
   * @return DeleteScimAccessTokenResponse
   */
  public DeleteScimAccessTokenResponse deleteScimAccessToken(DeleteScimAccessTokenRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteScimAccessToken");
    }

    return this.invokeAPI("deleteScimAccessToken", "/iam/deleteScimAccessToken", input, new GenericType<DeleteScimAccessTokenResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes an SSH public key for an actor.
   * @param input
   * @return DeleteSshPublicKeyResponse
   */
  public DeleteSshPublicKeyResponse deleteSshPublicKey(DeleteSshPublicKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteSshPublicKey");
    }

    return this.invokeAPI("deleteSshPublicKey", "/iam/deleteSshPublicKey", input, new GenericType<DeleteSshPublicKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a user and all associated resources.
   * @param input
   * @return DeleteUserResponse
   */
  public DeleteUserResponse deleteUser(DeleteUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteUser");
    }

    return this.invokeAPI("deleteUser", "/iam/deleteUser", input, new GenericType<DeleteUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes one SAML provider.
   * @param input
   * @return DescribeSamlProviderResponse
   */
  public DescribeSamlProviderResponse describeSamlProvider(DescribeSamlProviderRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeSamlProvider");
    }

    return this.invokeAPI("describeSamlProvider", "/iam/describeSamlProvider", input, new GenericType<DescribeSamlProviderResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes an SSH public key for an actor.
   * @param input
   * @return DescribeSshPublicKeyResponse
   */
  public DescribeSshPublicKeyResponse describeSshPublicKey(DescribeSshPublicKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeSshPublicKey");
    }

    return this.invokeAPI("describeSshPublicKey", "/iam/describeSshPublicKey", input, new GenericType<DescribeSshPublicKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Disables interactive login using Cloudera SSO for this account.
   * @param input
   * @return DisableClouderaSSOLoginResponse
   */
  public DisableClouderaSSOLoginResponse disableClouderaSSOLogin(DisableClouderaSSOLoginRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling disableClouderaSSOLogin");
    }

    return this.invokeAPI("disableClouderaSSOLogin", "/iam/disableClouderaSSOLogin", input, new GenericType<DisableClouderaSSOLoginResponse>(){}, NO_EXTENSION);
  }

  /**
   * Enables interactive login using Cloudera SSO for this account.
   * @param input
   * @return EnableClouderaSSOLoginResponse
   */
  public EnableClouderaSSOLoginResponse enableClouderaSSOLogin(EnableClouderaSSOLoginRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling enableClouderaSSOLogin");
    }

    return this.invokeAPI("enableClouderaSSOLogin", "/iam/enableClouderaSSOLogin", input, new GenericType<EnableClouderaSSOLoginResponse>(){}, NO_EXTENSION);
  }

  /**
   * Generates an authentication token for workload APIs.
   * @param input
   * @return GenerateWorkloadAuthTokenResponse
   */
  public GenerateWorkloadAuthTokenResponse generateWorkloadAuthToken(GenerateWorkloadAuthTokenRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling generateWorkloadAuthToken");
    }

    return this.invokeAPI("generateWorkloadAuthToken", "/iam/generateWorkloadAuthToken", input, new GenericType<GenerateWorkloadAuthTokenResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets information on an access key.
   * @param input
   * @return GetAccessKeyResponse
   */
  public GetAccessKeyResponse getAccessKey(GetAccessKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAccessKey");
    }

    return this.invokeAPI("getAccessKey", "/iam/getAccessKey", input, new GenericType<GetAccessKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retrieves information about the CDP account.
   * @param input
   * @return GetAccountResponse
   */
  public GetAccountResponse getAccount(GetAccountRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAccount");
    }

    return this.invokeAPI("getAccount", "/iam/getAccount", input, new GenericType<GetAccountResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get account messages.
   * @param input
   * @return GetAccountMessagesResponse
   */
  public GetAccountMessagesResponse getAccountMessages(GetAccountMessagesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getAccountMessages");
    }

    return this.invokeAPI("getAccountMessages", "/iam/getAccountMessages", input, new GenericType<GetAccountMessagesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retrieves the CRN of the default identity provider.
   * @param input
   * @return GetDefaultIdentityProviderResponse
   */
  public GetDefaultIdentityProviderResponse getDefaultIdentityProvider(GetDefaultIdentityProviderRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDefaultIdentityProvider");
    }

    return this.invokeAPI("getDefaultIdentityProvider", "/iam/getDefaultIdentityProvider", input, new GenericType<GetDefaultIdentityProviderResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gets information on a user.
   * @param input
   * @return GetUserResponse
   */
  public GetUserResponse getUser(GetUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getUser");
    }

    return this.invokeAPI("getUser", "/iam/getUser", input, new GenericType<GetUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists access keys.
   * @param input
   * @return ListAccessKeysResponse
   */
  public ListAccessKeysResponse listAccessKeys(ListAccessKeysRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listAccessKeys");
    }

    return this.invokeAPI("listAccessKeys", "/iam/listAccessKeys", input, new GenericType<ListAccessKeysResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists a group&#39;s assigned resource roles.
   * @param input
   * @return ListGroupAssignedResourceRolesResponse
   */
  public ListGroupAssignedResourceRolesResponse listGroupAssignedResourceRoles(ListGroupAssignedResourceRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listGroupAssignedResourceRoles");
    }

    return this.invokeAPI("listGroupAssignedResourceRoles", "/iam/listGroupAssignedResourceRoles", input, new GenericType<ListGroupAssignedResourceRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the group&#39;s assigned roles.
   * @param input
   * @return ListGroupAssignedRolesResponse
   */
  public ListGroupAssignedRolesResponse listGroupAssignedRoles(ListGroupAssignedRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listGroupAssignedRoles");
    }

    return this.invokeAPI("listGroupAssignedRoles", "/iam/listGroupAssignedRoles", input, new GenericType<ListGroupAssignedRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * List the members of a group.
   * @param input
   * @return ListGroupMembersResponse
   */
  public ListGroupMembersResponse listGroupMembers(ListGroupMembersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listGroupMembers");
    }

    return this.invokeAPI("listGroupMembers", "/iam/listGroupMembers", input, new GenericType<ListGroupMembersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists groups.
   * @param input
   * @return ListGroupsResponse
   */
  public ListGroupsResponse listGroups(ListGroupsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listGroups");
    }

    return this.invokeAPI("listGroups", "/iam/listGroups", input, new GenericType<ListGroupsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List the groups that the machine user belongs to.
   * @param input
   * @return ListGroupsForMachineUserResponse
   */
  public ListGroupsForMachineUserResponse listGroupsForMachineUser(ListGroupsForMachineUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listGroupsForMachineUser");
    }

    return this.invokeAPI("listGroupsForMachineUser", "/iam/listGroupsForMachineUser", input, new GenericType<ListGroupsForMachineUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * List the groups that the user belongs to.
   * @param input
   * @return ListGroupsForUserResponse
   */
  public ListGroupsForUserResponse listGroupsForUser(ListGroupsForUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listGroupsForUser");
    }

    return this.invokeAPI("listGroupsForUser", "/iam/listGroupsForUser", input, new GenericType<ListGroupsForUserResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists a machine user&#39;s assigned resource roles.
   * @param input
   * @return ListMachineUserAssignedResourceRolesResponse
   */
  public ListMachineUserAssignedResourceRolesResponse listMachineUserAssignedResourceRoles(ListMachineUserAssignedResourceRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listMachineUserAssignedResourceRoles");
    }

    return this.invokeAPI("listMachineUserAssignedResourceRoles", "/iam/listMachineUserAssignedResourceRoles", input, new GenericType<ListMachineUserAssignedResourceRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the machine user&#39;s assigned roles.
   * @param input
   * @return ListMachineUserAssignedRolesResponse
   */
  public ListMachineUserAssignedRolesResponse listMachineUserAssignedRoles(ListMachineUserAssignedRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listMachineUserAssignedRoles");
    }

    return this.invokeAPI("listMachineUserAssignedRoles", "/iam/listMachineUserAssignedRoles", input, new GenericType<ListMachineUserAssignedRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists machine users.
   * @param input
   * @return ListMachineUsersResponse
   */
  public ListMachineUsersResponse listMachineUsers(ListMachineUsersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listMachineUsers");
    }

    return this.invokeAPI("listMachineUsers", "/iam/listMachineUsers", input, new GenericType<ListMachineUsersResponse>(){}, NO_EXTENSION);
  }

  /**
   * List the resource assignees and their respective resource roles for the resource.
   * @param input
   * @return ListResourceAssigneesResponse
   */
  public ListResourceAssigneesResponse listResourceAssignees(ListResourceAssigneesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listResourceAssignees");
    }

    return this.invokeAPI("listResourceAssignees", "/iam/listResourceAssignees", input, new GenericType<ListResourceAssigneesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists all the available resource roles.
   * @param input
   * @return ListResourceRolesResponse
   */
  public ListResourceRolesResponse listResourceRoles(ListResourceRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listResourceRoles");
    }

    return this.invokeAPI("listResourceRoles", "/iam/listResourceRoles", input, new GenericType<ListResourceRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists all the available roles.
   * @param input
   * @return ListRolesResponse
   */
  public ListRolesResponse listRoles(ListRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listRoles");
    }

    return this.invokeAPI("listRoles", "/iam/listRoles", input, new GenericType<ListRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists SAML providers in CDP account.
   * @param input
   * @return ListSamlProvidersResponse
   */
  public ListSamlProvidersResponse listSamlProviders(ListSamlProvidersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listSamlProviders");
    }

    return this.invokeAPI("listSamlProviders", "/iam/listSamlProviders", input, new GenericType<ListSamlProvidersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists SCIM access tokens for a SCIM enabled identity provider.
   * @param input
   * @return ListScimAccessTokensResponse
   */
  public ListScimAccessTokensResponse listScimAccessTokens(ListScimAccessTokensRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listScimAccessTokens");
    }

    return this.invokeAPI("listScimAccessTokens", "/iam/listScimAccessTokens", input, new GenericType<ListScimAccessTokensResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists SSH public keys for an actor.
   * @param input
   * @return ListSshPublicKeysResponse
   */
  public ListSshPublicKeysResponse listSshPublicKeys(ListSshPublicKeysRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listSshPublicKeys");
    }

    return this.invokeAPI("listSshPublicKeys", "/iam/listSshPublicKeys", input, new GenericType<ListSshPublicKeysResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists a user&#39;s assigned resource roles.
   * @param input
   * @return ListUserAssignedResourceRolesResponse
   */
  public ListUserAssignedResourceRolesResponse listUserAssignedResourceRoles(ListUserAssignedResourceRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listUserAssignedResourceRoles");
    }

    return this.invokeAPI("listUserAssignedResourceRoles", "/iam/listUserAssignedResourceRoles", input, new GenericType<ListUserAssignedResourceRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the user&#39;s assigned roles.
   * @param input
   * @return ListUserAssignedRolesResponse
   */
  public ListUserAssignedRolesResponse listUserAssignedRoles(ListUserAssignedRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listUserAssignedRoles");
    }

    return this.invokeAPI("listUserAssignedRoles", "/iam/listUserAssignedRoles", input, new GenericType<ListUserAssignedRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists users.
   * @param input
   * @return ListUsersResponse
   */
  public ListUsersResponse listUsers(ListUsersRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listUsers");
    }

    return this.invokeAPI("listUsers", "/iam/listUsers", input, new GenericType<ListUsersResponse>(){}, NO_EXTENSION);
  }

  /**
   * Migrates all users from an identity provider connector to a different identity provider connector.
   * @param input
   * @return MigrateUsersToIdentityProviderResponse
   */
  public MigrateUsersToIdentityProviderResponse migrateUsersToIdentityProvider(MigrateUsersToIdentityProviderRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling migrateUsersToIdentityProvider");
    }

    return this.invokeAPI("migrateUsersToIdentityProvider", "/iam/migrateUsersToIdentityProvider", input, new GenericType<MigrateUsersToIdentityProviderResponse>(){}, NO_EXTENSION);
  }

  /**
   * Remove a machine user from a group.
   * @param input
   * @return RemoveMachineUserFromGroupResponse
   */
  public RemoveMachineUserFromGroupResponse removeMachineUserFromGroup(RemoveMachineUserFromGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling removeMachineUserFromGroup");
    }

    return this.invokeAPI("removeMachineUserFromGroup", "/iam/removeMachineUserFromGroup", input, new GenericType<RemoveMachineUserFromGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Remove a user from a group.
   * @param input
   * @return RemoveUserFromGroupResponse
   */
  public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling removeUserFromGroup");
    }

    return this.invokeAPI("removeUserFromGroup", "/iam/removeUserFromGroup", input, new GenericType<RemoveUserFromGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Set messages for an account.
   * @param input
   * @return SetAccountMessagesResponse
   */
  public SetAccountMessagesResponse setAccountMessages(SetAccountMessagesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setAccountMessages");
    }

    return this.invokeAPI("setAccountMessages", "/iam/setAccountMessages", input, new GenericType<SetAccountMessagesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Sets the default identity provider.
   * @param input
   * @return SetDefaultIdentityProviderResponse
   */
  public SetDefaultIdentityProviderResponse setDefaultIdentityProvider(SetDefaultIdentityProviderRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setDefaultIdentityProvider");
    }

    return this.invokeAPI("setDefaultIdentityProvider", "/iam/setDefaultIdentityProvider", input, new GenericType<SetDefaultIdentityProviderResponse>(){}, NO_EXTENSION);
  }

  /**
   * Set the workload password for an actor.
   * @param input
   * @return SetWorkloadPasswordResponse
   */
  public SetWorkloadPasswordResponse setWorkloadPassword(SetWorkloadPasswordRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setWorkloadPassword");
    }

    return this.invokeAPI("setWorkloadPassword", "/iam/setWorkloadPassword", input, new GenericType<SetWorkloadPasswordResponse>(){}, NO_EXTENSION);
  }

  /**
   * Set the workload password policy for the account.
   * @param input
   * @return SetWorkloadPasswordPolicyResponse
   */
  public SetWorkloadPasswordPolicyResponse setWorkloadPasswordPolicy(SetWorkloadPasswordPolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setWorkloadPasswordPolicy");
    }

    return this.invokeAPI("setWorkloadPasswordPolicy", "/iam/setWorkloadPasswordPolicy", input, new GenericType<SetWorkloadPasswordPolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unassign a resource role from a group.
   * @param input
   * @return UnassignGroupResourceRoleResponse
   */
  public UnassignGroupResourceRoleResponse unassignGroupResourceRole(UnassignGroupResourceRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unassignGroupResourceRole");
    }

    return this.invokeAPI("unassignGroupResourceRole", "/iam/unassignGroupResourceRole", input, new GenericType<UnassignGroupResourceRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unassign a role from a group.
   * @param input
   * @return UnassignGroupRoleResponse
   */
  public UnassignGroupRoleResponse unassignGroupRole(UnassignGroupRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unassignGroupRole");
    }

    return this.invokeAPI("unassignGroupRole", "/iam/unassignGroupRole", input, new GenericType<UnassignGroupRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unassign a resource role from a machine user.
   * @param input
   * @return UnassignMachineUserResourceRoleResponse
   */
  public UnassignMachineUserResourceRoleResponse unassignMachineUserResourceRole(UnassignMachineUserResourceRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unassignMachineUserResourceRole");
    }

    return this.invokeAPI("unassignMachineUserResourceRole", "/iam/unassignMachineUserResourceRole", input, new GenericType<UnassignMachineUserResourceRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unassign a role from a machine user.
   * @param input
   * @return UnassignMachineUserRoleResponse
   */
  public UnassignMachineUserRoleResponse unassignMachineUserRole(UnassignMachineUserRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unassignMachineUserRole");
    }

    return this.invokeAPI("unassignMachineUserRole", "/iam/unassignMachineUserRole", input, new GenericType<UnassignMachineUserRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unassign a resource role from a user.
   * @param input
   * @return UnassignUserResourceRoleResponse
   */
  public UnassignUserResourceRoleResponse unassignUserResourceRole(UnassignUserResourceRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unassignUserResourceRole");
    }

    return this.invokeAPI("unassignUserResourceRole", "/iam/unassignUserResourceRole", input, new GenericType<UnassignUserResourceRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unassign a role from a user.
   * @param input
   * @return UnassignUserRoleResponse
   */
  public UnassignUserRoleResponse unassignUserRole(UnassignUserRoleRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unassignUserRole");
    }

    return this.invokeAPI("unassignUserRole", "/iam/unassignUserRole", input, new GenericType<UnassignUserRoleResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unlocks machine user in the CDP control plane.
   * @param input
   * @return UnlockMachineUserInControlPlaneResponse
   */
  public UnlockMachineUserInControlPlaneResponse unlockMachineUserInControlPlane(UnlockMachineUserInControlPlaneRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unlockMachineUserInControlPlane");
    }

    return this.invokeAPI("unlockMachineUserInControlPlane", "/iam/unlockMachineUserInControlPlane", input, new GenericType<UnlockMachineUserInControlPlaneResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unlocks user in the CDP control plane.
   * @param input
   * @return UnlockUserInControlPlaneResponse
   */
  public UnlockUserInControlPlaneResponse unlockUserInControlPlane(UnlockUserInControlPlaneRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unlockUserInControlPlane");
    }

    return this.invokeAPI("unlockUserInControlPlane", "/iam/unlockUserInControlPlane", input, new GenericType<UnlockUserInControlPlaneResponse>(){}, NO_EXTENSION);
  }

  /**
   * Removes workload password minimum lifetime date for an actor.
   * @param input
   * @return UnsetWorkloadPasswordMinLifetimeResponse
   */
  public UnsetWorkloadPasswordMinLifetimeResponse unsetWorkloadPasswordMinLifetime(UnsetWorkloadPasswordMinLifetimeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unsetWorkloadPasswordMinLifetime");
    }

    return this.invokeAPI("unsetWorkloadPasswordMinLifetime", "/iam/unsetWorkloadPasswordMinLifetime", input, new GenericType<UnsetWorkloadPasswordMinLifetimeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Unset workload password policy for the account.
   * @param input
   * @return UnsetWorkloadPasswordPolicyResponse
   */
  public UnsetWorkloadPasswordPolicyResponse unsetWorkloadPasswordPolicy(UnsetWorkloadPasswordPolicyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling unsetWorkloadPasswordPolicy");
    }

    return this.invokeAPI("unsetWorkloadPasswordPolicy", "/iam/unsetWorkloadPasswordPolicy", input, new GenericType<UnsetWorkloadPasswordPolicyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates an access key.
   * @param input
   * @return UpdateAccessKeyResponse
   */
  public UpdateAccessKeyResponse updateAccessKey(UpdateAccessKeyRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateAccessKey");
    }

    return this.invokeAPI("updateAccessKey", "/iam/updateAccessKey", input, new GenericType<UpdateAccessKeyResponse>(){}, NO_EXTENSION);
  }

  /**
   * Update a group.
   * @param input
   * @return UpdateGroupResponse
   */
  public UpdateGroupResponse updateGroup(UpdateGroupRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateGroup");
    }

    return this.invokeAPI("updateGroup", "/iam/updateGroup", input, new GenericType<UpdateGroupResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates a SAML provider in CDP.
   * @param input
   * @return UpdateSamlProviderResponse
   */
  public UpdateSamlProviderResponse updateSamlProvider(UpdateSamlProviderRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateSamlProvider");
    }

    return this.invokeAPI("updateSamlProvider", "/iam/updateSamlProvider", input, new GenericType<UpdateSamlProviderResponse>(){}, NO_EXTENSION);
  }

  /**
   * Updates a user.
   * @param input
   * @return UpdateUserResponse
   */
  public UpdateUserResponse updateUser(UpdateUserRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling updateUser");
    }

    return this.invokeAPI("updateUser", "/iam/updateUser", input, new GenericType<UpdateUserResponse>(){}, NO_EXTENSION);
  }
}
