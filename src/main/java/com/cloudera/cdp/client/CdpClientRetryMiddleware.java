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

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.http.RetryHandler;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CDP client middleware to retry on request failures.
 */
@SdkInternalApi
public class CdpClientRetryMiddleware implements CdpClientMiddleware {

  private static final Logger LOG =
      LoggerFactory.getLogger(CdpClientRetryMiddleware.class);

  private final CdpClientMiddleware next;

  public CdpClientRetryMiddleware(CdpClientMiddleware next) {
    this.next = checkNotNullAndThrow(next);
  }

  public <T extends BaseResponse> void invokeAPI(CdpRequestContext<T> context) {
    checkNotNullAndThrow(context);
    RetryHandler retryHandler = checkNotNullAndThrow(context.getRetryHandler());
    int attempts = 0;
    do {
      attempts++;
        try {
          next.invokeAPI(context);
          return;
        } catch (CdpClientException exception) {
          Duration delay = retryHandler.shouldRetry(attempts, exception);
          if (delay == RetryHandler.DO_NOT_RETRY) {
            throw exception;
          }
          LOG.warn("Caught exception", exception);
          LOG.warn("Wait {} milli-seconds then retry.", delay.toMillis());
          try {
            Thread.sleep(delay.toMillis());
          } catch (InterruptedException e) {
            throw new CdpClientException("Error while retrying request", e);
          }
        }
    } while (true);
  }
}
