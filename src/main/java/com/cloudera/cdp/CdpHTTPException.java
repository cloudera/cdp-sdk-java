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

/**
 * Class used to report exceptions which have an associated HTTP code.
 */
public class CdpHTTPException extends CdpClientException {

  private static final long serialVersionUID = -3152296625966897220L;

  private final int httpCode;

  /**
   * Constructor.
   * @param httpCode the HTTP code
   * @param message the error message
   * @param cause the cause
   */
  public CdpHTTPException(int httpCode, String message, Throwable cause) {
    super(String.format("%d: %s", httpCode, message), cause);
    this.httpCode = httpCode;
  }

  /**
   * Constructor.
   * @param httpCode the HTTP code
   * @param message the error message
   */
  public CdpHTTPException(int httpCode, String message) {
    super(String.format("%d: %s", httpCode, message));
    this.httpCode = httpCode;
  }

  /**
   * Gets the HTTP response code.
   * @return the HTTP response code
   */
  public int getHttpCode() {
    return httpCode;
  }

}
