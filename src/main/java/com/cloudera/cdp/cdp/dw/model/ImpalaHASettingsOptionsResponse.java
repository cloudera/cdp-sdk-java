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
 * Impala High Availability settings for a Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-12T15:07:42.845-07:00")
public class ImpalaHASettingsOptionsResponse extends CdpResponse {

  /**
   * High Availability mode. DISABLED - Impala coordinator and Database Catalog high availability is disabled. ACTIVE_PASSIVE - Multiple coordinators (one active, one passive) and Database Catalogs (one active, one passive) are run. ACTIVE_ACTIVE - Multiple coordinators (both active) and Database Catalogs (one active, one passive) are run.
   **/
  private String highAvailabilityMode = null;

  /**
   * Whether a shutdown of the coordinator is enabled.
   **/
  private Boolean enableShutdownOfCoordinator = null;

  /**
   * Number of the active coordinators.
   **/
  private Integer numOfActiveCoordinators = null;

  /**
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  private Integer shutdownOfCoordinatorDelaySeconds = null;

  /**
   * Denotes whether a backup instance for Impala catalog is enabled.
   **/
  private Boolean enableCatalogHighAvailability = null;

  /**
   * Denotes whether a backup instance for Impala Statestore is enabled.
   **/
  private Boolean enableStatestoreHighAvailability = null;

  /**
   * Getter for highAvailabilityMode.
   * High Availability mode. DISABLED - Impala coordinator and Database Catalog high availability is disabled. ACTIVE_PASSIVE - Multiple coordinators (one active, one passive) and Database Catalogs (one active, one passive) are run. ACTIVE_ACTIVE - Multiple coordinators (both active) and Database Catalogs (one active, one passive) are run.
   **/
  @JsonProperty("highAvailabilityMode")
  public String getHighAvailabilityMode() {
    return highAvailabilityMode;
  }

  /**
   * Setter for highAvailabilityMode.
   * High Availability mode. DISABLED - Impala coordinator and Database Catalog high availability is disabled. ACTIVE_PASSIVE - Multiple coordinators (one active, one passive) and Database Catalogs (one active, one passive) are run. ACTIVE_ACTIVE - Multiple coordinators (both active) and Database Catalogs (one active, one passive) are run.
   **/
  public void setHighAvailabilityMode(String highAvailabilityMode) {
    this.highAvailabilityMode = highAvailabilityMode;
  }

  /**
   * Getter for enableShutdownOfCoordinator.
   * Whether a shutdown of the coordinator is enabled.
   **/
  @JsonProperty("enableShutdownOfCoordinator")
  public Boolean getEnableShutdownOfCoordinator() {
    return enableShutdownOfCoordinator;
  }

  /**
   * Setter for enableShutdownOfCoordinator.
   * Whether a shutdown of the coordinator is enabled.
   **/
  public void setEnableShutdownOfCoordinator(Boolean enableShutdownOfCoordinator) {
    this.enableShutdownOfCoordinator = enableShutdownOfCoordinator;
  }

  /**
   * Getter for numOfActiveCoordinators.
   * Number of the active coordinators.
   **/
  @JsonProperty("numOfActiveCoordinators")
  public Integer getNumOfActiveCoordinators() {
    return numOfActiveCoordinators;
  }

  /**
   * Setter for numOfActiveCoordinators.
   * Number of the active coordinators.
   **/
  public void setNumOfActiveCoordinators(Integer numOfActiveCoordinators) {
    this.numOfActiveCoordinators = numOfActiveCoordinators;
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
   * Getter for enableCatalogHighAvailability.
   * Denotes whether a backup instance for Impala catalog is enabled.
   **/
  @JsonProperty("enableCatalogHighAvailability")
  public Boolean getEnableCatalogHighAvailability() {
    return enableCatalogHighAvailability;
  }

  /**
   * Setter for enableCatalogHighAvailability.
   * Denotes whether a backup instance for Impala catalog is enabled.
   **/
  public void setEnableCatalogHighAvailability(Boolean enableCatalogHighAvailability) {
    this.enableCatalogHighAvailability = enableCatalogHighAvailability;
  }

  /**
   * Getter for enableStatestoreHighAvailability.
   * Denotes whether a backup instance for Impala Statestore is enabled.
   **/
  @JsonProperty("enableStatestoreHighAvailability")
  public Boolean getEnableStatestoreHighAvailability() {
    return enableStatestoreHighAvailability;
  }

  /**
   * Setter for enableStatestoreHighAvailability.
   * Denotes whether a backup instance for Impala Statestore is enabled.
   **/
  public void setEnableStatestoreHighAvailability(Boolean enableStatestoreHighAvailability) {
    this.enableStatestoreHighAvailability = enableStatestoreHighAvailability;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaHASettingsOptionsResponse impalaHASettingsOptionsResponse = (ImpalaHASettingsOptionsResponse) o;
    if (!Objects.equals(this.highAvailabilityMode, impalaHASettingsOptionsResponse.highAvailabilityMode)) {
      return false;
    }
    if (!Objects.equals(this.enableShutdownOfCoordinator, impalaHASettingsOptionsResponse.enableShutdownOfCoordinator)) {
      return false;
    }
    if (!Objects.equals(this.numOfActiveCoordinators, impalaHASettingsOptionsResponse.numOfActiveCoordinators)) {
      return false;
    }
    if (!Objects.equals(this.shutdownOfCoordinatorDelaySeconds, impalaHASettingsOptionsResponse.shutdownOfCoordinatorDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.enableCatalogHighAvailability, impalaHASettingsOptionsResponse.enableCatalogHighAvailability)) {
      return false;
    }
    if (!Objects.equals(this.enableStatestoreHighAvailability, impalaHASettingsOptionsResponse.enableStatestoreHighAvailability)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(highAvailabilityMode, enableShutdownOfCoordinator, numOfActiveCoordinators, shutdownOfCoordinatorDelaySeconds, enableCatalogHighAvailability, enableStatestoreHighAvailability, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaHASettingsOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    highAvailabilityMode: ").append(toIndentedString(highAvailabilityMode)).append("\n");
    sb.append("    enableShutdownOfCoordinator: ").append(toIndentedString(enableShutdownOfCoordinator)).append("\n");
    sb.append("    numOfActiveCoordinators: ").append(toIndentedString(numOfActiveCoordinators)).append("\n");
    sb.append("    shutdownOfCoordinatorDelaySeconds: ").append(toIndentedString(shutdownOfCoordinatorDelaySeconds)).append("\n");
    sb.append("    enableCatalogHighAvailability: ").append(toIndentedString(enableCatalogHighAvailability)).append("\n");
    sb.append("    enableStatestoreHighAvailability: ").append(toIndentedString(enableStatestoreHighAvailability)).append("\n");
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

