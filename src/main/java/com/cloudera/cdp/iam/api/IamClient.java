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

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.WorkloadResponse;
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
import com.cloudera.cdp.iam.model.DeleteSshPublicKeyRequest;
import com.cloudera.cdp.iam.model.DeleteSshPublicKeyResponse;
import com.cloudera.cdp.iam.model.DeleteUserRequest;
import com.cloudera.cdp.iam.model.DeleteUserResponse;
import com.cloudera.cdp.iam.model.DescribeSshPublicKeyRequest;
import com.cloudera.cdp.iam.model.DescribeSshPublicKeyResponse;
import com.cloudera.cdp.iam.model.DisableClouderaSSOLoginRequest;
import com.cloudera.cdp.iam.model.DisableClouderaSSOLoginResponse;
import com.cloudera.cdp.iam.model.EnableClouderaSSOLoginRequest;
import com.cloudera.cdp.iam.model.EnableClouderaSSOLoginResponse;
import com.cloudera.cdp.iam.model.Error;
import com.cloudera.cdp.iam.model.GetAccessKeyRequest;
import com.cloudera.cdp.iam.model.GetAccessKeyResponse;
import com.cloudera.cdp.iam.model.GetAccountMessagesRequest;
import com.cloudera.cdp.iam.model.GetAccountMessagesResponse;
import com.cloudera.cdp.iam.model.GetAccountRequest;
import com.cloudera.cdp.iam.model.GetAccountResponse;
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
import com.cloudera.cdp.iam.model.ListSshPublicKeysRequest;
import com.cloudera.cdp.iam.model.ListSshPublicKeysResponse;
import com.cloudera.cdp.iam.model.ListUserAssignedResourceRolesRequest;
import com.cloudera.cdp.iam.model.ListUserAssignedResourceRolesResponse;
import com.cloudera.cdp.iam.model.ListUserAssignedRolesRequest;
import com.cloudera.cdp.iam.model.ListUserAssignedRolesResponse;
import com.cloudera.cdp.iam.model.ListUsersRequest;
import com.cloudera.cdp.iam.model.ListUsersResponse;
import com.cloudera.cdp.iam.model.RemoveMachineUserFromGroupRequest;
import com.cloudera.cdp.iam.model.RemoveMachineUserFromGroupResponse;
import com.cloudera.cdp.iam.model.RemoveUserFromGroupRequest;
import com.cloudera.cdp.iam.model.RemoveUserFromGroupResponse;
import com.cloudera.cdp.iam.model.SetAccountMessagesRequest;
import com.cloudera.cdp.iam.model.SetAccountMessagesResponse;
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
import com.cloudera.cdp.iam.model.UpdateAccessKeyRequest;
import com.cloudera.cdp.iam.model.UpdateAccessKeyResponse;
import com.cloudera.cdp.iam.model.UpdateGroupRequest;
import com.cloudera.cdp.iam.model.UpdateGroupResponse;
import com.cloudera.cdp.iam.model.UpdateSamlProviderRequest;
import com.cloudera.cdp.iam.model.UpdateSamlProviderResponse;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-03-03T09:29:05.178-08:00")
public class IamClient extends CdpClient {

  public static final String SERVICE_NAME = "iam";

  public IamClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
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

    return this.invokeAPI("/iam/addMachineUserToGroup", input, new GenericType<AddMachineUserToGroupResponse>(){});
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

    return this.invokeAPI("/iam/addSshPublicKey", input, new GenericType<AddSshPublicKeyResponse>(){});
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

    return this.invokeAPI("/iam/addUserToGroup", input, new GenericType<AddUserToGroupResponse>(){});
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

    return this.invokeAPI("/iam/assignGroupResourceRole", input, new GenericType<AssignGroupResourceRoleResponse>(){});
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

    return this.invokeAPI("/iam/assignGroupRole", input, new GenericType<AssignGroupRoleResponse>(){});
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

    return this.invokeAPI("/iam/assignMachineUserResourceRole", input, new GenericType<AssignMachineUserResourceRoleResponse>(){});
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

    return this.invokeAPI("/iam/assignMachineUserRole", input, new GenericType<AssignMachineUserRoleResponse>(){});
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

    return this.invokeAPI("/iam/assignUserResourceRole", input, new GenericType<AssignUserResourceRoleResponse>(){});
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

    return this.invokeAPI("/iam/assignUserRole", input, new GenericType<AssignUserRoleResponse>(){});
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

    return this.invokeAPI("/iam/createGroup", input, new GenericType<CreateGroupResponse>(){});
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

    return this.invokeAPI("/iam/createMachineUser", input, new GenericType<CreateMachineUserResponse>(){});
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

    return this.invokeAPI("/iam/createMachineUserAccessKey", input, new GenericType<CreateMachineUserAccessKeyResponse>(){});
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

    return this.invokeAPI("/iam/createSamlProvider", input, new GenericType<CreateSamlProviderResponse>(){});
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

    return this.invokeAPI("/iam/createUser", input, new GenericType<CreateUserResponse>(){});
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

    return this.invokeAPI("/iam/createUserAccessKey", input, new GenericType<CreateUserAccessKeyResponse>(){});
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

    return this.invokeAPI("/iam/deleteAccessKey", input, new GenericType<DeleteAccessKeyResponse>(){});
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

    return this.invokeAPI("/iam/deleteGroup", input, new GenericType<DeleteGroupResponse>(){});
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

    return this.invokeAPI("/iam/deleteMachineUser", input, new GenericType<DeleteMachineUserResponse>(){});
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

    return this.invokeAPI("/iam/deleteSamlProvider", input, new GenericType<DeleteSamlProviderResponse>(){});
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

    return this.invokeAPI("/iam/deleteSshPublicKey", input, new GenericType<DeleteSshPublicKeyResponse>(){});
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

    return this.invokeAPI("/iam/deleteUser", input, new GenericType<DeleteUserResponse>(){});
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

    return this.invokeAPI("/iam/describeSshPublicKey", input, new GenericType<DescribeSshPublicKeyResponse>(){});
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

    return this.invokeAPI("/iam/disableClouderaSSOLogin", input, new GenericType<DisableClouderaSSOLoginResponse>(){});
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

    return this.invokeAPI("/iam/enableClouderaSSOLogin", input, new GenericType<EnableClouderaSSOLoginResponse>(){});
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

    return this.invokeAPI("/iam/getAccessKey", input, new GenericType<GetAccessKeyResponse>(){});
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

    return this.invokeAPI("/iam/getAccount", input, new GenericType<GetAccountResponse>(){});
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

    return this.invokeAPI("/iam/getAccountMessages", input, new GenericType<GetAccountMessagesResponse>(){});
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

    return this.invokeAPI("/iam/getUser", input, new GenericType<GetUserResponse>(){});
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

    return this.invokeAPI("/iam/listAccessKeys", input, new GenericType<ListAccessKeysResponse>(){});
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

    return this.invokeAPI("/iam/listGroupAssignedResourceRoles", input, new GenericType<ListGroupAssignedResourceRolesResponse>(){});
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

    return this.invokeAPI("/iam/listGroupAssignedRoles", input, new GenericType<ListGroupAssignedRolesResponse>(){});
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

    return this.invokeAPI("/iam/listGroupMembers", input, new GenericType<ListGroupMembersResponse>(){});
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

    return this.invokeAPI("/iam/listGroups", input, new GenericType<ListGroupsResponse>(){});
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

    return this.invokeAPI("/iam/listGroupsForMachineUser", input, new GenericType<ListGroupsForMachineUserResponse>(){});
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

    return this.invokeAPI("/iam/listGroupsForUser", input, new GenericType<ListGroupsForUserResponse>(){});
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

    return this.invokeAPI("/iam/listMachineUserAssignedResourceRoles", input, new GenericType<ListMachineUserAssignedResourceRolesResponse>(){});
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

    return this.invokeAPI("/iam/listMachineUserAssignedRoles", input, new GenericType<ListMachineUserAssignedRolesResponse>(){});
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

    return this.invokeAPI("/iam/listMachineUsers", input, new GenericType<ListMachineUsersResponse>(){});
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

    return this.invokeAPI("/iam/listResourceAssignees", input, new GenericType<ListResourceAssigneesResponse>(){});
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

    return this.invokeAPI("/iam/listResourceRoles", input, new GenericType<ListResourceRolesResponse>(){});
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

    return this.invokeAPI("/iam/listRoles", input, new GenericType<ListRolesResponse>(){});
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

    return this.invokeAPI("/iam/listSamlProviders", input, new GenericType<ListSamlProvidersResponse>(){});
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

    return this.invokeAPI("/iam/listSshPublicKeys", input, new GenericType<ListSshPublicKeysResponse>(){});
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

    return this.invokeAPI("/iam/listUserAssignedResourceRoles", input, new GenericType<ListUserAssignedResourceRolesResponse>(){});
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

    return this.invokeAPI("/iam/listUserAssignedRoles", input, new GenericType<ListUserAssignedRolesResponse>(){});
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

    return this.invokeAPI("/iam/listUsers", input, new GenericType<ListUsersResponse>(){});
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

    return this.invokeAPI("/iam/removeMachineUserFromGroup", input, new GenericType<RemoveMachineUserFromGroupResponse>(){});
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

    return this.invokeAPI("/iam/removeUserFromGroup", input, new GenericType<RemoveUserFromGroupResponse>(){});
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

    return this.invokeAPI("/iam/setAccountMessages", input, new GenericType<SetAccountMessagesResponse>(){});
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

    return this.invokeAPI("/iam/setWorkloadPassword", input, new GenericType<SetWorkloadPasswordResponse>(){});
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

    return this.invokeAPI("/iam/setWorkloadPasswordPolicy", input, new GenericType<SetWorkloadPasswordPolicyResponse>(){});
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

    return this.invokeAPI("/iam/unassignGroupResourceRole", input, new GenericType<UnassignGroupResourceRoleResponse>(){});
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

    return this.invokeAPI("/iam/unassignGroupRole", input, new GenericType<UnassignGroupRoleResponse>(){});
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

    return this.invokeAPI("/iam/unassignMachineUserResourceRole", input, new GenericType<UnassignMachineUserResourceRoleResponse>(){});
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

    return this.invokeAPI("/iam/unassignMachineUserRole", input, new GenericType<UnassignMachineUserRoleResponse>(){});
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

    return this.invokeAPI("/iam/unassignUserResourceRole", input, new GenericType<UnassignUserResourceRoleResponse>(){});
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

    return this.invokeAPI("/iam/unassignUserRole", input, new GenericType<UnassignUserRoleResponse>(){});
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

    return this.invokeAPI("/iam/updateAccessKey", input, new GenericType<UpdateAccessKeyResponse>(){});
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

    return this.invokeAPI("/iam/updateGroup", input, new GenericType<UpdateGroupResponse>(){});
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

    return this.invokeAPI("/iam/updateSamlProvider", input, new GenericType<UpdateSamlProviderResponse>(){});
  }
}
