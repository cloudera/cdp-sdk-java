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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object to get the default identity provider.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-12T14:16:21.667-07:00")
public class GetDefaultIdentityProviderResponse extends CdpResponse {

  /**
   * The CRN of the identity provider used for CDP initiated login requests. The CRN could be a user defined identity provider's CRN or one of the CDP built-ins (like Cloudera SSO). To retrieve more information about your own user-defined saml providers (or other provider types, not the default ones) call the relevant describeXXXProvider, e.g. for SAML providers call describeSamlProvider.
   **/
  private String crn = null;

  /**
   * Getter for crn.
   * The CRN of the identity provider used for CDP initiated login requests. The CRN could be a user defined identity provider&#39;s CRN or one of the CDP built-ins (like Cloudera SSO). To retrieve more information about your own user-defined saml providers (or other provider types, not the default ones) call the relevant describeXXXProvider, e.g. for SAML providers call describeSamlProvider.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the identity provider used for CDP initiated login requests. The CRN could be a user defined identity provider&#39;s CRN or one of the CDP built-ins (like Cloudera SSO). To retrieve more information about your own user-defined saml providers (or other provider types, not the default ones) call the relevant describeXXXProvider, e.g. for SAML providers call describeSamlProvider.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDefaultIdentityProviderResponse getDefaultIdentityProviderResponse = (GetDefaultIdentityProviderResponse) o;
    if (!Objects.equals(this.crn, getDefaultIdentityProviderResponse.crn)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDefaultIdentityProviderResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
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

