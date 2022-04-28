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

/**
 * An object representing password policy options.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-28T14:39:24.524-07:00")
public class PasswordPolicy  {

  /**
   * The maximum lifetime of passwords, in days. If set to '0' passwords never expire. The default is 0.
   **/
  private Integer maxPasswordLifetimeDays = null;

  /**
   * The minimum length of a password. Can be any number between 6 and 256. The default minimum password length is 8.
   **/
  private Integer minPasswordLength = null;

  /**
   * Whether passwords must include upper case characters. The default is 'true'.
   **/
  private Boolean mustIncludeUpperCaseCharacters = null;

  /**
   * Whether passwords must include lower case characters. The default is 'true'.
   **/
  private Boolean mustIncludeLowerCaseCharacters = null;

  /**
   * Whether passwords must include numbers. The default is 'true'.
   **/
  private Boolean mustIncludeNumbers = null;

  /**
   * Whether passwords must include symbols. The symbols are '#', '&', '*', '$', '%', '@', '^', '.', '_', and '!'. The default is 'true'.
   **/
  private Boolean mustIncludeSymbols = null;

  /**
   * The minimum lifetime of passwords, in days. The password must be used for this duration before it can be changed. If set to '0' the password may be changed any time. The default is 0. The minPasswordLifetimeDays must be greater than maxPasswordLifetimeDays.
   **/
  private Integer minPasswordLifetimeDays = null;

  /**
   * The number of previous passwords that should be remembered. The user or machine user is prevented from reusing these passwords. Can be any number between 0 and 20. The default is 0, this value means all previous passwords may be reused.
   **/
  private Integer passwordHistorySize = null;

  /**
   * Getter for maxPasswordLifetimeDays.
   * The maximum lifetime of passwords, in days. If set to &#39;0&#39; passwords never expire. The default is 0.
   **/
  @JsonProperty("maxPasswordLifetimeDays")
  public Integer getMaxPasswordLifetimeDays() {
    return maxPasswordLifetimeDays;
  }

  /**
   * Setter for maxPasswordLifetimeDays.
   * The maximum lifetime of passwords, in days. If set to &#39;0&#39; passwords never expire. The default is 0.
   **/
  public void setMaxPasswordLifetimeDays(Integer maxPasswordLifetimeDays) {
    this.maxPasswordLifetimeDays = maxPasswordLifetimeDays;
  }

  /**
   * Getter for minPasswordLength.
   * The minimum length of a password. Can be any number between 6 and 256. The default minimum password length is 8.
   **/
  @JsonProperty("minPasswordLength")
  public Integer getMinPasswordLength() {
    return minPasswordLength;
  }

  /**
   * Setter for minPasswordLength.
   * The minimum length of a password. Can be any number between 6 and 256. The default minimum password length is 8.
   **/
  public void setMinPasswordLength(Integer minPasswordLength) {
    this.minPasswordLength = minPasswordLength;
  }

  /**
   * Getter for mustIncludeUpperCaseCharacters.
   * Whether passwords must include upper case characters. The default is &#39;true&#39;.
   **/
  @JsonProperty("mustIncludeUpperCaseCharacters")
  public Boolean getMustIncludeUpperCaseCharacters() {
    return mustIncludeUpperCaseCharacters;
  }

  /**
   * Setter for mustIncludeUpperCaseCharacters.
   * Whether passwords must include upper case characters. The default is &#39;true&#39;.
   **/
  public void setMustIncludeUpperCaseCharacters(Boolean mustIncludeUpperCaseCharacters) {
    this.mustIncludeUpperCaseCharacters = mustIncludeUpperCaseCharacters;
  }

  /**
   * Getter for mustIncludeLowerCaseCharacters.
   * Whether passwords must include lower case characters. The default is &#39;true&#39;.
   **/
  @JsonProperty("mustIncludeLowerCaseCharacters")
  public Boolean getMustIncludeLowerCaseCharacters() {
    return mustIncludeLowerCaseCharacters;
  }

  /**
   * Setter for mustIncludeLowerCaseCharacters.
   * Whether passwords must include lower case characters. The default is &#39;true&#39;.
   **/
  public void setMustIncludeLowerCaseCharacters(Boolean mustIncludeLowerCaseCharacters) {
    this.mustIncludeLowerCaseCharacters = mustIncludeLowerCaseCharacters;
  }

  /**
   * Getter for mustIncludeNumbers.
   * Whether passwords must include numbers. The default is &#39;true&#39;.
   **/
  @JsonProperty("mustIncludeNumbers")
  public Boolean getMustIncludeNumbers() {
    return mustIncludeNumbers;
  }

  /**
   * Setter for mustIncludeNumbers.
   * Whether passwords must include numbers. The default is &#39;true&#39;.
   **/
  public void setMustIncludeNumbers(Boolean mustIncludeNumbers) {
    this.mustIncludeNumbers = mustIncludeNumbers;
  }

  /**
   * Getter for mustIncludeSymbols.
   * Whether passwords must include symbols. The symbols are &#39;#&#39;, &#39;&amp;&#39;, &#39;*&#39;, &#39;$&#39;, &#39;%&#39;, &#39;@&#39;, &#39;^&#39;, &#39;.&#39;, &#39;_&#39;, and &#39;!&#39;. The default is &#39;true&#39;.
   **/
  @JsonProperty("mustIncludeSymbols")
  public Boolean getMustIncludeSymbols() {
    return mustIncludeSymbols;
  }

  /**
   * Setter for mustIncludeSymbols.
   * Whether passwords must include symbols. The symbols are &#39;#&#39;, &#39;&amp;&#39;, &#39;*&#39;, &#39;$&#39;, &#39;%&#39;, &#39;@&#39;, &#39;^&#39;, &#39;.&#39;, &#39;_&#39;, and &#39;!&#39;. The default is &#39;true&#39;.
   **/
  public void setMustIncludeSymbols(Boolean mustIncludeSymbols) {
    this.mustIncludeSymbols = mustIncludeSymbols;
  }

  /**
   * Getter for minPasswordLifetimeDays.
   * The minimum lifetime of passwords, in days. The password must be used for this duration before it can be changed. If set to &#39;0&#39; the password may be changed any time. The default is 0. The minPasswordLifetimeDays must be greater than maxPasswordLifetimeDays.
   **/
  @JsonProperty("minPasswordLifetimeDays")
  public Integer getMinPasswordLifetimeDays() {
    return minPasswordLifetimeDays;
  }

  /**
   * Setter for minPasswordLifetimeDays.
   * The minimum lifetime of passwords, in days. The password must be used for this duration before it can be changed. If set to &#39;0&#39; the password may be changed any time. The default is 0. The minPasswordLifetimeDays must be greater than maxPasswordLifetimeDays.
   **/
  public void setMinPasswordLifetimeDays(Integer minPasswordLifetimeDays) {
    this.minPasswordLifetimeDays = minPasswordLifetimeDays;
  }

  /**
   * Getter for passwordHistorySize.
   * The number of previous passwords that should be remembered. The user or machine user is prevented from reusing these passwords. Can be any number between 0 and 20. The default is 0, this value means all previous passwords may be reused.
   **/
  @JsonProperty("passwordHistorySize")
  public Integer getPasswordHistorySize() {
    return passwordHistorySize;
  }

  /**
   * Setter for passwordHistorySize.
   * The number of previous passwords that should be remembered. The user or machine user is prevented from reusing these passwords. Can be any number between 0 and 20. The default is 0, this value means all previous passwords may be reused.
   **/
  public void setPasswordHistorySize(Integer passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordPolicy passwordPolicy = (PasswordPolicy) o;
    if (!Objects.equals(this.maxPasswordLifetimeDays, passwordPolicy.maxPasswordLifetimeDays)) {
      return false;
    }
    if (!Objects.equals(this.minPasswordLength, passwordPolicy.minPasswordLength)) {
      return false;
    }
    if (!Objects.equals(this.mustIncludeUpperCaseCharacters, passwordPolicy.mustIncludeUpperCaseCharacters)) {
      return false;
    }
    if (!Objects.equals(this.mustIncludeLowerCaseCharacters, passwordPolicy.mustIncludeLowerCaseCharacters)) {
      return false;
    }
    if (!Objects.equals(this.mustIncludeNumbers, passwordPolicy.mustIncludeNumbers)) {
      return false;
    }
    if (!Objects.equals(this.mustIncludeSymbols, passwordPolicy.mustIncludeSymbols)) {
      return false;
    }
    if (!Objects.equals(this.minPasswordLifetimeDays, passwordPolicy.minPasswordLifetimeDays)) {
      return false;
    }
    if (!Objects.equals(this.passwordHistorySize, passwordPolicy.passwordHistorySize)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPasswordLifetimeDays, minPasswordLength, mustIncludeUpperCaseCharacters, mustIncludeLowerCaseCharacters, mustIncludeNumbers, mustIncludeSymbols, minPasswordLifetimeDays, passwordHistorySize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicy {\n");
    sb.append("    maxPasswordLifetimeDays: ").append(toIndentedString(maxPasswordLifetimeDays)).append("\n");
    sb.append("    minPasswordLength: ").append(toIndentedString(minPasswordLength)).append("\n");
    sb.append("    mustIncludeUpperCaseCharacters: ").append(toIndentedString(mustIncludeUpperCaseCharacters)).append("\n");
    sb.append("    mustIncludeLowerCaseCharacters: ").append(toIndentedString(mustIncludeLowerCaseCharacters)).append("\n");
    sb.append("    mustIncludeNumbers: ").append(toIndentedString(mustIncludeNumbers)).append("\n");
    sb.append("    mustIncludeSymbols: ").append(toIndentedString(mustIncludeSymbols)).append("\n");
    sb.append("    minPasswordLifetimeDays: ").append(toIndentedString(minPasswordLifetimeDays)).append("\n");
    sb.append("    passwordHistorySize: ").append(toIndentedString(passwordHistorySize)).append("\n");
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

