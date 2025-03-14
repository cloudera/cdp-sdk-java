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
import com.cloudera.cdp.dw.model.AutoscalingOptionsUpdateRequest;
import com.cloudera.cdp.dw.model.ImpalaHASettingsUpdateRequest;
import com.cloudera.cdp.dw.model.QueryIsolationOptionsRequest;
import com.cloudera.cdp.dw.model.ServiceConfigReq;

/**
 * Request object for the updateVw method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:44.548-07:00")
public class UpdateVwRequest  {

  /**
   * ID of the Virtual Warehouse's cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Virtual Warehouse.
   **/
  private String vwId = null;

  /**
   * Name of T-shirt size to use, which will determine the number of nodes.
   **/
  private String tShirtSize = null;

  /**
   * Nodes per compute cluster. If specified, forces 'template' to be 'custom'
   **/
  private Integer nodeCount = 0;

  /**
   * The service configuration to update the VW with. This will be applied on top of the existing configuration so there's no need to list configurations that stay the same.
   **/
  private ServiceConfigReq config = null;

  /**
   * Autoscaling settings for the Virtual Warehouse.
   **/
  private AutoscalingOptionsUpdateRequest autoscaling = null;

  /**
   * High Availability settings update for the Impala Virtual Warehouse.
   **/
  private ImpalaHASettingsUpdateRequest impalaHaSettings = null;

  /**
   * Query isolation settings for Hive Virtual Warehouses.
   **/
  private QueryIsolationOptionsRequest queryIsolationOptions = null;

  /**
   * DEPRECATED - Sets the authentication mode to use by Hive Server: * `LDAP` * `KERBEROS` If not set then the authentication mode will not be changed during update.
   **/
  private String hiveAuthenticationMode = null;

  /**
   * Value of 'true' automatically configures the Virtual Warehouse to support JWTs issues by the CDP JWT token provider.  Value of 'false' does not enable JWT auth on the Virtual Warehouse.  If this field is not specified, it defaults to 'false'.
   **/
  private Boolean platformJwtAuth = null;

  /**
   * Denotes whether the Virtual Warehouse has the Impala Query Log enabled or not.
   **/
  private Boolean impalaQueryLog = null;

  /**
   * Used to set the resource pool of the Virtual Warehouses that are not enrolled for quota management.
   **/
  private String resourcePool = null;

  /**
   * If specified, modifies Hive Server High Availability mode in Private Cloud: * `DISABLED` - Disables Hive Server high availability. * `ACTIVE_PASSIVE` - Runs two Hive Server instances, one active and one passive. Hive session failover is not supported in this setup.
   **/
  private String hiveServerHaMode = null;

  /**
   * Getter for clusterId.
   * ID of the Virtual Warehouse&#39;s cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of the Virtual Warehouse&#39;s cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for vwId.
   * ID of the Virtual Warehouse.
   **/
  @JsonProperty("vwId")
  public String getVwId() {
    return vwId;
  }

  /**
   * Setter for vwId.
   * ID of the Virtual Warehouse.
   **/
  public void setVwId(String vwId) {
    this.vwId = vwId;
  }

  /**
   * Getter for tShirtSize.
   * Name of T-shirt size to use, which will determine the number of nodes.
   **/
  @JsonProperty("tShirtSize")
  public String getTShirtSize() {
    return tShirtSize;
  }

  /**
   * Setter for tShirtSize.
   * Name of T-shirt size to use, which will determine the number of nodes.
   **/
  public void setTShirtSize(String tShirtSize) {
    this.tShirtSize = tShirtSize;
  }

  /**
   * Getter for nodeCount.
   * Nodes per compute cluster. If specified, forces &#39;template&#39; to be &#39;custom&#39;
   **/
  @JsonProperty("nodeCount")
  public Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Setter for nodeCount.
   * Nodes per compute cluster. If specified, forces &#39;template&#39; to be &#39;custom&#39;
   **/
  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }

  /**
   * Getter for config.
   * The service configuration to update the VW with. This will be applied on top of the existing configuration so there&#39;s no need to list configurations that stay the same.
   **/
  @JsonProperty("config")
  public ServiceConfigReq getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * The service configuration to update the VW with. This will be applied on top of the existing configuration so there&#39;s no need to list configurations that stay the same.
   **/
  public void setConfig(ServiceConfigReq config) {
    this.config = config;
  }

  /**
   * Getter for autoscaling.
   * Autoscaling settings for the Virtual Warehouse.
   **/
  @JsonProperty("autoscaling")
  public AutoscalingOptionsUpdateRequest getAutoscaling() {
    return autoscaling;
  }

  /**
   * Setter for autoscaling.
   * Autoscaling settings for the Virtual Warehouse.
   **/
  public void setAutoscaling(AutoscalingOptionsUpdateRequest autoscaling) {
    this.autoscaling = autoscaling;
  }

  /**
   * Getter for impalaHaSettings.
   * High Availability settings update for the Impala Virtual Warehouse.
   **/
  @JsonProperty("impalaHaSettings")
  public ImpalaHASettingsUpdateRequest getImpalaHaSettings() {
    return impalaHaSettings;
  }

  /**
   * Setter for impalaHaSettings.
   * High Availability settings update for the Impala Virtual Warehouse.
   **/
  public void setImpalaHaSettings(ImpalaHASettingsUpdateRequest impalaHaSettings) {
    this.impalaHaSettings = impalaHaSettings;
  }

  /**
   * Getter for queryIsolationOptions.
   * Query isolation settings for Hive Virtual Warehouses.
   **/
  @JsonProperty("queryIsolationOptions")
  public QueryIsolationOptionsRequest getQueryIsolationOptions() {
    return queryIsolationOptions;
  }

  /**
   * Setter for queryIsolationOptions.
   * Query isolation settings for Hive Virtual Warehouses.
   **/
  public void setQueryIsolationOptions(QueryIsolationOptionsRequest queryIsolationOptions) {
    this.queryIsolationOptions = queryIsolationOptions;
  }

  /**
   * Getter for hiveAuthenticationMode.
   * DEPRECATED - Sets the authentication mode to use by Hive Server: * &#x60;LDAP&#x60; * &#x60;KERBEROS&#x60; If not set then the authentication mode will not be changed during update.
   **/
  @Deprecated
  @JsonProperty("hiveAuthenticationMode")
  public String getHiveAuthenticationMode() {
    return hiveAuthenticationMode;
  }

  /**
   * Setter for hiveAuthenticationMode.
   * DEPRECATED - Sets the authentication mode to use by Hive Server: * &#x60;LDAP&#x60; * &#x60;KERBEROS&#x60; If not set then the authentication mode will not be changed during update.
   **/
  @Deprecated
  public void setHiveAuthenticationMode(String hiveAuthenticationMode) {
    this.hiveAuthenticationMode = hiveAuthenticationMode;
  }

  /**
   * Getter for platformJwtAuth.
   * Value of &#39;true&#39; automatically configures the Virtual Warehouse to support JWTs issues by the CDP JWT token provider.  Value of &#39;false&#39; does not enable JWT auth on the Virtual Warehouse.  If this field is not specified, it defaults to &#39;false&#39;.
   **/
  @JsonProperty("platformJwtAuth")
  public Boolean getPlatformJwtAuth() {
    return platformJwtAuth;
  }

  /**
   * Setter for platformJwtAuth.
   * Value of &#39;true&#39; automatically configures the Virtual Warehouse to support JWTs issues by the CDP JWT token provider.  Value of &#39;false&#39; does not enable JWT auth on the Virtual Warehouse.  If this field is not specified, it defaults to &#39;false&#39;.
   **/
  public void setPlatformJwtAuth(Boolean platformJwtAuth) {
    this.platformJwtAuth = platformJwtAuth;
  }

  /**
   * Getter for impalaQueryLog.
   * Denotes whether the Virtual Warehouse has the Impala Query Log enabled or not.
   **/
  @JsonProperty("impalaQueryLog")
  public Boolean getImpalaQueryLog() {
    return impalaQueryLog;
  }

  /**
   * Setter for impalaQueryLog.
   * Denotes whether the Virtual Warehouse has the Impala Query Log enabled or not.
   **/
  public void setImpalaQueryLog(Boolean impalaQueryLog) {
    this.impalaQueryLog = impalaQueryLog;
  }

  /**
   * Getter for resourcePool.
   * Used to set the resource pool of the Virtual Warehouses that are not enrolled for quota management.
   **/
  @JsonProperty("resourcePool")
  public String getResourcePool() {
    return resourcePool;
  }

  /**
   * Setter for resourcePool.
   * Used to set the resource pool of the Virtual Warehouses that are not enrolled for quota management.
   **/
  public void setResourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
  }

  /**
   * Getter for hiveServerHaMode.
   * If specified, modifies Hive Server High Availability mode in Private Cloud: * &#x60;DISABLED&#x60; - Disables Hive Server high availability. * &#x60;ACTIVE_PASSIVE&#x60; - Runs two Hive Server instances, one active and one passive. Hive session failover is not supported in this setup.
   **/
  @JsonProperty("hiveServerHaMode")
  public String getHiveServerHaMode() {
    return hiveServerHaMode;
  }

  /**
   * Setter for hiveServerHaMode.
   * If specified, modifies Hive Server High Availability mode in Private Cloud: * &#x60;DISABLED&#x60; - Disables Hive Server high availability. * &#x60;ACTIVE_PASSIVE&#x60; - Runs two Hive Server instances, one active and one passive. Hive session failover is not supported in this setup.
   **/
  public void setHiveServerHaMode(String hiveServerHaMode) {
    this.hiveServerHaMode = hiveServerHaMode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVwRequest updateVwRequest = (UpdateVwRequest) o;
    if (!Objects.equals(this.clusterId, updateVwRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.vwId, updateVwRequest.vwId)) {
      return false;
    }
    if (!Objects.equals(this.tShirtSize, updateVwRequest.tShirtSize)) {
      return false;
    }
    if (!Objects.equals(this.nodeCount, updateVwRequest.nodeCount)) {
      return false;
    }
    if (!Objects.equals(this.config, updateVwRequest.config)) {
      return false;
    }
    if (!Objects.equals(this.autoscaling, updateVwRequest.autoscaling)) {
      return false;
    }
    if (!Objects.equals(this.impalaHaSettings, updateVwRequest.impalaHaSettings)) {
      return false;
    }
    if (!Objects.equals(this.queryIsolationOptions, updateVwRequest.queryIsolationOptions)) {
      return false;
    }
    if (!Objects.equals(this.hiveAuthenticationMode, updateVwRequest.hiveAuthenticationMode)) {
      return false;
    }
    if (!Objects.equals(this.platformJwtAuth, updateVwRequest.platformJwtAuth)) {
      return false;
    }
    if (!Objects.equals(this.impalaQueryLog, updateVwRequest.impalaQueryLog)) {
      return false;
    }
    if (!Objects.equals(this.resourcePool, updateVwRequest.resourcePool)) {
      return false;
    }
    if (!Objects.equals(this.hiveServerHaMode, updateVwRequest.hiveServerHaMode)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, vwId, tShirtSize, nodeCount, config, autoscaling, impalaHaSettings, queryIsolationOptions, hiveAuthenticationMode, platformJwtAuth, impalaQueryLog, resourcePool, hiveServerHaMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVwRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    vwId: ").append(toIndentedString(vwId)).append("\n");
    sb.append("    tShirtSize: ").append(toIndentedString(tShirtSize)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
    sb.append("    impalaHaSettings: ").append(toIndentedString(impalaHaSettings)).append("\n");
    sb.append("    queryIsolationOptions: ").append(toIndentedString(queryIsolationOptions)).append("\n");
    sb.append("    hiveAuthenticationMode: ").append(toIndentedString(hiveAuthenticationMode)).append("\n");
    sb.append("    platformJwtAuth: ").append(toIndentedString(platformJwtAuth)).append("\n");
    sb.append("    impalaQueryLog: ").append(toIndentedString(impalaQueryLog)).append("\n");
    sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
    sb.append("    hiveServerHaMode: ").append(toIndentedString(hiveServerHaMode)).append("\n");
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

