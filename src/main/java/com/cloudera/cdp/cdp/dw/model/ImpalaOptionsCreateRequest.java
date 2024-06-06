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
 * Impala specific options. It cannot be provided for Virtual Warehouse types other than Impala.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:30:57.248-07:00")
public class ImpalaOptionsCreateRequest  {

  /**
   * Set S3 URI in \"s3://bucket/path\" format and enable spilling to S3. If this is set, \"scratchSpaceLimit\" cannot be set. Spilling to a remote storage is not supported on Azure, it is available on AWS and PvC platforms. If your workload results in large volumes of intermediate data being written, it is recommended to configure the heavy spilling queries to use a remote storage location rather than the local one since Impala occasionally needs to use persistent storage for writing intermediate files during large sorts, joins, aggregations, or analytic function operations. Note that this value is ignored if the Impala version does not support spilling to S3.
   **/
  private String spillToS3Uri = null;

  /**
   * Defines the limit for scratch space in GiB needed by Impala for spilling queries. If this is set, \"spillToS3Uri\" cannot be set. The valid values are between 1-16000 for AWS and 1-16684 for Azure. It will choose the first valid value for which the total disk space is greater than or equal to the specified scratch space limit. The valid scratch space limit values per node in GiBs for AWS are [300, 634, 968, 1302, 1636, 1970, 2304, 2638, 2972, 6550, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000, 16000]. Valid values for Azure are [300, 684, 812, 1068, 1324, 1836, 2348, 3372, 4396, 8492, 16684].
   **/
  private Integer scratchSpaceLimit = null;

  /**
   * Getter for spillToS3Uri.
   * Set S3 URI in \&quot;s3://bucket/path\&quot; format and enable spilling to S3. If this is set, \&quot;scratchSpaceLimit\&quot; cannot be set. Spilling to a remote storage is not supported on Azure, it is available on AWS and PvC platforms. If your workload results in large volumes of intermediate data being written, it is recommended to configure the heavy spilling queries to use a remote storage location rather than the local one since Impala occasionally needs to use persistent storage for writing intermediate files during large sorts, joins, aggregations, or analytic function operations. Note that this value is ignored if the Impala version does not support spilling to S3.
   **/
  @JsonProperty("spillToS3Uri")
  public String getSpillToS3Uri() {
    return spillToS3Uri;
  }

  /**
   * Setter for spillToS3Uri.
   * Set S3 URI in \&quot;s3://bucket/path\&quot; format and enable spilling to S3. If this is set, \&quot;scratchSpaceLimit\&quot; cannot be set. Spilling to a remote storage is not supported on Azure, it is available on AWS and PvC platforms. If your workload results in large volumes of intermediate data being written, it is recommended to configure the heavy spilling queries to use a remote storage location rather than the local one since Impala occasionally needs to use persistent storage for writing intermediate files during large sorts, joins, aggregations, or analytic function operations. Note that this value is ignored if the Impala version does not support spilling to S3.
   **/
  public void setSpillToS3Uri(String spillToS3Uri) {
    this.spillToS3Uri = spillToS3Uri;
  }

  /**
   * Getter for scratchSpaceLimit.
   * Defines the limit for scratch space in GiB needed by Impala for spilling queries. If this is set, \&quot;spillToS3Uri\&quot; cannot be set. The valid values are between 1-16000 for AWS and 1-16684 for Azure. It will choose the first valid value for which the total disk space is greater than or equal to the specified scratch space limit. The valid scratch space limit values per node in GiBs for AWS are [300, 634, 968, 1302, 1636, 1970, 2304, 2638, 2972, 6550, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000, 16000]. Valid values for Azure are [300, 684, 812, 1068, 1324, 1836, 2348, 3372, 4396, 8492, 16684].
   **/
  @JsonProperty("scratchSpaceLimit")
  public Integer getScratchSpaceLimit() {
    return scratchSpaceLimit;
  }

  /**
   * Setter for scratchSpaceLimit.
   * Defines the limit for scratch space in GiB needed by Impala for spilling queries. If this is set, \&quot;spillToS3Uri\&quot; cannot be set. The valid values are between 1-16000 for AWS and 1-16684 for Azure. It will choose the first valid value for which the total disk space is greater than or equal to the specified scratch space limit. The valid scratch space limit values per node in GiBs for AWS are [300, 634, 968, 1302, 1636, 1970, 2304, 2638, 2972, 6550, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000, 16000]. Valid values for Azure are [300, 684, 812, 1068, 1324, 1836, 2348, 3372, 4396, 8492, 16684].
   **/
  public void setScratchSpaceLimit(Integer scratchSpaceLimit) {
    this.scratchSpaceLimit = scratchSpaceLimit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaOptionsCreateRequest impalaOptionsCreateRequest = (ImpalaOptionsCreateRequest) o;
    if (!Objects.equals(this.spillToS3Uri, impalaOptionsCreateRequest.spillToS3Uri)) {
      return false;
    }
    if (!Objects.equals(this.scratchSpaceLimit, impalaOptionsCreateRequest.scratchSpaceLimit)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(spillToS3Uri, scratchSpaceLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaOptionsCreateRequest {\n");
    sb.append("    spillToS3Uri: ").append(toIndentedString(spillToS3Uri)).append("\n");
    sb.append("    scratchSpaceLimit: ").append(toIndentedString(scratchSpaceLimit)).append("\n");
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

