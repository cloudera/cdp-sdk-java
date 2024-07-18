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
import com.cloudera.cdp.dw.model.ApplicationConfigResp;
import java.util.*;
import java.util.Map;

/**
 * Configurations for a service (DBC or VW)
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-07-18T14:59:53.512-07:00")
public class ServiceConfigResp  {

  /**
   * Configurations that are applied to every application in the service.
   **/
  private ApplicationConfigResp commonConfigs = null;

  /**
   * Application specific configurations.
   **/
  private Map<String, ApplicationConfigResp> applicationConfigs = new HashMap<String, ApplicationConfigResp>();

  /**
   * List of LDAP Groupnames to be enabled for auth.
   **/
  private List<String> ldapGroups = new ArrayList<String>();

  /**
   * Should SSO be enabled for this VW. This cannot be changed later.
   **/
  private Boolean enableSSO = null;

  /**
   * Getter for commonConfigs.
   * Configurations that are applied to every application in the service.
   **/
  @JsonProperty("commonConfigs")
  public ApplicationConfigResp getCommonConfigs() {
    return commonConfigs;
  }

  /**
   * Setter for commonConfigs.
   * Configurations that are applied to every application in the service.
   **/
  public void setCommonConfigs(ApplicationConfigResp commonConfigs) {
    this.commonConfigs = commonConfigs;
  }

  /**
   * Getter for applicationConfigs.
   * Application specific configurations.
   **/
  @JsonProperty("applicationConfigs")
  public Map<String, ApplicationConfigResp> getApplicationConfigs() {
    return applicationConfigs;
  }

  /**
   * Setter for applicationConfigs.
   * Application specific configurations.
   **/
  public void setApplicationConfigs(Map<String, ApplicationConfigResp> applicationConfigs) {
    this.applicationConfigs = applicationConfigs;
  }

  /**
   * Getter for ldapGroups.
   * List of LDAP Groupnames to be enabled for auth.
   **/
  @JsonProperty("ldapGroups")
  public List<String> getLdapGroups() {
    return ldapGroups;
  }

  /**
   * Setter for ldapGroups.
   * List of LDAP Groupnames to be enabled for auth.
   **/
  public void setLdapGroups(List<String> ldapGroups) {
    this.ldapGroups = ldapGroups;
  }

  /**
   * Getter for enableSSO.
   * Should SSO be enabled for this VW. This cannot be changed later.
   **/
  @JsonProperty("enableSSO")
  public Boolean getEnableSSO() {
    return enableSSO;
  }

  /**
   * Setter for enableSSO.
   * Should SSO be enabled for this VW. This cannot be changed later.
   **/
  public void setEnableSSO(Boolean enableSSO) {
    this.enableSSO = enableSSO;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceConfigResp serviceConfigResp = (ServiceConfigResp) o;
    if (!Objects.equals(this.commonConfigs, serviceConfigResp.commonConfigs)) {
      return false;
    }
    if (!Objects.equals(this.applicationConfigs, serviceConfigResp.applicationConfigs)) {
      return false;
    }
    if (!Objects.equals(this.ldapGroups, serviceConfigResp.ldapGroups)) {
      return false;
    }
    if (!Objects.equals(this.enableSSO, serviceConfigResp.enableSSO)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonConfigs, applicationConfigs, ldapGroups, enableSSO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceConfigResp {\n");
    sb.append("    commonConfigs: ").append(toIndentedString(commonConfigs)).append("\n");
    sb.append("    applicationConfigs: ").append(toIndentedString(applicationConfigs)).append("\n");
    sb.append("    ldapGroups: ").append(toIndentedString(ldapGroups)).append("\n");
    sb.append("    enableSSO: ").append(toIndentedString(enableSSO)).append("\n");
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

