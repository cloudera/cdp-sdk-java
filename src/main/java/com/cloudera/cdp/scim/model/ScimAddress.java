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

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-06-25T14:27:48.608-07:00")
public class ScimAddress  {

  /**
   * 
   **/
  private String type = null;

  /**
   * 
   **/
  private Boolean primary = null;

  /**
   * 
   **/
  private String formatted = null;

  /**
   * 
   **/
  private String streetAddress = null;

  /**
   * 
   **/
  private String locality = null;

  /**
   * 
   **/
  private String region = null;

  /**
   * 
   **/
  private String postalCode = null;

  /**
   * 
   **/
  private String country = null;

  /**
   * Getter for type.
   * 
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * 
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for primary.
   * 
   **/
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }

  /**
   * Setter for primary.
   * 
   **/
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

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
   * Getter for streetAddress.
   * 
   **/
  @JsonProperty("streetAddress")
  public String getStreetAddress() {
    return streetAddress;
  }

  /**
   * Setter for streetAddress.
   * 
   **/
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  /**
   * Getter for locality.
   * 
   **/
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }

  /**
   * Setter for locality.
   * 
   **/
  public void setLocality(String locality) {
    this.locality = locality;
  }

  /**
   * Getter for region.
   * 
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * 
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for postalCode.
   * 
   **/
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * Setter for postalCode.
   * 
   **/
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * Getter for country.
   * 
   **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  /**
   * Setter for country.
   * 
   **/
  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimAddress scimAddress = (ScimAddress) o;
    if (!Objects.equals(this.type, scimAddress.type)) {
      return false;
    }
    if (!Objects.equals(this.primary, scimAddress.primary)) {
      return false;
    }
    if (!Objects.equals(this.formatted, scimAddress.formatted)) {
      return false;
    }
    if (!Objects.equals(this.streetAddress, scimAddress.streetAddress)) {
      return false;
    }
    if (!Objects.equals(this.locality, scimAddress.locality)) {
      return false;
    }
    if (!Objects.equals(this.region, scimAddress.region)) {
      return false;
    }
    if (!Objects.equals(this.postalCode, scimAddress.postalCode)) {
      return false;
    }
    if (!Objects.equals(this.country, scimAddress.country)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, primary, formatted, streetAddress, locality, region, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimAddress {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

