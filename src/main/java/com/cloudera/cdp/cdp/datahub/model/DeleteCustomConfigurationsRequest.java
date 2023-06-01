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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * The request object for the delete custom configurations request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-01T14:27:19.310-07:00")
public class DeleteCustomConfigurationsRequest  {

  /**
   * The names or CRNs of the custom configurations to be deleted.
   **/
  private List<String> customConfigurations = new ArrayList<String>();

  /**
   * Getter for customConfigurations.
   * The names or CRNs of the custom configurations to be deleted.
   **/
  @JsonProperty("customConfigurations")
  public List<String> getCustomConfigurations() {
    return customConfigurations;
  }

  /**
   * Setter for customConfigurations.
   * The names or CRNs of the custom configurations to be deleted.
   **/
  public void setCustomConfigurations(List<String> customConfigurations) {
    this.customConfigurations = customConfigurations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteCustomConfigurationsRequest deleteCustomConfigurationsRequest = (DeleteCustomConfigurationsRequest) o;
    if (!Objects.equals(this.customConfigurations, deleteCustomConfigurationsRequest.customConfigurations)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCustomConfigurationsRequest {\n");
    sb.append("    customConfigurations: ").append(toIndentedString(customConfigurations)).append("\n");
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

