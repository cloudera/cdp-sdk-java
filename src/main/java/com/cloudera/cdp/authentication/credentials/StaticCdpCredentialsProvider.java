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

/**
 * Simple implementation of CdpCredentialsProvider that just wraps static
 * CdpCredentials.
 */
public class StaticCdpCredentialsProvider implements CdpCredentialsProvider {

  private final CdpCredentials credentials;

  /**
   * Constructor.
   * @param credentials the CDP credentials
   */
  public StaticCdpCredentialsProvider(CdpCredentials credentials) {
    this.credentials = checkNotNullAndThrow(credentials);
  }

  @Override
  public CdpCredentials getCredentials() {
    return credentials;
  }
}
