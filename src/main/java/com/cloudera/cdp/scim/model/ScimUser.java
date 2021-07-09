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

package com.cloudera.cdp.scim.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.scim.model.ScimAddress;
import com.cloudera.cdp.scim.model.ScimMeta;
import com.cloudera.cdp.scim.model.ScimMultiValuedElement;
import com.cloudera.cdp.scim.model.ScimName;
import java.util.*;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-09T16:32:34.128-07:00")
public class ScimUser  {

  /**
   * 
   **/
  private List<String> schemas = new ArrayList<String>();

  /**
   * 
   **/
  private String id = null;

  /**
   * 
   **/
  private String externalId = null;

  /**
   * 
   **/
  private ScimMeta meta = null;

  /**
   * 
   **/
  private String userName = null;

  /**
   * 
   **/
  private ScimName name = null;

  /**
   * 
   **/
  private String displayName = null;

  /**
   * 
   **/
  private String nickName = null;

  /**
   * 
   **/
  private String profileUrl = null;

  /**
   * 
   **/
  private String title = null;

  /**
   * 
   **/
  private String userType = null;

  /**
   * 
   **/
  private String preferredLanguage = null;

  /**
   * 
   **/
  private String locale = null;

  /**
   * 
   **/
  private String timezone = null;

  /**
   * 
   **/
  private Boolean active = null;

  /**
   * 
   **/
  private String password = null;

  /**
   * 
   **/
  private List<ScimMultiValuedElement> emails = new ArrayList<ScimMultiValuedElement>();

  /**
   * 
   **/
  private List<ScimMultiValuedElement> phoneNumbers = new ArrayList<ScimMultiValuedElement>();

  /**
   * 
   **/
  private List<ScimMultiValuedElement> ims = new ArrayList<ScimMultiValuedElement>();

  /**
   * 
   **/
  private List<ScimMultiValuedElement> photos = new ArrayList<ScimMultiValuedElement>();

  /**
   * 
   **/
  private List<ScimAddress> addresses = new ArrayList<ScimAddress>();

  /**
   * 
   **/
  private List<ScimMultiValuedElement> groups = new ArrayList<ScimMultiValuedElement>();

  /**
   * 
   **/
  private List<ScimMultiValuedElement> entitlements = new ArrayList<ScimMultiValuedElement>();

  /**
   * 
   **/
  private List<ScimMultiValuedElement> roles = new ArrayList<ScimMultiValuedElement>();

  /**
   * 
   **/
  private List<ScimMultiValuedElement> x509Certificates = new ArrayList<ScimMultiValuedElement>();

  /**
   * Getter for schemas.
   * 
   **/
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }

  /**
   * Setter for schemas.
   * 
   **/
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  /**
   * Getter for id.
   * 
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * 
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for externalId.
   * 
   **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  /**
   * Setter for externalId.
   * 
   **/
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Getter for meta.
   * 
   **/
  @JsonProperty("meta")
  public ScimMeta getMeta() {
    return meta;
  }

  /**
   * Setter for meta.
   * 
   **/
  public void setMeta(ScimMeta meta) {
    this.meta = meta;
  }

  /**
   * Getter for userName.
   * 
   **/
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  /**
   * Setter for userName.
   * 
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * Getter for name.
   * 
   **/
  @JsonProperty("name")
  public ScimName getName() {
    return name;
  }

  /**
   * Setter for name.
   * 
   **/
  public void setName(ScimName name) {
    this.name = name;
  }

  /**
   * Getter for displayName.
   * 
   **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Setter for displayName.
   * 
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Getter for nickName.
   * 
   **/
  @JsonProperty("nickName")
  public String getNickName() {
    return nickName;
  }

  /**
   * Setter for nickName.
   * 
   **/
  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  /**
   * Getter for profileUrl.
   * 
   **/
  @JsonProperty("profileUrl")
  public String getProfileUrl() {
    return profileUrl;
  }

  /**
   * Setter for profileUrl.
   * 
   **/
  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }

  /**
   * Getter for title.
   * 
   **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Setter for title.
   * 
   **/
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Getter for userType.
   * 
   **/
  @JsonProperty("userType")
  public String getUserType() {
    return userType;
  }

  /**
   * Setter for userType.
   * 
   **/
  public void setUserType(String userType) {
    this.userType = userType;
  }

  /**
   * Getter for preferredLanguage.
   * 
   **/
  @JsonProperty("preferredLanguage")
  public String getPreferredLanguage() {
    return preferredLanguage;
  }

  /**
   * Setter for preferredLanguage.
   * 
   **/
  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }

  /**
   * Getter for locale.
   * 
   **/
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  /**
   * Setter for locale.
   * 
   **/
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Getter for timezone.
   * 
   **/
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }

  /**
   * Setter for timezone.
   * 
   **/
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * Getter for active.
   * 
   **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  /**
   * Setter for active.
   * 
   **/
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * Getter for password.
   * 
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * 
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Getter for emails.
   * 
   **/
  @JsonProperty("emails")
  public List<ScimMultiValuedElement> getEmails() {
    return emails;
  }

  /**
   * Setter for emails.
   * 
   **/
  public void setEmails(List<ScimMultiValuedElement> emails) {
    this.emails = emails;
  }

  /**
   * Getter for phoneNumbers.
   * 
   **/
  @JsonProperty("phoneNumbers")
  public List<ScimMultiValuedElement> getPhoneNumbers() {
    return phoneNumbers;
  }

  /**
   * Setter for phoneNumbers.
   * 
   **/
  public void setPhoneNumbers(List<ScimMultiValuedElement> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  /**
   * Getter for ims.
   * 
   **/
  @JsonProperty("ims")
  public List<ScimMultiValuedElement> getIms() {
    return ims;
  }

  /**
   * Setter for ims.
   * 
   **/
  public void setIms(List<ScimMultiValuedElement> ims) {
    this.ims = ims;
  }

  /**
   * Getter for photos.
   * 
   **/
  @JsonProperty("photos")
  public List<ScimMultiValuedElement> getPhotos() {
    return photos;
  }

  /**
   * Setter for photos.
   * 
   **/
  public void setPhotos(List<ScimMultiValuedElement> photos) {
    this.photos = photos;
  }

  /**
   * Getter for addresses.
   * 
   **/
  @JsonProperty("addresses")
  public List<ScimAddress> getAddresses() {
    return addresses;
  }

  /**
   * Setter for addresses.
   * 
   **/
  public void setAddresses(List<ScimAddress> addresses) {
    this.addresses = addresses;
  }

  /**
   * Getter for groups.
   * 
   **/
  @JsonProperty("groups")
  public List<ScimMultiValuedElement> getGroups() {
    return groups;
  }

  /**
   * Setter for groups.
   * 
   **/
  public void setGroups(List<ScimMultiValuedElement> groups) {
    this.groups = groups;
  }

  /**
   * Getter for entitlements.
   * 
   **/
  @JsonProperty("entitlements")
  public List<ScimMultiValuedElement> getEntitlements() {
    return entitlements;
  }

  /**
   * Setter for entitlements.
   * 
   **/
  public void setEntitlements(List<ScimMultiValuedElement> entitlements) {
    this.entitlements = entitlements;
  }

  /**
   * Getter for roles.
   * 
   **/
  @JsonProperty("roles")
  public List<ScimMultiValuedElement> getRoles() {
    return roles;
  }

  /**
   * Setter for roles.
   * 
   **/
  public void setRoles(List<ScimMultiValuedElement> roles) {
    this.roles = roles;
  }

  /**
   * Getter for x509Certificates.
   * 
   **/
  @JsonProperty("x509Certificates")
  public List<ScimMultiValuedElement> getX509Certificates() {
    return x509Certificates;
  }

  /**
   * Setter for x509Certificates.
   * 
   **/
  public void setX509Certificates(List<ScimMultiValuedElement> x509Certificates) {
    this.x509Certificates = x509Certificates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimUser scimUser = (ScimUser) o;
    if (!Objects.equals(this.schemas, scimUser.schemas)) {
      return false;
    }
    if (!Objects.equals(this.id, scimUser.id)) {
      return false;
    }
    if (!Objects.equals(this.externalId, scimUser.externalId)) {
      return false;
    }
    if (!Objects.equals(this.meta, scimUser.meta)) {
      return false;
    }
    if (!Objects.equals(this.userName, scimUser.userName)) {
      return false;
    }
    if (!Objects.equals(this.name, scimUser.name)) {
      return false;
    }
    if (!Objects.equals(this.displayName, scimUser.displayName)) {
      return false;
    }
    if (!Objects.equals(this.nickName, scimUser.nickName)) {
      return false;
    }
    if (!Objects.equals(this.profileUrl, scimUser.profileUrl)) {
      return false;
    }
    if (!Objects.equals(this.title, scimUser.title)) {
      return false;
    }
    if (!Objects.equals(this.userType, scimUser.userType)) {
      return false;
    }
    if (!Objects.equals(this.preferredLanguage, scimUser.preferredLanguage)) {
      return false;
    }
    if (!Objects.equals(this.locale, scimUser.locale)) {
      return false;
    }
    if (!Objects.equals(this.timezone, scimUser.timezone)) {
      return false;
    }
    if (!Objects.equals(this.active, scimUser.active)) {
      return false;
    }
    if (!Objects.equals(this.password, scimUser.password)) {
      return false;
    }
    if (!Objects.equals(this.emails, scimUser.emails)) {
      return false;
    }
    if (!Objects.equals(this.phoneNumbers, scimUser.phoneNumbers)) {
      return false;
    }
    if (!Objects.equals(this.ims, scimUser.ims)) {
      return false;
    }
    if (!Objects.equals(this.photos, scimUser.photos)) {
      return false;
    }
    if (!Objects.equals(this.addresses, scimUser.addresses)) {
      return false;
    }
    if (!Objects.equals(this.groups, scimUser.groups)) {
      return false;
    }
    if (!Objects.equals(this.entitlements, scimUser.entitlements)) {
      return false;
    }
    if (!Objects.equals(this.roles, scimUser.roles)) {
      return false;
    }
    if (!Objects.equals(this.x509Certificates, scimUser.x509Certificates)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, externalId, meta, userName, name, displayName, nickName, profileUrl, title, userType, preferredLanguage, locale, timezone, active, password, emails, phoneNumbers, ims, photos, addresses, groups, entitlements, roles, x509Certificates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUser {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    ims: ").append(toIndentedString(ims)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    x509Certificates: ").append(toIndentedString(x509Certificates)).append("\n");
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

