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

/**
 * Information about Custom Configuration Property.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:39.671-07:00")
public class CustomConfigurationProperty  {

  /**
   * The name of the custom configuration property.
   **/
  private String configName = null;

  /**
   * The value of the custom configuration property.
   **/
  private String configValue = null;

  /**
   * The service under which the custom configuration property belongs.
   **/
  private String serviceType = null;

  /**
   * The role within the service type.
   **/
  private String roleType = null;

  /**
   * Getter for configName.
   * The name of the custom configuration property.
   **/
  @JsonProperty("configName")
  public String getConfigName() {
    return configName;
  }

  /**
   * Setter for configName.
   * The name of the custom configuration property.
   **/
  public void setConfigName(String configName) {
    this.configName = configName;
  }

  /**
   * Getter for configValue.
   * The value of the custom configuration property.
   **/
  @JsonProperty("configValue")
  public String getConfigValue() {
    return configValue;
  }

  /**
   * Setter for configValue.
   * The value of the custom configuration property.
   **/
  public void setConfigValue(String configValue) {
    this.configValue = configValue;
  }

  /**
   * Getter for serviceType.
   * The service under which the custom configuration property belongs.
   **/
  @JsonProperty("serviceType")
  public String getServiceType() {
    return serviceType;
  }

  /**
   * Setter for serviceType.
   * The service under which the custom configuration property belongs.
   **/
  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  /**
   * Getter for roleType.
   * The role within the service type.
   **/
  @JsonProperty("roleType")
  public String getRoleType() {
    return roleType;
  }

  /**
   * Setter for roleType.
   * The role within the service type.
   **/
  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomConfigurationProperty customConfigurationProperty = (CustomConfigurationProperty) o;
    if (!Objects.equals(this.configName, customConfigurationProperty.configName)) {
      return false;
    }
    if (!Objects.equals(this.configValue, customConfigurationProperty.configValue)) {
      return false;
    }
    if (!Objects.equals(this.serviceType, customConfigurationProperty.serviceType)) {
      return false;
    }
    if (!Objects.equals(this.roleType, customConfigurationProperty.roleType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configName, configValue, serviceType, roleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomConfigurationProperty {\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
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

