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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Information about an LDAP provider connector.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:47.759-07:00")
public class LdapProviderInfo  {

  /**
   * The URL of the LDAP server.
   **/
  private String url = null;

  /**
   * Part of the directory tree under which to search for users.
   **/
  private String userSearchBase = null;

  /**
   * The search filter to use for finding users.
   **/
  private String userSearchFilter = null;

  /**
   * Part of the directory tree under which group searches should be performed.
   **/
  private String groupSearchBase = null;

  /**
   * Filter which is used to search for group membership.
   **/
  private String groupSearchFilter = null;

  /**
   * Bind DN.
   **/
  private String bindDn = null;

  /**
   * Property of the LDAP user object to use when binding to the LDAP directory.
   **/
  private String userBindProperty = null;

  /**
   * The property of user object to use in {{dn}} interpolation of groupSearchFilter.
   **/
  private String groupDnProperty = null;

  /**
   * The LDAP displayName attribute name, will be used as the user's name.
   **/
  private String usernameMappingAttribute = null;

  /**
   * The LDAP email attribute name, will be used as the user's email.
   **/
  private String emailMappingAttribute = null;

  /**
   * The LDAP attribute used as firstname , will be used as the user's firstname.
   **/
  private String firstNameMappingAttribute = null;

  /**
   * The LDAP sn attribute name, will be used as the user's lastname.
   **/
  private String lastNameMappingAttribute = null;

  /**
   * The LDAP group attribute name, will be used as for user's group.
   **/
  private String groupNameMappingAttribute = null;

  /**
   * If your ldaps:// server uses a self-signed SSL certificate or a certificate issued by a private Certificate Authority (CA), you need to provide the trusted certificates that can be used to validate the LDAP server certificate.
   **/
  private List<String> tlsCaCertificates = new ArrayList<String>();

  /**
   * Indicates whether a start TLS request should be initiated on connect.
   **/
  private Boolean startTls = null;

  /**
   * Getter for url.
   * The URL of the LDAP server.
   **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Setter for url.
   * The URL of the LDAP server.
   **/
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Getter for userSearchBase.
   * Part of the directory tree under which to search for users.
   **/
  @JsonProperty("userSearchBase")
  public String getUserSearchBase() {
    return userSearchBase;
  }

  /**
   * Setter for userSearchBase.
   * Part of the directory tree under which to search for users.
   **/
  public void setUserSearchBase(String userSearchBase) {
    this.userSearchBase = userSearchBase;
  }

  /**
   * Getter for userSearchFilter.
   * The search filter to use for finding users.
   **/
  @JsonProperty("userSearchFilter")
  public String getUserSearchFilter() {
    return userSearchFilter;
  }

  /**
   * Setter for userSearchFilter.
   * The search filter to use for finding users.
   **/
  public void setUserSearchFilter(String userSearchFilter) {
    this.userSearchFilter = userSearchFilter;
  }

  /**
   * Getter for groupSearchBase.
   * Part of the directory tree under which group searches should be performed.
   **/
  @JsonProperty("groupSearchBase")
  public String getGroupSearchBase() {
    return groupSearchBase;
  }

  /**
   * Setter for groupSearchBase.
   * Part of the directory tree under which group searches should be performed.
   **/
  public void setGroupSearchBase(String groupSearchBase) {
    this.groupSearchBase = groupSearchBase;
  }

  /**
   * Getter for groupSearchFilter.
   * Filter which is used to search for group membership.
   **/
  @JsonProperty("groupSearchFilter")
  public String getGroupSearchFilter() {
    return groupSearchFilter;
  }

  /**
   * Setter for groupSearchFilter.
   * Filter which is used to search for group membership.
   **/
  public void setGroupSearchFilter(String groupSearchFilter) {
    this.groupSearchFilter = groupSearchFilter;
  }

  /**
   * Getter for bindDn.
   * Bind DN.
   **/
  @JsonProperty("bindDn")
  public String getBindDn() {
    return bindDn;
  }

  /**
   * Setter for bindDn.
   * Bind DN.
   **/
  public void setBindDn(String bindDn) {
    this.bindDn = bindDn;
  }

  /**
   * Getter for userBindProperty.
   * Property of the LDAP user object to use when binding to the LDAP directory.
   **/
  @JsonProperty("userBindProperty")
  public String getUserBindProperty() {
    return userBindProperty;
  }

  /**
   * Setter for userBindProperty.
   * Property of the LDAP user object to use when binding to the LDAP directory.
   **/
  public void setUserBindProperty(String userBindProperty) {
    this.userBindProperty = userBindProperty;
  }

  /**
   * Getter for groupDnProperty.
   * The property of user object to use in {{dn}} interpolation of groupSearchFilter.
   **/
  @JsonProperty("groupDnProperty")
  public String getGroupDnProperty() {
    return groupDnProperty;
  }

  /**
   * Setter for groupDnProperty.
   * The property of user object to use in {{dn}} interpolation of groupSearchFilter.
   **/
  public void setGroupDnProperty(String groupDnProperty) {
    this.groupDnProperty = groupDnProperty;
  }

  /**
   * Getter for usernameMappingAttribute.
   * The LDAP displayName attribute name, will be used as the user&#39;s name.
   **/
  @JsonProperty("usernameMappingAttribute")
  public String getUsernameMappingAttribute() {
    return usernameMappingAttribute;
  }

  /**
   * Setter for usernameMappingAttribute.
   * The LDAP displayName attribute name, will be used as the user&#39;s name.
   **/
  public void setUsernameMappingAttribute(String usernameMappingAttribute) {
    this.usernameMappingAttribute = usernameMappingAttribute;
  }

  /**
   * Getter for emailMappingAttribute.
   * The LDAP email attribute name, will be used as the user&#39;s email.
   **/
  @JsonProperty("emailMappingAttribute")
  public String getEmailMappingAttribute() {
    return emailMappingAttribute;
  }

  /**
   * Setter for emailMappingAttribute.
   * The LDAP email attribute name, will be used as the user&#39;s email.
   **/
  public void setEmailMappingAttribute(String emailMappingAttribute) {
    this.emailMappingAttribute = emailMappingAttribute;
  }

  /**
   * Getter for firstNameMappingAttribute.
   * The LDAP attribute used as firstname , will be used as the user&#39;s firstname.
   **/
  @JsonProperty("firstNameMappingAttribute")
  public String getFirstNameMappingAttribute() {
    return firstNameMappingAttribute;
  }

  /**
   * Setter for firstNameMappingAttribute.
   * The LDAP attribute used as firstname , will be used as the user&#39;s firstname.
   **/
  public void setFirstNameMappingAttribute(String firstNameMappingAttribute) {
    this.firstNameMappingAttribute = firstNameMappingAttribute;
  }

  /**
   * Getter for lastNameMappingAttribute.
   * The LDAP sn attribute name, will be used as the user&#39;s lastname.
   **/
  @JsonProperty("lastNameMappingAttribute")
  public String getLastNameMappingAttribute() {
    return lastNameMappingAttribute;
  }

  /**
   * Setter for lastNameMappingAttribute.
   * The LDAP sn attribute name, will be used as the user&#39;s lastname.
   **/
  public void setLastNameMappingAttribute(String lastNameMappingAttribute) {
    this.lastNameMappingAttribute = lastNameMappingAttribute;
  }

  /**
   * Getter for groupNameMappingAttribute.
   * The LDAP group attribute name, will be used as for user&#39;s group.
   **/
  @JsonProperty("groupNameMappingAttribute")
  public String getGroupNameMappingAttribute() {
    return groupNameMappingAttribute;
  }

  /**
   * Setter for groupNameMappingAttribute.
   * The LDAP group attribute name, will be used as for user&#39;s group.
   **/
  public void setGroupNameMappingAttribute(String groupNameMappingAttribute) {
    this.groupNameMappingAttribute = groupNameMappingAttribute;
  }

  /**
   * Getter for tlsCaCertificates.
   * If your ldaps:// server uses a self-signed SSL certificate or a certificate issued by a private Certificate Authority (CA), you need to provide the trusted certificates that can be used to validate the LDAP server certificate.
   **/
  @JsonProperty("tlsCaCertificates")
  public List<String> getTlsCaCertificates() {
    return tlsCaCertificates;
  }

  /**
   * Setter for tlsCaCertificates.
   * If your ldaps:// server uses a self-signed SSL certificate or a certificate issued by a private Certificate Authority (CA), you need to provide the trusted certificates that can be used to validate the LDAP server certificate.
   **/
  public void setTlsCaCertificates(List<String> tlsCaCertificates) {
    this.tlsCaCertificates = tlsCaCertificates;
  }

  /**
   * Getter for startTls.
   * Indicates whether a start TLS request should be initiated on connect.
   **/
  @JsonProperty("startTls")
  public Boolean getStartTls() {
    return startTls;
  }

  /**
   * Setter for startTls.
   * Indicates whether a start TLS request should be initiated on connect.
   **/
  public void setStartTls(Boolean startTls) {
    this.startTls = startTls;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapProviderInfo ldapProviderInfo = (LdapProviderInfo) o;
    if (!Objects.equals(this.url, ldapProviderInfo.url)) {
      return false;
    }
    if (!Objects.equals(this.userSearchBase, ldapProviderInfo.userSearchBase)) {
      return false;
    }
    if (!Objects.equals(this.userSearchFilter, ldapProviderInfo.userSearchFilter)) {
      return false;
    }
    if (!Objects.equals(this.groupSearchBase, ldapProviderInfo.groupSearchBase)) {
      return false;
    }
    if (!Objects.equals(this.groupSearchFilter, ldapProviderInfo.groupSearchFilter)) {
      return false;
    }
    if (!Objects.equals(this.bindDn, ldapProviderInfo.bindDn)) {
      return false;
    }
    if (!Objects.equals(this.userBindProperty, ldapProviderInfo.userBindProperty)) {
      return false;
    }
    if (!Objects.equals(this.groupDnProperty, ldapProviderInfo.groupDnProperty)) {
      return false;
    }
    if (!Objects.equals(this.usernameMappingAttribute, ldapProviderInfo.usernameMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.emailMappingAttribute, ldapProviderInfo.emailMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.firstNameMappingAttribute, ldapProviderInfo.firstNameMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.lastNameMappingAttribute, ldapProviderInfo.lastNameMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.groupNameMappingAttribute, ldapProviderInfo.groupNameMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.tlsCaCertificates, ldapProviderInfo.tlsCaCertificates)) {
      return false;
    }
    if (!Objects.equals(this.startTls, ldapProviderInfo.startTls)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, userSearchBase, userSearchFilter, groupSearchBase, groupSearchFilter, bindDn, userBindProperty, groupDnProperty, usernameMappingAttribute, emailMappingAttribute, firstNameMappingAttribute, lastNameMappingAttribute, groupNameMappingAttribute, tlsCaCertificates, startTls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapProviderInfo {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userSearchBase: ").append(toIndentedString(userSearchBase)).append("\n");
    sb.append("    userSearchFilter: ").append(toIndentedString(userSearchFilter)).append("\n");
    sb.append("    groupSearchBase: ").append(toIndentedString(groupSearchBase)).append("\n");
    sb.append("    groupSearchFilter: ").append(toIndentedString(groupSearchFilter)).append("\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    userBindProperty: ").append(toIndentedString(userBindProperty)).append("\n");
    sb.append("    groupDnProperty: ").append(toIndentedString(groupDnProperty)).append("\n");
    sb.append("    usernameMappingAttribute: ").append(toIndentedString(usernameMappingAttribute)).append("\n");
    sb.append("    emailMappingAttribute: ").append(toIndentedString(emailMappingAttribute)).append("\n");
    sb.append("    firstNameMappingAttribute: ").append(toIndentedString(firstNameMappingAttribute)).append("\n");
    sb.append("    lastNameMappingAttribute: ").append(toIndentedString(lastNameMappingAttribute)).append("\n");
    sb.append("    groupNameMappingAttribute: ").append(toIndentedString(groupNameMappingAttribute)).append("\n");
    sb.append("    tlsCaCertificates: ").append(toIndentedString(tlsCaCertificates)).append("\n");
    sb.append("    startTls: ").append(toIndentedString(startTls)).append("\n");
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

