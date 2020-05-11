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
package org.apache.camel.kafkaconnector.as2;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAs2SourceConnectorConfig extends CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AS2_PATH_API_NAME_CONF = "camel.source.path.apiName";
    public static final String CAMEL_SOURCE_AS2_PATH_API_NAME_DOC = "What kind of operation to perform One of: [CLIENT] [SERVER]";
    public static final String CAMEL_SOURCE_AS2_PATH_API_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_PATH_METHOD_NAME_CONF = "camel.source.path.methodName";
    public static final String CAMEL_SOURCE_AS2_PATH_METHOD_NAME_DOC = "What sub operation to use for the selected operation";
    public static final String CAMEL_SOURCE_AS2_PATH_METHOD_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2FROM_CONF = "camel.source.endpoint.as2From";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2FROM_DOC = "The value of the AS2From header of AS2 message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2FROM_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2MESSAGE_STRUCTURE_CONF = "camel.source.endpoint.as2MessageStructure";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2MESSAGE_STRUCTURE_DOC = "The structure of AS2 Message. One of: PLAIN - No encryption, no signature, SIGNED - No encryption, signature, ENCRYPTED - Encryption, no signature, ENCRYPTED_SIGNED - Encryption, signature One of: [PLAIN] [SIGNED] [ENCRYPTED] [SIGNED_ENCRYPTED] [PLAIN_COMPRESSED] [SIGNED_COMPRESSED] [ENCRYPTED_COMPRESSED] [ENCRYPTED_COMPRESSED_SIGNED]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2MESSAGE_STRUCTURE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2TO_CONF = "camel.source.endpoint.as2To";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2TO_DOC = "The value of the AS2To header of AS2 message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2TO_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2VERSION_CONF = "camel.source.endpoint.as2Version";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2VERSION_DOC = "The version of the AS2 protocol. One of: [1.0] [1.1]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_AS_2VERSION_DEFAULT = "1.1";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_CLIENT_FQDN_CONF = "camel.source.endpoint.clientFqdn";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_CLIENT_FQDN_DOC = "The Client Fully Qualified Domain Name (FQDN). Used in message ids sent by endpoint.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_CLIENT_FQDN_DEFAULT = "camel.apache.org";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_COMPRESSION_ALGORITHM_CONF = "camel.source.endpoint.compressionAlgorithm";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_COMPRESSION_ALGORITHM_DOC = "The algorithm used to compress EDI message. One of: [ZLIB]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_COMPRESSION_ALGORITHM_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_DECRYPTING_PRIVATE_KEY_CONF = "camel.source.endpoint.decryptingPrivateKey";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_DECRYPTING_PRIVATE_KEY_DOC = "The key used to encrypt the EDI message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_DECRYPTING_PRIVATE_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_DISPOSITION_NOTIFICATION_TO_CONF = "camel.source.endpoint.dispositionNotificationTo";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_DISPOSITION_NOTIFICATION_TO_DOC = "The value of the Disposition-Notification-To header. Assigning a value to this parameter requests a message disposition notification (MDN) for the AS2 message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_DISPOSITION_NOTIFICATION_TO_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TRANSFER_ENCODING_CONF = "camel.source.endpoint.ediMessageTransferEncoding";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TRANSFER_ENCODING_DOC = "The transfer encoding of EDI message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TRANSFER_ENCODING_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TYPE_CONF = "camel.source.endpoint.ediMessageType";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TYPE_DOC = "The content type of EDI message. One of application/edifact, application/edi-x12, application/edi-consent";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_ALGORITHM_CONF = "camel.source.endpoint.encryptingAlgorithm";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_ALGORITHM_DOC = "The algorithm used to encrypt EDI message. One of: [AES128_CBC] [AES192_CBC] [AES256_CBC] [AES128_CCM] [AES192_CCM] [AES256_CCM] [AES128_GCM] [AES192_GCM] [AES256_GCM] [CAMELLIA128_CBC] [CAMELLIA192_CBC] [CAMELLIA256_CBC] [CAST5_CBC] [DES_CBC] [DES_EDE3_CBC] [GOST28147_GCFB] [IDEA_CBC] [RC2_CBC] [RC4] [SEED_CBC]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_ALGORITHM_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_CERTIFICATE_CHAIN_CONF = "camel.source.endpoint.encryptingCertificateChain";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_CERTIFICATE_CHAIN_DOC = "The chain of certificates used to encrypt EDI message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_CERTIFICATE_CHAIN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_FROM_CONF = "camel.source.endpoint.from";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_FROM_DOC = "The value of the From header of AS2 message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_FROM_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_IN_BODY_CONF = "camel.source.endpoint.inBody";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_IN_BODY_DOC = "Sets the name of a parameter to be passed in the exchange In Body";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_IN_BODY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_MDN_MESSAGE_TEMPLATE_CONF = "camel.source.endpoint.mdnMessageTemplate";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_MDN_MESSAGE_TEMPLATE_DOC = "The template used to format MDN message";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_MDN_MESSAGE_TEMPLATE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_REQUEST_URI_CONF = "camel.source.endpoint.requestUri";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_REQUEST_URI_DOC = "The request URI of EDI message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_REQUEST_URI_DEFAULT = "/";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_CONF = "camel.source.endpoint.server";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_DOC = "The value included in the Server message header identifying the AS2 Server.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_DEFAULT = "Camel AS2 Server Endpoint";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_FQDN_CONF = "camel.source.endpoint.serverFqdn";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_FQDN_DOC = "The Server Fully Qualified Domain Name (FQDN). Used in message ids sent by endpoint.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_FQDN_DEFAULT = "camel.apache.org";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_PORT_NUMBER_CONF = "camel.source.endpoint.serverPortNumber";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_PORT_NUMBER_DOC = "The port number of server.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SERVER_PORT_NUMBER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNED_RECEIPT_MIC_ALGORITHMS_CONF = "camel.source.endpoint.signedReceiptMicAlgorithms";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNED_RECEIPT_MIC_ALGORITHMS_DOC = "The list of algorithms, in order of preference, requested to generate a message integrity check (MIC) returned in message dispostion notification (MDN)";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNED_RECEIPT_MIC_ALGORITHMS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_ALGORITHM_CONF = "camel.source.endpoint.signingAlgorithm";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_ALGORITHM_DOC = "The algorithm used to sign EDI message. One of: [SHA3_224WITHRSA] [SHA3_256WITHRSA] [SHA3_384withRSA] [SHA3_512WITHRSA] [MD5WITHRSA] [SHA1WITHRSA] [MD2WITHRSA] [SHA224WITHRSA] [SHA256WITHRSA] [SHA384WITHRSA] [SHA512WITHRSA] [RIPEMD128WITHRSA] [RIPEMD160WITHRSA] [RIPEMD256WITHRSA] [SHA224WITHDSA] [SHA256WITHDSA] [SHA384WITHDSA] [SHA512WITHDSA] [SHA3_224WITHDSA] [SHA3_256WITHDSA] [SHA3_384WITHDSA] [SHA3_512WITHDSA] [SHA1WITHDSA] [SHA3_224WITHECDSA] [SHA3_256WITHECDSA] [SHA3_384WITHECDSA] [SHA3_512WITHECDSA] [SHA1WITHECDSA] [SHA224WITHECDSA] [SHA256WITHECDSA] [SHA384WITHECDSA] [SHA512WITHECDSA] [SHA1WITHPLAIN_ECDSA] [SHA224WITHPLAIN_ECDSA] [SHA256WITHPLAIN_ECDSA] [SHA384WITHPLAIN_ECDSA] [SHA512WITHPLAIN_ECDSA] [RIPEMD160WITHPLAIN_ECDSA] [SHA1WITHRSAANDMGF1] [SHA224WITHRSAANDMGF1] [SHA256WITHRSAANDMGF1] [SHA384WITHRSAANDMGF1] [SHA512WITHRSAANDMGF1] [SHA3_224WITHRSAANDMGF1] [SHA3_256WITHRSAANDMGF1] [SHA3_384WITHRSAANDMGF1] [SHA3_512WITHRSAANDMGF1]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_ALGORITHM_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_CERTIFICATE_CHAIN_CONF = "camel.source.endpoint.signingCertificateChain";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_CERTIFICATE_CHAIN_DOC = "The chain of certificates used to sign EDI message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_CERTIFICATE_CHAIN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_PRIVATE_KEY_CONF = "camel.source.endpoint.signingPrivateKey";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_PRIVATE_KEY_DOC = "The key used to sign the EDI message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_PRIVATE_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SUBJECT_CONF = "camel.source.endpoint.subject";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SUBJECT_DOC = "The value of Subject header of AS2 message.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SUBJECT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TARGET_HOSTNAME_CONF = "camel.source.endpoint.targetHostname";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TARGET_HOSTNAME_DOC = "The host name (IP or DNS name) of target host.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TARGET_HOSTNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TARGET_PORT_NUMBER_CONF = "camel.source.endpoint.targetPortNumber";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TARGET_PORT_NUMBER_DOC = "The port number of target host. -1 indicates the scheme default port.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TARGET_PORT_NUMBER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_USER_AGENT_CONF = "camel.source.endpoint.userAgent";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_USER_AGENT_DOC = "The value included in the User-Agent message header identifying the AS2 user agent.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_USER_AGENT_DEFAULT = "Camel AS2 Client Endpoint";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AS2_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_AS2_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AS2_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_AS2_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll.";
    public static final Long CAMEL_SOURCE_AS2_ENDPOINT_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_AS2_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts.";
    public static final Long CAMEL_SOURCE_AS2_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_AS2_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component One of: [none] [spring] [quartz]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_AS2_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_AS2_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_AS2_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_AS2_COMPONENT_CONFIGURATION_CONF = "camel.component.as2.configuration";
    public static final String CAMEL_SOURCE_AS2_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SOURCE_AS2_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AS2_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.as2.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AS2_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AS2_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AS2_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.as2.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AS2_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AS2_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelAs2SourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAs2SourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AS2_PATH_API_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_PATH_API_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AS2_PATH_API_NAME_DOC);
        conf.define(CAMEL_SOURCE_AS2_PATH_METHOD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_PATH_METHOD_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AS2_PATH_METHOD_NAME_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_AS_2FROM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_AS_2FROM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_AS_2FROM_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_AS_2MESSAGE_STRUCTURE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_AS_2MESSAGE_STRUCTURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_AS_2MESSAGE_STRUCTURE_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_AS_2TO_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_AS_2TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_AS_2TO_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_AS_2VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_AS_2VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_AS_2VERSION_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_CLIENT_FQDN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_CLIENT_FQDN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_CLIENT_FQDN_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_COMPRESSION_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_COMPRESSION_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_COMPRESSION_ALGORITHM_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_DECRYPTING_PRIVATE_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_DECRYPTING_PRIVATE_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_DECRYPTING_PRIVATE_KEY_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_DISPOSITION_NOTIFICATION_TO_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_DISPOSITION_NOTIFICATION_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_DISPOSITION_NOTIFICATION_TO_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TRANSFER_ENCODING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TRANSFER_ENCODING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TRANSFER_ENCODING_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_EDI_MESSAGE_TYPE_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_ALGORITHM_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_CERTIFICATE_CHAIN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_CERTIFICATE_CHAIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_ENCRYPTING_CERTIFICATE_CHAIN_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_FROM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_FROM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_FROM_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_IN_BODY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_IN_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_IN_BODY_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_MDN_MESSAGE_TEMPLATE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_MDN_MESSAGE_TEMPLATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_MDN_MESSAGE_TEMPLATE_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_REQUEST_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_REQUEST_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_REQUEST_URI_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SERVER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SERVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SERVER_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SERVER_FQDN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SERVER_FQDN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SERVER_FQDN_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SERVER_PORT_NUMBER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SERVER_PORT_NUMBER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SERVER_PORT_NUMBER_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SIGNED_RECEIPT_MIC_ALGORITHMS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SIGNED_RECEIPT_MIC_ALGORITHMS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SIGNED_RECEIPT_MIC_ALGORITHMS_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_ALGORITHM_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_CERTIFICATE_CHAIN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_CERTIFICATE_CHAIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_CERTIFICATE_CHAIN_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_PRIVATE_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_PRIVATE_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SIGNING_PRIVATE_KEY_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SUBJECT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SUBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SUBJECT_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_TARGET_HOSTNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_TARGET_HOSTNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_TARGET_HOSTNAME_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_TARGET_PORT_NUMBER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_TARGET_PORT_NUMBER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_TARGET_PORT_NUMBER_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_USER_AGENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_USER_AGENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_USER_AGENT_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_AS2_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_AS2_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_AS2_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_AS2_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_AS2_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AS2_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_AS2_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AS2_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AS2_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AS2_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}