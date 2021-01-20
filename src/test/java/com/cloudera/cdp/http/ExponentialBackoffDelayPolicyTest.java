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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cloudera.cdp.CdpClientException;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class ExponentialBackoffDelayPolicyTest {

  @Test
  public void testDelay() {
    ExponentialBackoffDelayPolicy delayPolicy =
        new ExponentialBackoffDelayPolicy(2, Duration.ofSeconds(1));
    for (int ii = 1; ii <= 10; ii++) {
      Duration expected = Duration.ofSeconds((long) Math.pow(2, ii - 1));
      assertEquals(expected, delayPolicy.delay(ii),
                   "Iteration: " + Integer.toString(ii));
    }
  }

  @Test
  public void testDelayWithJitter() {
    ExponentialBackoffDelayPolicy delayPolicy =
        new ExponentialBackoffDelayPolicy(2, Duration.ofSeconds(1), 5);
    for (int ii = 1; ii <= 10; ii++) {
      long expectedDeterministicDurationMillis = 1000L * ((long) Math.pow(2, ii - 1));
      long maxDeltaMillis = expectedDeterministicDurationMillis * 5L / 200L; // half of 5%
      Duration expectedMinimum =
          Duration.ofMillis(expectedDeterministicDurationMillis - maxDeltaMillis);
      Duration expectedMaximum =
          Duration.ofMillis(expectedDeterministicDurationMillis + maxDeltaMillis);
      Duration actualDelay = delayPolicy.delay(ii);
      assertTrue(actualDelay.compareTo(expectedMinimum) >= 0 &&
                 actualDelay.compareTo(expectedMaximum) < 0,
                 "Iteration: " + Integer.toString(ii));
    }
  }

  @Test
  public void testDelayWithJitterZeroRange() {
    // For the first attempt:
    // - the deterministic delay is 1ms
    // - the jitter range in ms is (in integer math) 1 * 5 / 100 = 0
    // - therefore, the expected delay should not be calculated with jitter and
    //   therefore not call ThreadLocalRandom with a zero bound
    ExponentialBackoffDelayPolicy delayPolicy =
        new ExponentialBackoffDelayPolicy(2, Duration.ofMillis(1), 5);
    Duration expectedDelay = Duration.ofMillis(1L);
    Duration actualDelay = delayPolicy.delay(1);
    assertEquals(expectedDelay, actualDelay);
  }

  @Test
  public void testNullBase() {
    assertThrows(CdpClientException.class, () -> {
      new ExponentialBackoffDelayPolicy(1, null);
    });
  }

  @Test
  public void testZeroBase() {
    assertThrows(CdpClientException.class, () -> {
      new ExponentialBackoffDelayPolicy(1, Duration.ofMillis(0));
    });
  }

  @Test
  public void testNegativeGrowthFactor() {
    assertThrows(CdpClientException.class, () -> {
      new ExponentialBackoffDelayPolicy(-1, Duration.ofMillis(1));
    });
  }

  @Test
  public void testNegativeJitterPercentage() {
    assertThrows(CdpClientException.class, () -> {
      new ExponentialBackoffDelayPolicy(1, Duration.ofMillis(1), -1);
    });
  }

  @Test
  public void testNegativeAttempts() {
    ExponentialBackoffDelayPolicy delayPolicy =
      new ExponentialBackoffDelayPolicy(2, Duration.ofSeconds(1));
    assertThrows(CdpClientException.class, () -> {
      delayPolicy.delay(-1);
    });
  }

  @Test
  public void testZeroAttempts() {
    ExponentialBackoffDelayPolicy delayPolicy =
      new ExponentialBackoffDelayPolicy(2, Duration.ofSeconds(1));
    assertThrows(CdpClientException.class, () -> {
      delayPolicy.delay(0);
    });
  }
}
