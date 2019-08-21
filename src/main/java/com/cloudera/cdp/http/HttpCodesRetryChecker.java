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

package com.cloudera.cdp.http;

import static com.cloudera.cdp.ValidationUtils.checkArgumentAndThrow;
import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.CdpHTTPException;
import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * RetryChecker that compares the status code of the HTTP response to the
 * set of retriable HTTP codes.
 */
public class HttpCodesRetryChecker implements RetryChecker {

  /**
   * We retry on the following HTTP codes:
   *
   * 503: Service unavailable: we expect this from time to time
   *      from our load balancers
   *
   * 429: Too many requests: this is CDP API throttling.
   */
  public static final ImmutableSet<Integer> DEFAULT_RETRY_CODES =
      ImmutableSet.of(503, 429);

  private final ImmutableSet<Integer> retriableCodes;

  /**
   * Constructor.
   * @param httpCodes the set of HTTP codes on which to retry
   */
  public HttpCodesRetryChecker(Set<Integer> httpCodes) {
    checkNotNullAndThrow(httpCodes);
    checkArgumentAndThrow(httpCodes.size() > 0);
    this.retriableCodes = ImmutableSet.copyOf(httpCodes);
  }

  @Override
  public boolean shouldRetry(int attempts, CdpClientException exception) {
    checkNotNullAndThrow(exception);
    checkArgumentAndThrow(attempts >= 1);
    if (exception instanceof CdpHTTPException) {
      return retriableCodes.contains(((CdpHTTPException) exception).getHttpCode());
    }
    return false;
  }
}
