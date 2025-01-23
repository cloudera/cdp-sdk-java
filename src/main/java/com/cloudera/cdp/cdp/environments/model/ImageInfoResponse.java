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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Information about FreeIPA image.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:40.736-08:00")
public class ImageInfoResponse extends CdpResponse {

  /**
   * Image catalog URL.
   **/
  private String catalog = null;

  /**
   * Virtual machine image ID from ImageCatalog, machines of the cluster will be started from this image.
   **/
  private String id = null;

  /**
   * OS type of the image, this property is only considered when no specific image ID is provided.
   **/
  private String os = null;

  /**
   * Image name
   **/
  private String imageName = null;

  /**
   * Creation date of the image from catalog.
   **/
  private String date = null;

  /**
   * Image catalog name.
   **/
  private String catalogName = null;

  /**
   * Getter for catalog.
   * Image catalog URL.
   **/
  @JsonProperty("catalog")
  public String getCatalog() {
    return catalog;
  }

  /**
   * Setter for catalog.
   * Image catalog URL.
   **/
  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }

  /**
   * Getter for id.
   * Virtual machine image ID from ImageCatalog, machines of the cluster will be started from this image.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Virtual machine image ID from ImageCatalog, machines of the cluster will be started from this image.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for os.
   * OS type of the image, this property is only considered when no specific image ID is provided.
   **/
  @JsonProperty("os")
  public String getOs() {
    return os;
  }

  /**
   * Setter for os.
   * OS type of the image, this property is only considered when no specific image ID is provided.
   **/
  public void setOs(String os) {
    this.os = os;
  }

  /**
   * Getter for imageName.
   * Image name
   **/
  @JsonProperty("imageName")
  public String getImageName() {
    return imageName;
  }

  /**
   * Setter for imageName.
   * Image name
   **/
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  /**
   * Getter for date.
   * Creation date of the image from catalog.
   **/
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  /**
   * Setter for date.
   * Creation date of the image from catalog.
   **/
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * Getter for catalogName.
   * Image catalog name.
   **/
  @JsonProperty("catalogName")
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Setter for catalogName.
   * Image catalog name.
   **/
  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInfoResponse imageInfoResponse = (ImageInfoResponse) o;
    if (!Objects.equals(this.catalog, imageInfoResponse.catalog)) {
      return false;
    }
    if (!Objects.equals(this.id, imageInfoResponse.id)) {
      return false;
    }
    if (!Objects.equals(this.os, imageInfoResponse.os)) {
      return false;
    }
    if (!Objects.equals(this.imageName, imageInfoResponse.imageName)) {
      return false;
    }
    if (!Objects.equals(this.date, imageInfoResponse.date)) {
      return false;
    }
    if (!Objects.equals(this.catalogName, imageInfoResponse.catalogName)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, id, os, imageName, date, catalogName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInfoResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
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

