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

import com.cloudera.cdp.CdpClientException;

import java.time.Duration;

/**
 * An interface for handling retries.
 */
public interface RetryHandler {

  Duration DO_NOT_RETRY = null;

  /**
   * Returns the duration the caller need to wait before retrying or null if
   * no retry should be attempted according to the retry policy.
   * @param attempts the number of attempts so far
   * @param exception the request exception
   * @return the duration to wait for the next attempt or null if no retry should
   * be attempted
   */
   Duration shouldRetry(int attempts, CdpClientException exception);
}
