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
import com.cloudera.cdp.cloudprivatelinks.model.AuthorizePrivateLinkServiceAccessResult;
import java.util.*;

/**
 * Response object for the AuthorizePrivateLinkServicesAccess method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:32.006-07:00")
public class AuthorizePrivateLinkServiceAccessResponse extends CdpResponse {

  /**
   * List of AuthorizePrivateLinkServiceAccessResult objects.
   **/
  private List<AuthorizePrivateLinkServiceAccessResult> authorizePrivateLinkServiceAccessResults = new ArrayList<AuthorizePrivateLinkServiceAccessResult>();

  /**
   * Status of private link service access authorization.
   **/
  private String status = null;

  /**
   * Getter for authorizePrivateLinkServiceAccessResults.
   * List of AuthorizePrivateLinkServiceAccessResult objects.
   **/
  @JsonProperty("authorizePrivateLinkServiceAccessResults")
  public List<AuthorizePrivateLinkServiceAccessResult> getAuthorizePrivateLinkServiceAccessResults() {
    return authorizePrivateLinkServiceAccessResults;
  }

  /**
   * Setter for authorizePrivateLinkServiceAccessResults.
   * List of AuthorizePrivateLinkServiceAccessResult objects.
   **/
  public void setAuthorizePrivateLinkServiceAccessResults(List<AuthorizePrivateLinkServiceAccessResult> authorizePrivateLinkServiceAccessResults) {
    this.authorizePrivateLinkServiceAccessResults = authorizePrivateLinkServiceAccessResults;
  }

  /**
   * Getter for status.
   * Status of private link service access authorization.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of private link service access authorization.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizePrivateLinkServiceAccessResponse authorizePrivateLinkServiceAccessResponse = (AuthorizePrivateLinkServiceAccessResponse) o;
    if (!Objects.equals(this.authorizePrivateLinkServiceAccessResults, authorizePrivateLinkServiceAccessResponse.authorizePrivateLinkServiceAccessResults)) {
      return false;
    }
    if (!Objects.equals(this.status, authorizePrivateLinkServiceAccessResponse.status)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizePrivateLinkServiceAccessResults, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizePrivateLinkServiceAccessResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    authorizePrivateLinkServiceAccessResults: ").append(toIndentedString(authorizePrivateLinkServiceAccessResults)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

