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

package com.cloudera.cdp.datahub.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a DatahubClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-23T16:36:40.169-07:00")
public class DatahubClientBuilder extends CdpClientBuilder<DatahubClientBuilder> {

  private DatahubClientBuilder() {
   super(DatahubClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return DatahubClient
   */
  public static DatahubClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return DatahubClientBuilder
   */
  public static DatahubClientBuilder defaultBuilder() {
    return new DatahubClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return DatahubClient
   */
  public DatahubClient build() {
    return new DatahubClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public DatahubClientBuilder self() {
    return this;
  }
}