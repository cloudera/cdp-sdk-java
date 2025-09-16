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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.AddDisks;
import com.cloudera.cdp.datalake.model.ModifyDisks;

/**
 * Attached disk configuration(s).
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:43.337-07:00")
public class DiskOptions  {

  /**
   * Modifies all the disks attached to all instances in a group.
   **/
  private ModifyDisks modifyDisks = null;

  /**
   * Adds the requested number of disks of the requested type, size, and usage type.
   **/
  private AddDisks addDisks = null;

  /**
   * Getter for modifyDisks.
   * Modifies all the disks attached to all instances in a group.
   **/
  @JsonProperty("modifyDisks")
  public ModifyDisks getModifyDisks() {
    return modifyDisks;
  }

  /**
   * Setter for modifyDisks.
   * Modifies all the disks attached to all instances in a group.
   **/
  public void setModifyDisks(ModifyDisks modifyDisks) {
    this.modifyDisks = modifyDisks;
  }

  /**
   * Getter for addDisks.
   * Adds the requested number of disks of the requested type, size, and usage type.
   **/
  @JsonProperty("addDisks")
  public AddDisks getAddDisks() {
    return addDisks;
  }

  /**
   * Setter for addDisks.
   * Adds the requested number of disks of the requested type, size, and usage type.
   **/
  public void setAddDisks(AddDisks addDisks) {
    this.addDisks = addDisks;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskOptions diskOptions = (DiskOptions) o;
    if (!Objects.equals(this.modifyDisks, diskOptions.modifyDisks)) {
      return false;
    }
    if (!Objects.equals(this.addDisks, diskOptions.addDisks)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifyDisks, addDisks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskOptions {\n");
    sb.append("    modifyDisks: ").append(toIndentedString(modifyDisks)).append("\n");
    sb.append("    addDisks: ").append(toIndentedString(addDisks)).append("\n");
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

