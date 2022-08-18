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

package com.cloudera.cdp.dw.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a DwClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-16T15:45:11.677-07:00")
public class DwClientBuilder extends CdpClientBuilder<DwClientBuilder> {

  private DwClientBuilder() {
   super(DwClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return DwClient
   */
  public static DwClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return DwClientBuilder
   */
  public static DwClientBuilder defaultBuilder() {
    return new DwClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return DwClient
   */
  public DwClient build() {
    return new DwClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public DwClientBuilder self() {
    return this;
  }
}