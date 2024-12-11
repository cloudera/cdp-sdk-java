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
import com.cloudera.cdp.authentication.Signer;
import com.google.common.base.Strings;

import java.security.PrivateKey;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import jakarta.ws.rs.core.HttpHeaders;

/**
 * CDP client middleware to provide authenticate headers for CDP requests.
 */
@SdkInternalApi
public class CdpRequestAuthMiddleware implements CdpClientMiddleware {

  private final CdpClientMiddleware next;

  public CdpRequestAuthMiddleware(CdpClientMiddleware next) {
    this.next = checkNotNullAndThrow(next);
  }

  public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
    checkNotNullAndThrow(context);
    computeAuthHeaders(context);
    next.invokeAPI(context);
  }

  private void computeAuthHeaders(CdpRequestContext<?> context) {
    Map<String, String> headers = context.getHeaders();
    String accessKeyId = context.getCredentials().getAccessKeyId();
    PrivateKey privateKey = context.getCredentials().getPrivateKey();
    String accessToken = context.getCredentials().getAccessToken();
    if (!Strings.isNullOrEmpty(accessKeyId) && privateKey != null){
      String date = ZonedDateTime.now(ZoneId.of("GMT")).format(
          DateTimeFormatter.RFC_1123_DATE_TIME);
      String method = context.getMethod();
      String auth = new Signer().computeAuthHeader(
          method,
          context.getRequestContentType(),
          date,
          context.getRequestUrl().getPath(),
          accessKeyId,
          privateKey);
      headers.put("x-altus-date", date);
      headers.put("x-altus-auth", auth);
    } else if (!Strings.isNullOrEmpty(accessToken)) {
      headers.put(HttpHeaders.AUTHORIZATION, accessToken);
    }
  }
}
