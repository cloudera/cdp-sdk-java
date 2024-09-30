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

package com.cloudera.cdp.imagecatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.imagecatalog.model.CustomImageCatalog;
import java.util.*;

/**
 * The response object for the list of registered image catalogs.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-27T08:40:28.993-07:00")
public class ListCustomCatalogsResponse extends CdpResponse {

  /**
   * The list of registered image catalogs
   **/
  private List<CustomImageCatalog> imageCatalogs = new ArrayList<CustomImageCatalog>();

  /**
   * Getter for imageCatalogs.
   * The list of registered image catalogs
   **/
  @JsonProperty("imageCatalogs")
  public List<CustomImageCatalog> getImageCatalogs() {
    return imageCatalogs;
  }

  /**
   * Setter for imageCatalogs.
   * The list of registered image catalogs
   **/
  public void setImageCatalogs(List<CustomImageCatalog> imageCatalogs) {
    this.imageCatalogs = imageCatalogs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCustomCatalogsResponse listCustomCatalogsResponse = (ListCustomCatalogsResponse) o;
    if (!Objects.equals(this.imageCatalogs, listCustomCatalogsResponse.imageCatalogs)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageCatalogs, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomCatalogsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageCatalogs: ").append(toIndentedString(imageCatalogs)).append("\n");
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

