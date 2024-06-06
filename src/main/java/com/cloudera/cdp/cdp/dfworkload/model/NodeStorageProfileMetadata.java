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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Provides details about the node storage options.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:31:00.597-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class NodeStorageProfileMetadata  {

  /**
   * Content repository size
   **/
  private Integer contentRepoSize = null;

  /**
   * Provenance repository size
   **/
  private Integer provenanceRepoSize = null;

  /**
   * FlowFile repository size
   **/
  private Integer flowfileRepoSize = null;

  /**
   * IOPS
   **/
  private String iops = null;

  /**
   * Throughput
   **/
  private String throughput = null;

  /**
   * Storage volume type
   **/
  private String storageVolumeType = null;

  /**
   * The name of this Storage Profile
   **/
  private String name = null;

  /**
   * The text (i.e., the human readable name) for this Storage Profile
   **/
  private String text = null;

  /**
   * Getter for contentRepoSize.
   * Content repository size
   **/
  @JsonProperty("contentRepoSize")
  public Integer getContentRepoSize() {
    return contentRepoSize;
  }

  /**
   * Setter for contentRepoSize.
   * Content repository size
   **/
  public void setContentRepoSize(Integer contentRepoSize) {
    this.contentRepoSize = contentRepoSize;
  }

  /**
   * Getter for provenanceRepoSize.
   * Provenance repository size
   **/
  @JsonProperty("provenanceRepoSize")
  public Integer getProvenanceRepoSize() {
    return provenanceRepoSize;
  }

  /**
   * Setter for provenanceRepoSize.
   * Provenance repository size
   **/
  public void setProvenanceRepoSize(Integer provenanceRepoSize) {
    this.provenanceRepoSize = provenanceRepoSize;
  }

  /**
   * Getter for flowfileRepoSize.
   * FlowFile repository size
   **/
  @JsonProperty("flowfileRepoSize")
  public Integer getFlowfileRepoSize() {
    return flowfileRepoSize;
  }

  /**
   * Setter for flowfileRepoSize.
   * FlowFile repository size
   **/
  public void setFlowfileRepoSize(Integer flowfileRepoSize) {
    this.flowfileRepoSize = flowfileRepoSize;
  }

  /**
   * Getter for iops.
   * IOPS
   **/
  @JsonProperty("iops")
  public String getIops() {
    return iops;
  }

  /**
   * Setter for iops.
   * IOPS
   **/
  public void setIops(String iops) {
    this.iops = iops;
  }

  /**
   * Getter for throughput.
   * Throughput
   **/
  @JsonProperty("throughput")
  public String getThroughput() {
    return throughput;
  }

  /**
   * Setter for throughput.
   * Throughput
   **/
  public void setThroughput(String throughput) {
    this.throughput = throughput;
  }

  /**
   * Getter for storageVolumeType.
   * Storage volume type
   **/
  @JsonProperty("storageVolumeType")
  public String getStorageVolumeType() {
    return storageVolumeType;
  }

  /**
   * Setter for storageVolumeType.
   * Storage volume type
   **/
  public void setStorageVolumeType(String storageVolumeType) {
    this.storageVolumeType = storageVolumeType;
  }

  /**
   * Getter for name.
   * The name of this Storage Profile
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of this Storage Profile
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for text.
   * The text (i.e., the human readable name) for this Storage Profile
   **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Setter for text.
   * The text (i.e., the human readable name) for this Storage Profile
   **/
  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStorageProfileMetadata nodeStorageProfileMetadata = (NodeStorageProfileMetadata) o;
    if (!Objects.equals(this.contentRepoSize, nodeStorageProfileMetadata.contentRepoSize)) {
      return false;
    }
    if (!Objects.equals(this.provenanceRepoSize, nodeStorageProfileMetadata.provenanceRepoSize)) {
      return false;
    }
    if (!Objects.equals(this.flowfileRepoSize, nodeStorageProfileMetadata.flowfileRepoSize)) {
      return false;
    }
    if (!Objects.equals(this.iops, nodeStorageProfileMetadata.iops)) {
      return false;
    }
    if (!Objects.equals(this.throughput, nodeStorageProfileMetadata.throughput)) {
      return false;
    }
    if (!Objects.equals(this.storageVolumeType, nodeStorageProfileMetadata.storageVolumeType)) {
      return false;
    }
    if (!Objects.equals(this.name, nodeStorageProfileMetadata.name)) {
      return false;
    }
    if (!Objects.equals(this.text, nodeStorageProfileMetadata.text)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentRepoSize, provenanceRepoSize, flowfileRepoSize, iops, throughput, storageVolumeType, name, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStorageProfileMetadata {\n");
    sb.append("    contentRepoSize: ").append(toIndentedString(contentRepoSize)).append("\n");
    sb.append("    provenanceRepoSize: ").append(toIndentedString(provenanceRepoSize)).append("\n");
    sb.append("    flowfileRepoSize: ").append(toIndentedString(flowfileRepoSize)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
    sb.append("    storageVolumeType: ").append(toIndentedString(storageVolumeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

