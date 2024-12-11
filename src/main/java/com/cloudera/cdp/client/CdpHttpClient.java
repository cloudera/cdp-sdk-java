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

package com.cloudera.cdp.client;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.annotation.SdkInternalApi;
import com.google.common.annotations.VisibleForTesting;

import java.util.Map;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;

/**
 * CDP client middleware to send a request.
 */
@SdkInternalApi
public class CdpHttpClient implements CdpClientMiddleware {

  public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
    checkNotNullAndThrow(context);
    Response response = getAPIResponse(context);
    context.setRawResponse(response);
  }

  @VisibleForTesting
  Response getAPIResponse(CdpRequestContext<?> context) {
    WebTarget t = context.getClient().target(context.getRequestUrl());
    for (Pair query : context.getQueries()) {
      t = t.queryParam(query.getName(), query.getValue());
    }
    for (Map.Entry<String, Object> prop : context.getProperties().entrySet()) {
      t = t.property(prop.getKey(), prop.getValue());
    }
    String contentType = context.getRequestContentType();
    Invocation.Builder builder = t.request();
    for (Map.Entry<String, String> header : context.getHeaders().entrySet()) {
      String headerName = header.getKey();
      if (headerName.equals(HttpHeaders.CONTENT_TYPE)) {
        contentType = header.getValue();
      } else {
        builder = builder.header(headerName, header.getValue());
      }
    }
    if (context.getBody() == null) {
      return builder.method(context.getMethod());
    } else {
      return builder.method(
          context.getMethod(),
          Entity.entity(context.getBody(), contentType));
    }
  }
}
