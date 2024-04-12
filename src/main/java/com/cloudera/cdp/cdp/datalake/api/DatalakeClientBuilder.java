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

package com.cloudera.cdp.datalake.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a DatalakeClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-11T13:44:52.489-07:00")
public class DatalakeClientBuilder extends CdpClientBuilder<DatalakeClientBuilder> {

  private DatalakeClientBuilder() {
   super(DatalakeClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return DatalakeClient
   */
  public static DatalakeClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return DatalakeClientBuilder
   */
  public static DatalakeClientBuilder defaultBuilder() {
    return new DatalakeClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return DatalakeClient
   */
  public DatalakeClient build() {
    return new DatalakeClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public DatalakeClientBuilder self() {
    return this;
  }
}