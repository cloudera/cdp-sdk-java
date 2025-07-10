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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Storage spec response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:16.086-07:00")
public class CommonStorageSpecResp  {

  /**
   * Flag to enable CSI (Container Storage Interface). It further sets specific inline cloud formation policies required for CSI.
   **/
  private Boolean csiEnabled = null;

  /**
   * Getter for csiEnabled.
   * Flag to enable CSI (Container Storage Interface). It further sets specific inline cloud formation policies required for CSI.
   **/
  @JsonProperty("csiEnabled")
  public Boolean getCsiEnabled() {
    return csiEnabled;
  }

  /**
   * Setter for csiEnabled.
   * Flag to enable CSI (Container Storage Interface). It further sets specific inline cloud formation policies required for CSI.
   **/
  public void setCsiEnabled(Boolean csiEnabled) {
    this.csiEnabled = csiEnabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonStorageSpecResp commonStorageSpecResp = (CommonStorageSpecResp) o;
    if (!Objects.equals(this.csiEnabled, commonStorageSpecResp.csiEnabled)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(csiEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonStorageSpecResp {\n");
    sb.append("    csiEnabled: ").append(toIndentedString(csiEnabled)).append("\n");
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

