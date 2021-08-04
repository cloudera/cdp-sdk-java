/*
 * Copyright (c) 2021 Cloudera, Inc. All Rights Reserved.
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

package com.cloudera.cdp.extension;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.client.BaseResponse;
import com.cloudera.cdp.client.CdpClientContext;
import com.cloudera.cdp.client.CdpClientMiddleware;

@SdkInternalApi
public class Dfx implements CdpClientMiddleware {

  private final CdpClientMiddleware next;

  public Dfx(CdpClientMiddleware next) {
    this.next = checkNotNullAndThrow(next);
  }

  @Override
  public <T extends BaseResponse> void invokeAPI(CdpClientContext<T> context) {
    next.invokeAPI(context);
  }
}
