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
import com.cloudera.cdp.scim.model.ScimMember;
import com.cloudera.cdp.scim.model.ScimMeta;
import java.util.*;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-05-26T12:44:37.573-07:00")
public class ScimGroup  {

  /**
   * 
   **/
  private List<String> schemas = new ArrayList<String>();

  /**
   * 
   **/
  private String id = null;

  /**
   * 
   **/
  private String externalId = null;

  /**
   * 
   **/
  private ScimMeta meta = null;

  /**
   * 
   **/
  private String displayName = null;

  /**
   * 
   **/
  private List<ScimMember> members = new ArrayList<ScimMember>();

  /**
   * Getter for schemas.
   * 
   **/
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }

  /**
   * Setter for schemas.
   * 
   **/
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  /**
   * Getter for id.
   * 
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * 
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for externalId.
   * 
   **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  /**
   * Setter for externalId.
   * 
   **/
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Getter for meta.
   * 
   **/
  @JsonProperty("meta")
  public ScimMeta getMeta() {
    return meta;
  }

  /**
   * Setter for meta.
   * 
   **/
  public void setMeta(ScimMeta meta) {
    this.meta = meta;
  }

  /**
   * Getter for displayName.
   * 
   **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Setter for displayName.
   * 
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Getter for members.
   * 
   **/
  @JsonProperty("members")
  public List<ScimMember> getMembers() {
    return members;
  }

  /**
   * Setter for members.
   * 
   **/
  public void setMembers(List<ScimMember> members) {
    this.members = members;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGroup scimGroup = (ScimGroup) o;
    if (!Objects.equals(this.schemas, scimGroup.schemas)) {
      return false;
    }
    if (!Objects.equals(this.id, scimGroup.id)) {
      return false;
    }
    if (!Objects.equals(this.externalId, scimGroup.externalId)) {
      return false;
    }
    if (!Objects.equals(this.meta, scimGroup.meta)) {
      return false;
    }
    if (!Objects.equals(this.displayName, scimGroup.displayName)) {
      return false;
    }
    if (!Objects.equals(this.members, scimGroup.members)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, externalId, meta, displayName, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroup {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

