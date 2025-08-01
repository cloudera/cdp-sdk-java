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

/**
 * SMTP config request object.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:43.816-07:00")
public class SmtpConfigRequest  {

  /**
   * Sender's email address.
   **/
  private String email = null;

  /**
   * SMTP host.
   **/
  private String host = null;

  /**
   * SMTP username.
   **/
  private String username = null;

  /**
   * SMTP password.
   **/
  private String password = null;

  /**
   * SMTP port.
   **/
  private Integer port = 25;

  /**
   * Use SMTP STARTTLS command to encrypt the mail.
   **/
  private Boolean startTls = true;

  /**
   * Use SSL to secure the connection to the email server.
   **/
  private Boolean ssl = false;

  /**
   * Getter for email.
   * Sender&#39;s email address.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * Sender&#39;s email address.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for host.
   * SMTP host.
   **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  /**
   * Setter for host.
   * SMTP host.
   **/
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Getter for username.
   * SMTP username.
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * SMTP username.
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for password.
   * SMTP password.
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * SMTP password.
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Getter for port.
   * SMTP port.
   **/
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  /**
   * Setter for port.
   * SMTP port.
   **/
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Getter for startTls.
   * Use SMTP STARTTLS command to encrypt the mail.
   **/
  @JsonProperty("startTls")
  public Boolean getStartTls() {
    return startTls;
  }

  /**
   * Setter for startTls.
   * Use SMTP STARTTLS command to encrypt the mail.
   **/
  public void setStartTls(Boolean startTls) {
    this.startTls = startTls;
  }

  /**
   * Getter for ssl.
   * Use SSL to secure the connection to the email server.
   **/
  @JsonProperty("ssl")
  public Boolean getSsl() {
    return ssl;
  }

  /**
   * Setter for ssl.
   * Use SSL to secure the connection to the email server.
   **/
  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmtpConfigRequest smtpConfigRequest = (SmtpConfigRequest) o;
    if (!Objects.equals(this.email, smtpConfigRequest.email)) {
      return false;
    }
    if (!Objects.equals(this.host, smtpConfigRequest.host)) {
      return false;
    }
    if (!Objects.equals(this.username, smtpConfigRequest.username)) {
      return false;
    }
    if (!Objects.equals(this.password, smtpConfigRequest.password)) {
      return false;
    }
    if (!Objects.equals(this.port, smtpConfigRequest.port)) {
      return false;
    }
    if (!Objects.equals(this.startTls, smtpConfigRequest.startTls)) {
      return false;
    }
    if (!Objects.equals(this.ssl, smtpConfigRequest.ssl)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, host, username, password, port, startTls, ssl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmtpConfigRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    startTls: ").append(toIndentedString(startTls)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
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

