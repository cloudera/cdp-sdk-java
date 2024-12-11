/*
 * Copyright (c) 2021 Cloudera, Inc. All Rights Reserved.
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

package com.cloudera.cdp.extension;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.client.BaseResponse;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.CdpClientMiddleware;
import com.cloudera.cdp.df.model.GetFlowVersionRequest;
import com.cloudera.cdp.df.model.GetFlowVersionResponse;
import com.cloudera.cdp.df.model.ImportFlowDefinitionRequest;
import com.cloudera.cdp.df.model.ImportFlowDefinitionResponse;
import com.cloudera.cdp.df.model.ImportFlowDefinitionVersionRequest;
import com.cloudera.cdp.df.model.ImportFlowDefinitionVersionResponse;
import com.cloudera.cdp.dfworkload.model.UploadAssetRequest;
import com.cloudera.cdp.dfworkload.model.UploadAssetResponse;
import com.cloudera.cdp.dfworkload.model.CreateReportingTaskRequest;
import com.cloudera.cdp.dfworkload.model.CreateReportingTaskResponse;
import com.google.common.base.Strings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jakarta.ws.rs.core.MediaType;

@SdkInternalApi
public class Df implements CdpClientMiddleware {

  private final CdpClientMiddleware next;

  public Df(CdpClientMiddleware next) {
    this.next = checkNotNullAndThrow(next);
  }

  @Override
  public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
    checkNotNullAndThrow(context);

    if (context.getServiceName().equals("df") && context.getOperationName().equals("importFlowDefinition")) {
      dfImportFlowDefinition((CdpRequestContext<ImportFlowDefinitionResponse>) context);
    } else if (context.getServiceName().equals("df") && context.getOperationName().equals("importFlowDefinitionVersion")) {
      dfImportFlowDefinitionVersion((CdpRequestContext<ImportFlowDefinitionVersionResponse>) context);
    } else if (context.getServiceName().equals("df") && context.getOperationName().equals("getFlowVersion")) {
      dfGetFlowVersion((CdpRequestContext<GetFlowVersionResponse>) context);
    } else if (context.getServiceName().equals("dfworkload") && context.getOperationName().equals("uploadAsset")) {
      dfWorkloadUploadAsset((CdpRequestContext<UploadAssetResponse>) context);
    } else if (context.getServiceName().equals("dfworkload") && context.getOperationName().equals("createReportingTask")) {
      dfWorkloadCreateReportingTask((CdpRequestContext<CreateReportingTaskResponse>) context);
    } else {
      throw new CdpClientException(String.format(
          "The operation is not supported. service name: %s, operation name: %s",
          context.getServiceName(), context.getOperationName()));
    }
  }

  private void dfImportFlowDefinition(CdpRequestContext<ImportFlowDefinitionResponse> context) {
    ImportFlowDefinitionRequest importFlowDefinitionRequest = (ImportFlowDefinitionRequest) context.getBody();
    String name = importFlowDefinitionRequest.getName();
    String description = importFlowDefinitionRequest.getDescription();
    String comments = importFlowDefinitionRequest.getComments();
    String filePath = importFlowDefinitionRequest.getFile();

    if (Strings.isNullOrEmpty(name)) {
      throw new CdpClientException("Name argument is null");
    }

    Map<String, String> headers = new HashMap<>();
    if (name != null) {
      headers.put("Flow-Definition-Name", name);
    }
    if (description != null) {
      headers.put("Flow-Definition-Description", description);
    }
    if (comments != null) {
      headers.put("Flow-Definition-Comments", comments);
    }
    try (FileInputStream body = new FileInputStream(filePath)) {
      context.setRequestContentType(MediaType.APPLICATION_JSON);
      context.setHeaders(headers);
      context.setBody(body);
      next.invokeAPI(context);
    } catch (IOException ioe) {
      throw new CdpClientException("Unable to load file at " + filePath, ioe);
    }
  }

  private void dfImportFlowDefinitionVersion(CdpRequestContext<ImportFlowDefinitionVersionResponse> context) {
    ImportFlowDefinitionVersionRequest importFlowDefinitionVersionRequest = (ImportFlowDefinitionVersionRequest) context.getBody();
    String comments = importFlowDefinitionVersionRequest.getComments();
    String filePath = importFlowDefinitionVersionRequest.getFile();

    Map<String, String> headers = new HashMap<>();
    if (comments != null) {
      headers.put("Flow-Definition-Comments", comments);
    }
    try (FileInputStream body = new FileInputStream(filePath)) {
      context.setRequestContentType(MediaType.APPLICATION_JSON);
      context.setHeaders(headers);
      context.setBody(body);
      next.invokeAPI(context);
    } catch (IOException ioe) {
      throw new CdpClientException("Unable to load file at " + filePath, ioe);
    }
  }

  private void dfWorkloadUploadAsset(CdpRequestContext<UploadAssetResponse> context) {
    UploadAssetRequest uploadAssetRequest = (UploadAssetRequest) context.getBody();
    String parameterGroup = uploadAssetRequest.getParameterGroup();
    String parameterName = uploadAssetRequest.getParameterName();
    String deploymentRequestCrn = uploadAssetRequest.getDeploymentRequestCrn();
    String deploymentName = uploadAssetRequest.getDeploymentName();
    // assetUpdateRequestCrn was removed temporarily.
    // String assetUpdateRequestCrn = uploadAssetRequest.getAssetUpdateRequestCrn();
    String filePath = uploadAssetRequest.getFilePath();

    if (Strings.isNullOrEmpty(parameterGroup)) {
      throw new CdpClientException("ParameterGroup argument is null");
    }

    if (Strings.isNullOrEmpty(parameterName)) {
      throw new CdpClientException("ParameterName argument is null");
    }

    Map<String, String> headers = new HashMap<>();
    if (parameterGroup != null) {
      headers.put("Parameter-Group", parameterGroup);
    }
    if (parameterName != null) {
      headers.put("Parameter-Name", parameterName);
    }
    if (deploymentRequestCrn != null) {
      headers.put("Deployment-Request-Crn", deploymentRequestCrn);
    }
    if (deploymentName != null) {
      headers.put("Deployment-Name", deploymentName);
    }
    // assetUpdateRequestCrn was removed temporarily.
    // if (assetUpdateRequestCrn != null) {
    //   headers.put("Asset-Update-Request-Crn", assetUpdateRequestCrn);
    // }
    if (filePath != null) {
      headers.put("File-Path", filePath);
    }
    try (FileInputStream body = new FileInputStream(filePath)) {
      context.setPath("/dfx/api/rpc-v1/deployments/upload-asset-content");
      context.setRequestContentType(MediaType.APPLICATION_OCTET_STREAM);
      context.setHeaders(headers);
      context.setBody(body);
      next.invokeAPI(context);
    } catch (IOException ioe) {
      throw new CdpClientException("Unable to load file at " + filePath, ioe);
    }
  }

  private void dfWorkloadCreateReportingTask(CdpRequestContext<CreateReportingTaskResponse> context) {
    CreateReportingTaskRequest createReportingTaskRequest = (CreateReportingTaskRequest) context.getBody();
    String deploymentCrn = createReportingTaskRequest.getDeploymentCrn();
    String filePath = createReportingTaskRequest.getFilePath();

    if (Strings.isNullOrEmpty(deploymentCrn)) {
      throw new CdpClientException("DeploymentCrn argument is null");
    }

    Map<String, String> headers = new HashMap<>();
    headers.put("Deployment-Crn", deploymentCrn);
    if (filePath != null) {
      headers.put("File-Path", filePath);
    }
    try (FileInputStream body = new FileInputStream(filePath)) {
      context.setPath("/dfx/api/rpc-v1/deployments/create-reporting-task-content");
      context.setRequestContentType(MediaType.APPLICATION_OCTET_STREAM);
      context.setHeaders(headers);
      context.setBody(body);
      next.invokeAPI(context);
      final CreateReportingTaskResponse response = context.getRawResponse() == null
          ? null : context.getRawResponse().readEntity(CreateReportingTaskResponse.class);
      context.setResponse(response);
      context.setRawResponse(null);
    } catch (IOException ioe) {
      throw new CdpClientException("Unable to load file at " + filePath, ioe);
    }
  }

  private void dfGetFlowVersion(CdpRequestContext<GetFlowVersionResponse> context) {
    GetFlowVersionRequest getFlowVersionRequest = (GetFlowVersionRequest) context.getBody();
    String flowVersionCrn = getFlowVersionRequest.getFlowVersionCrn();

    if (Strings.isNullOrEmpty(flowVersionCrn)) {
      throw new CdpClientException("Flow Version CRN argument is null or empty");
    }
    next.invokeAPI(context);
  }

}
