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
import com.cloudera.cdp.environments.model.FreeIpaInstance;
import com.cloudera.cdp.environments.model.ImageInfo;
import java.util.*;

/**
 * Details of a FreeIPA cluster.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:13.429-07:00")
public class FreeipaDetails  {

  /**
   * CRN of the FreeIPA cluster.
   **/
  private String crn = null;

  /**
   * The domain name of the FreeIPA cluster.
   **/
  private String domain = null;

  /**
   * The hostname of the FreeIPA cluster.
   **/
  private String hostname = null;

  /**
   * The IP addresses of the FreeIPA cluster.
   **/
  private List<String> serverIP = new ArrayList<String>();

  /**
   * The recipes for the FreeIPA cluster.
   **/
  private List<String> recipes = new ArrayList<String>();

  /**
   * The instances of the FreeIPA cluster.
   **/
  private List<FreeIpaInstance> instances = new ArrayList<FreeIpaInstance>();

  /**
   * The number of FreeIPA instances to create per group when creating FreeIPA in environment.
   **/
  private Integer instanceCountByGroup = null;

  /**
   * Whether the given FreeIPA is deployed in a multi-availability zone way or not.
   **/
  private Boolean multiAz = null;

  /**
   * The image details.
   **/
  private ImageInfo imageDetails = null;

  /**
   * Getter for crn.
   * CRN of the FreeIPA cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the FreeIPA cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for domain.
   * The domain name of the FreeIPA cluster.
   **/
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  /**
   * Setter for domain.
   * The domain name of the FreeIPA cluster.
   **/
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Getter for hostname.
   * The hostname of the FreeIPA cluster.
   **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  /**
   * Setter for hostname.
   * The hostname of the FreeIPA cluster.
   **/
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * Getter for serverIP.
   * The IP addresses of the FreeIPA cluster.
   **/
  @JsonProperty("serverIP")
  public List<String> getServerIP() {
    return serverIP;
  }

  /**
   * Setter for serverIP.
   * The IP addresses of the FreeIPA cluster.
   **/
  public void setServerIP(List<String> serverIP) {
    this.serverIP = serverIP;
  }

  /**
   * Getter for recipes.
   * The recipes for the FreeIPA cluster.
   **/
  @JsonProperty("recipes")
  public List<String> getRecipes() {
    return recipes;
  }

  /**
   * Setter for recipes.
   * The recipes for the FreeIPA cluster.
   **/
  public void setRecipes(List<String> recipes) {
    this.recipes = recipes;
  }

  /**
   * Getter for instances.
   * The instances of the FreeIPA cluster.
   **/
  @JsonProperty("instances")
  public List<FreeIpaInstance> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * The instances of the FreeIPA cluster.
   **/
  public void setInstances(List<FreeIpaInstance> instances) {
    this.instances = instances;
  }

  /**
   * Getter for instanceCountByGroup.
   * The number of FreeIPA instances to create per group when creating FreeIPA in environment.
   **/
  @JsonProperty("instanceCountByGroup")
  public Integer getInstanceCountByGroup() {
    return instanceCountByGroup;
  }

  /**
   * Setter for instanceCountByGroup.
   * The number of FreeIPA instances to create per group when creating FreeIPA in environment.
   **/
  public void setInstanceCountByGroup(Integer instanceCountByGroup) {
    this.instanceCountByGroup = instanceCountByGroup;
  }

  /**
   * Getter for multiAz.
   * Whether the given FreeIPA is deployed in a multi-availability zone way or not.
   **/
  @JsonProperty("multiAz")
  public Boolean getMultiAz() {
    return multiAz;
  }

  /**
   * Setter for multiAz.
   * Whether the given FreeIPA is deployed in a multi-availability zone way or not.
   **/
  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }

  /**
   * Getter for imageDetails.
   * The image details.
   **/
  @JsonProperty("imageDetails")
  public ImageInfo getImageDetails() {
    return imageDetails;
  }

  /**
   * Setter for imageDetails.
   * The image details.
   **/
  public void setImageDetails(ImageInfo imageDetails) {
    this.imageDetails = imageDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeipaDetails freeipaDetails = (FreeipaDetails) o;
    if (!Objects.equals(this.crn, freeipaDetails.crn)) {
      return false;
    }
    if (!Objects.equals(this.domain, freeipaDetails.domain)) {
      return false;
    }
    if (!Objects.equals(this.hostname, freeipaDetails.hostname)) {
      return false;
    }
    if (!Objects.equals(this.serverIP, freeipaDetails.serverIP)) {
      return false;
    }
    if (!Objects.equals(this.recipes, freeipaDetails.recipes)) {
      return false;
    }
    if (!Objects.equals(this.instances, freeipaDetails.instances)) {
      return false;
    }
    if (!Objects.equals(this.instanceCountByGroup, freeipaDetails.instanceCountByGroup)) {
      return false;
    }
    if (!Objects.equals(this.multiAz, freeipaDetails.multiAz)) {
      return false;
    }
    if (!Objects.equals(this.imageDetails, freeipaDetails.imageDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, domain, hostname, serverIP, recipes, instances, instanceCountByGroup, multiAz, imageDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeipaDetails {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    serverIP: ").append(toIndentedString(serverIP)).append("\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    instanceCountByGroup: ").append(toIndentedString(instanceCountByGroup)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
    sb.append("    imageDetails: ").append(toIndentedString(imageDetails)).append("\n");
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

