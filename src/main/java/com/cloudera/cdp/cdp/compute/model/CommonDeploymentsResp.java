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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.CommonAutoscalerResp;
import com.cloudera.cdp.compute.model.CommonDeploymentProfileDetailsResp;
import com.cloudera.cdp.compute.model.CommonHorizontalPodAutoScalerResp;
import com.cloudera.cdp.compute.model.CommonLoggingResp;
import com.cloudera.cdp.compute.model.CommonMeteringResp;
import com.cloudera.cdp.compute.model.CommonMonitoringResp;
import com.cloudera.cdp.compute.model.CommonNvidiaResp;
import com.cloudera.cdp.compute.model.CommonYuniKornResp;

/**
 * Deployments response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:31.997-07:00")
public class CommonDeploymentsResp  {

  /**
   * Autoscaler specs.
   **/
  private CommonAutoscalerResp autoscaler = null;

  /**
   * Horizontal pod autoscaler specs.
   **/
  private CommonHorizontalPodAutoScalerResp horizontalPodAutoscaler = null;

  /**
   * Istio specs.
   **/
  private CommonDeploymentProfileDetailsResp istio = null;

  /**
   * Logging specs.
   **/
  private CommonLoggingResp logging = null;

  /**
   * Metering specs.
   **/
  private CommonMeteringResp metering = null;

  /**
   * Monitoring specs.
   **/
  private CommonMonitoringResp monitoring = null;

  /**
   * Nvidia specs.
   **/
  private CommonNvidiaResp nvidia = null;

  /**
   * Repository for images.
   **/
  private String repository = null;

  /**
   * Yunikorn specs.
   **/
  private CommonYuniKornResp yunikorn = null;

  /**
   * Telemetry KMS key ARN.
   **/
  private String telemetryKmsKeyArn = null;

  /**
   * Knox specs.
   **/
  private CommonDeploymentProfileDetailsResp knox = null;

  /**
   * Getter for autoscaler.
   * Autoscaler specs.
   **/
  @JsonProperty("autoscaler")
  public CommonAutoscalerResp getAutoscaler() {
    return autoscaler;
  }

  /**
   * Setter for autoscaler.
   * Autoscaler specs.
   **/
  public void setAutoscaler(CommonAutoscalerResp autoscaler) {
    this.autoscaler = autoscaler;
  }

  /**
   * Getter for horizontalPodAutoscaler.
   * Horizontal pod autoscaler specs.
   **/
  @JsonProperty("horizontalPodAutoscaler")
  public CommonHorizontalPodAutoScalerResp getHorizontalPodAutoscaler() {
    return horizontalPodAutoscaler;
  }

  /**
   * Setter for horizontalPodAutoscaler.
   * Horizontal pod autoscaler specs.
   **/
  public void setHorizontalPodAutoscaler(CommonHorizontalPodAutoScalerResp horizontalPodAutoscaler) {
    this.horizontalPodAutoscaler = horizontalPodAutoscaler;
  }

  /**
   * Getter for istio.
   * Istio specs.
   **/
  @JsonProperty("istio")
  public CommonDeploymentProfileDetailsResp getIstio() {
    return istio;
  }

  /**
   * Setter for istio.
   * Istio specs.
   **/
  public void setIstio(CommonDeploymentProfileDetailsResp istio) {
    this.istio = istio;
  }

  /**
   * Getter for logging.
   * Logging specs.
   **/
  @JsonProperty("logging")
  public CommonLoggingResp getLogging() {
    return logging;
  }

  /**
   * Setter for logging.
   * Logging specs.
   **/
  public void setLogging(CommonLoggingResp logging) {
    this.logging = logging;
  }

  /**
   * Getter for metering.
   * Metering specs.
   **/
  @JsonProperty("metering")
  public CommonMeteringResp getMetering() {
    return metering;
  }

  /**
   * Setter for metering.
   * Metering specs.
   **/
  public void setMetering(CommonMeteringResp metering) {
    this.metering = metering;
  }

  /**
   * Getter for monitoring.
   * Monitoring specs.
   **/
  @JsonProperty("monitoring")
  public CommonMonitoringResp getMonitoring() {
    return monitoring;
  }

  /**
   * Setter for monitoring.
   * Monitoring specs.
   **/
  public void setMonitoring(CommonMonitoringResp monitoring) {
    this.monitoring = monitoring;
  }

  /**
   * Getter for nvidia.
   * Nvidia specs.
   **/
  @JsonProperty("nvidia")
  public CommonNvidiaResp getNvidia() {
    return nvidia;
  }

  /**
   * Setter for nvidia.
   * Nvidia specs.
   **/
  public void setNvidia(CommonNvidiaResp nvidia) {
    this.nvidia = nvidia;
  }

  /**
   * Getter for repository.
   * Repository for images.
   **/
  @JsonProperty("repository")
  public String getRepository() {
    return repository;
  }

  /**
   * Setter for repository.
   * Repository for images.
   **/
  public void setRepository(String repository) {
    this.repository = repository;
  }

  /**
   * Getter for yunikorn.
   * Yunikorn specs.
   **/
  @JsonProperty("yunikorn")
  public CommonYuniKornResp getYunikorn() {
    return yunikorn;
  }

  /**
   * Setter for yunikorn.
   * Yunikorn specs.
   **/
  public void setYunikorn(CommonYuniKornResp yunikorn) {
    this.yunikorn = yunikorn;
  }

  /**
   * Getter for telemetryKmsKeyArn.
   * Telemetry KMS key ARN.
   **/
  @JsonProperty("telemetryKmsKeyArn")
  public String getTelemetryKmsKeyArn() {
    return telemetryKmsKeyArn;
  }

  /**
   * Setter for telemetryKmsKeyArn.
   * Telemetry KMS key ARN.
   **/
  public void setTelemetryKmsKeyArn(String telemetryKmsKeyArn) {
    this.telemetryKmsKeyArn = telemetryKmsKeyArn;
  }

  /**
   * Getter for knox.
   * Knox specs.
   **/
  @JsonProperty("knox")
  public CommonDeploymentProfileDetailsResp getKnox() {
    return knox;
  }

  /**
   * Setter for knox.
   * Knox specs.
   **/
  public void setKnox(CommonDeploymentProfileDetailsResp knox) {
    this.knox = knox;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonDeploymentsResp commonDeploymentsResp = (CommonDeploymentsResp) o;
    if (!Objects.equals(this.autoscaler, commonDeploymentsResp.autoscaler)) {
      return false;
    }
    if (!Objects.equals(this.horizontalPodAutoscaler, commonDeploymentsResp.horizontalPodAutoscaler)) {
      return false;
    }
    if (!Objects.equals(this.istio, commonDeploymentsResp.istio)) {
      return false;
    }
    if (!Objects.equals(this.logging, commonDeploymentsResp.logging)) {
      return false;
    }
    if (!Objects.equals(this.metering, commonDeploymentsResp.metering)) {
      return false;
    }
    if (!Objects.equals(this.monitoring, commonDeploymentsResp.monitoring)) {
      return false;
    }
    if (!Objects.equals(this.nvidia, commonDeploymentsResp.nvidia)) {
      return false;
    }
    if (!Objects.equals(this.repository, commonDeploymentsResp.repository)) {
      return false;
    }
    if (!Objects.equals(this.yunikorn, commonDeploymentsResp.yunikorn)) {
      return false;
    }
    if (!Objects.equals(this.telemetryKmsKeyArn, commonDeploymentsResp.telemetryKmsKeyArn)) {
      return false;
    }
    if (!Objects.equals(this.knox, commonDeploymentsResp.knox)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscaler, horizontalPodAutoscaler, istio, logging, metering, monitoring, nvidia, repository, yunikorn, telemetryKmsKeyArn, knox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonDeploymentsResp {\n");
    sb.append("    autoscaler: ").append(toIndentedString(autoscaler)).append("\n");
    sb.append("    horizontalPodAutoscaler: ").append(toIndentedString(horizontalPodAutoscaler)).append("\n");
    sb.append("    istio: ").append(toIndentedString(istio)).append("\n");
    sb.append("    logging: ").append(toIndentedString(logging)).append("\n");
    sb.append("    metering: ").append(toIndentedString(metering)).append("\n");
    sb.append("    monitoring: ").append(toIndentedString(monitoring)).append("\n");
    sb.append("    nvidia: ").append(toIndentedString(nvidia)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    yunikorn: ").append(toIndentedString(yunikorn)).append("\n");
    sb.append("    telemetryKmsKeyArn: ").append(toIndentedString(telemetryKmsKeyArn)).append("\n");
    sb.append("    knox: ").append(toIndentedString(knox)).append("\n");
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

