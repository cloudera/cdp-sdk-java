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

package com.cloudera.cdp;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;

import com.cloudera.cdp.annotation.SdkInternalApi;

/**
 * Class containing validation utilty methods.
 */
@SdkInternalApi
public class ValidationUtils {

  private ValidationUtils() {}

  /**
   * Like checkState, but throws an CdpClientException.
   * @param expr a boolean expression
   */
  public static void checkStateAndThrow(boolean expr) {
    try {
      checkState(expr);
    } catch (IllegalStateException e) {
      throw new CdpClientException("Illegal state");
    }
  }

  /**
   * Like checkArgument, but throws an CdpClientException.
   * @param expr a boolean expression
   */
  public static void checkArgumentAndThrow(boolean expr) {
    try {
      checkArgument(expr);
    } catch (IllegalArgumentException e) {
      throw new CdpClientException("Illegal argument");
    }
  }

  /**
   * Like checkNotNull, but throws an CdpClientException.
   * @param ref an object reference
   * @param <T> The type of the object
   * @return the non-null reference that was validated
   */
  public static <T> T checkNotNullAndThrow(T ref) {
      if (ref == null) {
        throw new CdpClientException("Argument is null");
      } else {
        return ref;
      }
  }
}
