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
import com.cloudera.cdp.ml.model.Topology;

/**
 * Contains the information about overlay network.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-18T19:29:50.818-07:00")
public class OverlayNetwork  {

  /**
   * The plugin specifies specific cni vendor, ex: calico, weave etc.
   **/
  private String plugin = null;

  /**
   * The options for overlay topology.
   **/
  private Topology topology = null;

  /**
   * Getter for plugin.
   * The plugin specifies specific cni vendor, ex: calico, weave etc.
   **/
  @JsonProperty("plugin")
  public String getPlugin() {
    return plugin;
  }

  /**
   * Setter for plugin.
   * The plugin specifies specific cni vendor, ex: calico, weave etc.
   **/
  public void setPlugin(String plugin) {
    this.plugin = plugin;
  }

  /**
   * Getter for topology.
   * The options for overlay topology.
   **/
  @JsonProperty("topology")
  public Topology getTopology() {
    return topology;
  }

  /**
   * Setter for topology.
   * The options for overlay topology.
   **/
  public void setTopology(Topology topology) {
    this.topology = topology;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverlayNetwork overlayNetwork = (OverlayNetwork) o;
    if (!Objects.equals(this.plugin, overlayNetwork.plugin)) {
      return false;
    }
    if (!Objects.equals(this.topology, overlayNetwork.topology)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(plugin, topology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverlayNetwork {\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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

