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

package com.cloudera.cdp.cloudprivatelinks.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.cloudprivatelinks.model.RevokePrivateLinkServiceAccessResult;
import java.util.*;

/**
 * Response object for the RevokePrivateLinkServiceAccess method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:32.551-07:00")
public class RevokePrivateLinkServiceAccessResponse extends CdpResponse {

  /**
   * Status of private link service access revoke.
   **/
  private String status = null;

  /**
   * List of RevokePrivateLinkServiceAccessResult objects.
   **/
  private List<RevokePrivateLinkServiceAccessResult> revokePrivateLinkServiceAccessResults = new ArrayList<RevokePrivateLinkServiceAccessResult>();

  /**
   * Getter for status.
   * Status of private link service access revoke.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of private link service access revoke.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for revokePrivateLinkServiceAccessResults.
   * List of RevokePrivateLinkServiceAccessResult objects.
   **/
  @JsonProperty("revokePrivateLinkServiceAccessResults")
  public List<RevokePrivateLinkServiceAccessResult> getRevokePrivateLinkServiceAccessResults() {
    return revokePrivateLinkServiceAccessResults;
  }

  /**
   * Setter for revokePrivateLinkServiceAccessResults.
   * List of RevokePrivateLinkServiceAccessResult objects.
   **/
  public void setRevokePrivateLinkServiceAccessResults(List<RevokePrivateLinkServiceAccessResult> revokePrivateLinkServiceAccessResults) {
    this.revokePrivateLinkServiceAccessResults = revokePrivateLinkServiceAccessResults;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokePrivateLinkServiceAccessResponse revokePrivateLinkServiceAccessResponse = (RevokePrivateLinkServiceAccessResponse) o;
    if (!Objects.equals(this.status, revokePrivateLinkServiceAccessResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.revokePrivateLinkServiceAccessResults, revokePrivateLinkServiceAccessResponse.revokePrivateLinkServiceAccessResults)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, revokePrivateLinkServiceAccessResults, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokePrivateLinkServiceAccessResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    revokePrivateLinkServiceAccessResults: ").append(toIndentedString(revokePrivateLinkServiceAccessResults)).append("\n");
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

