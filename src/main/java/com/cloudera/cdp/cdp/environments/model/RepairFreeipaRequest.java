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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for repairing the FreeIPA servers.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:22.145-08:00")
public class RepairFreeipaRequest  {

  /**
   * The environment name or CRN of the FreeIPA to repair
   **/
  private String environmentName = null;

  /**
   * Force the repair even if the status if the FreeIPA nodes are good.
   **/
  private Boolean force = false;

  /**
   * The instance Ids to repair. If not provided then all instances are looked at for repair.
   **/
  private List<String> instances = new ArrayList<String>();

  /**
   * The type of FreeIPA repair to perform. * AUTO - Currently, this is the same as reboot but this may change in the future. * REBOOT - Repair the failed instances by rebooting them. * REBUILD - Repair the failed instances by deleting them and creating new instances, then replicate data from an existing instance to the new instances.
   **/
  private String repairType = null;

  /**
   * Getter for environmentName.
   * The environment name or CRN of the FreeIPA to repair
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment name or CRN of the FreeIPA to repair
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for force.
   * Force the repair even if the status if the FreeIPA nodes are good.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Force the repair even if the status if the FreeIPA nodes are good.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  /**
   * Getter for instances.
   * The instance Ids to repair. If not provided then all instances are looked at for repair.
   **/
  @JsonProperty("instances")
  public List<String> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * The instance Ids to repair. If not provided then all instances are looked at for repair.
   **/
  public void setInstances(List<String> instances) {
    this.instances = instances;
  }

  /**
   * Getter for repairType.
   * The type of FreeIPA repair to perform. * AUTO - Currently, this is the same as reboot but this may change in the future. * REBOOT - Repair the failed instances by rebooting them. * REBUILD - Repair the failed instances by deleting them and creating new instances, then replicate data from an existing instance to the new instances.
   **/
  @JsonProperty("repairType")
  public String getRepairType() {
    return repairType;
  }

  /**
   * Setter for repairType.
   * The type of FreeIPA repair to perform. * AUTO - Currently, this is the same as reboot but this may change in the future. * REBOOT - Repair the failed instances by rebooting them. * REBUILD - Repair the failed instances by deleting them and creating new instances, then replicate data from an existing instance to the new instances.
   **/
  public void setRepairType(String repairType) {
    this.repairType = repairType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepairFreeipaRequest repairFreeipaRequest = (RepairFreeipaRequest) o;
    if (!Objects.equals(this.environmentName, repairFreeipaRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.force, repairFreeipaRequest.force)) {
      return false;
    }
    if (!Objects.equals(this.instances, repairFreeipaRequest.instances)) {
      return false;
    }
    if (!Objects.equals(this.repairType, repairFreeipaRequest.repairType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, force, instances, repairType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepairFreeipaRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    repairType: ").append(toIndentedString(repairType)).append("\n");
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

