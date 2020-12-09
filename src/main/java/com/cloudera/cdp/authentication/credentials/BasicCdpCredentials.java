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

package com.cloudera.cdp.authentication.credentials;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.client.CredentialUtilities;

import java.security.PrivateKey;

/**
 * Basic implementation of the CdpCredentials interface that allows callers
 * to pass in the CDP access key ID and private key in the constructor.
 */
public class BasicCdpCredentials implements CdpCredentials {

  private final String accessKeyId;
  private final PrivateKey privateKey;
  private final String accessToken;

  /**
   * Constructor.
   * @param accessKeyId the CDP access key ID
   * @param privateKey the CDP private key
   */
  public BasicCdpCredentials(
      String accessKeyId,
      String privateKey) {
    this(accessKeyId,
         CredentialUtilities.decodePrivateKey(
             checkNotNullAndThrow(privateKey)));
  }

  /**
   * Constructor.
   * @param accessKeyId the CDP access key ID
   * @param privateKey the CDP private key
   */
  public BasicCdpCredentials(
      String accessKeyId,
      PrivateKey privateKey) {
    checkNotNullAndThrow(accessKeyId);
    checkNotNullAndThrow(privateKey);
    this.accessKeyId = accessKeyId;
    this.privateKey = privateKey;
    this.accessToken = null;
  }

  /**
   * Constructor.
   * @param accessToken the CDP access token
   */
  public BasicCdpCredentials(
      String accessToken) {
    checkNotNullAndThrow(accessToken);
    this.accessKeyId = null;
    this.privateKey = null;
    this.accessToken = accessToken;
  }

  @Override
  public String getAccessKeyId() {
    return accessKeyId;
  }

  @Override
  public PrivateKey getPrivateKey() {
    return privateKey;
  }

  @Override
  public String getAccessToken() {
    return accessToken;
  }

  @Override
  public Boolean isValid() {
    if (this.getAccessKeyId() != null && this.getPrivateKey() != null) {
      return true;
    }
    if (this.getAccessToken() != null) {
      return true;
    }
    return false;
  }
}
