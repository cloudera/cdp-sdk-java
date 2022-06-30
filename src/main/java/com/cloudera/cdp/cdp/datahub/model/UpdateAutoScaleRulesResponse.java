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
import com.cloudera.cdp.datahub.model.AutoScaleRulesResponse;

/**
 * The AutoScale rules for the cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-29T15:24:01.906-07:00")
public class UpdateAutoScaleRulesResponse extends CdpResponse {

  /**
   * The autoscale rules.
   **/
  private AutoScaleRulesResponse autoScaleRules = null;

  /**
   * Getter for autoScaleRules.
   * The autoscale rules.
   **/
  @JsonProperty("autoScaleRules")
  public AutoScaleRulesResponse getAutoScaleRules() {
    return autoScaleRules;
  }

  /**
   * Setter for autoScaleRules.
   * The autoscale rules.
   **/
  public void setAutoScaleRules(AutoScaleRulesResponse autoScaleRules) {
    this.autoScaleRules = autoScaleRules;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAutoScaleRulesResponse updateAutoScaleRulesResponse = (UpdateAutoScaleRulesResponse) o;
    if (!Objects.equals(this.autoScaleRules, updateAutoScaleRulesResponse.autoScaleRules)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoScaleRules, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAutoScaleRulesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    autoScaleRules: ").append(toIndentedString(autoScaleRules)).append("\n");
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

