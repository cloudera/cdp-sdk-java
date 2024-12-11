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
import com.cloudera.cdp.client.CdpClientMiddleware;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.RestResponse;
import com.google.common.base.Strings;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;

import org.apache.http.HttpHeaders;
import org.glassfish.jersey.client.ClientProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SdkInternalApi
public class Redirect implements CdpClientMiddleware {

  private static class RestResponseGenericType extends GenericType<RestResponse> {
  }

  private static final Logger LOG = LoggerFactory.getLogger(Redirect.class);

  private final CdpClientMiddleware next;

  public Redirect(CdpClientMiddleware next) {
    this.next = checkNotNullAndThrow(next);
  }

  @Override
  public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
    checkNotNullAndThrow(context);

    String redirectUrl = findRedirectLocation(context);
    if (Strings.isNullOrEmpty(redirectUrl) || !URI.create(redirectUrl).isAbsolute()) {
      throw new CdpClientException("Missing or incorrect redirect URL");
    }

    context.setEndpoint(redirectUrl);
    context.setPath("");
    context.setQueries(new ArrayList<>());
    next.invokeAPI(context);
  }

  private String findRedirectLocation(CdpRequestContext<?> context) {
    CdpRequestContext<RestResponse> redirectContext = new CdpRequestContext<>(
        context.getClient(),
        context.getServiceName(),
        context.getOperationName(),
        new RestResponseGenericType(),
        context);
    redirectContext.getProperties().put(ClientProperties.FOLLOW_REDIRECTS, false);
    next.invokeAPI(redirectContext);
    RestResponse redirectResponse = redirectContext.getResponse();
    if (redirectResponse == null) {
      throw new CdpClientException("Missing redirect response");
    }

    try {
      if (redirectResponse.getStatusInfo().getFamily() != Response.Status.Family.REDIRECTION) {
        throw new CdpClientException(String.format("Redirect response status code is incorrect. HTTP status: %d", redirectResponse.getHttpCode()));
      }

      List<String> locationHeaders = redirectResponse.getResponseHeaders().getOrDefault(HttpHeaders.LOCATION, null);
      if (locationHeaders == null || locationHeaders.isEmpty()) {
        throw new CdpClientException("Missing Location response header");
      }

      String redirectUrl = locationHeaders.get(0);

      LOG.debug("Redirect request status: {}, redirect to: {}", redirectResponse.getHttpCode(), redirectUrl);
      return redirectUrl;
    } finally {
      redirectResponse.close();
    }
  }
}
