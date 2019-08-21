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

import java.time.Duration;

/**
 * Handle retry attempts with the given checker and delay policy.
 */
public class SimpleRetryHandler implements RetryHandler {

  private final RetryChecker retryChecker;
  private final DelayPolicy delayPolicy;
  private final int maxAttempts;

  /**
   * Constructor.
   * @param retryChecker the retry checker
   * @param delayPolicy the delay policy
   * @param maxAttempts the maximum number of allowed attempts
   */
  public SimpleRetryHandler(RetryChecker retryChecker,
                            DelayPolicy delayPolicy,
                            int maxAttempts) {
    this.retryChecker = checkNotNullAndThrow(retryChecker);
    this.delayPolicy = checkNotNullAndThrow(delayPolicy);
    checkArgumentAndThrow(maxAttempts > 0);
    this.maxAttempts = maxAttempts;
  }

  @Override
  public Duration shouldRetry(int attempts, CdpClientException exception) {
    checkNotNullAndThrow(exception);
    checkArgumentAndThrow(attempts >= 1);
    if (attempts < maxAttempts && retryChecker.shouldRetry(attempts, exception)) {
        return getDelay(attempts);
    }
    return DO_NOT_RETRY;
  }

  private Duration getDelay(int attempts) {
    checkArgumentAndThrow(attempts >= 1);
    return delayPolicy.delay(attempts);
  }
}
