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
package org.apache.camel.kafkaconnector.weather;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelWeatherSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_WEATHER_PATH_NAME_CONF = "camel.source.path.name";
    public static final String CAMEL_SOURCE_WEATHER_PATH_NAME_DOC = "The name value is not used.";
    public static final String CAMEL_SOURCE_WEATHER_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_APPID_CONF = "camel.source.endpoint.appid";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_APPID_DOC = "APPID ID used to authenticate the user connected to the API Server";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_APPID_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_HEADER_NAME_CONF = "camel.source.endpoint.headerName";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_HEADER_NAME_DOC = "To store the weather result in this header instead of the message body. This is useable if you want to keep current message body as-is.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_HEADER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LANGUAGE_CONF = "camel.source.endpoint.language";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LANGUAGE_DOC = "Language of the response. One of: [en] [ru] [it] [es] [sp] [uk] [ua] [de] [pt] [ro] [pl] [fi] [nl] [fr] [bg] [sv] [se] [zh_tw] [zh] [zh_cn] [tr] [hr] [ca]";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LANGUAGE_DEFAULT = "en";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_MODE_CONF = "camel.source.endpoint.mode";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_MODE_DOC = "The output format of the weather data. One of: [HTML] [JSON] [XML]";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_MODE_DEFAULT = "JSON";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_PERIOD_CONF = "camel.source.endpoint.period";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_PERIOD_DOC = "If null, the current weather will be returned, else use values of 5, 7, 14 days. Only the numeric value for the forecast period is actually parsed, so spelling, capitalisation of the time period is up to you (its ignored)";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_PERIOD_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_UNITS_CONF = "camel.source.endpoint.units";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_UNITS_DOC = "The units for temperature measurement. One of: [IMPERIAL] [METRIC]";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_UNITS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_WEATHER_API_CONF = "camel.source.endpoint.weatherApi";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_WEATHER_API_DOC = "The API to use (current, forecast/3 hour, forecast daily, station) One of: [Current] [Station] [Hourly] [Daily]";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_WEATHER_API_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_WEATHER_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_WEATHER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_WEATHER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEO_LOCATION_PROVIDER_CONF = "camel.source.endpoint.geoLocationProvider";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEO_LOCATION_PROVIDER_DOC = "A custum geolocation provider to determine the longitude and latitude to use when no location information is set. The default implementaion uses the ipstack API and requires geolocationAccessKey and geolocationRequestHostIP";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEO_LOCATION_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_HTTP_CLIENT_CONF = "camel.source.endpoint.httpClient";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_HTTP_CLIENT_DOC = "To use an existing configured http client (for example with http proxy)";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_HTTP_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_WEATHER_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_CNT_CONF = "camel.source.endpoint.cnt";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_CNT_DOC = "Number of results to be found";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_CNT_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_IDS_CONF = "camel.source.endpoint.ids";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_IDS_DOC = "List of id's of city/stations. You can separate multiple ids by comma.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_IDS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LAT_CONF = "camel.source.endpoint.lat";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LAT_DOC = "Latitude of location. You can use lat and lon options instead of location. For boxed queries this is the bottom latitude.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LAT_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LOCATION_CONF = "camel.source.endpoint.location";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LOCATION_DOC = "If null Camel will try and determine your current location using the geolocation of your ip address, else specify the city,country. For well known city names, Open Weather Map will determine the best fit, but multiple results may be returned. Hence specifying and country as well will return more accurate data. If you specify current as the location then the component will try to get the current latitude and longitude and use that to get the weather details. You can use lat and lon options instead of location.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LOCATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LON_CONF = "camel.source.endpoint.lon";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LON_DOC = "Longitude of location. You can use lat and lon options instead of location. For boxed queries this is the left longtitude.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_LON_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_RIGHT_LON_CONF = "camel.source.endpoint.rightLon";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_RIGHT_LON_DOC = "For boxed queries this is the right longtitude. Needs to be used in combination with topLat and zoom.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_RIGHT_LON_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_TOP_LAT_CONF = "camel.source.endpoint.topLat";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_TOP_LAT_DOC = "For boxed queries this is the top latitude. Needs to be used in combination with rightLon and zoom.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_TOP_LAT_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_ZIP_CONF = "camel.source.endpoint.zip";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_ZIP_DOC = "Zip-code, e.g. 94040,us";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_ZIP_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_ZOOM_CONF = "camel.source.endpoint.zoom";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_ZOOM_DOC = "For boxed queries this is the zoom. Needs to be used in combination with rightLon and topLat.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_ZOOM_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll.";
    public static final Long CAMEL_SOURCE_WEATHER_ENDPOINT_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_WEATHER_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts.";
    public static final Long CAMEL_SOURCE_WEATHER_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_WEATHER_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component. Use value spring or quartz for built in scheduler";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_WEATHER_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_WEATHER_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_ACCESS_KEY_CONF = "camel.source.endpoint.geolocationAccessKey";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_ACCESS_KEY_DOC = "The geolocation service now needs an accessKey to be used";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_REQUEST_HOST_IPCONF = "camel.source.endpoint.geolocationRequestHostIP";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_REQUEST_HOST_IPDOC = "The geolocation service now needs to specify the IP associated to the accessKey you're using";
    public static final String CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_REQUEST_HOST_IPDEFAULT = null;
    public static final String CAMEL_SOURCE_WEATHER_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.weather.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_WEATHER_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_WEATHER_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEATHER_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.weather.basicPropertyBinding";
    public static final String CAMEL_SOURCE_WEATHER_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_WEATHER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelWeatherSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelWeatherSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_WEATHER_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_PATH_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_WEATHER_PATH_NAME_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_APPID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_APPID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_WEATHER_ENDPOINT_APPID_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_HEADER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_HEADER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_HEADER_NAME_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_LANGUAGE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_LANGUAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_LANGUAGE_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_MODE_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_PERIOD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_PERIOD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_PERIOD_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_UNITS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_UNITS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_UNITS_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_WEATHER_API_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_WEATHER_API_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_WEATHER_API_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_GEO_LOCATION_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_GEO_LOCATION_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_GEO_LOCATION_PROVIDER_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_HTTP_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_HTTP_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_HTTP_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_CNT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_CNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_CNT_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_IDS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_IDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_IDS_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_LAT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_LAT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_LAT_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_LOCATION_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_LON_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_LON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_LON_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_RIGHT_LON_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_RIGHT_LON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_RIGHT_LON_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_TOP_LAT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_TOP_LAT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_TOP_LAT_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_ZIP_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_ZIP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_ZIP_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_ZOOM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_ZOOM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_ZOOM_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_WEATHER_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_WEATHER_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_WEATHER_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_REQUEST_HOST_IPCONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_REQUEST_HOST_IPDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_WEATHER_ENDPOINT_GEOLOCATION_REQUEST_HOST_IPDOC);
        conf.define(CAMEL_SOURCE_WEATHER_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WEATHER_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEATHER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEATHER_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}