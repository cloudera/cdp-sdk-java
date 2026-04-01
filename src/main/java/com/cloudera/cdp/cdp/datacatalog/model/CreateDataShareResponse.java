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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response of the Create Data Share operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class CreateDataShareResponse extends CdpResponse {

  /**
   * The unique identifier of the created Data Share.
   **/
  private String dataShareId = null;

  /**
   * The name of the created Data Share.
   **/
  private String dataShareName = null;

  /**
   * The CRN of the Data Lake where the Data Share was created.
   **/
  private String datalakeCrn = null;

  /**
   * Getter for dataShareId.
   * The unique identifier of the created Data Share.
   **/
  @JsonProperty("dataShareId")
  public String getDataShareId() {
    return dataShareId;
  }

  /**
   * Setter for dataShareId.
   * The unique identifier of the created Data Share.
   **/
  public void setDataShareId(String dataShareId) {
    this.dataShareId = dataShareId;
  }

  /**
   * Getter for dataShareName.
   * The name of the created Data Share.
   **/
  @JsonProperty("dataShareName")
  public String getDataShareName() {
    return dataShareName;
  }

  /**
   * Setter for dataShareName.
   * The name of the created Data Share.
   **/
  public void setDataShareName(String dataShareName) {
    this.dataShareName = dataShareName;
  }

  /**
   * Getter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share was created.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share was created.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataShareResponse createDataShareResponse = (CreateDataShareResponse) o;
    if (!Objects.equals(this.dataShareId, createDataShareResponse.dataShareId)) {
      return false;
    }
    if (!Objects.equals(this.dataShareName, createDataShareResponse.dataShareName)) {
      return false;
    }
    if (!Objects.equals(this.datalakeCrn, createDataShareResponse.datalakeCrn)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataShareId, dataShareName, datalakeCrn, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataShareResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataShareId: ").append(toIndentedString(dataShareId)).append("\n");
    sb.append("    dataShareName: ").append(toIndentedString(dataShareName)).append("\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
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

