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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.de.model.AccessControlResponse;
import com.cloudera.cdp.de.model.ChartValueOverridesResponse;
import com.cloudera.cdp.de.model.SmtpConfigResponse;
import com.cloudera.cdp.de.model.VcResources;
import java.util.*;
import java.util.Map;

/**
 * CDE virtual cluster summary.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:28.775-07:00")
public class VcDescription  {

  /**
   * Virtual Cluster ID.
   **/
  private String vcId = null;

  /**
   * Name of the CDE Virtual Cluster.
   **/
  private String vcName = null;

  /**
   * Cluster ID of the CDE service that contains the Virtual Cluster.
   **/
  private String clusterId = null;

  /**
   * Status of the Virtual Cluster.
   **/
  private String status = null;

  /**
   * Resources details of CDE Service.
   **/
  private VcResources resources = null;

  /**
   * Email address of the creator of Virtual Cluster.
   **/
  private String creatorEmail = null;

  /**
   * ID of the creator of Virtual Cluster.
   **/
  private String creatorID = null;

  /**
   * Name of the creator of the Virtual Cluster.
   **/
  private String creatorName = null;

  /**
   * Url for the Virtual Cluster APIs.
   **/
  private String vcApiUrl = null;

  /**
   * URL of the CDE Virtual Cluster UI.
   **/
  private String vcUiUrl = null;

  /**
   * Spark History Server URL for the Virtual Cluster.
   **/
  private String historyServerUrl = null;

  /**
   * Livy Server URL for the Virtual Cluster.
   **/
  private String livyServerUrl = null;

  /**
   * Safari URL for the Virtual Cluster.
   **/
  private String safariUrl = null;

  /**
   * Time of creation of the virtual Cluster.
   **/
  private String creationTime = null;

  /**
   * Spark version for the virtual cluster.
   **/
  private String sparkVersion = null;

  /**
   * Chart overrides for the Virtual Cluster.
   **/
  private List<ChartValueOverridesResponse> chartValueOverrides = new ArrayList<ChartValueOverridesResponse>();

  /**
   * Access control object for the Virtual Cluster.
   **/
  private AccessControlResponse accessControl = null;

  /**
   * SMTP Configurations for Airflow Email Alerts.
   **/
  private SmtpConfigResponse smtpConfig = null;

  /**
   * Tier of the Virtual Cluster.
   **/
  private String vcTier = null;

  /**
   * Default timeout for Sessions.
   **/
  private String sessionTimeout = null;

  /**
   * Spark configs that will be applied to all the spark jobs inside a virtual cluster.
   **/
  private Map<String, String> sparkConfigs = new HashMap<String, String>();

  /**
   * Getter for vcId.
   * Virtual Cluster ID.
   **/
  @JsonProperty("vcId")
  public String getVcId() {
    return vcId;
  }

  /**
   * Setter for vcId.
   * Virtual Cluster ID.
   **/
  public void setVcId(String vcId) {
    this.vcId = vcId;
  }

  /**
   * Getter for vcName.
   * Name of the CDE Virtual Cluster.
   **/
  @JsonProperty("vcName")
  public String getVcName() {
    return vcName;
  }

  /**
   * Setter for vcName.
   * Name of the CDE Virtual Cluster.
   **/
  public void setVcName(String vcName) {
    this.vcName = vcName;
  }

  /**
   * Getter for clusterId.
   * Cluster ID of the CDE service that contains the Virtual Cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster ID of the CDE service that contains the Virtual Cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for status.
   * Status of the Virtual Cluster.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the Virtual Cluster.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for resources.
   * Resources details of CDE Service.
   **/
  @JsonProperty("resources")
  public VcResources getResources() {
    return resources;
  }

  /**
   * Setter for resources.
   * Resources details of CDE Service.
   **/
  public void setResources(VcResources resources) {
    this.resources = resources;
  }

  /**
   * Getter for creatorEmail.
   * Email address of the creator of Virtual Cluster.
   **/
  @JsonProperty("creatorEmail")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  /**
   * Setter for creatorEmail.
   * Email address of the creator of Virtual Cluster.
   **/
  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  /**
   * Getter for creatorID.
   * ID of the creator of Virtual Cluster.
   **/
  @JsonProperty("creatorID")
  public String getCreatorID() {
    return creatorID;
  }

  /**
   * Setter for creatorID.
   * ID of the creator of Virtual Cluster.
   **/
  public void setCreatorID(String creatorID) {
    this.creatorID = creatorID;
  }

  /**
   * Getter for creatorName.
   * Name of the creator of the Virtual Cluster.
   **/
  @JsonProperty("creatorName")
  public String getCreatorName() {
    return creatorName;
  }

  /**
   * Setter for creatorName.
   * Name of the creator of the Virtual Cluster.
   **/
  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }

  /**
   * Getter for vcApiUrl.
   * Url for the Virtual Cluster APIs.
   **/
  @JsonProperty("vcApiUrl")
  public String getVcApiUrl() {
    return vcApiUrl;
  }

  /**
   * Setter for vcApiUrl.
   * Url for the Virtual Cluster APIs.
   **/
  public void setVcApiUrl(String vcApiUrl) {
    this.vcApiUrl = vcApiUrl;
  }

  /**
   * Getter for vcUiUrl.
   * URL of the CDE Virtual Cluster UI.
   **/
  @JsonProperty("VcUiUrl")
  public String getVcUiUrl() {
    return vcUiUrl;
  }

  /**
   * Setter for vcUiUrl.
   * URL of the CDE Virtual Cluster UI.
   **/
  public void setVcUiUrl(String vcUiUrl) {
    this.vcUiUrl = vcUiUrl;
  }

  /**
   * Getter for historyServerUrl.
   * Spark History Server URL for the Virtual Cluster.
   **/
  @JsonProperty("historyServerUrl")
  public String getHistoryServerUrl() {
    return historyServerUrl;
  }

  /**
   * Setter for historyServerUrl.
   * Spark History Server URL for the Virtual Cluster.
   **/
  public void setHistoryServerUrl(String historyServerUrl) {
    this.historyServerUrl = historyServerUrl;
  }

  /**
   * Getter for livyServerUrl.
   * Livy Server URL for the Virtual Cluster.
   **/
  @JsonProperty("livyServerUrl")
  public String getLivyServerUrl() {
    return livyServerUrl;
  }

  /**
   * Setter for livyServerUrl.
   * Livy Server URL for the Virtual Cluster.
   **/
  public void setLivyServerUrl(String livyServerUrl) {
    this.livyServerUrl = livyServerUrl;
  }

  /**
   * Getter for safariUrl.
   * Safari URL for the Virtual Cluster.
   **/
  @JsonProperty("safariUrl")
  public String getSafariUrl() {
    return safariUrl;
  }

  /**
   * Setter for safariUrl.
   * Safari URL for the Virtual Cluster.
   **/
  public void setSafariUrl(String safariUrl) {
    this.safariUrl = safariUrl;
  }

  /**
   * Getter for creationTime.
   * Time of creation of the virtual Cluster.
   **/
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Setter for creationTime.
   * Time of creation of the virtual Cluster.
   **/
  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Getter for sparkVersion.
   * Spark version for the virtual cluster.
   **/
  @JsonProperty("sparkVersion")
  public String getSparkVersion() {
    return sparkVersion;
  }

  /**
   * Setter for sparkVersion.
   * Spark version for the virtual cluster.
   **/
  public void setSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
  }

  /**
   * Getter for chartValueOverrides.
   * Chart overrides for the Virtual Cluster.
   **/
  @JsonProperty("chartValueOverrides")
  public List<ChartValueOverridesResponse> getChartValueOverrides() {
    return chartValueOverrides;
  }

  /**
   * Setter for chartValueOverrides.
   * Chart overrides for the Virtual Cluster.
   **/
  public void setChartValueOverrides(List<ChartValueOverridesResponse> chartValueOverrides) {
    this.chartValueOverrides = chartValueOverrides;
  }

  /**
   * Getter for accessControl.
   * Access control object for the Virtual Cluster.
   **/
  @JsonProperty("accessControl")
  public AccessControlResponse getAccessControl() {
    return accessControl;
  }

  /**
   * Setter for accessControl.
   * Access control object for the Virtual Cluster.
   **/
  public void setAccessControl(AccessControlResponse accessControl) {
    this.accessControl = accessControl;
  }

  /**
   * Getter for smtpConfig.
   * SMTP Configurations for Airflow Email Alerts.
   **/
  @JsonProperty("smtpConfig")
  public SmtpConfigResponse getSmtpConfig() {
    return smtpConfig;
  }

  /**
   * Setter for smtpConfig.
   * SMTP Configurations for Airflow Email Alerts.
   **/
  public void setSmtpConfig(SmtpConfigResponse smtpConfig) {
    this.smtpConfig = smtpConfig;
  }

  /**
   * Getter for vcTier.
   * Tier of the Virtual Cluster.
   **/
  @JsonProperty("vcTier")
  public String getVcTier() {
    return vcTier;
  }

  /**
   * Setter for vcTier.
   * Tier of the Virtual Cluster.
   **/
  public void setVcTier(String vcTier) {
    this.vcTier = vcTier;
  }

  /**
   * Getter for sessionTimeout.
   * Default timeout for Sessions.
   **/
  @JsonProperty("sessionTimeout")
  public String getSessionTimeout() {
    return sessionTimeout;
  }

  /**
   * Setter for sessionTimeout.
   * Default timeout for Sessions.
   **/
  public void setSessionTimeout(String sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  /**
   * Getter for sparkConfigs.
   * Spark configs that will be applied to all the spark jobs inside a virtual cluster.
   **/
  @JsonProperty("sparkConfigs")
  public Map<String, String> getSparkConfigs() {
    return sparkConfigs;
  }

  /**
   * Setter for sparkConfigs.
   * Spark configs that will be applied to all the spark jobs inside a virtual cluster.
   **/
  public void setSparkConfigs(Map<String, String> sparkConfigs) {
    this.sparkConfigs = sparkConfigs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcDescription vcDescription = (VcDescription) o;
    if (!Objects.equals(this.vcId, vcDescription.vcId)) {
      return false;
    }
    if (!Objects.equals(this.vcName, vcDescription.vcName)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, vcDescription.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.status, vcDescription.status)) {
      return false;
    }
    if (!Objects.equals(this.resources, vcDescription.resources)) {
      return false;
    }
    if (!Objects.equals(this.creatorEmail, vcDescription.creatorEmail)) {
      return false;
    }
    if (!Objects.equals(this.creatorID, vcDescription.creatorID)) {
      return false;
    }
    if (!Objects.equals(this.creatorName, vcDescription.creatorName)) {
      return false;
    }
    if (!Objects.equals(this.vcApiUrl, vcDescription.vcApiUrl)) {
      return false;
    }
    if (!Objects.equals(this.vcUiUrl, vcDescription.vcUiUrl)) {
      return false;
    }
    if (!Objects.equals(this.historyServerUrl, vcDescription.historyServerUrl)) {
      return false;
    }
    if (!Objects.equals(this.livyServerUrl, vcDescription.livyServerUrl)) {
      return false;
    }
    if (!Objects.equals(this.safariUrl, vcDescription.safariUrl)) {
      return false;
    }
    if (!Objects.equals(this.creationTime, vcDescription.creationTime)) {
      return false;
    }
    if (!Objects.equals(this.sparkVersion, vcDescription.sparkVersion)) {
      return false;
    }
    if (!Objects.equals(this.chartValueOverrides, vcDescription.chartValueOverrides)) {
      return false;
    }
    if (!Objects.equals(this.accessControl, vcDescription.accessControl)) {
      return false;
    }
    if (!Objects.equals(this.smtpConfig, vcDescription.smtpConfig)) {
      return false;
    }
    if (!Objects.equals(this.vcTier, vcDescription.vcTier)) {
      return false;
    }
    if (!Objects.equals(this.sessionTimeout, vcDescription.sessionTimeout)) {
      return false;
    }
    if (!Objects.equals(this.sparkConfigs, vcDescription.sparkConfigs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcId, vcName, clusterId, status, resources, creatorEmail, creatorID, creatorName, vcApiUrl, vcUiUrl, historyServerUrl, livyServerUrl, safariUrl, creationTime, sparkVersion, chartValueOverrides, accessControl, smtpConfig, vcTier, sessionTimeout, sparkConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcDescription {\n");
    sb.append("    vcId: ").append(toIndentedString(vcId)).append("\n");
    sb.append("    vcName: ").append(toIndentedString(vcName)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    creatorID: ").append(toIndentedString(creatorID)).append("\n");
    sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
    sb.append("    vcApiUrl: ").append(toIndentedString(vcApiUrl)).append("\n");
    sb.append("    vcUiUrl: ").append(toIndentedString(vcUiUrl)).append("\n");
    sb.append("    historyServerUrl: ").append(toIndentedString(historyServerUrl)).append("\n");
    sb.append("    livyServerUrl: ").append(toIndentedString(livyServerUrl)).append("\n");
    sb.append("    safariUrl: ").append(toIndentedString(safariUrl)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    sparkVersion: ").append(toIndentedString(sparkVersion)).append("\n");
    sb.append("    chartValueOverrides: ").append(toIndentedString(chartValueOverrides)).append("\n");
    sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
    sb.append("    smtpConfig: ").append(toIndentedString(smtpConfig)).append("\n");
    sb.append("    vcTier: ").append(toIndentedString(vcTier)).append("\n");
    sb.append("    sessionTimeout: ").append(toIndentedString(sessionTimeout)).append("\n");
    sb.append("    sparkConfigs: ").append(toIndentedString(sparkConfigs)).append("\n");
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

