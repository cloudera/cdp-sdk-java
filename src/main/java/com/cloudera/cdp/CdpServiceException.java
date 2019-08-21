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

package com.cloudera.cdp;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

/**
 * Class used to report well-formed errors from CDP services.
 */
public class CdpServiceException extends CdpHTTPException {

  private static final long serialVersionUID = -875642837484022999L;

  private final Map<String, List<String>> responseHeaders;
  private final String statusCode;
  private final String statusMessage;
  private final String requestId;

  /**
   * Constructor.
   * @param requestId the request ID
   * @param httpCode the HTTP code
   * @param responseHeaders the response headers
   * @param statusCode the status code
   * @param statusMessage the status message
   */
  public CdpServiceException(String requestId,
                             int httpCode,
                             Map<String, List<String>> responseHeaders,
                             String statusCode,
                             String statusMessage) {
    super(httpCode, statusMessage);
    checkNotNullAndThrow(requestId);
    checkNotNullAndThrow(responseHeaders);
    checkNotNullAndThrow(statusCode);
    checkNotNullAndThrow(statusMessage);
    this.responseHeaders = ImmutableMap.copyOf(responseHeaders);
    this.statusCode = statusCode;
    this.statusMessage = statusMessage;
    this.requestId = requestId;
  }

  /**
   * Gets the API status code.
   * @return the API status code
   */
  public String getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the API status message.
   * @return the API status message
   */
  public String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Gets the response headers, if any.
   * @return the response headers
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Gets the requestId.
   * @return the requestId
   */
  public String getRequestId() {
    return requestId;
  }

  @Override
  public String toString() {
    return String.format("%s: %d: %s: %s %s",
                         getClass().getName(),
                         getHttpCode(),
                         statusCode,
                         statusMessage,
                         requestId);
  }

  @Override
  public String getMessage() {
    return toString();
  }
}
