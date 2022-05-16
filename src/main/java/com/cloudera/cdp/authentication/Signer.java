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

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.SortedMap;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;

/**
 * A request signer appropriate for use with the CDP client.
 */
public class Signer {

  private static final String RSA_ALGORITHM = "RSA";
  private static final String RSA_AUTH_METHOD = "rsav1";
  private static final String RSA_SIGNATURE_ALGORITHM = "SHA256withRSA";
  private static final String ED25519_ALGORITHM = "Ed25519";
  private static final String ED25519_AUTH_METHOD = "ed25519v1";
  private static final String ED25519_SIGNATURE_ALGORITHM = "Ed25519";
  private static final String ECDSA_ALGORITHM = "EC";
  private static final String ECDSA_AUTH_METHOD = "ecdsav1";
  private static final String ECDSA_SIGNATURE_ALGORITHM = "SHA512withECDSA";

  /**
   * Computes the value for the x-altus-auth header for a request.
   * @param httpMethod the HTTP method
   * @param contentType the value of the content type header
   * @param date the value of the x-altus-date header
   * @param path the request portion of the URI, e.g. /iam/getUser
   * @param accessKeyId the access key ID
   * @param privateKey the access key private key
   * @return the value for the x-altus-auth header
   */
  public String computeAuthHeader(String httpMethod,
                                  String contentType,
                                  String date,
                                  String path,
                                  String accessKeyId,
                                  PrivateKey privateKey) {
    checkNotNullAndThrow(httpMethod);
    checkNotNullAndThrow(contentType);
    checkNotNullAndThrow(date);
    checkNotNullAndThrow(path);
    checkNotNullAndThrow(accessKeyId);
    checkNotNullAndThrow(privateKey);

    String authMethod;
    String sigAlgo;
    switch (privateKey.getAlgorithm()) {
    case RSA_ALGORITHM:
      authMethod = RSA_AUTH_METHOD;
      sigAlgo = RSA_SIGNATURE_ALGORITHM;
      break;
    case ED25519_ALGORITHM:
      authMethod = ED25519_AUTH_METHOD;
      sigAlgo = ED25519_SIGNATURE_ALGORITHM;
      break;
    case ECDSA_ALGORITHM:
      authMethod = ECDSA_AUTH_METHOD;
      sigAlgo = ECDSA_SIGNATURE_ALGORITHM;
      break;
    default:
      throw new CdpClientException("Unsupported key algorithm: " +
                                     privateKey.getAlgorithm());
    }
    byte[] bytesToSign = new StringBuilder()
      .append(httpMethod)
      .append("\n")
      .append(contentType)
      .append("\n")
      .append(date)
      .append("\n")
      .append(path)
      .append("\n")
      .append(authMethod)
      .toString()
      .getBytes(StandardCharsets.UTF_8);

    String signatureString;
    try {
      byte[] sig;
      switch (sigAlgo) {
      case RSA_SIGNATURE_ALGORITHM:
      case ECDSA_SIGNATURE_ALGORITHM:
        Signature signature = Signature.getInstance(sigAlgo);
        signature.initSign(privateKey);
        signature.update(bytesToSign);
        sig = signature.sign();
        break;
      case ED25519_SIGNATURE_ALGORITHM:
        // This labourious process is necessary because we're trying to avoid
        // relying on the BouncyCastle provider to be registered with the
        // security subsystem. And the only way to get a Signature class is
        // through the provider. The BC SignatureSpi implementation cannot
        // be used directly.
        PrivateKeyInfo info = PrivateKeyInfo.getInstance(privateKey.getEncoded());
        ASN1OctetString asn1Seed = ASN1OctetString.getInstance(info.parsePrivateKey());
        byte[] seed = asn1Seed.getOctets();

        Ed25519Signer signer = new Ed25519Signer();
        signer.init(true, new Ed25519PrivateKeyParameters(seed, 0));
        signer.update(bytesToSign, 0, bytesToSign.length);
        sig = signer.generateSignature();
        break;
      default:
        throw new CdpClientException("Unsupported key algorithm: " +
                                       privateKey.getAlgorithm());
      }
      signatureString = Base64.encodeBase64URLSafeString(sig);
    } catch (NoSuchAlgorithmException |
             InvalidKeyException |
             SignatureException |
             IOException e) {
      throw new RuntimeException(e);
    }

    try {
      SortedMap<String, String> authParams = Maps.newTreeMap();
      authParams.put("access_key_id", accessKeyId);
      authParams.put("auth_method", authMethod);
      String encodedAuthParams =
        new ObjectMapper().writeValueAsString(authParams);
      return String.format("%s.%s",
        Base64.encodeBase64URLSafeString(
          encodedAuthParams.getBytes(StandardCharsets.UTF_8)),
          signatureString);
    } catch (JsonProcessingException e) {
      throw new CdpClientException("Error while building authentication header");
    }
  }
}
