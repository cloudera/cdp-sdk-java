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

import java.io.IOException;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

/**
 * Utility methods for interacting with CDP credentials.
 */
public class CredentialUtilities {

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
      return decodeRSAPrivateKey(privateKey);
    }
  }

  private static PrivateKey decodeRSAPrivateKey(String privateKey) {
    privateKey = privateKey.replace("\\n", "\n");
    try (PemReader pemReader = new PemReader(new StringReader(privateKey))) {
      PemObject pemObject = pemReader.readPemObject();
      if (pemObject == null) {
        throw new CdpClientException("Invalid private key ");
      }
      PKCS8EncodedKeySpec privateKeySpec =
              new PKCS8EncodedKeySpec(pemObject.getContent());
      KeyFactory factory = KeyFactory.getInstance("RSA");
      return factory.generatePrivate(privateKeySpec);
    } catch (IOException |
            NoSuchAlgorithmException |
            InvalidKeySpecException e) {
      throw new CdpClientException(
          "Unable to generate private key " + e.getMessage(), e);
    }
  }

  private static PrivateKey decodeEd25519PrivateKey(String privateKey) {
    byte[] seed = Base64.getDecoder().decode(privateKey);
    try {
      // We instantiate the KeyFactorySpi directly to avoid having to register
      // the BouncyCastle provider, and even if we did, this parameter based
      // instantiation is not exposed through the provider interfaces.
      Ed25519PrivateKeyParameters params = new Ed25519PrivateKeyParameters(seed, 0);
      PrivateKeyInfo info = PrivateKeyInfoFactory.createPrivateKeyInfo(params);
      return new KeyFactorySpi.Ed25519().generatePrivate(info);
    } catch (IOException e) {
      throw new CdpClientException(
          "Unable to generate private key " + e.getMessage(), e);
    }
  }
}
