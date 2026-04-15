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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dfworkload.model.ConfiguredKpi;
import com.cloudera.cdp.dfworkload.model.FlowParameterGroup;
import java.util.*;

/**
 * Provides all of the configuration that dictates how a flow is deployed.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:54.268-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class RpcDeployedFlowConfiguration  {

  /**
   * The version of this configuration.
   **/
  private Integer configurationVersion = null;

  /**
   * The id of the deployed flow.
   **/
  private String deployedFlowId = null;

  /**
   * The name of the deployed flow.
   **/
  private String deployedFlowName = null;

  /**
   * The CRN of the deployed flow.
   **/
  private String deployedFlowCrn = null;

  /**
   * Indicates whether or not all current parameter values have successfully been applied to NiFi.
   **/
  private Boolean parametersDirty = null;

  /**
   * Indicates whether or not the current KPIs have successfully been deployed as alert rules.
   **/
  private Boolean kpisDirty = null;

  /**
   * The username of the last person to update the deployed flow configuration.
   **/
  private String lastUpdatedByUsername = null;

  /**
   * The list of flow parameter groups.
   **/
  private List<FlowParameterGroup> parameterGroups = new ArrayList<FlowParameterGroup>();

  /**
   * The list of configured KPIs.
   **/
  private List<ConfiguredKpi> kpis = new ArrayList<ConfiguredKpi>();

  /**
   * Getter for configurationVersion.
   * The version of this configuration.
   **/
  @JsonProperty("configurationVersion")
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }

  /**
   * Setter for configurationVersion.
   * The version of this configuration.
   **/
  public void setConfigurationVersion(Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  /**
   * Getter for deployedFlowId.
   * The id of the deployed flow.
   **/
  @JsonProperty("deployedFlowId")
  public String getDeployedFlowId() {
    return deployedFlowId;
  }

  /**
   * Setter for deployedFlowId.
   * The id of the deployed flow.
   **/
  public void setDeployedFlowId(String deployedFlowId) {
    this.deployedFlowId = deployedFlowId;
  }

  /**
   * Getter for deployedFlowName.
   * The name of the deployed flow.
   **/
  @JsonProperty("deployedFlowName")
  public String getDeployedFlowName() {
    return deployedFlowName;
  }

  /**
   * Setter for deployedFlowName.
   * The name of the deployed flow.
   **/
  public void setDeployedFlowName(String deployedFlowName) {
    this.deployedFlowName = deployedFlowName;
  }

  /**
   * Getter for deployedFlowCrn.
   * The CRN of the deployed flow.
   **/
  @JsonProperty("deployedFlowCrn")
  public String getDeployedFlowCrn() {
    return deployedFlowCrn;
  }

  /**
   * Setter for deployedFlowCrn.
   * The CRN of the deployed flow.
   **/
  public void setDeployedFlowCrn(String deployedFlowCrn) {
    this.deployedFlowCrn = deployedFlowCrn;
  }

  /**
   * Getter for parametersDirty.
   * Indicates whether or not all current parameter values have successfully been applied to NiFi.
   **/
  @JsonProperty("parametersDirty")
  public Boolean getParametersDirty() {
    return parametersDirty;
  }

  /**
   * Setter for parametersDirty.
   * Indicates whether or not all current parameter values have successfully been applied to NiFi.
   **/
  public void setParametersDirty(Boolean parametersDirty) {
    this.parametersDirty = parametersDirty;
  }

  /**
   * Getter for kpisDirty.
   * Indicates whether or not the current KPIs have successfully been deployed as alert rules.
   **/
  @JsonProperty("kpisDirty")
  public Boolean getKpisDirty() {
    return kpisDirty;
  }

  /**
   * Setter for kpisDirty.
   * Indicates whether or not the current KPIs have successfully been deployed as alert rules.
   **/
  public void setKpisDirty(Boolean kpisDirty) {
    this.kpisDirty = kpisDirty;
  }

  /**
   * Getter for lastUpdatedByUsername.
   * The username of the last person to update the deployed flow configuration.
   **/
  @JsonProperty("lastUpdatedByUsername")
  public String getLastUpdatedByUsername() {
    return lastUpdatedByUsername;
  }

  /**
   * Setter for lastUpdatedByUsername.
   * The username of the last person to update the deployed flow configuration.
   **/
  public void setLastUpdatedByUsername(String lastUpdatedByUsername) {
    this.lastUpdatedByUsername = lastUpdatedByUsername;
  }

  /**
   * Getter for parameterGroups.
   * The list of flow parameter groups.
   **/
  @JsonProperty("parameterGroups")
  public List<FlowParameterGroup> getParameterGroups() {
    return parameterGroups;
  }

  /**
   * Setter for parameterGroups.
   * The list of flow parameter groups.
   **/
  public void setParameterGroups(List<FlowParameterGroup> parameterGroups) {
    this.parameterGroups = parameterGroups;
  }

  /**
   * Getter for kpis.
   * The list of configured KPIs.
   **/
  @JsonProperty("kpis")
  public List<ConfiguredKpi> getKpis() {
    return kpis;
  }

  /**
   * Setter for kpis.
   * The list of configured KPIs.
   **/
  public void setKpis(List<ConfiguredKpi> kpis) {
    this.kpis = kpis;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcDeployedFlowConfiguration rpcDeployedFlowConfiguration = (RpcDeployedFlowConfiguration) o;
    if (!Objects.equals(this.configurationVersion, rpcDeployedFlowConfiguration.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.deployedFlowId, rpcDeployedFlowConfiguration.deployedFlowId)) {
      return false;
    }
    if (!Objects.equals(this.deployedFlowName, rpcDeployedFlowConfiguration.deployedFlowName)) {
      return false;
    }
    if (!Objects.equals(this.deployedFlowCrn, rpcDeployedFlowConfiguration.deployedFlowCrn)) {
      return false;
    }
    if (!Objects.equals(this.parametersDirty, rpcDeployedFlowConfiguration.parametersDirty)) {
      return false;
    }
    if (!Objects.equals(this.kpisDirty, rpcDeployedFlowConfiguration.kpisDirty)) {
      return false;
    }
    if (!Objects.equals(this.lastUpdatedByUsername, rpcDeployedFlowConfiguration.lastUpdatedByUsername)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, rpcDeployedFlowConfiguration.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.kpis, rpcDeployedFlowConfiguration.kpis)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationVersion, deployedFlowId, deployedFlowName, deployedFlowCrn, parametersDirty, kpisDirty, lastUpdatedByUsername, parameterGroups, kpis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcDeployedFlowConfiguration {\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    deployedFlowId: ").append(toIndentedString(deployedFlowId)).append("\n");
    sb.append("    deployedFlowName: ").append(toIndentedString(deployedFlowName)).append("\n");
    sb.append("    deployedFlowCrn: ").append(toIndentedString(deployedFlowCrn)).append("\n");
    sb.append("    parametersDirty: ").append(toIndentedString(parametersDirty)).append("\n");
    sb.append("    kpisDirty: ").append(toIndentedString(kpisDirty)).append("\n");
    sb.append("    lastUpdatedByUsername: ").append(toIndentedString(lastUpdatedByUsername)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
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

