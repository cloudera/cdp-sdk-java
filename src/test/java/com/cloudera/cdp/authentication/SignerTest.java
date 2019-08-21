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

package com.cloudera.cdp.authentication;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.util.CdpSDKTestUtils;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.junit.jupiter.api.Test;

public class SignerTest {

  @Test
  public void testNulls() {
    PrivateKey mockPrivateKey = mockPrivateKey();

    for (int i = 1; i <= 6; i++) {
      final int j = i;

      Signer signer = new Signer();
      assertThrows(CdpClientException.class, () -> {
        String a1, a2, a3, a4, a5;
        a1 = a2 = a3 = a4 = a5 = "foo";
        PrivateKey pk = mockPrivateKey;

        switch(j) {
        case 1:
          a1 = null;
          break;
        case 2:
          a2 = null;
          break;
        case 3:
          a3 = null;
          break;
        case 4:
          a4 = null;
          break;
        case 5:
          a5 = null;
          break;
        case 6:
          pk = null;
          break;
        }

        signer.computeAuthHeader(a1, a2, a3, a4, a5, pk);
      });
    }
  }

  @Test
  public void testValidRSAKey() {
    Signer signer = new Signer();
    signer.computeAuthHeader("foo", "foo", "foo", "foo", "foo",
                             CdpSDKTestUtils.getRSAPrivateKey());
  }

  @Test
  public void testValidEd25519Key() {
    Signer signer = new Signer();
    signer.computeAuthHeader("foo", "foo", "foo", "foo", "foo",
                             CdpSDKTestUtils.getEd25519PrivateKey());
  }

  private PrivateKey mockPrivateKey() {
    KeyPair testKeyPair = new KeyPair(mock(RSAPublicKey.class), mock(RSAPrivateKey.class));
    return testKeyPair.getPrivate();
  }
}
