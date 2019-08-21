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

/**
 * Interface for providing CDP credentials. Implementations are free to use
 * any strategy for providing CDP credentials, such as simply providing
 * static credentials that don't change, or more complicated implementations,
 * such as integrating with existing key management systems.
 */
public interface CdpCredentialsProvider {

  /**
   * Returns CdpCredentials which the caller can use to authenticate a CDP
   * request. Each implementation of CdpCredentialsProvider can chose its own
   * strategy for loading credentials.  For example, an implementation might
   * load credentials from an existing key management system, or load new
   * credentials when credentials are rotated.
   *
   * @return CdpCredentials which the caller can use to authenticate an CDP
   * request.
   */
  CdpCredentials getCredentials();
}
