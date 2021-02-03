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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.ApplicationConfigDiff;
import java.util.*;
import java.util.Map;

/**
 * Differences between two service configurations.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-02-03T13:16:57.681-08:00")
public class ServiceConfigDiff  {

  /**
   * Has any of the configurations changed?
   **/
  private Boolean isChanged = null;

  /**
   * Differences between the common configurations.
   **/
  private ApplicationConfigDiff commonConfigsDiff = null;

  /**
   * Differences between the application specific configurations.
   **/
  private Map<String, ApplicationConfigDiff> applicationConfigsDiffs = new HashMap<String, ApplicationConfigDiff>();

  /**
   * Getter for isChanged.
   * Has any of the configurations changed?
   **/
  @JsonProperty("isChanged")
  public Boolean getIsChanged() {
    return isChanged;
  }

  /**
   * Setter for isChanged.
   * Has any of the configurations changed?
   **/
  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  /**
   * Getter for commonConfigsDiff.
   * Differences between the common configurations.
   **/
  @JsonProperty("commonConfigsDiff")
  public ApplicationConfigDiff getCommonConfigsDiff() {
    return commonConfigsDiff;
  }

  /**
   * Setter for commonConfigsDiff.
   * Differences between the common configurations.
   **/
  public void setCommonConfigsDiff(ApplicationConfigDiff commonConfigsDiff) {
    this.commonConfigsDiff = commonConfigsDiff;
  }

  /**
   * Getter for applicationConfigsDiffs.
   * Differences between the application specific configurations.
   **/
  @JsonProperty("applicationConfigsDiffs")
  public Map<String, ApplicationConfigDiff> getApplicationConfigsDiffs() {
    return applicationConfigsDiffs;
  }

  /**
   * Setter for applicationConfigsDiffs.
   * Differences between the application specific configurations.
   **/
  public void setApplicationConfigsDiffs(Map<String, ApplicationConfigDiff> applicationConfigsDiffs) {
    this.applicationConfigsDiffs = applicationConfigsDiffs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceConfigDiff serviceConfigDiff = (ServiceConfigDiff) o;
    if (!Objects.equals(this.isChanged, serviceConfigDiff.isChanged)) {
      return false;
    }
    if (!Objects.equals(this.commonConfigsDiff, serviceConfigDiff.commonConfigsDiff)) {
      return false;
    }
    if (!Objects.equals(this.applicationConfigsDiffs, serviceConfigDiff.applicationConfigsDiffs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isChanged, commonConfigsDiff, applicationConfigsDiffs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceConfigDiff {\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    commonConfigsDiff: ").append(toIndentedString(commonConfigsDiff)).append("\n");
    sb.append("    applicationConfigsDiffs: ").append(toIndentedString(applicationConfigsDiffs)).append("\n");
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

