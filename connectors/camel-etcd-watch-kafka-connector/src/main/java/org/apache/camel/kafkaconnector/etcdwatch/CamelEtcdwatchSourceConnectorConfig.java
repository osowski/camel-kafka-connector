/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.etcdwatch;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelEtcdwatchSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_ETCDWATCH_PATH_PATH_CONF = "camel.source.path.path";
    public static final String CAMEL_SOURCE_ETCDWATCH_PATH_PATH_DOC = "The path the endpoint refers to";
    public static final String CAMEL_SOURCE_ETCDWATCH_PATH_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_RECURSIVE_CONF = "camel.source.endpoint.recursive";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_RECURSIVE_DOC = "To apply an action recursively.";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_ENDPOINT_RECURSIVE_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SERVICE_PATH_CONF = "camel.source.endpoint.servicePath";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SERVICE_PATH_DOC = "The path to look for for service discovery";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SERVICE_PATH_DEFAULT = "/services/";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_URIS_CONF = "camel.source.endpoint.uris";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_URIS_DOC = "To set the URIs the client connects.";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_URIS_DEFAULT = "http://localhost:2379,http://localhost:4001";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_CONF = "camel.source.endpoint.sendEmptyExchangeOnTimeout";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_DOC = "To send an empty message in case of timeout watching for a key.";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_TIMEOUT_CONF = "camel.source.endpoint.timeout";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_TIMEOUT_DOC = "To set the maximum time an action could take to complete.";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_FROM_INDEX_CONF = "camel.source.endpoint.fromIndex";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_FROM_INDEX_DOC = "The index to watch from";
    public static final Long CAMEL_SOURCE_ETCDWATCH_ENDPOINT_FROM_INDEX_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_PASSWORD_CONF = "camel.source.endpoint.password";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_PASSWORD_DOC = "The password to use for basic authentication.";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.source.endpoint.sslContextParameters";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_USER_NAME_CONF = "camel.source.endpoint.userName";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_USER_NAME_DOC = "The user name to use for basic authentication.";
    public static final String CAMEL_SOURCE_ETCDWATCH_ENDPOINT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.etcd-watch.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_CONFIGURATION_CONF = "camel.component.etcd-watch.configuration";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_CONFIGURATION_DOC = "Component configuration.";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_RECURSIVE_CONF = "camel.component.etcd-watch.recursive";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_RECURSIVE_DOC = "To apply an action recursively.";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_COMPONENT_RECURSIVE_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_SERVICE_PATH_CONF = "camel.component.etcd-watch.servicePath";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_SERVICE_PATH_DOC = "The path to look for for service discovery";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_SERVICE_PATH_DEFAULT = "/services/";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_TIMEOUT_CONF = "camel.component.etcd-watch.timeout";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_TIMEOUT_DOC = "To set the maximum time an action could take to complete.";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_URIS_CONF = "camel.component.etcd-watch.uris";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_URIS_DOC = "To set the URIs the client connects.";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_URIS_DEFAULT = "http://localhost:2379,http://localhost:4001";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_CONF = "camel.component.etcd-watch.sendEmptyExchangeOnTimeout";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_DOC = "To send an empty message in case of timeout watching for a key.";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_COMPONENT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_FROM_INDEX_CONF = "camel.component.etcd-watch.fromIndex";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_FROM_INDEX_DOC = "The index to watch from";
    public static final Long CAMEL_SOURCE_ETCDWATCH_COMPONENT_FROM_INDEX_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.etcd-watch.basicPropertyBinding";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_PASSWORD_CONF = "camel.component.etcd-watch.password";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_PASSWORD_DOC = "The password to use for basic authentication.";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.etcd-watch.sslContextParameters";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.etcd-watch.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SOURCE_ETCDWATCH_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_USER_NAME_CONF = "camel.component.etcd-watch.userName";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_USER_NAME_DOC = "The user name to use for basic authentication.";
    public static final String CAMEL_SOURCE_ETCDWATCH_COMPONENT_USER_NAME_DEFAULT = null;

    public CamelEtcdwatchSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelEtcdwatchSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_ETCDWATCH_PATH_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_PATH_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_PATH_PATH_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_RECURSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_RECURSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_RECURSIVE_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SERVICE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SERVICE_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SERVICE_PATH_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_URIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_URIS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_URIS_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_FROM_INDEX_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_FROM_INDEX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_FROM_INDEX_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_ENDPOINT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_ENDPOINT_USER_NAME_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_RECURSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_COMPONENT_RECURSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_RECURSIVE_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_SERVICE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_COMPONENT_SERVICE_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_SERVICE_PATH_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_URIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_COMPONENT_URIS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_URIS_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_COMPONENT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_SEND_EMPTY_EXCHANGE_ON_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_FROM_INDEX_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_ETCDWATCH_COMPONENT_FROM_INDEX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_FROM_INDEX_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ETCDWATCH_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_ETCDWATCH_COMPONENT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ETCDWATCH_COMPONENT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ETCDWATCH_COMPONENT_USER_NAME_DOC);
        return conf;
    }
}