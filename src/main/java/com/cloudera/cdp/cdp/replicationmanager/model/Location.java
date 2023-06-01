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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Location object.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-01T14:27:23.270-07:00")
public class Location  {

  /**
   * Location ID.
   **/
  private Long id = null;

  /**
   * Country.
   **/
  private String country = null;

  /**
   * City.
   **/
  private String city = null;

  /**
   * Latitude.
   **/
  private Double latitude = null;

  /**
   * Longitude.
   **/
  private Double longitude = null;

  /**
   * Getter for id.
   * Location ID.
   **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Setter for id.
   * Location ID.
   **/
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Getter for country.
   * Country.
   **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  /**
   * Setter for country.
   * Country.
   **/
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Getter for city.
   * City.
   **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  /**
   * Setter for city.
   * City.
   **/
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Getter for latitude.
   * Latitude.
   **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  /**
   * Setter for latitude.
   * Latitude.
   **/
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * Getter for longitude.
   * Longitude.
   **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  /**
   * Setter for longitude.
   * Longitude.
   **/
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    if (!Objects.equals(this.id, location.id)) {
      return false;
    }
    if (!Objects.equals(this.country, location.country)) {
      return false;
    }
    if (!Objects.equals(this.city, location.city)) {
      return false;
    }
    if (!Objects.equals(this.latitude, location.latitude)) {
      return false;
    }
    if (!Objects.equals(this.longitude, location.longitude)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, country, city, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

