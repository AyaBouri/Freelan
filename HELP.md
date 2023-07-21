# Read Me First

The following was discovered as part of building this project:

* Spring Cloud Gateway requires Spring WebFlux, your choice of Spring Web has been replaced accordingly.

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.1.1/reference/html/native-image.html#native-image)
* [Distributed Tracing Reference Guide](https://micrometer.io/docs/tracing)
* [Getting Started with Distributed Tracing](https://docs.spring.io/spring-boot/docs/3.1.1/reference/html/actuator.html#actuator.micrometer-tracing.getting-started)
* [Wavefront for Spring Boot documentation](https://docs.wavefront.com/wavefront_springboot3.html)
* [Spring Integration JMS Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jms.html)
* [Spring Integration AMQP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/amqp.html)
* [Spring Integration JDBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jdbc.html)
* [Spring Integration JPA Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jpa.html)
* [Spring Integration MongoDB Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/mongodb.html)
* [Spring Integration R2DBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/r2dbc.html)
* [Spring Integration Redis Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/redis.html)
* [Spring Integration Test Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/testing.html)
* [Spring Integration Apache Kafka Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/kafka.html)
* [Spring Integration Mail Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/mail.html)
* [Spring Integration RSocket Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/rsocket.html)
* [Spring Integration Security Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/security.html)
* [Spring Integration WebFlux Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/webflux.html)
* [Spring Integration STOMP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/stomp.html)
* [Spring Integration WebSocket Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/web-sockets.html)
* [Spring Integration Web Services Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/ws.html)
* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/docs/3.1.1/reference/html/features.html#features.testing.testcontainers)
* [Testcontainers RabbitMQ Module Reference Guide](https://www.testcontainers.org/modules/rabbitmq/)
* [Testcontainers Consul Module Reference Guide](https://www.testcontainers.org/modules/consul/)
* [Testcontainers Vault Module Reference Guide](https://www.testcontainers.org/modules/vault/)
* [Testcontainers Cassandra Module Reference Guide](https://www.testcontainers.org/modules/databases/cassandra/)
* [Testcontainers Couchbase Module Reference Guide](https://www.testcontainers.org/modules/databases/couchbase/)
* [Testcontainers Elasticsearch Container Reference Guide](https://www.testcontainers.org/modules/elasticsearch/)
* [Testcontainers MongoDB Module Reference Guide](https://www.testcontainers.org/modules/databases/mongodb/)
* [Testcontainers Neo4j Module Reference Guide](https://www.testcontainers.org/modules/databases/neo4j/)
* [Testcontainers R2DBC support Reference Guide](https://www.testcontainers.org/modules/databases/r2dbc/)
* [Testcontainers Kafka Modules Reference Guide](https://www.testcontainers.org/modules/kafka/)
* [Testcontainers MySQL Module Reference Guide](https://www.testcontainers.org/modules/databases/mysql/)
* [Testcontainers Pulsar Module Reference Guide](https://www.testcontainers.org/modules/pulsar/)
* [Testcontainers MS SQL Server Module Reference Guide](https://www.testcontainers.org/modules/databases/mssqlserver/)
* [Apache Kafka Streams Support](https://docs.spring.io/spring-kafka/docs/current/reference/html/#streams-kafka-streams)
* [Apache Kafka Streams Binding Capabilities of Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/#_kafka_streams_binding_capabilities_of_spring_cloud_stream)
* [Quartz Scheduler](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#io.quartz)
* [codecentric's Spring Boot Admin (Server)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Dynatrace](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator.metrics.export.dynatrace)
* [JDBC API](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.sql)
* [WebSocket](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#messaging.websockets)
* [Spring Data Reactive Couchbase](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.couchbase)
* [Jersey](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.servlet.jersey)
* [Okta Spring Boot documentation](https://github.com/okta/okta-spring-boot#readme)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#io.webservices)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Datadog](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#actuator.metrics.export.datadog)
* [Validation](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#io.validation)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Resilience4J](https://docs.spring.io/spring-cloud-circuitbreaker/docs/current/reference/html/#configuring-resilience4j-circuit-breakers)
* [GCP Support](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html)
* [Spring LDAP](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.ldap)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.redis)
* [Spring for Apache Pulsar](https://docs.spring.io/spring-pulsar/docs/0.2.x/reference/html/)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#features.docker-compose)
* [Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/html/spring-cloud-stream.html#spring-cloud-stream-overview-introducing)
* [Spring Data Reactive for Apache Cassandra](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.cassandra)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#messaging.kafka)
* [Spring for Apache Pulsar (Reactive)](https://docs.spring.io/spring-pulsar/docs/0.2.x/reference/html/#reactive-pulsar)
* [Vault Client Quick Start](https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage)
* [Task](https://docs.spring.io/spring-cloud-task/docs/current/reference/html/)
* [Consul Discovery](https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#spring-cloud-consul-discovery)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#using.devtools)
* [OAuth2 Resource Server](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.security.oauth2.server)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.reactive)
* [Spring for Apache ActiveMQ 5](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#messaging.jms.activemq)
* [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/current/reference/html5/)
* [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#howto.batch)
* [Spring Data Reactive MongoDB](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.mongodb)
* [Graphite](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#actuator.metrics.export.graphite)
* [Cloud Bus](https://docs.spring.io/spring-cloud-bus/docs/current/reference/html/)
* [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.spring-hateoas)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#io.email)
* [Spring Data Neo4j](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.neo4j)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.sql.jdbc)
* [Spring Integration](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#messaging.spring-integration)
* [Spring Data Elasticsearch (Access+Driver)](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.elasticsearch)
* [Contract Verifier](https://cloud.spring.io/spring-cloud-contract/reference/htmlsingle/)
* [Gateway](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.security)
* [GCP Messaging](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html#cloud-pubsub)
* [Testcontainers](https://www.testcontainers.org/)
* [Mustache](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring cache abstraction](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#io.caching)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/3.1.1/reference/html/web.html#web.graphql)
* [Contract Stub Runner](https://cloud.spring.io/spring-cloud-contract/reference/htmlsingle/#features-stub-runner)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Cloud Consul Quick Start](https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#distributed-configuration-usage)
* [Getting started with Solace and Spring](https://www.solace.dev/start-spring-io-help/)
* [Solace Developer Portal](https://solace.dev)
* [RSocket](https://rsocket.io/)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [OAuth2 Authorization Server](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.security.oauth2.authorization-server)
* [Spring Shell](https://spring.io/projects/spring-shell)
* [GCP Storage](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html#cloud-storage)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.mongodb)
* [Apache Zookeeper Discovery](https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#spring-cloud-zookeeper-discovery)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#messaging.amqp)
* [Apache Zookeeper Quick Start](https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#distributed-configuration-usage)
* [Function](https://docs.spring.io/spring-cloud-function/docs/current/reference/html/spring-cloud-function.html)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Influx](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#actuator.metrics.export.influx)
* [Cloud LoadBalancer](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/#spring-cloud-loadbalancer)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.security.oauth2.client)
* [Vaadin](https://vaadin.com/docs)
* [Spring Modulith](https://docs.spring.io/spring-modulith/docs/current/reference/html/)
* [Spring Data Couchbase](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.couchbase)
* [Spring for Apache ActiveMQ Artemis](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#messaging.jms.artemis)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#actuator)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [codecentric's Spring Boot Admin (Client)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Prometheus](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#actuator.metrics.export.prometheus)
* [Groovy Templates](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Config Server](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_server)
* [Spring Data for Apache Cassandra](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.cassandra)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.sql.r2dbc)
* [Spring Data Reactive Redis](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.redis)
* [Embedded LDAP Server](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.ldap.embedded)
* [Hilla](https://hilla.dev/)
* [New Relic](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#actuator.metrics.export.newrelic)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)

### Guides

The following guides illustrate how to use some features concretely:

* [Samples for using Apache Kafka Streams with Spring Cloud stream](https://github.com/spring-cloud/spring-cloud-stream-samples/tree/master/kafka-streams-samples)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
* [Okta-Hosted Login Page Example](https://github.com/okta/samples-java-spring/tree/master/okta-hosted-login)
* [Custom Login Page Example](https://github.com/okta/samples-java-spring/tree/master/custom-login)
* [Okta Spring Security Resource Server Example](https://github.com/okta/samples-java-spring/tree/master/resource-server)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [GCP Samples](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Spring Data Reactive for Apache Cassandra](https://spring.io/guides/gs/accessing-data-cassandra/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Java Message Service API via Apache ActiveMQ Classic.](https://spring.io/guides/gs/messaging-jms/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)
* [Accessing Data with Neo4j](https://spring.io/guides/gs/accessing-data-neo4j/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Integrating Data](https://spring.io/guides/gs/integration/)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [GCP Pub/Sub Sample](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples/spring-cloud-gcp-pubsub-sample)
* [Using Apache Camel with Spring Boot](https://camel.apache.org/camel-spring-boot/latest/spring-boot.html)
* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [GCP Storage](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples/spring-cloud-gcp-storage-resource-sample)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Client-side load-balancing with Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/)
* [Creating CRUD UI with Vaadin](https://spring.io/guides/gs/crud-with-vaadin/)
* [Messaging with JMS](https://spring.io/guides/gs/messaging-jms/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Spring Data for Apache Cassandra](https://spring.io/guides/gs/accessing-data-cassandra/)
* [Accessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Next Steps with Hilla](https://hilla.dev/docs/react/start/quick/#coming-from-spring-initializr)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)

### Additional Links

These additional references should also help you:

* [Configure AOT settings in Build Plugin](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/htmlsingle/#aot)
* [Declarative REST calls with Spring Cloud OpenFeign sample](https://github.com/spring-cloud-samples/feign-eureka)
* [Various sample apps using Spring Cloud Function](https://github.com/spring-cloud/spring-cloud-function/tree/main/spring-cloud-function-samples)
* [R2DBC Homepage](https://r2dbc.io)

## OAuth 2.0 and OIDC with Okta

If you don't have a free Okta developer account, you can create one with [the Okta CLI](https://cli.okta.com):

```bash
$ okta register
```

Then, register your Spring Boot app on Okta using:

```bash
$ okta apps create
```

Select **Web** > **Okta Spring Boot Starter** and accept the default redirect URIs.

### Docker Compose support

This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* cassandra: [`cassandra:latest`](https://hub.docker.com/_/cassandra)
*
elasticsearch: [`docker.elastic.co/elasticsearch/elasticsearch:7.17.10`](https://www.docker.elastic.co/r/elasticsearch)
* mongodb: [`mongo:latest`](https://hub.docker.com/_/mongo)
* mysql: [`mysql:latest`](https://hub.docker.com/_/mysql)
* rabbitmq: [`rabbitmq:latest`](https://hub.docker.com/_/rabbitmq)
* redis: [`redis:latest`](https://hub.docker.com/_/redis)
* sqlserver: [`mcr.microsoft.com/mssql/server:latest`](https://mcr.microsoft.com/en-us/product/mssql/server/about/)
* zipkin: [`openzipkin/zipkin:latest`](https://hub.docker.com/r/openzipkin/zipkin/)

Please review the tags of the used images and set them to the same as you're running in production.

## GraalVM Native Support

This project has been configured to let you generate either a lightweight container or a native executable.
It is also possible to run your tests in a native image.

### Lightweight Container with Cloud Native Buildpacks

If you're already familiar with Spring Boot container images support, this is the easiest way to get started.
Docker should be installed and configured on your machine prior to creating the image.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image -Pnative
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 FreelanceAlloServiceOuvrier:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools

Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you can run the app as follows:

```
$ target/FreelanceAlloServiceOuvrier
```

You can also run your existing tests suite in a native image.
This is an efficient way to validate the compatibility of your application.

To run your existing tests in a native image, run the following goal:

```
$ ./mvnw test -PnativeTest
```

## Observability with Wavefront

If you don't have a Wavefront account, the starter will create a freemium account for you.
The URL to access the Wavefront Service dashboard is logged on startup.

You can also access your dashboard using the `/actuator/wavefront` endpoint.
