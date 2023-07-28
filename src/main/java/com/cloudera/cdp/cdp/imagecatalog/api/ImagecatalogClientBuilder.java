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

package com.cloudera.cdp.imagecatalog.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a ImagecatalogClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-07-28T07:53:32.452-07:00")
public class ImagecatalogClientBuilder extends CdpClientBuilder<ImagecatalogClientBuilder> {

  private ImagecatalogClientBuilder() {
   super(ImagecatalogClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return ImagecatalogClient
   */
  public static ImagecatalogClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return ImagecatalogClientBuilder
   */
  public static ImagecatalogClientBuilder defaultBuilder() {
    return new ImagecatalogClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return ImagecatalogClient
   */
  public ImagecatalogClient build() {
    return new ImagecatalogClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public ImagecatalogClientBuilder self() {
    return this;
  }
}