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

package com.cloudera.cdp.imagecatalog.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.ResourceResponse;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.imagecatalog.model.CreateCustomCatalogRequest;
import com.cloudera.cdp.imagecatalog.model.CreateCustomCatalogResponse;
import com.cloudera.cdp.imagecatalog.model.DeleteCustomCatalogRequest;
import com.cloudera.cdp.imagecatalog.model.DeleteCustomCatalogResponse;
import com.cloudera.cdp.imagecatalog.model.DeleteFreeipaImageRequest;
import com.cloudera.cdp.imagecatalog.model.DeleteFreeipaImageResponse;
import com.cloudera.cdp.imagecatalog.model.DeleteRuntimeImageRequest;
import com.cloudera.cdp.imagecatalog.model.DeleteRuntimeImageResponse;
import com.cloudera.cdp.imagecatalog.model.DescribeCustomCatalogRequest;
import com.cloudera.cdp.imagecatalog.model.DescribeCustomCatalogResponse;
import com.cloudera.cdp.imagecatalog.model.DescribeCustomImageRequest;
import com.cloudera.cdp.imagecatalog.model.DescribeCustomImageResponse;
import com.cloudera.cdp.imagecatalog.model.DescribeDefaultImageRequest;
import com.cloudera.cdp.imagecatalog.model.DescribeDefaultImageResponse;
import com.cloudera.cdp.imagecatalog.model.Error;
import com.cloudera.cdp.imagecatalog.model.FindDefaultImageRequest;
import com.cloudera.cdp.imagecatalog.model.FindDefaultImageResponse;
import com.cloudera.cdp.imagecatalog.model.ListCustomCatalogsRequest;
import com.cloudera.cdp.imagecatalog.model.ListCustomCatalogsResponse;
import com.cloudera.cdp.imagecatalog.model.SetFreeipaImageRequest;
import com.cloudera.cdp.imagecatalog.model.SetFreeipaImageResponse;
import com.cloudera.cdp.imagecatalog.model.SetRuntimeImageRequest;
import com.cloudera.cdp.imagecatalog.model.SetRuntimeImageResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:12.354-08:00")
public class ImagecatalogClient extends CdpClient {

  public static final String SERVICE_NAME = "imagecatalog";

  public ImagecatalogClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public ImagecatalogClient(CdpRequestContext<?> context) {
    super(context);
  }

  @Override
  protected String getServiceName() {
    return SERVICE_NAME;
  }

  @Override
  protected String getRequestContentType() {
    return "application/json";
  }

  @Override
  protected String getResponseContentType() {
    return "application/json";
  }

  /**
   * Create custom image catalog
   * @param input
   * @return CreateCustomCatalogResponse
   */
  public CreateCustomCatalogResponse createCustomCatalog(CreateCustomCatalogRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createCustomCatalog");
    }

    return this.invokeAPI("createCustomCatalog", "/api/v1/imagecatalog/createCustomCatalog", input, new GenericType<CreateCustomCatalogResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete custom image catalog
   * @param input
   * @return DeleteCustomCatalogResponse
   */
  public DeleteCustomCatalogResponse deleteCustomCatalog(DeleteCustomCatalogRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteCustomCatalog");
    }

    return this.invokeAPI("deleteCustomCatalog", "/api/v1/imagecatalog/deleteCustomCatalog", input, new GenericType<DeleteCustomCatalogResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete FreeIPA image
   * @param input
   * @return DeleteFreeipaImageResponse
   */
  public DeleteFreeipaImageResponse deleteFreeipaImage(DeleteFreeipaImageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteFreeipaImage");
    }

    return this.invokeAPI("deleteFreeipaImage", "/api/v1/imagecatalog/deleteFreeipaImage", input, new GenericType<DeleteFreeipaImageResponse>(){}, NO_EXTENSION);
  }

  /**
   * Delete Cloudera Runtime image
   * @param input
   * @return DeleteRuntimeImageResponse
   */
  public DeleteRuntimeImageResponse deleteRuntimeImage(DeleteRuntimeImageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteRuntimeImage");
    }

    return this.invokeAPI("deleteRuntimeImage", "/api/v1/imagecatalog/deleteRuntimeImage", input, new GenericType<DeleteRuntimeImageResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe custom image catalog
   * @param input
   * @return DescribeCustomCatalogResponse
   */
  public DescribeCustomCatalogResponse describeCustomCatalog(DescribeCustomCatalogRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeCustomCatalog");
    }

    return this.invokeAPI("describeCustomCatalog", "/api/v1/imagecatalog/describeCustomCatalog", input, new GenericType<DescribeCustomCatalogResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe custom image
   * @param input
   * @return DescribeCustomImageResponse
   */
  public DescribeCustomImageResponse describeCustomImage(DescribeCustomImageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeCustomImage");
    }

    return this.invokeAPI("describeCustomImage", "/api/v1/imagecatalog/describeCustomImage", input, new GenericType<DescribeCustomImageResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describe default image
   * @param input
   * @return DescribeDefaultImageResponse
   */
  public DescribeDefaultImageResponse describeDefaultImage(DescribeDefaultImageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDefaultImage");
    }

    return this.invokeAPI("describeDefaultImage", "/api/v1/imagecatalog/describeDefaultImage", input, new GenericType<DescribeDefaultImageResponse>(){}, NO_EXTENSION);
  }

  /**
   * Find default image
   * @param input
   * @return FindDefaultImageResponse
   */
  public FindDefaultImageResponse findDefaultImage(FindDefaultImageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling findDefaultImage");
    }

    return this.invokeAPI("findDefaultImage", "/api/v1/imagecatalog/findDefaultImage", input, new GenericType<FindDefaultImageResponse>(){}, NO_EXTENSION);
  }

  /**
   * List custom image catalogs
   * @param input
   * @return ListCustomCatalogsResponse
   */
  public ListCustomCatalogsResponse listCustomCatalogs(ListCustomCatalogsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listCustomCatalogs");
    }

    return this.invokeAPI("listCustomCatalogs", "/api/v1/imagecatalog/listCustomCatalogs", input, new GenericType<ListCustomCatalogsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Add or update FreeIPA image
   * @param input
   * @return SetFreeipaImageResponse
   */
  public SetFreeipaImageResponse setFreeipaImage(SetFreeipaImageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setFreeipaImage");
    }

    return this.invokeAPI("setFreeipaImage", "/api/v1/imagecatalog/setFreeipaImage", input, new GenericType<SetFreeipaImageResponse>(){}, NO_EXTENSION);
  }

  /**
   * Add or update Cloudera Runtime image
   * @param input
   * @return SetRuntimeImageResponse
   */
  public SetRuntimeImageResponse setRuntimeImage(SetRuntimeImageRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling setRuntimeImage");
    }

    return this.invokeAPI("setRuntimeImage", "/api/v1/imagecatalog/setRuntimeImage", input, new GenericType<SetRuntimeImageResponse>(){}, NO_EXTENSION);
  }
}
