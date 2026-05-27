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

/**
 * Describes a timezone.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:05.230-07:00")
public class TimezoneObject  {

  /**
   * The timezone id.
   **/
  private String id = null;

  /**
   * The timezone display name.
   **/
  private String displayName = null;

  /**
   * The offset in milliseconds from UTC.
   **/
  private Integer offset = null;

  /**
   * Getter for id.
   * The timezone id.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The timezone id.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for displayName.
   * The timezone display name.
   **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Setter for displayName.
   * The timezone display name.
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Getter for offset.
   * The offset in milliseconds from UTC.
   **/
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  /**
   * Setter for offset.
   * The offset in milliseconds from UTC.
   **/
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneObject timezoneObject = (TimezoneObject) o;
    if (!Objects.equals(this.id, timezoneObject.id)) {
      return false;
    }
    if (!Objects.equals(this.displayName, timezoneObject.displayName)) {
      return false;
    }
    if (!Objects.equals(this.offset, timezoneObject.offset)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

