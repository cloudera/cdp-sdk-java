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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.InstanceGroup;
import java.util.*;

/**
 * Request object for workspace provision.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-09-05T21:16:03.171-07:00")
public class ProvisionK8sRequest  {

  /**
   * The environment for the workspace to create.
   **/
  private String environmentName = null;

  /**
   * The instance groups.
   **/
  private List<InstanceGroup> instanceGroupss = new ArrayList<InstanceGroup>();

  /**
   * Getter for environmentName.
   * The environment for the workspace to create.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment for the workspace to create.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for instanceGroupss.
   * The instance groups.
   **/
  @JsonProperty("instanceGroupss")
  public List<InstanceGroup> getInstanceGroupss() {
    return instanceGroupss;
  }

  /**
   * Setter for instanceGroupss.
   * The instance groups.
   **/
  public void setInstanceGroupss(List<InstanceGroup> instanceGroupss) {
    this.instanceGroupss = instanceGroupss;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionK8sRequest provisionK8sRequest = (ProvisionK8sRequest) o;
    if (!Objects.equals(this.environmentName, provisionK8sRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupss, provisionK8sRequest.instanceGroupss)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, instanceGroupss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionK8sRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    instanceGroupss: ").append(toIndentedString(instanceGroupss)).append("\n");
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

