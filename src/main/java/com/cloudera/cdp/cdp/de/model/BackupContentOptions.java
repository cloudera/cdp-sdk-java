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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Backup virtual cluster content options.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-13T13:08:48.068-07:00")
public class BackupContentOptions  {

  /**
   * Whether to backup jobs. By default, jobs are backed up.
   **/
  private Boolean includeJobs = true;

  /**
   * Whether to backup job resources. By default, job resources are backed up.
   **/
  private Boolean includeJobResources = true;

  /**
   * Whether to backup resources. By default, resources are backed up.
   **/
  private Boolean includeResources = true;

  /**
   * Whether to backup resource credentials. By default, resource credentials are backed up.
   **/
  private Boolean includeResourceCredentials = true;

  /**
   * Whether to backup credentials. By default, credentials are backed up.
   **/
  private Boolean includeCredentials = true;

  /**
   * Whether to backup credential secrets. Secrets are obfuscated while storing. By default, credential secrets are backed up.
   **/
  private Boolean includeCredentialSecrets = true;

  /**
   * Filter jobs for backup using 'fieldname(operator)argument' syntax. Here, 'fieldname' is one of the job fields (e.g. name, type, etc.), and 'operator' is one of ('eq', 'noteq', 'lte', 'lt', 'gte', 'gt', 'in', 'notin', 'like', 'rlike', 'is', 'isnot'). Multiple filters are ANDed. For example, 'name(eq)SparkPi'. This will only take effect if jobs are backed up, as controlled by the 'includeJobs' option.
   **/
  private List<String> jobFilter = new ArrayList<String>();

  /**
   * Filter resources for backup using 'fieldname(operator)argument' syntax. Here, 'fieldname' is one of the resource fields (e.g. name, type, status, etc.), and 'operator' is one of ('eq', 'noteq', 'lte', 'lt', 'gte', 'gt', 'in', 'notin', 'like', 'rlike', 'is', 'isnot'). Multiple filters are ANDed. For example, 'name(eq)test-resource'. This will only take effect if resources are backed up, as controlled by the 'includeResources' option.
   **/
  private List<String> resourceFilter = new ArrayList<String>();

  /**
   * Filter credentials for backup using 'fieldname(operator)argument' syntax. Here, 'fieldname' is one of the credential fields (e.g. name, type, etc.), and 'operator' is one of ('eq', 'noteq', 'lte', 'lt', 'gte', 'gt', 'in', 'notin', 'like', 'rlike', 'is', 'isnot'). Multiple filters are ANDed. For example, 'name(eq)test-credential'. This will only take effect if credentials are backed up, as controlled by the 'includeCredentials' option.
   **/
  private List<String> credentialFilter = new ArrayList<String>();

  /**
   * Whether to validate backup archive. By default, backup archive is not validated.
   **/
  private Boolean validateArchive = false;

  /**
   * Getter for includeJobs.
   * Whether to backup jobs. By default, jobs are backed up.
   **/
  @JsonProperty("includeJobs")
  public Boolean getIncludeJobs() {
    return includeJobs;
  }

  /**
   * Setter for includeJobs.
   * Whether to backup jobs. By default, jobs are backed up.
   **/
  public void setIncludeJobs(Boolean includeJobs) {
    this.includeJobs = includeJobs;
  }

  /**
   * Getter for includeJobResources.
   * Whether to backup job resources. By default, job resources are backed up.
   **/
  @JsonProperty("includeJobResources")
  public Boolean getIncludeJobResources() {
    return includeJobResources;
  }

  /**
   * Setter for includeJobResources.
   * Whether to backup job resources. By default, job resources are backed up.
   **/
  public void setIncludeJobResources(Boolean includeJobResources) {
    this.includeJobResources = includeJobResources;
  }

  /**
   * Getter for includeResources.
   * Whether to backup resources. By default, resources are backed up.
   **/
  @JsonProperty("includeResources")
  public Boolean getIncludeResources() {
    return includeResources;
  }

  /**
   * Setter for includeResources.
   * Whether to backup resources. By default, resources are backed up.
   **/
  public void setIncludeResources(Boolean includeResources) {
    this.includeResources = includeResources;
  }

  /**
   * Getter for includeResourceCredentials.
   * Whether to backup resource credentials. By default, resource credentials are backed up.
   **/
  @JsonProperty("includeResourceCredentials")
  public Boolean getIncludeResourceCredentials() {
    return includeResourceCredentials;
  }

  /**
   * Setter for includeResourceCredentials.
   * Whether to backup resource credentials. By default, resource credentials are backed up.
   **/
  public void setIncludeResourceCredentials(Boolean includeResourceCredentials) {
    this.includeResourceCredentials = includeResourceCredentials;
  }

  /**
   * Getter for includeCredentials.
   * Whether to backup credentials. By default, credentials are backed up.
   **/
  @JsonProperty("includeCredentials")
  public Boolean getIncludeCredentials() {
    return includeCredentials;
  }

  /**
   * Setter for includeCredentials.
   * Whether to backup credentials. By default, credentials are backed up.
   **/
  public void setIncludeCredentials(Boolean includeCredentials) {
    this.includeCredentials = includeCredentials;
  }

  /**
   * Getter for includeCredentialSecrets.
   * Whether to backup credential secrets. Secrets are obfuscated while storing. By default, credential secrets are backed up.
   **/
  @JsonProperty("includeCredentialSecrets")
  public Boolean getIncludeCredentialSecrets() {
    return includeCredentialSecrets;
  }

  /**
   * Setter for includeCredentialSecrets.
   * Whether to backup credential secrets. Secrets are obfuscated while storing. By default, credential secrets are backed up.
   **/
  public void setIncludeCredentialSecrets(Boolean includeCredentialSecrets) {
    this.includeCredentialSecrets = includeCredentialSecrets;
  }

  /**
   * Getter for jobFilter.
   * Filter jobs for backup using &#39;fieldname(operator)argument&#39; syntax. Here, &#39;fieldname&#39; is one of the job fields (e.g. name, type, etc.), and &#39;operator&#39; is one of (&#39;eq&#39;, &#39;noteq&#39;, &#39;lte&#39;, &#39;lt&#39;, &#39;gte&#39;, &#39;gt&#39;, &#39;in&#39;, &#39;notin&#39;, &#39;like&#39;, &#39;rlike&#39;, &#39;is&#39;, &#39;isnot&#39;). Multiple filters are ANDed. For example, &#39;name(eq)SparkPi&#39;. This will only take effect if jobs are backed up, as controlled by the &#39;includeJobs&#39; option.
   **/
  @JsonProperty("jobFilter")
  public List<String> getJobFilter() {
    return jobFilter;
  }

  /**
   * Setter for jobFilter.
   * Filter jobs for backup using &#39;fieldname(operator)argument&#39; syntax. Here, &#39;fieldname&#39; is one of the job fields (e.g. name, type, etc.), and &#39;operator&#39; is one of (&#39;eq&#39;, &#39;noteq&#39;, &#39;lte&#39;, &#39;lt&#39;, &#39;gte&#39;, &#39;gt&#39;, &#39;in&#39;, &#39;notin&#39;, &#39;like&#39;, &#39;rlike&#39;, &#39;is&#39;, &#39;isnot&#39;). Multiple filters are ANDed. For example, &#39;name(eq)SparkPi&#39;. This will only take effect if jobs are backed up, as controlled by the &#39;includeJobs&#39; option.
   **/
  public void setJobFilter(List<String> jobFilter) {
    this.jobFilter = jobFilter;
  }

  /**
   * Getter for resourceFilter.
   * Filter resources for backup using &#39;fieldname(operator)argument&#39; syntax. Here, &#39;fieldname&#39; is one of the resource fields (e.g. name, type, status, etc.), and &#39;operator&#39; is one of (&#39;eq&#39;, &#39;noteq&#39;, &#39;lte&#39;, &#39;lt&#39;, &#39;gte&#39;, &#39;gt&#39;, &#39;in&#39;, &#39;notin&#39;, &#39;like&#39;, &#39;rlike&#39;, &#39;is&#39;, &#39;isnot&#39;). Multiple filters are ANDed. For example, &#39;name(eq)test-resource&#39;. This will only take effect if resources are backed up, as controlled by the &#39;includeResources&#39; option.
   **/
  @JsonProperty("resourceFilter")
  public List<String> getResourceFilter() {
    return resourceFilter;
  }

  /**
   * Setter for resourceFilter.
   * Filter resources for backup using &#39;fieldname(operator)argument&#39; syntax. Here, &#39;fieldname&#39; is one of the resource fields (e.g. name, type, status, etc.), and &#39;operator&#39; is one of (&#39;eq&#39;, &#39;noteq&#39;, &#39;lte&#39;, &#39;lt&#39;, &#39;gte&#39;, &#39;gt&#39;, &#39;in&#39;, &#39;notin&#39;, &#39;like&#39;, &#39;rlike&#39;, &#39;is&#39;, &#39;isnot&#39;). Multiple filters are ANDed. For example, &#39;name(eq)test-resource&#39;. This will only take effect if resources are backed up, as controlled by the &#39;includeResources&#39; option.
   **/
  public void setResourceFilter(List<String> resourceFilter) {
    this.resourceFilter = resourceFilter;
  }

  /**
   * Getter for credentialFilter.
   * Filter credentials for backup using &#39;fieldname(operator)argument&#39; syntax. Here, &#39;fieldname&#39; is one of the credential fields (e.g. name, type, etc.), and &#39;operator&#39; is one of (&#39;eq&#39;, &#39;noteq&#39;, &#39;lte&#39;, &#39;lt&#39;, &#39;gte&#39;, &#39;gt&#39;, &#39;in&#39;, &#39;notin&#39;, &#39;like&#39;, &#39;rlike&#39;, &#39;is&#39;, &#39;isnot&#39;). Multiple filters are ANDed. For example, &#39;name(eq)test-credential&#39;. This will only take effect if credentials are backed up, as controlled by the &#39;includeCredentials&#39; option.
   **/
  @JsonProperty("credentialFilter")
  public List<String> getCredentialFilter() {
    return credentialFilter;
  }

  /**
   * Setter for credentialFilter.
   * Filter credentials for backup using &#39;fieldname(operator)argument&#39; syntax. Here, &#39;fieldname&#39; is one of the credential fields (e.g. name, type, etc.), and &#39;operator&#39; is one of (&#39;eq&#39;, &#39;noteq&#39;, &#39;lte&#39;, &#39;lt&#39;, &#39;gte&#39;, &#39;gt&#39;, &#39;in&#39;, &#39;notin&#39;, &#39;like&#39;, &#39;rlike&#39;, &#39;is&#39;, &#39;isnot&#39;). Multiple filters are ANDed. For example, &#39;name(eq)test-credential&#39;. This will only take effect if credentials are backed up, as controlled by the &#39;includeCredentials&#39; option.
   **/
  public void setCredentialFilter(List<String> credentialFilter) {
    this.credentialFilter = credentialFilter;
  }

  /**
   * Getter for validateArchive.
   * Whether to validate backup archive. By default, backup archive is not validated.
   **/
  @JsonProperty("validateArchive")
  public Boolean getValidateArchive() {
    return validateArchive;
  }

  /**
   * Setter for validateArchive.
   * Whether to validate backup archive. By default, backup archive is not validated.
   **/
  public void setValidateArchive(Boolean validateArchive) {
    this.validateArchive = validateArchive;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupContentOptions backupContentOptions = (BackupContentOptions) o;
    if (!Objects.equals(this.includeJobs, backupContentOptions.includeJobs)) {
      return false;
    }
    if (!Objects.equals(this.includeJobResources, backupContentOptions.includeJobResources)) {
      return false;
    }
    if (!Objects.equals(this.includeResources, backupContentOptions.includeResources)) {
      return false;
    }
    if (!Objects.equals(this.includeResourceCredentials, backupContentOptions.includeResourceCredentials)) {
      return false;
    }
    if (!Objects.equals(this.includeCredentials, backupContentOptions.includeCredentials)) {
      return false;
    }
    if (!Objects.equals(this.includeCredentialSecrets, backupContentOptions.includeCredentialSecrets)) {
      return false;
    }
    if (!Objects.equals(this.jobFilter, backupContentOptions.jobFilter)) {
      return false;
    }
    if (!Objects.equals(this.resourceFilter, backupContentOptions.resourceFilter)) {
      return false;
    }
    if (!Objects.equals(this.credentialFilter, backupContentOptions.credentialFilter)) {
      return false;
    }
    if (!Objects.equals(this.validateArchive, backupContentOptions.validateArchive)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeJobs, includeJobResources, includeResources, includeResourceCredentials, includeCredentials, includeCredentialSecrets, jobFilter, resourceFilter, credentialFilter, validateArchive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupContentOptions {\n");
    sb.append("    includeJobs: ").append(toIndentedString(includeJobs)).append("\n");
    sb.append("    includeJobResources: ").append(toIndentedString(includeJobResources)).append("\n");
    sb.append("    includeResources: ").append(toIndentedString(includeResources)).append("\n");
    sb.append("    includeResourceCredentials: ").append(toIndentedString(includeResourceCredentials)).append("\n");
    sb.append("    includeCredentials: ").append(toIndentedString(includeCredentials)).append("\n");
    sb.append("    includeCredentialSecrets: ").append(toIndentedString(includeCredentialSecrets)).append("\n");
    sb.append("    jobFilter: ").append(toIndentedString(jobFilter)).append("\n");
    sb.append("    resourceFilter: ").append(toIndentedString(resourceFilter)).append("\n");
    sb.append("    credentialFilter: ").append(toIndentedString(credentialFilter)).append("\n");
    sb.append("    validateArchive: ").append(toIndentedString(validateArchive)).append("\n");
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

