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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Details of the LDAP attached to cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-29T15:24:01.906-07:00")
public class ClusterLdapDetails  {

  /**
   * ID of the LDAP.
   **/
  private Long id = null;

  /**
   * Name of the LDAP.
   **/
  private String name = null;

  /**
   * Description of the LDAP.
   **/
  private String description = null;

  /**
   * LDAP server host.
   **/
  private String serverHost = null;

  /**
   * LDAP server port.
   **/
  private Integer serverPort = null;

  /**
   * LDAP protocol.
   **/
  private String protocol = null;

  /**
   * User search base.
   **/
  private String userSearchBase = null;

  /**
   * UserDN pattern.
   **/
  private String userDnPattern = null;

  /**
   * Group search base.
   **/
  private String groupSearchBase = null;

  /**
   * User name attribute.
   **/
  private String userNameAttribute = null;

  /**
   * LDAP domain.
   **/
  private String domain = null;

  /**
   * Directory type.
   **/
  private String directoryType = null;

  /**
   * User object class.
   **/
  private String userObjectClass = null;

  /**
   * Group object class.
   **/
  private String groupObjectClass = null;

  /**
   * Group name attribute.
   **/
  private String groupNameAttribute = null;

  /**
   * Group member attribute.
   **/
  private String groupMemberAttribute = null;

  /**
   * Admin group.
   **/
  private String adminGroup = null;

  /**
   * Certificate.
   **/
  private String certificate = null;

  /**
   * Workspace ID.
   **/
  private Long workspaceId = null;

  /**
   * User ID.
   **/
  private String userId = null;

  /**
   * User name.
   **/
  private String userName = null;

  /**
   * Tenant name.
   **/
  private String tenantName = null;

  /**
   * Getter for id.
   * ID of the LDAP.
   **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Setter for id.
   * ID of the LDAP.
   **/
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * Name of the LDAP.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the LDAP.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * Description of the LDAP.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the LDAP.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for serverHost.
   * LDAP server host.
   **/
  @JsonProperty("serverHost")
  public String getServerHost() {
    return serverHost;
  }

  /**
   * Setter for serverHost.
   * LDAP server host.
   **/
  public void setServerHost(String serverHost) {
    this.serverHost = serverHost;
  }

  /**
   * Getter for serverPort.
   * LDAP server port.
   **/
  @JsonProperty("serverPort")
  public Integer getServerPort() {
    return serverPort;
  }

  /**
   * Setter for serverPort.
   * LDAP server port.
   **/
  public void setServerPort(Integer serverPort) {
    this.serverPort = serverPort;
  }

  /**
   * Getter for protocol.
   * LDAP protocol.
   **/
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  /**
   * Setter for protocol.
   * LDAP protocol.
   **/
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  /**
   * Getter for userSearchBase.
   * User search base.
   **/
  @JsonProperty("userSearchBase")
  public String getUserSearchBase() {
    return userSearchBase;
  }

  /**
   * Setter for userSearchBase.
   * User search base.
   **/
  public void setUserSearchBase(String userSearchBase) {
    this.userSearchBase = userSearchBase;
  }

  /**
   * Getter for userDnPattern.
   * UserDN pattern.
   **/
  @JsonProperty("userDnPattern")
  public String getUserDnPattern() {
    return userDnPattern;
  }

  /**
   * Setter for userDnPattern.
   * UserDN pattern.
   **/
  public void setUserDnPattern(String userDnPattern) {
    this.userDnPattern = userDnPattern;
  }

  /**
   * Getter for groupSearchBase.
   * Group search base.
   **/
  @JsonProperty("groupSearchBase")
  public String getGroupSearchBase() {
    return groupSearchBase;
  }

  /**
   * Setter for groupSearchBase.
   * Group search base.
   **/
  public void setGroupSearchBase(String groupSearchBase) {
    this.groupSearchBase = groupSearchBase;
  }

  /**
   * Getter for userNameAttribute.
   * User name attribute.
   **/
  @JsonProperty("userNameAttribute")
  public String getUserNameAttribute() {
    return userNameAttribute;
  }

  /**
   * Setter for userNameAttribute.
   * User name attribute.
   **/
  public void setUserNameAttribute(String userNameAttribute) {
    this.userNameAttribute = userNameAttribute;
  }

  /**
   * Getter for domain.
   * LDAP domain.
   **/
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  /**
   * Setter for domain.
   * LDAP domain.
   **/
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Getter for directoryType.
   * Directory type.
   **/
  @JsonProperty("directoryType")
  public String getDirectoryType() {
    return directoryType;
  }

  /**
   * Setter for directoryType.
   * Directory type.
   **/
  public void setDirectoryType(String directoryType) {
    this.directoryType = directoryType;
  }

  /**
   * Getter for userObjectClass.
   * User object class.
   **/
  @JsonProperty("userObjectClass")
  public String getUserObjectClass() {
    return userObjectClass;
  }

  /**
   * Setter for userObjectClass.
   * User object class.
   **/
  public void setUserObjectClass(String userObjectClass) {
    this.userObjectClass = userObjectClass;
  }

  /**
   * Getter for groupObjectClass.
   * Group object class.
   **/
  @JsonProperty("groupObjectClass")
  public String getGroupObjectClass() {
    return groupObjectClass;
  }

  /**
   * Setter for groupObjectClass.
   * Group object class.
   **/
  public void setGroupObjectClass(String groupObjectClass) {
    this.groupObjectClass = groupObjectClass;
  }

  /**
   * Getter for groupNameAttribute.
   * Group name attribute.
   **/
  @JsonProperty("groupNameAttribute")
  public String getGroupNameAttribute() {
    return groupNameAttribute;
  }

  /**
   * Setter for groupNameAttribute.
   * Group name attribute.
   **/
  public void setGroupNameAttribute(String groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

  /**
   * Getter for groupMemberAttribute.
   * Group member attribute.
   **/
  @JsonProperty("groupMemberAttribute")
  public String getGroupMemberAttribute() {
    return groupMemberAttribute;
  }

  /**
   * Setter for groupMemberAttribute.
   * Group member attribute.
   **/
  public void setGroupMemberAttribute(String groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  /**
   * Getter for adminGroup.
   * Admin group.
   **/
  @JsonProperty("adminGroup")
  public String getAdminGroup() {
    return adminGroup;
  }

  /**
   * Setter for adminGroup.
   * Admin group.
   **/
  public void setAdminGroup(String adminGroup) {
    this.adminGroup = adminGroup;
  }

  /**
   * Getter for certificate.
   * Certificate.
   **/
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }

  /**
   * Setter for certificate.
   * Certificate.
   **/
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  /**
   * Getter for workspaceId.
   * Workspace ID.
   **/
  @JsonProperty("workspaceId")
  public Long getWorkspaceId() {
    return workspaceId;
  }

  /**
   * Setter for workspaceId.
   * Workspace ID.
   **/
  public void setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
  }

  /**
   * Getter for userId.
   * User ID.
   **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   * User ID.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Getter for userName.
   * User name.
   **/
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  /**
   * Setter for userName.
   * User name.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * Getter for tenantName.
   * Tenant name.
   **/
  @JsonProperty("tenantName")
  public String getTenantName() {
    return tenantName;
  }

  /**
   * Setter for tenantName.
   * Tenant name.
   **/
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterLdapDetails clusterLdapDetails = (ClusterLdapDetails) o;
    if (!Objects.equals(this.id, clusterLdapDetails.id)) {
      return false;
    }
    if (!Objects.equals(this.name, clusterLdapDetails.name)) {
      return false;
    }
    if (!Objects.equals(this.description, clusterLdapDetails.description)) {
      return false;
    }
    if (!Objects.equals(this.serverHost, clusterLdapDetails.serverHost)) {
      return false;
    }
    if (!Objects.equals(this.serverPort, clusterLdapDetails.serverPort)) {
      return false;
    }
    if (!Objects.equals(this.protocol, clusterLdapDetails.protocol)) {
      return false;
    }
    if (!Objects.equals(this.userSearchBase, clusterLdapDetails.userSearchBase)) {
      return false;
    }
    if (!Objects.equals(this.userDnPattern, clusterLdapDetails.userDnPattern)) {
      return false;
    }
    if (!Objects.equals(this.groupSearchBase, clusterLdapDetails.groupSearchBase)) {
      return false;
    }
    if (!Objects.equals(this.userNameAttribute, clusterLdapDetails.userNameAttribute)) {
      return false;
    }
    if (!Objects.equals(this.domain, clusterLdapDetails.domain)) {
      return false;
    }
    if (!Objects.equals(this.directoryType, clusterLdapDetails.directoryType)) {
      return false;
    }
    if (!Objects.equals(this.userObjectClass, clusterLdapDetails.userObjectClass)) {
      return false;
    }
    if (!Objects.equals(this.groupObjectClass, clusterLdapDetails.groupObjectClass)) {
      return false;
    }
    if (!Objects.equals(this.groupNameAttribute, clusterLdapDetails.groupNameAttribute)) {
      return false;
    }
    if (!Objects.equals(this.groupMemberAttribute, clusterLdapDetails.groupMemberAttribute)) {
      return false;
    }
    if (!Objects.equals(this.adminGroup, clusterLdapDetails.adminGroup)) {
      return false;
    }
    if (!Objects.equals(this.certificate, clusterLdapDetails.certificate)) {
      return false;
    }
    if (!Objects.equals(this.workspaceId, clusterLdapDetails.workspaceId)) {
      return false;
    }
    if (!Objects.equals(this.userId, clusterLdapDetails.userId)) {
      return false;
    }
    if (!Objects.equals(this.userName, clusterLdapDetails.userName)) {
      return false;
    }
    if (!Objects.equals(this.tenantName, clusterLdapDetails.tenantName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, serverHost, serverPort, protocol, userSearchBase, userDnPattern, groupSearchBase, userNameAttribute, domain, directoryType, userObjectClass, groupObjectClass, groupNameAttribute, groupMemberAttribute, adminGroup, certificate, workspaceId, userId, userName, tenantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterLdapDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serverHost: ").append(toIndentedString(serverHost)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    userSearchBase: ").append(toIndentedString(userSearchBase)).append("\n");
    sb.append("    userDnPattern: ").append(toIndentedString(userDnPattern)).append("\n");
    sb.append("    groupSearchBase: ").append(toIndentedString(groupSearchBase)).append("\n");
    sb.append("    userNameAttribute: ").append(toIndentedString(userNameAttribute)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    directoryType: ").append(toIndentedString(directoryType)).append("\n");
    sb.append("    userObjectClass: ").append(toIndentedString(userObjectClass)).append("\n");
    sb.append("    groupObjectClass: ").append(toIndentedString(groupObjectClass)).append("\n");
    sb.append("    groupNameAttribute: ").append(toIndentedString(groupNameAttribute)).append("\n");
    sb.append("    groupMemberAttribute: ").append(toIndentedString(groupMemberAttribute)).append("\n");
    sb.append("    adminGroup: ").append(toIndentedString(adminGroup)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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

