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
 * Entity status after the restore operation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-01T13:59:39.820-08:00")
public class RestoreClusterEntityPlan  {

  /**
   * The reference of the entity in the backup data.
   **/
  private String ref = null;

  /**
   * The ID of the entity.
   **/
  private String id = null;

  /**
   * The action associated with the plan. Possible actions: Create, Update, Skip
   **/
  private String action = null;

  /**
   * The description of the plan.
   **/
  private String message = null;

  /**
   * Getter for ref.
   * The reference of the entity in the backup data.
   **/
  @JsonProperty("ref")
  public String getRef() {
    return ref;
  }

  /**
   * Setter for ref.
   * The reference of the entity in the backup data.
   **/
  public void setRef(String ref) {
    this.ref = ref;
  }

  /**
   * Getter for id.
   * The ID of the entity.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the entity.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for action.
   * The action associated with the plan. Possible actions: Create, Update, Skip
   **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  /**
   * Setter for action.
   * The action associated with the plan. Possible actions: Create, Update, Skip
   **/
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Getter for message.
   * The description of the plan.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * The description of the plan.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreClusterEntityPlan restoreClusterEntityPlan = (RestoreClusterEntityPlan) o;
    if (!Objects.equals(this.ref, restoreClusterEntityPlan.ref)) {
      return false;
    }
    if (!Objects.equals(this.id, restoreClusterEntityPlan.id)) {
      return false;
    }
    if (!Objects.equals(this.action, restoreClusterEntityPlan.action)) {
      return false;
    }
    if (!Objects.equals(this.message, restoreClusterEntityPlan.message)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, id, action, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreClusterEntityPlan {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

