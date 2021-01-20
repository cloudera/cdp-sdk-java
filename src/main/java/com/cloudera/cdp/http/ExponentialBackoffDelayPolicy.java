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
import java.util.concurrent.ThreadLocalRandom;

/**
 * Implement an exponential backoff policy. For a given 'base' and 'growthFactor'
 * a delay will be computed to be:<p>
 *
 * 'base' * 'growthFactor' ^ (attempts - 1)<p>
 *
 * For example:<p>
 *
 * <ul>
 * <li>base = 500ms, growthFactor = 2</li>
 * <li>attempts = 1, delay = 500 * 2^0 = 500ms</li>
 * <li>attempts = 2, delay = 500 * 2^1 = 1sec</li>
 * <li>attempts = 3, delay = 500 * 2^2 = 2sec</li>
 * </ul>
 *
 * Optional jitter causes each computed delay to vary from its deterministic
 * value, as computed above, up to a certain percentage. For example:<p>
 *
 * <ul>
 * <li>base = 500ms, growthFactor = 2, jitterPercentage = 5</li>
 * <li>attempts = 1, delay = 500 * 2^0 +/- 25ms = 475ms - 525ms</li>
 * <li>attempts = 2, delay = 500 * 2^1 +/- 50ms = 900ms - 1100ms</li>
 * <li>attempts = 3, delay = 500 * 2^2 +/- 100ms= 1.9sec - 2.1sec</li>
 * </ul>
 */
public class ExponentialBackoffDelayPolicy implements DelayPolicy {

  private final int growthFactor;
  private final Duration base;
  private final int jitterPercentage;

  /**
   * Constructs an exponential backoff delay policy with the given 'growthFactor'
   * and 'base'. There is no jitter applied.
   * @param growthFactor The growth factor between delays. Must be positive
   * @param base The base. Must be a positive duration.
   */
  public ExponentialBackoffDelayPolicy(int growthFactor,
                                       Duration base) {
    this(growthFactor, base, 0);
  }

  /**
   * Constructs an exponential backoff delay policy with the given 'growthFactor',
   * 'base', and 'jitterPercentage'.
   * @param growthFactor The growth factor between delays. Must be positive
   * @param base The base. Must be a positive duration.
   * @param jitterPercentage Percentage of jitter range applied to delay. Must
   * non-negative.
   */
  public ExponentialBackoffDelayPolicy(int growthFactor,
                                       Duration base,
                                       int jitterPercentage) {
    checkArgumentAndThrow(growthFactor > 0);
    checkNotNullAndThrow(base);
    checkArgumentAndThrow(base.toMillis() > 0);
    checkArgumentAndThrow(jitterPercentage >= 0);

    this.growthFactor = growthFactor;
    this.base = base;
    this.jitterPercentage = jitterPercentage;
  }

  @Override
  public Duration delay(int attempts) {
    checkArgumentAndThrow(attempts >= 1);
    long deterministicMillis = (long) (base.toMillis() * Math.pow(growthFactor, attempts - 1));
    if (jitterPercentage == 0) {
      return Duration.ofMillis(deterministicMillis);
    }
    long jitterRangeMillis = deterministicMillis * ((long) jitterPercentage) / 100L;
    if (jitterRangeMillis == 0L) {
      return Duration.ofMillis(deterministicMillis);
    }
    long jitterMillis = ThreadLocalRandom.current().nextLong(jitterRangeMillis)
        - (jitterRangeMillis / 2L);
    return Duration.ofMillis(deterministicMillis + jitterMillis);
  }
}
