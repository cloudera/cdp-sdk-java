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
import com.cloudera.cdp.iam.model.AccessKeyLastUsage;
import java.time.ZonedDateTime;

/**
 * Information about a Cloudera CDP access key.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-29T14:24:31.449-07:00")
public class AccessKey  {

  /**
   * The ID of the access key.
   **/
  private String accessKeyId = null;

  /**
   * The CRN of the access key.
   **/
  private String crn = null;

  /**
   * The CRN of the actor with which this access key is associated.
   **/
  private String actorCrn = null;

  /**
   * The date when the access key was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The status of an access key.
   **/
  private String status = null;

  /**
   * The type of an access key.
   **/
  private String type = null;

  /**
   * Information on the last time this access key was used.
   **/
  private AccessKeyLastUsage lastUsage = null;

  /**
   * Getter for accessKeyId.
   * The ID of the access key.
   **/
  @JsonProperty("accessKeyId")
  public String getAccessKeyId() {
    return accessKeyId;
  }

  /**
   * Setter for accessKeyId.
   * The ID of the access key.
   **/
  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  /**
   * Getter for crn.
   * The CRN of the access key.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the access key.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for actorCrn.
   * The CRN of the actor with which this access key is associated.
   **/
  @JsonProperty("actorCrn")
  public String getActorCrn() {
    return actorCrn;
  }

  /**
   * Setter for actorCrn.
   * The CRN of the actor with which this access key is associated.
   **/
  public void setActorCrn(String actorCrn) {
    this.actorCrn = actorCrn;
  }

  /**
   * Getter for creationDate.
   * The date when the access key was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when the access key was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for status.
   * The status of an access key.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of an access key.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for type.
   * The type of an access key.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The type of an access key.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for lastUsage.
   * Information on the last time this access key was used.
   **/
  @JsonProperty("lastUsage")
  public AccessKeyLastUsage getLastUsage() {
    return lastUsage;
  }

  /**
   * Setter for lastUsage.
   * Information on the last time this access key was used.
   **/
  public void setLastUsage(AccessKeyLastUsage lastUsage) {
    this.lastUsage = lastUsage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKey accessKey = (AccessKey) o;
    if (!Objects.equals(this.accessKeyId, accessKey.accessKeyId)) {
      return false;
    }
    if (!Objects.equals(this.crn, accessKey.crn)) {
      return false;
    }
    if (!Objects.equals(this.actorCrn, accessKey.actorCrn)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, accessKey.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.status, accessKey.status)) {
      return false;
    }
    if (!Objects.equals(this.type, accessKey.type)) {
      return false;
    }
    if (!Objects.equals(this.lastUsage, accessKey.lastUsage)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, crn, actorCrn, creationDate, status, type, lastUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKey {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    actorCrn: ").append(toIndentedString(actorCrn)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lastUsage: ").append(toIndentedString(lastUsage)).append("\n");
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

