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
import com.cloudera.cdp.iam.model.PolicyStatement;
import java.util.*;

/**
 * A policy contains a list of one or more policy statements.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-01-19T17:43:03.216-08:00")
public class Policy  {

  /**
   * The policy crn.
   **/
  private String crn = null;

  /**
   * The policy statements.
   **/
  private List<PolicyStatement> policyStatements = new ArrayList<PolicyStatement>();

  /**
   * Getter for crn.
   * The policy crn.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The policy crn.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for policyStatements.
   * The policy statements.
   **/
  @JsonProperty("policyStatements")
  public List<PolicyStatement> getPolicyStatements() {
    return policyStatements;
  }

  /**
   * Setter for policyStatements.
   * The policy statements.
   **/
  public void setPolicyStatements(List<PolicyStatement> policyStatements) {
    this.policyStatements = policyStatements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    if (!Objects.equals(this.crn, policy.crn)) {
      return false;
    }
    if (!Objects.equals(this.policyStatements, policy.policyStatements)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, policyStatements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    policyStatements: ").append(toIndentedString(policyStatements)).append("\n");
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

