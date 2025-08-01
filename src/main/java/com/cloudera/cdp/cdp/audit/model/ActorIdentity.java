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

package com.cloudera.cdp.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Identity information about the actor that initiated an event. Only one of the fields in this message may be set.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:43.638-07:00")
public class ActorIdentity  {

  /**
   * The CRN of the actor who initiated this event.
   **/
  private String actorCrn = null;

  /**
   * The name of the service that initiated this event. It must be the name of a service as enumerated in the CRN definition.
   **/
  private String actorServiceName = null;

  /**
   * Getter for actorCrn.
   * The CRN of the actor who initiated this event.
   **/
  @JsonProperty("actorCrn")
  public String getActorCrn() {
    return actorCrn;
  }

  /**
   * Setter for actorCrn.
   * The CRN of the actor who initiated this event.
   **/
  public void setActorCrn(String actorCrn) {
    this.actorCrn = actorCrn;
  }

  /**
   * Getter for actorServiceName.
   * The name of the service that initiated this event. It must be the name of a service as enumerated in the CRN definition.
   **/
  @JsonProperty("actorServiceName")
  public String getActorServiceName() {
    return actorServiceName;
  }

  /**
   * Setter for actorServiceName.
   * The name of the service that initiated this event. It must be the name of a service as enumerated in the CRN definition.
   **/
  public void setActorServiceName(String actorServiceName) {
    this.actorServiceName = actorServiceName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActorIdentity actorIdentity = (ActorIdentity) o;
    if (!Objects.equals(this.actorCrn, actorIdentity.actorCrn)) {
      return false;
    }
    if (!Objects.equals(this.actorServiceName, actorIdentity.actorServiceName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorCrn, actorServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActorIdentity {\n");
    sb.append("    actorCrn: ").append(toIndentedString(actorCrn)).append("\n");
    sb.append("    actorServiceName: ").append(toIndentedString(actorServiceName)).append("\n");
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

