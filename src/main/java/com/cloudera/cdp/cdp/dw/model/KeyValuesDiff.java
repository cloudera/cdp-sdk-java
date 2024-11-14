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
import com.cloudera.cdp.dw.model.StringDiff;
import java.util.*;
import java.util.Map;

/**
 * Different between keyValues of two ConfigContents.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:24.581-08:00")
public class KeyValuesDiff  {

  /**
   * Keys that are only present in the new configuration.
   **/
  private Map<String, String> added = new HashMap<String, String>();

  /**
   * Keys that are only present in the old configuration.
   **/
  private Map<String, String> removed = new HashMap<String, String>();

  /**
   * Keys that are present in both configurations.
   **/
  private Map<String, String> same = new HashMap<String, String>();

  /**
   * Keys with different values.
   **/
  private Map<String, StringDiff> changed = new HashMap<String, StringDiff>();

  /**
   * Getter for added.
   * Keys that are only present in the new configuration.
   **/
  @JsonProperty("added")
  public Map<String, String> getAdded() {
    return added;
  }

  /**
   * Setter for added.
   * Keys that are only present in the new configuration.
   **/
  public void setAdded(Map<String, String> added) {
    this.added = added;
  }

  /**
   * Getter for removed.
   * Keys that are only present in the old configuration.
   **/
  @JsonProperty("removed")
  public Map<String, String> getRemoved() {
    return removed;
  }

  /**
   * Setter for removed.
   * Keys that are only present in the old configuration.
   **/
  public void setRemoved(Map<String, String> removed) {
    this.removed = removed;
  }

  /**
   * Getter for same.
   * Keys that are present in both configurations.
   **/
  @JsonProperty("same")
  public Map<String, String> getSame() {
    return same;
  }

  /**
   * Setter for same.
   * Keys that are present in both configurations.
   **/
  public void setSame(Map<String, String> same) {
    this.same = same;
  }

  /**
   * Getter for changed.
   * Keys with different values.
   **/
  @JsonProperty("changed")
  public Map<String, StringDiff> getChanged() {
    return changed;
  }

  /**
   * Setter for changed.
   * Keys with different values.
   **/
  public void setChanged(Map<String, StringDiff> changed) {
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
    KeyValuesDiff keyValuesDiff = (KeyValuesDiff) o;
    if (!Objects.equals(this.added, keyValuesDiff.added)) {
      return false;
    }
    if (!Objects.equals(this.removed, keyValuesDiff.removed)) {
      return false;
    }
    if (!Objects.equals(this.same, keyValuesDiff.same)) {
      return false;
    }
    if (!Objects.equals(this.changed, keyValuesDiff.changed)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, removed, same, changed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyValuesDiff {\n");
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

