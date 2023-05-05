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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.HdfsArguments;
import com.cloudera.cdp.replicationmanager.model.HiveArguments;

/**
 * Extra properties for the source dataset.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-05-04T19:25:17.129-07:00")
public class SourceDataset  {

  /**
   * HDFS arguments for HDFS and Hive replication.
   **/
  private HdfsArguments hdfsArguments = null;

  /**
   * Arguments for Hive replication, null if HDFS replication.
   **/
  private HiveArguments hiveArguments = null;

  /**
   * Getter for hdfsArguments.
   * HDFS arguments for HDFS and Hive replication.
   **/
  @JsonProperty("hdfsArguments")
  public HdfsArguments getHdfsArguments() {
    return hdfsArguments;
  }

  /**
   * Setter for hdfsArguments.
   * HDFS arguments for HDFS and Hive replication.
   **/
  public void setHdfsArguments(HdfsArguments hdfsArguments) {
    this.hdfsArguments = hdfsArguments;
  }

  /**
   * Getter for hiveArguments.
   * Arguments for Hive replication, null if HDFS replication.
   **/
  @JsonProperty("hiveArguments")
  public HiveArguments getHiveArguments() {
    return hiveArguments;
  }

  /**
   * Setter for hiveArguments.
   * Arguments for Hive replication, null if HDFS replication.
   **/
  public void setHiveArguments(HiveArguments hiveArguments) {
    this.hiveArguments = hiveArguments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceDataset sourceDataset = (SourceDataset) o;
    if (!Objects.equals(this.hdfsArguments, sourceDataset.hdfsArguments)) {
      return false;
    }
    if (!Objects.equals(this.hiveArguments, sourceDataset.hiveArguments)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hdfsArguments, hiveArguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceDataset {\n");
    sb.append("    hdfsArguments: ").append(toIndentedString(hdfsArguments)).append("\n");
    sb.append("    hiveArguments: ").append(toIndentedString(hiveArguments)).append("\n");
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

