### Stage 1 - Java Build
FROM ibmjava:8-sdk

#TODO Look at efficiency for mounting .m2 directory to build image when local

RUN apt-get update && \
 apt-get install -y maven

# create working directory
RUN mkdir -p /local/gitrepo
WORKDIR /local/gitrepo
COPY . /local/gitrepo
RUN mvn clean install


### Stage 2 - Docker Build
FROM strimzi/kafka:0.18.0-kafka-2.5.0
# Potentially use FROM strimzi/kafka:latest-kafka-2.5.0

ENV KAFKA_HOME /opt/kafka
ENV KAFKA_CONNECT_PLUGIN_PATH ${KAFKA_HOME}/plugins

#COPY --from=0 /local/gitrepo/core/target/camel-kafka-connector-0.1.0-package/share/java/camel-kafka-connector /opt/kafka/plugins
COPY --from=0 /local/gitrepo/core/target/camel-kafka-connector-0.1.0-package/share/java/camel-kafka-connector ${KAFKA_CONNECT_PLUGIN_PATH}

#COPY --from=0 /local/gitrepo/connectors/*/target/*-kafka-connector-0.1.0.jar /opt/kafka/plugins
COPY --from=0 /local/gitrepo/connectors/*/target/*-kafka-connector-0.1.0.jar ${KAFKA_CONNECT_PLUGIN_PATH}
