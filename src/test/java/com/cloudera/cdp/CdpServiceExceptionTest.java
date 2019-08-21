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

package com.cloudera.cdp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.ws.rs.core.MultivaluedHashMap;

import org.junit.jupiter.api.Test;

@SuppressWarnings("DeadException")
public class CdpServiceExceptionTest {

  @Test
  public void testAllNulls() {
    assertThrows(CdpClientException.class, () -> {
      new CdpServiceException(null, -1, null, null, null);
    });
  }

  @Test
  public void testValidException() {
    CdpServiceException exception =
      new CdpServiceException("requestid", 502, new MultivaluedHashMap<>(),
                              "statuscode", "statusmessage");
    assertEquals(String.format("%s: %d: %s: %s %s",
        CdpServiceException.class.getName().toString(),
        502,
        "statuscode",
        "statusmessage",
        "requestid"),
      exception.toString());
  }
}
