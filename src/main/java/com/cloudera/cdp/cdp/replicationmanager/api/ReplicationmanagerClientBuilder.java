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

package com.cloudera.cdp.replicationmanager.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a ReplicationmanagerClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-07-13T10:29:24.647-07:00")
public class ReplicationmanagerClientBuilder extends CdpClientBuilder<ReplicationmanagerClientBuilder> {

  private ReplicationmanagerClientBuilder() {
   super(ReplicationmanagerClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return ReplicationmanagerClient
   */
  public static ReplicationmanagerClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return ReplicationmanagerClientBuilder
   */
  public static ReplicationmanagerClientBuilder defaultBuilder() {
    return new ReplicationmanagerClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return ReplicationmanagerClient
   */
  public ReplicationmanagerClient build() {
    return new ReplicationmanagerClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public ReplicationmanagerClientBuilder self() {
    return this;
  }
}