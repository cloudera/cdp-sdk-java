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

package com.cloudera.cdp.scim.api;

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.scim.model.ScimGroup;
import com.cloudera.cdp.scim.model.ScimPatchRequest;
import com.cloudera.cdp.scim.model.ScimUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-21T12:39:06.812-07:00")
public class ScimClient extends CdpClient {

  public static final String SERVICE_NAME = "scim";

  public ScimClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  @Override
  protected String getServiceName() {
    return SERVICE_NAME;
  }

  @Override
  protected String getRequestContentType() {
    return "application/scim+json";
  }

  @Override
  protected String getResponseContentType() {
    return "application/scim+json";
  }

  /**
   * Adds a SCIM group.
   * @param idpId
   * @param input
   * @return RestResponse
   */
  public RestResponse addGroup(String idpId, ScimGroup input) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling addGroup");
    }
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addGroup");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Groups"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("POST", path, queryParams, headerParams, input);
  }

  /**
   * Adds a SCIM user.
   * @param idpId
   * @param input
   * @return RestResponse
   */
  public RestResponse addUser(String idpId, ScimUser input) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling addUser");
    }
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling addUser");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Users"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("POST", path, queryParams, headerParams, input);
  }

  /**
   * Deletes a SCIM group.
   * @param idpId
   * @param groupId
   * @return RestResponse
   */
  public RestResponse deleteGroup(String idpId, String groupId) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling deleteGroup");
    }
    if (groupId == null) {
      throw new CdpClientException("Missing the required parameter 'groupId' when calling deleteGroup");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Groups/{groupId}"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId))
        .replaceAll("\\{" + "groupId" + "\\}", this.parameterToString(groupId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("DELETE", path, queryParams, headerParams, null);
  }

  /**
   * Deletes a SCIM user.
   * @param idpId
   * @param userId
   * @return RestResponse
   */
  public RestResponse deleteUser(String idpId, String userId) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling deleteUser");
    }
    if (userId == null) {
      throw new CdpClientException("Missing the required parameter 'userId' when calling deleteUser");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Users/{userId}"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId))
        .replaceAll("\\{" + "userId" + "\\}", this.parameterToString(userId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("DELETE", path, queryParams, headerParams, null);
  }

  /**
   * Modifies a SCIM group.
   * @param idpId
   * @param groupId
   * @param input
   * @return RestResponse
   */
  public RestResponse modifyGroup(String idpId, String groupId, ScimPatchRequest input) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling modifyGroup");
    }
    if (groupId == null) {
      throw new CdpClientException("Missing the required parameter 'groupId' when calling modifyGroup");
    }
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling modifyGroup");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Groups/{groupId}"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId))
        .replaceAll("\\{" + "groupId" + "\\}", this.parameterToString(groupId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("PATCH", path, queryParams, headerParams, input);
  }

  /**
   * Modifies a SCIM user.
   * @param idpId
   * @param userId
   * @param input
   * @return RestResponse
   */
  public RestResponse modifyUser(String idpId, String userId, ScimPatchRequest input) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling modifyUser");
    }
    if (userId == null) {
      throw new CdpClientException("Missing the required parameter 'userId' when calling modifyUser");
    }
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling modifyUser");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Users/{userId}"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId))
        .replaceAll("\\{" + "userId" + "\\}", this.parameterToString(userId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("PATCH", path, queryParams, headerParams, input);
  }

  /**
   * Queries SCIM groups.
   * @param idpId
   * @param filter
   * @param sortBy
   * @param sortOrder
   * @param startIndex
   * @param count
   * @param attributes
   * @param excludedAttributes
   * @return RestResponse
   */
  public RestResponse queryGroups(String idpId, String filter, String sortBy, String sortOrder, Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling queryGroups");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Groups"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    queryParams.add(this.parameterToPair("filter", filter));
    queryParams.add(this.parameterToPair("sortBy", sortBy));
    queryParams.add(this.parameterToPair("sortOrder", sortOrder));
    queryParams.add(this.parameterToPair("startIndex", startIndex));
    queryParams.add(this.parameterToPair("count", count));
    queryParams.addAll(this.parameterToPairs("csv", "attributes", attributes));
    queryParams.addAll(this.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("GET", path, queryParams, headerParams, null);
  }

  /**
   * Queries SCIM users.
   * @param idpId
   * @param filter
   * @param sortBy
   * @param sortOrder
   * @param startIndex
   * @param count
   * @param attributes
   * @param excludedAttributes
   * @return RestResponse
   */
  public RestResponse queryUsers(String idpId, String filter, String sortBy, String sortOrder, Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling queryUsers");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Users"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    queryParams.add(this.parameterToPair("filter", filter));
    queryParams.add(this.parameterToPair("sortBy", sortBy));
    queryParams.add(this.parameterToPair("sortOrder", sortOrder));
    queryParams.add(this.parameterToPair("startIndex", startIndex));
    queryParams.add(this.parameterToPair("count", count));
    queryParams.addAll(this.parameterToPairs("csv", "attributes", attributes));
    queryParams.addAll(this.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("GET", path, queryParams, headerParams, null);
  }

  /**
   * Replaces a SCIM group.
   * @param idpId
   * @param groupId
   * @param input
   * @return RestResponse
   */
  public RestResponse replaceGroup(String idpId, String groupId, ScimGroup input) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling replaceGroup");
    }
    if (groupId == null) {
      throw new CdpClientException("Missing the required parameter 'groupId' when calling replaceGroup");
    }
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling replaceGroup");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Groups/{groupId}"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId))
        .replaceAll("\\{" + "groupId" + "\\}", this.parameterToString(groupId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("PUT", path, queryParams, headerParams, input);
  }

  /**
   * Replaces a SCIM user.
   * @param idpId
   * @param userId
   * @param input
   * @return RestResponse
   */
  public RestResponse replaceUser(String idpId, String userId, ScimUser input) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling replaceUser");
    }
    if (userId == null) {
      throw new CdpClientException("Missing the required parameter 'userId' when calling replaceUser");
    }
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling replaceUser");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Users/{userId}"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId))
        .replaceAll("\\{" + "userId" + "\\}", this.parameterToString(userId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("PUT", path, queryParams, headerParams, input);
  }

  /**
   * Retrieves a SCIM group.
   * @param idpId
   * @param groupId
   * @return RestResponse
   */
  public RestResponse retrieveGroup(String idpId, String groupId) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling retrieveGroup");
    }
    if (groupId == null) {
      throw new CdpClientException("Missing the required parameter 'groupId' when calling retrieveGroup");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Groups/{groupId}"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId))
        .replaceAll("\\{" + "groupId" + "\\}", this.parameterToString(groupId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("GET", path, queryParams, headerParams, null);
  }

  /**
   * Retrieves a SCIM user.
   * @param idpId
   * @param userId
   * @return RestResponse
   */
  public RestResponse retrieveUser(String idpId, String userId) {
    if (idpId == null) {
      throw new CdpClientException("Missing the required parameter 'idpId' when calling retrieveUser");
    }
    if (userId == null) {
      throw new CdpClientException("Missing the required parameter 'userId' when calling retrieveUser");
    }

    // create path and map variables
    String path = "/iam/scim/v2/{idpId}/Users/{userId}"
        .replaceAll("\\{" + "idpId" + "\\}", this.parameterToString(idpId))
        .replaceAll("\\{" + "userId" + "\\}", this.parameterToString(userId));
    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();

    return this.invokeAPI("GET", path, queryParams, headerParams, null);
  }
}
