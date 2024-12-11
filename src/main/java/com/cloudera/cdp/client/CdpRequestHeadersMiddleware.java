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
import com.google.common.base.Strings;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import jakarta.ws.rs.core.HttpHeaders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CDP client middleware to set CDP request headers.
 */
@SdkInternalApi
public class CdpRequestHeadersMiddleware implements CdpClientMiddleware {

  private static final Logger LOG =
      LoggerFactory.getLogger(CdpRequestHeadersMiddleware.class);

  private static final String VERSION_PROPERTIES_FILE = "version.properties";
  private static final Properties VERSION_PROPERTIES = loadVersionProperties();

  private static Properties loadVersionProperties() {
    Properties props = new Properties();
    try (InputStream stream =
             CdpRequestHeadersMiddleware.class.getResourceAsStream(VERSION_PROPERTIES_FILE)) {
      props.load(stream);
    } catch (IOException | RuntimeException e) {
      props.put("version", "Unknown");
      LOG.warn("Failed to read CDP SDK Version.", e);
    }
    return props;
  }

  private final CdpClientMiddleware next;
  private final Map<String, String> headers;

  public CdpRequestHeadersMiddleware(CdpClientMiddleware next, Map<String, String> headers) {
    this.next = checkNotNullAndThrow(next);
    this.headers = checkNotNullAndThrow(headers);
  }

  public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
    checkNotNullAndThrow(context);
    computeHeaders(context);
    next.invokeAPI(context);
  }

  private void computeHeaders(CdpRequestContext<?> context) {
    Map<String, String> headers = new HashMap<>(this.headers);
    headers.putAll(context.getHeaders());
    headers.put(HttpHeaders.USER_AGENT, buildUserAgent());
    String method = context.getMethod();
    if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH")) {
      headers.put(HttpHeaders.CONTENT_TYPE, context.getRequestContentType());
    }
    if (!method.equals("DELETE")) {
      headers.put(HttpHeaders.ACCEPT, context.getResponseContentType());
    }
    String altusClientApp = context.getClientApplicationName();
    if (!Strings.isNullOrEmpty(altusClientApp)) {
      headers.put("x-altus-client-app", altusClientApp);
    }
    context.setHeaders(headers);
  }

  @VisibleForTesting
  static String buildUserAgent() {
    return String.format("CDPSDK/%s Java/%s %s/%s",
                         VERSION_PROPERTIES.get("version"),
                         System.getProperty("java.version"),
                         System.getProperty("os.name"),
                         System.getProperty("os.version"));
  }
}
