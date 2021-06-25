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

package com.cloudera.cdp.ml.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a MlClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-06-25T14:27:47.455-07:00")
public class MlClientBuilder extends CdpClientBuilder<MlClientBuilder> {

  private MlClientBuilder() {
   super(MlClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return MlClient
   */
  public static MlClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return MlClientBuilder
   */
  public static MlClientBuilder defaultBuilder() {
    return new MlClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return MlClient
   */
  public MlClient build() {
    return new MlClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public MlClientBuilder self() {
    return this;
  }
}