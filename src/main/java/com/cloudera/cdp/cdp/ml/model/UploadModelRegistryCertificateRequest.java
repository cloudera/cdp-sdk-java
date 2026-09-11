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
 * Request object for the UploadModelRegistryCertificate method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-09-10T20:30:44.354Z")
public class UploadModelRegistryCertificateRequest  {

  /**
   * The CRN of the AI Registry instance to upload a certificate for.
   **/
  private String modelRegistryCrn = null;

  /**
   * Self Signed CA Cert details (base64-encoded PEM).
   **/
  private String certificateInfo = null;

  /**
   * Getter for modelRegistryCrn.
   * The CRN of the AI Registry instance to upload a certificate for.
   **/
  @JsonProperty("modelRegistryCrn")
  public String getModelRegistryCrn() {
    return modelRegistryCrn;
  }

  /**
   * Setter for modelRegistryCrn.
   * The CRN of the AI Registry instance to upload a certificate for.
   **/
  public void setModelRegistryCrn(String modelRegistryCrn) {
    this.modelRegistryCrn = modelRegistryCrn;
  }

  /**
   * Getter for certificateInfo.
   * Self Signed CA Cert details (base64-encoded PEM).
   **/
  @JsonProperty("certificateInfo")
  public String getCertificateInfo() {
    return certificateInfo;
  }

  /**
   * Setter for certificateInfo.
   * Self Signed CA Cert details (base64-encoded PEM).
   **/
  public void setCertificateInfo(String certificateInfo) {
    this.certificateInfo = certificateInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadModelRegistryCertificateRequest uploadModelRegistryCertificateRequest = (UploadModelRegistryCertificateRequest) o;
    if (!Objects.equals(this.modelRegistryCrn, uploadModelRegistryCertificateRequest.modelRegistryCrn)) {
      return false;
    }
    if (!Objects.equals(this.certificateInfo, uploadModelRegistryCertificateRequest.certificateInfo)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelRegistryCrn, certificateInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadModelRegistryCertificateRequest {\n");
    sb.append("    modelRegistryCrn: ").append(toIndentedString(modelRegistryCrn)).append("\n");
    sb.append("    certificateInfo: ").append(toIndentedString(certificateInfo)).append("\n");
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

