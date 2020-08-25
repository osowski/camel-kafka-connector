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
package org.apache.camel.kafkaconnector.azurestoragequeue;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzurestoragequeueSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_CONF = "camel.sink.path.accountName";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_DOC = "Azure account name to be used for authentication with azure queue services";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_CONF = "camel.sink.path.queueName";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_DOC = "The queue resource name";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_AUTO_DISCOVER_CLIENT_CONF = "camel.sink.endpoint.autoDiscoverClient";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_AUTO_DISCOVER_CLIENT_DOC = "Setting the autoDiscoverClient mechanism, if true, the component will look for a client instance in the registry automatically otherwise it will skip that checking.";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_AUTO_DISCOVER_CLIENT_DEFAULT = true;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_CONF = "camel.sink.endpoint.serviceClient";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_DOC = "Service client to a storage account to interact with the queue service. This client does not hold any state about a particular storage account but is instead a convenient way of sending off appropriate requests to the resource on the service. This client contains all the operations for interacting with a queue account in Azure Storage. Operations allowed by the client are creating, listing, and deleting queues, retrieving and updating properties of the account, and retrieving statistics of the account.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREATE_QUEUE_CONF = "camel.sink.endpoint.createQueue";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREATE_QUEUE_DOC = "When is set to true, the queue will be automatically created when sending messages to the queue.";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREATE_QUEUE_DEFAULT = true;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_OPERATION_DOC = "Queue service operation hint to the producer One of: [listQueues] [createQueue] [deleteQueue] [clearQueue] [sendMessage] [deleteMessage] [receiveMessages] [peekMessages] [updateMessage]";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_CONF = "camel.sink.endpoint.maxMessages";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_DOC = "Maximum number of messages to get, if there are less messages exist in the queue than requested all the messages will be returned. If left empty only 1 message will be retrieved, the allowed range is 1 to 32 messages.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_DEFAULT = "1";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MESSAGE_ID_CONF = "camel.sink.endpoint.messageId";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MESSAGE_ID_DOC = "The ID of the message to be deleted or updated.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MESSAGE_ID_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_POP_RECEIPT_CONF = "camel.sink.endpoint.popReceipt";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_POP_RECEIPT_DOC = "Unique identifier that must match for the message to be deleted or updated.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_POP_RECEIPT_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_CONF = "camel.sink.endpoint.timeout";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_DOC = "An optional timeout applied to the operation. If a response is not returned before the timeout concludes a RuntimeException will be thrown.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_CONF = "camel.sink.endpoint.timeToLive";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_DOC = "How long the message will stay alive in the queue. If unset the value will default to 7 days, if -1 is passed the message will not expire. The time to live must be -1 or any positive number. The format should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345 seconds, P2D -- parses as 2 days However, in case you are using EndpointDsl/ComponentDsl, you can do something like Duration.ofSeconds() since these Java APIs are typesafe.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_CONF = "camel.sink.endpoint.visibilityTimeout";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_DOC = "The timeout period for how long the message is invisible in the queue. The timeout must be between 1 seconds and 7 days. The format should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345 seconds, P2D -- parses as 2 days However, in case you are using EndpointDsl/ComponentDsl, you can do something like Duration.ofSeconds() since these Java APIs are typesafe.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_DOC = "Access key for the associated azure account name to be used for authentication with azure queue services";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_CONF = "camel.sink.endpoint.credentials";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_DOC = "StorageSharedKeyCredential can be injected to create the azure client, this holds the important authentication information";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_AUTO_DISCOVER_CLIENT_CONF = "camel.component.azure-storage-queue.autoDiscoverClient";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_AUTO_DISCOVER_CLIENT_DOC = "Setting the autoDiscoverClient mechanism, if true, the component will look for a client instance in the registry automatically otherwise it will skip that checking.";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_AUTO_DISCOVER_CLIENT_DEFAULT = true;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_CONF = "camel.component.azure-storage-queue.configuration";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_DOC = "The component configurations";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_CONF = "camel.component.azure-storage-queue.serviceClient";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_DOC = "Service client to a storage account to interact with the queue service. This client does not hold any state about a particular storage account but is instead a convenient way of sending off appropriate requests to the resource on the service. This client contains all the operations for interacting with a queue account in Azure Storage. Operations allowed by the client are creating, listing, and deleting queues, retrieving and updating properties of the account, and retrieving statistics of the account.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREATE_QUEUE_CONF = "camel.component.azure-storage-queue.createQueue";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREATE_QUEUE_DOC = "When is set to true, the queue will be automatically created when sending messages to the queue.";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREATE_QUEUE_DEFAULT = true;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.azure-storage-queue.lazyStartProducer";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_OPERATION_CONF = "camel.component.azure-storage-queue.operation";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_OPERATION_DOC = "Queue service operation hint to the producer One of: [listQueues] [createQueue] [deleteQueue] [clearQueue] [sendMessage] [deleteMessage] [receiveMessages] [peekMessages] [updateMessage]";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.azure-storage-queue.basicPropertyBinding";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_CONF = "camel.component.azure-storage-queue.maxMessages";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_DOC = "Maximum number of messages to get, if there are less messages exist in the queue than requested all the messages will be returned. If left empty only 1 message will be retrieved, the allowed range is 1 to 32 messages.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_DEFAULT = "1";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MESSAGE_ID_CONF = "camel.component.azure-storage-queue.messageId";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MESSAGE_ID_DOC = "The ID of the message to be deleted or updated.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MESSAGE_ID_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_POP_RECEIPT_CONF = "camel.component.azure-storage-queue.popReceipt";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_POP_RECEIPT_DOC = "Unique identifier that must match for the message to be deleted or updated.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_POP_RECEIPT_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_CONF = "camel.component.azure-storage-queue.timeout";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_DOC = "An optional timeout applied to the operation. If a response is not returned before the timeout concludes a RuntimeException will be thrown.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_CONF = "camel.component.azure-storage-queue.timeToLive";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_DOC = "How long the message will stay alive in the queue. If unset the value will default to 7 days, if -1 is passed the message will not expire. The time to live must be -1 or any positive number. The format should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345 seconds, P2D -- parses as 2 days However, in case you are using EndpointDsl/ComponentDsl, you can do something like Duration.ofSeconds() since these Java APIs are typesafe.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_CONF = "camel.component.azure-storage-queue.visibilityTimeout";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_DOC = "The timeout period for how long the message is invisible in the queue. The timeout must be between 1 seconds and 7 days. The format should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345 seconds, P2D -- parses as 2 days However, in case you are using EndpointDsl/ComponentDsl, you can do something like Duration.ofSeconds() since these Java APIs are typesafe.";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_CONF = "camel.component.azure-storage-queue.accessKey";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_DOC = "Access key for the associated azure account name to be used for authentication with azure queue services";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_CONF = "camel.component.azure-storage-queue.credentials";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_DOC = "StorageSharedKeyCredential can be injected to create the azure client, this holds the important authentication information";
    public static final String CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_DEFAULT = null;

    public CamelAzurestoragequeueSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzurestoragequeueSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_AUTO_DISCOVER_CLIENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_AUTO_DISCOVER_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_AUTO_DISCOVER_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREATE_QUEUE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREATE_QUEUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREATE_QUEUE_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MESSAGE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MESSAGE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_MESSAGE_ID_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_POP_RECEIPT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_POP_RECEIPT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_POP_RECEIPT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_AUTO_DISCOVER_CLIENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_AUTO_DISCOVER_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_AUTO_DISCOVER_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREATE_QUEUE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREATE_QUEUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREATE_QUEUE_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MESSAGE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MESSAGE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_MESSAGE_ID_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_POP_RECEIPT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_POP_RECEIPT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_POP_RECEIPT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_DOC);
        return conf;
    }
}