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

import java.time.Duration;

/**
 * Implement an exponential backoff policy. For a given 'base' and 'growthFactor'
 * a delay will be computed to be:
 * 'base' * 'growthFactor' ^ (attempts - 1)
 *
 * For example:
 * base = 500ms, growthFactor = 2
 * attempts = 1, delay = 500 * 2^0 = 500ms
 * attempts = 2, delay = 500 * 2^1 = 1sec
 * attempts = 3, delay = 500 * 2^2 = 2sec
 */
public class ExponentialBackoffDelayPolicy implements DelayPolicy {

  private final int growthFactor;
  private final Duration base;

  /**
   * Constructs an exponential backoff delay policy with the given 'growthFactor'
   * and 'base'.
   * @param growthFactor The growth factor between delays. Must be positive
   * @param base The base. Must be a positive duration.
   */
  public ExponentialBackoffDelayPolicy(int growthFactor,
                                       Duration base) {
    checkArgumentAndThrow(growthFactor > 0);
    checkNotNullAndThrow(base);
    checkArgumentAndThrow(base.toMillis() > 0);

    this.growthFactor = growthFactor;
    this.base = base;
  }

  @Override
  public Duration delay(int attempts) {
    checkArgumentAndThrow(attempts >= 1);
    return Duration.ofMillis(
        (long) (base.toMillis() * Math.pow(growthFactor, attempts - 1)));
  }
}
