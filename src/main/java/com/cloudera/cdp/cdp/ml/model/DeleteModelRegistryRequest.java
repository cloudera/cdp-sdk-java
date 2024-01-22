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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request for deleting model registry.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-19T13:24:33.475-08:00")
public class DeleteModelRegistryRequest  {

  /**
   * Deprecated, please use modelRegistryCrn. The environment CRN of the model registry.
   **/
  private String id = null;

  /**
   * Deprecated. The workspace CRN of the model registry (Public cloud only).
   **/
  private String workspaceCrn = null;

  /**
   * Force delete a model registry workspace even if errors occur during deletion. Force delete removes the guarantee that resources in your cloud account will be cleaned up. By default, force is set to false.
   **/
  private Boolean force = null;

  /**
   * CRN of the model registry to be deleted.
   **/
  private String modelRegistryCrn = null;

  /**
   * Getter for id.
   * Deprecated, please use modelRegistryCrn. The environment CRN of the model registry.
   **/
  @Deprecated
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Deprecated, please use modelRegistryCrn. The environment CRN of the model registry.
   **/
  @Deprecated
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for workspaceCrn.
   * Deprecated. The workspace CRN of the model registry (Public cloud only).
   **/
  @Deprecated
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * Deprecated. The workspace CRN of the model registry (Public cloud only).
   **/
  @Deprecated
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for force.
   * Force delete a model registry workspace even if errors occur during deletion. Force delete removes the guarantee that resources in your cloud account will be cleaned up. By default, force is set to false.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Force delete a model registry workspace even if errors occur during deletion. Force delete removes the guarantee that resources in your cloud account will be cleaned up. By default, force is set to false.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  /**
   * Getter for modelRegistryCrn.
   * CRN of the model registry to be deleted.
   **/
  @JsonProperty("modelRegistryCrn")
  public String getModelRegistryCrn() {
    return modelRegistryCrn;
  }

  /**
   * Setter for modelRegistryCrn.
   * CRN of the model registry to be deleted.
   **/
  public void setModelRegistryCrn(String modelRegistryCrn) {
    this.modelRegistryCrn = modelRegistryCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteModelRegistryRequest deleteModelRegistryRequest = (DeleteModelRegistryRequest) o;
    if (!Objects.equals(this.id, deleteModelRegistryRequest.id)) {
      return false;
    }
    if (!Objects.equals(this.workspaceCrn, deleteModelRegistryRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.force, deleteModelRegistryRequest.force)) {
      return false;
    }
    if (!Objects.equals(this.modelRegistryCrn, deleteModelRegistryRequest.modelRegistryCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workspaceCrn, force, modelRegistryCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteModelRegistryRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    modelRegistryCrn: ").append(toIndentedString(modelRegistryCrn)).append("\n");
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

