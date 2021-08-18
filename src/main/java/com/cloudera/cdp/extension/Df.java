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
import com.cloudera.cdp.df.model.UploadFlowRequest;
import com.cloudera.cdp.df.model.UploadFlowResponse;
import com.google.common.base.Strings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@SdkInternalApi
public class Df implements CdpClientMiddleware {

  private final CdpClientMiddleware next;

  public Df(CdpClientMiddleware next) {
    this.next = checkNotNullAndThrow(next);
  }

  @Override
  public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
    checkNotNullAndThrow(context);

    if (context.getServiceName().equals("df") && context.getOperationName().equals("uploadFlow")) {
      dfUploadFlow((CdpRequestContext<UploadFlowResponse>) context);
    } else if (context.getServiceName().equals("df-workload")) {
      dfWorkloadUploadFlow();
    } else {
      throw new CdpClientException(String.format(
          "The operation is not supported. service name: %s, operation name: %s",
          context.getServiceName(), context.getOperationName()));
    }
  }

  private void dfUploadFlow(CdpRequestContext<UploadFlowResponse> context) {
    UploadFlowRequest uploadFlowRequest = (UploadFlowRequest) context.getBody();
    String name = uploadFlowRequest.getName();
    String description = uploadFlowRequest.getDescription();
    String comments = uploadFlowRequest.getComments();
    String filePath = uploadFlowRequest.getFile();

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
    try {
      try (FileInputStream body = new FileInputStream(filePath)) {
        context.setHeaders(headers);
        context.setBody(body);
        next.invokeAPI(context);
      }
    } catch (IOException ioe) {
      throw new CdpClientException("Unable to load file at " + filePath, ioe);
    }
  }

  private void dfWorkloadUploadFlow() {
  }
}
