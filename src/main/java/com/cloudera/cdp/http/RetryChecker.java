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

/**
 * A RetryChecker decides, given the number of attempts and the exception form
 * the most recent request, whether the caller should retry or not.
 */
public interface RetryChecker {

  /**
   * Returns 'true' if the call should be retried, 'false' otherwise.
   * @param attempts The number of attempts made
   * @param exception the request exception
   * @return 'true' if the caller should retry, 'false' otherwise
   */
  boolean shouldRetry(int attempts, CdpClientException exception);
}
