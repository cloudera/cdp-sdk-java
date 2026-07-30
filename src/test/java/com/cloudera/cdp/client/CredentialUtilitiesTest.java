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

package com.cloudera.cdp.client;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.util.CdpSDKTestUtils;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Base64;

import org.junit.Test;

public class CredentialUtilitiesTest {

  @Test
  public void testWithNullKey() {
    Throwable e = assertThrows(
        CdpClientException.class,
        () -> CredentialUtilities.decodePrivateKey(null));

    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testWithInvalidKey() {
    CdpClientException exception =
        assertThrows(
            CdpClientException.class,
            () -> CredentialUtilities.decodePrivateKey("blah blah blah"));

    assertEquals("Invalid private key ", exception.getMessage());
  }

  @Test
  public void testWithEmptyKey() {
    CdpClientException exception = assertThrows(
        CdpClientException.class,
        () -> CredentialUtilities.decodePrivateKey(""));

    assertEquals("Invalid private key ", exception.getMessage());
  }

  @Test
  public void testWithPemHeaderButInvalidContent() {
    String invalidPem =
        "-----BEGIN PRIVATE KEY-----\n"
            + Base64.getEncoder().encodeToString(
            "not a private key".getBytes(StandardCharsets.UTF_8))
            + "\n-----END PRIVATE KEY-----";

    CdpClientException exception = assertThrows(
        CdpClientException.class,
        () -> CredentialUtilities.decodePrivateKey(invalidPem));

    assertEquals(
        "Unable to decode private key: unknown algorithm.",
        exception.getMessage());
  }

  @Test
  public void testWithValidRSAKey() {
    PrivateKey privateKey = CdpSDKTestUtils.getRSAPrivateKey();

    assertNotNull(privateKey);
    assertEquals("RSA", privateKey.getAlgorithm());
    assertEquals("PKCS#8", privateKey.getFormat());
  }

  @Test
  public void testWithGeneratedRSAKey() throws Exception {
    KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
    generator.initialize(2048);
    KeyPair keyPair = generator.generateKeyPair();

    PrivateKey decodedKey =
        CredentialUtilities.decodePrivateKey(toPem(keyPair.getPrivate()));

    assertPrivateKeyEquals(keyPair.getPrivate(), decodedKey, "RSA");
  }

  @Test
  public void testWithValidRSAKeyContainingEscapedNewlines() throws Exception {
    KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
    generator.initialize(2048);
    KeyPair keyPair = generator.generateKeyPair();

    String privateKeyWithEscapedNewlines =
        toPem(keyPair.getPrivate()).replace("\n", "\\n");

    PrivateKey decodedKey =
        CredentialUtilities.decodePrivateKey(privateKeyWithEscapedNewlines);

    assertPrivateKeyEquals(keyPair.getPrivate(), decodedKey, "RSA");
  }

  @Test
  public void testWithValidEd25519Key() {
    PrivateKey privateKey = CdpSDKTestUtils.getEd25519PrivateKey();

    assertNotNull(privateKey);
    assertNotNull(privateKey.getEncoded());
    assertEquals("PKCS#8", privateKey.getFormat());
    assertTrue(
        privateKey.getAlgorithm().equalsIgnoreCase("Ed25519")
            || privateKey.getAlgorithm().equalsIgnoreCase("EdDSA"),
        "Unexpected Ed25519 key algorithm: " + privateKey.getAlgorithm());
  }

  @Test
  public void testWithGeneratedEd25519Key() {
    byte[] rawPrivateKey = new byte[32];
    for (int i = 0; i < rawPrivateKey.length; i++) {
      rawPrivateKey[i] = (byte) i;
    }

    String encodedPrivateKey =
        Base64.getEncoder().encodeToString(rawPrivateKey);

    assertEquals(44, encodedPrivateKey.length());

    PrivateKey decodedKey =
        CredentialUtilities.decodePrivateKey(encodedPrivateKey);

    assertNotNull(decodedKey);
    assertNotNull(decodedKey.getEncoded());
    assertEquals("PKCS#8", decodedKey.getFormat());
    assertTrue(
        decodedKey.getAlgorithm().equalsIgnoreCase("Ed25519")
            || decodedKey.getAlgorithm().equalsIgnoreCase("EdDSA"),
        "Unexpected Ed25519 key algorithm: " + decodedKey.getAlgorithm());
  }

  @Test
  public void testWithValidECDSAKey() {
    PrivateKey privateKey = CdpSDKTestUtils.getECDSAPrivateKey();

    assertNotNull(privateKey);
    assertEquals("EC", privateKey.getAlgorithm());
    assertEquals("PKCS#8", privateKey.getFormat());
  }

  @Test
  public void testWithGeneratedECDSAKey() throws Exception {
    KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
    generator.initialize(new ECGenParameterSpec("secp256r1"));
    KeyPair keyPair = generator.generateKeyPair();

    PrivateKey decodedKey =
        CredentialUtilities.decodePrivateKey(toPem(keyPair.getPrivate()));

    assertPrivateKeyEquals(keyPair.getPrivate(), decodedKey, "EC");
  }

  @Test
  public void testWithValidDSAKeyErrors() {
    try {
      CredentialUtilities.decodePrivateKey(
          "-----BEGIN DSA PRIVATE KEY-----\n"
              + "MIIDVwIBAAKCAQEA9SghLj3fcdVs5Bn53/K9frlfDoGjcyL83IlxkiT6tcgOWjdP\n"
              + "TY07U7hQdb7ipubFUi/3wATjya1hU0tbxdLD86CyDNIZP/4OmkHY3r4Zyf9skd9E\n"
              + "bfywq0pzNAwxmvb18XJQxEJhV/pOu7cxW1a7I2wq6ewsSYSM0N2uzSsYUvbvzNhA\n"
              + "wV2wGg9t2q8+GCKPHT381cSEwsKFkqAZ2rE0jFFv8moG8X4zl8LF1365cC8zK7RQ\n"
              + "kPSk/pO41k/Nwo+nPCdqalGnGCACEMl4QkidvhYH/WRY0//dfaqOzBTdbe43hU7N\n"
              + "NmoSf399dnhmWJejbZAPZEVVZUR8f606M+C0gQIhALvsmhRMHrnftqn6PvQ++ejL\n"
              + "LSF8Go1KRTxrBfgnMIH7AoIBAQDFlVsDmSq3hb+HEXCSsWzk1jMJ2dqtNrAD2Qfn\n"
              + "ubVc4oS0qx5eCvic4IINKgnYgdfYSsiegT5lZFGty+6I4uqvbdZrlNoozDmNTddH\n"
              + "9Xj40u0uzitsOHv80lxVgzO3Ycg2G5X2DOF08J+aZPS3yZ3BmJ0O/BDkOjhOQHoV\n"
              + "wbPyQKunv01MN7Paxq/R4asv55KifKU0+3kWwG+GTtCFT5rpcu04BXkCVknl60ls\n"
              + "SVYKW4Fm6978JsP207J4O0zxMRGSxTDMEsWPC3FKPOx/ebab/FAIcBrP3PRzjSPK\n"
              + "bqaL76OunjDh2LOv+0a17zAunnTZ++hVhe9RLNfgC9Hrjy7rAoIBAQCz58g8MgY7\n"
              + "Jgi/4ureWf11yovtJ3hLl5piSvY2zRjaO3HV6vS4dJSat0t30pq19uDNjKP85eeR\n"
              + "dkw2xSk7s8Zme/KAGfMqKHIeWDnGzr60QgMPOb8xpLCDlxaU70NiI7mfJyYP/trA\n"
              + "aVTYN3XnY1e7XMOZVnZ3MmzjPqbQLfcodwxEJ6+QnxMSZfkgpZh+kj83FOR33aMn\n"
              + "oxwPl2nP2tjT8bdsMiKVFM1P80MLwdOrl1SyeGBJVIFmPNoJHP44jTG3seDvb1R2\n"
              + "1IK4rlVJoxV3qgtW8TUaGBboFmFkfMn5dbm2pDl+n3rD8E4A76/PaJw+jIlKds8c\n"
              + "ZpUTLhMhQPWAAiAfBjDTZe0SYYK/KHUCBcrC6Vjw1OIMgOQmFjaDOOvD5Q==\n"
              + "-----END DSA PRIVATE KEY-----");

      fail("Expected a CdpClientException exception to be thrown.");
    } catch (CdpClientException e) {
      assertEquals(
          "Unable to decode private key: unknown algorithm.",
          e.getMessage());
    }
  }

  @Test
  public void testWithValidPkcs8DSAKeyErrors() throws Exception {
    KeyPairGenerator generator = KeyPairGenerator.getInstance("DSA");
    generator.initialize(2048);
    KeyPair keyPair = generator.generateKeyPair();

    CdpClientException exception = assertThrows(
        CdpClientException.class,
        () -> CredentialUtilities.decodePrivateKey(
            toPem(keyPair.getPrivate())));

    assertEquals(
        "Unable to decode private key: unknown algorithm.",
        exception.getMessage());
  }

  private static void assertPrivateKeyEquals(
      PrivateKey expected,
      PrivateKey actual,
      String expectedAlgorithm) {

    assertNotNull(actual);
    assertEquals(expectedAlgorithm, actual.getAlgorithm());
    assertEquals("PKCS#8", actual.getFormat());
    assertArrayEquals(expected.getEncoded(), actual.getEncoded());
  }

  private static String toPem(PrivateKey privateKey) {
    String encodedKey =
        Base64.getMimeEncoder(
                64,
                "\n".getBytes(StandardCharsets.UTF_8))
            .encodeToString(privateKey.getEncoded());

    return "-----BEGIN PRIVATE KEY-----\n"
        + encodedKey
        + "\n-----END PRIVATE KEY-----";
  }
}
