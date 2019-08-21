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

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cloudera.cdp.CdpClientException;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class SimpleRetryHandlerTest {

  private static class FixedChecker implements RetryChecker {

    private boolean shouldRetry;

    FixedChecker(boolean shouldRetry) {
      this.shouldRetry = shouldRetry;
    }

    @Override
    public boolean shouldRetry(int attempts, CdpClientException exception) {
      return shouldRetry;
    }
  }

  @Test
  public void testShouldRespectMaxAttempts() {
    int maxAttempts = 10;

    SimpleRetryHandler retryPolicyHandler = new SimpleRetryHandler(
        new FixedChecker(true),
        new ExponentialBackoffDelayPolicy(5, Duration.ofMillis(1)),
        maxAttempts);

    CdpClientException exception = new CdpClientException("BOOM!");

    for (int ii = 1; ii < maxAttempts; ii++) {
      assertEquals(
          retryPolicyHandler.shouldRetry(maxAttempts, exception),
          RetryHandler.DO_NOT_RETRY);
    }
  }
}