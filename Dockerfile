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

#ENV KAFKA_HOME /opt/kafka
#ENV KAFKA_CONNECT_PLUGIN_PATH /tmp/kafka-plugins
ENV S2I_SOURCE_DIR /tmp/src

# User 'kafka' has UID 1001
# Reference: https://github.com/strimzi/strimzi-kafka-operator/blob/master/docker-images/kafka/Dockerfile#L12

COPY --from=0 --chown=1001 /local/gitrepo/core/target/camel-kafka-connector-0.1.0-package/share/java/camel-kafka-connector ${S2I_SOURCE_DIR}
COPY --from=0 --chown=1001 /local/gitrepo/connectors/*/target/*-kafka-connector-0.1.0.jar ${S2I_SOURCE_DIR}

RUN /opt/kafka/s2i/assemble
