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

package com.cloudera.cdp.scim.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-21T12:39:06.812-07:00")
public class ScimName  {

  /**
   * 
   **/
  private String formatted = null;

  /**
   * 
   **/
  private String familyName = null;

  /**
   * 
   **/
  private String givenName = null;

  /**
   * 
   **/
  private String middleName = null;

  /**
   * 
   **/
  private String honorificPrefix = null;

  /**
   * 
   **/
  private String honorificSuffix = null;

  /**
   * Getter for formatted.
   * 
   **/
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }

  /**
   * Setter for formatted.
   * 
   **/
  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  /**
   * Getter for familyName.
   * 
   **/
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }

  /**
   * Setter for familyName.
   * 
   **/
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  /**
   * Getter for givenName.
   * 
   **/
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }

  /**
   * Setter for givenName.
   * 
   **/
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  /**
   * Getter for middleName.
   * 
   **/
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  /**
   * Setter for middleName.
   * 
   **/
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * Getter for honorificPrefix.
   * 
   **/
  @JsonProperty("honorificPrefix")
  public String getHonorificPrefix() {
    return honorificPrefix;
  }

  /**
   * Setter for honorificPrefix.
   * 
   **/
  public void setHonorificPrefix(String honorificPrefix) {
    this.honorificPrefix = honorificPrefix;
  }

  /**
   * Getter for honorificSuffix.
   * 
   **/
  @JsonProperty("honorificSuffix")
  public String getHonorificSuffix() {
    return honorificSuffix;
  }

  /**
   * Setter for honorificSuffix.
   * 
   **/
  public void setHonorificSuffix(String honorificSuffix) {
    this.honorificSuffix = honorificSuffix;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimName scimName = (ScimName) o;
    if (!Objects.equals(this.formatted, scimName.formatted)) {
      return false;
    }
    if (!Objects.equals(this.familyName, scimName.familyName)) {
      return false;
    }
    if (!Objects.equals(this.givenName, scimName.givenName)) {
      return false;
    }
    if (!Objects.equals(this.middleName, scimName.middleName)) {
      return false;
    }
    if (!Objects.equals(this.honorificPrefix, scimName.honorificPrefix)) {
      return false;
    }
    if (!Objects.equals(this.honorificSuffix, scimName.honorificSuffix)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatted, familyName, givenName, middleName, honorificPrefix, honorificSuffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimName {\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    honorificPrefix: ").append(toIndentedString(honorificPrefix)).append("\n");
    sb.append("    honorificSuffix: ").append(toIndentedString(honorificSuffix)).append("\n");
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

