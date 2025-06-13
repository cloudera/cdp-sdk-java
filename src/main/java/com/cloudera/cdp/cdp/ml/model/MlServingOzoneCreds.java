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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the MlServingOzoneCreds method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:26.860-07:00")
public class MlServingOzoneCreds  {

  /**
   * The Ozone S3 access key ID name.
   **/
  private String s3AccessID = null;

  /**
   * The Ozone S3 secret access key name.
   **/
  private String s3SecretAccessKey = null;

  /**
   * The Ozone S3 end point.
   **/
  private String s3EndPointUrl = null;

  /**
   * The Ozone S3 CA bundle.
   **/
  private String s3CaCertBundle = null;

  /**
   * Getter for s3AccessID.
   * The Ozone S3 access key ID name.
   **/
  @JsonProperty("s3AccessID")
  public String getS3AccessID() {
    return s3AccessID;
  }

  /**
   * Setter for s3AccessID.
   * The Ozone S3 access key ID name.
   **/
  public void setS3AccessID(String s3AccessID) {
    this.s3AccessID = s3AccessID;
  }

  /**
   * Getter for s3SecretAccessKey.
   * The Ozone S3 secret access key name.
   **/
  @JsonProperty("s3SecretAccessKey")
  public String getS3SecretAccessKey() {
    return s3SecretAccessKey;
  }

  /**
   * Setter for s3SecretAccessKey.
   * The Ozone S3 secret access key name.
   **/
  public void setS3SecretAccessKey(String s3SecretAccessKey) {
    this.s3SecretAccessKey = s3SecretAccessKey;
  }

  /**
   * Getter for s3EndPointUrl.
   * The Ozone S3 end point.
   **/
  @JsonProperty("s3EndPointUrl")
  public String getS3EndPointUrl() {
    return s3EndPointUrl;
  }

  /**
   * Setter for s3EndPointUrl.
   * The Ozone S3 end point.
   **/
  public void setS3EndPointUrl(String s3EndPointUrl) {
    this.s3EndPointUrl = s3EndPointUrl;
  }

  /**
   * Getter for s3CaCertBundle.
   * The Ozone S3 CA bundle.
   **/
  @JsonProperty("s3CaCertBundle")
  public String getS3CaCertBundle() {
    return s3CaCertBundle;
  }

  /**
   * Setter for s3CaCertBundle.
   * The Ozone S3 CA bundle.
   **/
  public void setS3CaCertBundle(String s3CaCertBundle) {
    this.s3CaCertBundle = s3CaCertBundle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MlServingOzoneCreds mlServingOzoneCreds = (MlServingOzoneCreds) o;
    if (!Objects.equals(this.s3AccessID, mlServingOzoneCreds.s3AccessID)) {
      return false;
    }
    if (!Objects.equals(this.s3SecretAccessKey, mlServingOzoneCreds.s3SecretAccessKey)) {
      return false;
    }
    if (!Objects.equals(this.s3EndPointUrl, mlServingOzoneCreds.s3EndPointUrl)) {
      return false;
    }
    if (!Objects.equals(this.s3CaCertBundle, mlServingOzoneCreds.s3CaCertBundle)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3AccessID, s3SecretAccessKey, s3EndPointUrl, s3CaCertBundle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MlServingOzoneCreds {\n");
    sb.append("    s3AccessID: ").append(toIndentedString(s3AccessID)).append("\n");
    sb.append("    s3SecretAccessKey: ").append(toIndentedString(s3SecretAccessKey)).append("\n");
    sb.append("    s3EndPointUrl: ").append(toIndentedString(s3EndPointUrl)).append("\n");
    sb.append("    s3CaCertBundle: ").append(toIndentedString(s3CaCertBundle)).append("\n");
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

