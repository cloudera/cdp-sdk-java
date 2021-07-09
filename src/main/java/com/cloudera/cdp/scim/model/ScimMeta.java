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
import java.time.ZonedDateTime;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-09T16:32:34.128-07:00")
public class ScimMeta  {

  /**
   * 
   **/
  private String resourceType = null;

  /**
   * 
   **/
  private ZonedDateTime created = null;

  /**
   * 
   **/
  private ZonedDateTime lastModified = null;

  /**
   * 
   **/
  private String location = null;

  /**
   * 
   **/
  private String version = null;

  /**
   * Getter for resourceType.
   * 
   **/
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Setter for resourceType.
   * 
   **/
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * Getter for created.
   * 
   **/
  @JsonProperty("created")
  public ZonedDateTime getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * 
   **/
  public void setCreated(ZonedDateTime created) {
    this.created = created;
  }

  /**
   * Getter for lastModified.
   * 
   **/
  @JsonProperty("lastModified")
  public ZonedDateTime getLastModified() {
    return lastModified;
  }

  /**
   * Setter for lastModified.
   * 
   **/
  public void setLastModified(ZonedDateTime lastModified) {
    this.lastModified = lastModified;
  }

  /**
   * Getter for location.
   * 
   **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  /**
   * Setter for location.
   * 
   **/
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Getter for version.
   * 
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * 
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimMeta scimMeta = (ScimMeta) o;
    if (!Objects.equals(this.resourceType, scimMeta.resourceType)) {
      return false;
    }
    if (!Objects.equals(this.created, scimMeta.created)) {
      return false;
    }
    if (!Objects.equals(this.lastModified, scimMeta.lastModified)) {
      return false;
    }
    if (!Objects.equals(this.location, scimMeta.location)) {
      return false;
    }
    if (!Objects.equals(this.version, scimMeta.version)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, created, lastModified, location, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimMeta {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

