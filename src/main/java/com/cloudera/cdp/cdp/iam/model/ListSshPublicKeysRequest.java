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
 * Request object for list SSH public key.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-12-16T12:55:42.002-08:00")
public class ListSshPublicKeysRequest  {

  /**
   * The CRN of the user or machine user to list SSH public keys for. If it is not included, it defaults to the actor making the request.
   **/
  private String actorCrn = null;

  /**
   * Getter for actorCrn.
   * The CRN of the user or machine user to list SSH public keys for. If it is not included, it defaults to the actor making the request.
   **/
  @JsonProperty("actorCrn")
  public String getActorCrn() {
    return actorCrn;
  }

  /**
   * Setter for actorCrn.
   * The CRN of the user or machine user to list SSH public keys for. If it is not included, it defaults to the actor making the request.
   **/
  public void setActorCrn(String actorCrn) {
    this.actorCrn = actorCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSshPublicKeysRequest listSshPublicKeysRequest = (ListSshPublicKeysRequest) o;
    if (!Objects.equals(this.actorCrn, listSshPublicKeysRequest.actorCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSshPublicKeysRequest {\n");
    sb.append("    actorCrn: ").append(toIndentedString(actorCrn)).append("\n");
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

