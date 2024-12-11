/*
 * Copyright (c) 2020 Cloudera, Inc. All Rights Reserved.
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

package com.cloudera.cdp.client;

import static com.cloudera.cdp.ValidationUtils.checkStateAndThrow;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.MessageBodyReader;

public class RestResponse extends BaseResponse implements AutoCloseable {
  private Response response = null;

  /**
   * Sets the response that was returned by the server. This
   * should be called only once and never outside the SDK internals.
   * @param response the response
   */
  void setResponse(Response response) {
    checkStateAndThrow(this.response == null);
    this.response = response;
  }

  /**
   * Get the complete status information associated with the response.
   *
   * @return the response status information. The returned value is never
   *         {@code null}.
   */
  public Response.StatusType getStatusInfo() {
    checkStateAndThrow(this.response != null);
    return this.response.getStatusInfo();
  }

  /**
   * Get the message entity Java instance. Returns {@code null} if the message
   * does not contain an entity body.
   * If the entity is represented by an un-consumed {@link InputStream input stream}
   * the method will return the input stream.
   *
   * @return the message entity or {@code null} if message does not contain an
   *         entity body (i.e. when {@link #hasEntity()} returns {@code false}).
   * @see jakarta.ws.rs.core.Response#getEntity()
   */
  public Object getEntity() {
    checkStateAndThrow(this.response != null);
    return this.response.getEntity();
  }

  /**
   * Read the message entity input stream as an instance of specified Java type.
   *
   * @param <T>        entity instance Java type.
   * @param entityType the type of entity.
   * @return the message entity.
   * @see jakarta.ws.rs.core.Response#readEntity(Class)
   */
  public <T> T readEntity(Class<T> entityType) {
    checkStateAndThrow(this.response != null);
    return this.response.readEntity(entityType);
  }

  /**
   * Read the message entity input stream as an instance of specified Java type.
   *
   * @param <T>         entity instance Java type.
   * @param entityType  the type of entity.
   * @param annotations annotations that will be passed to the {@link MessageBodyReader}.
   * @return the message entity.
   * @see jakarta.ws.rs.core.Response#readEntity(Class, Annotation[])
   */
  public <T> T readEntity(Class<T> entityType, Annotation[] annotations) {
    checkStateAndThrow(this.response != null);
    return this.response.readEntity(entityType, annotations);
  }

  /**
   * Check if there is an entity available in the response. The method returns
   * {@code true} if the entity is present, returns {@code false} otherwise.
   *
   * @return {@code true} if there is an entity present in the message,
   *         {@code false} otherwise.
   * @see jakarta.ws.rs.core.Response#hasEntity()
   */
  public boolean hasEntity() {
    checkStateAndThrow(this.response != null);
    return this.response.hasEntity();
  }

  @Override
  public void close() {
    if (this.response != null) {
      try {
        this.response.close();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}
