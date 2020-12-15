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
import com.cloudera.cdp.dw.model.ConfigBlockDiff;
import com.cloudera.cdp.dw.model.ConfigBlockResp;
import java.util.*;

/**
 * Differences between two sets of ConfigBlocks.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-12-15T15:47:39.544-08:00")
public class ConfigBlocksDiffs  {

  /**
   * Has any of the config blocks changed?
   **/
  private Boolean isChanged = null;

  /**
   * Config blocks that are only present in the new configuration.
   **/
  private List<ConfigBlockResp> added = new ArrayList<ConfigBlockResp>();

  /**
   * Config blocks that are only present in the old configuration.
   **/
  private List<ConfigBlockResp> removed = new ArrayList<ConfigBlockResp>();

  /**
   * Config blocks that are the same in both configurations.
   **/
  private List<ConfigBlockResp> same = new ArrayList<ConfigBlockResp>();

  /**
   * Config blocks that are different between the two configurations.
   **/
  private List<ConfigBlockDiff> changed = new ArrayList<ConfigBlockDiff>();

  /**
   * Getter for isChanged.
   * Has any of the config blocks changed?
   **/
  @JsonProperty("isChanged")
  public Boolean getIsChanged() {
    return isChanged;
  }

  /**
   * Setter for isChanged.
   * Has any of the config blocks changed?
   **/
  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  /**
   * Getter for added.
   * Config blocks that are only present in the new configuration.
   **/
  @JsonProperty("added")
  public List<ConfigBlockResp> getAdded() {
    return added;
  }

  /**
   * Setter for added.
   * Config blocks that are only present in the new configuration.
   **/
  public void setAdded(List<ConfigBlockResp> added) {
    this.added = added;
  }

  /**
   * Getter for removed.
   * Config blocks that are only present in the old configuration.
   **/
  @JsonProperty("removed")
  public List<ConfigBlockResp> getRemoved() {
    return removed;
  }

  /**
   * Setter for removed.
   * Config blocks that are only present in the old configuration.
   **/
  public void setRemoved(List<ConfigBlockResp> removed) {
    this.removed = removed;
  }

  /**
   * Getter for same.
   * Config blocks that are the same in both configurations.
   **/
  @JsonProperty("same")
  public List<ConfigBlockResp> getSame() {
    return same;
  }

  /**
   * Setter for same.
   * Config blocks that are the same in both configurations.
   **/
  public void setSame(List<ConfigBlockResp> same) {
    this.same = same;
  }

  /**
   * Getter for changed.
   * Config blocks that are different between the two configurations.
   **/
  @JsonProperty("changed")
  public List<ConfigBlockDiff> getChanged() {
    return changed;
  }

  /**
   * Setter for changed.
   * Config blocks that are different between the two configurations.
   **/
  public void setChanged(List<ConfigBlockDiff> changed) {
    this.changed = changed;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigBlocksDiffs configBlocksDiffs = (ConfigBlocksDiffs) o;
    if (!Objects.equals(this.isChanged, configBlocksDiffs.isChanged)) {
      return false;
    }
    if (!Objects.equals(this.added, configBlocksDiffs.added)) {
      return false;
    }
    if (!Objects.equals(this.removed, configBlocksDiffs.removed)) {
      return false;
    }
    if (!Objects.equals(this.same, configBlocksDiffs.same)) {
      return false;
    }
    if (!Objects.equals(this.changed, configBlocksDiffs.changed)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isChanged, added, removed, same, changed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigBlocksDiffs {\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    same: ").append(toIndentedString(same)).append("\n");
    sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
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

