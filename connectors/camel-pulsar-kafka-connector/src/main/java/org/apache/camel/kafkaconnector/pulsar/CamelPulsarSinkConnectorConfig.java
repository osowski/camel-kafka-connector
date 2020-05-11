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
package org.apache.camel.kafkaconnector.pulsar;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelPulsarSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_PULSAR_PATH_PERSISTENCE_CONF = "camel.sink.path.persistence";
    public static final String CAMEL_SINK_PULSAR_PATH_PERSISTENCE_DOC = "Whether the topic is persistent or non-persistent One of: [persistent] [non-persistent]";
    public static final String CAMEL_SINK_PULSAR_PATH_PERSISTENCE_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_PATH_TENANT_CONF = "camel.sink.path.tenant";
    public static final String CAMEL_SINK_PULSAR_PATH_TENANT_DOC = "The tenant";
    public static final String CAMEL_SINK_PULSAR_PATH_TENANT_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_PATH_NAMESPACE_CONF = "camel.sink.path.namespace";
    public static final String CAMEL_SINK_PULSAR_PATH_NAMESPACE_DOC = "The namespace";
    public static final String CAMEL_SINK_PULSAR_PATH_NAMESPACE_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_PATH_TOPIC_CONF = "camel.sink.path.topic";
    public static final String CAMEL_SINK_PULSAR_PATH_TOPIC_DOC = "The topic";
    public static final String CAMEL_SINK_PULSAR_PATH_TOPIC_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHER_BUILDER_CONF = "camel.sink.endpoint.batcherBuilder";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHER_BUILDER_DOC = "Control batching method used by the producer.";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHER_BUILDER_DEFAULT = "DEFAULT";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_ENABLED_CONF = "camel.sink.endpoint.batchingEnabled";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_ENABLED_DOC = "Control whether automatic batching of messages is enabled for the producer.";
    public static final Boolean CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_MESSAGES_CONF = "camel.sink.endpoint.batchingMaxMessages";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_MESSAGES_DOC = "The maximum size to batch messages.";
    public static final Integer CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_MESSAGES_DEFAULT = 1000;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_PUBLISH_DELAY_MICROS_CONF = "camel.sink.endpoint.batchingMaxPublishDelayMicros";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_PUBLISH_DELAY_MICROS_DOC = "The maximum time period within which the messages sent will be batched if batchingEnabled is true.";
    public static final Long CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_PUBLISH_DELAY_MICROS_DEFAULT = 1000L;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BLOCK_IF_QUEUE_FULL_CONF = "camel.sink.endpoint.blockIfQueueFull";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BLOCK_IF_QUEUE_FULL_DOC = "Whether to block the producing thread if pending messages queue is full or to throw a ProducerQueueIsFullError";
    public static final Boolean CAMEL_SINK_PULSAR_ENDPOINT_BLOCK_IF_QUEUE_FULL_DEFAULT = false;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_COMPRESSION_TYPE_CONF = "camel.sink.endpoint.compressionType";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_COMPRESSION_TYPE_DOC = "Compression type to use One of: [NONE] [LZ4] [ZLIB] [ZSTD] [SNAPPY]";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_COMPRESSION_TYPE_DEFAULT = "NONE";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_INITIAL_SEQUENCE_ID_CONF = "camel.sink.endpoint.initialSequenceId";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_INITIAL_SEQUENCE_ID_DOC = "The first message published will have a sequence Id of initialSequenceId 1.";
    public static final Long CAMEL_SINK_PULSAR_ENDPOINT_INITIAL_SEQUENCE_ID_DEFAULT = -1L;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_PULSAR_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_CONF = "camel.sink.endpoint.maxPendingMessages";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_DOC = "Size of the pending massages queue. When the queue is full, by default, any further sends will fail unless blockIfQueueFull=true";
    public static final Integer CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_DEFAULT = 1000;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_CONF = "camel.sink.endpoint.maxPendingMessagesAcrossPartitions";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DOC = "The maximum number of pending messages for partitioned topics. The maxPendingMessages value will be reduced if (number of partitions maxPendingMessages) exceeds this value. Partitioned topics have a pending message queue for each partition.";
    public static final Integer CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DEFAULT = 50000;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTER_CONF = "camel.sink.endpoint.messageRouter";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTER_DOC = "Custom Message Router to use";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTER_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTING_MODE_CONF = "camel.sink.endpoint.messageRoutingMode";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTING_MODE_DOC = "Message Routing Mode to use One of: [SinglePartition] [RoundRobinPartition] [CustomPartition]";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTING_MODE_DEFAULT = "RoundRobinPartition";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_PRODUCER_NAME_CONF = "camel.sink.endpoint.producerName";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_PRODUCER_NAME_DOC = "Name of the producer. If unset, lets Pulsar select a unique identifier.";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_PRODUCER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_SEND_TIMEOUT_MS_CONF = "camel.sink.endpoint.sendTimeoutMs";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_SEND_TIMEOUT_MS_DOC = "Send timeout in milliseconds";
    public static final Integer CAMEL_SINK_PULSAR_ENDPOINT_SEND_TIMEOUT_MS_DEFAULT = 30000;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_PULSAR_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_PULSAR_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_PULSAR_ENDPOINT_SYNCHRONOUS_DEFAULT = true;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_CONFIGURATION_CONF = "camel.component.pulsar.configuration";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_CONFIGURATION_DOC = "Allows to pre-configure the Pulsar component with common options that the endpoints will reuse.";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHER_BUILDER_CONF = "camel.component.pulsar.batcherBuilder";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHER_BUILDER_DOC = "Control batching method used by the producer.";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHER_BUILDER_DEFAULT = "DEFAULT";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHING_ENABLED_CONF = "camel.component.pulsar.batchingEnabled";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHING_ENABLED_DOC = "Control whether automatic batching of messages is enabled for the producer.";
    public static final Boolean CAMEL_SINK_PULSAR_COMPONENT_BATCHING_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_MESSAGES_CONF = "camel.component.pulsar.batchingMaxMessages";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_MESSAGES_DOC = "The maximum size to batch messages.";
    public static final Integer CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_MESSAGES_DEFAULT = 1000;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_PUBLISH_DELAY_MICROS_CONF = "camel.component.pulsar.batchingMaxPublishDelayMicros";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_PUBLISH_DELAY_MICROS_DOC = "The maximum time period within which the messages sent will be batched if batchingEnabled is true.";
    public static final Long CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_PUBLISH_DELAY_MICROS_DEFAULT = 1000L;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BLOCK_IF_QUEUE_FULL_CONF = "camel.component.pulsar.blockIfQueueFull";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BLOCK_IF_QUEUE_FULL_DOC = "Whether to block the producing thread if pending messages queue is full or to throw a ProducerQueueIsFullError";
    public static final Boolean CAMEL_SINK_PULSAR_COMPONENT_BLOCK_IF_QUEUE_FULL_DEFAULT = false;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_COMPRESSION_TYPE_CONF = "camel.component.pulsar.compressionType";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_COMPRESSION_TYPE_DOC = "Compression type to use One of: [NONE] [LZ4] [ZLIB] [ZSTD] [SNAPPY]";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_COMPRESSION_TYPE_DEFAULT = "NONE";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_INITIAL_SEQUENCE_ID_CONF = "camel.component.pulsar.initialSequenceId";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_INITIAL_SEQUENCE_ID_DOC = "The first message published will have a sequence Id of initialSequenceId 1.";
    public static final Long CAMEL_SINK_PULSAR_COMPONENT_INITIAL_SEQUENCE_ID_DEFAULT = -1L;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.pulsar.lazyStartProducer";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_PULSAR_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_CONF = "camel.component.pulsar.maxPendingMessages";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_DOC = "Size of the pending massages queue. When the queue is full, by default, any further sends will fail unless blockIfQueueFull=true";
    public static final Integer CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_DEFAULT = 1000;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_CONF = "camel.component.pulsar.maxPendingMessagesAcrossPartitions";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DOC = "The maximum number of pending messages for partitioned topics. The maxPendingMessages value will be reduced if (number of partitions maxPendingMessages) exceeds this value. Partitioned topics have a pending message queue for each partition.";
    public static final Integer CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DEFAULT = 50000;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTER_CONF = "camel.component.pulsar.messageRouter";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTER_DOC = "Custom Message Router to use";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTER_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTING_MODE_CONF = "camel.component.pulsar.messageRoutingMode";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTING_MODE_DOC = "Message Routing Mode to use One of: [SinglePartition] [RoundRobinPartition] [CustomPartition]";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTING_MODE_DEFAULT = "RoundRobinPartition";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_PRODUCER_NAME_CONF = "camel.component.pulsar.producerName";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_PRODUCER_NAME_DOC = "Name of the producer. If unset, lets Pulsar select a unique identifier.";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_PRODUCER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_SEND_TIMEOUT_MS_CONF = "camel.component.pulsar.sendTimeoutMs";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_SEND_TIMEOUT_MS_DOC = "Send timeout in milliseconds";
    public static final Integer CAMEL_SINK_PULSAR_COMPONENT_SEND_TIMEOUT_MS_DEFAULT = 30000;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_AUTO_CONFIGURATION_CONF = "camel.component.pulsar.autoConfiguration";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_AUTO_CONFIGURATION_DOC = "The pulsar auto configuration";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_AUTO_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.pulsar.basicPropertyBinding";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_PULSAR_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_PULSAR_COMPONENT_PULSAR_CLIENT_CONF = "camel.component.pulsar.pulsarClient";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_PULSAR_CLIENT_DOC = "The pulsar client";
    public static final String CAMEL_SINK_PULSAR_COMPONENT_PULSAR_CLIENT_DEFAULT = null;

    public CamelPulsarSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelPulsarSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_PULSAR_PATH_PERSISTENCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_PATH_PERSISTENCE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSAR_PATH_PERSISTENCE_DOC);
        conf.define(CAMEL_SINK_PULSAR_PATH_TENANT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_PATH_TENANT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSAR_PATH_TENANT_DOC);
        conf.define(CAMEL_SINK_PULSAR_PATH_NAMESPACE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_PATH_NAMESPACE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSAR_PATH_NAMESPACE_DOC);
        conf.define(CAMEL_SINK_PULSAR_PATH_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_PATH_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSAR_PATH_TOPIC_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_BATCHER_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_ENDPOINT_BATCHER_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_BATCHER_BUILDER_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_ENABLED_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_MESSAGES_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_MESSAGES_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_PUBLISH_DELAY_MICROS_CONF, ConfigDef.Type.LONG, CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_PUBLISH_DELAY_MICROS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_BATCHING_MAX_PUBLISH_DELAY_MICROS_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_BLOCK_IF_QUEUE_FULL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_ENDPOINT_BLOCK_IF_QUEUE_FULL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_BLOCK_IF_QUEUE_FULL_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_COMPRESSION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_ENDPOINT_COMPRESSION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_COMPRESSION_TYPE_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_INITIAL_SEQUENCE_ID_CONF, ConfigDef.Type.LONG, CAMEL_SINK_PULSAR_ENDPOINT_INITIAL_SEQUENCE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_INITIAL_SEQUENCE_ID_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTER_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTING_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTING_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_MESSAGE_ROUTING_MODE_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_PRODUCER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_ENDPOINT_PRODUCER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_PRODUCER_NAME_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_SEND_TIMEOUT_MS_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSAR_ENDPOINT_SEND_TIMEOUT_MS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_SEND_TIMEOUT_MS_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_PULSAR_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_BATCHER_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_COMPONENT_BATCHER_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_BATCHER_BUILDER_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_BATCHING_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_COMPONENT_BATCHING_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_BATCHING_ENABLED_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_MESSAGES_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_MESSAGES_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_PUBLISH_DELAY_MICROS_CONF, ConfigDef.Type.LONG, CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_PUBLISH_DELAY_MICROS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_BATCHING_MAX_PUBLISH_DELAY_MICROS_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_BLOCK_IF_QUEUE_FULL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_COMPONENT_BLOCK_IF_QUEUE_FULL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_BLOCK_IF_QUEUE_FULL_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_COMPRESSION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_COMPONENT_COMPRESSION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_COMPRESSION_TYPE_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_INITIAL_SEQUENCE_ID_CONF, ConfigDef.Type.LONG, CAMEL_SINK_PULSAR_COMPONENT_INITIAL_SEQUENCE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_INITIAL_SEQUENCE_ID_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTER_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTING_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTING_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_MESSAGE_ROUTING_MODE_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_PRODUCER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_COMPONENT_PRODUCER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_PRODUCER_NAME_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_SEND_TIMEOUT_MS_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSAR_COMPONENT_SEND_TIMEOUT_MS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_SEND_TIMEOUT_MS_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_AUTO_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_COMPONENT_AUTO_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_AUTO_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSAR_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_PULSAR_COMPONENT_PULSAR_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSAR_COMPONENT_PULSAR_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSAR_COMPONENT_PULSAR_CLIENT_DOC);
        return conf;
    }
}