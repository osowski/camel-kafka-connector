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
package org.apache.camel.kafkaconnector.awskinesis;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwskinesisSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWSKINESIS_PATH_STREAM_NAME_CONF = "camel.sink.path.streamName";
    public static final String CAMEL_SINK_AWSKINESIS_PATH_STREAM_NAME_DOC = "Name of the stream";
    public static final String CAMEL_SINK_AWSKINESIS_PATH_STREAM_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_AMAZON_KINESIS_CLIENT_CONF = "camel.sink.endpoint.amazonKinesisClient";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_AMAZON_KINESIS_CLIENT_DOC = "Amazon Kinesis client to use for all requests for this endpoint";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_AMAZON_KINESIS_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_HOST_DOC = "To define a proxy host when instantiating the Kinesis client";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PORT_DOC = "To define a proxy port when instantiating the Kinesis client";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PROTOCOL_CONF = "camel.sink.endpoint.proxyProtocol";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the Kinesis client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_REGION_DOC = "The region in which Kinesis client needs to work. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1)You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSKINESIS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AWSKINESIS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_AWSKINESIS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSKINESIS_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_AMAZON_KINESIS_CLIENT_CONF = "camel.component.aws-kinesis.amazonKinesisClient";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_AMAZON_KINESIS_CLIENT_DOC = "Amazon Kinesis client to use for all requests for this endpoint";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_AMAZON_KINESIS_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_CONFIGURATION_CONF = "camel.component.aws-kinesis.configuration";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_CONFIGURATION_DOC = "The component configuration";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_HOST_CONF = "camel.component.aws-kinesis.proxyHost";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_HOST_DOC = "To define a proxy host when instantiating the Kinesis client";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PORT_CONF = "camel.component.aws-kinesis.proxyPort";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PORT_DOC = "To define a proxy port when instantiating the Kinesis client";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PROTOCOL_CONF = "camel.component.aws-kinesis.proxyProtocol";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the Kinesis client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_REGION_CONF = "camel.component.aws-kinesis.region";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_REGION_DOC = "The region in which Kinesis client needs to work. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1)You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.aws-kinesis.lazyStartProducer";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSKINESIS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.aws-kinesis.basicPropertyBinding";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AWSKINESIS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws-kinesis.accessKey";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_SECRET_KEY_CONF = "camel.component.aws-kinesis.secretKey";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSKINESIS_COMPONENT_SECRET_KEY_DEFAULT = null;

    public CamelAwskinesisSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwskinesisSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWSKINESIS_PATH_STREAM_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_PATH_STREAM_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSKINESIS_PATH_STREAM_NAME_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_AMAZON_KINESIS_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_ENDPOINT_AMAZON_KINESIS_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_AMAZON_KINESIS_CLIENT_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSKINESIS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSKINESIS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSKINESIS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_AMAZON_KINESIS_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_COMPONENT_AMAZON_KINESIS_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_AMAZON_KINESIS_CLIENT_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSKINESIS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSKINESIS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSKINESIS_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESIS_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSKINESIS_COMPONENT_SECRET_KEY_DOC);
        return conf;
    }
}