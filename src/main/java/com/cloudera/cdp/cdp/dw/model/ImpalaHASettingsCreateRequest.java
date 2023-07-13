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

/**
 * High Availability settings for the Impala Virtual Warehouse. The values are disregarded for Hive.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-07-13T10:29:21.481-07:00")
public class ImpalaHASettingsCreateRequest  {

  /**
   * Set High Availability mode. If not provided, the default will apply. DISABLED - Disables Impala coordinator and Database Catalog high availability. ACTIVE_PASSIVE - Runs multiple coordinators (one active, one passive) and Database Catalogs (one active, one passive). ACTIVE_ACTIVE - Runs multiple coordinators (both active) and Database Catalogs (one active, one passive). If Unified Analytics is enabled, then this cannot be set to ACTIVE_ACTIVE.
   **/
  private String highAvailabilityMode = null;

  /**
   * Enables a shutdown of the coordinator. If Unified Analytics is enabled, then this setting is explicitly disabled (ignored) and should not be provided.
   **/
  private Boolean enableShutdownOfCoordinator = null;

  /**
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  private Integer shutdownOfCoordinatorDelaySeconds = null;

  /**
   * The number of active coordinators.
   **/
  private Integer numOfActiveCoordinators = null;

  /**
   * Enables a backup instance for Impala catalog to ensure high availability.
   **/
  private Boolean enableCatalogHighAvailability = null;

  /**
   * Getter for highAvailabilityMode.
   * Set High Availability mode. If not provided, the default will apply. DISABLED - Disables Impala coordinator and Database Catalog high availability. ACTIVE_PASSIVE - Runs multiple coordinators (one active, one passive) and Database Catalogs (one active, one passive). ACTIVE_ACTIVE - Runs multiple coordinators (both active) and Database Catalogs (one active, one passive). If Unified Analytics is enabled, then this cannot be set to ACTIVE_ACTIVE.
   **/
  @JsonProperty("highAvailabilityMode")
  public String getHighAvailabilityMode() {
    return highAvailabilityMode;
  }

  /**
   * Setter for highAvailabilityMode.
   * Set High Availability mode. If not provided, the default will apply. DISABLED - Disables Impala coordinator and Database Catalog high availability. ACTIVE_PASSIVE - Runs multiple coordinators (one active, one passive) and Database Catalogs (one active, one passive). ACTIVE_ACTIVE - Runs multiple coordinators (both active) and Database Catalogs (one active, one passive). If Unified Analytics is enabled, then this cannot be set to ACTIVE_ACTIVE.
   **/
  public void setHighAvailabilityMode(String highAvailabilityMode) {
    this.highAvailabilityMode = highAvailabilityMode;
  }

  /**
   * Getter for enableShutdownOfCoordinator.
   * Enables a shutdown of the coordinator. If Unified Analytics is enabled, then this setting is explicitly disabled (ignored) and should not be provided.
   **/
  @JsonProperty("enableShutdownOfCoordinator")
  public Boolean getEnableShutdownOfCoordinator() {
    return enableShutdownOfCoordinator;
  }

  /**
   * Setter for enableShutdownOfCoordinator.
   * Enables a shutdown of the coordinator. If Unified Analytics is enabled, then this setting is explicitly disabled (ignored) and should not be provided.
   **/
  public void setEnableShutdownOfCoordinator(Boolean enableShutdownOfCoordinator) {
    this.enableShutdownOfCoordinator = enableShutdownOfCoordinator;
  }

  /**
   * Getter for shutdownOfCoordinatorDelaySeconds.
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  @JsonProperty("shutdownOfCoordinatorDelaySeconds")
  public Integer getShutdownOfCoordinatorDelaySeconds() {
    return shutdownOfCoordinatorDelaySeconds;
  }

  /**
   * Setter for shutdownOfCoordinatorDelaySeconds.
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  public void setShutdownOfCoordinatorDelaySeconds(Integer shutdownOfCoordinatorDelaySeconds) {
    this.shutdownOfCoordinatorDelaySeconds = shutdownOfCoordinatorDelaySeconds;
  }

  /**
   * Getter for numOfActiveCoordinators.
   * The number of active coordinators.
   **/
  @JsonProperty("numOfActiveCoordinators")
  public Integer getNumOfActiveCoordinators() {
    return numOfActiveCoordinators;
  }

  /**
   * Setter for numOfActiveCoordinators.
   * The number of active coordinators.
   **/
  public void setNumOfActiveCoordinators(Integer numOfActiveCoordinators) {
    this.numOfActiveCoordinators = numOfActiveCoordinators;
  }

  /**
   * Getter for enableCatalogHighAvailability.
   * Enables a backup instance for Impala catalog to ensure high availability.
   **/
  @JsonProperty("enableCatalogHighAvailability")
  public Boolean getEnableCatalogHighAvailability() {
    return enableCatalogHighAvailability;
  }

  /**
   * Setter for enableCatalogHighAvailability.
   * Enables a backup instance for Impala catalog to ensure high availability.
   **/
  public void setEnableCatalogHighAvailability(Boolean enableCatalogHighAvailability) {
    this.enableCatalogHighAvailability = enableCatalogHighAvailability;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaHASettingsCreateRequest impalaHASettingsCreateRequest = (ImpalaHASettingsCreateRequest) o;
    if (!Objects.equals(this.highAvailabilityMode, impalaHASettingsCreateRequest.highAvailabilityMode)) {
      return false;
    }
    if (!Objects.equals(this.enableShutdownOfCoordinator, impalaHASettingsCreateRequest.enableShutdownOfCoordinator)) {
      return false;
    }
    if (!Objects.equals(this.shutdownOfCoordinatorDelaySeconds, impalaHASettingsCreateRequest.shutdownOfCoordinatorDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.numOfActiveCoordinators, impalaHASettingsCreateRequest.numOfActiveCoordinators)) {
      return false;
    }
    if (!Objects.equals(this.enableCatalogHighAvailability, impalaHASettingsCreateRequest.enableCatalogHighAvailability)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(highAvailabilityMode, enableShutdownOfCoordinator, shutdownOfCoordinatorDelaySeconds, numOfActiveCoordinators, enableCatalogHighAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaHASettingsCreateRequest {\n");
    sb.append("    highAvailabilityMode: ").append(toIndentedString(highAvailabilityMode)).append("\n");
    sb.append("    enableShutdownOfCoordinator: ").append(toIndentedString(enableShutdownOfCoordinator)).append("\n");
    sb.append("    shutdownOfCoordinatorDelaySeconds: ").append(toIndentedString(shutdownOfCoordinatorDelaySeconds)).append("\n");
    sb.append("    numOfActiveCoordinators: ").append(toIndentedString(numOfActiveCoordinators)).append("\n");
    sb.append("    enableCatalogHighAvailability: ").append(toIndentedString(enableCatalogHighAvailability)).append("\n");
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

