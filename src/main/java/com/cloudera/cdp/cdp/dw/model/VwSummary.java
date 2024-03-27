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
import com.cloudera.cdp.dw.model.ActorResponse;
import com.cloudera.cdp.dw.model.AutoscalingOptionsResponse;
import com.cloudera.cdp.dw.model.ImpalaHASettingsOptionsResponse;
import com.cloudera.cdp.dw.model.ImpalaOptionsResponse;
import com.cloudera.cdp.dw.model.QueryIsolationOptionsResponse;
import com.cloudera.cdp.dw.model.ReplicaStatus;
import com.cloudera.cdp.dw.model.TagResponse;
import com.cloudera.cdp.dw.model.VwSummaryEndpoints;
import com.cloudera.cdp.dw.model.VwSummaryJwtAuth;
import com.cloudera.cdp.dw.model.VwSummarySupportedAuthMethods;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * A Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-27T12:18:18.356-07:00")
public class VwSummary  {

  /**
   * The CRN of the Virtual Warehouse.
   **/
  private String crn = null;

  /**
   * The ID of the Virtual Warehouse.
   **/
  private String id = null;

  /**
   * The name of the Virtual Warehouse.
   **/
  private String name = null;

  /**
   * The type of the Virtual Warehouse.
   **/
  private String vwType = null;

  /**
   * ID of Database Catalog that the Virtual Warehouse is attached to.
   **/
  private String dbcId = null;

  /**
   * Status of the Virtual Warehouse. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  private String status = null;

  /**
   * Timestamp of the last status change of the Virtual Warehouse.
   **/
  private ZonedDateTime statusChangedAt = null;

  /**
   * The creator of the Virtual Warehouse.
   **/
  private ActorResponse creator = null;

  /**
   * Creation date of Virtual Warehouse.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * ID of the configuration.
   **/
  private String configId = null;

  /**
   * CDH image version.
   **/
  private String cdhVersion = null;

  /**
   * Number of cores of the Virtual Warehouse.
   **/
  private Integer numOfCores = null;

  /**
   * Memory size of the Virtual Warehouse in MB.
   **/
  private Integer memoryCapacity = null;

  /**
   * Size of the Virtual Warehouse (node count per compute cluster).
   **/
  private Integer nodeCount = null;

  /**
   * Availability zone in which the Virtual Warehouse is running.
   **/
  private String availabilityZone = null;

  /**
   * 
   **/
  private VwSummaryEndpoints endpoints = null;

  /**
   * 
   **/
  private VwSummarySupportedAuthMethods supportedAuthMethods = null;

  /**
   * 
   **/
  private VwSummaryJwtAuth jwtAuth = null;

  /**
   * Tags associated with the resources.
   **/
  private List<TagResponse> tags = new ArrayList<TagResponse>();

  /**
   * Denotes whether the Hive Virtual Warehouse is a compactor or not.
   **/
  private Boolean compactor = null;

  /**
   * Denotes whether the Virtual Warehouse has Data Visualisation or not.
   **/
  private Boolean viz = null;

  /**
   * Denotes whether the Unified Analytics is enabled.
   **/
  private Boolean enableUnifiedAnalytics = null;

  /**
   * The current settings stored for autoscaling.
   **/
  private AutoscalingOptionsResponse autoscalingOptions = null;

  /**
   * Current Impala settings.
   **/
  private ImpalaOptionsResponse impalaOptions = null;

  /**
   * Current Impala High Availability settings.
   **/
  private ImpalaHASettingsOptionsResponse impalaHaSettingsOptions = null;

  /**
   * The current settings stored for query-isolation.
   **/
  private QueryIsolationOptionsResponse queryIsolationOptions = null;

  /**
   * Status information on the current state of replicas in the virtual warehouse.
   **/
  private ReplicaStatus replicaStatus = null;

  /**
   * The name of the Resource Pool the Virtual Warehouse is in.
   **/
  private String resourcePool = null;

  /**
   * DEPRECATED - Authentication mode used by Hive Server: * `LDAP` * `KERBEROS`
   **/
  private String hiveAuthenticationMode = null;

  /**
   * Getter for crn.
   * The CRN of the Virtual Warehouse.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the Virtual Warehouse.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for id.
   * The ID of the Virtual Warehouse.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the Virtual Warehouse.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * The name of the Virtual Warehouse.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the Virtual Warehouse.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for vwType.
   * The type of the Virtual Warehouse.
   **/
  @JsonProperty("vwType")
  public String getVwType() {
    return vwType;
  }

  /**
   * Setter for vwType.
   * The type of the Virtual Warehouse.
   **/
  public void setVwType(String vwType) {
    this.vwType = vwType;
  }

  /**
   * Getter for dbcId.
   * ID of Database Catalog that the Virtual Warehouse is attached to.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * ID of Database Catalog that the Virtual Warehouse is attached to.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for status.
   * Status of the Virtual Warehouse. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the Virtual Warehouse. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for statusChangedAt.
   * Timestamp of the last status change of the Virtual Warehouse.
   **/
  @JsonProperty("statusChangedAt")
  public ZonedDateTime getStatusChangedAt() {
    return statusChangedAt;
  }

  /**
   * Setter for statusChangedAt.
   * Timestamp of the last status change of the Virtual Warehouse.
   **/
  public void setStatusChangedAt(ZonedDateTime statusChangedAt) {
    this.statusChangedAt = statusChangedAt;
  }

  /**
   * Getter for creator.
   * The creator of the Virtual Warehouse.
   **/
  @JsonProperty("creator")
  public ActorResponse getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The creator of the Virtual Warehouse.
   **/
  public void setCreator(ActorResponse creator) {
    this.creator = creator;
  }

  /**
   * Getter for creationDate.
   * Creation date of Virtual Warehouse.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of Virtual Warehouse.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for configId.
   * ID of the configuration.
   **/
  @JsonProperty("configId")
  public String getConfigId() {
    return configId;
  }

  /**
   * Setter for configId.
   * ID of the configuration.
   **/
  public void setConfigId(String configId) {
    this.configId = configId;
  }

  /**
   * Getter for cdhVersion.
   * CDH image version.
   **/
  @JsonProperty("cdhVersion")
  public String getCdhVersion() {
    return cdhVersion;
  }

  /**
   * Setter for cdhVersion.
   * CDH image version.
   **/
  public void setCdhVersion(String cdhVersion) {
    this.cdhVersion = cdhVersion;
  }

  /**
   * Getter for numOfCores.
   * Number of cores of the Virtual Warehouse.
   **/
  @JsonProperty("numOfCores")
  public Integer getNumOfCores() {
    return numOfCores;
  }

  /**
   * Setter for numOfCores.
   * Number of cores of the Virtual Warehouse.
   **/
  public void setNumOfCores(Integer numOfCores) {
    this.numOfCores = numOfCores;
  }

  /**
   * Getter for memoryCapacity.
   * Memory size of the Virtual Warehouse in MB.
   **/
  @JsonProperty("memoryCapacity")
  public Integer getMemoryCapacity() {
    return memoryCapacity;
  }

  /**
   * Setter for memoryCapacity.
   * Memory size of the Virtual Warehouse in MB.
   **/
  public void setMemoryCapacity(Integer memoryCapacity) {
    this.memoryCapacity = memoryCapacity;
  }

  /**
   * Getter for nodeCount.
   * Size of the Virtual Warehouse (node count per compute cluster).
   **/
  @JsonProperty("nodeCount")
  public Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Setter for nodeCount.
   * Size of the Virtual Warehouse (node count per compute cluster).
   **/
  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }

  /**
   * Getter for availabilityZone.
   * Availability zone in which the Virtual Warehouse is running.
   **/
  @JsonProperty("availabilityZone")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * Setter for availabilityZone.
   * Availability zone in which the Virtual Warehouse is running.
   **/
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * Getter for endpoints.
   * 
   **/
  @JsonProperty("endpoints")
  public VwSummaryEndpoints getEndpoints() {
    return endpoints;
  }

  /**
   * Setter for endpoints.
   * 
   **/
  public void setEndpoints(VwSummaryEndpoints endpoints) {
    this.endpoints = endpoints;
  }

  /**
   * Getter for supportedAuthMethods.
   * 
   **/
  @JsonProperty("supportedAuthMethods")
  public VwSummarySupportedAuthMethods getSupportedAuthMethods() {
    return supportedAuthMethods;
  }

  /**
   * Setter for supportedAuthMethods.
   * 
   **/
  public void setSupportedAuthMethods(VwSummarySupportedAuthMethods supportedAuthMethods) {
    this.supportedAuthMethods = supportedAuthMethods;
  }

  /**
   * Getter for jwtAuth.
   * 
   **/
  @JsonProperty("jwtAuth")
  public VwSummaryJwtAuth getJwtAuth() {
    return jwtAuth;
  }

  /**
   * Setter for jwtAuth.
   * 
   **/
  public void setJwtAuth(VwSummaryJwtAuth jwtAuth) {
    this.jwtAuth = jwtAuth;
  }

  /**
   * Getter for tags.
   * Tags associated with the resources.
   **/
  @JsonProperty("tags")
  public List<TagResponse> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags associated with the resources.
   **/
  public void setTags(List<TagResponse> tags) {
    this.tags = tags;
  }

  /**
   * Getter for compactor.
   * Denotes whether the Hive Virtual Warehouse is a compactor or not.
   **/
  @JsonProperty("compactor")
  public Boolean getCompactor() {
    return compactor;
  }

  /**
   * Setter for compactor.
   * Denotes whether the Hive Virtual Warehouse is a compactor or not.
   **/
  public void setCompactor(Boolean compactor) {
    this.compactor = compactor;
  }

  /**
   * Getter for viz.
   * Denotes whether the Virtual Warehouse has Data Visualisation or not.
   **/
  @JsonProperty("viz")
  public Boolean getViz() {
    return viz;
  }

  /**
   * Setter for viz.
   * Denotes whether the Virtual Warehouse has Data Visualisation or not.
   **/
  public void setViz(Boolean viz) {
    this.viz = viz;
  }

  /**
   * Getter for enableUnifiedAnalytics.
   * Denotes whether the Unified Analytics is enabled.
   **/
  @JsonProperty("enableUnifiedAnalytics")
  public Boolean getEnableUnifiedAnalytics() {
    return enableUnifiedAnalytics;
  }

  /**
   * Setter for enableUnifiedAnalytics.
   * Denotes whether the Unified Analytics is enabled.
   **/
  public void setEnableUnifiedAnalytics(Boolean enableUnifiedAnalytics) {
    this.enableUnifiedAnalytics = enableUnifiedAnalytics;
  }

  /**
   * Getter for autoscalingOptions.
   * The current settings stored for autoscaling.
   **/
  @JsonProperty("autoscalingOptions")
  public AutoscalingOptionsResponse getAutoscalingOptions() {
    return autoscalingOptions;
  }

  /**
   * Setter for autoscalingOptions.
   * The current settings stored for autoscaling.
   **/
  public void setAutoscalingOptions(AutoscalingOptionsResponse autoscalingOptions) {
    this.autoscalingOptions = autoscalingOptions;
  }

  /**
   * Getter for impalaOptions.
   * Current Impala settings.
   **/
  @JsonProperty("impalaOptions")
  public ImpalaOptionsResponse getImpalaOptions() {
    return impalaOptions;
  }

  /**
   * Setter for impalaOptions.
   * Current Impala settings.
   **/
  public void setImpalaOptions(ImpalaOptionsResponse impalaOptions) {
    this.impalaOptions = impalaOptions;
  }

  /**
   * Getter for impalaHaSettingsOptions.
   * Current Impala High Availability settings.
   **/
  @JsonProperty("impalaHaSettingsOptions")
  public ImpalaHASettingsOptionsResponse getImpalaHaSettingsOptions() {
    return impalaHaSettingsOptions;
  }

  /**
   * Setter for impalaHaSettingsOptions.
   * Current Impala High Availability settings.
   **/
  public void setImpalaHaSettingsOptions(ImpalaHASettingsOptionsResponse impalaHaSettingsOptions) {
    this.impalaHaSettingsOptions = impalaHaSettingsOptions;
  }

  /**
   * Getter for queryIsolationOptions.
   * The current settings stored for query-isolation.
   **/
  @JsonProperty("queryIsolationOptions")
  public QueryIsolationOptionsResponse getQueryIsolationOptions() {
    return queryIsolationOptions;
  }

  /**
   * Setter for queryIsolationOptions.
   * The current settings stored for query-isolation.
   **/
  public void setQueryIsolationOptions(QueryIsolationOptionsResponse queryIsolationOptions) {
    this.queryIsolationOptions = queryIsolationOptions;
  }

  /**
   * Getter for replicaStatus.
   * Status information on the current state of replicas in the virtual warehouse.
   **/
  @JsonProperty("replicaStatus")
  public ReplicaStatus getReplicaStatus() {
    return replicaStatus;
  }

  /**
   * Setter for replicaStatus.
   * Status information on the current state of replicas in the virtual warehouse.
   **/
  public void setReplicaStatus(ReplicaStatus replicaStatus) {
    this.replicaStatus = replicaStatus;
  }

  /**
   * Getter for resourcePool.
   * The name of the Resource Pool the Virtual Warehouse is in.
   **/
  @JsonProperty("resourcePool")
  public String getResourcePool() {
    return resourcePool;
  }

  /**
   * Setter for resourcePool.
   * The name of the Resource Pool the Virtual Warehouse is in.
   **/
  public void setResourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
  }

  /**
   * Getter for hiveAuthenticationMode.
   * DEPRECATED - Authentication mode used by Hive Server: * &#x60;LDAP&#x60; * &#x60;KERBEROS&#x60;
   **/
  @Deprecated
  @JsonProperty("hiveAuthenticationMode")
  public String getHiveAuthenticationMode() {
    return hiveAuthenticationMode;
  }

  /**
   * Setter for hiveAuthenticationMode.
   * DEPRECATED - Authentication mode used by Hive Server: * &#x60;LDAP&#x60; * &#x60;KERBEROS&#x60;
   **/
  @Deprecated
  public void setHiveAuthenticationMode(String hiveAuthenticationMode) {
    this.hiveAuthenticationMode = hiveAuthenticationMode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VwSummary vwSummary = (VwSummary) o;
    if (!Objects.equals(this.crn, vwSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.id, vwSummary.id)) {
      return false;
    }
    if (!Objects.equals(this.name, vwSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.vwType, vwSummary.vwType)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, vwSummary.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.status, vwSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.statusChangedAt, vwSummary.statusChangedAt)) {
      return false;
    }
    if (!Objects.equals(this.creator, vwSummary.creator)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, vwSummary.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.configId, vwSummary.configId)) {
      return false;
    }
    if (!Objects.equals(this.cdhVersion, vwSummary.cdhVersion)) {
      return false;
    }
    if (!Objects.equals(this.numOfCores, vwSummary.numOfCores)) {
      return false;
    }
    if (!Objects.equals(this.memoryCapacity, vwSummary.memoryCapacity)) {
      return false;
    }
    if (!Objects.equals(this.nodeCount, vwSummary.nodeCount)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZone, vwSummary.availabilityZone)) {
      return false;
    }
    if (!Objects.equals(this.endpoints, vwSummary.endpoints)) {
      return false;
    }
    if (!Objects.equals(this.supportedAuthMethods, vwSummary.supportedAuthMethods)) {
      return false;
    }
    if (!Objects.equals(this.jwtAuth, vwSummary.jwtAuth)) {
      return false;
    }
    if (!Objects.equals(this.tags, vwSummary.tags)) {
      return false;
    }
    if (!Objects.equals(this.compactor, vwSummary.compactor)) {
      return false;
    }
    if (!Objects.equals(this.viz, vwSummary.viz)) {
      return false;
    }
    if (!Objects.equals(this.enableUnifiedAnalytics, vwSummary.enableUnifiedAnalytics)) {
      return false;
    }
    if (!Objects.equals(this.autoscalingOptions, vwSummary.autoscalingOptions)) {
      return false;
    }
    if (!Objects.equals(this.impalaOptions, vwSummary.impalaOptions)) {
      return false;
    }
    if (!Objects.equals(this.impalaHaSettingsOptions, vwSummary.impalaHaSettingsOptions)) {
      return false;
    }
    if (!Objects.equals(this.queryIsolationOptions, vwSummary.queryIsolationOptions)) {
      return false;
    }
    if (!Objects.equals(this.replicaStatus, vwSummary.replicaStatus)) {
      return false;
    }
    if (!Objects.equals(this.resourcePool, vwSummary.resourcePool)) {
      return false;
    }
    if (!Objects.equals(this.hiveAuthenticationMode, vwSummary.hiveAuthenticationMode)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, id, name, vwType, dbcId, status, statusChangedAt, creator, creationDate, configId, cdhVersion, numOfCores, memoryCapacity, nodeCount, availabilityZone, endpoints, supportedAuthMethods, jwtAuth, tags, compactor, viz, enableUnifiedAnalytics, autoscalingOptions, impalaOptions, impalaHaSettingsOptions, queryIsolationOptions, replicaStatus, resourcePool, hiveAuthenticationMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VwSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vwType: ").append(toIndentedString(vwType)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedAt: ").append(toIndentedString(statusChangedAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    cdhVersion: ").append(toIndentedString(cdhVersion)).append("\n");
    sb.append("    numOfCores: ").append(toIndentedString(numOfCores)).append("\n");
    sb.append("    memoryCapacity: ").append(toIndentedString(memoryCapacity)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    supportedAuthMethods: ").append(toIndentedString(supportedAuthMethods)).append("\n");
    sb.append("    jwtAuth: ").append(toIndentedString(jwtAuth)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    compactor: ").append(toIndentedString(compactor)).append("\n");
    sb.append("    viz: ").append(toIndentedString(viz)).append("\n");
    sb.append("    enableUnifiedAnalytics: ").append(toIndentedString(enableUnifiedAnalytics)).append("\n");
    sb.append("    autoscalingOptions: ").append(toIndentedString(autoscalingOptions)).append("\n");
    sb.append("    impalaOptions: ").append(toIndentedString(impalaOptions)).append("\n");
    sb.append("    impalaHaSettingsOptions: ").append(toIndentedString(impalaHaSettingsOptions)).append("\n");
    sb.append("    queryIsolationOptions: ").append(toIndentedString(queryIsolationOptions)).append("\n");
    sb.append("    replicaStatus: ").append(toIndentedString(replicaStatus)).append("\n");
    sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
    sb.append("    hiveAuthenticationMode: ").append(toIndentedString(hiveAuthenticationMode)).append("\n");
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

