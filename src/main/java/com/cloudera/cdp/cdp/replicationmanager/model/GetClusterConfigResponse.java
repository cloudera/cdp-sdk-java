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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.GetClusterConfigResponseDmx;
import com.cloudera.cdp.replicationmanager.model.ServiceConfiguration;
import java.util.*;
import java.util.Map;

/**
 * Response object for getClusterConfig.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:19.690-08:00")
public class GetClusterConfigResponse extends CdpResponse {

  /**
   * The CRN of the cluster.
   **/
  private String clusterCrn = null;

  /**
   * Cloudera Manager API version.
   **/
  private Integer cmApiVersion = null;

  /**
   * Underlying file system for Hive.
   **/
  private String underlyingFsForHive = null;

  /**
   * 
   **/
  private GetClusterConfigResponseDmx dmx = null;

  /**
   * A map of available features and whether they are supported on the cluster.
   **/
  private Map<String, Boolean> featureSupport = new HashMap<String, Boolean>();

  /**
   * A list of service configurations.
   **/
  private List<ServiceConfiguration> services = new ArrayList<ServiceConfiguration>();

  /**
   * Getter for clusterCrn.
   * The CRN of the cluster.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * The CRN of the cluster.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for cmApiVersion.
   * Cloudera Manager API version.
   **/
  @JsonProperty("cmApiVersion")
  public Integer getCmApiVersion() {
    return cmApiVersion;
  }

  /**
   * Setter for cmApiVersion.
   * Cloudera Manager API version.
   **/
  public void setCmApiVersion(Integer cmApiVersion) {
    this.cmApiVersion = cmApiVersion;
  }

  /**
   * Getter for underlyingFsForHive.
   * Underlying file system for Hive.
   **/
  @JsonProperty("underlyingFsForHive")
  public String getUnderlyingFsForHive() {
    return underlyingFsForHive;
  }

  /**
   * Setter for underlyingFsForHive.
   * Underlying file system for Hive.
   **/
  public void setUnderlyingFsForHive(String underlyingFsForHive) {
    this.underlyingFsForHive = underlyingFsForHive;
  }

  /**
   * Getter for dmx.
   * 
   **/
  @JsonProperty("dmx")
  public GetClusterConfigResponseDmx getDmx() {
    return dmx;
  }

  /**
   * Setter for dmx.
   * 
   **/
  public void setDmx(GetClusterConfigResponseDmx dmx) {
    this.dmx = dmx;
  }

  /**
   * Getter for featureSupport.
   * A map of available features and whether they are supported on the cluster.
   **/
  @JsonProperty("featureSupport")
  public Map<String, Boolean> getFeatureSupport() {
    return featureSupport;
  }

  /**
   * Setter for featureSupport.
   * A map of available features and whether they are supported on the cluster.
   **/
  public void setFeatureSupport(Map<String, Boolean> featureSupport) {
    this.featureSupport = featureSupport;
  }

  /**
   * Getter for services.
   * A list of service configurations.
   **/
  @JsonProperty("services")
  public List<ServiceConfiguration> getServices() {
    return services;
  }

  /**
   * Setter for services.
   * A list of service configurations.
   **/
  public void setServices(List<ServiceConfiguration> services) {
    this.services = services;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClusterConfigResponse getClusterConfigResponse = (GetClusterConfigResponse) o;
    if (!Objects.equals(this.clusterCrn, getClusterConfigResponse.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.cmApiVersion, getClusterConfigResponse.cmApiVersion)) {
      return false;
    }
    if (!Objects.equals(this.underlyingFsForHive, getClusterConfigResponse.underlyingFsForHive)) {
      return false;
    }
    if (!Objects.equals(this.dmx, getClusterConfigResponse.dmx)) {
      return false;
    }
    if (!Objects.equals(this.featureSupport, getClusterConfigResponse.featureSupport)) {
      return false;
    }
    if (!Objects.equals(this.services, getClusterConfigResponse.services)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, cmApiVersion, underlyingFsForHive, dmx, featureSupport, services, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClusterConfigResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    cmApiVersion: ").append(toIndentedString(cmApiVersion)).append("\n");
    sb.append("    underlyingFsForHive: ").append(toIndentedString(underlyingFsForHive)).append("\n");
    sb.append("    dmx: ").append(toIndentedString(dmx)).append("\n");
    sb.append("    featureSupport: ").append(toIndentedString(featureSupport)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

