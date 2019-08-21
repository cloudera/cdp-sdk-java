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

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.CdpHTTPException;

import java.util.Collections;

import org.junit.jupiter.api.Test;

public class HttpCodesRetryCheckerTest {

  @Test
  public void testNullSet() {
    assertThrows(CdpClientException.class, () -> {
      new HttpCodesRetryChecker(null);
    });
  }

  @Test
  public void testNonRetryCode() {
    HttpCodesRetryChecker retryChecker = new HttpCodesRetryChecker(
        HttpCodesRetryChecker.DEFAULT_RETRY_CODES);
    CdpHTTPException exception = new CdpHTTPException(500, "BOOM!");
    assertEquals(retryChecker.shouldRetry(5, exception), false);
  }

  @Test
  public void testNonHTTPError() {
    HttpCodesRetryChecker retryChecker = new HttpCodesRetryChecker(
        HttpCodesRetryChecker.DEFAULT_RETRY_CODES);
    CdpClientException exception = new CdpClientException("BOOM!");
    assertEquals(retryChecker.shouldRetry(5, exception), false);
  }

  @Test
  public void testEmptySet() {
    assertThrows(CdpClientException.class, () -> {
      new HttpCodesRetryChecker(Collections.emptySet());
    });
  }

  @Test
  public void testRetryCodes() {
    for (int httpCode : HttpCodesRetryChecker.DEFAULT_RETRY_CODES) {
      HttpCodesRetryChecker retryChecker =
          new HttpCodesRetryChecker(HttpCodesRetryChecker.DEFAULT_RETRY_CODES);
      CdpHTTPException exception = new CdpHTTPException(httpCode, "BOOM!");
      assertEquals(retryChecker.shouldRetry(5, exception), true);
    }
  }
}
