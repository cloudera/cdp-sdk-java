/*
 * Copyright (c) 2019 Cloudera, Inc. All Rights Reserved.
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

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.annotation.SdkInternalApi;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;

@SdkInternalApi
public class ClientFactory {

  private final ConnectionManagerFactory connectionManagerFactory =
      new ConnectionManagerFactory();

  /**
   * Create a client.
   * @param config the client configuration
   * @return the client
   */
  public Client create(CdpClientConfiguration config) {
    checkNotNullAndThrow(config);

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.setDateFormat(new StdDateFormat());
    objectMapper.setSerializationInclusion(Include.NON_NULL);
    objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    JacksonJsonProvider jsonProvider = new JacksonJsonProvider(objectMapper);

    ConnectionKeepAliveStrategy keepAliveStrategy = null;
    if (config.getConnectionMaxIdle().toMillis() > 0) {
      keepAliveStrategy = (ConnectionKeepAliveStrategy) (response, context) -> {
        long maxIdleTime = config.getConnectionMaxIdle().toMillis();
        // If there's a Keep-Alive timeout directive in the response and it's
        // shorter than our configured max, honor that. Otherwise go with the
        // configured maximum.
        long duration = DefaultConnectionKeepAliveStrategy.INSTANCE
            .getKeepAliveDuration(response, context);
        if (0 < duration && duration < maxIdleTime) {
          return duration;
        }
        return maxIdleTime;
      };
    }

    ClientConfig clientConfig = new ClientConfig();
    clientConfig.register(jsonProvider);
    clientConfig.connectorProvider(new ApacheConnectorProvider());
    clientConfig.property(
        ApacheClientProperties.CONNECTION_MANAGER,
        connectionManagerFactory.create(config));
    clientConfig.property(
        ApacheClientProperties.KEEPALIVE_STRATEGY,
        keepAliveStrategy);
    clientConfig.property(
        ClientProperties.PROXY_URI,
        config.getProxyUri());
    clientConfig.property(
        ClientProperties.PROXY_USERNAME,
        config.getProxyUsername());
    clientConfig.property(
        ClientProperties.PROXY_PASSWORD,
        config.getProxyPassword());

    Client client = ClientBuilder.newBuilder()
        .withConfig(clientConfig)
        .build();
    client.property(ClientProperties.READ_TIMEOUT,
                    (int) config.getReadTimeout().toMillis());
    client.property(ClientProperties.CONNECT_TIMEOUT,
                    (int) config.getConnectionTimeout().toMillis());

    return client;
  }
}
