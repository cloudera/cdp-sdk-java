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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Versions of the CDP runtime and Operating system components.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:46.837-07:00")
public class ComponentsVersion  {

  /**
   * Version of Cloudera Manager.
   **/
  private String cm = null;

  /**
   * CDP Runtime version.
   **/
  private String cdp = null;

  /**
   * Operation System name and version.
   **/
  private String os = null;

  /**
   * Operation System patch level.
   **/
  private String osPatchLevel = null;

  /**
   * Getter for cm.
   * Version of Cloudera Manager.
   **/
  @JsonProperty("cm")
  public String getCm() {
    return cm;
  }

  /**
   * Setter for cm.
   * Version of Cloudera Manager.
   **/
  public void setCm(String cm) {
    this.cm = cm;
  }

  /**
   * Getter for cdp.
   * CDP Runtime version.
   **/
  @JsonProperty("cdp")
  public String getCdp() {
    return cdp;
  }

  /**
   * Setter for cdp.
   * CDP Runtime version.
   **/
  public void setCdp(String cdp) {
    this.cdp = cdp;
  }

  /**
   * Getter for os.
   * Operation System name and version.
   **/
  @JsonProperty("os")
  public String getOs() {
    return os;
  }

  /**
   * Setter for os.
   * Operation System name and version.
   **/
  public void setOs(String os) {
    this.os = os;
  }

  /**
   * Getter for osPatchLevel.
   * Operation System patch level.
   **/
  @JsonProperty("osPatchLevel")
  public String getOsPatchLevel() {
    return osPatchLevel;
  }

  /**
   * Setter for osPatchLevel.
   * Operation System patch level.
   **/
  public void setOsPatchLevel(String osPatchLevel) {
    this.osPatchLevel = osPatchLevel;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentsVersion componentsVersion = (ComponentsVersion) o;
    if (!Objects.equals(this.cm, componentsVersion.cm)) {
      return false;
    }
    if (!Objects.equals(this.cdp, componentsVersion.cdp)) {
      return false;
    }
    if (!Objects.equals(this.os, componentsVersion.os)) {
      return false;
    }
    if (!Objects.equals(this.osPatchLevel, componentsVersion.osPatchLevel)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cm, cdp, os, osPatchLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentsVersion {\n");
    sb.append("    cm: ").append(toIndentedString(cm)).append("\n");
    sb.append("    cdp: ").append(toIndentedString(cdp)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osPatchLevel: ").append(toIndentedString(osPatchLevel)).append("\n");
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

