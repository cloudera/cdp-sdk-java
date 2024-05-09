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
 * A Parameters to configure AutoScaling
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-09T12:44:57.341-07:00")
public class AutoScalingParameters  {

  /**
   * The target value of the metric a user expect to maintain for the cluster
   **/
  private Long targetedValueForMetric = null;

  /**
   * Maximum number of worker nodes as per this metrics can be scaled up to.
   **/
  private Integer maxWorkersForDatabase = null;

  /**
   * Maximum number of worker nodes as per this metrics can be scaled up to in one batch.
   **/
  private Integer maxWorkersPerBatch = null;

  /**
   * Minimum number of worker nodes as per this metrics can be scaled down to.
   **/
  private Integer minWorkersForDatabase = null;

  /**
   * Period of metrics(in seconds) needs to be considered.
   **/
  private Long evaluationPeriod = null;

  /**
   * The amount of block cache, in Gigabytes, which the database should have.
   **/
  private Integer minimumBlockCacheGb = null;

  /**
   * Getter for targetedValueForMetric.
   * The target value of the metric a user expect to maintain for the cluster
   **/
  @JsonProperty("targetedValueForMetric")
  public Long getTargetedValueForMetric() {
    return targetedValueForMetric;
  }

  /**
   * Setter for targetedValueForMetric.
   * The target value of the metric a user expect to maintain for the cluster
   **/
  public void setTargetedValueForMetric(Long targetedValueForMetric) {
    this.targetedValueForMetric = targetedValueForMetric;
  }

  /**
   * Getter for maxWorkersForDatabase.
   * Maximum number of worker nodes as per this metrics can be scaled up to.
   **/
  @JsonProperty("maxWorkersForDatabase")
  public Integer getMaxWorkersForDatabase() {
    return maxWorkersForDatabase;
  }

  /**
   * Setter for maxWorkersForDatabase.
   * Maximum number of worker nodes as per this metrics can be scaled up to.
   **/
  public void setMaxWorkersForDatabase(Integer maxWorkersForDatabase) {
    this.maxWorkersForDatabase = maxWorkersForDatabase;
  }

  /**
   * Getter for maxWorkersPerBatch.
   * Maximum number of worker nodes as per this metrics can be scaled up to in one batch.
   **/
  @JsonProperty("maxWorkersPerBatch")
  public Integer getMaxWorkersPerBatch() {
    return maxWorkersPerBatch;
  }

  /**
   * Setter for maxWorkersPerBatch.
   * Maximum number of worker nodes as per this metrics can be scaled up to in one batch.
   **/
  public void setMaxWorkersPerBatch(Integer maxWorkersPerBatch) {
    this.maxWorkersPerBatch = maxWorkersPerBatch;
  }

  /**
   * Getter for minWorkersForDatabase.
   * Minimum number of worker nodes as per this metrics can be scaled down to.
   **/
  @JsonProperty("minWorkersForDatabase")
  public Integer getMinWorkersForDatabase() {
    return minWorkersForDatabase;
  }

  /**
   * Setter for minWorkersForDatabase.
   * Minimum number of worker nodes as per this metrics can be scaled down to.
   **/
  public void setMinWorkersForDatabase(Integer minWorkersForDatabase) {
    this.minWorkersForDatabase = minWorkersForDatabase;
  }

  /**
   * Getter for evaluationPeriod.
   * Period of metrics(in seconds) needs to be considered.
   **/
  @JsonProperty("evaluationPeriod")
  public Long getEvaluationPeriod() {
    return evaluationPeriod;
  }

  /**
   * Setter for evaluationPeriod.
   * Period of metrics(in seconds) needs to be considered.
   **/
  public void setEvaluationPeriod(Long evaluationPeriod) {
    this.evaluationPeriod = evaluationPeriod;
  }

  /**
   * Getter for minimumBlockCacheGb.
   * The amount of block cache, in Gigabytes, which the database should have.
   **/
  @JsonProperty("minimumBlockCacheGb")
  public Integer getMinimumBlockCacheGb() {
    return minimumBlockCacheGb;
  }

  /**
   * Setter for minimumBlockCacheGb.
   * The amount of block cache, in Gigabytes, which the database should have.
   **/
  public void setMinimumBlockCacheGb(Integer minimumBlockCacheGb) {
    this.minimumBlockCacheGb = minimumBlockCacheGb;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScalingParameters autoScalingParameters = (AutoScalingParameters) o;
    if (!Objects.equals(this.targetedValueForMetric, autoScalingParameters.targetedValueForMetric)) {
      return false;
    }
    if (!Objects.equals(this.maxWorkersForDatabase, autoScalingParameters.maxWorkersForDatabase)) {
      return false;
    }
    if (!Objects.equals(this.maxWorkersPerBatch, autoScalingParameters.maxWorkersPerBatch)) {
      return false;
    }
    if (!Objects.equals(this.minWorkersForDatabase, autoScalingParameters.minWorkersForDatabase)) {
      return false;
    }
    if (!Objects.equals(this.evaluationPeriod, autoScalingParameters.evaluationPeriod)) {
      return false;
    }
    if (!Objects.equals(this.minimumBlockCacheGb, autoScalingParameters.minimumBlockCacheGb)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetedValueForMetric, maxWorkersForDatabase, maxWorkersPerBatch, minWorkersForDatabase, evaluationPeriod, minimumBlockCacheGb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScalingParameters {\n");
    sb.append("    targetedValueForMetric: ").append(toIndentedString(targetedValueForMetric)).append("\n");
    sb.append("    maxWorkersForDatabase: ").append(toIndentedString(maxWorkersForDatabase)).append("\n");
    sb.append("    maxWorkersPerBatch: ").append(toIndentedString(maxWorkersPerBatch)).append("\n");
    sb.append("    minWorkersForDatabase: ").append(toIndentedString(minWorkersForDatabase)).append("\n");
    sb.append("    evaluationPeriod: ").append(toIndentedString(evaluationPeriod)).append("\n");
    sb.append("    minimumBlockCacheGb: ").append(toIndentedString(minimumBlockCacheGb)).append("\n");
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

