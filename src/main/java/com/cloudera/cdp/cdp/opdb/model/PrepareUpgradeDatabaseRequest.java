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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Asynchronous request to prepare cluster upgrade.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:43.990-07:00")
public class PrepareUpgradeDatabaseRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environment = null;

  /**
   * The name or CRN of the database.
   **/
  private String database = null;

  /**
   * The CDP Runtime version to upgrade to.
   **/
  private String runtime = null;

  /**
   * ID of a database image to upgrade to.
   **/
  private String imageId = null;

  /**
   * Getter for environment.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for database.
   * The name or CRN of the database.
   **/
  @JsonProperty("database")
  public String getDatabase() {
    return database;
  }

  /**
   * Setter for database.
   * The name or CRN of the database.
   **/
  public void setDatabase(String database) {
    this.database = database;
  }

  /**
   * Getter for runtime.
   * The CDP Runtime version to upgrade to.
   **/
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }

  /**
   * Setter for runtime.
   * The CDP Runtime version to upgrade to.
   **/
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  /**
   * Getter for imageId.
   * ID of a database image to upgrade to.
   **/
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }

  /**
   * Setter for imageId.
   * ID of a database image to upgrade to.
   **/
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareUpgradeDatabaseRequest prepareUpgradeDatabaseRequest = (PrepareUpgradeDatabaseRequest) o;
    if (!Objects.equals(this.environment, prepareUpgradeDatabaseRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.database, prepareUpgradeDatabaseRequest.database)) {
      return false;
    }
    if (!Objects.equals(this.runtime, prepareUpgradeDatabaseRequest.runtime)) {
      return false;
    }
    if (!Objects.equals(this.imageId, prepareUpgradeDatabaseRequest.imageId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, database, runtime, imageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareUpgradeDatabaseRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

