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

package com.cloudera.cdp.opdb.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a OpdbClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-12-01T15:55:33.142-08:00")
public class OpdbClientBuilder extends CdpClientBuilder<OpdbClientBuilder> {

  private OpdbClientBuilder() {
   super(OpdbClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return OpdbClient
   */
  public static OpdbClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return OpdbClientBuilder
   */
  public static OpdbClientBuilder defaultBuilder() {
    return new OpdbClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return OpdbClient
   */
  public OpdbClient build() {
    return new OpdbClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public OpdbClientBuilder self() {
    return this;
  }
}