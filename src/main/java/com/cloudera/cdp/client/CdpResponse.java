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

package com.cloudera.cdp.client;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.annotation.SdkInternalApi;
import com.google.common.collect.Iterables;

import java.util.List;
import java.util.Map;

/**
 * Class used to encapsulate information returned from all CDP service
 * responses. This class should not be used directly outside of core SDK code.
 */
@SdkInternalApi
public abstract class CdpResponse extends BaseResponse {

  /**
   * The name of the response header containing the request ID.
   */
  public static final String ALTUS_HEADER_REQUESTID = "x-altus-request-id";
  public static final String CDP_HEADER_REQUESTID = "x-cdp-request-id";

  /**
   * Returns the CDP request ID. CDP request IDs can be used in the event a
   * service call isn't working as expected and you need to work with CDP
   * support to debug an issue.
   * @return The CDP request ID
   */
  public String getRequestId() {
    return getRequestId(this.getResponseHeaders());
  }

  static String getRequestId(Map<String, List<String>> responseHeaders) {
    checkNotNullAndThrow(responseHeaders);
    List<String> values = responseHeaders.get(ALTUS_HEADER_REQUESTID);
    if (values == null) {
      values = responseHeaders.get(CDP_HEADER_REQUESTID);
    }
    if (values == null) {
      return "unknown";
    }
    return Iterables.getOnlyElement(values);
  }
}
