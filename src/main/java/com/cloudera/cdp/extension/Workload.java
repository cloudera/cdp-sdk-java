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
import com.cloudera.cdp.authentication.credentials.BasicCdpCredentials;
import com.cloudera.cdp.client.BaseResponse;
import com.cloudera.cdp.client.CdpClientContext;
import com.cloudera.cdp.client.CdpClientMiddleware;
import com.cloudera.cdp.iam.api.IamClient;
import com.cloudera.cdp.iam.model.GenerateWorkloadAuthTokenRequest;
import com.cloudera.cdp.iam.model.GenerateWorkloadAuthTokenResponse;
import com.google.common.base.Strings;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SdkInternalApi
public class Workload implements CdpClientMiddleware {

  private static final Logger LOG = LoggerFactory.getLogger(Workload.class);

  private final CdpClientMiddleware next;

  public Workload(CdpClientMiddleware next) {
    this.next = checkNotNullAndThrow(next);
  }

  @Override
  public <T extends BaseResponse> void invokeAPI(CdpClientContext<T> context) {
    checkNotNullAndThrow(context);

    if (!Strings.isNullOrEmpty(context.getCredentials().getAccessToken())) {
      // access-token was explicitly set by user,
      // skip the workload service-discovery
      LOG.debug("Skip workload service-discovery");
      next.invokeAPI(context);
      return;
    }

    LOG.debug("Run workload service-discovery");
    String serviceName = context.getServiceName();
    if (Strings.isNullOrEmpty(serviceName)) {
      throw new CdpClientException("Missing service name");
    }

    String workloadName;
    String environmentCrn;
    if (serviceName.equals("df-workload")) {
      workloadName = "DF";
      environmentCrn = getEnvironmentCrn(context.getBody());
      if (Strings.isNullOrEmpty(environmentCrn)) {
        throw new CdpClientException("Missing environment CRN");
      }
    } else {
      throw new CdpClientException(String.format("Unknown service name '%s'", serviceName));
    }

    IamClient iamClient = new IamClient(context);
    GenerateWorkloadAuthTokenRequest request = new GenerateWorkloadAuthTokenRequest();
    request.setWorkloadName(workloadName);
    request.setEnvironmentCrn(environmentCrn);
    GenerateWorkloadAuthTokenResponse response =  iamClient.generateWorkloadAuthToken(request);

    String workloadUrl = response.getEndpointUrl();
    String workloadAccessToken = response.getToken();
    LOG.debug(String.format(
        "Workload service-discovery succeeded. endpointUrl=%s, accessToken=%s...",
        workloadUrl,
        sanitizeAccessToken(workloadAccessToken)));

    context.setEndpoint(workloadUrl);
    context.setCredentials(new BasicCdpCredentials(workloadAccessToken));
    next.invokeAPI(context);
  }

  private String getEnvironmentCrn(Object requestBody) {
    checkNotNullAndThrow(requestBody);

    try {
      Method method = requestBody.getClass().getMethod("getEnvironmentCrn");
      return (String) method.invoke(requestBody);
    } catch (Exception e) {
      throw new CdpClientException("Failed to retrieve environment CRN from request body", e);
    }
  }

  private static String sanitizeAccessToken(String accessToken) {
    if (Strings.isNullOrEmpty(accessToken)) {
      return "";
    }
    if (accessToken.length() < 16) {
      return accessToken;
    }
    return accessToken.substring(0, 16);
  }
}
