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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Information on the last time an access key was used.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-09T12:44:57.829-07:00")
public class AccessKeyLastUsage  {

  /**
   * The date when the access key was last used.
   **/
  private ZonedDateTime lastUsageDate = null;

  /**
   * The name of the service with which this access key was most recently used.
   **/
  private String serviceName = null;

  /**
   * Getter for lastUsageDate.
   * The date when the access key was last used.
   **/
  @JsonProperty("lastUsageDate")
  public ZonedDateTime getLastUsageDate() {
    return lastUsageDate;
  }

  /**
   * Setter for lastUsageDate.
   * The date when the access key was last used.
   **/
  public void setLastUsageDate(ZonedDateTime lastUsageDate) {
    this.lastUsageDate = lastUsageDate;
  }

  /**
   * Getter for serviceName.
   * The name of the service with which this access key was most recently used.
   **/
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Setter for serviceName.
   * The name of the service with which this access key was most recently used.
   **/
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKeyLastUsage accessKeyLastUsage = (AccessKeyLastUsage) o;
    if (!Objects.equals(this.lastUsageDate, accessKeyLastUsage.lastUsageDate)) {
      return false;
    }
    if (!Objects.equals(this.serviceName, accessKeyLastUsage.serviceName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUsageDate, serviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeyLastUsage {\n");
    sb.append("    lastUsageDate: ").append(toIndentedString(lastUsageDate)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

