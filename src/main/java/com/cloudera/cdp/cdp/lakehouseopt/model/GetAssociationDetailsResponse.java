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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.lakehouseopt.model.DirectAssociationDetails;
import com.cloudera.cdp.lakehouseopt.model.StarAssociationDetails;
import java.util.*;

/**
 * Response object containing the association details. It contains direct table to policy associations and policy to entire namespace associations.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class GetAssociationDetailsResponse extends CdpResponse {

  /**
   * The direct table to policy associations for each namespace.
   **/
  private List<DirectAssociationDetails> directionAssociation = new ArrayList<DirectAssociationDetails>();

  /**
   * The policy to entire namespace associations for each catalog.
   **/
  private List<StarAssociationDetails> starAssociation = new ArrayList<StarAssociationDetails>();

  /**
   * Getter for directionAssociation.
   * The direct table to policy associations for each namespace.
   **/
  @JsonProperty("directionAssociation")
  public List<DirectAssociationDetails> getDirectionAssociation() {
    return directionAssociation;
  }

  /**
   * Setter for directionAssociation.
   * The direct table to policy associations for each namespace.
   **/
  public void setDirectionAssociation(List<DirectAssociationDetails> directionAssociation) {
    this.directionAssociation = directionAssociation;
  }

  /**
   * Getter for starAssociation.
   * The policy to entire namespace associations for each catalog.
   **/
  @JsonProperty("starAssociation")
  public List<StarAssociationDetails> getStarAssociation() {
    return starAssociation;
  }

  /**
   * Setter for starAssociation.
   * The policy to entire namespace associations for each catalog.
   **/
  public void setStarAssociation(List<StarAssociationDetails> starAssociation) {
    this.starAssociation = starAssociation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssociationDetailsResponse getAssociationDetailsResponse = (GetAssociationDetailsResponse) o;
    if (!Objects.equals(this.directionAssociation, getAssociationDetailsResponse.directionAssociation)) {
      return false;
    }
    if (!Objects.equals(this.starAssociation, getAssociationDetailsResponse.starAssociation)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionAssociation, starAssociation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssociationDetailsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    directionAssociation: ").append(toIndentedString(directionAssociation)).append("\n");
    sb.append("    starAssociation: ").append(toIndentedString(starAssociation)).append("\n");
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

