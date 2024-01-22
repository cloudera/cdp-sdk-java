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

package com.cloudera.cdp.consumption.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a ConsumptionClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-19T13:24:36.778-08:00")
public class ConsumptionClientBuilder extends CdpClientBuilder<ConsumptionClientBuilder> {

  private ConsumptionClientBuilder() {
   super(ConsumptionClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return ConsumptionClient
   */
  public static ConsumptionClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return ConsumptionClientBuilder
   */
  public static ConsumptionClientBuilder defaultBuilder() {
    return new ConsumptionClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return ConsumptionClient
   */
  public ConsumptionClient build() {
    return new ConsumptionClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public ConsumptionClientBuilder self() {
    return this;
  }
}