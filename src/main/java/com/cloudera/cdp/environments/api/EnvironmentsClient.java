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

package com.cloudera.cdp.environments.api;

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.environments.model.ChangeEnvironmentCredentialRequest;
import com.cloudera.cdp.environments.model.ChangeEnvironmentCredentialResponse;
import com.cloudera.cdp.environments.model.CreateAWSCredentialRequest;
import com.cloudera.cdp.environments.model.CreateAWSCredentialResponse;
import com.cloudera.cdp.environments.model.CreateAWSEnvironmentRequest;
import com.cloudera.cdp.environments.model.CreateAWSEnvironmentResponse;
import com.cloudera.cdp.environments.model.DeleteCredentialRequest;
import com.cloudera.cdp.environments.model.DeleteCredentialResponse;
import com.cloudera.cdp.environments.model.DeleteEnvironmentRequest;
import com.cloudera.cdp.environments.model.DeleteEnvironmentResponse;
import com.cloudera.cdp.environments.model.DescribeEnvironmentRequest;
import com.cloudera.cdp.environments.model.DescribeEnvironmentResponse;
import com.cloudera.cdp.environments.model.Error;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsRequest;
import com.cloudera.cdp.environments.model.GetIdBrokerMappingsResponse;
import com.cloudera.cdp.environments.model.GetRootCertificateRequest;
import com.cloudera.cdp.environments.model.GetRootCertificateResponse;
import com.cloudera.cdp.environments.model.ListCredentialsRequest;
import com.cloudera.cdp.environments.model.ListCredentialsResponse;
import com.cloudera.cdp.environments.model.ListEnvironmentsRequest;
import com.cloudera.cdp.environments.model.ListEnvironmentsResponse;
import com.cloudera.cdp.environments.model.SetIdBrokerMappingsRequest;
import com.cloudera.cdp.environments.model.SetIdBrokerMappingsResponse;
import com.cloudera.cdp.environments.model.SetPasswordRequest;
import com.cloudera.cdp.environments.model.SetPasswordResponse;
import com.cloudera.cdp.environments.model.SyncAllUsersRequest;
import com.cloudera.cdp.environments.model.SyncAllUsersResponse;
import com.cloudera.cdp.environments.model.SyncStatusRequest;
import com.cloudera.cdp.environments.model.SyncStatusResponse;
import com.cloudera.cdp.environments.model.SyncUserRequest;
import com.cloudera.cdp.environments.model.SyncUserResponse;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-23T16:36:40.789-07:00")
public class EnvironmentsClient extends CdpClient {

  public static final String SERVICE_NAME = "api";

  public EnvironmentsClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  /**
   * Changes the credential for an environment.
   * @param input
   * @return ChangeEnvironmentCredentialResponse
   */
  public ChangeEnvironmentCredentialResponse changeEnvironmentCredential(ChangeEnvironmentCredentialRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling changeEnvironmentCredential");
     }
    return this.invokeAPI("/api/v1/environments2/changeEnvironmentCredential", input, new GenericType<ChangeEnvironmentCredentialResponse>(){});
  }

  /**
   * Creates a new AWS credential that can be attatched to an environment. The credential is used for authorization to provision resources such as compute instances within your cloud provider account.
   * @param input
   * @return CreateAWSCredentialResponse
   */
  public CreateAWSCredentialResponse createAWSCredential(CreateAWSCredentialRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling createAWSCredential");
     }
    return this.invokeAPI("/api/v1/environments2/createAWSCredential", input, new GenericType<CreateAWSCredentialResponse>(){});
  }

  /**
   * Creates a new AWS environment by providing the cloud provider access and network information. A FreeIPA server will be automatically provisioned when an environment is created.
   * @param input
   * @return CreateAWSEnvironmentResponse
   */
  public CreateAWSEnvironmentResponse createAWSEnvironment(CreateAWSEnvironmentRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling createAWSEnvironment");
     }
    return this.invokeAPI("/api/v1/environments2/createAWSEnvironment", input, new GenericType<CreateAWSEnvironmentResponse>(){});
  }

  /**
   * Deletes a credential.
   * @param input
   * @return DeleteCredentialResponse
   */
  public DeleteCredentialResponse deleteCredential(DeleteCredentialRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling deleteCredential");
     }
    return this.invokeAPI("/api/v1/environments2/deleteCredential", input, new GenericType<DeleteCredentialResponse>(){});
  }

  /**
   * Deletes an environment.
   * @param input
   * @return DeleteEnvironmentResponse
   */
  public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling deleteEnvironment");
     }
    return this.invokeAPI("/api/v1/environments2/deleteEnvironment", input, new GenericType<DeleteEnvironmentResponse>(){});
  }

  /**
   * Describes an environment.
   * @param input
   * @return DescribeEnvironmentResponse
   */
  public DescribeEnvironmentResponse describeEnvironment(DescribeEnvironmentRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling describeEnvironment");
     }
    return this.invokeAPI("/api/v1/environments2/describeEnvironment", input, new GenericType<DescribeEnvironmentResponse>(){});
  }

  /**
   * Gets all ID Broker mappings for an environment.
   * @param input
   * @return GetIdBrokerMappingsResponse
   */
  public GetIdBrokerMappingsResponse getIdBrokerMappings(GetIdBrokerMappingsRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling getIdBrokerMappings");
     }
    return this.invokeAPI("/api/v1/environments2/getIdBrokerMappings", input, new GenericType<GetIdBrokerMappingsResponse>(){});
  }

  /**
   * This API provides contents of public certificate for an environment.
   * @param input
   * @return GetRootCertificateResponse
   */
  public GetRootCertificateResponse getRootCertificate(GetRootCertificateRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling getRootCertificate");
     }
    return this.invokeAPI("/api/v1/environments2/getRootCertificate", input, new GenericType<GetRootCertificateResponse>(){});
  }

  /**
   * Lists credentials.
   * @param input
   * @return ListCredentialsResponse
   */
  public ListCredentialsResponse listCredentials(ListCredentialsRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling listCredentials");
     }
    return this.invokeAPI("/api/v1/environments2/listCredentials", input, new GenericType<ListCredentialsResponse>(){});
  }

  /**
   * Lists environments.
   * @param input
   * @return ListEnvironmentsResponse
   */
  public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling listEnvironments");
     }
    return this.invokeAPI("/api/v1/environments2/listEnvironments", input, new GenericType<ListEnvironmentsResponse>(){});
  }

  /**
   * Sets all ID Broker mappings for an environment.
   * @param input
   * @return SetIdBrokerMappingsResponse
   */
  public SetIdBrokerMappingsResponse setIdBrokerMappings(SetIdBrokerMappingsRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling setIdBrokerMappings");
     }
    return this.invokeAPI("/api/v1/environments2/setIdBrokerMappings", input, new GenericType<SetIdBrokerMappingsResponse>(){});
  }

  /**
   * Sets workload user&#39;s password and updates into all environments.
   * @param input
   * @return SetPasswordResponse
   */
  public SetPasswordResponse setPassword(SetPasswordRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling setPassword");
     }
    return this.invokeAPI("/api/v1/environments2/setPassword", input, new GenericType<SetPasswordResponse>(){});
  }

  /**
   * Synchronizes environments with all users and groups state with CDP.
   * @param input
   * @return SyncAllUsersResponse
   */
  public SyncAllUsersResponse syncAllUsers(SyncAllUsersRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling syncAllUsers");
     }
    return this.invokeAPI("/api/v1/environments2/syncAllUsers", input, new GenericType<SyncAllUsersResponse>(){});
  }

  /**
   * Returns status of the sync operation for the operation id.
   * @param input
   * @return SyncStatusResponse
   */
  public SyncStatusResponse syncStatus(SyncStatusRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling syncStatus");
     }
    return this.invokeAPI("/api/v1/environments2/syncStatus", input, new GenericType<SyncStatusResponse>(){});
  }

  /**
   * Synchronizes environments with single user to the FreeIPA servers.
   * @param input
   * @return SyncUserResponse
   */
  public SyncUserResponse syncUser(SyncUserRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling syncUser");
     }
    return this.invokeAPI("/api/v1/environments2/syncUser", input, new GenericType<SyncUserResponse>(){});
  }
}
