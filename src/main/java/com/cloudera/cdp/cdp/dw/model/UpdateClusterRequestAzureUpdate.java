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
 * Additional properties for Azure clusters.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-29T13:23:32.620-08:00")
public class UpdateClusterRequestAzureUpdate  {

  /**
   * Renew Azure cluster certificate.
   **/
  private Boolean renewCertificate = false;

  /**
   * Getter for renewCertificate.
   * Renew Azure cluster certificate.
   **/
  @JsonProperty("renewCertificate")
  public Boolean getRenewCertificate() {
    return renewCertificate;
  }

  /**
   * Setter for renewCertificate.
   * Renew Azure cluster certificate.
   **/
  public void setRenewCertificate(Boolean renewCertificate) {
    this.renewCertificate = renewCertificate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClusterRequestAzureUpdate updateClusterRequestAzureUpdate = (UpdateClusterRequestAzureUpdate) o;
    if (!Objects.equals(this.renewCertificate, updateClusterRequestAzureUpdate.renewCertificate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(renewCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClusterRequestAzureUpdate {\n");
    sb.append("    renewCertificate: ").append(toIndentedString(renewCertificate)).append("\n");
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

