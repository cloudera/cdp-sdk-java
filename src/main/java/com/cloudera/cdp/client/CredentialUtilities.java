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

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

/**
 * Utility methods for interacting with CDP credentials.
 */
public class CredentialUtilities {

  private static final String RSA_ALGORITHM = "RSA";
  private static final String ECDSA_ALGORITHM = "EC";

  private static final List<String> POSSIBLE_PEM_PRIVATE_KEY_ALGORITHMS =
      ImmutableList.of(RSA_ALGORITHM, ECDSA_ALGORITHM);

  /** The Ed25519 key is 44 bytes long (32 bytes encoded in base 64). */
  private static final int ED25519_KEY_LENGTH = 44;

  private CredentialUtilities() {}

  /**
   * Decodes a private key from the string format used in CDP profiles.
   * @param privateKey the private key as a single line string
   * @return the private key
   */
  public static PrivateKey decodePrivateKey(String privateKey) {
    checkNotNullAndThrow(privateKey);
    if (privateKey.length() == ED25519_KEY_LENGTH) {
      return decodeEd25519PrivateKey(privateKey);
    } else {
      return decodePEMPrivateKey(privateKey);
    }
  }

  private static PrivateKey decodePEMPrivateKey(String privateKey) {
    privateKey = privateKey.replace("\\n", "\n");
    try (PemReader pemReader = new PemReader(new StringReader(privateKey))) {
      PemObject pemObject = pemReader.readPemObject();
      if (pemObject == null) {
        throw new CdpClientException("Invalid private key ");
      }
      PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(pemObject.getContent());

      // This distinguishes between the different algorithms. With Java9 we don't need the
      // try/catches and can check the type with: `privateKeySpec.getAlgorithm()`
      for (String algorithm: POSSIBLE_PEM_PRIVATE_KEY_ALGORITHMS) {
        try {
          return KeyFactory.getInstance(algorithm).generatePrivate(privateKeySpec);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException e) {
          // no-op;
        }
      }
      throw new CdpClientException("Unable to decode private key: unknown algorithm.");
    } catch (IOException e) {
      throw new CdpClientException("Unable to read private key: " + e.getMessage(), e);
    }
  }

  private static PrivateKey decodeEd25519PrivateKey(String privateKey) {
    byte[] privateKeyByte = Base64.getDecoder().decode(privateKey);
    try {
      // OID for Ed25519 is 1.3.101.112
      ASN1ObjectIdentifier oid = new ASN1ObjectIdentifier("1.3.101.112"); //NOPMD
      AlgorithmIdentifier privateKeyAlg = new AlgorithmIdentifier(oid);
      PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo(privateKeyAlg, new DEROctetString(privateKeyByte));
      return new KeyFactorySpi.Ed25519().generatePrivate(privateKeyInfo);
    } catch (IOException e) {
      throw new CdpClientException(
          "Unable to generate private key " + e.getMessage(), e);
    }
  }
}
