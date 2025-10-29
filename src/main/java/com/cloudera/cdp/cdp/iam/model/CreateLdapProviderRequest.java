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
 * Create an LDAP Provider for account.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:29.956-07:00")
public class CreateLdapProviderRequest  {

  /**
   * The name of LDAP provider to create.
   **/
  private String ldapProviderName = null;

  /**
   * The URL of the LDAP server. The URL must be prefixed with ldap:// or ldaps://. The URL can optionally specify a custom port, for example ldaps://ldap.example.org:663.
   **/
  private String url = null;

  /**
   * Part of the directory tree under which to search for users. For example, ou=users,dc=example,dc=org.
   **/
  private String userSearchBase = null;

  /**
   * The search filter to use for finding users. For example, (uid={{username}}).
   **/
  private String userSearchFilter = null;

  /**
   * The distinguished name indicating the path within the directory information tree to begin user searches from. For example, ou=groups,dc=example,dc=com.
   **/
  private String groupSearchBase = null;

  /**
   * The search filter to use for finding groups for authorization of authenticated users.
   **/
  private String groupSearchFilter = null;

  /**
   * The LDAP displayName attribute name, will be used as the user's name. For example, uid, sAMAccountName.
   **/
  private String usernameMappingAttribute = null;

  /**
   * Bind DN. For example, uid=myapp,ou=users,dc=example,dc=org. Optional. Required if bind is not anonymous.
   **/
  private String bindDn = null;

  /**
   * The password of the bind user.
   **/
  private String bindPassword = null;

  /**
   * Property of the LDAP user object to use when binding to verify the password. For example, dn.
   **/
  private String userBindProperty = null;

  /**
   * The property of user object to use in {{dn}} interpolation of groupSearchFilter.
   **/
  private String groupDnProperty = null;

  /**
   * The LDAP email attribute name, will be used as the user's email. For example, mail.
   **/
  private String emailMappingAttribute = null;

  /**
   * The LDAP attribute used as firstname , will be used as the user's firstname. For example, givenName.
   **/
  private String firstNameMappingAttribute = null;

  /**
   * The LDAP sn attribute name, will be used as the user's lastname. For example, sn.
   **/
  private String lastNameMappingAttribute = null;

  /**
   * The LDAP group attribute name, will be used as for user's group. For example, cn, name.
   **/
  private String groupNameMappingAttribute = null;

  /**
   * If the ldaps:// server uses a self-signed SSL certificate or a certificate issued by a private Certificate Authority (CA), then provide the trusted certificates that can be used to validate the LDAP server certificate.
   **/
  private List<String> tlsCaCertificates = new ArrayList<String>();

  /**
   * Whether to skip group sync.
   **/
  private Boolean skipGroupSyncOnLogin = null;

  /**
   * Whether a start TLS request should be initiated on connecting to ldap.
   **/
  private Boolean startTls = null;

  /**
   * Getter for ldapProviderName.
   * The name of LDAP provider to create.
   **/
  @JsonProperty("ldapProviderName")
  public String getLdapProviderName() {
    return ldapProviderName;
  }

  /**
   * Setter for ldapProviderName.
   * The name of LDAP provider to create.
   **/
  public void setLdapProviderName(String ldapProviderName) {
    this.ldapProviderName = ldapProviderName;
  }

  /**
   * Getter for url.
   * The URL of the LDAP server. The URL must be prefixed with ldap:// or ldaps://. The URL can optionally specify a custom port, for example ldaps://ldap.example.org:663.
   **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Setter for url.
   * The URL of the LDAP server. The URL must be prefixed with ldap:// or ldaps://. The URL can optionally specify a custom port, for example ldaps://ldap.example.org:663.
   **/
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Getter for userSearchBase.
   * Part of the directory tree under which to search for users. For example, ou&#x3D;users,dc&#x3D;example,dc&#x3D;org.
   **/
  @JsonProperty("userSearchBase")
  public String getUserSearchBase() {
    return userSearchBase;
  }

  /**
   * Setter for userSearchBase.
   * Part of the directory tree under which to search for users. For example, ou&#x3D;users,dc&#x3D;example,dc&#x3D;org.
   **/
  public void setUserSearchBase(String userSearchBase) {
    this.userSearchBase = userSearchBase;
  }

  /**
   * Getter for userSearchFilter.
   * The search filter to use for finding users. For example, (uid&#x3D;{{username}}).
   **/
  @JsonProperty("userSearchFilter")
  public String getUserSearchFilter() {
    return userSearchFilter;
  }

  /**
   * Setter for userSearchFilter.
   * The search filter to use for finding users. For example, (uid&#x3D;{{username}}).
   **/
  public void setUserSearchFilter(String userSearchFilter) {
    this.userSearchFilter = userSearchFilter;
  }

  /**
   * Getter for groupSearchBase.
   * The distinguished name indicating the path within the directory information tree to begin user searches from. For example, ou&#x3D;groups,dc&#x3D;example,dc&#x3D;com.
   **/
  @JsonProperty("groupSearchBase")
  public String getGroupSearchBase() {
    return groupSearchBase;
  }

  /**
   * Setter for groupSearchBase.
   * The distinguished name indicating the path within the directory information tree to begin user searches from. For example, ou&#x3D;groups,dc&#x3D;example,dc&#x3D;com.
   **/
  public void setGroupSearchBase(String groupSearchBase) {
    this.groupSearchBase = groupSearchBase;
  }

  /**
   * Getter for groupSearchFilter.
   * The search filter to use for finding groups for authorization of authenticated users.
   **/
  @JsonProperty("groupSearchFilter")
  public String getGroupSearchFilter() {
    return groupSearchFilter;
  }

  /**
   * Setter for groupSearchFilter.
   * The search filter to use for finding groups for authorization of authenticated users.
   **/
  public void setGroupSearchFilter(String groupSearchFilter) {
    this.groupSearchFilter = groupSearchFilter;
  }

  /**
   * Getter for usernameMappingAttribute.
   * The LDAP displayName attribute name, will be used as the user&#39;s name. For example, uid, sAMAccountName.
   **/
  @JsonProperty("usernameMappingAttribute")
  public String getUsernameMappingAttribute() {
    return usernameMappingAttribute;
  }

  /**
   * Setter for usernameMappingAttribute.
   * The LDAP displayName attribute name, will be used as the user&#39;s name. For example, uid, sAMAccountName.
   **/
  public void setUsernameMappingAttribute(String usernameMappingAttribute) {
    this.usernameMappingAttribute = usernameMappingAttribute;
  }

  /**
   * Getter for bindDn.
   * Bind DN. For example, uid&#x3D;myapp,ou&#x3D;users,dc&#x3D;example,dc&#x3D;org. Optional. Required if bind is not anonymous.
   **/
  @JsonProperty("bindDn")
  public String getBindDn() {
    return bindDn;
  }

  /**
   * Setter for bindDn.
   * Bind DN. For example, uid&#x3D;myapp,ou&#x3D;users,dc&#x3D;example,dc&#x3D;org. Optional. Required if bind is not anonymous.
   **/
  public void setBindDn(String bindDn) {
    this.bindDn = bindDn;
  }

  /**
   * Getter for bindPassword.
   * The password of the bind user.
   **/
  @JsonProperty("bindPassword")
  public String getBindPassword() {
    return bindPassword;
  }

  /**
   * Setter for bindPassword.
   * The password of the bind user.
   **/
  public void setBindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
  }

  /**
   * Getter for userBindProperty.
   * Property of the LDAP user object to use when binding to verify the password. For example, dn.
   **/
  @JsonProperty("userBindProperty")
  public String getUserBindProperty() {
    return userBindProperty;
  }

  /**
   * Setter for userBindProperty.
   * Property of the LDAP user object to use when binding to verify the password. For example, dn.
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
   * Getter for emailMappingAttribute.
   * The LDAP email attribute name, will be used as the user&#39;s email. For example, mail.
   **/
  @JsonProperty("emailMappingAttribute")
  public String getEmailMappingAttribute() {
    return emailMappingAttribute;
  }

  /**
   * Setter for emailMappingAttribute.
   * The LDAP email attribute name, will be used as the user&#39;s email. For example, mail.
   **/
  public void setEmailMappingAttribute(String emailMappingAttribute) {
    this.emailMappingAttribute = emailMappingAttribute;
  }

  /**
   * Getter for firstNameMappingAttribute.
   * The LDAP attribute used as firstname , will be used as the user&#39;s firstname. For example, givenName.
   **/
  @JsonProperty("firstNameMappingAttribute")
  public String getFirstNameMappingAttribute() {
    return firstNameMappingAttribute;
  }

  /**
   * Setter for firstNameMappingAttribute.
   * The LDAP attribute used as firstname , will be used as the user&#39;s firstname. For example, givenName.
   **/
  public void setFirstNameMappingAttribute(String firstNameMappingAttribute) {
    this.firstNameMappingAttribute = firstNameMappingAttribute;
  }

  /**
   * Getter for lastNameMappingAttribute.
   * The LDAP sn attribute name, will be used as the user&#39;s lastname. For example, sn.
   **/
  @JsonProperty("lastNameMappingAttribute")
  public String getLastNameMappingAttribute() {
    return lastNameMappingAttribute;
  }

  /**
   * Setter for lastNameMappingAttribute.
   * The LDAP sn attribute name, will be used as the user&#39;s lastname. For example, sn.
   **/
  public void setLastNameMappingAttribute(String lastNameMappingAttribute) {
    this.lastNameMappingAttribute = lastNameMappingAttribute;
  }

  /**
   * Getter for groupNameMappingAttribute.
   * The LDAP group attribute name, will be used as for user&#39;s group. For example, cn, name.
   **/
  @JsonProperty("groupNameMappingAttribute")
  public String getGroupNameMappingAttribute() {
    return groupNameMappingAttribute;
  }

  /**
   * Setter for groupNameMappingAttribute.
   * The LDAP group attribute name, will be used as for user&#39;s group. For example, cn, name.
   **/
  public void setGroupNameMappingAttribute(String groupNameMappingAttribute) {
    this.groupNameMappingAttribute = groupNameMappingAttribute;
  }

  /**
   * Getter for tlsCaCertificates.
   * If the ldaps:// server uses a self-signed SSL certificate or a certificate issued by a private Certificate Authority (CA), then provide the trusted certificates that can be used to validate the LDAP server certificate.
   **/
  @JsonProperty("tlsCaCertificates")
  public List<String> getTlsCaCertificates() {
    return tlsCaCertificates;
  }

  /**
   * Setter for tlsCaCertificates.
   * If the ldaps:// server uses a self-signed SSL certificate or a certificate issued by a private Certificate Authority (CA), then provide the trusted certificates that can be used to validate the LDAP server certificate.
   **/
  public void setTlsCaCertificates(List<String> tlsCaCertificates) {
    this.tlsCaCertificates = tlsCaCertificates;
  }

  /**
   * Getter for skipGroupSyncOnLogin.
   * Whether to skip group sync.
   **/
  @JsonProperty("skipGroupSyncOnLogin")
  public Boolean getSkipGroupSyncOnLogin() {
    return skipGroupSyncOnLogin;
  }

  /**
   * Setter for skipGroupSyncOnLogin.
   * Whether to skip group sync.
   **/
  public void setSkipGroupSyncOnLogin(Boolean skipGroupSyncOnLogin) {
    this.skipGroupSyncOnLogin = skipGroupSyncOnLogin;
  }

  /**
   * Getter for startTls.
   * Whether a start TLS request should be initiated on connecting to ldap.
   **/
  @JsonProperty("startTls")
  public Boolean getStartTls() {
    return startTls;
  }

  /**
   * Setter for startTls.
   * Whether a start TLS request should be initiated on connecting to ldap.
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
    CreateLdapProviderRequest createLdapProviderRequest = (CreateLdapProviderRequest) o;
    if (!Objects.equals(this.ldapProviderName, createLdapProviderRequest.ldapProviderName)) {
      return false;
    }
    if (!Objects.equals(this.url, createLdapProviderRequest.url)) {
      return false;
    }
    if (!Objects.equals(this.userSearchBase, createLdapProviderRequest.userSearchBase)) {
      return false;
    }
    if (!Objects.equals(this.userSearchFilter, createLdapProviderRequest.userSearchFilter)) {
      return false;
    }
    if (!Objects.equals(this.groupSearchBase, createLdapProviderRequest.groupSearchBase)) {
      return false;
    }
    if (!Objects.equals(this.groupSearchFilter, createLdapProviderRequest.groupSearchFilter)) {
      return false;
    }
    if (!Objects.equals(this.usernameMappingAttribute, createLdapProviderRequest.usernameMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.bindDn, createLdapProviderRequest.bindDn)) {
      return false;
    }
    if (!Objects.equals(this.bindPassword, createLdapProviderRequest.bindPassword)) {
      return false;
    }
    if (!Objects.equals(this.userBindProperty, createLdapProviderRequest.userBindProperty)) {
      return false;
    }
    if (!Objects.equals(this.groupDnProperty, createLdapProviderRequest.groupDnProperty)) {
      return false;
    }
    if (!Objects.equals(this.emailMappingAttribute, createLdapProviderRequest.emailMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.firstNameMappingAttribute, createLdapProviderRequest.firstNameMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.lastNameMappingAttribute, createLdapProviderRequest.lastNameMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.groupNameMappingAttribute, createLdapProviderRequest.groupNameMappingAttribute)) {
      return false;
    }
    if (!Objects.equals(this.tlsCaCertificates, createLdapProviderRequest.tlsCaCertificates)) {
      return false;
    }
    if (!Objects.equals(this.skipGroupSyncOnLogin, createLdapProviderRequest.skipGroupSyncOnLogin)) {
      return false;
    }
    if (!Objects.equals(this.startTls, createLdapProviderRequest.startTls)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldapProviderName, url, userSearchBase, userSearchFilter, groupSearchBase, groupSearchFilter, usernameMappingAttribute, bindDn, bindPassword, userBindProperty, groupDnProperty, emailMappingAttribute, firstNameMappingAttribute, lastNameMappingAttribute, groupNameMappingAttribute, tlsCaCertificates, skipGroupSyncOnLogin, startTls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLdapProviderRequest {\n");
    sb.append("    ldapProviderName: ").append(toIndentedString(ldapProviderName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userSearchBase: ").append(toIndentedString(userSearchBase)).append("\n");
    sb.append("    userSearchFilter: ").append(toIndentedString(userSearchFilter)).append("\n");
    sb.append("    groupSearchBase: ").append(toIndentedString(groupSearchBase)).append("\n");
    sb.append("    groupSearchFilter: ").append(toIndentedString(groupSearchFilter)).append("\n");
    sb.append("    usernameMappingAttribute: ").append(toIndentedString(usernameMappingAttribute)).append("\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    bindPassword: ").append(toIndentedString(bindPassword)).append("\n");
    sb.append("    userBindProperty: ").append(toIndentedString(userBindProperty)).append("\n");
    sb.append("    groupDnProperty: ").append(toIndentedString(groupDnProperty)).append("\n");
    sb.append("    emailMappingAttribute: ").append(toIndentedString(emailMappingAttribute)).append("\n");
    sb.append("    firstNameMappingAttribute: ").append(toIndentedString(firstNameMappingAttribute)).append("\n");
    sb.append("    lastNameMappingAttribute: ").append(toIndentedString(lastNameMappingAttribute)).append("\n");
    sb.append("    groupNameMappingAttribute: ").append(toIndentedString(groupNameMappingAttribute)).append("\n");
    sb.append("    tlsCaCertificates: ").append(toIndentedString(tlsCaCertificates)).append("\n");
    sb.append("    skipGroupSyncOnLogin: ").append(toIndentedString(skipGroupSyncOnLogin)).append("\n");
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

