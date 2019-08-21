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
 * Class used to report exceptions which occur when either interpreting a request
 * from the client or handling an improper response from the CDP service.
 */
public class CdpClientException extends RuntimeException {

  private static final long serialVersionUID = 8754116351682033426L;

  /**
  * Constructor.
  * @param message the error message
  */
  public CdpClientException(String message) {
    super(message);
  }

  /**
   * Constructor which creates an CdpClientException.
   * @param message the error message
   * @param cause the cause
   */
  public CdpClientException(String message, Throwable cause) {
    super(message, cause);
  }
}
