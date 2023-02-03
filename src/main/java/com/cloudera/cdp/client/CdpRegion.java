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

package com.cloudera.cdp.client;

/**
 * Enum class for CDP regions.
 */
public enum CdpRegion {
  US_WEST_1("us-west-1"),
  EU_1("eu-1"),
  AP_1("ap-1"),
  USG_1("usg-1");

  private final String value;

  /**
   * Constructor.
   */
  CdpRegion(String value) {
    this.value = value;
  }

  /**
   * Overrides toString() method to easily substitute enum with its string value.
   */
  @Override
  public String toString() {
    return value;
  }
}
