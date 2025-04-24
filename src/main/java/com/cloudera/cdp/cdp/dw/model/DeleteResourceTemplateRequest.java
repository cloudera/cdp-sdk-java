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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the deleteResourceTemplate method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:33.344-07:00")
public class DeleteResourceTemplateRequest  {

  /**
   * The ID of the template.
   **/
  private String templateId = null;

  /**
   * Version of the template.
   **/
  private Integer templateVersion = null;

  /**
   * Getter for templateId.
   * The ID of the template.
   **/
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * Setter for templateId.
   * The ID of the template.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  /**
   * Getter for templateVersion.
   * Version of the template.
   **/
  @JsonProperty("templateVersion")
  public Integer getTemplateVersion() {
    return templateVersion;
  }

  /**
   * Setter for templateVersion.
   * Version of the template.
   **/
  public void setTemplateVersion(Integer templateVersion) {
    this.templateVersion = templateVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteResourceTemplateRequest deleteResourceTemplateRequest = (DeleteResourceTemplateRequest) o;
    if (!Objects.equals(this.templateId, deleteResourceTemplateRequest.templateId)) {
      return false;
    }
    if (!Objects.equals(this.templateVersion, deleteResourceTemplateRequest.templateVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, templateVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteResourceTemplateRequest {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
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

